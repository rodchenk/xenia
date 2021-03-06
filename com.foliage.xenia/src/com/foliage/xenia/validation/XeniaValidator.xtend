/*
 * generated by Xtext 2.17.0
 */
package com.foliage.xenia.validation

import com.foliage.xenia.xenia.Header
import org.eclipse.xtext.validation.Check
import com.foliage.xenia.xenia.XeniaPackage
import java.util.List
import com.foliage.xenia.xenia.SuperSite

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class XeniaValidator extends AbstractXeniaValidator {
	
	public static val INVALID_NAME = 'invalidName'

	@Check
	def checkAppNameStartsWithCapital(Header head) {
		if (!Character.isUpperCase(head.appName.charAt(0))) {
			warning('Name should start with a capital', 
					XeniaPackage.Literals.HEADER__APP_NAME,
					INVALID_NAME)
		}
	}
	
	@Check
	def checkSiteNameIsUnique(Header head) {
		var List<SuperSite> pages = head.sites;
		
		for(page: pages){
			var i = 0;
			for(page_: pages){
				if(page.name.equals(page_.name)) i++;
				if(i > 1){
					error("Page names have to be unique", XeniaPackage.Literals.HEADER__SITES)
               		return
				}
			}
		}

	}
	
}

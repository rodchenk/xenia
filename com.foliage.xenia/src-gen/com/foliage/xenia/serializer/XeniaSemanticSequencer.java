/*
 * generated by Xtext 2.17.0
 */
package com.foliage.xenia.serializer;

import com.foliage.xenia.services.XeniaGrammarAccess;
import com.foliage.xenia.xenia.Entity;
import com.foliage.xenia.xenia.Header;
import com.foliage.xenia.xenia.InfoEntity;
import com.foliage.xenia.xenia.InfoProperty;
import com.foliage.xenia.xenia.LinkedProperty;
import com.foliage.xenia.xenia.MappedEntity;
import com.foliage.xenia.xenia.Model;
import com.foliage.xenia.xenia.Site;
import com.foliage.xenia.xenia.SiteWithModal;
import com.foliage.xenia.xenia.XeniaPackage;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class XeniaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XeniaGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == XeniaPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XeniaPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case XeniaPackage.HEADER:
				sequence_Header(context, (Header) semanticObject); 
				return; 
			case XeniaPackage.INFO_ENTITY:
				sequence_InfoEntity(context, (InfoEntity) semanticObject); 
				return; 
			case XeniaPackage.INFO_PROPERTY:
				sequence_InfoProperty(context, (InfoProperty) semanticObject); 
				return; 
			case XeniaPackage.LINKED_PROPERTY:
				sequence_LinkedProperty(context, (LinkedProperty) semanticObject); 
				return; 
			case XeniaPackage.MAPPED_ENTITY:
				sequence_MappedEntity(context, (MappedEntity) semanticObject); 
				return; 
			case XeniaPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case XeniaPackage.SITE:
				sequence_Site(context, (Site) semanticObject); 
				return; 
			case XeniaPackage.SITE_WITH_MODAL:
				sequence_SiteWithModal(context, (SiteWithModal) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (tech=STRING | path=STRING | (prop=Property name=ID))
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Header returns Header
	 *
	 * Constraint:
	 *     (appName=ID sites+=SuperSite sites+=SuperSite*)
	 */
	protected void sequence_Header(ISerializationContext context, Header semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InfoEntity returns InfoEntity
	 *
	 * Constraint:
	 *     (entries+=InfoEntry infoValue=STRING)
	 */
	protected void sequence_InfoEntity(ISerializationContext context, InfoEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     InfoProperty returns InfoProperty
	 *
	 * Constraint:
	 *     (page=Site entities+=InfoEntity entities+=InfoEntity*)
	 */
	protected void sequence_InfoProperty(ISerializationContext context, InfoProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LinkedProperty returns LinkedProperty
	 *
	 * Constraint:
	 *     (name=Site site+=Site+)
	 */
	protected void sequence_LinkedProperty(ISerializationContext context, LinkedProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MappedEntity returns MappedEntity
	 *
	 * Constraint:
	 *     ((infoProps+=InfoProperty infoProps+=InfoProperty*) | (linkedProps+=LinkedProperty linkedProps+=LinkedProperty*))
	 */
	protected void sequence_MappedEntity(ISerializationContext context, MappedEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (headers+=Header entities+=Entity* mapped_entities+=MappedEntity*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SuperSite returns SiteWithModal
	 *     SiteWithModal returns SiteWithModal
	 *
	 * Constraint:
	 *     (name=ID sites+=SuperSite sites+=SuperSite*)
	 */
	protected void sequence_SiteWithModal(ISerializationContext context, SiteWithModal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SuperSite returns Site
	 *     Site returns Site
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_Site(ISerializationContext context, Site semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, XeniaPackage.Literals.SUPER_SITE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, XeniaPackage.Literals.SUPER_SITE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSiteAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}

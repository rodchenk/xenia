/*
 * generated by Xtext 2.17.0
 */
package com.foliage.xenia.generator

import com.foliage.xenia.xenia.Header
import com.foliage.xenia.xenia.SuperSite
import javax.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.naming.IQualifiedNameProvider
import java.io.File
import java.io.FileInputStream
import com.foliage.xenia.xenia.Entity
import java.util.List
import com.foliage.xenia.xenia.LinkedProperty
import java.util.Map
import com.foliage.xenia.xenia.Site

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class XeniaGenerator extends AbstractGenerator {
	
	@Inject extension IQualifiedNameProvider
	
	String mode;
	var List<String> list;
	var List<String> icons = newArrayList;
	var icon_counter = 0;
	var Map<String, List<Site>> page_map = newHashMap;
	var String root;
	var String appName = '';
	
	def String getIcon(){
		if(icon_counter >= this.icons.size()) this.icon_counter = 0;
		return this.icons.get(icon_counter++);
	}
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		this.list = newArrayList;
		var path = 'F:/coding/java-workspace/xenia/com.foliage.xenia.resources';
		icons.add('paper-plane');
		icons.add('appstore');
		icons.add('bicycle');
		icons.add('camera');
		icons.add('cart');
		icons.add('color-wand');
		icons.add('gift');
		icons.add('key');
		icons.add('mail');
		icons.add('mic');
		
		this.mode = 'DEV';
		
		for(i: resource.allContents.toIterable.filter(Entity)){
			if(i.mode !== null && !i.mode.getName.equals('')) 
				this.mode = i.mode.getName;
				System.out.println(this.mode);
		}
		
		
	 	fsa.generateFile('./css/materialize.min.css', 	new FileInputStream(new File(path + '/css/materialize.min.css')));
	 	fsa.generateFile('./css/ionic.min.css', 		new FileInputStream(new File(path + '/css/ionic.min.css')));
	 	fsa.generateFile('./css/xenia.default.css', 	new FileInputStream(new File(path + '/css/xenia.default.css')));
		fsa.generateFile('./js/jquery.js', 				new FileInputStream(new File(path + '/js/jquery.js')));
		fsa.generateFile('./js/materialize.min.js', 	new FileInputStream(new File(path + '/js/materialize.min.js')));
		fsa.generateFile('./css/treant.css',			new FileInputStream(new File(path + '/css/treant.css')));
		fsa.generateFile('./js/raphael.js', 			new FileInputStream(new File(path + '/js/raphael.js')));
		fsa.generateFile('./js/treant.js', 				new FileInputStream(new File(path + '/js/treant.js')));
		fsa.generateFile('./js/xenia.default.js', 		new FileInputStream(new File(path + '/js/xenia.default.js')));
	 	
	 	var name_switch = true;
	 	
	 	if(this.list.isEmpty){
			for(e: resource.allContents.toIterable.filter(Header)){ //get all pages
				this.appName = e.appName;
				for(page: e.sites){
					if(name_switch){//edit here, deleted list.add('index');
						name_switch = false;
						root = page.name;
					}
					list.add(page.name);
					System.out.println('added ' + page.name);
				}
			}
		}
		
		for( redirect: resource.allContents.toIterable.filter(LinkedProperty)){
			println(redirect.name);
			page_map.put(redirect.name.name, redirect.page.site);
		}
		
		//name_switch = true;
		
		for(e: resource.allContents.toIterable.filter(Header)){ //get all pages
			for(page: e.sites){
//				if(name_switch){
//					// rename first page in list to index.html to mark it as a main page
//					fsa.generateFile('index.html', page.compile());
//					name_switch = false;
//				}else{
					fsa.generateFile(page.name + '.html', page.compile());
				//}
			}
		}
		
		if(this.mode.equals('DEV')){
			fsa.generateFile('./tutorial.html', 		new FileInputStream(new File(path + './pages/tutorial.html')));
			fsa.generateFile('./.htaccess', '''
				DirectoryIndex tutorial.html
				RewriteEngine On
				RewriteCond %{REQUEST_FILENAME} !-f
				RewriteRule ^([^.]+)$ $1.html [NC,L]
			''');
		}else{
			fsa.generateFile('./.htaccess', '''
				DirectoryIndex �this.root�.html
				RewriteEngine On
				RewriteCond %{REQUEST_FILENAME} !-f
				RewriteRule ^([^.]+)$ $1.html [NC,L]
			''');
		}
		
		fsa.generateFile('./js/xenia.map.js', '''
		var config = {
			container: "#stats",
			hideRootNode: true
		};
		
		var root = {};
		
		�FOR js_page : list�
			var �js_page� = {
				parent: 
					�IF js_page.equals(this.root)�root�ENDIF�
					,
				stackChildren: true,
				text: { name: "�js_page�"}
			}
		�ENDFOR�
		
		var xenia_chart = [
			config, 
			root,
			�FOR l:list SEPARATOR ','�
				�l�
			�ENDFOR�
		];
		''');
		
		//fsa.generateFile('./js/xenia.map.js', 			new FileInputStream(new File(path + '/js/xenia.map.js')));
		fsa.generateFile('./img/logo.png', 				new FileInputStream(new File(path + '/img/logo.png')));
		fsa.generateFile('./img/bg.jpg', 				new FileInputStream(new File(path + '/img/bg.jpg')));
		fsa.generateFile('./img/ava.jpg', 				new FileInputStream(new File(path + '/img/ava.jpg')));
		
		fsa.generateFile('./img/sample.jpg', 			new FileInputStream(new File(path + '/img/sample.jpg')));
		fsa.generateFile('./img/sample_2.jpg', 			new FileInputStream(new File(path + '/img/sample_2.jpg')));
		fsa.generateFile('./img/sample_3.jpg', 			new FileInputStream(new File(path + '/img/sample_3.jpg')));
		
		fsa.generateFile('./img/1.png', 				new FileInputStream(new File(path + '/img/1.png')));
		fsa.generateFile('./img/2.png', 				new FileInputStream(new File(path + '/img/2.png')));
		fsa.generateFile('./img/3.png', 				new FileInputStream(new File(path + '/img/3.png')));
		fsa.generateFile('./img/4.png', 				new FileInputStream(new File(path + '/img/4.png')));
		
		fsa.generateFile('./favicon.ico', 				new FileInputStream(new File(path + '/favicon.ico')));
		fsa.generateFile('./fonts/ionicons.woff2', 		new FileInputStream(new File(path + '/fonts/ionicons.woff2')));
		
	}
		
	def CharSequence compile(SuperSite page) '''
		<!DOCTYPE html>
		<html>
		<head>
			<title>�page.name�</title>
			<meta charset="utf-8">
		    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		    <meta name="viewport" content="width=device-width">
			<link rel="stylesheet" type="text/css" href="./css/materialize.min.css">
			<link rel="stylesheet" type="text/css" href="./css/ionic.min.css">
			<link rel="stylesheet" type="text/css" href="./css/xenia.default.css">
			<script type="text/javascript" src="./js/jquery.js"></script>
			<script type="text/javascript" src="./js/materialize.min.js"></script>
		
			<link rel="stylesheet" href="./css/treant.css">
		
			<script src="./js/raphael.js"></script>
			<script src="./js/treant.js"></script>
		
			<script type="text/javascript" src="./js/xenia.default.js"></script>
		
		</head>
		<body class="xenia-body">
			<header class="xenia-header">
				<nav>
					<div class="nav-wrapper">
						<ul>
							<li>
								<i class="icon ion-ios-menu sidenav-trigger" data-target='slide-out'></i>
							</li>
						</ul>
						
						<img src="./img/logo.png" class="xenia-logo">
						<span class="xenia-logo-title">�this.appName�</span>
						<ul class="right hide-on-med-and-down">
							<li><a href="#"><i class="icon ion-ios-heart-empty"></i></a></li>
							<li><a href="#"><i class="icon ion-md-attach"></i></a></li>
							<li><a href="#"><i class="icon ion-ios-crop"></i></a></li>
						</ul>
					</div>
				</nav>
			</header>
			<main class="xenia-main">
				<div class="breadcrumbs">
					<span>
						<i class="icon ion-ios-arrow-forward red-text"></i>
						<a href="#" class="red-text">�page.name�</a>
					</span>
���					<span>
���						<i class="icon ion-ios-arrow-forward red-text"></i>
���						<!-- Dropdown Trigger -->
���						<a href="#" class="red-text">News</a>
���						
���					</span>
					�IF page_map.containsKey(page.name.toString)�
						<span data-what="dropdown-next-page">
							<i class="icon red-text">/</i>
							<a class='dropdown-trigger btn-flat red-text' href='#' data-target='pages-list' style="opacity: .7">Select page</a>
							<ul id='pages-list' class='dropdown-content'>
									�FOR p: page_map.get(page.name)�
										<li><a href="�p.name�" class="red-text">�p.name�</a></li>
									�ENDFOR�
							</ul>
						</span>
					�ENDIF�
				</div>
				<div class="row cards-tutorial">
					<div class="col s6 m4">
						<div class="card">
							<div class="card-image">
								<img src="./img/sample.jpg">
								<span class="card-title">Select next page</span>
								<a class="btn-floating halfway-fab waves-effect waves-light blue darken-1 btn-large"><i class="icon ion-ios-checkmark"></i></a>
							</div>
							<div class="card-content" style="padding-top: 40px">
								<p>I am a very simple card. I am good at containing small bits of information. I am convenient because I require little markup to use effectively.</p>
							</div>
						</div>
					</div>
					<div class="col s6 m4">
						<div class="card">
							<div class="card-image">
								<img src="./img/sample_2.jpg">
								<span class="card-title">Explore page links</span>
								<a class="btn-floating halfway-fab waves-effect waves-light blue darken-1 btn-large"><i class="icon ion-ios-link"></i></a>
							</div>
							<div class="card-content" style="padding-top: 40px">
								<p>I am a very simple card. I am good at containing small bits of information. I am convenient because I require little markup to use effectively.</p>
							</div>
						</div>
					</div>
					<div class="col s6 m4">
						<div class="card">
							<div class="card-image">
								<img src="./img/sample_3.jpg">
								<span class="card-title">Simply add the content</span>
								<a class="btn-floating halfway-fab waves-effect waves-light blue darken-1 btn-large"><i class="icon ion-ios-text"></i></a>
							</div>
							<div class="card-content" style="padding-top: 40px">
								<p>I am a very simple card. I am good at containing small bits of information. I am convenient because I require little markup to use effectively.</p>
							</div>
						</div>
					</div>
				</div>
				 �IF this.mode.equals('DEV')�
				 <div class="fixed-action-btn">
					<a class="btn-floating btn-large red pulse">
						<i class="icon ion-ios-stats"></i>
					</a>
					<ul>
						<li>
							<a class="btn-floating green">
								<i class="icon ion-md-book"></i>
							</a>
						</li>
						<li>
							<a class="btn-floating blue darken-1  modal-trigger" href="#modal1">
								<i class="icon ion-ios-git-branch"></i>
							</a>
						</li>
						<li>
							<a class="btn-floating grey darken-4" href="https://github.com/rodchenk/xenia">
								<i class="icon ion-logo-github"></i>
							</a>
						</li>
						<li>
							<a class="btn-floating orange darken-1" href="./pages/tutorial.html">
								<i class="icon ion-md-laptop"></i>
							</a>
						</li>
					</ul>
				</div>
				�ENDIF�
				<!-- Side nav -->
				<ul id="slide-out" class="sidenav">
					<li>
						<div class="user-view">
							<div class="background">
								<img src="./img/bg.jpg" style="width: 100%">
							</div>
							<a href="#user"><img class="circle" src="./img/ava.jpg"></a>
							<a href="#name"><span class="white-text name">Mischa Test</span></a>
							<a href="#email"><span class="white-text email">xenia@foliage.com</span></a>
						</div>
					</li>
					<li><a class="subheader">Main links</a></li>
					�FOR site: list�
						<li �IF site.equals(page.name)�class="active-sidenav-tab"�ENDIF�>
							<a href="�site�"><i class="icon ion-md-�this.getIcon()�"></i>�site�</a>
						</li>
					�ENDFOR�
					<li><div class="divider"></div></li>
					<li class="sidenav-footer">
						<h6 align="center">Generated with <span class="badge white-text teal">xenia</span></h6>
						<div>
							<small style="display: block"><span class="grey-text">Contact</span>: rodchenk@th-brandenburg.de</small>
							<a href="https://github.com/rodchenk" class="black-text"><i class="icon ion-logo-github"></i></a>
							<a href="#" class="blue-text"><i class="icon ion-logo-twitter"></i></a>
							<a href="https://rodchenk.github.io/" class="red-text"><i class="icon ion-logo-google"></i></a>
						</div>
					</li>
				</ul>  
			</main>
			 �IF this.mode.equals('DEV')�
			<!-- Example modal -->
			<div class="xenia-modal">
				<div id="modal1" class="modal" >
					<div class="modal-content">
						<h4><i class="icon ion-ios-git-branch"></i>Sitemap visualizer</h4>
						<a href="#!" class="modal-close waves-effect waves-red btn-flat" style="position: fixed;right: 0; top: 0">
							<i class="icon ion-md-close"></i>
						</a>
					</div>
					<div class="chart" id="stats" style="min-height: 400px; width: 100%;overflow-y: scroll;"></div>
					<script type="text/javascript" src="./js/xenia.map.js"></script>
				</div>
			</div>
			�ENDIF�
		
		</body>
		</html>
	'''
	
}

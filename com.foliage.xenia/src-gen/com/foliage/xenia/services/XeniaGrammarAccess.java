/*
 * generated by Xtext 2.17.0
 */
package com.foliage.xenia.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class XeniaGrammarAccess extends AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.foliage.xenia.Xenia.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cHeadersAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cHeadersHeaderParserRuleCall_0_0 = (RuleCall)cHeadersAssignment_0.eContents().get(0);
		private final Assignment cEntitiesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cEntitiesEntityParserRuleCall_1_0 = (RuleCall)cEntitiesAssignment_1.eContents().get(0);
		private final Assignment cMapped_entitiesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cMapped_entitiesMappedEntityParserRuleCall_2_0 = (RuleCall)cMapped_entitiesAssignment_2.eContents().get(0);
		
		//Model:
		//	headers+=Header
		//	entities+=Entity*
		//	mapped_entities+=MappedEntity*;
		@Override public ParserRule getRule() { return rule; }
		
		//headers+=Header entities+=Entity* mapped_entities+=MappedEntity*
		public Group getGroup() { return cGroup; }
		
		//headers+=Header
		public Assignment getHeadersAssignment_0() { return cHeadersAssignment_0; }
		
		//Header
		public RuleCall getHeadersHeaderParserRuleCall_0_0() { return cHeadersHeaderParserRuleCall_0_0; }
		
		//entities+=Entity*
		public Assignment getEntitiesAssignment_1() { return cEntitiesAssignment_1; }
		
		//Entity
		public RuleCall getEntitiesEntityParserRuleCall_1_0() { return cEntitiesEntityParserRuleCall_1_0; }
		
		//mapped_entities+=MappedEntity*
		public Assignment getMapped_entitiesAssignment_2() { return cMapped_entitiesAssignment_2; }
		
		//MappedEntity
		public RuleCall getMapped_entitiesMappedEntityParserRuleCall_2_0() { return cMapped_entitiesMappedEntityParserRuleCall_2_0; }
	}
	public class HeaderElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.foliage.xenia.Xenia.Header");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAppKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cAppNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAppNameIDTerminalRuleCall_1_0 = (RuleCall)cAppNameAssignment_1.eContents().get(0);
		private final Keyword cHasKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cPagesKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftSquareBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cSitesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSitesSuperSiteParserRuleCall_5_0 = (RuleCall)cSitesAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cSitesAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cSitesSuperSiteParserRuleCall_6_1_0 = (RuleCall)cSitesAssignment_6_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Header:
		//	'app' appName=ID 'has' 'pages' '['
		//	sites+=SuperSite (',' sites+=SuperSite)*
		//	']';
		@Override public ParserRule getRule() { return rule; }
		
		//'app' appName=ID 'has' 'pages' '[' sites+=SuperSite (',' sites+=SuperSite)* ']'
		public Group getGroup() { return cGroup; }
		
		//'app'
		public Keyword getAppKeyword_0() { return cAppKeyword_0; }
		
		//appName=ID
		public Assignment getAppNameAssignment_1() { return cAppNameAssignment_1; }
		
		//ID
		public RuleCall getAppNameIDTerminalRuleCall_1_0() { return cAppNameIDTerminalRuleCall_1_0; }
		
		//'has'
		public Keyword getHasKeyword_2() { return cHasKeyword_2; }
		
		//'pages'
		public Keyword getPagesKeyword_3() { return cPagesKeyword_3; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_4() { return cLeftSquareBracketKeyword_4; }
		
		//sites+=SuperSite
		public Assignment getSitesAssignment_5() { return cSitesAssignment_5; }
		
		//SuperSite
		public RuleCall getSitesSuperSiteParserRuleCall_5_0() { return cSitesSuperSiteParserRuleCall_5_0; }
		
		//(',' sites+=SuperSite)*
		public Group getGroup_6() { return cGroup_6; }
		
		//','
		public Keyword getCommaKeyword_6_0() { return cCommaKeyword_6_0; }
		
		//sites+=SuperSite
		public Assignment getSitesAssignment_6_1() { return cSitesAssignment_6_1; }
		
		//SuperSite
		public RuleCall getSitesSuperSiteParserRuleCall_6_1_0() { return cSitesSuperSiteParserRuleCall_6_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_7() { return cRightSquareBracketKeyword_7; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.foliage.xenia.Xenia.Entity");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cWithKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Keyword cColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cTechAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cTechSTRINGTerminalRuleCall_0_2_0 = (RuleCall)cTechAssignment_0_2.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cXmlKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cColonKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cPathAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cPathSTRINGTerminalRuleCall_1_2_0 = (RuleCall)cPathAssignment_1_2.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Keyword cModeKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cColonKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cModeAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cModeModeParserRuleCall_2_2_0 = (RuleCall)cModeAssignment_2_2.eContents().get(0);
		
		//Entity:
		//	'with' ':' tech=STRING |
		//	'xml' ':' path=STRING |
		//	'mode' ':' mode=Mode;
		@Override public ParserRule getRule() { return rule; }
		
		//'with' ':' tech=STRING | 'xml' ':' path=STRING | 'mode' ':' mode=Mode
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'with' ':' tech=STRING
		public Group getGroup_0() { return cGroup_0; }
		
		//'with'
		public Keyword getWithKeyword_0_0() { return cWithKeyword_0_0; }
		
		//':'
		public Keyword getColonKeyword_0_1() { return cColonKeyword_0_1; }
		
		//tech=STRING
		public Assignment getTechAssignment_0_2() { return cTechAssignment_0_2; }
		
		//STRING
		public RuleCall getTechSTRINGTerminalRuleCall_0_2_0() { return cTechSTRINGTerminalRuleCall_0_2_0; }
		
		//'xml' ':' path=STRING
		public Group getGroup_1() { return cGroup_1; }
		
		//'xml'
		public Keyword getXmlKeyword_1_0() { return cXmlKeyword_1_0; }
		
		//':'
		public Keyword getColonKeyword_1_1() { return cColonKeyword_1_1; }
		
		//path=STRING
		public Assignment getPathAssignment_1_2() { return cPathAssignment_1_2; }
		
		//STRING
		public RuleCall getPathSTRINGTerminalRuleCall_1_2_0() { return cPathSTRINGTerminalRuleCall_1_2_0; }
		
		//'mode' ':' mode=Mode
		public Group getGroup_2() { return cGroup_2; }
		
		//'mode'
		public Keyword getModeKeyword_2_0() { return cModeKeyword_2_0; }
		
		//':'
		public Keyword getColonKeyword_2_1() { return cColonKeyword_2_1; }
		
		//mode=Mode
		public Assignment getModeAssignment_2_2() { return cModeAssignment_2_2; }
		
		//Mode
		public RuleCall getModeModeParserRuleCall_2_2_0() { return cModeModeParserRuleCall_2_2_0; }
	}
	public class ModeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.foliage.xenia.Xenia.Mode");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cDEVKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cPRODKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//Mode:
		//	'DEV' | 'PROD';
		@Override public ParserRule getRule() { return rule; }
		
		//'DEV' | 'PROD'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'DEV'
		public Keyword getDEVKeyword_0() { return cDEVKeyword_0; }
		
		//'PROD'
		public Keyword getPRODKeyword_1() { return cPRODKeyword_1; }
	}
	public class SuperSiteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.foliage.xenia.Xenia.SuperSite");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSiteParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cSiteWithModalParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//SuperSite:
		//	Site | SiteWithModal;
		@Override public ParserRule getRule() { return rule; }
		
		//Site | SiteWithModal
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Site
		public RuleCall getSiteParserRuleCall_0() { return cSiteParserRuleCall_0; }
		
		//SiteWithModal
		public RuleCall getSiteWithModalParserRuleCall_1() { return cSiteWithModalParserRuleCall_1; }
	}
	public class SiteWithModalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.foliage.xenia.Xenia.SiteWithModal");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommercialAtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cWithKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cModalKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cSitesAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cSitesSuperSiteParserRuleCall_5_0 = (RuleCall)cSitesAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cSitesAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cSitesSuperSiteParserRuleCall_6_1_0 = (RuleCall)cSitesAssignment_6_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//SiteWithModal:
		//	'@' name=ID 'with' 'modal' '(' sites+=SuperSite (',' sites+=SuperSite)* ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'@' name=ID 'with' 'modal' '(' sites+=SuperSite (',' sites+=SuperSite)* ')'
		public Group getGroup() { return cGroup; }
		
		//'@'
		public Keyword getCommercialAtKeyword_0() { return cCommercialAtKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'with'
		public Keyword getWithKeyword_2() { return cWithKeyword_2; }
		
		//'modal'
		public Keyword getModalKeyword_3() { return cModalKeyword_3; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_4() { return cLeftParenthesisKeyword_4; }
		
		//sites+=SuperSite
		public Assignment getSitesAssignment_5() { return cSitesAssignment_5; }
		
		//SuperSite
		public RuleCall getSitesSuperSiteParserRuleCall_5_0() { return cSitesSuperSiteParserRuleCall_5_0; }
		
		//(',' sites+=SuperSite)*
		public Group getGroup_6() { return cGroup_6; }
		
		//','
		public Keyword getCommaKeyword_6_0() { return cCommaKeyword_6_0; }
		
		//sites+=SuperSite
		public Assignment getSitesAssignment_6_1() { return cSitesAssignment_6_1; }
		
		//SuperSite
		public RuleCall getSitesSuperSiteParserRuleCall_6_1_0() { return cSitesSuperSiteParserRuleCall_6_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_7() { return cRightParenthesisKeyword_7; }
	}
	public class MappedEntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.foliage.xenia.Xenia.MappedEntity");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cInfoKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Keyword cColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Assignment cInfoPropsAssignment_0_3 = (Assignment)cGroup_0.eContents().get(3);
		private final RuleCall cInfoPropsInfoPropertyParserRuleCall_0_3_0 = (RuleCall)cInfoPropsAssignment_0_3.eContents().get(0);
		private final Group cGroup_0_4 = (Group)cGroup_0.eContents().get(4);
		private final Keyword cCommaKeyword_0_4_0 = (Keyword)cGroup_0_4.eContents().get(0);
		private final Assignment cInfoPropsAssignment_0_4_1 = (Assignment)cGroup_0_4.eContents().get(1);
		private final RuleCall cInfoPropsInfoPropertyParserRuleCall_0_4_1_0 = (RuleCall)cInfoPropsAssignment_0_4_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_0_5 = (Keyword)cGroup_0.eContents().get(5);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cMapKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Keyword cColonKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Assignment cLinkedPropsAssignment_1_3 = (Assignment)cGroup_1.eContents().get(3);
		private final RuleCall cLinkedPropsLinkedPropertyParserRuleCall_1_3_0 = (RuleCall)cLinkedPropsAssignment_1_3.eContents().get(0);
		private final Group cGroup_1_4 = (Group)cGroup_1.eContents().get(4);
		private final Keyword cCommaKeyword_1_4_0 = (Keyword)cGroup_1_4.eContents().get(0);
		private final Assignment cLinkedPropsAssignment_1_4_1 = (Assignment)cGroup_1_4.eContents().get(1);
		private final RuleCall cLinkedPropsLinkedPropertyParserRuleCall_1_4_1_0 = (RuleCall)cLinkedPropsAssignment_1_4_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_5 = (Keyword)cGroup_1.eContents().get(5);
		
		//MappedEntity:
		//	'info' ':' '[' infoProps+=InfoProperty (',' infoProps+=InfoProperty)* ']' |
		//	'map' ':' '[' linkedProps+=LinkedProperty (',' linkedProps+=LinkedProperty)* ']';
		@Override public ParserRule getRule() { return rule; }
		
		//'info' ':' '[' infoProps+=InfoProperty (',' infoProps+=InfoProperty)* ']' | 'map' ':' '[' linkedProps+=LinkedProperty
		//(',' linkedProps+=LinkedProperty)* ']'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'info' ':' '[' infoProps+=InfoProperty (',' infoProps+=InfoProperty)* ']'
		public Group getGroup_0() { return cGroup_0; }
		
		//'info'
		public Keyword getInfoKeyword_0_0() { return cInfoKeyword_0_0; }
		
		//':'
		public Keyword getColonKeyword_0_1() { return cColonKeyword_0_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_0_2() { return cLeftSquareBracketKeyword_0_2; }
		
		//infoProps+=InfoProperty
		public Assignment getInfoPropsAssignment_0_3() { return cInfoPropsAssignment_0_3; }
		
		//InfoProperty
		public RuleCall getInfoPropsInfoPropertyParserRuleCall_0_3_0() { return cInfoPropsInfoPropertyParserRuleCall_0_3_0; }
		
		//(',' infoProps+=InfoProperty)*
		public Group getGroup_0_4() { return cGroup_0_4; }
		
		//','
		public Keyword getCommaKeyword_0_4_0() { return cCommaKeyword_0_4_0; }
		
		//infoProps+=InfoProperty
		public Assignment getInfoPropsAssignment_0_4_1() { return cInfoPropsAssignment_0_4_1; }
		
		//InfoProperty
		public RuleCall getInfoPropsInfoPropertyParserRuleCall_0_4_1_0() { return cInfoPropsInfoPropertyParserRuleCall_0_4_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_0_5() { return cRightSquareBracketKeyword_0_5; }
		
		//'map' ':' '[' linkedProps+=LinkedProperty (',' linkedProps+=LinkedProperty)* ']'
		public Group getGroup_1() { return cGroup_1; }
		
		//'map'
		public Keyword getMapKeyword_1_0() { return cMapKeyword_1_0; }
		
		//':'
		public Keyword getColonKeyword_1_1() { return cColonKeyword_1_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1_2() { return cLeftSquareBracketKeyword_1_2; }
		
		//linkedProps+=LinkedProperty
		public Assignment getLinkedPropsAssignment_1_3() { return cLinkedPropsAssignment_1_3; }
		
		//LinkedProperty
		public RuleCall getLinkedPropsLinkedPropertyParserRuleCall_1_3_0() { return cLinkedPropsLinkedPropertyParserRuleCall_1_3_0; }
		
		//(',' linkedProps+=LinkedProperty)*
		public Group getGroup_1_4() { return cGroup_1_4; }
		
		//','
		public Keyword getCommaKeyword_1_4_0() { return cCommaKeyword_1_4_0; }
		
		//linkedProps+=LinkedProperty
		public Assignment getLinkedPropsAssignment_1_4_1() { return cLinkedPropsAssignment_1_4_1; }
		
		//LinkedProperty
		public RuleCall getLinkedPropsLinkedPropertyParserRuleCall_1_4_1_0() { return cLinkedPropsLinkedPropertyParserRuleCall_1_4_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_5() { return cRightSquareBracketKeyword_1_5; }
	}
	public class InfoPropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.foliage.xenia.Xenia.InfoProperty");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPageAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cPageSiteParserRuleCall_0_0 = (RuleCall)cPageAssignment_0.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cEntitiesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cEntitiesInfoEntityParserRuleCall_2_0 = (RuleCall)cEntitiesAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cEntitiesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cEntitiesInfoEntityParserRuleCall_3_1_0 = (RuleCall)cEntitiesAssignment_3_1.eContents().get(0);
		
		//InfoProperty:
		//	page=Site '->' entities+=InfoEntity (',' entities+=InfoEntity)*;
		@Override public ParserRule getRule() { return rule; }
		
		//page=Site '->' entities+=InfoEntity (',' entities+=InfoEntity)*
		public Group getGroup() { return cGroup; }
		
		//page=Site
		public Assignment getPageAssignment_0() { return cPageAssignment_0; }
		
		//Site
		public RuleCall getPageSiteParserRuleCall_0_0() { return cPageSiteParserRuleCall_0_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_1() { return cHyphenMinusGreaterThanSignKeyword_1; }
		
		//entities+=InfoEntity
		public Assignment getEntitiesAssignment_2() { return cEntitiesAssignment_2; }
		
		//InfoEntity
		public RuleCall getEntitiesInfoEntityParserRuleCall_2_0() { return cEntitiesInfoEntityParserRuleCall_2_0; }
		
		//(',' entities+=InfoEntity)*
		public Group getGroup_3() { return cGroup_3; }
		
		//','
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//entities+=InfoEntity
		public Assignment getEntitiesAssignment_3_1() { return cEntitiesAssignment_3_1; }
		
		//InfoEntity
		public RuleCall getEntitiesInfoEntityParserRuleCall_3_1_0() { return cEntitiesInfoEntityParserRuleCall_3_1_0; }
	}
	public class InfoEntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.foliage.xenia.Xenia.InfoEntity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEntriesAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cEntriesInfoEntryParserRuleCall_0_0 = (RuleCall)cEntriesAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cInfoValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cInfoValueSTRINGTerminalRuleCall_2_0 = (RuleCall)cInfoValueAssignment_2.eContents().get(0);
		
		//InfoEntity:
		//	entries+=InfoEntry ':' infoValue=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//entries+=InfoEntry ':' infoValue=STRING
		public Group getGroup() { return cGroup; }
		
		//entries+=InfoEntry
		public Assignment getEntriesAssignment_0() { return cEntriesAssignment_0; }
		
		//InfoEntry
		public RuleCall getEntriesInfoEntryParserRuleCall_0_0() { return cEntriesInfoEntryParserRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//infoValue=STRING
		public Assignment getInfoValueAssignment_2() { return cInfoValueAssignment_2; }
		
		//STRING
		public RuleCall getInfoValueSTRINGTerminalRuleCall_2_0() { return cInfoValueSTRINGTerminalRuleCall_2_0; }
	}
	public class InfoEntryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.foliage.xenia.Xenia.InfoEntry");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cModKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFreqKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cPrioKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		
		//InfoEntry:
		//	'mod' | 'freq' | 'prio';
		@Override public ParserRule getRule() { return rule; }
		
		//'mod' | 'freq' | 'prio'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'mod'
		public Keyword getModKeyword_0() { return cModKeyword_0; }
		
		//'freq'
		public Keyword getFreqKeyword_1() { return cFreqKeyword_1; }
		
		//'prio'
		public Keyword getPrioKeyword_2() { return cPrioKeyword_2; }
	}
	public class SiteElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.foliage.xenia.Xenia.Site");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCommercialAtKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Site:
		//	'@' name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//'@' name=ID
		public Group getGroup() { return cGroup; }
		
		//'@'
		public Keyword getCommercialAtKeyword_0() { return cCommercialAtKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class LinkedPropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.foliage.xenia.Xenia.LinkedProperty");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameSiteParserRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPageAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cPageRedirectPageParserRuleCall_3_0 = (RuleCall)cPageAssignment_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//LinkedProperty:
		//	name=Site '->' '(' page=RedirectPage ')';
		@Override public ParserRule getRule() { return rule; }
		
		//name=Site '->' '(' page=RedirectPage ')'
		public Group getGroup() { return cGroup; }
		
		//name=Site
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//Site
		public RuleCall getNameSiteParserRuleCall_0_0() { return cNameSiteParserRuleCall_0_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_1() { return cHyphenMinusGreaterThanSignKeyword_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//page=RedirectPage
		public Assignment getPageAssignment_3() { return cPageAssignment_3; }
		
		//RedirectPage
		public RuleCall getPageRedirectPageParserRuleCall_3_0() { return cPageRedirectPageParserRuleCall_3_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
	}
	public class RedirectPageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.foliage.xenia.Xenia.RedirectPage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSiteAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSiteSiteParserRuleCall_0_0 = (RuleCall)cSiteAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cCommaKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cSiteAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cSiteSiteParserRuleCall_1_1_0 = (RuleCall)cSiteAssignment_1_1.eContents().get(0);
		
		//RedirectPage:
		//	site+=Site (',' site+=Site)*;
		@Override public ParserRule getRule() { return rule; }
		
		//site+=Site (',' site+=Site)*
		public Group getGroup() { return cGroup; }
		
		//site+=Site
		public Assignment getSiteAssignment_0() { return cSiteAssignment_0; }
		
		//Site
		public RuleCall getSiteSiteParserRuleCall_0_0() { return cSiteSiteParserRuleCall_0_0; }
		
		//(',' site+=Site)*
		public Group getGroup_1() { return cGroup_1; }
		
		//','
		public Keyword getCommaKeyword_1_0() { return cCommaKeyword_1_0; }
		
		//site+=Site
		public Assignment getSiteAssignment_1_1() { return cSiteAssignment_1_1; }
		
		//Site
		public RuleCall getSiteSiteParserRuleCall_1_1_0() { return cSiteSiteParserRuleCall_1_1_0; }
	}
	
	
	private final ModelElements pModel;
	private final HeaderElements pHeader;
	private final EntityElements pEntity;
	private final ModeElements pMode;
	private final SuperSiteElements pSuperSite;
	private final SiteWithModalElements pSiteWithModal;
	private final MappedEntityElements pMappedEntity;
	private final InfoPropertyElements pInfoProperty;
	private final InfoEntityElements pInfoEntity;
	private final InfoEntryElements pInfoEntry;
	private final SiteElements pSite;
	private final LinkedPropertyElements pLinkedProperty;
	private final RedirectPageElements pRedirectPage;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public XeniaGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pHeader = new HeaderElements();
		this.pEntity = new EntityElements();
		this.pMode = new ModeElements();
		this.pSuperSite = new SuperSiteElements();
		this.pSiteWithModal = new SiteWithModalElements();
		this.pMappedEntity = new MappedEntityElements();
		this.pInfoProperty = new InfoPropertyElements();
		this.pInfoEntity = new InfoEntityElements();
		this.pInfoEntry = new InfoEntryElements();
		this.pSite = new SiteElements();
		this.pLinkedProperty = new LinkedPropertyElements();
		this.pRedirectPage = new RedirectPageElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.foliage.xenia.Xenia".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//	headers+=Header
	//	entities+=Entity*
	//	mapped_entities+=MappedEntity*;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//Header:
	//	'app' appName=ID 'has' 'pages' '['
	//	sites+=SuperSite (',' sites+=SuperSite)*
	//	']';
	public HeaderElements getHeaderAccess() {
		return pHeader;
	}
	
	public ParserRule getHeaderRule() {
		return getHeaderAccess().getRule();
	}
	
	//Entity:
	//	'with' ':' tech=STRING |
	//	'xml' ':' path=STRING |
	//	'mode' ':' mode=Mode;
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//Mode:
	//	'DEV' | 'PROD';
	public ModeElements getModeAccess() {
		return pMode;
	}
	
	public ParserRule getModeRule() {
		return getModeAccess().getRule();
	}
	
	//SuperSite:
	//	Site | SiteWithModal;
	public SuperSiteElements getSuperSiteAccess() {
		return pSuperSite;
	}
	
	public ParserRule getSuperSiteRule() {
		return getSuperSiteAccess().getRule();
	}
	
	//SiteWithModal:
	//	'@' name=ID 'with' 'modal' '(' sites+=SuperSite (',' sites+=SuperSite)* ')';
	public SiteWithModalElements getSiteWithModalAccess() {
		return pSiteWithModal;
	}
	
	public ParserRule getSiteWithModalRule() {
		return getSiteWithModalAccess().getRule();
	}
	
	//MappedEntity:
	//	'info' ':' '[' infoProps+=InfoProperty (',' infoProps+=InfoProperty)* ']' |
	//	'map' ':' '[' linkedProps+=LinkedProperty (',' linkedProps+=LinkedProperty)* ']';
	public MappedEntityElements getMappedEntityAccess() {
		return pMappedEntity;
	}
	
	public ParserRule getMappedEntityRule() {
		return getMappedEntityAccess().getRule();
	}
	
	//InfoProperty:
	//	page=Site '->' entities+=InfoEntity (',' entities+=InfoEntity)*;
	public InfoPropertyElements getInfoPropertyAccess() {
		return pInfoProperty;
	}
	
	public ParserRule getInfoPropertyRule() {
		return getInfoPropertyAccess().getRule();
	}
	
	//InfoEntity:
	//	entries+=InfoEntry ':' infoValue=STRING;
	public InfoEntityElements getInfoEntityAccess() {
		return pInfoEntity;
	}
	
	public ParserRule getInfoEntityRule() {
		return getInfoEntityAccess().getRule();
	}
	
	//InfoEntry:
	//	'mod' | 'freq' | 'prio';
	public InfoEntryElements getInfoEntryAccess() {
		return pInfoEntry;
	}
	
	public ParserRule getInfoEntryRule() {
		return getInfoEntryAccess().getRule();
	}
	
	//Site:
	//	'@' name=ID;
	public SiteElements getSiteAccess() {
		return pSite;
	}
	
	public ParserRule getSiteRule() {
		return getSiteAccess().getRule();
	}
	
	//LinkedProperty:
	//	name=Site '->' '(' page=RedirectPage ')';
	public LinkedPropertyElements getLinkedPropertyAccess() {
		return pLinkedProperty;
	}
	
	public ParserRule getLinkedPropertyRule() {
		return getLinkedPropertyAccess().getRule();
	}
	
	//RedirectPage:
	//	site+=Site (',' site+=Site)*;
	public RedirectPageElements getRedirectPageAccess() {
		return pRedirectPage;
	}
	
	public ParserRule getRedirectPageRule() {
		return getRedirectPageAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}

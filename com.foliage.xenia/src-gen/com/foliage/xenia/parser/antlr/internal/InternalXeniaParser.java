package com.foliage.xenia.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.foliage.xenia.services.XeniaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXeniaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'app'", "'has'", "'pages'", "'['", "','", "']'", "'with'", "':'", "'xml'", "'@'", "'modal'", "'('", "')'", "'test'", "'info'", "'map'", "'->'", "'mod'", "'freq'", "'prio'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalXeniaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXeniaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXeniaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXenia.g"; }



     	private XeniaGrammarAccess grammarAccess;

        public InternalXeniaParser(TokenStream input, XeniaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected XeniaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalXenia.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalXenia.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalXenia.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalXenia.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_headers_0_0= ruleHeader ) ) ( (lv_entities_1_0= ruleEntity ) )* ( (lv_mapped_entities_2_0= ruleMappedEntity ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_headers_0_0 = null;

        EObject lv_entities_1_0 = null;

        EObject lv_mapped_entities_2_0 = null;



        	enterRule();

        try {
            // InternalXenia.g:77:2: ( ( ( (lv_headers_0_0= ruleHeader ) ) ( (lv_entities_1_0= ruleEntity ) )* ( (lv_mapped_entities_2_0= ruleMappedEntity ) )* ) )
            // InternalXenia.g:78:2: ( ( (lv_headers_0_0= ruleHeader ) ) ( (lv_entities_1_0= ruleEntity ) )* ( (lv_mapped_entities_2_0= ruleMappedEntity ) )* )
            {
            // InternalXenia.g:78:2: ( ( (lv_headers_0_0= ruleHeader ) ) ( (lv_entities_1_0= ruleEntity ) )* ( (lv_mapped_entities_2_0= ruleMappedEntity ) )* )
            // InternalXenia.g:79:3: ( (lv_headers_0_0= ruleHeader ) ) ( (lv_entities_1_0= ruleEntity ) )* ( (lv_mapped_entities_2_0= ruleMappedEntity ) )*
            {
            // InternalXenia.g:79:3: ( (lv_headers_0_0= ruleHeader ) )
            // InternalXenia.g:80:4: (lv_headers_0_0= ruleHeader )
            {
            // InternalXenia.g:80:4: (lv_headers_0_0= ruleHeader )
            // InternalXenia.g:81:5: lv_headers_0_0= ruleHeader
            {

            					newCompositeNode(grammarAccess.getModelAccess().getHeadersHeaderParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_3);
            lv_headers_0_0=ruleHeader();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModelRule());
            					}
            					add(
            						current,
            						"headers",
            						lv_headers_0_0,
            						"com.foliage.xenia.Xenia.Header");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXenia.g:98:3: ( (lv_entities_1_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17||LA1_0==19||LA1_0==24) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXenia.g:99:4: (lv_entities_1_0= ruleEntity )
            	    {
            	    // InternalXenia.g:99:4: (lv_entities_1_0= ruleEntity )
            	    // InternalXenia.g:100:5: lv_entities_1_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_entities_1_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_1_0,
            	    						"com.foliage.xenia.Xenia.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalXenia.g:117:3: ( (lv_mapped_entities_2_0= ruleMappedEntity ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=25 && LA2_0<=26)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalXenia.g:118:4: (lv_mapped_entities_2_0= ruleMappedEntity )
            	    {
            	    // InternalXenia.g:118:4: (lv_mapped_entities_2_0= ruleMappedEntity )
            	    // InternalXenia.g:119:5: lv_mapped_entities_2_0= ruleMappedEntity
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getMapped_entitiesMappedEntityParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_mapped_entities_2_0=ruleMappedEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mapped_entities",
            	    						lv_mapped_entities_2_0,
            	    						"com.foliage.xenia.Xenia.MappedEntity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleHeader"
    // InternalXenia.g:140:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalXenia.g:140:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalXenia.g:141:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalXenia.g:147:1: ruleHeader returns [EObject current=null] : (otherlv_0= 'app' ( (lv_appName_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'pages' otherlv_4= '[' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ']' ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_appName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_sites_5_0 = null;

        EObject lv_sites_7_0 = null;



        	enterRule();

        try {
            // InternalXenia.g:153:2: ( (otherlv_0= 'app' ( (lv_appName_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'pages' otherlv_4= '[' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ']' ) )
            // InternalXenia.g:154:2: (otherlv_0= 'app' ( (lv_appName_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'pages' otherlv_4= '[' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ']' )
            {
            // InternalXenia.g:154:2: (otherlv_0= 'app' ( (lv_appName_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'pages' otherlv_4= '[' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ']' )
            // InternalXenia.g:155:3: otherlv_0= 'app' ( (lv_appName_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'pages' otherlv_4= '[' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getHeaderAccess().getAppKeyword_0());
            		
            // InternalXenia.g:159:3: ( (lv_appName_1_0= RULE_ID ) )
            // InternalXenia.g:160:4: (lv_appName_1_0= RULE_ID )
            {
            // InternalXenia.g:160:4: (lv_appName_1_0= RULE_ID )
            // InternalXenia.g:161:5: lv_appName_1_0= RULE_ID
            {
            lv_appName_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_appName_1_0, grammarAccess.getHeaderAccess().getAppNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getHeaderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"appName",
            						lv_appName_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getHeaderAccess().getHasKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getHeaderAccess().getPagesKeyword_3());
            		
            otherlv_4=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getHeaderAccess().getLeftSquareBracketKeyword_4());
            		
            // InternalXenia.g:189:3: ( (lv_sites_5_0= ruleSuperSite ) )
            // InternalXenia.g:190:4: (lv_sites_5_0= ruleSuperSite )
            {
            // InternalXenia.g:190:4: (lv_sites_5_0= ruleSuperSite )
            // InternalXenia.g:191:5: lv_sites_5_0= ruleSuperSite
            {

            					newCompositeNode(grammarAccess.getHeaderAccess().getSitesSuperSiteParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
            lv_sites_5_0=ruleSuperSite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getHeaderRule());
            					}
            					add(
            						current,
            						"sites",
            						lv_sites_5_0,
            						"com.foliage.xenia.Xenia.SuperSite");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXenia.g:208:3: (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalXenia.g:209:4: otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getHeaderAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalXenia.g:213:4: ( (lv_sites_7_0= ruleSuperSite ) )
            	    // InternalXenia.g:214:5: (lv_sites_7_0= ruleSuperSite )
            	    {
            	    // InternalXenia.g:214:5: (lv_sites_7_0= ruleSuperSite )
            	    // InternalXenia.g:215:6: lv_sites_7_0= ruleSuperSite
            	    {

            	    						newCompositeNode(grammarAccess.getHeaderAccess().getSitesSuperSiteParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_sites_7_0=ruleSuperSite();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getHeaderRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sites",
            	    							lv_sites_7_0,
            	    							"com.foliage.xenia.Xenia.SuperSite");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getHeaderAccess().getRightSquareBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleEntity"
    // InternalXenia.g:241:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalXenia.g:241:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalXenia.g:242:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalXenia.g:248:1: ruleEntity returns [EObject current=null] : ( (otherlv_0= 'with' otherlv_1= ':' ( (lv_tech_2_0= RULE_STRING ) ) ) | (otherlv_3= 'xml' otherlv_4= ':' ( (lv_path_5_0= RULE_STRING ) ) ) | ( ( (lv_prop_6_0= ruleProperty ) ) otherlv_7= ':' ( (lv_name_8_0= RULE_ID ) ) ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tech_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_path_5_0=null;
        Token otherlv_7=null;
        Token lv_name_8_0=null;
        AntlrDatatypeRuleToken lv_prop_6_0 = null;



        	enterRule();

        try {
            // InternalXenia.g:254:2: ( ( (otherlv_0= 'with' otherlv_1= ':' ( (lv_tech_2_0= RULE_STRING ) ) ) | (otherlv_3= 'xml' otherlv_4= ':' ( (lv_path_5_0= RULE_STRING ) ) ) | ( ( (lv_prop_6_0= ruleProperty ) ) otherlv_7= ':' ( (lv_name_8_0= RULE_ID ) ) ) ) )
            // InternalXenia.g:255:2: ( (otherlv_0= 'with' otherlv_1= ':' ( (lv_tech_2_0= RULE_STRING ) ) ) | (otherlv_3= 'xml' otherlv_4= ':' ( (lv_path_5_0= RULE_STRING ) ) ) | ( ( (lv_prop_6_0= ruleProperty ) ) otherlv_7= ':' ( (lv_name_8_0= RULE_ID ) ) ) )
            {
            // InternalXenia.g:255:2: ( (otherlv_0= 'with' otherlv_1= ':' ( (lv_tech_2_0= RULE_STRING ) ) ) | (otherlv_3= 'xml' otherlv_4= ':' ( (lv_path_5_0= RULE_STRING ) ) ) | ( ( (lv_prop_6_0= ruleProperty ) ) otherlv_7= ':' ( (lv_name_8_0= RULE_ID ) ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 19:
                {
                alt4=2;
                }
                break;
            case 24:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalXenia.g:256:3: (otherlv_0= 'with' otherlv_1= ':' ( (lv_tech_2_0= RULE_STRING ) ) )
                    {
                    // InternalXenia.g:256:3: (otherlv_0= 'with' otherlv_1= ':' ( (lv_tech_2_0= RULE_STRING ) ) )
                    // InternalXenia.g:257:4: otherlv_0= 'with' otherlv_1= ':' ( (lv_tech_2_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getWithKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getColonKeyword_0_1());
                    			
                    // InternalXenia.g:265:4: ( (lv_tech_2_0= RULE_STRING ) )
                    // InternalXenia.g:266:5: (lv_tech_2_0= RULE_STRING )
                    {
                    // InternalXenia.g:266:5: (lv_tech_2_0= RULE_STRING )
                    // InternalXenia.g:267:6: lv_tech_2_0= RULE_STRING
                    {
                    lv_tech_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_tech_2_0, grammarAccess.getEntityAccess().getTechSTRINGTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"tech",
                    							lv_tech_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXenia.g:285:3: (otherlv_3= 'xml' otherlv_4= ':' ( (lv_path_5_0= RULE_STRING ) ) )
                    {
                    // InternalXenia.g:285:3: (otherlv_3= 'xml' otherlv_4= ':' ( (lv_path_5_0= RULE_STRING ) ) )
                    // InternalXenia.g:286:4: otherlv_3= 'xml' otherlv_4= ':' ( (lv_path_5_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getXmlKeyword_1_0());
                    			
                    otherlv_4=(Token)match(input,18,FOLLOW_12); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getColonKeyword_1_1());
                    			
                    // InternalXenia.g:294:4: ( (lv_path_5_0= RULE_STRING ) )
                    // InternalXenia.g:295:5: (lv_path_5_0= RULE_STRING )
                    {
                    // InternalXenia.g:295:5: (lv_path_5_0= RULE_STRING )
                    // InternalXenia.g:296:6: lv_path_5_0= RULE_STRING
                    {
                    lv_path_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_path_5_0, grammarAccess.getEntityAccess().getPathSTRINGTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"path",
                    							lv_path_5_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXenia.g:314:3: ( ( (lv_prop_6_0= ruleProperty ) ) otherlv_7= ':' ( (lv_name_8_0= RULE_ID ) ) )
                    {
                    // InternalXenia.g:314:3: ( ( (lv_prop_6_0= ruleProperty ) ) otherlv_7= ':' ( (lv_name_8_0= RULE_ID ) ) )
                    // InternalXenia.g:315:4: ( (lv_prop_6_0= ruleProperty ) ) otherlv_7= ':' ( (lv_name_8_0= RULE_ID ) )
                    {
                    // InternalXenia.g:315:4: ( (lv_prop_6_0= ruleProperty ) )
                    // InternalXenia.g:316:5: (lv_prop_6_0= ruleProperty )
                    {
                    // InternalXenia.g:316:5: (lv_prop_6_0= ruleProperty )
                    // InternalXenia.g:317:6: lv_prop_6_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getPropPropertyParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_prop_6_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						set(
                    							current,
                    							"prop",
                    							lv_prop_6_0,
                    							"com.foliage.xenia.Xenia.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_7=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getColonKeyword_2_1());
                    			
                    // InternalXenia.g:338:4: ( (lv_name_8_0= RULE_ID ) )
                    // InternalXenia.g:339:5: (lv_name_8_0= RULE_ID )
                    {
                    // InternalXenia.g:339:5: (lv_name_8_0= RULE_ID )
                    // InternalXenia.g:340:6: lv_name_8_0= RULE_ID
                    {
                    lv_name_8_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_8_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleSuperSite"
    // InternalXenia.g:361:1: entryRuleSuperSite returns [EObject current=null] : iv_ruleSuperSite= ruleSuperSite EOF ;
    public final EObject entryRuleSuperSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperSite = null;


        try {
            // InternalXenia.g:361:50: (iv_ruleSuperSite= ruleSuperSite EOF )
            // InternalXenia.g:362:2: iv_ruleSuperSite= ruleSuperSite EOF
            {
             newCompositeNode(grammarAccess.getSuperSiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSuperSite=ruleSuperSite();

            state._fsp--;

             current =iv_ruleSuperSite; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSuperSite"


    // $ANTLR start "ruleSuperSite"
    // InternalXenia.g:368:1: ruleSuperSite returns [EObject current=null] : (this_Site_0= ruleSite | this_SiteWithModal_1= ruleSiteWithModal ) ;
    public final EObject ruleSuperSite() throws RecognitionException {
        EObject current = null;

        EObject this_Site_0 = null;

        EObject this_SiteWithModal_1 = null;



        	enterRule();

        try {
            // InternalXenia.g:374:2: ( (this_Site_0= ruleSite | this_SiteWithModal_1= ruleSiteWithModal ) )
            // InternalXenia.g:375:2: (this_Site_0= ruleSite | this_SiteWithModal_1= ruleSiteWithModal )
            {
            // InternalXenia.g:375:2: (this_Site_0= ruleSite | this_SiteWithModal_1= ruleSiteWithModal )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==RULE_ID) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==EOF||(LA5_2>=15 && LA5_2<=16)||LA5_2==23) ) {
                        alt5=1;
                    }
                    else if ( (LA5_2==17) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXenia.g:376:3: this_Site_0= ruleSite
                    {

                    			newCompositeNode(grammarAccess.getSuperSiteAccess().getSiteParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Site_0=ruleSite();

                    state._fsp--;


                    			current = this_Site_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXenia.g:385:3: this_SiteWithModal_1= ruleSiteWithModal
                    {

                    			newCompositeNode(grammarAccess.getSuperSiteAccess().getSiteWithModalParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SiteWithModal_1=ruleSiteWithModal();

                    state._fsp--;


                    			current = this_SiteWithModal_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSuperSite"


    // $ANTLR start "entryRuleSiteWithModal"
    // InternalXenia.g:397:1: entryRuleSiteWithModal returns [EObject current=null] : iv_ruleSiteWithModal= ruleSiteWithModal EOF ;
    public final EObject entryRuleSiteWithModal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiteWithModal = null;


        try {
            // InternalXenia.g:397:54: (iv_ruleSiteWithModal= ruleSiteWithModal EOF )
            // InternalXenia.g:398:2: iv_ruleSiteWithModal= ruleSiteWithModal EOF
            {
             newCompositeNode(grammarAccess.getSiteWithModalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSiteWithModal=ruleSiteWithModal();

            state._fsp--;

             current =iv_ruleSiteWithModal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSiteWithModal"


    // $ANTLR start "ruleSiteWithModal"
    // InternalXenia.g:404:1: ruleSiteWithModal returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'modal' otherlv_4= '(' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ')' ) ;
    public final EObject ruleSiteWithModal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_sites_5_0 = null;

        EObject lv_sites_7_0 = null;



        	enterRule();

        try {
            // InternalXenia.g:410:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'modal' otherlv_4= '(' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ')' ) )
            // InternalXenia.g:411:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'modal' otherlv_4= '(' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ')' )
            {
            // InternalXenia.g:411:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'modal' otherlv_4= '(' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ')' )
            // InternalXenia.g:412:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'modal' otherlv_4= '(' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSiteWithModalAccess().getCommercialAtKeyword_0());
            		
            // InternalXenia.g:416:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXenia.g:417:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXenia.g:417:4: (lv_name_1_0= RULE_ID )
            // InternalXenia.g:418:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSiteWithModalAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSiteWithModalRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getSiteWithModalAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,21,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getSiteWithModalAccess().getModalKeyword_3());
            		
            otherlv_4=(Token)match(input,22,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSiteWithModalAccess().getLeftParenthesisKeyword_4());
            		
            // InternalXenia.g:446:3: ( (lv_sites_5_0= ruleSuperSite ) )
            // InternalXenia.g:447:4: (lv_sites_5_0= ruleSuperSite )
            {
            // InternalXenia.g:447:4: (lv_sites_5_0= ruleSuperSite )
            // InternalXenia.g:448:5: lv_sites_5_0= ruleSuperSite
            {

            					newCompositeNode(grammarAccess.getSiteWithModalAccess().getSitesSuperSiteParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_16);
            lv_sites_5_0=ruleSuperSite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSiteWithModalRule());
            					}
            					add(
            						current,
            						"sites",
            						lv_sites_5_0,
            						"com.foliage.xenia.Xenia.SuperSite");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXenia.g:465:3: (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalXenia.g:466:4: otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getSiteWithModalAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalXenia.g:470:4: ( (lv_sites_7_0= ruleSuperSite ) )
            	    // InternalXenia.g:471:5: (lv_sites_7_0= ruleSuperSite )
            	    {
            	    // InternalXenia.g:471:5: (lv_sites_7_0= ruleSuperSite )
            	    // InternalXenia.g:472:6: lv_sites_7_0= ruleSuperSite
            	    {

            	    						newCompositeNode(grammarAccess.getSiteWithModalAccess().getSitesSuperSiteParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_16);
            	    lv_sites_7_0=ruleSuperSite();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSiteWithModalRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sites",
            	    							lv_sites_7_0,
            	    							"com.foliage.xenia.Xenia.SuperSite");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_8=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSiteWithModalAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSiteWithModal"


    // $ANTLR start "entryRuleProperty"
    // InternalXenia.g:498:1: entryRuleProperty returns [String current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final String entryRuleProperty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProperty = null;


        try {
            // InternalXenia.g:498:48: (iv_ruleProperty= ruleProperty EOF )
            // InternalXenia.g:499:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalXenia.g:505:1: ruleProperty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'test' ;
    public final AntlrDatatypeRuleToken ruleProperty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXenia.g:511:2: (kw= 'test' )
            // InternalXenia.g:512:2: kw= 'test'
            {
            kw=(Token)match(input,24,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getPropertyAccess().getTestKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleMappedEntity"
    // InternalXenia.g:520:1: entryRuleMappedEntity returns [EObject current=null] : iv_ruleMappedEntity= ruleMappedEntity EOF ;
    public final EObject entryRuleMappedEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappedEntity = null;


        try {
            // InternalXenia.g:520:53: (iv_ruleMappedEntity= ruleMappedEntity EOF )
            // InternalXenia.g:521:2: iv_ruleMappedEntity= ruleMappedEntity EOF
            {
             newCompositeNode(grammarAccess.getMappedEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappedEntity=ruleMappedEntity();

            state._fsp--;

             current =iv_ruleMappedEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMappedEntity"


    // $ANTLR start "ruleMappedEntity"
    // InternalXenia.g:527:1: ruleMappedEntity returns [EObject current=null] : ( (otherlv_0= 'info' otherlv_1= ':' otherlv_2= '[' ( (lv_infoProps_3_0= ruleInfoProperty ) ) (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )* otherlv_6= ']' ) | (otherlv_7= 'map' otherlv_8= ':' otherlv_9= '[' ( (lv_linkedProps_10_0= ruleLinkedProperty ) ) (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )* otherlv_13= ']' ) ) ;
    public final EObject ruleMappedEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_infoProps_3_0 = null;

        EObject lv_infoProps_5_0 = null;

        EObject lv_linkedProps_10_0 = null;

        EObject lv_linkedProps_12_0 = null;



        	enterRule();

        try {
            // InternalXenia.g:533:2: ( ( (otherlv_0= 'info' otherlv_1= ':' otherlv_2= '[' ( (lv_infoProps_3_0= ruleInfoProperty ) ) (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )* otherlv_6= ']' ) | (otherlv_7= 'map' otherlv_8= ':' otherlv_9= '[' ( (lv_linkedProps_10_0= ruleLinkedProperty ) ) (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )* otherlv_13= ']' ) ) )
            // InternalXenia.g:534:2: ( (otherlv_0= 'info' otherlv_1= ':' otherlv_2= '[' ( (lv_infoProps_3_0= ruleInfoProperty ) ) (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )* otherlv_6= ']' ) | (otherlv_7= 'map' otherlv_8= ':' otherlv_9= '[' ( (lv_linkedProps_10_0= ruleLinkedProperty ) ) (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )* otherlv_13= ']' ) )
            {
            // InternalXenia.g:534:2: ( (otherlv_0= 'info' otherlv_1= ':' otherlv_2= '[' ( (lv_infoProps_3_0= ruleInfoProperty ) ) (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )* otherlv_6= ']' ) | (otherlv_7= 'map' otherlv_8= ':' otherlv_9= '[' ( (lv_linkedProps_10_0= ruleLinkedProperty ) ) (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )* otherlv_13= ']' ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==25) ) {
                alt9=1;
            }
            else if ( (LA9_0==26) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalXenia.g:535:3: (otherlv_0= 'info' otherlv_1= ':' otherlv_2= '[' ( (lv_infoProps_3_0= ruleInfoProperty ) ) (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )* otherlv_6= ']' )
                    {
                    // InternalXenia.g:535:3: (otherlv_0= 'info' otherlv_1= ':' otherlv_2= '[' ( (lv_infoProps_3_0= ruleInfoProperty ) ) (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )* otherlv_6= ']' )
                    // InternalXenia.g:536:4: otherlv_0= 'info' otherlv_1= ':' otherlv_2= '[' ( (lv_infoProps_3_0= ruleInfoProperty ) ) (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )* otherlv_6= ']'
                    {
                    otherlv_0=(Token)match(input,25,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getMappedEntityAccess().getInfoKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getMappedEntityAccess().getColonKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getMappedEntityAccess().getLeftSquareBracketKeyword_0_2());
                    			
                    // InternalXenia.g:548:4: ( (lv_infoProps_3_0= ruleInfoProperty ) )
                    // InternalXenia.g:549:5: (lv_infoProps_3_0= ruleInfoProperty )
                    {
                    // InternalXenia.g:549:5: (lv_infoProps_3_0= ruleInfoProperty )
                    // InternalXenia.g:550:6: lv_infoProps_3_0= ruleInfoProperty
                    {

                    						newCompositeNode(grammarAccess.getMappedEntityAccess().getInfoPropsInfoPropertyParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_infoProps_3_0=ruleInfoProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappedEntityRule());
                    						}
                    						add(
                    							current,
                    							"infoProps",
                    							lv_infoProps_3_0,
                    							"com.foliage.xenia.Xenia.InfoProperty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXenia.g:567:4: (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalXenia.g:568:5: otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_9); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMappedEntityAccess().getCommaKeyword_0_4_0());
                    	    				
                    	    // InternalXenia.g:572:5: ( (lv_infoProps_5_0= ruleInfoProperty ) )
                    	    // InternalXenia.g:573:6: (lv_infoProps_5_0= ruleInfoProperty )
                    	    {
                    	    // InternalXenia.g:573:6: (lv_infoProps_5_0= ruleInfoProperty )
                    	    // InternalXenia.g:574:7: lv_infoProps_5_0= ruleInfoProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getMappedEntityAccess().getInfoPropsInfoPropertyParserRuleCall_0_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_infoProps_5_0=ruleInfoProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMappedEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"infoProps",
                    	    								lv_infoProps_5_0,
                    	    								"com.foliage.xenia.Xenia.InfoProperty");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getMappedEntityAccess().getRightSquareBracketKeyword_0_5());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXenia.g:598:3: (otherlv_7= 'map' otherlv_8= ':' otherlv_9= '[' ( (lv_linkedProps_10_0= ruleLinkedProperty ) ) (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )* otherlv_13= ']' )
                    {
                    // InternalXenia.g:598:3: (otherlv_7= 'map' otherlv_8= ':' otherlv_9= '[' ( (lv_linkedProps_10_0= ruleLinkedProperty ) ) (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )* otherlv_13= ']' )
                    // InternalXenia.g:599:4: otherlv_7= 'map' otherlv_8= ':' otherlv_9= '[' ( (lv_linkedProps_10_0= ruleLinkedProperty ) ) (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )* otherlv_13= ']'
                    {
                    otherlv_7=(Token)match(input,26,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getMappedEntityAccess().getMapKeyword_1_0());
                    			
                    otherlv_8=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getMappedEntityAccess().getColonKeyword_1_1());
                    			
                    otherlv_9=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getMappedEntityAccess().getLeftSquareBracketKeyword_1_2());
                    			
                    // InternalXenia.g:611:4: ( (lv_linkedProps_10_0= ruleLinkedProperty ) )
                    // InternalXenia.g:612:5: (lv_linkedProps_10_0= ruleLinkedProperty )
                    {
                    // InternalXenia.g:612:5: (lv_linkedProps_10_0= ruleLinkedProperty )
                    // InternalXenia.g:613:6: lv_linkedProps_10_0= ruleLinkedProperty
                    {

                    						newCompositeNode(grammarAccess.getMappedEntityAccess().getLinkedPropsLinkedPropertyParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_linkedProps_10_0=ruleLinkedProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMappedEntityRule());
                    						}
                    						add(
                    							current,
                    							"linkedProps",
                    							lv_linkedProps_10_0,
                    							"com.foliage.xenia.Xenia.LinkedProperty");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXenia.g:630:4: (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalXenia.g:631:5: otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_9); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getMappedEntityAccess().getCommaKeyword_1_4_0());
                    	    				
                    	    // InternalXenia.g:635:5: ( (lv_linkedProps_12_0= ruleLinkedProperty ) )
                    	    // InternalXenia.g:636:6: (lv_linkedProps_12_0= ruleLinkedProperty )
                    	    {
                    	    // InternalXenia.g:636:6: (lv_linkedProps_12_0= ruleLinkedProperty )
                    	    // InternalXenia.g:637:7: lv_linkedProps_12_0= ruleLinkedProperty
                    	    {

                    	    							newCompositeNode(grammarAccess.getMappedEntityAccess().getLinkedPropsLinkedPropertyParserRuleCall_1_4_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_linkedProps_12_0=ruleLinkedProperty();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMappedEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"linkedProps",
                    	    								lv_linkedProps_12_0,
                    	    								"com.foliage.xenia.Xenia.LinkedProperty");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_13, grammarAccess.getMappedEntityAccess().getRightSquareBracketKeyword_1_5());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMappedEntity"


    // $ANTLR start "entryRuleInfoProperty"
    // InternalXenia.g:664:1: entryRuleInfoProperty returns [EObject current=null] : iv_ruleInfoProperty= ruleInfoProperty EOF ;
    public final EObject entryRuleInfoProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfoProperty = null;


        try {
            // InternalXenia.g:664:53: (iv_ruleInfoProperty= ruleInfoProperty EOF )
            // InternalXenia.g:665:2: iv_ruleInfoProperty= ruleInfoProperty EOF
            {
             newCompositeNode(grammarAccess.getInfoPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfoProperty=ruleInfoProperty();

            state._fsp--;

             current =iv_ruleInfoProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfoProperty"


    // $ANTLR start "ruleInfoProperty"
    // InternalXenia.g:671:1: ruleInfoProperty returns [EObject current=null] : ( ( (lv_page_0_0= ruleSite ) ) otherlv_1= '->' ( (lv_entities_2_0= ruleInfoEntity ) ) (otherlv_3= ',' ( (lv_entities_4_0= ruleInfoEntity ) ) )* ) ;
    public final EObject ruleInfoProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_page_0_0 = null;

        EObject lv_entities_2_0 = null;

        EObject lv_entities_4_0 = null;



        	enterRule();

        try {
            // InternalXenia.g:677:2: ( ( ( (lv_page_0_0= ruleSite ) ) otherlv_1= '->' ( (lv_entities_2_0= ruleInfoEntity ) ) (otherlv_3= ',' ( (lv_entities_4_0= ruleInfoEntity ) ) )* ) )
            // InternalXenia.g:678:2: ( ( (lv_page_0_0= ruleSite ) ) otherlv_1= '->' ( (lv_entities_2_0= ruleInfoEntity ) ) (otherlv_3= ',' ( (lv_entities_4_0= ruleInfoEntity ) ) )* )
            {
            // InternalXenia.g:678:2: ( ( (lv_page_0_0= ruleSite ) ) otherlv_1= '->' ( (lv_entities_2_0= ruleInfoEntity ) ) (otherlv_3= ',' ( (lv_entities_4_0= ruleInfoEntity ) ) )* )
            // InternalXenia.g:679:3: ( (lv_page_0_0= ruleSite ) ) otherlv_1= '->' ( (lv_entities_2_0= ruleInfoEntity ) ) (otherlv_3= ',' ( (lv_entities_4_0= ruleInfoEntity ) ) )*
            {
            // InternalXenia.g:679:3: ( (lv_page_0_0= ruleSite ) )
            // InternalXenia.g:680:4: (lv_page_0_0= ruleSite )
            {
            // InternalXenia.g:680:4: (lv_page_0_0= ruleSite )
            // InternalXenia.g:681:5: lv_page_0_0= ruleSite
            {

            					newCompositeNode(grammarAccess.getInfoPropertyAccess().getPageSiteParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_17);
            lv_page_0_0=ruleSite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfoPropertyRule());
            					}
            					set(
            						current,
            						"page",
            						lv_page_0_0,
            						"com.foliage.xenia.Xenia.Site");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getInfoPropertyAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalXenia.g:702:3: ( (lv_entities_2_0= ruleInfoEntity ) )
            // InternalXenia.g:703:4: (lv_entities_2_0= ruleInfoEntity )
            {
            // InternalXenia.g:703:4: (lv_entities_2_0= ruleInfoEntity )
            // InternalXenia.g:704:5: lv_entities_2_0= ruleInfoEntity
            {

            					newCompositeNode(grammarAccess.getInfoPropertyAccess().getEntitiesInfoEntityParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_19);
            lv_entities_2_0=ruleInfoEntity();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfoPropertyRule());
            					}
            					add(
            						current,
            						"entities",
            						lv_entities_2_0,
            						"com.foliage.xenia.Xenia.InfoEntity");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXenia.g:721:3: (otherlv_3= ',' ( (lv_entities_4_0= ruleInfoEntity ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==15) ) {
                    int LA10_1 = input.LA(2);

                    if ( ((LA10_1>=28 && LA10_1<=30)) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalXenia.g:722:4: otherlv_3= ',' ( (lv_entities_4_0= ruleInfoEntity ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_18); 

            	    				newLeafNode(otherlv_3, grammarAccess.getInfoPropertyAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalXenia.g:726:4: ( (lv_entities_4_0= ruleInfoEntity ) )
            	    // InternalXenia.g:727:5: (lv_entities_4_0= ruleInfoEntity )
            	    {
            	    // InternalXenia.g:727:5: (lv_entities_4_0= ruleInfoEntity )
            	    // InternalXenia.g:728:6: lv_entities_4_0= ruleInfoEntity
            	    {

            	    						newCompositeNode(grammarAccess.getInfoPropertyAccess().getEntitiesInfoEntityParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_19);
            	    lv_entities_4_0=ruleInfoEntity();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getInfoPropertyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"entities",
            	    							lv_entities_4_0,
            	    							"com.foliage.xenia.Xenia.InfoEntity");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInfoProperty"


    // $ANTLR start "entryRuleInfoEntity"
    // InternalXenia.g:750:1: entryRuleInfoEntity returns [EObject current=null] : iv_ruleInfoEntity= ruleInfoEntity EOF ;
    public final EObject entryRuleInfoEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfoEntity = null;


        try {
            // InternalXenia.g:750:51: (iv_ruleInfoEntity= ruleInfoEntity EOF )
            // InternalXenia.g:751:2: iv_ruleInfoEntity= ruleInfoEntity EOF
            {
             newCompositeNode(grammarAccess.getInfoEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfoEntity=ruleInfoEntity();

            state._fsp--;

             current =iv_ruleInfoEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfoEntity"


    // $ANTLR start "ruleInfoEntity"
    // InternalXenia.g:757:1: ruleInfoEntity returns [EObject current=null] : ( ( (lv_entries_0_0= ruleInfoEntry ) ) otherlv_1= ':' ( (lv_infoValue_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleInfoEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_infoValue_2_0=null;
        AntlrDatatypeRuleToken lv_entries_0_0 = null;



        	enterRule();

        try {
            // InternalXenia.g:763:2: ( ( ( (lv_entries_0_0= ruleInfoEntry ) ) otherlv_1= ':' ( (lv_infoValue_2_0= RULE_STRING ) ) ) )
            // InternalXenia.g:764:2: ( ( (lv_entries_0_0= ruleInfoEntry ) ) otherlv_1= ':' ( (lv_infoValue_2_0= RULE_STRING ) ) )
            {
            // InternalXenia.g:764:2: ( ( (lv_entries_0_0= ruleInfoEntry ) ) otherlv_1= ':' ( (lv_infoValue_2_0= RULE_STRING ) ) )
            // InternalXenia.g:765:3: ( (lv_entries_0_0= ruleInfoEntry ) ) otherlv_1= ':' ( (lv_infoValue_2_0= RULE_STRING ) )
            {
            // InternalXenia.g:765:3: ( (lv_entries_0_0= ruleInfoEntry ) )
            // InternalXenia.g:766:4: (lv_entries_0_0= ruleInfoEntry )
            {
            // InternalXenia.g:766:4: (lv_entries_0_0= ruleInfoEntry )
            // InternalXenia.g:767:5: lv_entries_0_0= ruleInfoEntry
            {

            					newCompositeNode(grammarAccess.getInfoEntityAccess().getEntriesInfoEntryParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_entries_0_0=ruleInfoEntry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInfoEntityRule());
            					}
            					add(
            						current,
            						"entries",
            						lv_entries_0_0,
            						"com.foliage.xenia.Xenia.InfoEntry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getInfoEntityAccess().getColonKeyword_1());
            		
            // InternalXenia.g:788:3: ( (lv_infoValue_2_0= RULE_STRING ) )
            // InternalXenia.g:789:4: (lv_infoValue_2_0= RULE_STRING )
            {
            // InternalXenia.g:789:4: (lv_infoValue_2_0= RULE_STRING )
            // InternalXenia.g:790:5: lv_infoValue_2_0= RULE_STRING
            {
            lv_infoValue_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_infoValue_2_0, grammarAccess.getInfoEntityAccess().getInfoValueSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInfoEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"infoValue",
            						lv_infoValue_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInfoEntity"


    // $ANTLR start "entryRuleInfoEntry"
    // InternalXenia.g:810:1: entryRuleInfoEntry returns [String current=null] : iv_ruleInfoEntry= ruleInfoEntry EOF ;
    public final String entryRuleInfoEntry() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfoEntry = null;


        try {
            // InternalXenia.g:810:49: (iv_ruleInfoEntry= ruleInfoEntry EOF )
            // InternalXenia.g:811:2: iv_ruleInfoEntry= ruleInfoEntry EOF
            {
             newCompositeNode(grammarAccess.getInfoEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInfoEntry=ruleInfoEntry();

            state._fsp--;

             current =iv_ruleInfoEntry.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInfoEntry"


    // $ANTLR start "ruleInfoEntry"
    // InternalXenia.g:817:1: ruleInfoEntry returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'mod' | kw= 'freq' | kw= 'prio' ) ;
    public final AntlrDatatypeRuleToken ruleInfoEntry() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXenia.g:823:2: ( (kw= 'mod' | kw= 'freq' | kw= 'prio' ) )
            // InternalXenia.g:824:2: (kw= 'mod' | kw= 'freq' | kw= 'prio' )
            {
            // InternalXenia.g:824:2: (kw= 'mod' | kw= 'freq' | kw= 'prio' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt11=1;
                }
                break;
            case 29:
                {
                alt11=2;
                }
                break;
            case 30:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalXenia.g:825:3: kw= 'mod'
                    {
                    kw=(Token)match(input,28,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInfoEntryAccess().getModKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXenia.g:831:3: kw= 'freq'
                    {
                    kw=(Token)match(input,29,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInfoEntryAccess().getFreqKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXenia.g:837:3: kw= 'prio'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInfoEntryAccess().getPrioKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInfoEntry"


    // $ANTLR start "entryRuleSite"
    // InternalXenia.g:846:1: entryRuleSite returns [EObject current=null] : iv_ruleSite= ruleSite EOF ;
    public final EObject entryRuleSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSite = null;


        try {
            // InternalXenia.g:846:45: (iv_ruleSite= ruleSite EOF )
            // InternalXenia.g:847:2: iv_ruleSite= ruleSite EOF
            {
             newCompositeNode(grammarAccess.getSiteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSite=ruleSite();

            state._fsp--;

             current =iv_ruleSite; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSite"


    // $ANTLR start "ruleSite"
    // InternalXenia.g:853:1: ruleSite returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXenia.g:859:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXenia.g:860:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXenia.g:860:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXenia.g:861:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSiteAccess().getCommercialAtKeyword_0());
            		
            // InternalXenia.g:865:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXenia.g:866:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXenia.g:866:4: (lv_name_1_0= RULE_ID )
            // InternalXenia.g:867:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getSiteAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSiteRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSite"


    // $ANTLR start "entryRuleLinkedProperty"
    // InternalXenia.g:887:1: entryRuleLinkedProperty returns [EObject current=null] : iv_ruleLinkedProperty= ruleLinkedProperty EOF ;
    public final EObject entryRuleLinkedProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedProperty = null;


        try {
            // InternalXenia.g:887:55: (iv_ruleLinkedProperty= ruleLinkedProperty EOF )
            // InternalXenia.g:888:2: iv_ruleLinkedProperty= ruleLinkedProperty EOF
            {
             newCompositeNode(grammarAccess.getLinkedPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLinkedProperty=ruleLinkedProperty();

            state._fsp--;

             current =iv_ruleLinkedProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLinkedProperty"


    // $ANTLR start "ruleLinkedProperty"
    // InternalXenia.g:894:1: ruleLinkedProperty returns [EObject current=null] : ( ( (lv_name_0_0= ruleSite ) ) (otherlv_1= '->' ( (lv_site_2_0= ruleSite ) ) )* ) ;
    public final EObject ruleLinkedProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_name_0_0 = null;

        EObject lv_site_2_0 = null;



        	enterRule();

        try {
            // InternalXenia.g:900:2: ( ( ( (lv_name_0_0= ruleSite ) ) (otherlv_1= '->' ( (lv_site_2_0= ruleSite ) ) )* ) )
            // InternalXenia.g:901:2: ( ( (lv_name_0_0= ruleSite ) ) (otherlv_1= '->' ( (lv_site_2_0= ruleSite ) ) )* )
            {
            // InternalXenia.g:901:2: ( ( (lv_name_0_0= ruleSite ) ) (otherlv_1= '->' ( (lv_site_2_0= ruleSite ) ) )* )
            // InternalXenia.g:902:3: ( (lv_name_0_0= ruleSite ) ) (otherlv_1= '->' ( (lv_site_2_0= ruleSite ) ) )*
            {
            // InternalXenia.g:902:3: ( (lv_name_0_0= ruleSite ) )
            // InternalXenia.g:903:4: (lv_name_0_0= ruleSite )
            {
            // InternalXenia.g:903:4: (lv_name_0_0= ruleSite )
            // InternalXenia.g:904:5: lv_name_0_0= ruleSite
            {

            					newCompositeNode(grammarAccess.getLinkedPropertyAccess().getNameSiteParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_20);
            lv_name_0_0=ruleSite();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkedPropertyRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"com.foliage.xenia.Xenia.Site");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXenia.g:921:3: (otherlv_1= '->' ( (lv_site_2_0= ruleSite ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXenia.g:922:4: otherlv_1= '->' ( (lv_site_2_0= ruleSite ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_9); 

            	    				newLeafNode(otherlv_1, grammarAccess.getLinkedPropertyAccess().getHyphenMinusGreaterThanSignKeyword_1_0());
            	    			
            	    // InternalXenia.g:926:4: ( (lv_site_2_0= ruleSite ) )
            	    // InternalXenia.g:927:5: (lv_site_2_0= ruleSite )
            	    {
            	    // InternalXenia.g:927:5: (lv_site_2_0= ruleSite )
            	    // InternalXenia.g:928:6: lv_site_2_0= ruleSite
            	    {

            	    						newCompositeNode(grammarAccess.getLinkedPropertyAccess().getSiteSiteParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
            	    lv_site_2_0=ruleSite();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLinkedPropertyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"site",
            	    							lv_site_2_0,
            	    							"com.foliage.xenia.Xenia.Site");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLinkedProperty"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000070A0002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000002L});

}
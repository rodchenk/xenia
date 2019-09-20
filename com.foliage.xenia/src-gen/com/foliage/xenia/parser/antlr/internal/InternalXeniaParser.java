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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'app'", "'has'", "'pages'", "'['", "','", "']'", "'with'", "':'", "'xml'", "'mode'", "'DEV'", "'PROD'", "'@'", "'modal'", "'('", "')'", "'info'", "'map'", "'->'", "'mod'", "'freq'", "'prio'"
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
    public static final int T__31=31;
    public static final int T__32=32;
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

                if ( (LA1_0==17||(LA1_0>=19 && LA1_0<=20)) ) {
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

                if ( ((LA2_0>=27 && LA2_0<=28)) ) {
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
    // InternalXenia.g:248:1: ruleEntity returns [EObject current=null] : ( (otherlv_0= 'with' otherlv_1= ':' ( (lv_tech_2_0= RULE_STRING ) ) ) | (otherlv_3= 'xml' otherlv_4= ':' ( (lv_path_5_0= RULE_STRING ) ) ) | (otherlv_6= 'mode' otherlv_7= ':' ( (lv_mode_8_0= ruleMode ) ) ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_tech_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_path_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_mode_8_0 = null;



        	enterRule();

        try {
            // InternalXenia.g:254:2: ( ( (otherlv_0= 'with' otherlv_1= ':' ( (lv_tech_2_0= RULE_STRING ) ) ) | (otherlv_3= 'xml' otherlv_4= ':' ( (lv_path_5_0= RULE_STRING ) ) ) | (otherlv_6= 'mode' otherlv_7= ':' ( (lv_mode_8_0= ruleMode ) ) ) ) )
            // InternalXenia.g:255:2: ( (otherlv_0= 'with' otherlv_1= ':' ( (lv_tech_2_0= RULE_STRING ) ) ) | (otherlv_3= 'xml' otherlv_4= ':' ( (lv_path_5_0= RULE_STRING ) ) ) | (otherlv_6= 'mode' otherlv_7= ':' ( (lv_mode_8_0= ruleMode ) ) ) )
            {
            // InternalXenia.g:255:2: ( (otherlv_0= 'with' otherlv_1= ':' ( (lv_tech_2_0= RULE_STRING ) ) ) | (otherlv_3= 'xml' otherlv_4= ':' ( (lv_path_5_0= RULE_STRING ) ) ) | (otherlv_6= 'mode' otherlv_7= ':' ( (lv_mode_8_0= ruleMode ) ) ) )
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
            case 20:
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
                    // InternalXenia.g:314:3: (otherlv_6= 'mode' otherlv_7= ':' ( (lv_mode_8_0= ruleMode ) ) )
                    {
                    // InternalXenia.g:314:3: (otherlv_6= 'mode' otherlv_7= ':' ( (lv_mode_8_0= ruleMode ) ) )
                    // InternalXenia.g:315:4: otherlv_6= 'mode' otherlv_7= ':' ( (lv_mode_8_0= ruleMode ) )
                    {
                    otherlv_6=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getModeKeyword_2_0());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_13); 

                    				newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getColonKeyword_2_1());
                    			
                    // InternalXenia.g:323:4: ( (lv_mode_8_0= ruleMode ) )
                    // InternalXenia.g:324:5: (lv_mode_8_0= ruleMode )
                    {
                    // InternalXenia.g:324:5: (lv_mode_8_0= ruleMode )
                    // InternalXenia.g:325:6: lv_mode_8_0= ruleMode
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getModeModeParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_mode_8_0=ruleMode();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						set(
                    							current,
                    							"mode",
                    							lv_mode_8_0,
                    							"com.foliage.xenia.Xenia.Mode");
                    						afterParserOrEnumRuleCall();
                    					

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


    // $ANTLR start "entryRuleMode"
    // InternalXenia.g:347:1: entryRuleMode returns [String current=null] : iv_ruleMode= ruleMode EOF ;
    public final String entryRuleMode() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMode = null;


        try {
            // InternalXenia.g:347:44: (iv_ruleMode= ruleMode EOF )
            // InternalXenia.g:348:2: iv_ruleMode= ruleMode EOF
            {
             newCompositeNode(grammarAccess.getModeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMode=ruleMode();

            state._fsp--;

             current =iv_ruleMode.getText(); 
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
    // $ANTLR end "entryRuleMode"


    // $ANTLR start "ruleMode"
    // InternalXenia.g:354:1: ruleMode returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'DEV' | kw= 'PROD' ) ;
    public final AntlrDatatypeRuleToken ruleMode() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXenia.g:360:2: ( (kw= 'DEV' | kw= 'PROD' ) )
            // InternalXenia.g:361:2: (kw= 'DEV' | kw= 'PROD' )
            {
            // InternalXenia.g:361:2: (kw= 'DEV' | kw= 'PROD' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXenia.g:362:3: kw= 'DEV'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getModeAccess().getDEVKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXenia.g:368:3: kw= 'PROD'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getModeAccess().getPRODKeyword_1());
                    		

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
    // $ANTLR end "ruleMode"


    // $ANTLR start "entryRuleSuperSite"
    // InternalXenia.g:377:1: entryRuleSuperSite returns [EObject current=null] : iv_ruleSuperSite= ruleSuperSite EOF ;
    public final EObject entryRuleSuperSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSuperSite = null;


        try {
            // InternalXenia.g:377:50: (iv_ruleSuperSite= ruleSuperSite EOF )
            // InternalXenia.g:378:2: iv_ruleSuperSite= ruleSuperSite EOF
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
    // InternalXenia.g:384:1: ruleSuperSite returns [EObject current=null] : (this_Site_0= ruleSite | this_SiteWithModal_1= ruleSiteWithModal ) ;
    public final EObject ruleSuperSite() throws RecognitionException {
        EObject current = null;

        EObject this_Site_0 = null;

        EObject this_SiteWithModal_1 = null;



        	enterRule();

        try {
            // InternalXenia.g:390:2: ( (this_Site_0= ruleSite | this_SiteWithModal_1= ruleSiteWithModal ) )
            // InternalXenia.g:391:2: (this_Site_0= ruleSite | this_SiteWithModal_1= ruleSiteWithModal )
            {
            // InternalXenia.g:391:2: (this_Site_0= ruleSite | this_SiteWithModal_1= ruleSiteWithModal )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_ID) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==EOF||(LA6_2>=15 && LA6_2<=16)||LA6_2==26) ) {
                        alt6=1;
                    }
                    else if ( (LA6_2==17) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXenia.g:392:3: this_Site_0= ruleSite
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
                    // InternalXenia.g:401:3: this_SiteWithModal_1= ruleSiteWithModal
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
    // InternalXenia.g:413:1: entryRuleSiteWithModal returns [EObject current=null] : iv_ruleSiteWithModal= ruleSiteWithModal EOF ;
    public final EObject entryRuleSiteWithModal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSiteWithModal = null;


        try {
            // InternalXenia.g:413:54: (iv_ruleSiteWithModal= ruleSiteWithModal EOF )
            // InternalXenia.g:414:2: iv_ruleSiteWithModal= ruleSiteWithModal EOF
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
    // InternalXenia.g:420:1: ruleSiteWithModal returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'modal' otherlv_4= '(' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ')' ) ;
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
            // InternalXenia.g:426:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'modal' otherlv_4= '(' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ')' ) )
            // InternalXenia.g:427:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'modal' otherlv_4= '(' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ')' )
            {
            // InternalXenia.g:427:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'modal' otherlv_4= '(' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ')' )
            // InternalXenia.g:428:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'with' otherlv_3= 'modal' otherlv_4= '(' ( (lv_sites_5_0= ruleSuperSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )* otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSiteWithModalAccess().getCommercialAtKeyword_0());
            		
            // InternalXenia.g:432:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXenia.g:433:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXenia.g:433:4: (lv_name_1_0= RULE_ID )
            // InternalXenia.g:434:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            otherlv_2=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getSiteWithModalAccess().getWithKeyword_2());
            		
            otherlv_3=(Token)match(input,24,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getSiteWithModalAccess().getModalKeyword_3());
            		
            otherlv_4=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getSiteWithModalAccess().getLeftParenthesisKeyword_4());
            		
            // InternalXenia.g:462:3: ( (lv_sites_5_0= ruleSuperSite ) )
            // InternalXenia.g:463:4: (lv_sites_5_0= ruleSuperSite )
            {
            // InternalXenia.g:463:4: (lv_sites_5_0= ruleSuperSite )
            // InternalXenia.g:464:5: lv_sites_5_0= ruleSuperSite
            {

            					newCompositeNode(grammarAccess.getSiteWithModalAccess().getSitesSuperSiteParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalXenia.g:481:3: (otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXenia.g:482:4: otherlv_6= ',' ( (lv_sites_7_0= ruleSuperSite ) )
            	    {
            	    otherlv_6=(Token)match(input,15,FOLLOW_9); 

            	    				newLeafNode(otherlv_6, grammarAccess.getSiteWithModalAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalXenia.g:486:4: ( (lv_sites_7_0= ruleSuperSite ) )
            	    // InternalXenia.g:487:5: (lv_sites_7_0= ruleSuperSite )
            	    {
            	    // InternalXenia.g:487:5: (lv_sites_7_0= ruleSuperSite )
            	    // InternalXenia.g:488:6: lv_sites_7_0= ruleSuperSite
            	    {

            	    						newCompositeNode(grammarAccess.getSiteWithModalAccess().getSitesSuperSiteParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
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
            	    break loop7;
                }
            } while (true);

            otherlv_8=(Token)match(input,26,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMappedEntity"
    // InternalXenia.g:514:1: entryRuleMappedEntity returns [EObject current=null] : iv_ruleMappedEntity= ruleMappedEntity EOF ;
    public final EObject entryRuleMappedEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappedEntity = null;


        try {
            // InternalXenia.g:514:53: (iv_ruleMappedEntity= ruleMappedEntity EOF )
            // InternalXenia.g:515:2: iv_ruleMappedEntity= ruleMappedEntity EOF
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
    // InternalXenia.g:521:1: ruleMappedEntity returns [EObject current=null] : ( (otherlv_0= 'info' otherlv_1= ':' otherlv_2= '[' ( (lv_infoProps_3_0= ruleInfoProperty ) ) (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )* otherlv_6= ']' ) | (otherlv_7= 'map' otherlv_8= ':' otherlv_9= '[' ( (lv_linkedProps_10_0= ruleLinkedProperty ) ) (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )* otherlv_13= ']' ) ) ;
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
            // InternalXenia.g:527:2: ( ( (otherlv_0= 'info' otherlv_1= ':' otherlv_2= '[' ( (lv_infoProps_3_0= ruleInfoProperty ) ) (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )* otherlv_6= ']' ) | (otherlv_7= 'map' otherlv_8= ':' otherlv_9= '[' ( (lv_linkedProps_10_0= ruleLinkedProperty ) ) (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )* otherlv_13= ']' ) ) )
            // InternalXenia.g:528:2: ( (otherlv_0= 'info' otherlv_1= ':' otherlv_2= '[' ( (lv_infoProps_3_0= ruleInfoProperty ) ) (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )* otherlv_6= ']' ) | (otherlv_7= 'map' otherlv_8= ':' otherlv_9= '[' ( (lv_linkedProps_10_0= ruleLinkedProperty ) ) (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )* otherlv_13= ']' ) )
            {
            // InternalXenia.g:528:2: ( (otherlv_0= 'info' otherlv_1= ':' otherlv_2= '[' ( (lv_infoProps_3_0= ruleInfoProperty ) ) (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )* otherlv_6= ']' ) | (otherlv_7= 'map' otherlv_8= ':' otherlv_9= '[' ( (lv_linkedProps_10_0= ruleLinkedProperty ) ) (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )* otherlv_13= ']' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            else if ( (LA10_0==28) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalXenia.g:529:3: (otherlv_0= 'info' otherlv_1= ':' otherlv_2= '[' ( (lv_infoProps_3_0= ruleInfoProperty ) ) (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )* otherlv_6= ']' )
                    {
                    // InternalXenia.g:529:3: (otherlv_0= 'info' otherlv_1= ':' otherlv_2= '[' ( (lv_infoProps_3_0= ruleInfoProperty ) ) (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )* otherlv_6= ']' )
                    // InternalXenia.g:530:4: otherlv_0= 'info' otherlv_1= ':' otherlv_2= '[' ( (lv_infoProps_3_0= ruleInfoProperty ) ) (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )* otherlv_6= ']'
                    {
                    otherlv_0=(Token)match(input,27,FOLLOW_11); 

                    				newLeafNode(otherlv_0, grammarAccess.getMappedEntityAccess().getInfoKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_1, grammarAccess.getMappedEntityAccess().getColonKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getMappedEntityAccess().getLeftSquareBracketKeyword_0_2());
                    			
                    // InternalXenia.g:542:4: ( (lv_infoProps_3_0= ruleInfoProperty ) )
                    // InternalXenia.g:543:5: (lv_infoProps_3_0= ruleInfoProperty )
                    {
                    // InternalXenia.g:543:5: (lv_infoProps_3_0= ruleInfoProperty )
                    // InternalXenia.g:544:6: lv_infoProps_3_0= ruleInfoProperty
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

                    // InternalXenia.g:561:4: (otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==15) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalXenia.g:562:5: otherlv_4= ',' ( (lv_infoProps_5_0= ruleInfoProperty ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getMappedEntityAccess().getCommaKeyword_0_4_0());
                    	    				
                    	    // InternalXenia.g:566:5: ( (lv_infoProps_5_0= ruleInfoProperty ) )
                    	    // InternalXenia.g:567:6: (lv_infoProps_5_0= ruleInfoProperty )
                    	    {
                    	    // InternalXenia.g:567:6: (lv_infoProps_5_0= ruleInfoProperty )
                    	    // InternalXenia.g:568:7: lv_infoProps_5_0= ruleInfoProperty
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
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getMappedEntityAccess().getRightSquareBracketKeyword_0_5());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXenia.g:592:3: (otherlv_7= 'map' otherlv_8= ':' otherlv_9= '[' ( (lv_linkedProps_10_0= ruleLinkedProperty ) ) (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )* otherlv_13= ']' )
                    {
                    // InternalXenia.g:592:3: (otherlv_7= 'map' otherlv_8= ':' otherlv_9= '[' ( (lv_linkedProps_10_0= ruleLinkedProperty ) ) (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )* otherlv_13= ']' )
                    // InternalXenia.g:593:4: otherlv_7= 'map' otherlv_8= ':' otherlv_9= '[' ( (lv_linkedProps_10_0= ruleLinkedProperty ) ) (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )* otherlv_13= ']'
                    {
                    otherlv_7=(Token)match(input,28,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getMappedEntityAccess().getMapKeyword_1_0());
                    			
                    otherlv_8=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_8, grammarAccess.getMappedEntityAccess().getColonKeyword_1_1());
                    			
                    otherlv_9=(Token)match(input,14,FOLLOW_5); 

                    				newLeafNode(otherlv_9, grammarAccess.getMappedEntityAccess().getLeftSquareBracketKeyword_1_2());
                    			
                    // InternalXenia.g:605:4: ( (lv_linkedProps_10_0= ruleLinkedProperty ) )
                    // InternalXenia.g:606:5: (lv_linkedProps_10_0= ruleLinkedProperty )
                    {
                    // InternalXenia.g:606:5: (lv_linkedProps_10_0= ruleLinkedProperty )
                    // InternalXenia.g:607:6: lv_linkedProps_10_0= ruleLinkedProperty
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

                    // InternalXenia.g:624:4: (otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalXenia.g:625:5: otherlv_11= ',' ( (lv_linkedProps_12_0= ruleLinkedProperty ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getMappedEntityAccess().getCommaKeyword_1_4_0());
                    	    				
                    	    // InternalXenia.g:629:5: ( (lv_linkedProps_12_0= ruleLinkedProperty ) )
                    	    // InternalXenia.g:630:6: (lv_linkedProps_12_0= ruleLinkedProperty )
                    	    {
                    	    // InternalXenia.g:630:6: (lv_linkedProps_12_0= ruleLinkedProperty )
                    	    // InternalXenia.g:631:7: lv_linkedProps_12_0= ruleLinkedProperty
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
                    	    break loop9;
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
    // InternalXenia.g:658:1: entryRuleInfoProperty returns [EObject current=null] : iv_ruleInfoProperty= ruleInfoProperty EOF ;
    public final EObject entryRuleInfoProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfoProperty = null;


        try {
            // InternalXenia.g:658:53: (iv_ruleInfoProperty= ruleInfoProperty EOF )
            // InternalXenia.g:659:2: iv_ruleInfoProperty= ruleInfoProperty EOF
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
    // InternalXenia.g:665:1: ruleInfoProperty returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_entities_2_0= ruleInfoEntity ) ) (otherlv_3= ',' ( (lv_entities_4_0= ruleInfoEntity ) ) )* ) ;
    public final EObject ruleInfoProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_entities_2_0 = null;

        EObject lv_entities_4_0 = null;



        	enterRule();

        try {
            // InternalXenia.g:671:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_entities_2_0= ruleInfoEntity ) ) (otherlv_3= ',' ( (lv_entities_4_0= ruleInfoEntity ) ) )* ) )
            // InternalXenia.g:672:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_entities_2_0= ruleInfoEntity ) ) (otherlv_3= ',' ( (lv_entities_4_0= ruleInfoEntity ) ) )* )
            {
            // InternalXenia.g:672:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_entities_2_0= ruleInfoEntity ) ) (otherlv_3= ',' ( (lv_entities_4_0= ruleInfoEntity ) ) )* )
            // InternalXenia.g:673:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (lv_entities_2_0= ruleInfoEntity ) ) (otherlv_3= ',' ( (lv_entities_4_0= ruleInfoEntity ) ) )*
            {
            // InternalXenia.g:673:3: ( (otherlv_0= RULE_ID ) )
            // InternalXenia.g:674:4: (otherlv_0= RULE_ID )
            {
            // InternalXenia.g:674:4: (otherlv_0= RULE_ID )
            // InternalXenia.g:675:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInfoPropertyRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getInfoPropertyAccess().getPageSiteCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getInfoPropertyAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalXenia.g:690:3: ( (lv_entities_2_0= ruleInfoEntity ) )
            // InternalXenia.g:691:4: (lv_entities_2_0= ruleInfoEntity )
            {
            // InternalXenia.g:691:4: (lv_entities_2_0= ruleInfoEntity )
            // InternalXenia.g:692:5: lv_entities_2_0= ruleInfoEntity
            {

            					newCompositeNode(grammarAccess.getInfoPropertyAccess().getEntitiesInfoEntityParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_20);
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

            // InternalXenia.g:709:3: (otherlv_3= ',' ( (lv_entities_4_0= ruleInfoEntity ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==15) ) {
                    int LA11_1 = input.LA(2);

                    if ( ((LA11_1>=30 && LA11_1<=32)) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalXenia.g:710:4: otherlv_3= ',' ( (lv_entities_4_0= ruleInfoEntity ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_19); 

            	    				newLeafNode(otherlv_3, grammarAccess.getInfoPropertyAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalXenia.g:714:4: ( (lv_entities_4_0= ruleInfoEntity ) )
            	    // InternalXenia.g:715:5: (lv_entities_4_0= ruleInfoEntity )
            	    {
            	    // InternalXenia.g:715:5: (lv_entities_4_0= ruleInfoEntity )
            	    // InternalXenia.g:716:6: lv_entities_4_0= ruleInfoEntity
            	    {

            	    						newCompositeNode(grammarAccess.getInfoPropertyAccess().getEntitiesInfoEntityParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_20);
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
            	    break loop11;
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
    // InternalXenia.g:738:1: entryRuleInfoEntity returns [EObject current=null] : iv_ruleInfoEntity= ruleInfoEntity EOF ;
    public final EObject entryRuleInfoEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInfoEntity = null;


        try {
            // InternalXenia.g:738:51: (iv_ruleInfoEntity= ruleInfoEntity EOF )
            // InternalXenia.g:739:2: iv_ruleInfoEntity= ruleInfoEntity EOF
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
    // InternalXenia.g:745:1: ruleInfoEntity returns [EObject current=null] : ( ( (lv_entries_0_0= ruleInfoEntry ) ) otherlv_1= ':' ( (lv_infoValue_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleInfoEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_infoValue_2_0=null;
        AntlrDatatypeRuleToken lv_entries_0_0 = null;



        	enterRule();

        try {
            // InternalXenia.g:751:2: ( ( ( (lv_entries_0_0= ruleInfoEntry ) ) otherlv_1= ':' ( (lv_infoValue_2_0= RULE_STRING ) ) ) )
            // InternalXenia.g:752:2: ( ( (lv_entries_0_0= ruleInfoEntry ) ) otherlv_1= ':' ( (lv_infoValue_2_0= RULE_STRING ) ) )
            {
            // InternalXenia.g:752:2: ( ( (lv_entries_0_0= ruleInfoEntry ) ) otherlv_1= ':' ( (lv_infoValue_2_0= RULE_STRING ) ) )
            // InternalXenia.g:753:3: ( (lv_entries_0_0= ruleInfoEntry ) ) otherlv_1= ':' ( (lv_infoValue_2_0= RULE_STRING ) )
            {
            // InternalXenia.g:753:3: ( (lv_entries_0_0= ruleInfoEntry ) )
            // InternalXenia.g:754:4: (lv_entries_0_0= ruleInfoEntry )
            {
            // InternalXenia.g:754:4: (lv_entries_0_0= ruleInfoEntry )
            // InternalXenia.g:755:5: lv_entries_0_0= ruleInfoEntry
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
            		
            // InternalXenia.g:776:3: ( (lv_infoValue_2_0= RULE_STRING ) )
            // InternalXenia.g:777:4: (lv_infoValue_2_0= RULE_STRING )
            {
            // InternalXenia.g:777:4: (lv_infoValue_2_0= RULE_STRING )
            // InternalXenia.g:778:5: lv_infoValue_2_0= RULE_STRING
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
    // InternalXenia.g:798:1: entryRuleInfoEntry returns [String current=null] : iv_ruleInfoEntry= ruleInfoEntry EOF ;
    public final String entryRuleInfoEntry() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInfoEntry = null;


        try {
            // InternalXenia.g:798:49: (iv_ruleInfoEntry= ruleInfoEntry EOF )
            // InternalXenia.g:799:2: iv_ruleInfoEntry= ruleInfoEntry EOF
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
    // InternalXenia.g:805:1: ruleInfoEntry returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'mod' | kw= 'freq' | kw= 'prio' ) ;
    public final AntlrDatatypeRuleToken ruleInfoEntry() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXenia.g:811:2: ( (kw= 'mod' | kw= 'freq' | kw= 'prio' ) )
            // InternalXenia.g:812:2: (kw= 'mod' | kw= 'freq' | kw= 'prio' )
            {
            // InternalXenia.g:812:2: (kw= 'mod' | kw= 'freq' | kw= 'prio' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt12=1;
                }
                break;
            case 31:
                {
                alt12=2;
                }
                break;
            case 32:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalXenia.g:813:3: kw= 'mod'
                    {
                    kw=(Token)match(input,30,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInfoEntryAccess().getModKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXenia.g:819:3: kw= 'freq'
                    {
                    kw=(Token)match(input,31,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getInfoEntryAccess().getFreqKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXenia.g:825:3: kw= 'prio'
                    {
                    kw=(Token)match(input,32,FOLLOW_2); 

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
    // InternalXenia.g:834:1: entryRuleSite returns [EObject current=null] : iv_ruleSite= ruleSite EOF ;
    public final EObject entryRuleSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSite = null;


        try {
            // InternalXenia.g:834:45: (iv_ruleSite= ruleSite EOF )
            // InternalXenia.g:835:2: iv_ruleSite= ruleSite EOF
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
    // InternalXenia.g:841:1: ruleSite returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleSite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalXenia.g:847:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalXenia.g:848:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalXenia.g:848:2: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalXenia.g:849:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSiteAccess().getCommercialAtKeyword_0());
            		
            // InternalXenia.g:853:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalXenia.g:854:4: (lv_name_1_0= RULE_ID )
            {
            // InternalXenia.g:854:4: (lv_name_1_0= RULE_ID )
            // InternalXenia.g:855:5: lv_name_1_0= RULE_ID
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
    // InternalXenia.g:875:1: entryRuleLinkedProperty returns [EObject current=null] : iv_ruleLinkedProperty= ruleLinkedProperty EOF ;
    public final EObject entryRuleLinkedProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedProperty = null;


        try {
            // InternalXenia.g:875:55: (iv_ruleLinkedProperty= ruleLinkedProperty EOF )
            // InternalXenia.g:876:2: iv_ruleLinkedProperty= ruleLinkedProperty EOF
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
    // InternalXenia.g:882:1: ruleLinkedProperty returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' otherlv_2= '(' ( (lv_page_3_0= ruleRedirectPage ) ) otherlv_4= ')' ) ;
    public final EObject ruleLinkedProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_page_3_0 = null;



        	enterRule();

        try {
            // InternalXenia.g:888:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' otherlv_2= '(' ( (lv_page_3_0= ruleRedirectPage ) ) otherlv_4= ')' ) )
            // InternalXenia.g:889:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' otherlv_2= '(' ( (lv_page_3_0= ruleRedirectPage ) ) otherlv_4= ')' )
            {
            // InternalXenia.g:889:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' otherlv_2= '(' ( (lv_page_3_0= ruleRedirectPage ) ) otherlv_4= ')' )
            // InternalXenia.g:890:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' otherlv_2= '(' ( (lv_page_3_0= ruleRedirectPage ) ) otherlv_4= ')'
            {
            // InternalXenia.g:890:3: ( (otherlv_0= RULE_ID ) )
            // InternalXenia.g:891:4: (otherlv_0= RULE_ID )
            {
            // InternalXenia.g:891:4: (otherlv_0= RULE_ID )
            // InternalXenia.g:892:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkedPropertyRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_0, grammarAccess.getLinkedPropertyAccess().getNameSiteCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkedPropertyAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            otherlv_2=(Token)match(input,25,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getLinkedPropertyAccess().getLeftParenthesisKeyword_2());
            		
            // InternalXenia.g:911:3: ( (lv_page_3_0= ruleRedirectPage ) )
            // InternalXenia.g:912:4: (lv_page_3_0= ruleRedirectPage )
            {
            // InternalXenia.g:912:4: (lv_page_3_0= ruleRedirectPage )
            // InternalXenia.g:913:5: lv_page_3_0= ruleRedirectPage
            {

            					newCompositeNode(grammarAccess.getLinkedPropertyAccess().getPageRedirectPageParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
            lv_page_3_0=ruleRedirectPage();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLinkedPropertyRule());
            					}
            					set(
            						current,
            						"page",
            						lv_page_3_0,
            						"com.foliage.xenia.Xenia.RedirectPage");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLinkedPropertyAccess().getRightParenthesisKeyword_4());
            		

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


    // $ANTLR start "entryRuleRedirectPage"
    // InternalXenia.g:938:1: entryRuleRedirectPage returns [EObject current=null] : iv_ruleRedirectPage= ruleRedirectPage EOF ;
    public final EObject entryRuleRedirectPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRedirectPage = null;


        try {
            // InternalXenia.g:938:53: (iv_ruleRedirectPage= ruleRedirectPage EOF )
            // InternalXenia.g:939:2: iv_ruleRedirectPage= ruleRedirectPage EOF
            {
             newCompositeNode(grammarAccess.getRedirectPageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRedirectPage=ruleRedirectPage();

            state._fsp--;

             current =iv_ruleRedirectPage; 
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
    // $ANTLR end "entryRuleRedirectPage"


    // $ANTLR start "ruleRedirectPage"
    // InternalXenia.g:945:1: ruleRedirectPage returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) ;
    public final EObject ruleRedirectPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalXenia.g:951:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* ) )
            // InternalXenia.g:952:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            {
            // InternalXenia.g:952:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )* )
            // InternalXenia.g:953:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            {
            // InternalXenia.g:953:3: ( (otherlv_0= RULE_ID ) )
            // InternalXenia.g:954:4: (otherlv_0= RULE_ID )
            {
            // InternalXenia.g:954:4: (otherlv_0= RULE_ID )
            // InternalXenia.g:955:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRedirectPageRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_0, grammarAccess.getRedirectPageAccess().getSiteSiteCrossReference_0_0());
            				

            }


            }

            // InternalXenia.g:966:3: (otherlv_1= ',' ( (otherlv_2= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXenia.g:967:4: otherlv_1= ',' ( (otherlv_2= RULE_ID ) )
            	    {
            	    otherlv_1=(Token)match(input,15,FOLLOW_5); 

            	    				newLeafNode(otherlv_1, grammarAccess.getRedirectPageAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalXenia.g:971:4: ( (otherlv_2= RULE_ID ) )
            	    // InternalXenia.g:972:5: (otherlv_2= RULE_ID )
            	    {
            	    // InternalXenia.g:972:5: (otherlv_2= RULE_ID )
            	    // InternalXenia.g:973:6: otherlv_2= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getRedirectPageRule());
            	    						}
            	    					
            	    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_20); 

            	    						newLeafNode(otherlv_2, grammarAccess.getRedirectPageAccess().getSiteSiteCrossReference_1_1_0());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // $ANTLR end "ruleRedirectPage"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000181A0002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000001C0000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000000L});

}
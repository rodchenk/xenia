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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'app'", "'has'", "'pages'", "'['", "','", "']'", "':'", "'with'", "'sitemap'", "'@'", "'modal'", "'('", "')'", "'sites'", "'map'", "'->'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=5;
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
    // InternalXenia.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_mapped_entities_1_0= ruleMappedEntity ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;

        EObject lv_mapped_entities_1_0 = null;



        	enterRule();

        try {
            // InternalXenia.g:77:2: ( ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_mapped_entities_1_0= ruleMappedEntity ) )* ) )
            // InternalXenia.g:78:2: ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_mapped_entities_1_0= ruleMappedEntity ) )* )
            {
            // InternalXenia.g:78:2: ( ( (lv_entities_0_0= ruleEntity ) )* ( (lv_mapped_entities_1_0= ruleMappedEntity ) )* )
            // InternalXenia.g:79:3: ( (lv_entities_0_0= ruleEntity ) )* ( (lv_mapped_entities_1_0= ruleMappedEntity ) )*
            {
            // InternalXenia.g:79:3: ( (lv_entities_0_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=18 && LA1_0<=19)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXenia.g:80:4: (lv_entities_0_0= ruleEntity )
            	    {
            	    // InternalXenia.g:80:4: (lv_entities_0_0= ruleEntity )
            	    // InternalXenia.g:81:5: lv_entities_0_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_entities_0_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_0_0,
            	    						"com.foliage.xenia.Xenia.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalXenia.g:98:3: ( (lv_mapped_entities_1_0= ruleMappedEntity ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=24 && LA2_0<=25)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalXenia.g:99:4: (lv_mapped_entities_1_0= ruleMappedEntity )
            	    {
            	    // InternalXenia.g:99:4: (lv_mapped_entities_1_0= ruleMappedEntity )
            	    // InternalXenia.g:100:5: lv_mapped_entities_1_0= ruleMappedEntity
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getMapped_entitiesMappedEntityParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_mapped_entities_1_0=ruleMappedEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mapped_entities",
            	    						lv_mapped_entities_1_0,
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


    // $ANTLR start "entryRuleEntity"
    // InternalXenia.g:121:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalXenia.g:121:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalXenia.g:122:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalXenia.g:128:1: ruleEntity returns [EObject current=null] : ( (otherlv_0= 'app' ( (lv_appName_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'pages' otherlv_4= '[' ( (lv_sites_5_0= ruleSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSite ) ) )* otherlv_8= ']' ) | ( ( (lv_prop_9_0= ruleProperty ) ) otherlv_10= ':' ( (lv_name_11_0= RULE_ID ) ) ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_appName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token lv_name_11_0=null;
        EObject lv_sites_5_0 = null;

        EObject lv_sites_7_0 = null;

        AntlrDatatypeRuleToken lv_prop_9_0 = null;



        	enterRule();

        try {
            // InternalXenia.g:134:2: ( ( (otherlv_0= 'app' ( (lv_appName_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'pages' otherlv_4= '[' ( (lv_sites_5_0= ruleSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSite ) ) )* otherlv_8= ']' ) | ( ( (lv_prop_9_0= ruleProperty ) ) otherlv_10= ':' ( (lv_name_11_0= RULE_ID ) ) ) ) )
            // InternalXenia.g:135:2: ( (otherlv_0= 'app' ( (lv_appName_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'pages' otherlv_4= '[' ( (lv_sites_5_0= ruleSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSite ) ) )* otherlv_8= ']' ) | ( ( (lv_prop_9_0= ruleProperty ) ) otherlv_10= ':' ( (lv_name_11_0= RULE_ID ) ) ) )
            {
            // InternalXenia.g:135:2: ( (otherlv_0= 'app' ( (lv_appName_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'pages' otherlv_4= '[' ( (lv_sites_5_0= ruleSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSite ) ) )* otherlv_8= ']' ) | ( ( (lv_prop_9_0= ruleProperty ) ) otherlv_10= ':' ( (lv_name_11_0= RULE_ID ) ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=18 && LA4_0<=19)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalXenia.g:136:3: (otherlv_0= 'app' ( (lv_appName_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'pages' otherlv_4= '[' ( (lv_sites_5_0= ruleSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSite ) ) )* otherlv_8= ']' )
                    {
                    // InternalXenia.g:136:3: (otherlv_0= 'app' ( (lv_appName_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'pages' otherlv_4= '[' ( (lv_sites_5_0= ruleSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSite ) ) )* otherlv_8= ']' )
                    // InternalXenia.g:137:4: otherlv_0= 'app' ( (lv_appName_1_0= RULE_ID ) ) otherlv_2= 'has' otherlv_3= 'pages' otherlv_4= '[' ( (lv_sites_5_0= ruleSite ) ) (otherlv_6= ',' ( (lv_sites_7_0= ruleSite ) ) )* otherlv_8= ']'
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getAppKeyword_0_0());
                    			
                    // InternalXenia.g:141:4: ( (lv_appName_1_0= RULE_ID ) )
                    // InternalXenia.g:142:5: (lv_appName_1_0= RULE_ID )
                    {
                    // InternalXenia.g:142:5: (lv_appName_1_0= RULE_ID )
                    // InternalXenia.g:143:6: lv_appName_1_0= RULE_ID
                    {
                    lv_appName_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_appName_1_0, grammarAccess.getEntityAccess().getAppNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"appName",
                    							lv_appName_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getHasKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getPagesKeyword_0_3());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftSquareBracketKeyword_0_4());
                    			
                    // InternalXenia.g:171:4: ( (lv_sites_5_0= ruleSite ) )
                    // InternalXenia.g:172:5: (lv_sites_5_0= ruleSite )
                    {
                    // InternalXenia.g:172:5: (lv_sites_5_0= ruleSite )
                    // InternalXenia.g:173:6: lv_sites_5_0= ruleSite
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getSitesSiteParserRuleCall_0_5_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_sites_5_0=ruleSite();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						add(
                    							current,
                    							"sites",
                    							lv_sites_5_0,
                    							"com.foliage.xenia.Xenia.Site");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXenia.g:190:4: (otherlv_6= ',' ( (lv_sites_7_0= ruleSite ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalXenia.g:191:5: otherlv_6= ',' ( (lv_sites_7_0= ruleSite ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FOLLOW_9); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getCommaKeyword_0_6_0());
                    	    				
                    	    // InternalXenia.g:195:5: ( (lv_sites_7_0= ruleSite ) )
                    	    // InternalXenia.g:196:6: (lv_sites_7_0= ruleSite )
                    	    {
                    	    // InternalXenia.g:196:6: (lv_sites_7_0= ruleSite )
                    	    // InternalXenia.g:197:7: lv_sites_7_0= ruleSite
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityAccess().getSitesSiteParserRuleCall_0_6_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_sites_7_0=ruleSite();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sites",
                    	    								lv_sites_7_0,
                    	    								"com.foliage.xenia.Xenia.Site");
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

                    				newLeafNode(otherlv_8, grammarAccess.getEntityAccess().getRightSquareBracketKeyword_0_7());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXenia.g:221:3: ( ( (lv_prop_9_0= ruleProperty ) ) otherlv_10= ':' ( (lv_name_11_0= RULE_ID ) ) )
                    {
                    // InternalXenia.g:221:3: ( ( (lv_prop_9_0= ruleProperty ) ) otherlv_10= ':' ( (lv_name_11_0= RULE_ID ) ) )
                    // InternalXenia.g:222:4: ( (lv_prop_9_0= ruleProperty ) ) otherlv_10= ':' ( (lv_name_11_0= RULE_ID ) )
                    {
                    // InternalXenia.g:222:4: ( (lv_prop_9_0= ruleProperty ) )
                    // InternalXenia.g:223:5: (lv_prop_9_0= ruleProperty )
                    {
                    // InternalXenia.g:223:5: (lv_prop_9_0= ruleProperty )
                    // InternalXenia.g:224:6: lv_prop_9_0= ruleProperty
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getPropPropertyParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_prop_9_0=ruleProperty();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						set(
                    							current,
                    							"prop",
                    							lv_prop_9_0,
                    							"com.foliage.xenia.Xenia.Property");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getColonKeyword_1_1());
                    			
                    // InternalXenia.g:245:4: ( (lv_name_11_0= RULE_ID ) )
                    // InternalXenia.g:246:5: (lv_name_11_0= RULE_ID )
                    {
                    // InternalXenia.g:246:5: (lv_name_11_0= RULE_ID )
                    // InternalXenia.g:247:6: lv_name_11_0= RULE_ID
                    {
                    lv_name_11_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_11_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_11_0,
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


    // $ANTLR start "entryRuleProperty"
    // InternalXenia.g:268:1: entryRuleProperty returns [String current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final String entryRuleProperty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProperty = null;


        try {
            // InternalXenia.g:268:48: (iv_ruleProperty= ruleProperty EOF )
            // InternalXenia.g:269:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalXenia.g:275:1: ruleProperty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'with' | kw= 'sitemap' ) ;
    public final AntlrDatatypeRuleToken ruleProperty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXenia.g:281:2: ( (kw= 'with' | kw= 'sitemap' ) )
            // InternalXenia.g:282:2: (kw= 'with' | kw= 'sitemap' )
            {
            // InternalXenia.g:282:2: (kw= 'with' | kw= 'sitemap' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==19) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalXenia.g:283:3: kw= 'with'
                    {
                    kw=(Token)match(input,18,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPropertyAccess().getWithKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXenia.g:289:3: kw= 'sitemap'
                    {
                    kw=(Token)match(input,19,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPropertyAccess().getSitemapKeyword_1());
                    		

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
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleMappedEntity"
    // InternalXenia.g:298:1: entryRuleMappedEntity returns [EObject current=null] : iv_ruleMappedEntity= ruleMappedEntity EOF ;
    public final EObject entryRuleMappedEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMappedEntity = null;


        try {
            // InternalXenia.g:298:53: (iv_ruleMappedEntity= ruleMappedEntity EOF )
            // InternalXenia.g:299:2: iv_ruleMappedEntity= ruleMappedEntity EOF
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
    // InternalXenia.g:305:1: ruleMappedEntity returns [EObject current=null] : ( ( (lv_prop_0_0= ruleMappedProperty ) ) otherlv_1= ':' ( (lv_sites_2_0= ruleLinkedProperty ) )* ) ;
    public final EObject ruleMappedEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_prop_0_0 = null;

        EObject lv_sites_2_0 = null;



        	enterRule();

        try {
            // InternalXenia.g:311:2: ( ( ( (lv_prop_0_0= ruleMappedProperty ) ) otherlv_1= ':' ( (lv_sites_2_0= ruleLinkedProperty ) )* ) )
            // InternalXenia.g:312:2: ( ( (lv_prop_0_0= ruleMappedProperty ) ) otherlv_1= ':' ( (lv_sites_2_0= ruleLinkedProperty ) )* )
            {
            // InternalXenia.g:312:2: ( ( (lv_prop_0_0= ruleMappedProperty ) ) otherlv_1= ':' ( (lv_sites_2_0= ruleLinkedProperty ) )* )
            // InternalXenia.g:313:3: ( (lv_prop_0_0= ruleMappedProperty ) ) otherlv_1= ':' ( (lv_sites_2_0= ruleLinkedProperty ) )*
            {
            // InternalXenia.g:313:3: ( (lv_prop_0_0= ruleMappedProperty ) )
            // InternalXenia.g:314:4: (lv_prop_0_0= ruleMappedProperty )
            {
            // InternalXenia.g:314:4: (lv_prop_0_0= ruleMappedProperty )
            // InternalXenia.g:315:5: lv_prop_0_0= ruleMappedProperty
            {

            					newCompositeNode(grammarAccess.getMappedEntityAccess().getPropMappedPropertyParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_11);
            lv_prop_0_0=ruleMappedProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMappedEntityRule());
            					}
            					set(
            						current,
            						"prop",
            						lv_prop_0_0,
            						"com.foliage.xenia.Xenia.MappedProperty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getMappedEntityAccess().getColonKeyword_1());
            		
            // InternalXenia.g:336:3: ( (lv_sites_2_0= ruleLinkedProperty ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalXenia.g:337:4: (lv_sites_2_0= ruleLinkedProperty )
            	    {
            	    // InternalXenia.g:337:4: (lv_sites_2_0= ruleLinkedProperty )
            	    // InternalXenia.g:338:5: lv_sites_2_0= ruleLinkedProperty
            	    {

            	    					newCompositeNode(grammarAccess.getMappedEntityAccess().getSitesLinkedPropertyParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_sites_2_0=ruleLinkedProperty();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMappedEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sites",
            	    						lv_sites_2_0,
            	    						"com.foliage.xenia.Xenia.LinkedProperty");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleMappedEntity"


    // $ANTLR start "entryRuleSite"
    // InternalXenia.g:359:1: entryRuleSite returns [EObject current=null] : iv_ruleSite= ruleSite EOF ;
    public final EObject entryRuleSite() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSite = null;


        try {
            // InternalXenia.g:359:45: (iv_ruleSite= ruleSite EOF )
            // InternalXenia.g:360:2: iv_ruleSite= ruleSite EOF
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
    // InternalXenia.g:366:1: ruleSite returns [EObject current=null] : ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'modal' otherlv_6= '(' ( (lv_sites_7_0= ruleSite ) ) (otherlv_8= ',' ( (lv_sites_9_0= ruleSite ) ) )* otherlv_10= ')' ) ) ;
    public final EObject ruleSite() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_sites_7_0 = null;

        EObject lv_sites_9_0 = null;



        	enterRule();

        try {
            // InternalXenia.g:372:2: ( ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'modal' otherlv_6= '(' ( (lv_sites_7_0= ruleSite ) ) (otherlv_8= ',' ( (lv_sites_9_0= ruleSite ) ) )* otherlv_10= ')' ) ) )
            // InternalXenia.g:373:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'modal' otherlv_6= '(' ( (lv_sites_7_0= ruleSite ) ) (otherlv_8= ',' ( (lv_sites_9_0= ruleSite ) ) )* otherlv_10= ')' ) )
            {
            // InternalXenia.g:373:2: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) | (otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'modal' otherlv_6= '(' ( (lv_sites_7_0= ruleSite ) ) (otherlv_8= ',' ( (lv_sites_9_0= ruleSite ) ) )* otherlv_10= ')' ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==RULE_ID) ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2==18) ) {
                        alt8=2;
                    }
                    else if ( (LA8_2==EOF||(LA8_2>=15 && LA8_2<=16)||LA8_2==23) ) {
                        alt8=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalXenia.g:374:3: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
                    {
                    // InternalXenia.g:374:3: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
                    // InternalXenia.g:375:4: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) )
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_0, grammarAccess.getSiteAccess().getCommercialAtKeyword_0_0());
                    			
                    // InternalXenia.g:379:4: ( (lv_name_1_0= RULE_ID ) )
                    // InternalXenia.g:380:5: (lv_name_1_0= RULE_ID )
                    {
                    // InternalXenia.g:380:5: (lv_name_1_0= RULE_ID )
                    // InternalXenia.g:381:6: lv_name_1_0= RULE_ID
                    {
                    lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_1_0, grammarAccess.getSiteAccess().getNameIDTerminalRuleCall_0_1_0());
                    					

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
                    break;
                case 2 :
                    // InternalXenia.g:399:3: (otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'modal' otherlv_6= '(' ( (lv_sites_7_0= ruleSite ) ) (otherlv_8= ',' ( (lv_sites_9_0= ruleSite ) ) )* otherlv_10= ')' )
                    {
                    // InternalXenia.g:399:3: (otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'modal' otherlv_6= '(' ( (lv_sites_7_0= ruleSite ) ) (otherlv_8= ',' ( (lv_sites_9_0= ruleSite ) ) )* otherlv_10= ')' )
                    // InternalXenia.g:400:4: otherlv_2= '@' ( (lv_name_3_0= RULE_ID ) ) otherlv_4= 'with' otherlv_5= 'modal' otherlv_6= '(' ( (lv_sites_7_0= ruleSite ) ) (otherlv_8= ',' ( (lv_sites_9_0= ruleSite ) ) )* otherlv_10= ')'
                    {
                    otherlv_2=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getSiteAccess().getCommercialAtKeyword_1_0());
                    			
                    // InternalXenia.g:404:4: ( (lv_name_3_0= RULE_ID ) )
                    // InternalXenia.g:405:5: (lv_name_3_0= RULE_ID )
                    {
                    // InternalXenia.g:405:5: (lv_name_3_0= RULE_ID )
                    // InternalXenia.g:406:6: lv_name_3_0= RULE_ID
                    {
                    lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(lv_name_3_0, grammarAccess.getSiteAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSiteRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_4, grammarAccess.getSiteAccess().getWithKeyword_1_2());
                    			
                    otherlv_5=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_5, grammarAccess.getSiteAccess().getModalKeyword_1_3());
                    			
                    otherlv_6=(Token)match(input,22,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getSiteAccess().getLeftParenthesisKeyword_1_4());
                    			
                    // InternalXenia.g:434:4: ( (lv_sites_7_0= ruleSite ) )
                    // InternalXenia.g:435:5: (lv_sites_7_0= ruleSite )
                    {
                    // InternalXenia.g:435:5: (lv_sites_7_0= ruleSite )
                    // InternalXenia.g:436:6: lv_sites_7_0= ruleSite
                    {

                    						newCompositeNode(grammarAccess.getSiteAccess().getSitesSiteParserRuleCall_1_5_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_sites_7_0=ruleSite();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSiteRule());
                    						}
                    						add(
                    							current,
                    							"sites",
                    							lv_sites_7_0,
                    							"com.foliage.xenia.Xenia.Site");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXenia.g:453:4: (otherlv_8= ',' ( (lv_sites_9_0= ruleSite ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalXenia.g:454:5: otherlv_8= ',' ( (lv_sites_9_0= ruleSite ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_9); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getSiteAccess().getCommaKeyword_1_6_0());
                    	    				
                    	    // InternalXenia.g:458:5: ( (lv_sites_9_0= ruleSite ) )
                    	    // InternalXenia.g:459:6: (lv_sites_9_0= ruleSite )
                    	    {
                    	    // InternalXenia.g:459:6: (lv_sites_9_0= ruleSite )
                    	    // InternalXenia.g:460:7: lv_sites_9_0= ruleSite
                    	    {

                    	    							newCompositeNode(grammarAccess.getSiteAccess().getSitesSiteParserRuleCall_1_6_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_sites_9_0=ruleSite();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getSiteRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sites",
                    	    								lv_sites_9_0,
                    	    								"com.foliage.xenia.Xenia.Site");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getSiteAccess().getRightParenthesisKeyword_1_7());
                    			

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
    // $ANTLR end "ruleSite"


    // $ANTLR start "entryRuleMappedProperty"
    // InternalXenia.g:487:1: entryRuleMappedProperty returns [String current=null] : iv_ruleMappedProperty= ruleMappedProperty EOF ;
    public final String entryRuleMappedProperty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMappedProperty = null;


        try {
            // InternalXenia.g:487:54: (iv_ruleMappedProperty= ruleMappedProperty EOF )
            // InternalXenia.g:488:2: iv_ruleMappedProperty= ruleMappedProperty EOF
            {
             newCompositeNode(grammarAccess.getMappedPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMappedProperty=ruleMappedProperty();

            state._fsp--;

             current =iv_ruleMappedProperty.getText(); 
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
    // $ANTLR end "entryRuleMappedProperty"


    // $ANTLR start "ruleMappedProperty"
    // InternalXenia.g:494:1: ruleMappedProperty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'sites' | kw= 'map' ) ;
    public final AntlrDatatypeRuleToken ruleMappedProperty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXenia.g:500:2: ( (kw= 'sites' | kw= 'map' ) )
            // InternalXenia.g:501:2: (kw= 'sites' | kw= 'map' )
            {
            // InternalXenia.g:501:2: (kw= 'sites' | kw= 'map' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalXenia.g:502:3: kw= 'sites'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMappedPropertyAccess().getSitesKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXenia.g:508:3: kw= 'map'
                    {
                    kw=(Token)match(input,25,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getMappedPropertyAccess().getMapKeyword_1());
                    		

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
    // $ANTLR end "ruleMappedProperty"


    // $ANTLR start "entryRuleLinkedProperty"
    // InternalXenia.g:517:1: entryRuleLinkedProperty returns [EObject current=null] : iv_ruleLinkedProperty= ruleLinkedProperty EOF ;
    public final EObject entryRuleLinkedProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLinkedProperty = null;


        try {
            // InternalXenia.g:517:55: (iv_ruleLinkedProperty= ruleLinkedProperty EOF )
            // InternalXenia.g:518:2: iv_ruleLinkedProperty= ruleLinkedProperty EOF
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
    // InternalXenia.g:524:1: ruleLinkedProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_inner_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleLinkedProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_inner_name_2_0=null;


        	enterRule();

        try {
            // InternalXenia.g:530:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_inner_name_2_0= RULE_ID ) ) ) )
            // InternalXenia.g:531:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_inner_name_2_0= RULE_ID ) ) )
            {
            // InternalXenia.g:531:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_inner_name_2_0= RULE_ID ) ) )
            // InternalXenia.g:532:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '->' ( (lv_inner_name_2_0= RULE_ID ) )
            {
            // InternalXenia.g:532:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalXenia.g:533:4: (lv_name_0_0= RULE_ID )
            {
            // InternalXenia.g:533:4: (lv_name_0_0= RULE_ID )
            // InternalXenia.g:534:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLinkedPropertyAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkedPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLinkedPropertyAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalXenia.g:554:3: ( (lv_inner_name_2_0= RULE_ID ) )
            // InternalXenia.g:555:4: (lv_inner_name_2_0= RULE_ID )
            {
            // InternalXenia.g:555:4: (lv_inner_name_2_0= RULE_ID )
            // InternalXenia.g:556:5: lv_inner_name_2_0= RULE_ID
            {
            lv_inner_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_inner_name_2_0, grammarAccess.getLinkedPropertyAccess().getInner_nameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLinkedPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"inner_name",
            						lv_inner_name_2_0,
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
    // $ANTLR end "ruleLinkedProperty"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000030C0802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});

}
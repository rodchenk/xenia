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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "':'", "'app'", "'with'", "'sitemap'", "'sites'", "'map'", "'info'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // InternalXenia.g:71:1: ruleModel returns [EObject current=null] : ( (lv_entities_0_0= ruleEntity ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entities_0_0 = null;



        	enterRule();

        try {
            // InternalXenia.g:77:2: ( ( (lv_entities_0_0= ruleEntity ) )* )
            // InternalXenia.g:78:2: ( (lv_entities_0_0= ruleEntity ) )*
            {
            // InternalXenia.g:78:2: ( (lv_entities_0_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=12 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXenia.g:79:3: (lv_entities_0_0= ruleEntity )
            	    {
            	    // InternalXenia.g:79:3: (lv_entities_0_0= ruleEntity )
            	    // InternalXenia.g:80:4: lv_entities_0_0= ruleEntity
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0());
            	    			
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
    // InternalXenia.g:100:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalXenia.g:100:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalXenia.g:101:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalXenia.g:107:1: ruleEntity returns [EObject current=null] : ( ( ruleProperty otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) ) | ( () ruleXtendedProperty ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalXenia.g:113:2: ( ( ( ruleProperty otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) ) | ( () ruleXtendedProperty ) ) )
            // InternalXenia.g:114:2: ( ( ruleProperty otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) ) | ( () ruleXtendedProperty ) )
            {
            // InternalXenia.g:114:2: ( ( ruleProperty otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) ) | ( () ruleXtendedProperty ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=12 && LA2_0<=14)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=15 && LA2_0<=17)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalXenia.g:115:3: ( ruleProperty otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )
                    {
                    // InternalXenia.g:115:3: ( ruleProperty otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) )
                    // InternalXenia.g:116:4: ruleProperty otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) )
                    {

                    				newCompositeNode(grammarAccess.getEntityAccess().getPropertyParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_4);
                    ruleProperty();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_1=(Token)match(input,11,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getColonKeyword_0_1());
                    			
                    // InternalXenia.g:127:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalXenia.g:128:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalXenia.g:128:5: (lv_name_2_0= RULE_ID )
                    // InternalXenia.g:129:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEntityRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXenia.g:147:3: ( () ruleXtendedProperty )
                    {
                    // InternalXenia.g:147:3: ( () ruleXtendedProperty )
                    // InternalXenia.g:148:4: () ruleXtendedProperty
                    {
                    // InternalXenia.g:148:4: ()
                    // InternalXenia.g:149:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEntityAccess().getEntityAction_1_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getEntityAccess().getXtendedPropertyParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    ruleXtendedProperty();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

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
    // InternalXenia.g:167:1: entryRuleProperty returns [String current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final String entryRuleProperty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleProperty = null;


        try {
            // InternalXenia.g:167:48: (iv_ruleProperty= ruleProperty EOF )
            // InternalXenia.g:168:2: iv_ruleProperty= ruleProperty EOF
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
    // InternalXenia.g:174:1: ruleProperty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'app' | kw= 'with' | kw= 'sitemap' ) ;
    public final AntlrDatatypeRuleToken ruleProperty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXenia.g:180:2: ( (kw= 'app' | kw= 'with' | kw= 'sitemap' ) )
            // InternalXenia.g:181:2: (kw= 'app' | kw= 'with' | kw= 'sitemap' )
            {
            // InternalXenia.g:181:2: (kw= 'app' | kw= 'with' | kw= 'sitemap' )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalXenia.g:182:3: kw= 'app'
                    {
                    kw=(Token)match(input,12,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPropertyAccess().getAppKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXenia.g:188:3: kw= 'with'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPropertyAccess().getWithKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXenia.g:194:3: kw= 'sitemap'
                    {
                    kw=(Token)match(input,14,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getPropertyAccess().getSitemapKeyword_2());
                    		

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


    // $ANTLR start "entryRuleXtendedProperty"
    // InternalXenia.g:203:1: entryRuleXtendedProperty returns [String current=null] : iv_ruleXtendedProperty= ruleXtendedProperty EOF ;
    public final String entryRuleXtendedProperty() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleXtendedProperty = null;


        try {
            // InternalXenia.g:203:55: (iv_ruleXtendedProperty= ruleXtendedProperty EOF )
            // InternalXenia.g:204:2: iv_ruleXtendedProperty= ruleXtendedProperty EOF
            {
             newCompositeNode(grammarAccess.getXtendedPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXtendedProperty=ruleXtendedProperty();

            state._fsp--;

             current =iv_ruleXtendedProperty.getText(); 
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
    // $ANTLR end "entryRuleXtendedProperty"


    // $ANTLR start "ruleXtendedProperty"
    // InternalXenia.g:210:1: ruleXtendedProperty returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'sites' | kw= 'map' | kw= 'info' ) ;
    public final AntlrDatatypeRuleToken ruleXtendedProperty() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalXenia.g:216:2: ( (kw= 'sites' | kw= 'map' | kw= 'info' ) )
            // InternalXenia.g:217:2: (kw= 'sites' | kw= 'map' | kw= 'info' )
            {
            // InternalXenia.g:217:2: (kw= 'sites' | kw= 'map' | kw= 'info' )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt4=1;
                }
                break;
            case 16:
                {
                alt4=2;
                }
                break;
            case 17:
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
                    // InternalXenia.g:218:3: kw= 'sites'
                    {
                    kw=(Token)match(input,15,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXtendedPropertyAccess().getSitesKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXenia.g:224:3: kw= 'map'
                    {
                    kw=(Token)match(input,16,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXtendedPropertyAccess().getMapKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXenia.g:230:3: kw= 'info'
                    {
                    kw=(Token)match(input,17,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getXtendedPropertyAccess().getInfoKeyword_2());
                    		

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
    // $ANTLR end "ruleXtendedProperty"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000003F002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});

}
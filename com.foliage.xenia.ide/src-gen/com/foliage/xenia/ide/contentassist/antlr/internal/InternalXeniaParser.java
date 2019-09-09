package com.foliage.xenia.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.foliage.xenia.services.XeniaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXeniaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'app'", "'with'", "'sitemap'", "'sites'", "'map'", "'info'", "':'"
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

    	public void setGrammarAccess(XeniaGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalXenia.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalXenia.g:54:1: ( ruleModel EOF )
            // InternalXenia.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalXenia.g:62:1: ruleModel : ( ( rule__Model__EntitiesAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXenia.g:66:2: ( ( ( rule__Model__EntitiesAssignment )* ) )
            // InternalXenia.g:67:2: ( ( rule__Model__EntitiesAssignment )* )
            {
            // InternalXenia.g:67:2: ( ( rule__Model__EntitiesAssignment )* )
            // InternalXenia.g:68:3: ( rule__Model__EntitiesAssignment )*
            {
             before(grammarAccess.getModelAccess().getEntitiesAssignment()); 
            // InternalXenia.g:69:3: ( rule__Model__EntitiesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=16)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXenia.g:69:4: rule__Model__EntitiesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__EntitiesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getEntitiesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleEntity"
    // InternalXenia.g:78:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalXenia.g:79:1: ( ruleEntity EOF )
            // InternalXenia.g:80:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalXenia.g:87:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXenia.g:91:2: ( ( ( rule__Entity__Alternatives ) ) )
            // InternalXenia.g:92:2: ( ( rule__Entity__Alternatives ) )
            {
            // InternalXenia.g:92:2: ( ( rule__Entity__Alternatives ) )
            // InternalXenia.g:93:3: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // InternalXenia.g:94:3: ( rule__Entity__Alternatives )
            // InternalXenia.g:94:4: rule__Entity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleProperty"
    // InternalXenia.g:103:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalXenia.g:104:1: ( ruleProperty EOF )
            // InternalXenia.g:105:1: ruleProperty EOF
            {
             before(grammarAccess.getPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalXenia.g:112:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXenia.g:116:2: ( ( ( rule__Property__Alternatives ) ) )
            // InternalXenia.g:117:2: ( ( rule__Property__Alternatives ) )
            {
            // InternalXenia.g:117:2: ( ( rule__Property__Alternatives ) )
            // InternalXenia.g:118:3: ( rule__Property__Alternatives )
            {
             before(grammarAccess.getPropertyAccess().getAlternatives()); 
            // InternalXenia.g:119:3: ( rule__Property__Alternatives )
            // InternalXenia.g:119:4: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Property__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleXtendedProperty"
    // InternalXenia.g:128:1: entryRuleXtendedProperty : ruleXtendedProperty EOF ;
    public final void entryRuleXtendedProperty() throws RecognitionException {
        try {
            // InternalXenia.g:129:1: ( ruleXtendedProperty EOF )
            // InternalXenia.g:130:1: ruleXtendedProperty EOF
            {
             before(grammarAccess.getXtendedPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleXtendedProperty();

            state._fsp--;

             after(grammarAccess.getXtendedPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXtendedProperty"


    // $ANTLR start "ruleXtendedProperty"
    // InternalXenia.g:137:1: ruleXtendedProperty : ( ( rule__XtendedProperty__Alternatives ) ) ;
    public final void ruleXtendedProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXenia.g:141:2: ( ( ( rule__XtendedProperty__Alternatives ) ) )
            // InternalXenia.g:142:2: ( ( rule__XtendedProperty__Alternatives ) )
            {
            // InternalXenia.g:142:2: ( ( rule__XtendedProperty__Alternatives ) )
            // InternalXenia.g:143:3: ( rule__XtendedProperty__Alternatives )
            {
             before(grammarAccess.getXtendedPropertyAccess().getAlternatives()); 
            // InternalXenia.g:144:3: ( rule__XtendedProperty__Alternatives )
            // InternalXenia.g:144:4: rule__XtendedProperty__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__XtendedProperty__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getXtendedPropertyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXtendedProperty"


    // $ANTLR start "rule__Entity__Alternatives"
    // InternalXenia.g:152:1: rule__Entity__Alternatives : ( ( ( rule__Entity__Group_0__0 ) ) | ( ( rule__Entity__Group_1__0 ) ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXenia.g:156:1: ( ( ( rule__Entity__Group_0__0 ) ) | ( ( rule__Entity__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=11 && LA2_0<=13)) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=14 && LA2_0<=16)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalXenia.g:157:2: ( ( rule__Entity__Group_0__0 ) )
                    {
                    // InternalXenia.g:157:2: ( ( rule__Entity__Group_0__0 ) )
                    // InternalXenia.g:158:3: ( rule__Entity__Group_0__0 )
                    {
                     before(grammarAccess.getEntityAccess().getGroup_0()); 
                    // InternalXenia.g:159:3: ( rule__Entity__Group_0__0 )
                    // InternalXenia.g:159:4: rule__Entity__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXenia.g:163:2: ( ( rule__Entity__Group_1__0 ) )
                    {
                    // InternalXenia.g:163:2: ( ( rule__Entity__Group_1__0 ) )
                    // InternalXenia.g:164:3: ( rule__Entity__Group_1__0 )
                    {
                     before(grammarAccess.getEntityAccess().getGroup_1()); 
                    // InternalXenia.g:165:3: ( rule__Entity__Group_1__0 )
                    // InternalXenia.g:165:4: rule__Entity__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEntityAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Alternatives"


    // $ANTLR start "rule__Property__Alternatives"
    // InternalXenia.g:173:1: rule__Property__Alternatives : ( ( 'app' ) | ( 'with' ) | ( 'sitemap' ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXenia.g:177:1: ( ( 'app' ) | ( 'with' ) | ( 'sitemap' ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
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
                    // InternalXenia.g:178:2: ( 'app' )
                    {
                    // InternalXenia.g:178:2: ( 'app' )
                    // InternalXenia.g:179:3: 'app'
                    {
                     before(grammarAccess.getPropertyAccess().getAppKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPropertyAccess().getAppKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXenia.g:184:2: ( 'with' )
                    {
                    // InternalXenia.g:184:2: ( 'with' )
                    // InternalXenia.g:185:3: 'with'
                    {
                     before(grammarAccess.getPropertyAccess().getWithKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPropertyAccess().getWithKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXenia.g:190:2: ( 'sitemap' )
                    {
                    // InternalXenia.g:190:2: ( 'sitemap' )
                    // InternalXenia.g:191:3: 'sitemap'
                    {
                     before(grammarAccess.getPropertyAccess().getSitemapKeyword_2()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getPropertyAccess().getSitemapKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Alternatives"


    // $ANTLR start "rule__XtendedProperty__Alternatives"
    // InternalXenia.g:200:1: rule__XtendedProperty__Alternatives : ( ( 'sites' ) | ( 'map' ) | ( 'info' ) );
    public final void rule__XtendedProperty__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXenia.g:204:1: ( ( 'sites' ) | ( 'map' ) | ( 'info' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
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
                    // InternalXenia.g:205:2: ( 'sites' )
                    {
                    // InternalXenia.g:205:2: ( 'sites' )
                    // InternalXenia.g:206:3: 'sites'
                    {
                     before(grammarAccess.getXtendedPropertyAccess().getSitesKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getXtendedPropertyAccess().getSitesKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXenia.g:211:2: ( 'map' )
                    {
                    // InternalXenia.g:211:2: ( 'map' )
                    // InternalXenia.g:212:3: 'map'
                    {
                     before(grammarAccess.getXtendedPropertyAccess().getMapKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getXtendedPropertyAccess().getMapKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXenia.g:217:2: ( 'info' )
                    {
                    // InternalXenia.g:217:2: ( 'info' )
                    // InternalXenia.g:218:3: 'info'
                    {
                     before(grammarAccess.getXtendedPropertyAccess().getInfoKeyword_2()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getXtendedPropertyAccess().getInfoKeyword_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XtendedProperty__Alternatives"


    // $ANTLR start "rule__Entity__Group_0__0"
    // InternalXenia.g:227:1: rule__Entity__Group_0__0 : rule__Entity__Group_0__0__Impl rule__Entity__Group_0__1 ;
    public final void rule__Entity__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXenia.g:231:1: ( rule__Entity__Group_0__0__Impl rule__Entity__Group_0__1 )
            // InternalXenia.g:232:2: rule__Entity__Group_0__0__Impl rule__Entity__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_0__0"


    // $ANTLR start "rule__Entity__Group_0__0__Impl"
    // InternalXenia.g:239:1: rule__Entity__Group_0__0__Impl : ( ruleProperty ) ;
    public final void rule__Entity__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXenia.g:243:1: ( ( ruleProperty ) )
            // InternalXenia.g:244:1: ( ruleProperty )
            {
            // InternalXenia.g:244:1: ( ruleProperty )
            // InternalXenia.g:245:2: ruleProperty
            {
             before(grammarAccess.getEntityAccess().getPropertyParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getPropertyParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_0__0__Impl"


    // $ANTLR start "rule__Entity__Group_0__1"
    // InternalXenia.g:254:1: rule__Entity__Group_0__1 : rule__Entity__Group_0__1__Impl rule__Entity__Group_0__2 ;
    public final void rule__Entity__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXenia.g:258:1: ( rule__Entity__Group_0__1__Impl rule__Entity__Group_0__2 )
            // InternalXenia.g:259:2: rule__Entity__Group_0__1__Impl rule__Entity__Group_0__2
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_0__1"


    // $ANTLR start "rule__Entity__Group_0__1__Impl"
    // InternalXenia.g:266:1: rule__Entity__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Entity__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXenia.g:270:1: ( ( ':' ) )
            // InternalXenia.g:271:1: ( ':' )
            {
            // InternalXenia.g:271:1: ( ':' )
            // InternalXenia.g:272:2: ':'
            {
             before(grammarAccess.getEntityAccess().getColonKeyword_0_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_0__1__Impl"


    // $ANTLR start "rule__Entity__Group_0__2"
    // InternalXenia.g:281:1: rule__Entity__Group_0__2 : rule__Entity__Group_0__2__Impl ;
    public final void rule__Entity__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXenia.g:285:1: ( rule__Entity__Group_0__2__Impl )
            // InternalXenia.g:286:2: rule__Entity__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_0__2"


    // $ANTLR start "rule__Entity__Group_0__2__Impl"
    // InternalXenia.g:292:1: rule__Entity__Group_0__2__Impl : ( ( rule__Entity__NameAssignment_0_2 ) ) ;
    public final void rule__Entity__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXenia.g:296:1: ( ( ( rule__Entity__NameAssignment_0_2 ) ) )
            // InternalXenia.g:297:1: ( ( rule__Entity__NameAssignment_0_2 ) )
            {
            // InternalXenia.g:297:1: ( ( rule__Entity__NameAssignment_0_2 ) )
            // InternalXenia.g:298:2: ( rule__Entity__NameAssignment_0_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_0_2()); 
            // InternalXenia.g:299:2: ( rule__Entity__NameAssignment_0_2 )
            // InternalXenia.g:299:3: rule__Entity__NameAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_0__2__Impl"


    // $ANTLR start "rule__Entity__Group_1__0"
    // InternalXenia.g:308:1: rule__Entity__Group_1__0 : rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 ;
    public final void rule__Entity__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXenia.g:312:1: ( rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1 )
            // InternalXenia.g:313:2: rule__Entity__Group_1__0__Impl rule__Entity__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Entity__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1__0"


    // $ANTLR start "rule__Entity__Group_1__0__Impl"
    // InternalXenia.g:320:1: rule__Entity__Group_1__0__Impl : ( () ) ;
    public final void rule__Entity__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXenia.g:324:1: ( ( () ) )
            // InternalXenia.g:325:1: ( () )
            {
            // InternalXenia.g:325:1: ( () )
            // InternalXenia.g:326:2: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_1_0()); 
            // InternalXenia.g:327:2: ()
            // InternalXenia.g:327:3: 
            {
            }

             after(grammarAccess.getEntityAccess().getEntityAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1__0__Impl"


    // $ANTLR start "rule__Entity__Group_1__1"
    // InternalXenia.g:335:1: rule__Entity__Group_1__1 : rule__Entity__Group_1__1__Impl ;
    public final void rule__Entity__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXenia.g:339:1: ( rule__Entity__Group_1__1__Impl )
            // InternalXenia.g:340:2: rule__Entity__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1__1"


    // $ANTLR start "rule__Entity__Group_1__1__Impl"
    // InternalXenia.g:346:1: rule__Entity__Group_1__1__Impl : ( ruleXtendedProperty ) ;
    public final void rule__Entity__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXenia.g:350:1: ( ( ruleXtendedProperty ) )
            // InternalXenia.g:351:1: ( ruleXtendedProperty )
            {
            // InternalXenia.g:351:1: ( ruleXtendedProperty )
            // InternalXenia.g:352:2: ruleXtendedProperty
            {
             before(grammarAccess.getEntityAccess().getXtendedPropertyParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleXtendedProperty();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getXtendedPropertyParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group_1__1__Impl"


    // $ANTLR start "rule__Model__EntitiesAssignment"
    // InternalXenia.g:362:1: rule__Model__EntitiesAssignment : ( ruleEntity ) ;
    public final void rule__Model__EntitiesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXenia.g:366:1: ( ( ruleEntity ) )
            // InternalXenia.g:367:2: ( ruleEntity )
            {
            // InternalXenia.g:367:2: ( ruleEntity )
            // InternalXenia.g:368:3: ruleEntity
            {
             before(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getModelAccess().getEntitiesEntityParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__EntitiesAssignment"


    // $ANTLR start "rule__Entity__NameAssignment_0_2"
    // InternalXenia.g:377:1: rule__Entity__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXenia.g:381:1: ( ( RULE_ID ) )
            // InternalXenia.g:382:2: ( RULE_ID )
            {
            // InternalXenia.g:382:2: ( RULE_ID )
            // InternalXenia.g:383:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__NameAssignment_0_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000001F802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001F800L});

}
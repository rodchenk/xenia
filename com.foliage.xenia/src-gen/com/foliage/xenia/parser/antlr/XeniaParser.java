/*
 * generated by Xtext 2.17.0
 */
package com.foliage.xenia.parser.antlr;

import com.foliage.xenia.parser.antlr.internal.InternalXeniaParser;
import com.foliage.xenia.services.XeniaGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class XeniaParser extends AbstractAntlrParser {

	@Inject
	private XeniaGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalXeniaParser createParser(XtextTokenStream stream) {
		return new InternalXeniaParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public XeniaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(XeniaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
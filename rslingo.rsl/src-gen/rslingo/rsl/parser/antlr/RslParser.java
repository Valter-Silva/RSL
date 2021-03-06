/*
 * generated by Xtext
 */
package rslingo.rsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import rslingo.rsl.services.RslGrammarAccess;

public class RslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private RslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected rslingo.rsl.parser.antlr.internal.InternalRslParser createParser(XtextTokenStream stream) {
		return new rslingo.rsl.parser.antlr.internal.InternalRslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public RslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(RslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}

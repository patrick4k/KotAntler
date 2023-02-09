// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class talkLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		KEYWORD=10, ID=11, NUMBER=12, STRING=13, ENDL=14, COMMENT=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"KEYWORD", "ID", "NUMBER", "STRING", "DIGIT", "LETTER", "ENDL", "NL", 
			"COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'^'", "'*'", "'/'", "'+'", "'-'", "'('", "')'", "'!'", 
			null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "KEYWORD", 
			"ID", "NUMBER", "STRING", "ENDL", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public talkLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "talk.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0010\u0088\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tG\b\t\u0001"+
		"\n\u0004\nJ\b\n\u000b\n\f\nK\u0001\n\u0001\n\u0005\nP\b\n\n\n\f\nS\t\n"+
		"\u0001\u000b\u0004\u000bV\b\u000b\u000b\u000b\f\u000bW\u0001\u000b\u0001"+
		"\u000b\u0004\u000b\\\b\u000b\u000b\u000b\f\u000b]\u0003\u000b`\b\u000b"+
		"\u0001\f\u0001\f\u0005\fd\b\f\n\f\f\fg\t\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0003\u000en\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0004\u0010s\b\u0010\u000b\u0010\f\u0010t\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011{\b\u0011\n\u0011\f\u0011~\t\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0004\u0012\u0083\b\u0012\u000b\u0012\f"+
		"\u0012\u0084\u0001\u0012\u0001\u0012\u0001e\u0000\u0013\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u0000\u001d\u0000\u001f\u000e"+
		"!\u0000#\u000f%\u0010\u0001\u0000\u0004\u0001\u000009\u0002\u0000AZaz"+
		"\u0002\u0000\n\n\r\r\u0003\u0000\t\n\r\r  \u0090\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003)\u0001"+
		"\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u0007-\u0001\u0000\u0000"+
		"\u0000\t/\u0001\u0000\u0000\u0000\u000b1\u0001\u0000\u0000\u0000\r3\u0001"+
		"\u0000\u0000\u0000\u000f5\u0001\u0000\u0000\u0000\u00117\u0001\u0000\u0000"+
		"\u0000\u0013F\u0001\u0000\u0000\u0000\u0015I\u0001\u0000\u0000\u0000\u0017"+
		"U\u0001\u0000\u0000\u0000\u0019a\u0001\u0000\u0000\u0000\u001bj\u0001"+
		"\u0000\u0000\u0000\u001dm\u0001\u0000\u0000\u0000\u001fo\u0001\u0000\u0000"+
		"\u0000!r\u0001\u0000\u0000\u0000#v\u0001\u0000\u0000\u0000%\u0082\u0001"+
		"\u0000\u0000\u0000\'(\u0005=\u0000\u0000(\u0002\u0001\u0000\u0000\u0000"+
		")*\u0005^\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005*\u0000\u0000"+
		",\u0006\u0001\u0000\u0000\u0000-.\u0005/\u0000\u0000.\b\u0001\u0000\u0000"+
		"\u0000/0\u0005+\u0000\u00000\n\u0001\u0000\u0000\u000012\u0005-\u0000"+
		"\u00002\f\u0001\u0000\u0000\u000034\u0005(\u0000\u00004\u000e\u0001\u0000"+
		"\u0000\u000056\u0005)\u0000\u00006\u0010\u0001\u0000\u0000\u000078\u0005"+
		"!\u0000\u00008\u0012\u0001\u0000\u0000\u00009:\u0005t\u0000\u0000:;\u0005"+
		"r\u0000\u0000;<\u0005u\u0000\u0000<G\u0005e\u0000\u0000=>\u0005f\u0000"+
		"\u0000>?\u0005a\u0000\u0000?@\u0005l\u0000\u0000@A\u0005s\u0000\u0000"+
		"AG\u0005e\u0000\u0000BC\u0005n\u0000\u0000CD\u0005u\u0000\u0000DE\u0005"+
		"l\u0000\u0000EG\u0005l\u0000\u0000F9\u0001\u0000\u0000\u0000F=\u0001\u0000"+
		"\u0000\u0000FB\u0001\u0000\u0000\u0000G\u0014\u0001\u0000\u0000\u0000"+
		"HJ\u0003\u001d\u000e\u0000IH\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LQ\u0001\u0000"+
		"\u0000\u0000MP\u0003\u001d\u000e\u0000NP\u0003\u001b\r\u0000OM\u0001\u0000"+
		"\u0000\u0000ON\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001"+
		"\u0000\u0000\u0000QR\u0001\u0000\u0000\u0000R\u0016\u0001\u0000\u0000"+
		"\u0000SQ\u0001\u0000\u0000\u0000TV\u0003\u001b\r\u0000UT\u0001\u0000\u0000"+
		"\u0000VW\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000X_\u0001\u0000\u0000\u0000Y[\u0005.\u0000\u0000Z\\\u0003\u001b"+
		"\r\u0000[Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001"+
		"\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000"+
		"_Y\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`\u0018\u0001\u0000"+
		"\u0000\u0000ae\u0005\"\u0000\u0000bd\t\u0000\u0000\u0000cb\u0001\u0000"+
		"\u0000\u0000dg\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000ec\u0001"+
		"\u0000\u0000\u0000fh\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000"+
		"hi\u0005\"\u0000\u0000i\u001a\u0001\u0000\u0000\u0000jk\u0007\u0000\u0000"+
		"\u0000k\u001c\u0001\u0000\u0000\u0000ln\u0007\u0001\u0000\u0000ml\u0001"+
		"\u0000\u0000\u0000n\u001e\u0001\u0000\u0000\u0000op\u0005;\u0000\u0000"+
		"p \u0001\u0000\u0000\u0000qs\u0007\u0002\u0000\u0000rq\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000u\"\u0001\u0000\u0000\u0000vw\u0005/\u0000\u0000wx\u0005/"+
		"\u0000\u0000x|\u0001\u0000\u0000\u0000y{\b\u0002\u0000\u0000zy\u0001\u0000"+
		"\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0006\u0011\u0000\u0000\u0080$\u0001\u0000\u0000\u0000"+
		"\u0081\u0083\u0007\u0003\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000"+
		"\u0086\u0087\u0006\u0012\u0000\u0000\u0087&\u0001\u0000\u0000\u0000\r"+
		"\u0000FKOQW]_emt|\u0084\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
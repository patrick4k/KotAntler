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
		T__9=10, KEYWORD=11, ID=12, NUMBER=13, STRING=14, ENDL=15, COMMENT=16, 
		WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "KEYWORD", "ID", "NUMBER", "STRING", "DIGIT", "LETTER", "ENDL", 
			"NL", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'^'", "'-'", "'*'", "'/'", "'+'", "'|'", "'('", "')'", 
			"'!'", null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "KEYWORD", 
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
		"\u0004\u0000\u0011\u008c\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\nK\b\n\u0001\u000b\u0004\u000bN\b\u000b\u000b"+
		"\u000b\f\u000bO\u0001\u000b\u0001\u000b\u0005\u000bT\b\u000b\n\u000b\f"+
		"\u000bW\t\u000b\u0001\f\u0004\fZ\b\f\u000b\f\f\f[\u0001\f\u0001\f\u0004"+
		"\f`\b\f\u000b\f\f\fa\u0003\fd\b\f\u0001\r\u0001\r\u0005\rh\b\r\n\r\f\r"+
		"k\t\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0003\u000f"+
		"r\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011w\b\u0011\u000b"+
		"\u0011\f\u0011x\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u007f\b\u0012\n\u0012\f\u0012\u0082\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0004\u0013\u0087\b\u0013\u000b\u0013\f\u0013\u0088\u0001"+
		"\u0013\u0001\u0013\u0001i\u0000\u0014\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u0000\u001f\u0000!\u000f#\u0000"+
		"%\u0010\'\u0011\u0001\u0000\u0004\u0001\u000009\u0002\u0000AZaz\u0002"+
		"\u0000\n\n\r\r\u0003\u0000\t\n\r\r  \u0094\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000%\u0001"+
		"\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0001)\u0001\u0000"+
		"\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u0005-\u0001\u0000\u0000\u0000"+
		"\u0007/\u0001\u0000\u0000\u0000\t1\u0001\u0000\u0000\u0000\u000b3\u0001"+
		"\u0000\u0000\u0000\r5\u0001\u0000\u0000\u0000\u000f7\u0001\u0000\u0000"+
		"\u0000\u00119\u0001\u0000\u0000\u0000\u0013;\u0001\u0000\u0000\u0000\u0015"+
		"J\u0001\u0000\u0000\u0000\u0017M\u0001\u0000\u0000\u0000\u0019Y\u0001"+
		"\u0000\u0000\u0000\u001be\u0001\u0000\u0000\u0000\u001dn\u0001\u0000\u0000"+
		"\u0000\u001fq\u0001\u0000\u0000\u0000!s\u0001\u0000\u0000\u0000#v\u0001"+
		"\u0000\u0000\u0000%z\u0001\u0000\u0000\u0000\'\u0086\u0001\u0000\u0000"+
		"\u0000)*\u0005=\u0000\u0000*\u0002\u0001\u0000\u0000\u0000+,\u0005^\u0000"+
		"\u0000,\u0004\u0001\u0000\u0000\u0000-.\u0005-\u0000\u0000.\u0006\u0001"+
		"\u0000\u0000\u0000/0\u0005*\u0000\u00000\b\u0001\u0000\u0000\u000012\u0005"+
		"/\u0000\u00002\n\u0001\u0000\u0000\u000034\u0005+\u0000\u00004\f\u0001"+
		"\u0000\u0000\u000056\u0005|\u0000\u00006\u000e\u0001\u0000\u0000\u0000"+
		"78\u0005(\u0000\u00008\u0010\u0001\u0000\u0000\u00009:\u0005)\u0000\u0000"+
		":\u0012\u0001\u0000\u0000\u0000;<\u0005!\u0000\u0000<\u0014\u0001\u0000"+
		"\u0000\u0000=>\u0005t\u0000\u0000>?\u0005r\u0000\u0000?@\u0005u\u0000"+
		"\u0000@K\u0005e\u0000\u0000AB\u0005f\u0000\u0000BC\u0005a\u0000\u0000"+
		"CD\u0005l\u0000\u0000DE\u0005s\u0000\u0000EK\u0005e\u0000\u0000FG\u0005"+
		"n\u0000\u0000GH\u0005u\u0000\u0000HI\u0005l\u0000\u0000IK\u0005l\u0000"+
		"\u0000J=\u0001\u0000\u0000\u0000JA\u0001\u0000\u0000\u0000JF\u0001\u0000"+
		"\u0000\u0000K\u0016\u0001\u0000\u0000\u0000LN\u0003\u001f\u000f\u0000"+
		"ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000PU\u0001\u0000\u0000\u0000QT\u0003\u001f"+
		"\u000f\u0000RT\u0003\u001d\u000e\u0000SQ\u0001\u0000\u0000\u0000SR\u0001"+
		"\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000V\u0018\u0001\u0000\u0000\u0000WU\u0001\u0000"+
		"\u0000\u0000XZ\u0003\u001d\u000e\u0000YX\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\c\u0001\u0000\u0000\u0000]_\u0005.\u0000\u0000^`\u0003\u001d\u000e\u0000"+
		"_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000bd\u0001\u0000\u0000\u0000c]\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000d\u001a\u0001\u0000\u0000\u0000"+
		"ei\u0005\"\u0000\u0000fh\t\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000"+
		"hk\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000"+
		"\u0000jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005\"\u0000"+
		"\u0000m\u001c\u0001\u0000\u0000\u0000no\u0007\u0000\u0000\u0000o\u001e"+
		"\u0001\u0000\u0000\u0000pr\u0007\u0001\u0000\u0000qp\u0001\u0000\u0000"+
		"\u0000r \u0001\u0000\u0000\u0000st\u0005;\u0000\u0000t\"\u0001\u0000\u0000"+
		"\u0000uw\u0007\u0002\u0000\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000"+
		"\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y$\u0001"+
		"\u0000\u0000\u0000z{\u0005/\u0000\u0000{|\u0005/\u0000\u0000|\u0080\u0001"+
		"\u0000\u0000\u0000}\u007f\b\u0002\u0000\u0000~}\u0001\u0000\u0000\u0000"+
		"\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0001\u0000\u0000\u0000\u0081\u0083\u0001\u0000\u0000\u0000\u0082"+
		"\u0080\u0001\u0000\u0000\u0000\u0083\u0084\u0006\u0012\u0000\u0000\u0084"+
		"&\u0001\u0000\u0000\u0000\u0085\u0087\u0007\u0003\u0000\u0000\u0086\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u008b\u0006\u0013\u0000\u0000\u008b(\u0001"+
		"\u0000\u0000\u0000\r\u0000JOSU[aciqx\u0080\u0088\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
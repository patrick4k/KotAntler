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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, KEYWORD=19, ID=20, NUMBER=21, STRING=22, ENDL=23, IGNORE=24, 
		WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "KEYWORD", "ID", "NUMBER", "STRING", "DIGIT", "LETTER", "ENDL", 
			"NL", "IGNORE", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'!'", "'let'", "','", "'='", "'->'", "'{'", "'}'", "'?'", "':'", 
			"'-'", "'^'", "'*'", "'/'", "'+'", "'|'", "'('", "')'", "'`'", null, 
			null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "KEYWORD", "ID", "NUMBER", 
			"STRING", "ENDL", "IGNORE", "WS"
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
		"\u0004\u0000\u0019\u00c0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012p\b"+
		"\u0012\u0001\u0013\u0004\u0013s\b\u0013\u000b\u0013\f\u0013t\u0001\u0013"+
		"\u0001\u0013\u0005\u0013y\b\u0013\n\u0013\f\u0013|\t\u0013\u0001\u0014"+
		"\u0004\u0014\u007f\b\u0014\u000b\u0014\f\u0014\u0080\u0001\u0014\u0001"+
		"\u0014\u0004\u0014\u0085\b\u0014\u000b\u0014\f\u0014\u0086\u0003\u0014"+
		"\u0089\b\u0014\u0001\u0015\u0001\u0015\u0005\u0015\u008d\b\u0015\n\u0015"+
		"\f\u0015\u0090\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0003\u0017\u0097\b\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0004\u0019\u009c\b\u0019\u000b\u0019\f\u0019\u009d\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u00a8\b\u001b\n\u001b\f\u001b\u00ab\t\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u00b1\b\u001b\n\u001b"+
		"\f\u001b\u00b4\t\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u00b8\b\u001b"+
		"\u0001\u001c\u0004\u001c\u00bb\b\u001c\u000b\u001c\f\u001c\u00bc\u0001"+
		"\u001c\u0001\u001c\u0002\u008e\u00b2\u0000\u001d\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013"+
		"\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0000/\u00001\u00173\u00005\u0018"+
		"7\u00009\u0019\u0001\u0000\u0004\u0001\u000009\u0002\u0000AZaz\u0002\u0000"+
		"\n\n\r\r\u0003\u0000\t\n\r\r  \u00c9\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000"+
		"1\u0001\u0000\u0000\u0000\u00005\u0001\u0000\u0000\u0000\u00009\u0001"+
		"\u0000\u0000\u0000\u0001;\u0001\u0000\u0000\u0000\u0003=\u0001\u0000\u0000"+
		"\u0000\u0005A\u0001\u0000\u0000\u0000\u0007C\u0001\u0000\u0000\u0000\t"+
		"E\u0001\u0000\u0000\u0000\u000bH\u0001\u0000\u0000\u0000\rJ\u0001\u0000"+
		"\u0000\u0000\u000fL\u0001\u0000\u0000\u0000\u0011N\u0001\u0000\u0000\u0000"+
		"\u0013P\u0001\u0000\u0000\u0000\u0015R\u0001\u0000\u0000\u0000\u0017T"+
		"\u0001\u0000\u0000\u0000\u0019V\u0001\u0000\u0000\u0000\u001bX\u0001\u0000"+
		"\u0000\u0000\u001dZ\u0001\u0000\u0000\u0000\u001f\\\u0001\u0000\u0000"+
		"\u0000!^\u0001\u0000\u0000\u0000#`\u0001\u0000\u0000\u0000%o\u0001\u0000"+
		"\u0000\u0000\'r\u0001\u0000\u0000\u0000)~\u0001\u0000\u0000\u0000+\u008a"+
		"\u0001\u0000\u0000\u0000-\u0093\u0001\u0000\u0000\u0000/\u0096\u0001\u0000"+
		"\u0000\u00001\u0098\u0001\u0000\u0000\u00003\u009b\u0001\u0000\u0000\u0000"+
		"5\u009f\u0001\u0000\u0000\u00007\u00b7\u0001\u0000\u0000\u00009\u00ba"+
		"\u0001\u0000\u0000\u0000;<\u0005!\u0000\u0000<\u0002\u0001\u0000\u0000"+
		"\u0000=>\u0005l\u0000\u0000>?\u0005e\u0000\u0000?@\u0005t\u0000\u0000"+
		"@\u0004\u0001\u0000\u0000\u0000AB\u0005,\u0000\u0000B\u0006\u0001\u0000"+
		"\u0000\u0000CD\u0005=\u0000\u0000D\b\u0001\u0000\u0000\u0000EF\u0005-"+
		"\u0000\u0000FG\u0005>\u0000\u0000G\n\u0001\u0000\u0000\u0000HI\u0005{"+
		"\u0000\u0000I\f\u0001\u0000\u0000\u0000JK\u0005}\u0000\u0000K\u000e\u0001"+
		"\u0000\u0000\u0000LM\u0005?\u0000\u0000M\u0010\u0001\u0000\u0000\u0000"+
		"NO\u0005:\u0000\u0000O\u0012\u0001\u0000\u0000\u0000PQ\u0005-\u0000\u0000"+
		"Q\u0014\u0001\u0000\u0000\u0000RS\u0005^\u0000\u0000S\u0016\u0001\u0000"+
		"\u0000\u0000TU\u0005*\u0000\u0000U\u0018\u0001\u0000\u0000\u0000VW\u0005"+
		"/\u0000\u0000W\u001a\u0001\u0000\u0000\u0000XY\u0005+\u0000\u0000Y\u001c"+
		"\u0001\u0000\u0000\u0000Z[\u0005|\u0000\u0000[\u001e\u0001\u0000\u0000"+
		"\u0000\\]\u0005(\u0000\u0000] \u0001\u0000\u0000\u0000^_\u0005)\u0000"+
		"\u0000_\"\u0001\u0000\u0000\u0000`a\u0005`\u0000\u0000a$\u0001\u0000\u0000"+
		"\u0000bc\u0005t\u0000\u0000cd\u0005r\u0000\u0000de\u0005u\u0000\u0000"+
		"ep\u0005e\u0000\u0000fg\u0005f\u0000\u0000gh\u0005a\u0000\u0000hi\u0005"+
		"l\u0000\u0000ij\u0005s\u0000\u0000jp\u0005e\u0000\u0000kl\u0005n\u0000"+
		"\u0000lm\u0005u\u0000\u0000mn\u0005l\u0000\u0000np\u0005l\u0000\u0000"+
		"ob\u0001\u0000\u0000\u0000of\u0001\u0000\u0000\u0000ok\u0001\u0000\u0000"+
		"\u0000p&\u0001\u0000\u0000\u0000qs\u0003/\u0017\u0000rq\u0001\u0000\u0000"+
		"\u0000st\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000"+
		"\u0000\u0000uz\u0001\u0000\u0000\u0000vy\u0003/\u0017\u0000wy\u0003-\u0016"+
		"\u0000xv\u0001\u0000\u0000\u0000xw\u0001\u0000\u0000\u0000y|\u0001\u0000"+
		"\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{(\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}\u007f\u0003-\u0016\u0000"+
		"~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080~"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0088"+
		"\u0001\u0000\u0000\u0000\u0082\u0084\u0005.\u0000\u0000\u0083\u0085\u0003"+
		"-\u0016\u0000\u0084\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000"+
		"\u0000\u0000\u0087\u0089\u0001\u0000\u0000\u0000\u0088\u0082\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089*\u0001\u0000\u0000"+
		"\u0000\u008a\u008e\u0005\"\u0000\u0000\u008b\u008d\t\u0000\u0000\u0000"+
		"\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000"+
		"\u008e\u008f\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000"+
		"\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0005\"\u0000\u0000\u0092,\u0001\u0000\u0000\u0000\u0093"+
		"\u0094\u0007\u0000\u0000\u0000\u0094.\u0001\u0000\u0000\u0000\u0095\u0097"+
		"\u0007\u0001\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u00970\u0001"+
		"\u0000\u0000\u0000\u0098\u0099\u0005;\u0000\u0000\u00992\u0001\u0000\u0000"+
		"\u0000\u009a\u009c\u0007\u0002\u0000\u0000\u009b\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e4\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u00037\u001b\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0006\u001a\u0000\u0000\u00a26\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\u0005/\u0000\u0000\u00a4\u00a5\u0005/\u0000\u0000\u00a5\u00a9\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a8\b\u0002\u0000\u0000\u00a7\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00b8\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005/\u0000\u0000"+
		"\u00ad\u00ae\u0005*\u0000\u0000\u00ae\u00b2\u0001\u0000\u0000\u0000\u00af"+
		"\u00b1\t\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b2\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005*\u0000\u0000\u00b6\u00b8\u0005"+
		"/\u0000\u0000\u00b7\u00a3\u0001\u0000\u0000\u0000\u00b7\u00ac\u0001\u0000"+
		"\u0000\u0000\u00b88\u0001\u0000\u0000\u0000\u00b9\u00bb\u0007\u0003\u0000"+
		"\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u0006\u001c\u0000"+
		"\u0000\u00bf:\u0001\u0000\u0000\u0000\u000f\u0000otxz\u0080\u0086\u0088"+
		"\u008e\u0096\u009d\u00a9\u00b2\u00b7\u00bc\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		ID=10, NUMBER=11, NL=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"EXP", "MULT", "DIV", "ADD", "SUB", "ID", "NUMBER", "DIGIT", "LETTER", 
			"NL", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'!MULT!'", "'!DIV!'", "'!ADD!'", "'!SUB!'", "'('", "')'", 
			"'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "ID", "NUMBER", 
			"NL", "WS"
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
		"\u0004\u0000\r\u008e\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0004\u000em\b\u000e\u000b\u000e\f\u000en\u0001"+
		"\u000f\u0004\u000fr\b\u000f\u000b\u000f\f\u000fs\u0001\u000f\u0001\u000f"+
		"\u0004\u000fx\b\u000f\u000b\u000f\f\u000fy\u0003\u000f|\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0003\u0011\u0081\b\u0011\u0001\u0012\u0003"+
		"\u0012\u0084\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0004\u0013\u0089"+
		"\b\u0013\u000b\u0013\f\u0013\u008a\u0001\u0013\u0001\u0013\u0000\u0000"+
		"\u0014\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\u0000\u0015\u0000\u0017\u0000\u0019\u0000"+
		"\u001b\u0000\u001d\n\u001f\u000b!\u0000#\u0000%\f\'\r\u0001\u0000\u0003"+
		"\u0001\u000009\u0002\u0000AZaz\u0002\u0000\t\t  \u008c\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000"+
		"\u0001)\u0001\u0000\u0000\u0000\u0003+\u0001\u0000\u0000\u0000\u00052"+
		"\u0001\u0000\u0000\u0000\u00078\u0001\u0000\u0000\u0000\t>\u0001\u0000"+
		"\u0000\u0000\u000bD\u0001\u0000\u0000\u0000\rF\u0001\u0000\u0000\u0000"+
		"\u000fH\u0001\u0000\u0000\u0000\u0011J\u0001\u0000\u0000\u0000\u0013L"+
		"\u0001\u0000\u0000\u0000\u0015R\u0001\u0000\u0000\u0000\u0017Y\u0001\u0000"+
		"\u0000\u0000\u0019_\u0001\u0000\u0000\u0000\u001be\u0001\u0000\u0000\u0000"+
		"\u001dl\u0001\u0000\u0000\u0000\u001fq\u0001\u0000\u0000\u0000!}\u0001"+
		"\u0000\u0000\u0000#\u0080\u0001\u0000\u0000\u0000%\u0083\u0001\u0000\u0000"+
		"\u0000\'\u0088\u0001\u0000\u0000\u0000)*\u0005=\u0000\u0000*\u0002\u0001"+
		"\u0000\u0000\u0000+,\u0005!\u0000\u0000,-\u0005M\u0000\u0000-.\u0005U"+
		"\u0000\u0000./\u0005L\u0000\u0000/0\u0005T\u0000\u000001\u0005!\u0000"+
		"\u00001\u0004\u0001\u0000\u0000\u000023\u0005!\u0000\u000034\u0005D\u0000"+
		"\u000045\u0005I\u0000\u000056\u0005V\u0000\u000067\u0005!\u0000\u0000"+
		"7\u0006\u0001\u0000\u0000\u000089\u0005!\u0000\u00009:\u0005A\u0000\u0000"+
		":;\u0005D\u0000\u0000;<\u0005D\u0000\u0000<=\u0005!\u0000\u0000=\b\u0001"+
		"\u0000\u0000\u0000>?\u0005!\u0000\u0000?@\u0005S\u0000\u0000@A\u0005U"+
		"\u0000\u0000AB\u0005B\u0000\u0000BC\u0005!\u0000\u0000C\n\u0001\u0000"+
		"\u0000\u0000DE\u0005(\u0000\u0000E\f\u0001\u0000\u0000\u0000FG\u0005)"+
		"\u0000\u0000G\u000e\u0001\u0000\u0000\u0000HI\u0005<\u0000\u0000I\u0010"+
		"\u0001\u0000\u0000\u0000JK\u0005>\u0000\u0000K\u0012\u0001\u0000\u0000"+
		"\u0000LM\u0005!\u0000\u0000MN\u0005E\u0000\u0000NO\u0005X\u0000\u0000"+
		"OP\u0005P\u0000\u0000PQ\u0005!\u0000\u0000Q\u0014\u0001\u0000\u0000\u0000"+
		"RS\u0005!\u0000\u0000ST\u0005M\u0000\u0000TU\u0005U\u0000\u0000UV\u0005"+
		"L\u0000\u0000VW\u0005T\u0000\u0000WX\u0005!\u0000\u0000X\u0016\u0001\u0000"+
		"\u0000\u0000YZ\u0005!\u0000\u0000Z[\u0005D\u0000\u0000[\\\u0005I\u0000"+
		"\u0000\\]\u0005V\u0000\u0000]^\u0005!\u0000\u0000^\u0018\u0001\u0000\u0000"+
		"\u0000_`\u0005!\u0000\u0000`a\u0005A\u0000\u0000ab\u0005D\u0000\u0000"+
		"bc\u0005D\u0000\u0000cd\u0005!\u0000\u0000d\u001a\u0001\u0000\u0000\u0000"+
		"ef\u0005!\u0000\u0000fg\u0005S\u0000\u0000gh\u0005U\u0000\u0000hi\u0005"+
		"B\u0000\u0000ij\u0005!\u0000\u0000j\u001c\u0001\u0000\u0000\u0000km\u0003"+
		"#\u0011\u0000lk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000o\u001e\u0001\u0000\u0000"+
		"\u0000pr\u0003!\u0010\u0000qp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t{\u0001\u0000"+
		"\u0000\u0000uw\u0005.\u0000\u0000vx\u0003!\u0010\u0000wv\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z|\u0001\u0000\u0000\u0000{u\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000| \u0001\u0000\u0000\u0000}~\u0007\u0000\u0000\u0000"+
		"~\"\u0001\u0000\u0000\u0000\u007f\u0081\u0007\u0001\u0000\u0000\u0080"+
		"\u007f\u0001\u0000\u0000\u0000\u0081$\u0001\u0000\u0000\u0000\u0082\u0084"+
		"\u0005\r\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0083\u0084\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u0086\u0005"+
		"\n\u0000\u0000\u0086&\u0001\u0000\u0000\u0000\u0087\u0089\u0007\u0002"+
		"\u0000\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0006\u0013"+
		"\u0000\u0000\u008d(\u0001\u0000\u0000\u0000\b\u0000nsy{\u0080\u0083\u008a"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
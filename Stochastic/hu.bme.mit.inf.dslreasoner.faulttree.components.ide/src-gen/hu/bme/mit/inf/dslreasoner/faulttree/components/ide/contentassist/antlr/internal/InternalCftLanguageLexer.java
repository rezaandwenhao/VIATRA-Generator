package hu.bme.mit.inf.dslreasoner.faulttree.components.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCftLanguageLexer extends Lexer {
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int RULE_T_DOUBLE=7;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_OF_INT=5;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators

    public InternalCftLanguageLexer() {;} 
    public InternalCftLanguageLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCftLanguageLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCftLanguage.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:11:7: ( ':=' )
            // InternalCftLanguage.g:11:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:12:7: ( 'package' )
            // InternalCftLanguage.g:12:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:13:7: ( ';' )
            // InternalCftLanguage.g:13:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:14:7: ( 'import' )
            // InternalCftLanguage.g:14:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:15:7: ( 'cft' )
            // InternalCftLanguage.g:15:9: 'cft'
            {
            match("cft"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:16:7: ( '{' )
            // InternalCftLanguage.g:16:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:17:7: ( '}' )
            // InternalCftLanguage.g:17:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:18:7: ( 'in' )
            // InternalCftLanguage.g:18:9: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:19:7: ( 'out' )
            // InternalCftLanguage.g:19:9: 'out'
            {
            match("out"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:20:7: ( 'p' )
            // InternalCftLanguage.g:20:9: 'p'
            {
            match('p'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:21:7: ( '=' )
            // InternalCftLanguage.g:21:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:22:7: ( 'lambda' )
            // InternalCftLanguage.g:22:9: 'lambda'
            {
            match("lambda"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:23:7: ( 'and' )
            // InternalCftLanguage.g:23:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:24:7: ( 'or' )
            // InternalCftLanguage.g:24:9: 'or'
            {
            match("or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:25:7: ( 'of' )
            // InternalCftLanguage.g:25:9: 'of'
            {
            match("of"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:26:7: ( 'transformation' )
            // InternalCftLanguage.g:26:9: 'transformation'
            {
            match("transformation"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:27:7: ( 'mapping' )
            // InternalCftLanguage.g:27:9: 'mapping'
            {
            match("mapping"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:28:7: ( '(' )
            // InternalCftLanguage.g:28:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:29:7: ( ')' )
            // InternalCftLanguage.g:29:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:30:7: ( ',' )
            // InternalCftLanguage.g:30:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:31:7: ( 'lookup' )
            // InternalCftLanguage.g:31:9: 'lookup'
            {
            match("lookup"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:32:7: ( 'as' )
            // InternalCftLanguage.g:32:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:33:7: ( '.' )
            // InternalCftLanguage.g:33:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:34:7: ( '=>' )
            // InternalCftLanguage.g:34:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:35:7: ( '*' )
            // InternalCftLanguage.g:35:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:36:7: ( '[]' )
            // InternalCftLanguage.g:36:9: '[]'
            {
            match("[]"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:37:7: ( 'toplevel' )
            // InternalCftLanguage.g:37:9: 'toplevel'
            {
            match("toplevel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:38:7: ( '+=' )
            // InternalCftLanguage.g:38:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "RULE_OF_INT"
    public final void mRULE_OF_INT() throws RecognitionException {
        try {
            int _type = RULE_OF_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:4145:13: ( 'o' 'f' ( '0' .. '9' )+ )
            // InternalCftLanguage.g:4145:15: 'o' 'f' ( '0' .. '9' )+
            {
            match('o'); 
            match('f'); 
            // InternalCftLanguage.g:4145:23: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCftLanguage.g:4145:24: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OF_INT"

    // $ANTLR start "RULE_T_DOUBLE"
    public final void mRULE_T_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_T_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:4147:15: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ | ( '.' ( '0' .. '9' )+ )? ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ ) )
            // InternalCftLanguage.g:4147:17: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ | ( '.' ( '0' .. '9' )+ )? ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            {
            // InternalCftLanguage.g:4147:17: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCftLanguage.g:4147:18: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            // InternalCftLanguage.g:4147:29: ( '.' ( '0' .. '9' )+ | ( '.' ( '0' .. '9' )+ )? ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalCftLanguage.g:4147:30: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // InternalCftLanguage.g:4147:34: ( '0' .. '9' )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalCftLanguage.g:4147:35: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // InternalCftLanguage.g:4147:46: ( '.' ( '0' .. '9' )+ )? ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
                    {
                    // InternalCftLanguage.g:4147:46: ( '.' ( '0' .. '9' )+ )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0=='.') ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalCftLanguage.g:4147:47: '.' ( '0' .. '9' )+
                            {
                            match('.'); 
                            // InternalCftLanguage.g:4147:51: ( '0' .. '9' )+
                            int cnt4=0;
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // InternalCftLanguage.g:4147:52: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt4 >= 1 ) break loop4;
                                        EarlyExitException eee =
                                            new EarlyExitException(4, input);
                                        throw eee;
                                }
                                cnt4++;
                            } while (true);


                            }
                            break;

                    }

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalCftLanguage.g:4147:75: ( '+' | '-' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='+'||LA6_0=='-') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalCftLanguage.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // InternalCftLanguage.g:4147:86: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalCftLanguage.g:4147:87: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_T_DOUBLE"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:4149:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCftLanguage.g:4149:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCftLanguage.g:4149:11: ( '^' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='^') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCftLanguage.g:4149:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalCftLanguage.g:4149:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')||(LA10_0>='A' && LA10_0<='Z')||LA10_0=='_'||(LA10_0>='a' && LA10_0<='z')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalCftLanguage.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:4151:10: ( ( '0' .. '9' )+ )
            // InternalCftLanguage.g:4151:12: ( '0' .. '9' )+
            {
            // InternalCftLanguage.g:4151:12: ( '0' .. '9' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCftLanguage.g:4151:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:4153:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCftLanguage.g:4153:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCftLanguage.g:4153:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\"') ) {
                alt14=1;
            }
            else if ( (LA14_0=='\'') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalCftLanguage.g:4153:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCftLanguage.g:4153:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='!')||(LA12_0>='#' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalCftLanguage.g:4153:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCftLanguage.g:4153:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCftLanguage.g:4153:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCftLanguage.g:4153:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='&')||(LA13_0>='(' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalCftLanguage.g:4153:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCftLanguage.g:4153:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:4155:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCftLanguage.g:4155:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCftLanguage.g:4155:24: ( options {greedy=false; } : . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='*') ) {
                    int LA15_1 = input.LA(2);

                    if ( (LA15_1=='/') ) {
                        alt15=2;
                    }
                    else if ( ((LA15_1>='\u0000' && LA15_1<='.')||(LA15_1>='0' && LA15_1<='\uFFFF')) ) {
                        alt15=1;
                    }


                }
                else if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCftLanguage.g:4155:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:4157:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCftLanguage.g:4157:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCftLanguage.g:4157:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\u0000' && LA16_0<='\t')||(LA16_0>='\u000B' && LA16_0<='\f')||(LA16_0>='\u000E' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCftLanguage.g:4157:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalCftLanguage.g:4157:40: ( ( '\\r' )? '\\n' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\n'||LA18_0=='\r') ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCftLanguage.g:4157:41: ( '\\r' )? '\\n'
                    {
                    // InternalCftLanguage.g:4157:41: ( '\\r' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0=='\r') ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalCftLanguage.g:4157:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:4159:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCftLanguage.g:4159:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCftLanguage.g:4159:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalCftLanguage.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCftLanguage.g:4161:16: ( . )
            // InternalCftLanguage.g:4161:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalCftLanguage.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_OF_INT | RULE_T_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt20=37;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // InternalCftLanguage.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalCftLanguage.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalCftLanguage.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalCftLanguage.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalCftLanguage.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalCftLanguage.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalCftLanguage.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalCftLanguage.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalCftLanguage.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalCftLanguage.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalCftLanguage.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalCftLanguage.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalCftLanguage.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalCftLanguage.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalCftLanguage.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalCftLanguage.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalCftLanguage.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalCftLanguage.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalCftLanguage.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalCftLanguage.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalCftLanguage.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalCftLanguage.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalCftLanguage.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalCftLanguage.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalCftLanguage.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalCftLanguage.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalCftLanguage.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalCftLanguage.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalCftLanguage.g:1:178: RULE_OF_INT
                {
                mRULE_OF_INT(); 

                }
                break;
            case 30 :
                // InternalCftLanguage.g:1:190: RULE_T_DOUBLE
                {
                mRULE_T_DOUBLE(); 

                }
                break;
            case 31 :
                // InternalCftLanguage.g:1:204: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 32 :
                // InternalCftLanguage.g:1:212: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 33 :
                // InternalCftLanguage.g:1:221: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 34 :
                // InternalCftLanguage.g:1:233: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 35 :
                // InternalCftLanguage.g:1:249: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 36 :
                // InternalCftLanguage.g:1:265: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 37 :
                // InternalCftLanguage.g:1:273: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA8_eotS =
        "\3\uffff\1\4\1\uffff";
    static final String DFA8_eofS =
        "\5\uffff";
    static final String DFA8_minS =
        "\1\56\1\60\1\uffff\1\60\1\uffff";
    static final String DFA8_maxS =
        "\1\145\1\71\1\uffff\1\145\1\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\1\uffff\1\1";
    static final String DFA8_specialS =
        "\5\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\26\uffff\1\2\37\uffff\1\2",
            "\12\3",
            "",
            "\12\3\13\uffff\1\2\37\uffff\1\2",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "4147:29: ( '.' ( '0' .. '9' )+ | ( '.' ( '0' .. '9' )+ )? ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )";
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\1\34\1\37\1\uffff\2\40\2\uffff\1\40\1\53\4\40\5\uffff\2\34\1\72\1\34\1\uffff\3\34\3\uffff\1\40\3\uffff\1\40\1\103\1\40\2\uffff\1\40\1\106\1\110\2\uffff\3\40\1\114\3\40\10\uffff\1\72\5\uffff\2\40\1\uffff\1\122\1\123\1\uffff\1\124\1\uffff\2\40\1\127\1\uffff\5\40\3\uffff\2\40\1\uffff\13\40\1\152\1\153\1\154\3\40\1\160\3\uffff\2\40\1\163\1\uffff\1\40\1\165\1\uffff\1\40\1\uffff\4\40\1\173\1\uffff";
    static final String DFA20_eofS =
        "\174\uffff";
    static final String DFA20_minS =
        "\1\0\1\75\1\60\1\uffff\1\155\1\146\2\uffff\1\146\1\76\1\141\1\156\1\157\1\141\5\uffff\1\135\1\75\1\56\1\101\1\uffff\2\0\1\52\3\uffff\1\143\3\uffff\1\160\1\60\1\164\2\uffff\1\164\2\60\2\uffff\1\155\1\157\1\144\1\60\1\141\2\160\10\uffff\1\56\5\uffff\1\153\1\157\1\uffff\2\60\1\uffff\1\60\1\uffff\1\142\1\153\1\60\1\uffff\1\156\1\154\1\160\1\141\1\162\3\uffff\1\144\1\165\1\uffff\1\163\1\145\1\151\1\147\1\164\1\141\1\160\1\146\1\166\1\156\1\145\3\60\1\157\1\145\1\147\1\60\3\uffff\1\162\1\154\1\60\1\uffff\1\155\1\60\1\uffff\1\141\1\uffff\1\164\1\151\1\157\1\156\1\60\1\uffff";
    static final String DFA20_maxS =
        "\1\uffff\1\75\1\172\1\uffff\1\156\1\146\2\uffff\1\165\1\76\1\157\1\163\1\162\1\141\5\uffff\1\135\1\75\1\145\1\172\1\uffff\2\uffff\1\57\3\uffff\1\143\3\uffff\1\160\1\172\1\164\2\uffff\1\164\2\172\2\uffff\1\155\1\157\1\144\1\172\1\141\2\160\10\uffff\1\145\5\uffff\1\153\1\157\1\uffff\2\172\1\uffff\1\172\1\uffff\1\142\1\153\1\172\1\uffff\1\156\1\154\1\160\1\141\1\162\3\uffff\1\144\1\165\1\uffff\1\163\1\145\1\151\1\147\1\164\1\141\1\160\1\146\1\166\1\156\1\145\3\172\1\157\1\145\1\147\1\172\3\uffff\1\162\1\154\1\172\1\uffff\1\155\1\172\1\uffff\1\141\1\uffff\1\164\1\151\1\157\1\156\1\172\1\uffff";
    static final String DFA20_acceptS =
        "\3\uffff\1\3\2\uffff\1\6\1\7\6\uffff\1\22\1\23\1\24\1\27\1\31\4\uffff\1\37\3\uffff\1\44\1\45\1\1\1\uffff\1\12\1\37\1\3\3\uffff\1\6\1\7\3\uffff\1\30\1\13\7\uffff\1\22\1\23\1\24\1\27\1\31\1\32\1\34\1\40\1\uffff\1\36\1\41\1\42\1\43\1\44\2\uffff\1\10\2\uffff\1\16\1\uffff\1\17\3\uffff\1\26\5\uffff\1\5\1\11\1\35\2\uffff\1\15\22\uffff\1\4\1\14\1\25\3\uffff\1\2\2\uffff\1\21\1\uffff\1\33\5\uffff\1\20";
    static final String DFA20_specialS =
        "\1\2\27\uffff\1\1\1\0\142\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\34\2\33\2\34\1\33\22\34\1\33\1\34\1\30\4\34\1\31\1\16\1\17\1\22\1\24\1\20\1\34\1\21\1\32\12\25\1\1\1\3\1\34\1\11\3\34\32\27\1\23\2\34\1\26\1\27\1\34\1\13\1\27\1\5\5\27\1\4\2\27\1\12\1\15\1\27\1\10\1\2\3\27\1\14\6\27\1\6\1\34\1\7\uff82\34",
            "\1\35",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\1\36\31\40",
            "",
            "\1\42\1\43",
            "\1\44",
            "",
            "",
            "\1\51\13\uffff\1\50\2\uffff\1\47",
            "\1\52",
            "\1\54\15\uffff\1\55",
            "\1\56\4\uffff\1\57",
            "\1\61\2\uffff\1\60",
            "\1\62",
            "",
            "",
            "",
            "",
            "",
            "\1\70",
            "\1\71",
            "\1\74\1\uffff\12\73\13\uffff\1\74\37\uffff\1\74",
            "\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\0\75",
            "\0\75",
            "\1\76\4\uffff\1\77",
            "",
            "",
            "",
            "\1\101",
            "",
            "",
            "",
            "\1\102",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\104",
            "",
            "",
            "\1\105",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\107\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\115",
            "\1\116",
            "\1\117",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74\1\uffff\12\73\13\uffff\1\74\37\uffff\1\74",
            "",
            "",
            "",
            "",
            "",
            "\1\120",
            "\1\121",
            "",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\12\107\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\125",
            "\1\126",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "",
            "",
            "\1\135",
            "\1\136",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "\1\155",
            "\1\156",
            "\1\157",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "",
            "",
            "\1\161",
            "\1\162",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\164",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            "",
            "\1\166",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\40\7\uffff\32\40\4\uffff\1\40\1\uffff\32\40",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | RULE_OF_INT | RULE_T_DOUBLE | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_25 = input.LA(1);

                        s = -1;
                        if ( ((LA20_25>='\u0000' && LA20_25<='\uFFFF')) ) {s = 61;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_24 = input.LA(1);

                        s = -1;
                        if ( ((LA20_24>='\u0000' && LA20_24<='\uFFFF')) ) {s = 61;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0==':') ) {s = 1;}

                        else if ( (LA20_0=='p') ) {s = 2;}

                        else if ( (LA20_0==';') ) {s = 3;}

                        else if ( (LA20_0=='i') ) {s = 4;}

                        else if ( (LA20_0=='c') ) {s = 5;}

                        else if ( (LA20_0=='{') ) {s = 6;}

                        else if ( (LA20_0=='}') ) {s = 7;}

                        else if ( (LA20_0=='o') ) {s = 8;}

                        else if ( (LA20_0=='=') ) {s = 9;}

                        else if ( (LA20_0=='l') ) {s = 10;}

                        else if ( (LA20_0=='a') ) {s = 11;}

                        else if ( (LA20_0=='t') ) {s = 12;}

                        else if ( (LA20_0=='m') ) {s = 13;}

                        else if ( (LA20_0=='(') ) {s = 14;}

                        else if ( (LA20_0==')') ) {s = 15;}

                        else if ( (LA20_0==',') ) {s = 16;}

                        else if ( (LA20_0=='.') ) {s = 17;}

                        else if ( (LA20_0=='*') ) {s = 18;}

                        else if ( (LA20_0=='[') ) {s = 19;}

                        else if ( (LA20_0=='+') ) {s = 20;}

                        else if ( ((LA20_0>='0' && LA20_0<='9')) ) {s = 21;}

                        else if ( (LA20_0=='^') ) {s = 22;}

                        else if ( ((LA20_0>='A' && LA20_0<='Z')||LA20_0=='_'||LA20_0=='b'||(LA20_0>='d' && LA20_0<='h')||(LA20_0>='j' && LA20_0<='k')||LA20_0=='n'||(LA20_0>='q' && LA20_0<='s')||(LA20_0>='u' && LA20_0<='z')) ) {s = 23;}

                        else if ( (LA20_0=='\"') ) {s = 24;}

                        else if ( (LA20_0=='\'') ) {s = 25;}

                        else if ( (LA20_0=='/') ) {s = 26;}

                        else if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {s = 27;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||(LA20_0>='\u000B' && LA20_0<='\f')||(LA20_0>='\u000E' && LA20_0<='\u001F')||LA20_0=='!'||(LA20_0>='#' && LA20_0<='&')||LA20_0=='-'||LA20_0=='<'||(LA20_0>='>' && LA20_0<='@')||(LA20_0>='\\' && LA20_0<=']')||LA20_0=='`'||LA20_0=='|'||(LA20_0>='~' && LA20_0<='\uFFFF')) ) {s = 28;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
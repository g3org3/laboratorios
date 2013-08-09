// $ANTLR 3.4 ../../laboratorios/lab05/scanner/Lab05Scanner.g 2013-08-09 16:28:00

  package laboratorios.lab05.scanner;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Lab05Scanner extends Lexer {
    public static final int EOF=-1;
    public static final int DIGIT=4;
    public static final int LBRACE=5;
    public static final int LETRA=6;
    public static final int RBRACE=7;
    public static final int WHITESPACE=8;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public Lab05Scanner() {} 
    public Lab05Scanner(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Lab05Scanner(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "../../laboratorios/lab05/scanner/Lab05Scanner.g"; }

    // $ANTLR start "WHITESPACE"
    public final void mWHITESPACE() throws RecognitionException {
        try {
            int _type = WHITESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../laboratorios/lab05/scanner/Lab05Scanner.g:8:13: ( ( '\\t' | ' ' | '\\r' | '\\n' )+ )
            // ../../laboratorios/lab05/scanner/Lab05Scanner.g:8:17: ( '\\t' | ' ' | '\\r' | '\\n' )+
            {
            // ../../laboratorios/lab05/scanner/Lab05Scanner.g:8:17: ( '\\t' | ' ' | '\\r' | '\\n' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '\t' && LA1_0 <= '\n')||LA1_0=='\r'||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../../laboratorios/lab05/scanner/Lab05Scanner.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHITESPACE"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // ../../laboratorios/lab05/scanner/Lab05Scanner.g:15:16: ( '0' .. '9' )
            // ../../laboratorios/lab05/scanner/Lab05Scanner.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "LETRA"
    public final void mLETRA() throws RecognitionException {
        try {
            // ../../laboratorios/lab05/scanner/Lab05Scanner.g:16:16: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            // ../../laboratorios/lab05/scanner/Lab05Scanner.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETRA"

    // $ANTLR start "LBRACE"
    public final void mLBRACE() throws RecognitionException {
        try {
            int _type = LBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../laboratorios/lab05/scanner/Lab05Scanner.g:18:10: ( ( '{' ) )
            // ../../laboratorios/lab05/scanner/Lab05Scanner.g:18:11: ( '{' )
            {
            // ../../laboratorios/lab05/scanner/Lab05Scanner.g:18:11: ( '{' )
            // ../../laboratorios/lab05/scanner/Lab05Scanner.g:18:12: '{'
            {
            match('{'); 

            }


            System.out.println("LBRACE");

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LBRACE"

    // $ANTLR start "RBRACE"
    public final void mRBRACE() throws RecognitionException {
        try {
            int _type = RBRACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../../laboratorios/lab05/scanner/Lab05Scanner.g:19:10: ( ( '}' ) )
            // ../../laboratorios/lab05/scanner/Lab05Scanner.g:19:11: ( '}' )
            {
            // ../../laboratorios/lab05/scanner/Lab05Scanner.g:19:11: ( '}' )
            // ../../laboratorios/lab05/scanner/Lab05Scanner.g:19:12: '}'
            {
            match('}'); 

            }


            System.out.println("RBRACE");

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RBRACE"

    public void mTokens() throws RecognitionException {
        // ../../laboratorios/lab05/scanner/Lab05Scanner.g:1:8: ( WHITESPACE | LBRACE | RBRACE )
        int alt2=3;
        switch ( input.LA(1) ) {
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt2=1;
            }
            break;
        case '{':
            {
            alt2=2;
            }
            break;
        case '}':
            {
            alt2=3;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 2, 0, input);

            throw nvae;

        }

        switch (alt2) {
            case 1 :
                // ../../laboratorios/lab05/scanner/Lab05Scanner.g:1:10: WHITESPACE
                {
                mWHITESPACE(); 


                }
                break;
            case 2 :
                // ../../laboratorios/lab05/scanner/Lab05Scanner.g:1:21: LBRACE
                {
                mLBRACE(); 


                }
                break;
            case 3 :
                // ../../laboratorios/lab05/scanner/Lab05Scanner.g:1:28: RBRACE
                {
                mRBRACE(); 


                }
                break;

        }

    }


 

}
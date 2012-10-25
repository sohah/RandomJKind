// $ANTLR 3.4 Lustre.g 2012-10-24 11:44:48

  package jkind.lustre;
  
  import java.math.BigDecimal;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LustreParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ERROR", "ID", "INT", "ML_COMMENT", "SL_COMMENT", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'--%PROPERTY'", "'->'", "'/'", "':'", "';'", "'<'", "'<='", "'<>'", "'='", "'=>'", "'>'", "'>='", "'and'", "'bool'", "'else'", "'false'", "'if'", "'int'", "'let'", "'node'", "'not'", "'or'", "'pre'", "'real'", "'returns'", "'tel'", "'then'", "'true'", "'var'", "'xor'"
    };

    public static final int EOF=-1;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__19=19;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int ERROR=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int ML_COMMENT=7;
    public static final int SL_COMMENT=8;
    public static final int WS=9;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public LustreParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public LustreParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return LustreParser.tokenNames; }
    public String getGrammarFileName() { return "Lustre.g"; }


      protected void ignore(Stack<Void> stack, List<Void> list, ArrayList<Void> arraylist) {}



    // $ANTLR start "node"
    // Lustre.g:25:1: node returns [Node n] : 'node' ID '(' inputs= varDeclList ')' 'returns' '(' outputs= varDeclList ')' ';' ( 'var' vars= varDeclList ';' )? 'let' ( equation | property )* 'tel' ';' ;
    public final Node node() throws RecognitionException {
        Node n = null;


        List<VarDecl> inputs =null;

        List<VarDecl> outputs =null;

        List<VarDecl> vars =null;

        Equation equation1 =null;

        String property2 =null;



          List<VarDecl> locals = new ArrayList<VarDecl>();
          List<Equation> equations = new ArrayList<Equation>();
          List<String> properties = new ArrayList<String>();

        try {
            // Lustre.g:30:2: ( 'node' ID '(' inputs= varDeclList ')' 'returns' '(' outputs= varDeclList ')' ';' ( 'var' vars= varDeclList ';' )? 'let' ( equation | property )* 'tel' ';' )
            // Lustre.g:32:3: 'node' ID '(' inputs= varDeclList ')' 'returns' '(' outputs= varDeclList ')' ';' ( 'var' vars= varDeclList ';' )? 'let' ( equation | property )* 'tel' ';'
            {
            match(input,35,FOLLOW_35_in_node64); if (state.failed) return n;

            match(input,ID,FOLLOW_ID_in_node66); if (state.failed) return n;

            match(input,10,FOLLOW_10_in_node68); if (state.failed) return n;

            pushFollow(FOLLOW_varDeclList_in_node72);
            inputs=varDeclList();

            state._fsp--;
            if (state.failed) return n;

            match(input,11,FOLLOW_11_in_node74); if (state.failed) return n;

            match(input,40,FOLLOW_40_in_node78); if (state.failed) return n;

            match(input,10,FOLLOW_10_in_node80); if (state.failed) return n;

            pushFollow(FOLLOW_varDeclList_in_node84);
            outputs=varDeclList();

            state._fsp--;
            if (state.failed) return n;

            match(input,11,FOLLOW_11_in_node86); if (state.failed) return n;

            match(input,20,FOLLOW_20_in_node88); if (state.failed) return n;

            // Lustre.g:34:3: ( 'var' vars= varDeclList ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==44) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Lustre.g:34:4: 'var' vars= varDeclList ';'
                    {
                    match(input,44,FOLLOW_44_in_node93); if (state.failed) return n;

                    pushFollow(FOLLOW_varDeclList_in_node97);
                    vars=varDeclList();

                    state._fsp--;
                    if (state.failed) return n;

                    match(input,20,FOLLOW_20_in_node99); if (state.failed) return n;

                    if ( state.backtracking==0 ) { locals.addAll(vars); }

                    }
                    break;

            }


            match(input,34,FOLLOW_34_in_node130); if (state.failed) return n;

            // Lustre.g:37:5: ( equation | property )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ID) ) {
                    alt2=1;
                }
                else if ( (LA2_0==16) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // Lustre.g:37:7: equation
            	    {
            	    pushFollow(FOLLOW_equation_in_node138);
            	    equation1=equation();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { equations.add(equation1); }

            	    }
            	    break;
            	case 2 :
            	    // Lustre.g:38:7: property
            	    {
            	    pushFollow(FOLLOW_property_in_node182);
            	    property2=property();

            	    state._fsp--;
            	    if (state.failed) return n;

            	    if ( state.backtracking==0 ) { properties.add(property2); }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,41,FOLLOW_41_in_node231); if (state.failed) return n;

            match(input,20,FOLLOW_20_in_node233); if (state.failed) return n;

            if ( state.backtracking==0 ) { n = new Node(inputs, outputs, locals, equations, properties); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return n;
    }
    // $ANTLR end "node"



    // $ANTLR start "varDeclList"
    // Lustre.g:45:1: varDeclList returns [List<VarDecl> decls] : (g1= varDeclGroup ( ';' g2= varDeclGroup )* )? ;
    public final List<VarDecl> varDeclList() throws RecognitionException {
        List<VarDecl> decls = null;


        List<VarDecl> g1 =null;

        List<VarDecl> g2 =null;


         decls = new ArrayList<VarDecl>(); 
        try {
            // Lustre.g:46:44: ( (g1= varDeclGroup ( ';' g2= varDeclGroup )* )? )
            // Lustre.g:48:3: (g1= varDeclGroup ( ';' g2= varDeclGroup )* )?
            {
            // Lustre.g:48:3: (g1= varDeclGroup ( ';' g2= varDeclGroup )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Lustre.g:48:4: g1= varDeclGroup ( ';' g2= varDeclGroup )*
                    {
                    pushFollow(FOLLOW_varDeclGroup_in_varDeclList260);
                    g1=varDeclGroup();

                    state._fsp--;
                    if (state.failed) return decls;

                    if ( state.backtracking==0 ) { decls.addAll(g1); }

                    // Lustre.g:49:5: ( ';' g2= varDeclGroup )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==20) ) {
                            int LA3_2 = input.LA(2);

                            if ( (LA3_2==ID) ) {
                                alt3=1;
                            }


                        }


                        switch (alt3) {
                    	case 1 :
                    	    // Lustre.g:49:6: ';' g2= varDeclGroup
                    	    {
                    	    match(input,20,FOLLOW_20_in_varDeclList287); if (state.failed) return decls;

                    	    pushFollow(FOLLOW_varDeclGroup_in_varDeclList291);
                    	    g2=varDeclGroup();

                    	    state._fsp--;
                    	    if (state.failed) return decls;

                    	    if ( state.backtracking==0 ) { decls.addAll(g2); }

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return decls;
    }
    // $ANTLR end "varDeclList"



    // $ANTLR start "varDeclGroup"
    // Lustre.g:54:1: varDeclGroup returns [List<VarDecl> decls] : v1= ID ( ',' v2= ID )* ':' type ;
    public final List<VarDecl> varDeclGroup() throws RecognitionException {
        List<VarDecl> decls = null;


        Token v1=null;
        Token v2=null;
        Type type3 =null;


         List<String> names = new ArrayList<String>(); 
        try {
            // Lustre.g:55:55: (v1= ID ( ',' v2= ID )* ':' type )
            // Lustre.g:57:3: v1= ID ( ',' v2= ID )* ':' type
            {
            v1=(Token)match(input,ID,FOLLOW_ID_in_varDeclGroup342); if (state.failed) return decls;

            if ( state.backtracking==0 ) { names.add((v1!=null?v1.getText():null)); }

            // Lustre.g:58:5: ( ',' v2= ID )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Lustre.g:58:6: ',' v2= ID
            	    {
            	    match(input,14,FOLLOW_14_in_varDeclGroup364); if (state.failed) return decls;

            	    v2=(Token)match(input,ID,FOLLOW_ID_in_varDeclGroup368); if (state.failed) return decls;

            	    if ( state.backtracking==0 ) { names.add((v2!=null?v2.getText():null)); }

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match(input,19,FOLLOW_19_in_varDeclGroup388); if (state.failed) return decls;

            pushFollow(FOLLOW_type_in_varDeclGroup390);
            type3=type();

            state._fsp--;
            if (state.failed) return decls;

            if ( state.backtracking==0 ) { decls = new ArrayList<VarDecl>();
                for (String name : names) {
                  decls.add(new VarDecl(name, type3));
                }
              }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return decls;
    }
    // $ANTLR end "varDeclGroup"



    // $ANTLR start "type"
    // Lustre.g:69:1: type returns [Type t] : ( 'int' | 'bool' | 'real' );
    public final Type type() throws RecognitionException {
        Type t = null;


        try {
            // Lustre.g:69:22: ( 'int' | 'bool' | 'real' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 39:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return t;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // Lustre.g:70:3: 'int'
                    {
                    match(input,33,FOLLOW_33_in_type411); if (state.failed) return t;

                    if ( state.backtracking==0 ) { t = Type.INT; }

                    }
                    break;
                case 2 :
                    // Lustre.g:71:3: 'bool'
                    {
                    match(input,29,FOLLOW_29_in_type421); if (state.failed) return t;

                    if ( state.backtracking==0 ) { t = Type.BOOL; }

                    }
                    break;
                case 3 :
                    // Lustre.g:72:3: 'real'
                    {
                    match(input,39,FOLLOW_39_in_type430); if (state.failed) return t;

                    if ( state.backtracking==0 ) { t = Type.REAL; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return t;
    }
    // $ANTLR end "type"



    // $ANTLR start "property"
    // Lustre.g:75:1: property returns [String p] : '--%PROPERTY' ID ';' ;
    public final String property() throws RecognitionException {
        String p = null;


        Token ID4=null;

        try {
            // Lustre.g:75:28: ( '--%PROPERTY' ID ';' )
            // Lustre.g:76:3: '--%PROPERTY' ID ';'
            {
            match(input,16,FOLLOW_16_in_property449); if (state.failed) return p;

            ID4=(Token)match(input,ID,FOLLOW_ID_in_property451); if (state.failed) return p;

            match(input,20,FOLLOW_20_in_property453); if (state.failed) return p;

            if ( state.backtracking==0 ) { p = (ID4!=null?ID4.getText():null); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return p;
    }
    // $ANTLR end "property"



    // $ANTLR start "equation"
    // Lustre.g:79:1: equation returns [Equation eq] : ID '=' expr ';' ;
    public final Equation equation() throws RecognitionException {
        Equation eq = null;


        Token ID5=null;
        Expr expr6 =null;


        try {
            // Lustre.g:79:31: ( ID '=' expr ';' )
            // Lustre.g:80:3: ID '=' expr ';'
            {
            ID5=(Token)match(input,ID,FOLLOW_ID_in_equation479); if (state.failed) return eq;

            match(input,24,FOLLOW_24_in_equation481); if (state.failed) return eq;

            pushFollow(FOLLOW_expr_in_equation483);
            expr6=expr();

            state._fsp--;
            if (state.failed) return eq;

            match(input,20,FOLLOW_20_in_equation485); if (state.failed) return eq;

            if ( state.backtracking==0 ) { eq = new Equation((ID5!=null?ID5.getText():null), expr6); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return eq;
    }
    // $ANTLR end "equation"



    // $ANTLR start "expr"
    // Lustre.g:83:1: expr returns [Expr e] : arrowExpr ;
    public final Expr expr() throws RecognitionException {
        Expr e = null;


        Expr arrowExpr7 =null;


        try {
            // Lustre.g:83:22: ( arrowExpr )
            // Lustre.g:84:3: arrowExpr
            {
            pushFollow(FOLLOW_arrowExpr_in_expr516);
            arrowExpr7=arrowExpr();

            state._fsp--;
            if (state.failed) return e;

            if ( state.backtracking==0 ) { e = arrowExpr7; }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "expr"



    // $ANTLR start "arrowOp"
    // Lustre.g:87:1: arrowOp returns [BinaryOp op] : '->' ;
    public final BinaryOp arrowOp() throws RecognitionException {
        BinaryOp op = null;


        try {
            // Lustre.g:87:30: ( '->' )
            // Lustre.g:88:3: '->'
            {
            match(input,17,FOLLOW_17_in_arrowOp553); if (state.failed) return op;

            if ( state.backtracking==0 ) { op = BinaryOp.ARROW; }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return op;
    }
    // $ANTLR end "arrowOp"



    // $ANTLR start "arrowExpr"
    // Lustre.g:91:1: arrowExpr returns [Expr e] : e1= impliesExpr ( ( arrowOp )=> arrowOp e2= arrowExpr )? ;
    public final Expr arrowExpr() throws RecognitionException {
        Expr e = null;


        Expr e1 =null;

        Expr e2 =null;

        BinaryOp arrowOp8 =null;


        try {
            // Lustre.g:91:27: (e1= impliesExpr ( ( arrowOp )=> arrowOp e2= arrowExpr )? )
            // Lustre.g:92:3: e1= impliesExpr ( ( arrowOp )=> arrowOp e2= arrowExpr )?
            {
            pushFollow(FOLLOW_impliesExpr_in_arrowExpr571);
            e1=impliesExpr();

            state._fsp--;
            if (state.failed) return e;

            if ( state.backtracking==0 ) { e = e1; }

            // Lustre.g:93:5: ( ( arrowOp )=> arrowOp e2= arrowExpr )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                int LA7_1 = input.LA(2);

                if ( (synpred1_Lustre()) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // Lustre.g:93:6: ( arrowOp )=> arrowOp e2= arrowExpr
                    {
                    pushFollow(FOLLOW_arrowOp_in_arrowExpr601);
                    arrowOp8=arrowOp();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_arrowExpr_in_arrowExpr610);
                    e2=arrowExpr();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new BinaryExpr(e, arrowOp8, e2); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "arrowExpr"



    // $ANTLR start "impliesOp"
    // Lustre.g:98:1: impliesOp returns [BinaryOp op] : '=>' ;
    public final BinaryOp impliesOp() throws RecognitionException {
        BinaryOp op = null;


        try {
            // Lustre.g:98:32: ( '=>' )
            // Lustre.g:99:3: '=>'
            {
            match(input,25,FOLLOW_25_in_impliesOp649); if (state.failed) return op;

            if ( state.backtracking==0 ) { op = BinaryOp.IMPLIES; }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return op;
    }
    // $ANTLR end "impliesOp"



    // $ANTLR start "impliesExpr"
    // Lustre.g:102:1: impliesExpr returns [Expr e] : e1= orExpr ( ( impliesOp )=> impliesOp e2= impliesExpr )? ;
    public final Expr impliesExpr() throws RecognitionException {
        Expr e = null;


        Expr e1 =null;

        Expr e2 =null;

        BinaryOp impliesOp9 =null;


        try {
            // Lustre.g:102:29: (e1= orExpr ( ( impliesOp )=> impliesOp e2= impliesExpr )? )
            // Lustre.g:103:3: e1= orExpr ( ( impliesOp )=> impliesOp e2= impliesExpr )?
            {
            pushFollow(FOLLOW_orExpr_in_impliesExpr667);
            e1=orExpr();

            state._fsp--;
            if (state.failed) return e;

            if ( state.backtracking==0 ) { e = e1; }

            // Lustre.g:104:5: ( ( impliesOp )=> impliesOp e2= impliesExpr )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                int LA8_1 = input.LA(2);

                if ( (synpred2_Lustre()) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // Lustre.g:104:6: ( impliesOp )=> impliesOp e2= impliesExpr
                    {
                    pushFollow(FOLLOW_impliesOp_in_impliesExpr702);
                    impliesOp9=impliesOp();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_impliesExpr_in_impliesExpr711);
                    e2=impliesExpr();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new BinaryExpr(e, impliesOp9, e2); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "impliesExpr"



    // $ANTLR start "orOp"
    // Lustre.g:109:1: orOp returns [BinaryOp op] : ( 'or' | 'xor' );
    public final BinaryOp orOp() throws RecognitionException {
        BinaryOp op = null;


        try {
            // Lustre.g:109:27: ( 'or' | 'xor' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==37) ) {
                alt9=1;
            }
            else if ( (LA9_0==45) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return op;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // Lustre.g:110:3: 'or'
                    {
                    match(input,37,FOLLOW_37_in_orOp748); if (state.failed) return op;

                    if ( state.backtracking==0 ) { op = BinaryOp.OR; }

                    }
                    break;
                case 2 :
                    // Lustre.g:111:3: 'xor'
                    {
                    match(input,45,FOLLOW_45_in_orOp754); if (state.failed) return op;

                    if ( state.backtracking==0 ) { op = BinaryOp.XOR; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return op;
    }
    // $ANTLR end "orOp"



    // $ANTLR start "orExpr"
    // Lustre.g:114:1: orExpr returns [Expr e] : e1= andExpr ( ( orOp )=> ( orOp ) e2= andExpr )* ;
    public final Expr orExpr() throws RecognitionException {
        Expr e = null;


        Expr e1 =null;

        Expr e2 =null;

        BinaryOp orOp10 =null;


        try {
            // Lustre.g:114:24: (e1= andExpr ( ( orOp )=> ( orOp ) e2= andExpr )* )
            // Lustre.g:115:3: e1= andExpr ( ( orOp )=> ( orOp ) e2= andExpr )*
            {
            pushFollow(FOLLOW_andExpr_in_orExpr772);
            e1=andExpr();

            state._fsp--;
            if (state.failed) return e;

            if ( state.backtracking==0 ) { e = e1; }

            // Lustre.g:116:5: ( ( orOp )=> ( orOp ) e2= andExpr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==37) ) {
                    int LA10_2 = input.LA(2);

                    if ( (synpred3_Lustre()) ) {
                        alt10=1;
                    }


                }
                else if ( (LA10_0==45) ) {
                    int LA10_3 = input.LA(2);

                    if ( (synpred3_Lustre()) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // Lustre.g:116:6: ( orOp )=> ( orOp ) e2= andExpr
            	    {
            	    // Lustre.g:116:15: ( orOp )
            	    // Lustre.g:116:16: orOp
            	    {
            	    pushFollow(FOLLOW_orOp_in_orExpr806);
            	    orOp10=orOp();

            	    state._fsp--;
            	    if (state.failed) return e;

            	    }


            	    pushFollow(FOLLOW_andExpr_in_orExpr816);
            	    e2=andExpr();

            	    state._fsp--;
            	    if (state.failed) return e;

            	    if ( state.backtracking==0 ) { e = new BinaryExpr(e, orOp10, e2); }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "orExpr"



    // $ANTLR start "andOp"
    // Lustre.g:121:1: andOp returns [BinaryOp op] : 'and' ;
    public final BinaryOp andOp() throws RecognitionException {
        BinaryOp op = null;


        try {
            // Lustre.g:121:28: ( 'and' )
            // Lustre.g:122:3: 'and'
            {
            match(input,28,FOLLOW_28_in_andOp855); if (state.failed) return op;

            if ( state.backtracking==0 ) { op = BinaryOp.AND; }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return op;
    }
    // $ANTLR end "andOp"



    // $ANTLR start "andExpr"
    // Lustre.g:125:1: andExpr returns [Expr e] : e1= relationalExpr ( ( andOp )=> andOp e2= relationalExpr )* ;
    public final Expr andExpr() throws RecognitionException {
        Expr e = null;


        Expr e1 =null;

        Expr e2 =null;

        BinaryOp andOp11 =null;


        try {
            // Lustre.g:125:25: (e1= relationalExpr ( ( andOp )=> andOp e2= relationalExpr )* )
            // Lustre.g:126:3: e1= relationalExpr ( ( andOp )=> andOp e2= relationalExpr )*
            {
            pushFollow(FOLLOW_relationalExpr_in_andExpr873);
            e1=relationalExpr();

            state._fsp--;
            if (state.failed) return e;

            if ( state.backtracking==0 ) { e = e1; }

            // Lustre.g:127:5: ( ( andOp )=> andOp e2= relationalExpr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    int LA11_2 = input.LA(2);

                    if ( (synpred4_Lustre()) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // Lustre.g:127:6: ( andOp )=> andOp e2= relationalExpr
            	    {
            	    pushFollow(FOLLOW_andOp_in_andExpr903);
            	    andOp11=andOp();

            	    state._fsp--;
            	    if (state.failed) return e;

            	    pushFollow(FOLLOW_relationalExpr_in_andExpr913);
            	    e2=relationalExpr();

            	    state._fsp--;
            	    if (state.failed) return e;

            	    if ( state.backtracking==0 ) { e = new BinaryExpr(e, andOp11, e2); }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "andExpr"



    // $ANTLR start "relationalOp"
    // Lustre.g:132:1: relationalOp returns [BinaryOp op] : ( '<' | '<=' | '>' | '>=' | '=' | '<>' );
    public final BinaryOp relationalOp() throws RecognitionException {
        BinaryOp op = null;


        try {
            // Lustre.g:132:35: ( '<' | '<=' | '>' | '>=' | '=' | '<>' )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt12=1;
                }
                break;
            case 22:
                {
                alt12=2;
                }
                break;
            case 26:
                {
                alt12=3;
                }
                break;
            case 27:
                {
                alt12=4;
                }
                break;
            case 24:
                {
                alt12=5;
                }
                break;
            case 23:
                {
                alt12=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return op;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // Lustre.g:133:3: '<'
                    {
                    match(input,21,FOLLOW_21_in_relationalOp948); if (state.failed) return op;

                    if ( state.backtracking==0 ) { op = BinaryOp.LESS; }

                    }
                    break;
                case 2 :
                    // Lustre.g:134:3: '<='
                    {
                    match(input,22,FOLLOW_22_in_relationalOp955); if (state.failed) return op;

                    if ( state.backtracking==0 ) { op = BinaryOp.LESSEQUAL; }

                    }
                    break;
                case 3 :
                    // Lustre.g:135:3: '>'
                    {
                    match(input,26,FOLLOW_26_in_relationalOp961); if (state.failed) return op;

                    if ( state.backtracking==0 ) { op = BinaryOp.GREATER; }

                    }
                    break;
                case 4 :
                    // Lustre.g:136:3: '>='
                    {
                    match(input,27,FOLLOW_27_in_relationalOp968); if (state.failed) return op;

                    if ( state.backtracking==0 ) { op = BinaryOp.GREATEREQUAL; }

                    }
                    break;
                case 5 :
                    // Lustre.g:137:3: '='
                    {
                    match(input,24,FOLLOW_24_in_relationalOp974); if (state.failed) return op;

                    if ( state.backtracking==0 ) { op = BinaryOp.EQUAL; }

                    }
                    break;
                case 6 :
                    // Lustre.g:138:3: '<>'
                    {
                    match(input,23,FOLLOW_23_in_relationalOp981); if (state.failed) return op;

                    if ( state.backtracking==0 ) { op = BinaryOp.NOTEQUAL; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return op;
    }
    // $ANTLR end "relationalOp"



    // $ANTLR start "relationalExpr"
    // Lustre.g:141:1: relationalExpr returns [Expr e] : e1= plusExpr ( ( relationalOp )=> relationalOp e2= plusExpr )? ;
    public final Expr relationalExpr() throws RecognitionException {
        Expr e = null;


        Expr e1 =null;

        Expr e2 =null;

        BinaryOp relationalOp12 =null;


        try {
            // Lustre.g:141:32: (e1= plusExpr ( ( relationalOp )=> relationalOp e2= plusExpr )? )
            // Lustre.g:142:3: e1= plusExpr ( ( relationalOp )=> relationalOp e2= plusExpr )?
            {
            pushFollow(FOLLOW_plusExpr_in_relationalExpr999);
            e1=plusExpr();

            state._fsp--;
            if (state.failed) return e;

            if ( state.backtracking==0 ) { e = e1; }

            // Lustre.g:143:5: ( ( relationalOp )=> relationalOp e2= plusExpr )?
            int alt13=2;
            switch ( input.LA(1) ) {
                case 21:
                    {
                    int LA13_1 = input.LA(2);

                    if ( (synpred5_Lustre()) ) {
                        alt13=1;
                    }
                    }
                    break;
                case 22:
                    {
                    int LA13_2 = input.LA(2);

                    if ( (synpred5_Lustre()) ) {
                        alt13=1;
                    }
                    }
                    break;
                case 26:
                    {
                    int LA13_3 = input.LA(2);

                    if ( (synpred5_Lustre()) ) {
                        alt13=1;
                    }
                    }
                    break;
                case 27:
                    {
                    int LA13_4 = input.LA(2);

                    if ( (synpred5_Lustre()) ) {
                        alt13=1;
                    }
                    }
                    break;
                case 24:
                    {
                    int LA13_5 = input.LA(2);

                    if ( (synpred5_Lustre()) ) {
                        alt13=1;
                    }
                    }
                    break;
                case 23:
                    {
                    int LA13_6 = input.LA(2);

                    if ( (synpred5_Lustre()) ) {
                        alt13=1;
                    }
                    }
                    break;
            }

            switch (alt13) {
                case 1 :
                    // Lustre.g:143:6: ( relationalOp )=> relationalOp e2= plusExpr
                    {
                    pushFollow(FOLLOW_relationalOp_in_relationalExpr1035);
                    relationalOp12=relationalOp();

                    state._fsp--;
                    if (state.failed) return e;

                    pushFollow(FOLLOW_plusExpr_in_relationalExpr1044);
                    e2=plusExpr();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new BinaryExpr(e, relationalOp12, e2); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "relationalExpr"



    // $ANTLR start "plusOp"
    // Lustre.g:148:1: plusOp returns [BinaryOp op] : ( '+' | '-' );
    public final BinaryOp plusOp() throws RecognitionException {
        BinaryOp op = null;


        try {
            // Lustre.g:148:29: ( '+' | '-' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            else if ( (LA14_0==15) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return op;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // Lustre.g:149:3: '+'
                    {
                    match(input,13,FOLLOW_13_in_plusOp1086); if (state.failed) return op;

                    if ( state.backtracking==0 ) { op = BinaryOp.PLUS; }

                    }
                    break;
                case 2 :
                    // Lustre.g:150:3: '-'
                    {
                    match(input,15,FOLLOW_15_in_plusOp1092); if (state.failed) return op;

                    if ( state.backtracking==0 ) { op = BinaryOp.MINUS; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return op;
    }
    // $ANTLR end "plusOp"



    // $ANTLR start "plusExpr"
    // Lustre.g:153:1: plusExpr returns [Expr e] : e1= timesExpr ( ( plusOp )=> plusOp e2= timesExpr )* ;
    public final Expr plusExpr() throws RecognitionException {
        Expr e = null;


        Expr e1 =null;

        Expr e2 =null;

        BinaryOp plusOp13 =null;


        try {
            // Lustre.g:153:26: (e1= timesExpr ( ( plusOp )=> plusOp e2= timesExpr )* )
            // Lustre.g:154:3: e1= timesExpr ( ( plusOp )=> plusOp e2= timesExpr )*
            {
            pushFollow(FOLLOW_timesExpr_in_plusExpr1110);
            e1=timesExpr();

            state._fsp--;
            if (state.failed) return e;

            if ( state.backtracking==0 ) { e = e1; }

            // Lustre.g:155:5: ( ( plusOp )=> plusOp e2= timesExpr )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13) ) {
                    int LA15_2 = input.LA(2);

                    if ( (synpred6_Lustre()) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==15) ) {
                    int LA15_3 = input.LA(2);

                    if ( (synpred6_Lustre()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // Lustre.g:155:6: ( plusOp )=> plusOp e2= timesExpr
            	    {
            	    pushFollow(FOLLOW_plusOp_in_plusExpr1146);
            	    plusOp13=plusOp();

            	    state._fsp--;
            	    if (state.failed) return e;

            	    pushFollow(FOLLOW_timesExpr_in_plusExpr1155);
            	    e2=timesExpr();

            	    state._fsp--;
            	    if (state.failed) return e;

            	    if ( state.backtracking==0 ) { e = new BinaryExpr(e, plusOp13, e2); }

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "plusExpr"



    // $ANTLR start "timesOp"
    // Lustre.g:160:1: timesOp returns [BinaryOp op] : ( '*' | '/' );
    public final BinaryOp timesOp() throws RecognitionException {
        BinaryOp op = null;


        try {
            // Lustre.g:160:30: ( '*' | '/' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==12) ) {
                alt16=1;
            }
            else if ( (LA16_0==18) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return op;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // Lustre.g:161:3: '*'
                    {
                    match(input,12,FOLLOW_12_in_timesOp1197); if (state.failed) return op;

                    if ( state.backtracking==0 ) { op = BinaryOp.MULTIPLY; }

                    }
                    break;
                case 2 :
                    // Lustre.g:162:3: '/'
                    {
                    match(input,18,FOLLOW_18_in_timesOp1203); if (state.failed) return op;

                    if ( state.backtracking==0 ) { op = BinaryOp.DIVIDE; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return op;
    }
    // $ANTLR end "timesOp"



    // $ANTLR start "timesExpr"
    // Lustre.g:165:1: timesExpr returns [Expr e] : e1= prefixExpr ( ( timesOp )=> timesOp e2= prefixExpr )* ;
    public final Expr timesExpr() throws RecognitionException {
        Expr e = null;


        Expr e1 =null;

        Expr e2 =null;

        BinaryOp timesOp14 =null;


        try {
            // Lustre.g:165:27: (e1= prefixExpr ( ( timesOp )=> timesOp e2= prefixExpr )* )
            // Lustre.g:166:3: e1= prefixExpr ( ( timesOp )=> timesOp e2= prefixExpr )*
            {
            pushFollow(FOLLOW_prefixExpr_in_timesExpr1221);
            e1=prefixExpr();

            state._fsp--;
            if (state.failed) return e;

            if ( state.backtracking==0 ) { e = e1; }

            // Lustre.g:167:5: ( ( timesOp )=> timesOp e2= prefixExpr )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==12) ) {
                    int LA17_2 = input.LA(2);

                    if ( (synpred7_Lustre()) ) {
                        alt17=1;
                    }


                }
                else if ( (LA17_0==18) ) {
                    int LA17_3 = input.LA(2);

                    if ( (synpred7_Lustre()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // Lustre.g:167:6: ( timesOp )=> timesOp e2= prefixExpr
            	    {
            	    pushFollow(FOLLOW_timesOp_in_timesExpr1251);
            	    timesOp14=timesOp();

            	    state._fsp--;
            	    if (state.failed) return e;

            	    pushFollow(FOLLOW_prefixExpr_in_timesExpr1261);
            	    e2=prefixExpr();

            	    state._fsp--;
            	    if (state.failed) return e;

            	    if ( state.backtracking==0 ) { e = new BinaryExpr(e, timesOp14, e2); }

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "timesExpr"



    // $ANTLR start "prefixExpr"
    // Lustre.g:172:1: prefixExpr returns [Expr e] : ( '-' e1= prefixExpr | 'not' e2= prefixExpr | 'pre' e3= prefixExpr | atomicExpr );
    public final Expr prefixExpr() throws RecognitionException {
        Expr e = null;


        Expr e1 =null;

        Expr e2 =null;

        Expr e3 =null;

        Expr atomicExpr15 =null;


        try {
            // Lustre.g:172:28: ( '-' e1= prefixExpr | 'not' e2= prefixExpr | 'pre' e3= prefixExpr | atomicExpr )
            int alt18=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt18=1;
                }
                break;
            case 36:
                {
                alt18=2;
                }
                break;
            case 38:
                {
                alt18=3;
                }
                break;
            case ID:
            case INT:
            case 10:
            case 31:
            case 32:
            case 43:
                {
                alt18=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // Lustre.g:173:3: '-' e1= prefixExpr
                    {
                    match(input,15,FOLLOW_15_in_prefixExpr1298); if (state.failed) return e;

                    pushFollow(FOLLOW_prefixExpr_in_prefixExpr1302);
                    e1=prefixExpr();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new UnaryExpr(UnaryOp.NEGATIVE, e1); }

                    }
                    break;
                case 2 :
                    // Lustre.g:174:3: 'not' e2= prefixExpr
                    {
                    match(input,36,FOLLOW_36_in_prefixExpr1319); if (state.failed) return e;

                    pushFollow(FOLLOW_prefixExpr_in_prefixExpr1323);
                    e2=prefixExpr();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new UnaryExpr(UnaryOp.NOT, e2); }

                    }
                    break;
                case 3 :
                    // Lustre.g:175:3: 'pre' e3= prefixExpr
                    {
                    match(input,38,FOLLOW_38_in_prefixExpr1338); if (state.failed) return e;

                    pushFollow(FOLLOW_prefixExpr_in_prefixExpr1342);
                    e3=prefixExpr();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new UnaryExpr(UnaryOp.PRE, e3); }

                    }
                    break;
                case 4 :
                    // Lustre.g:176:3: atomicExpr
                    {
                    pushFollow(FOLLOW_atomicExpr_in_prefixExpr1357);
                    atomicExpr15=atomicExpr();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = atomicExpr15; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "prefixExpr"



    // $ANTLR start "atomicExpr"
    // Lustre.g:179:1: atomicExpr returns [Expr e] : ( ID | INT | real | bool | 'if' e1= expr 'then' e2= expr 'else' e3= expr | '(' p= expr ')' );
    public final Expr atomicExpr() throws RecognitionException {
        Expr e = null;


        Token ID16=null;
        Token INT17=null;
        Expr e1 =null;

        Expr e2 =null;

        Expr e3 =null;

        Expr p =null;

        LustreParser.real_return real18 =null;

        Boolean bool19 =null;


        try {
            // Lustre.g:179:28: ( ID | INT | real | bool | 'if' e1= expr 'then' e2= expr 'else' e3= expr | '(' p= expr ')' )
            int alt19=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt19=1;
                }
                break;
            case INT:
                {
                int LA19_2 = input.LA(2);

                if ( (LA19_2==ERROR) ) {
                    alt19=3;
                }
                else if ( ((LA19_2 >= 11 && LA19_2 <= 13)||LA19_2==15||(LA19_2 >= 17 && LA19_2 <= 18)||(LA19_2 >= 20 && LA19_2 <= 28)||LA19_2==30||LA19_2==37||LA19_2==42||LA19_2==45) ) {
                    alt19=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return e;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 2, input);

                    throw nvae;

                }
                }
                break;
            case 31:
            case 43:
                {
                alt19=4;
                }
                break;
            case 32:
                {
                alt19=5;
                }
                break;
            case 10:
                {
                alt19=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return e;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // Lustre.g:180:3: ID
                    {
                    ID16=(Token)match(input,ID,FOLLOW_ID_in_atomicExpr1391); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new IdExpr((ID16!=null?ID16.getText():null)); }

                    }
                    break;
                case 2 :
                    // Lustre.g:181:3: INT
                    {
                    INT17=(Token)match(input,INT,FOLLOW_INT_in_atomicExpr1422); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new IntExpr(Integer.parseInt((INT17!=null?INT17.getText():null))); }

                    }
                    break;
                case 3 :
                    // Lustre.g:182:3: real
                    {
                    pushFollow(FOLLOW_real_in_atomicExpr1452);
                    real18=real();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new RealExpr(new BigDecimal((real18!=null?input.toString(real18.start,real18.stop):null))); }

                    }
                    break;
                case 4 :
                    // Lustre.g:183:3: bool
                    {
                    pushFollow(FOLLOW_bool_in_atomicExpr1481);
                    bool19=bool();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new BoolExpr(bool19); }

                    }
                    break;
                case 5 :
                    // Lustre.g:184:3: 'if' e1= expr 'then' e2= expr 'else' e3= expr
                    {
                    match(input,32,FOLLOW_32_in_atomicExpr1510); if (state.failed) return e;

                    pushFollow(FOLLOW_expr_in_atomicExpr1514);
                    e1=expr();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input,42,FOLLOW_42_in_atomicExpr1525); if (state.failed) return e;

                    pushFollow(FOLLOW_expr_in_atomicExpr1529);
                    e2=expr();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input,30,FOLLOW_30_in_atomicExpr1540); if (state.failed) return e;

                    pushFollow(FOLLOW_expr_in_atomicExpr1544);
                    e3=expr();

                    state._fsp--;
                    if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = new IfThenElseExpr(e1, e2, e3); }

                    }
                    break;
                case 6 :
                    // Lustre.g:187:3: '(' p= expr ')'
                    {
                    match(input,10,FOLLOW_10_in_atomicExpr1563); if (state.failed) return e;

                    pushFollow(FOLLOW_expr_in_atomicExpr1567);
                    p=expr();

                    state._fsp--;
                    if (state.failed) return e;

                    match(input,11,FOLLOW_11_in_atomicExpr1569); if (state.failed) return e;

                    if ( state.backtracking==0 ) { e = p; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return e;
    }
    // $ANTLR end "atomicExpr"


    public static class real_return extends ParserRuleReturnScope {
    };


    // $ANTLR start "real"
    // Lustre.g:190:1: real : INT '.' INT ;
    public final LustreParser.real_return real() throws RecognitionException {
        LustreParser.real_return retval = new LustreParser.real_return();
        retval.start = input.LT(1);


        try {
            // Lustre.g:190:5: ( INT '.' INT )
            // Lustre.g:190:7: INT '.' INT
            {
            match(input,INT,FOLLOW_INT_in_real1592); if (state.failed) return retval;

            match(input,ERROR,FOLLOW_ERROR_in_real1594); if (state.failed) return retval;

            match(input,INT,FOLLOW_INT_in_real1596); if (state.failed) return retval;

            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "real"



    // $ANTLR start "bool"
    // Lustre.g:192:1: bool returns [Boolean b] : ( 'true' | 'false' );
    public final Boolean bool() throws RecognitionException {
        Boolean b = null;


        try {
            // Lustre.g:192:25: ( 'true' | 'false' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            else if ( (LA20_0==31) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return b;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // Lustre.g:193:3: 'true'
                    {
                    match(input,43,FOLLOW_43_in_bool1609); if (state.failed) return b;

                    if ( state.backtracking==0 ) { b = true; }

                    }
                    break;
                case 2 :
                    // Lustre.g:194:3: 'false'
                    {
                    match(input,31,FOLLOW_31_in_bool1618); if (state.failed) return b;

                    if ( state.backtracking==0 ) { b = false; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return b;
    }
    // $ANTLR end "bool"

    // $ANTLR start synpred1_Lustre
    public final void synpred1_Lustre_fragment() throws RecognitionException {
        // Lustre.g:93:6: ( arrowOp )
        // Lustre.g:93:7: arrowOp
        {
        pushFollow(FOLLOW_arrowOp_in_synpred1_Lustre598);
        arrowOp();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Lustre

    // $ANTLR start synpred2_Lustre
    public final void synpred2_Lustre_fragment() throws RecognitionException {
        // Lustre.g:104:6: ( impliesOp )
        // Lustre.g:104:7: impliesOp
        {
        pushFollow(FOLLOW_impliesOp_in_synpred2_Lustre699);
        impliesOp();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Lustre

    // $ANTLR start synpred3_Lustre
    public final void synpred3_Lustre_fragment() throws RecognitionException {
        // Lustre.g:116:6: ( orOp )
        // Lustre.g:116:7: orOp
        {
        pushFollow(FOLLOW_orOp_in_synpred3_Lustre801);
        orOp();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Lustre

    // $ANTLR start synpred4_Lustre
    public final void synpred4_Lustre_fragment() throws RecognitionException {
        // Lustre.g:127:6: ( andOp )
        // Lustre.g:127:7: andOp
        {
        pushFollow(FOLLOW_andOp_in_synpred4_Lustre899);
        andOp();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Lustre

    // $ANTLR start synpred5_Lustre
    public final void synpred5_Lustre_fragment() throws RecognitionException {
        // Lustre.g:143:6: ( relationalOp )
        // Lustre.g:143:7: relationalOp
        {
        pushFollow(FOLLOW_relationalOp_in_synpred5_Lustre1031);
        relationalOp();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_Lustre

    // $ANTLR start synpred6_Lustre
    public final void synpred6_Lustre_fragment() throws RecognitionException {
        // Lustre.g:155:6: ( plusOp )
        // Lustre.g:155:7: plusOp
        {
        pushFollow(FOLLOW_plusOp_in_synpred6_Lustre1142);
        plusOp();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_Lustre

    // $ANTLR start synpred7_Lustre
    public final void synpred7_Lustre_fragment() throws RecognitionException {
        // Lustre.g:167:6: ( timesOp )
        // Lustre.g:167:7: timesOp
        {
        pushFollow(FOLLOW_timesOp_in_synpred7_Lustre1247);
        timesOp();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred7_Lustre

    // Delegated rules

    public final boolean synpred6_Lustre() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_Lustre_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_Lustre() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Lustre_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_Lustre() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Lustre_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_Lustre() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_Lustre_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_Lustre() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Lustre_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_Lustre() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Lustre_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Lustre() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Lustre_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_35_in_node64 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_node66 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_node68 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_varDeclList_in_node72 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_node74 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_node78 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_node80 = new BitSet(new long[]{0x0000000000000820L});
    public static final BitSet FOLLOW_varDeclList_in_node84 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_node86 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_node88 = new BitSet(new long[]{0x0000100400000000L});
    public static final BitSet FOLLOW_44_in_node93 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_varDeclList_in_node97 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_node99 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_node130 = new BitSet(new long[]{0x0000020000010020L});
    public static final BitSet FOLLOW_equation_in_node138 = new BitSet(new long[]{0x0000020000010020L});
    public static final BitSet FOLLOW_property_in_node182 = new BitSet(new long[]{0x0000020000010020L});
    public static final BitSet FOLLOW_41_in_node231 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_node233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDeclGroup_in_varDeclList260 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_varDeclList287 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_varDeclGroup_in_varDeclList291 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ID_in_varDeclGroup342 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_14_in_varDeclGroup364 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_varDeclGroup368 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_19_in_varDeclGroup388 = new BitSet(new long[]{0x0000008220000000L});
    public static final BitSet FOLLOW_type_in_varDeclGroup390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_type411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_type421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_type430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_property449 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_property451 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_property453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_equation479 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_equation481 = new BitSet(new long[]{0x0000085180008460L});
    public static final BitSet FOLLOW_expr_in_equation483 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_equation485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrowExpr_in_expr516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_arrowOp553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_impliesExpr_in_arrowExpr571 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_arrowOp_in_arrowExpr601 = new BitSet(new long[]{0x0000085180008460L});
    public static final BitSet FOLLOW_arrowExpr_in_arrowExpr610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_impliesOp649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_impliesExpr667 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_impliesOp_in_impliesExpr702 = new BitSet(new long[]{0x0000085180008460L});
    public static final BitSet FOLLOW_impliesExpr_in_impliesExpr711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_orOp748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_orOp754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr772 = new BitSet(new long[]{0x0000202000000002L});
    public static final BitSet FOLLOW_orOp_in_orExpr806 = new BitSet(new long[]{0x0000085180008460L});
    public static final BitSet FOLLOW_andExpr_in_orExpr816 = new BitSet(new long[]{0x0000202000000002L});
    public static final BitSet FOLLOW_28_in_andOp855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalExpr_in_andExpr873 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_andOp_in_andExpr903 = new BitSet(new long[]{0x0000085180008460L});
    public static final BitSet FOLLOW_relationalExpr_in_andExpr913 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_21_in_relationalOp948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_relationalOp955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_relationalOp961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_relationalOp968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_relationalOp974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_relationalOp981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plusExpr_in_relationalExpr999 = new BitSet(new long[]{0x000000000DE00002L});
    public static final BitSet FOLLOW_relationalOp_in_relationalExpr1035 = new BitSet(new long[]{0x0000085180008460L});
    public static final BitSet FOLLOW_plusExpr_in_relationalExpr1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_plusOp1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_plusOp1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timesExpr_in_plusExpr1110 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_plusOp_in_plusExpr1146 = new BitSet(new long[]{0x0000085180008460L});
    public static final BitSet FOLLOW_timesExpr_in_plusExpr1155 = new BitSet(new long[]{0x000000000000A002L});
    public static final BitSet FOLLOW_12_in_timesOp1197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_timesOp1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_prefixExpr_in_timesExpr1221 = new BitSet(new long[]{0x0000000000041002L});
    public static final BitSet FOLLOW_timesOp_in_timesExpr1251 = new BitSet(new long[]{0x0000085180008460L});
    public static final BitSet FOLLOW_prefixExpr_in_timesExpr1261 = new BitSet(new long[]{0x0000000000041002L});
    public static final BitSet FOLLOW_15_in_prefixExpr1298 = new BitSet(new long[]{0x0000085180008460L});
    public static final BitSet FOLLOW_prefixExpr_in_prefixExpr1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_prefixExpr1319 = new BitSet(new long[]{0x0000085180008460L});
    public static final BitSet FOLLOW_prefixExpr_in_prefixExpr1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_prefixExpr1338 = new BitSet(new long[]{0x0000085180008460L});
    public static final BitSet FOLLOW_prefixExpr_in_prefixExpr1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomicExpr_in_prefixExpr1357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atomicExpr1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atomicExpr1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_real_in_atomicExpr1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_bool_in_atomicExpr1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_atomicExpr1510 = new BitSet(new long[]{0x0000085180008460L});
    public static final BitSet FOLLOW_expr_in_atomicExpr1514 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_atomicExpr1525 = new BitSet(new long[]{0x0000085180008460L});
    public static final BitSet FOLLOW_expr_in_atomicExpr1529 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_atomicExpr1540 = new BitSet(new long[]{0x0000085180008460L});
    public static final BitSet FOLLOW_expr_in_atomicExpr1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_atomicExpr1563 = new BitSet(new long[]{0x0000085180008460L});
    public static final BitSet FOLLOW_expr_in_atomicExpr1567 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_atomicExpr1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_real1592 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ERROR_in_real1594 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_INT_in_real1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_bool1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_bool1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrowOp_in_synpred1_Lustre598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_impliesOp_in_synpred2_Lustre699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orOp_in_synpred3_Lustre801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andOp_in_synpred4_Lustre899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationalOp_in_synpred5_Lustre1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_plusOp_in_synpred6_Lustre1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_timesOp_in_synpred7_Lustre1247 = new BitSet(new long[]{0x0000000000000002L});

}
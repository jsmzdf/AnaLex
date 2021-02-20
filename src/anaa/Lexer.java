/* The following code was generated by JFlex 1.4.3 on 15/02/21 04:16 PM */

package anaa;
import static anaa.Tokens.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 15/02/21 04:16 PM from the specification file
 * <tt>C:/Users/sebas/udistri/octavo/Ciencias3/AnalizadorFinal/anaa/anaa/src/anaa/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\4\1\6\2\0\1\4\22\0\1\4\1\41\1\7\1\62"+
    "\1\0\1\44\1\37\1\0\1\45\1\46\1\36\1\34\1\0\1\35"+
    "\1\3\1\5\12\2\1\0\1\54\1\43\1\33\1\42\2\0\22\1"+
    "\1\30\7\1\1\51\1\0\1\52\1\0\1\1\1\0\1\20\1\10"+
    "\1\16\1\26\1\13\1\25\1\24\1\17\1\14\1\1\1\57\1\22"+
    "\1\53\1\15\1\23\1\56\1\1\1\21\1\31\1\12\1\27\1\61"+
    "\1\32\1\55\1\11\1\60\1\47\1\40\1\50\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\20\2\1\11\1\12\1\13\1\14\3\15\2\16"+
    "\1\1\1\17\1\20\1\21\1\22\1\23\1\24\1\2"+
    "\1\25\2\2\1\26\1\2\1\0\1\5\1\27\10\2"+
    "\1\30\20\2\1\31\10\2\1\16\1\32\1\15\1\0"+
    "\4\2\1\0\1\3\5\2\1\33\4\2\1\34\4\2"+
    "\1\35\6\2\1\36\6\2\1\37\16\2\1\0\10\2"+
    "\1\40\1\2\1\41\1\42\1\43\1\44\5\2\1\45"+
    "\3\2\1\46\1\47\1\2\1\50\20\2\1\0\1\3"+
    "\1\51\3\2\1\52\1\2\1\53\1\2\1\54\4\2"+
    "\1\55\1\56\1\2\1\57\4\2\1\60\1\2\1\61"+
    "\5\2\1\62\1\2\1\63\1\0\6\2\1\64\3\2"+
    "\1\65\1\66\1\67\2\2\1\70\1\71\1\72\1\73"+
    "\1\74\1\75\2\2\1\76\2\2\1\77\3\2\1\100"+
    "\1\2\1\101\2\2\1\102\1\2\1\103\1\104\1\105"+
    "\1\2\1\106\1\107\1\110";

  private static int [] zzUnpackAction() {
    int [] result = new int[261];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\63\0\146\0\231\0\63\0\314\0\377\0\63"+
    "\0\63\0\u0132\0\u0165\0\u0198\0\u01cb\0\u01fe\0\u0231\0\u0264"+
    "\0\u0297\0\u02ca\0\u02fd\0\u0330\0\u0363\0\u0396\0\u03c9\0\u03fc"+
    "\0\u042f\0\u0462\0\u0495\0\u04c8\0\u04fb\0\u052e\0\u0561\0\u0462"+
    "\0\u0594\0\u05c7\0\u04fb\0\u05fa\0\63\0\63\0\63\0\63"+
    "\0\63\0\u062d\0\63\0\u0660\0\u0693\0\63\0\u06c6\0\u06f9"+
    "\0\u072c\0\63\0\u075f\0\u0792\0\u07c5\0\u07f8\0\u082b\0\u085e"+
    "\0\u0891\0\u08c4\0\146\0\u08f7\0\u092a\0\u095d\0\u0990\0\u09c3"+
    "\0\u09f6\0\u0a29\0\u0a5c\0\u0a8f\0\u0ac2\0\u0af5\0\u0b28\0\u0b5b"+
    "\0\u0b8e\0\u0bc1\0\u0bf4\0\u0c27\0\u0c5a\0\u0c8d\0\u0cc0\0\u0cf3"+
    "\0\u0d26\0\u0d59\0\u0d8c\0\u0dbf\0\63\0\63\0\63\0\u0df2"+
    "\0\u0e25\0\u0e58\0\u0e8b\0\u0ebe\0\u0ef1\0\u0f24\0\u0f57\0\u0f8a"+
    "\0\u0fbd\0\u0ff0\0\u1023\0\146\0\u1056\0\u1089\0\u10bc\0\u10ef"+
    "\0\146\0\u1122\0\u1155\0\u1188\0\u11bb\0\146\0\u11ee\0\u1221"+
    "\0\u1254\0\u1287\0\u12ba\0\u12ed\0\146\0\u1320\0\u1353\0\u1386"+
    "\0\u13b9\0\u13ec\0\u141f\0\146\0\u1452\0\u1485\0\u14b8\0\u14eb"+
    "\0\u151e\0\u1551\0\u1584\0\u15b7\0\u15ea\0\u161d\0\u1650\0\u1683"+
    "\0\u16b6\0\u16e9\0\u171c\0\u174f\0\u1782\0\u17b5\0\u17e8\0\u181b"+
    "\0\u184e\0\u1881\0\u18b4\0\146\0\u18e7\0\146\0\146\0\146"+
    "\0\146\0\u191a\0\u194d\0\u1980\0\u19b3\0\u19e6\0\146\0\u1a19"+
    "\0\u1a4c\0\u1a7f\0\146\0\146\0\u1ab2\0\146\0\u1ae5\0\u1b18"+
    "\0\u1b4b\0\u1b7e\0\u1bb1\0\u1be4\0\u1c17\0\u1c4a\0\u1c7d\0\u1cb0"+
    "\0\u1ce3\0\u1d16\0\u1d49\0\u1d7c\0\u1daf\0\u1de2\0\u1e15\0\63"+
    "\0\146\0\u1e48\0\u1e7b\0\u1eae\0\146\0\u1ee1\0\146\0\u1f14"+
    "\0\146\0\u1f47\0\u1f7a\0\u1fad\0\u1fe0\0\146\0\146\0\u2013"+
    "\0\146\0\u2046\0\u2079\0\u20ac\0\u20df\0\146\0\u2112\0\146"+
    "\0\u2145\0\u2178\0\u21ab\0\u21de\0\u2211\0\146\0\u2244\0\146"+
    "\0\u2277\0\u22aa\0\u22dd\0\u2310\0\u2343\0\u2376\0\u23a9\0\146"+
    "\0\u23dc\0\u240f\0\u2442\0\146\0\146\0\146\0\u2475\0\u24a8"+
    "\0\146\0\146\0\146\0\146\0\146\0\146\0\u24db\0\u250e"+
    "\0\146\0\u2541\0\u2574\0\146\0\u25a7\0\u25da\0\u260d\0\146"+
    "\0\u2640\0\146\0\u2673\0\u26a6\0\146\0\u26d9\0\146\0\146"+
    "\0\146\0\u270c\0\146\0\146\0\146";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[261];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\3\1\13\1\14\1\15\1\16\1\17\1\3"+
    "\1\20\1\21\1\22\1\3\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\1\53\1\3\1\54\2\3"+
    "\1\55\1\56\64\0\1\3\1\57\5\0\23\3\20\0"+
    "\1\3\1\0\5\3\3\0\1\4\1\60\63\0\1\6"+
    "\63\0\1\61\25\0\1\62\30\0\1\3\1\57\5\0"+
    "\1\3\1\63\7\3\1\64\11\3\20\0\1\3\1\0"+
    "\5\3\2\0\1\3\1\57\5\0\3\3\1\65\3\3"+
    "\1\66\1\3\1\67\11\3\20\0\1\3\1\0\5\3"+
    "\2\0\1\3\1\57\5\0\5\3\1\70\4\3\1\71"+
    "\10\3\20\0\1\3\1\0\5\3\2\0\1\3\1\57"+
    "\5\0\5\3\1\72\7\3\1\73\5\3\20\0\1\3"+
    "\1\0\5\3\2\0\1\3\1\57\5\0\10\3\1\74"+
    "\2\3\1\75\7\3\20\0\1\3\1\0\5\3\2\0"+
    "\1\3\1\57\5\0\4\3\1\76\2\3\1\77\1\100"+
    "\1\3\1\101\1\102\7\3\20\0\1\3\1\0\5\3"+
    "\2\0\1\3\1\57\5\0\5\3\1\103\11\3\1\104"+
    "\3\3\20\0\1\3\1\0\5\3\2\0\1\3\1\57"+
    "\5\0\3\3\1\105\17\3\20\0\1\3\1\0\5\3"+
    "\2\0\1\3\1\57\5\0\13\3\1\106\7\3\20\0"+
    "\1\3\1\0\5\3\2\0\1\3\1\57\5\0\13\3"+
    "\1\107\7\3\20\0\1\3\1\0\5\3\2\0\1\3"+
    "\1\57\5\0\10\3\1\110\1\3\1\111\1\112\7\3"+
    "\20\0\1\3\1\0\5\3\2\0\1\3\1\57\5\0"+
    "\3\3\1\113\7\3\1\114\7\3\20\0\1\3\1\0"+
    "\5\3\2\0\1\3\1\57\5\0\5\3\1\115\13\3"+
    "\1\116\1\3\20\0\1\3\1\0\5\3\2\0\1\3"+
    "\1\57\5\0\2\3\1\117\20\3\20\0\1\3\1\0"+
    "\5\3\2\0\1\3\1\57\5\0\2\3\1\120\1\3"+
    "\1\121\2\3\1\122\12\3\1\123\20\0\1\3\1\0"+
    "\5\3\2\0\1\3\1\57\5\0\7\3\1\124\13\3"+
    "\20\0\1\3\1\0\5\3\34\0\1\125\62\0\1\62"+
    "\1\126\61\0\1\62\1\0\1\126\60\0\1\62\66\0"+
    "\1\127\63\0\1\127\55\0\1\125\6\0\1\125\53\0"+
    "\1\125\7\0\1\125\54\0\1\130\26\0\1\3\1\57"+
    "\5\0\10\3\1\131\12\3\20\0\1\3\1\0\5\3"+
    "\2\0\1\3\1\57\5\0\11\3\1\132\5\3\1\133"+
    "\3\3\20\0\1\3\1\0\5\3\2\0\1\3\1\57"+
    "\5\0\13\3\1\134\7\3\20\0\1\3\1\0\5\3"+
    "\2\0\1\3\1\57\1\135\4\0\23\3\20\0\1\3"+
    "\1\0\5\3\3\0\1\136\60\0\6\61\1\0\54\61"+
    "\1\0\1\3\1\57\5\0\2\3\1\137\20\3\20\0"+
    "\1\3\1\0\5\3\2\0\1\3\1\57\5\0\3\3"+
    "\1\140\17\3\20\0\1\3\1\0\5\3\2\0\1\3"+
    "\1\57\5\0\23\3\20\0\1\141\1\0\5\3\2\0"+
    "\1\3\1\57\5\0\4\3\1\142\4\3\1\143\11\3"+
    "\20\0\1\3\1\0\5\3\2\0\1\3\1\57\5\0"+
    "\1\3\1\144\15\3\1\145\3\3\20\0\1\3\1\0"+
    "\5\3\2\0\1\3\1\57\5\0\17\3\1\146\3\3"+
    "\20\0\1\3\1\0\5\3\2\0\1\3\1\57\5\0"+
    "\4\3\1\147\14\3\1\150\1\3\20\0\1\3\1\0"+
    "\5\3\2\0\1\3\1\57\5\0\2\3\1\151\3\3"+
    "\1\152\3\3\1\153\10\3\20\0\1\3\1\0\5\3"+
    "\2\0\1\3\1\57\5\0\23\3\20\0\1\154\1\0"+
    "\5\3\2\0\1\3\1\57\5\0\3\3\1\155\17\3"+
    "\20\0\1\3\1\0\5\3\2\0\1\3\1\57\5\0"+
    "\5\3\1\156\15\3\20\0\1\3\1\0\5\3\2\0"+
    "\1\3\1\57\5\0\10\3\1\157\12\3\20\0\1\3"+
    "\1\0\5\3\2\0\1\3\1\57\5\0\2\3\1\160"+
    "\16\3\1\161\1\3\20\0\1\3\1\0\5\3\2\0"+
    "\1\3\1\57\5\0\10\3\1\162\12\3\20\0\1\3"+
    "\1\0\5\3\2\0\1\3\1\57\5\0\5\3\1\163"+
    "\11\3\1\164\3\3\20\0\1\3\1\0\5\3\2\0"+
    "\1\3\1\57\5\0\16\3\1\165\4\3\20\0\1\3"+
    "\1\0\5\3\2\0\1\3\1\57\5\0\2\3\1\166"+
    "\20\3\20\0\1\3\1\0\5\3\2\0\1\3\1\57"+
    "\5\0\2\3\1\167\20\3\20\0\1\3\1\0\5\3"+
    "\2\0\1\3\1\57\5\0\5\3\1\170\15\3\20\0"+
    "\1\3\1\0\5\3\2\0\1\3\1\57\5\0\2\3"+
    "\1\171\20\3\20\0\1\3\1\0\5\3\2\0\1\3"+
    "\1\57\5\0\12\3\1\172\10\3\20\0\1\3\1\0"+
    "\5\3\2\0\1\3\1\57\5\0\13\3\1\173\7\3"+
    "\20\0\1\3\1\0\5\3\2\0\1\3\1\57\5\0"+
    "\11\3\1\174\11\3\20\0\1\3\1\0\5\3\2\0"+
    "\1\3\1\57\5\0\12\3\1\175\2\3\1\176\5\3"+
    "\20\0\1\3\1\0\5\3\2\0\1\3\1\57\5\0"+
    "\17\3\1\177\3\3\20\0\1\3\1\0\5\3\2\0"+
    "\1\3\1\57\5\0\4\3\1\200\14\3\1\201\1\3"+
    "\20\0\1\3\1\0\5\3\2\0\1\3\1\57\5\0"+
    "\4\3\1\202\16\3\20\0\1\3\1\0\5\3\2\0"+
    "\1\3\1\57\5\0\11\3\1\203\11\3\20\0\1\3"+
    "\1\0\5\3\2\0\1\3\1\57\5\0\10\3\1\204"+
    "\1\205\11\3\20\0\1\3\1\0\5\3\2\0\1\3"+
    "\1\57\5\0\14\3\1\206\6\3\20\0\1\3\1\0"+
    "\3\3\1\207\1\3\2\0\1\3\1\57\5\0\13\3"+
    "\1\210\7\3\20\0\1\3\1\0\5\3\2\0\1\3"+
    "\1\57\5\0\4\3\1\211\16\3\20\0\1\3\1\0"+
    "\5\3\2\0\1\3\1\57\5\0\4\3\1\212\16\3"+
    "\20\0\1\3\1\0\5\3\3\0\1\213\61\0\1\3"+
    "\1\57\5\0\4\3\1\214\16\3\20\0\1\3\1\0"+
    "\5\3\2\0\1\3\1\57\5\0\4\3\1\215\6\3"+
    "\1\216\7\3\20\0\1\3\1\0\5\3\2\0\1\3"+
    "\1\57\5\0\1\217\22\3\20\0\1\3\1\0\5\3"+
    "\2\0\1\3\1\57\5\0\4\3\1\220\5\3\1\221"+
    "\10\3\20\0\1\3\1\0\5\3\3\0\1\3\62\0"+
    "\1\4\61\0\1\3\1\57\5\0\3\3\1\151\17\3"+
    "\20\0\1\3\1\0\5\3\2\0\1\3\1\57\5\0"+
    "\10\3\1\222\12\3\20\0\1\3\1\0\5\3\2\0"+
    "\1\3\1\57\5\0\23\3\20\0\1\3\1\0\1\3"+
    "\1\223\3\3\2\0\1\3\1\57\5\0\21\3\1\224"+
    "\1\3\20\0\1\3\1\0\5\3\2\0\1\3\1\57"+
    "\5\0\13\3\1\225\7\3\20\0\1\3\1\0\5\3"+
    "\2\0\1\3\1\57\5\0\3\3\1\226\17\3\20\0"+
    "\1\3\1\0\5\3\2\0\1\3\1\57\5\0\23\3"+
    "\20\0\1\227\1\0\5\3\2\0\1\3\1\57\5\0"+
    "\15\3\1\230\5\3\20\0\1\3\1\0\5\3\2\0"+
    "\1\3\1\57\5\0\3\3\1\231\17\3\20\0\1\3"+
    "\1\0\5\3\2\0\1\3\1\57\5\0\12\3\1\232"+
    "\10\3\20\0\1\3\1\0\5\3\2\0\1\3\1\57"+
    "\5\0\4\3\1\233\16\3\20\0\1\3\1\0\5\3"+
    "\2\0\1\3\1\57\5\0\3\3\1\234\17\3\20\0"+
    "\1\3\1\0\5\3\2\0\1\3\1\57\5\0\23\3"+
    "\20\0\1\3\1\0\1\235\4\3\2\0\1\3\1\57"+
    "\5\0\11\3\1\151\11\3\20\0\1\3\1\0\5\3"+
    "\2\0\1\3\1\57\5\0\6\3\1\236\14\3\20\0"+
    "\1\3\1\0\5\3\2\0\1\3\1\57\5\0\3\3"+
    "\1\237\17\3\20\0\1\3\1\0\5\3\2\0\1\3"+
    "\1\57\5\0\21\3\1\240\1\3\20\0\1\3\1\0"+
    "\5\3\2\0\1\3\1\57\5\0\2\3\1\241\16\3"+
    "\1\242\1\3\20\0\1\3\1\0\5\3\2\0\1\3"+
    "\1\57\5\0\2\3\1\243\20\3\20\0\1\3\1\0"+
    "\5\3\2\0\1\3\1\57\5\0\13\3\1\244\7\3"+
    "\20\0\1\3\1\0\5\3\2\0\1\3\1\57\5\0"+
    "\17\3\1\245\3\3\20\0\1\3\1\0\5\3\2\0"+
    "\1\3\1\57\5\0\14\3\1\151\6\3\20\0\1\3"+
    "\1\0\5\3\2\0\1\3\1\57\5\0\13\3\1\246"+
    "\7\3\20\0\1\3\1\0\5\3\2\0\1\3\1\57"+
    "\5\0\21\3\1\145\1\3\20\0\1\3\1\0\5\3"+
    "\2\0\1\3\1\57\5\0\10\3\1\247\12\3\20\0"+
    "\1\3\1\0\5\3\2\0\1\3\1\57\5\0\3\3"+
    "\1\250\17\3\20\0\1\3\1\0\5\3\2\0\1\3"+
    "\1\57\5\0\4\3\1\251\3\3\1\252\12\3\20\0"+
    "\1\3\1\0\5\3\2\0\1\3\1\57\5\0\1\253"+
    "\22\3\20\0\1\3\1\0\5\3\2\0\1\3\1\57"+
    "\5\0\13\3\1\254\7\3\20\0\1\3\1\0\5\3"+
    "\2\0\1\3\1\57\5\0\4\3\1\255\16\3\20\0"+
    "\1\3\1\0\5\3\2\0\1\3\1\57\5\0\5\3"+
    "\1\256\15\3\20\0\1\3\1\0\5\3\2\0\1\3"+
    "\1\57\5\0\4\3\1\257\16\3\20\0\1\3\1\0"+
    "\5\3\2\0\1\3\1\57\5\0\2\3\1\260\20\3"+
    "\20\0\1\3\1\0\5\3\2\0\1\3\1\57\5\0"+
    "\17\3\1\261\3\3\20\0\1\3\1\0\5\3\2\0"+
    "\1\3\1\57\5\0\5\3\1\262\15\3\20\0\1\3"+
    "\1\0\5\3\2\0\1\3\1\57\5\0\3\3\1\263"+
    "\17\3\20\0\1\3\1\0\5\3\2\0\1\3\1\57"+
    "\5\0\11\3\1\264\11\3\20\0\1\3\1\0\5\3"+
    "\2\0\1\3\1\57\5\0\2\3\1\265\20\3\20\0"+
    "\1\3\1\0\5\3\2\0\1\3\1\57\5\0\12\3"+
    "\1\266\10\3\20\0\1\3\1\0\5\3\3\0\1\213"+
    "\1\267\42\0\1\270\15\0\1\3\1\57\5\0\5\3"+
    "\1\271\15\3\20\0\1\3\1\0\5\3\2\0\1\3"+
    "\1\57\5\0\23\3\20\0\1\3\1\0\4\3\1\272"+
    "\2\0\1\3\1\57\5\0\2\3\1\273\20\3\20\0"+
    "\1\3\1\0\5\3\2\0\1\3\1\57\5\0\12\3"+
    "\1\274\10\3\20\0\1\3\1\0\5\3\2\0\1\3"+
    "\1\57\5\0\16\3\1\275\4\3\20\0\1\3\1\0"+
    "\5\3\2\0\1\3\1\57\5\0\10\3\1\276\12\3"+
    "\20\0\1\3\1\0\5\3\2\0\1\3\1\57\5\0"+
    "\23\3\20\0\1\3\1\0\2\3\1\277\2\3\2\0"+
    "\1\3\1\57\5\0\12\3\1\300\10\3\20\0\1\3"+
    "\1\0\5\3\2\0\1\3\1\57\5\0\22\3\1\301"+
    "\20\0\1\3\1\0\5\3\2\0\1\3\1\57\5\0"+
    "\17\3\1\302\3\3\20\0\1\3\1\0\5\3\2\0"+
    "\1\3\1\57\5\0\5\3\1\303\15\3\20\0\1\3"+
    "\1\0\5\3\2\0\1\3\1\57\5\0\21\3\1\304"+
    "\1\3\20\0\1\3\1\0\5\3\2\0\1\3\1\57"+
    "\5\0\6\3\1\305\14\3\20\0\1\3\1\0\5\3"+
    "\2\0\1\3\1\57\5\0\7\3\1\306\13\3\20\0"+
    "\1\3\1\0\5\3\2\0\1\3\1\57\5\0\21\3"+
    "\1\307\1\3\20\0\1\3\1\0\5\3\2\0\1\3"+
    "\1\57\5\0\4\3\1\310\16\3\20\0\1\3\1\0"+
    "\5\3\2\0\1\3\1\57\5\0\2\3\1\311\20\3"+
    "\20\0\1\3\1\0\5\3\2\0\1\3\1\57\5\0"+
    "\11\3\1\312\11\3\20\0\1\3\1\0\5\3\2\0"+
    "\1\3\1\57\5\0\2\3\1\151\20\3\20\0\1\3"+
    "\1\0\5\3\2\0\1\3\1\57\5\0\2\3\1\313"+
    "\20\3\20\0\1\3\1\0\5\3\2\0\1\3\1\57"+
    "\5\0\5\3\1\314\15\3\20\0\1\3\1\0\5\3"+
    "\2\0\1\3\1\57\5\0\17\3\1\315\3\3\20\0"+
    "\1\3\1\0\5\3\2\0\1\3\1\57\5\0\12\3"+
    "\1\137\10\3\20\0\1\3\1\0\5\3\2\0\1\3"+
    "\1\57\5\0\5\3\1\316\15\3\20\0\1\3\1\0"+
    "\5\3\2\0\1\3\1\57\5\0\14\3\1\317\6\3"+
    "\20\0\1\3\1\0\5\3\2\0\1\3\1\57\5\0"+
    "\14\3\1\320\6\3\20\0\1\3\1\0\5\3\2\0"+
    "\1\3\1\57\5\0\5\3\1\321\15\3\20\0\1\3"+
    "\1\0\5\3\2\0\1\3\1\57\5\0\4\3\1\322"+
    "\16\3\20\0\1\3\1\0\5\3\2\0\1\3\1\57"+
    "\5\0\6\3\1\323\14\3\20\0\1\3\1\0\5\3"+
    "\2\0\1\3\1\57\5\0\3\3\1\324\17\3\20\0"+
    "\1\3\1\0\5\3\2\0\1\3\1\57\5\0\13\3"+
    "\1\325\7\3\20\0\1\3\1\0\5\3\2\0\1\3"+
    "\1\57\5\0\2\3\1\326\20\3\20\0\1\3\1\0"+
    "\5\3\2\0\1\3\1\57\5\0\6\3\1\327\14\3"+
    "\20\0\1\3\1\0\5\3\2\0\1\3\1\57\5\0"+
    "\3\3\1\330\17\3\20\0\1\3\1\0\5\3\3\0"+
    "\1\331\61\0\1\3\1\57\5\0\10\3\1\332\12\3"+
    "\20\0\1\3\1\0\5\3\2\0\1\3\1\57\5\0"+
    "\3\3\1\333\17\3\20\0\1\3\1\0\5\3\2\0"+
    "\1\3\1\57\5\0\4\3\1\334\16\3\20\0\1\3"+
    "\1\0\5\3\2\0\1\3\1\57\5\0\2\3\1\335"+
    "\20\3\20\0\1\3\1\0\5\3\2\0\1\3\1\57"+
    "\5\0\10\3\1\336\12\3\20\0\1\3\1\0\5\3"+
    "\2\0\1\3\1\57\5\0\16\3\1\337\4\3\20\0"+
    "\1\3\1\0\5\3\2\0\1\3\1\57\5\0\3\3"+
    "\1\340\17\3\20\0\1\3\1\0\5\3\2\0\1\3"+
    "\1\57\5\0\23\3\20\0\1\3\1\0\1\3\1\341"+
    "\3\3\2\0\1\3\1\57\5\0\3\3\1\342\17\3"+
    "\20\0\1\3\1\0\5\3\2\0\1\3\1\57\5\0"+
    "\5\3\1\343\15\3\20\0\1\3\1\0\5\3\2\0"+
    "\1\3\1\57\5\0\5\3\1\344\15\3\20\0\1\3"+
    "\1\0\5\3\2\0\1\3\1\57\5\0\3\3\1\345"+
    "\17\3\20\0\1\3\1\0\5\3\2\0\1\3\1\57"+
    "\5\0\3\3\1\346\17\3\20\0\1\3\1\0\5\3"+
    "\2\0\1\3\1\57\5\0\12\3\1\347\10\3\20\0"+
    "\1\3\1\0\5\3\2\0\1\3\1\57\5\0\5\3"+
    "\1\350\15\3\20\0\1\3\1\0\5\3\2\0\1\3"+
    "\1\57\5\0\14\3\1\351\6\3\20\0\1\3\1\0"+
    "\5\3\2\0\1\3\1\57\5\0\6\3\1\352\14\3"+
    "\20\0\1\3\1\0\5\3\2\0\1\3\1\57\5\0"+
    "\2\3\1\353\20\3\20\0\1\3\1\0\5\3\2\0"+
    "\1\3\1\57\5\0\16\3\1\354\4\3\20\0\1\3"+
    "\1\0\5\3\2\0\1\3\1\57\5\0\15\3\1\355"+
    "\5\3\20\0\1\3\1\0\5\3\2\0\1\3\1\57"+
    "\5\0\7\3\1\356\13\3\20\0\1\3\1\0\5\3"+
    "\3\0\1\213\43\0\1\270\15\0\1\3\1\57\5\0"+
    "\2\3\1\357\20\3\20\0\1\3\1\0\5\3\2\0"+
    "\1\3\1\57\5\0\6\3\1\360\14\3\20\0\1\3"+
    "\1\0\5\3\2\0\1\3\1\57\5\0\6\3\1\361"+
    "\14\3\20\0\1\3\1\0\5\3\2\0\1\3\1\57"+
    "\5\0\4\3\1\362\16\3\20\0\1\3\1\0\5\3"+
    "\2\0\1\3\1\57\5\0\2\3\1\363\20\3\20\0"+
    "\1\3\1\0\5\3\2\0\1\3\1\57\5\0\3\3"+
    "\1\364\17\3\20\0\1\3\1\0\5\3\2\0\1\3"+
    "\1\57\5\0\10\3\1\365\12\3\20\0\1\3\1\0"+
    "\5\3\2\0\1\3\1\57\5\0\23\3\20\0\1\3"+
    "\1\0\1\3\1\366\3\3\2\0\1\3\1\57\5\0"+
    "\17\3\1\367\3\3\20\0\1\3\1\0\5\3\2\0"+
    "\1\3\1\57\5\0\2\3\1\370\20\3\20\0\1\3"+
    "\1\0\5\3\2\0\1\3\1\57\5\0\3\3\1\371"+
    "\17\3\20\0\1\3\1\0\5\3\2\0\1\3\1\57"+
    "\5\0\3\3\1\372\17\3\20\0\1\3\1\0\5\3"+
    "\2\0\1\3\1\57\5\0\2\3\1\373\20\3\20\0"+
    "\1\3\1\0\5\3\2\0\1\3\1\57\5\0\12\3"+
    "\1\374\10\3\20\0\1\3\1\0\5\3\2\0\1\3"+
    "\1\57\5\0\3\3\1\375\17\3\20\0\1\3\1\0"+
    "\5\3\2\0\1\3\1\57\5\0\6\3\1\376\14\3"+
    "\20\0\1\3\1\0\5\3\2\0\1\3\1\57\5\0"+
    "\2\3\1\377\20\3\20\0\1\3\1\0\5\3\2\0"+
    "\1\3\1\57\5\0\3\3\1\u0100\17\3\20\0\1\3"+
    "\1\0\5\3\2\0\1\3\1\57\5\0\16\3\1\u0101"+
    "\4\3\20\0\1\3\1\0\5\3\2\0\1\3\1\57"+
    "\5\0\3\3\1\u0102\17\3\20\0\1\3\1\0\5\3"+
    "\2\0\1\3\1\57\5\0\3\3\1\u0103\17\3\20\0"+
    "\1\3\1\0\5\3\2\0\1\3\1\57\5\0\3\3"+
    "\1\u0104\17\3\20\0\1\3\1\0\5\3\2\0\1\3"+
    "\1\57\5\0\16\3\1\u0105\4\3\20\0\1\3\1\0"+
    "\5\3\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[10047];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\2\1\1\11\2\1\2\11\33\1\5\11"+
    "\1\1\1\11\2\1\1\11\1\1\1\0\1\1\1\11"+
    "\42\1\3\11\1\0\4\1\1\0\55\1\1\0\53\1"+
    "\1\0\1\11\40\1\1\0\54\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[261];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 136) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Tokens yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 48: 
          { lexeme=yytext(); return Union;
          }
        case 73: break;
        case 51: 
          { lexeme=yytext(); return While;
          }
        case 74: break;
        case 60: 
          { lexeme=yytext(); return Sizeof;
          }
        case 75: break;
        case 47: 
          { lexeme=yytext(); return Const;
          }
        case 76: break;
        case 2: 
          { lexeme=yytext(); return Identificador;
          }
        case 77: break;
        case 38: 
          { lexeme=yytext(); return Cout;
          }
        case 78: break;
        case 43: 
          { lexeme=yytext(); return Break;
          }
        case 79: break;
        case 15: 
          { lexeme=yytext(); return Parentesis_a;
          }
        case 80: break;
        case 70: 
          { lexeme=yytext(); return Volatile;
          }
        case 81: break;
        case 55: 
          { lexeme=yytext(); return Define;
          }
        case 82: break;
        case 36: 
          { lexeme=yytext(); return Else;
          }
        case 83: break;
        case 69: 
          { lexeme=yytext(); return Unsigned;
          }
        case 84: break;
        case 40: 
          { lexeme=yytext(); return Goto;
          }
        case 85: break;
        case 41: 
          { lexeme=yytext(); return Main;
          }
        case 86: break;
        case 37: 
          { lexeme=yytext(); return Case;
          }
        case 87: break;
        case 32: 
          { lexeme=yytext(); return This;
          }
        case 88: break;
        case 5: 
          { /*Ignore*/
          }
        case 89: break;
        case 49: 
          { lexeme=yytext(); return Using;
          }
        case 90: break;
        case 13: 
          { lexeme=yytext(); return Op_logico;
          }
        case 91: break;
        case 65: 
          { lexeme=yytext(); return Private;
          }
        case 92: break;
        case 35: 
          { lexeme=yytext(); return Elif;
          }
        case 93: break;
        case 45: 
          { lexeme=yytext(); return Catch;
          }
        case 94: break;
        case 18: 
          { lexeme=yytext(); return Llave_c;
          }
        case 95: break;
        case 20: 
          { lexeme = yytext(); return Corchete_c;
          }
        case 96: break;
        case 1: 
          { return ERROR;
          }
        case 97: break;
        case 46: 
          { lexeme=yytext(); return Class;
          }
        case 98: break;
        case 33: 
          { lexeme = yytext(); return Op_booleano;
          }
        case 99: break;
        case 25: 
          { lexeme=yytext(); return Do;
          }
        case 100: break;
        case 21: 
          { lexeme=yytext(); return P_coma;
          }
        case 101: break;
        case 29: 
          { lexeme=yytext(); return Cin;
          }
        case 102: break;
        case 11: 
          { lexeme=yytext(); return Resta;
          }
        case 103: break;
        case 39: 
          { lexeme=yytext(); return Auto;
          }
        case 104: break;
        case 14: 
          { lexeme = yytext(); return Op_relacional;
          }
        case 105: break;
        case 42: 
          { lexeme=yytext(); return Void;
          }
        case 106: break;
        case 59: 
          { lexeme=yytext(); return Signed;
          }
        case 107: break;
        case 52: 
          { lexeme=yytext(); return Inline;
          }
        case 108: break;
        case 9: 
          { lexeme=yytext(); return Igual;
          }
        case 109: break;
        case 57: 
          { lexeme=yytext(); return Static;
          }
        case 110: break;
        case 56: 
          { lexeme=yytext(); return Cadena;
          }
        case 111: break;
        case 10: 
          { lexeme=yytext(); return Suma;
          }
        case 112: break;
        case 26: 
          { lexeme = yytext(); return Op_incremento;
          }
        case 113: break;
        case 28: 
          { lexeme=yytext(); return T_dato;
          }
        case 114: break;
        case 23: 
          { lexeme = yytext(); return Op_atribucion;
          }
        case 115: break;
        case 63: 
          { lexeme=yytext(); return Include;
          }
        case 116: break;
        case 17: 
          { lexeme=yytext(); return Llave_a;
          }
        case 117: break;
        case 12: 
          { lexeme=yytext(); return Asterisco;
          }
        case 118: break;
        case 53: 
          { lexeme=yytext(); return Return;
          }
        case 119: break;
        case 3: 
          { lexeme=yytext(); return Numero;
          }
        case 120: break;
        case 54: 
          { lexeme=yytext(); return Delete;
          }
        case 121: break;
        case 31: 
          { lexeme=yytext(); return For;
          }
        case 122: break;
        case 19: 
          { lexeme = yytext(); return Corchete_a;
          }
        case 123: break;
        case 4: 
          { lexeme=yytext(); return Punto;
          }
        case 124: break;
        case 24: 
          { lexeme=yytext(); return If;
          }
        case 125: break;
        case 66: 
          { lexeme=yytext(); return Template;
          }
        case 126: break;
        case 68: 
          { lexeme=yytext(); return Continue;
          }
        case 127: break;
        case 71: 
          { lexeme=yytext(); return Namespace;
          }
        case 128: break;
        case 67: 
          { lexeme=yytext(); return Noexcept;
          }
        case 129: break;
        case 7: 
          { return Linea;
          }
        case 130: break;
        case 44: 
          { lexeme=yytext(); return Throw;
          }
        case 131: break;
        case 16: 
          { lexeme=yytext(); return Parentesis_c;
          }
        case 132: break;
        case 58: 
          { lexeme=yytext(); return Struct;
          }
        case 133: break;
        case 64: 
          { lexeme=yytext(); return Default;
          }
        case 134: break;
        case 62: 
          { lexeme=yytext(); return Public;
          }
        case 135: break;
        case 34: 
          { lexeme=yytext(); return Enum;
          }
        case 136: break;
        case 27: 
          { lexeme=yytext(); return Try;
          }
        case 137: break;
        case 22: 
          { lexeme=yytext(); return Precarga;
          }
        case 138: break;
        case 30: 
          { lexeme=yytext(); return And;
          }
        case 139: break;
        case 61: 
          { lexeme=yytext(); return Switch;
          }
        case 140: break;
        case 8: 
          { lexeme=yytext(); return Comillas;
          }
        case 141: break;
        case 72: 
          { lexeme=yytext(); return Protected;
          }
        case 142: break;
        case 6: 
          { lexeme=yytext(); return Division;
          }
        case 143: break;
        case 50: 
          { lexeme=yytext(); return Short;
          }
        case 144: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}

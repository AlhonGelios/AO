package padeg.lib;

import java.util.Arrays;
import java.util.List;
import padeg.lib.EDeclenError;
import padeg.lib.FIO;
import padeg.lib.StrUtils;
import padeg.lib.Syllable;

class FioComm {

   public static final String VOCALIC = "аоуыэяеёюи";
   public static final String CONSONANT = "бвгджзйклмнпрстфхцчшщ";
   public static final String SOFT_SIBILANT = "чщ";
   public static final String HARD_SIBILANT = "цш";
   public static final String GKH = "гкх";
   public static final String WORD_DELIMS = " \t";
   public static final String PROPER_DELIMS = " -.,\'\"";
   public static final int declMode = 0;
   public static final int exInvalidCase = -1;
   public static final int exInvalidSex = -2;
   public static final int ACCENT_NO_INFO = 0;
   public static final int ACCENT_LAST = 1;
   public static final int ACCENT_MIDDLE = 2;
   private static final FioComm.TErrorRec[] declenErrorMap = new FioComm.TErrorRec[]{new FioComm.TErrorRec(-1, "Недопустимое значение падежа"), new FioComm.TErrorRec(-2, "Недопустимое значение рода")};
   private static final List rusEnds2 = Arrays.asList(new String[]{"ов", "ев", "ёв", "ин", "ая", "яя"});
   private static final List rusEnds3 = Arrays.asList(new String[]{"ова", "ева", "ёва", "ина", "ска", "цка"});


   public static EDeclenError createDeclenError(int errorCode, String invalidParam) {
      EDeclenError result = null;
      int i = -errorCode - 1;
      if(i < declenErrorMap.length && i >= 0) {
         result = new EDeclenError(declenErrorMap[i].ident + " (" + invalidParam + ")");
         result.setErrorCode(errorCode);
      }

      return result;
   }

   public static boolean isRangeInt(int beg, int end, int value) {
      return value >= beg && value <= end;
   }

   public static void separateFIO(String value, FIO fio) {
      value = value.trim();
      StrUtils.Border[] b = StrUtils.countWords(value, " \t", 4);
      fio.lastName = b.length < 1?"":value.substring(b[0].left, b[0].right);
      fio.firstName = b.length < 2?"":value.substring(b[1].left, b[1].right);
      fio.middleName = b.length < 3?"":value.substring(b[2].left, b[2].right);
      String test = b.length < 4?"":value.substring(b[3].left, b[3].right);
      String s = test.toLowerCase();
      if(s.equals("оглы") || s.equals("кызы")) {
         fio.middleName = fio.middleName + " " + test;
      }

      int pointPos = fio.firstName.indexOf(46);
      if(pointPos > 0) {
         int len = fio.firstName.length();
         if(pointPos != len) {
            fio.middleName = fio.firstName.substring(pointPos + 1);
            fio.firstName = fio.firstName.substring(0, pointPos + 1);
         }
      }

   }

   private static long processCurrSyll(int i, String currSyll) {
      String sonicStr = Syllable.strToSonic(currSyll);
      long sonicVal = Long.parseLong(sonicStr);
      return sonicVal * (long)i * (long)i * (long)i;
   }

   private static long process(String s, boolean extraSyll) {
      if(s.length() == 0) {
         return 0L;
      } else {
         long sonicSum = 0L;
         String tmpS = Syllable.divideOnSyllable(s);
         int p = tmpS.indexOf(45);

         int i;
         for(i = 1; p > 0; p = tmpS.indexOf(45)) {
            String currSyll = tmpS.substring(0, p);
            tmpS = tmpS.substring(p + 1);
            sonicSum += processCurrSyll(i, currSyll);
            ++i;
         }

         if(!extraSyll) {
            sonicSum += processCurrSyll(i, tmpS);
         }

         return sonicSum;
      }
   }

   private static boolean isPadeg(String s) {
      String padegEndings = "аяуюе";
      int l = s.length();
      String end = "";
      if(l > 1) {
         end = s.substring(l - 2);
      }

      return padegEndings.indexOf(s.charAt(l - 1)) >= 0 || end.equals("ом") || end.equals("ем");
   }

   public static boolean chinaName(String cf, String ci, String co) {
      int len = cf.length();
      String end = "";
      if(len > 2) {
         end = cf.substring(len - 2);
         if(rusEnds2.indexOf(end) >= 0) {
            return false;
         }
      }

      if(len > 3) {
         end = cf.substring(len - 3);
         if(rusEnds3.indexOf(end) >= 0) {
            return false;
         }
      }

      boolean extraSyll = false;
      int l1 = Syllable.countSyllable(cf);
      int l2 = Syllable.countSyllable(ci);
      int l3 = Syllable.countSyllable(co);
      if((l1 != 0 || cf.length() <= 0) && l2 != 0 && (l3 != 0 || co.length() <= 0)) {
         if(co.length() > 0) {
            extraSyll = isPadeg(co);
         } else if(ci.length() > 0) {
            extraSyll = isPadeg(ci);
         }

         int totalSyllable = l1 + l2 + l3;
         if(extraSyll) {
            --totalSyllable;
         }

         if(totalSyllable > 6) {
            return false;
         } else {
            FIO fio = new FIO(cf, ci, co);
            separateFIO(cf + ' ' + ci + ' ' + co, fio);
            if(fio.middleName.length() == 0) {
               String sonicVal = Syllable.divideOnSyllable(fio.firstName);
               int p = sonicVal.indexOf(45);
               if(p > 0) {
                  fio.middleName = fio.firstName.substring(p + 1);
                  fio.firstName = fio.firstName.substring(0, p);
               }
            }

            long var13 = process(fio.lastName, extraSyll) + process(fio.firstName, extraSyll) + process(fio.middleName, extraSyll);
            return var13 <= 4300L;
         }
      } else {
         return false;
      }
   }

   public static String getCutFIO(String fio) {
      String WORD_DELIMS = " .";
      fio = fio.trim();
      StringBuilder result = new StringBuilder(fio);
      if(fio.length() > 0) {
         StrUtils.Border[] borders = StrUtils.countWords(fio, WORD_DELIMS);
         if(borders.length > 1) {
            result.setLength(borders[0].right + 1);

            for(int i = 1; i <= 2 && i < borders.length; ++i) {
               result.append(fio.charAt(borders[i].left)).append('.');
            }
         }
      }

      return result.toString();
   }

   public static char getSex(String middleName) {
      int len = middleName.length() - 1;
      char result = 0;
      if(len > 0) {
         middleName = middleName.toLowerCase();
         if(middleName.charAt(len) != 1095 && middleName.charAt(len - 1) != 1095 && !middleName.endsWith("чем") && !middleName.endsWith("оглы")) {
            if("аыеуй".indexOf(middleName.charAt(len)) >= 0 && "но".indexOf(middleName.charAt(len - 1)) >= 0 && "бвгджзйклмнпрстфхцчшщ".indexOf(middleName.charAt(len - 2)) >= 0 || middleName.endsWith("кызы")) {
               result = 1078;
            }
         } else {
            result = 1084;
         }
      }

      return result;
   }

   public static String proper(String str) {
      String result = str.toLowerCase();
      if(!result.equals("фон") && !result.equals("де")) {
         int i = 0;
         int len = result.length();
         char[] ca = result.toCharArray();

         while(i < len) {
            while(i < len && " -.,\'\"".indexOf(ca[i]) >= 0) {
               ++i;
            }

            if(i < len) {
               ca[i] = Character.toUpperCase(ca[i]);
            }

            while(i < len && " -.,\'\"".indexOf(ca[i]) < 0) {
               ++i;
            }
         }

         result = String.valueOf(ca);
         return result;
      } else {
         return result;
      }
   }

   public static StringBuilder proper(StringBuilder str) {
      int len = str.length();

      for(int test = 0; test < len; ++test) {
         str.setCharAt(test, Character.toLowerCase(str.charAt(test)));
      }

      String var4 = str.toString();
      if(!var4.equals("фон") && !var4.equals("де")) {
         int i = 0;

         while(i < len) {
            while(i < len && " -.,\'\"".indexOf(str.charAt(i)) >= 0) {
               ++i;
            }

            if(i < len) {
               str.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }

            while(i < len && " -.,\'\"".indexOf(str.charAt(i)) < 0) {
               ++i;
            }
         }

         return str;
      } else {
         return str;
      }
   }


   private static class TErrorRec {

      int code;
      String ident;


      TErrorRec(int code, String ident) {
         this.code = code;
         this.ident = ident;
      }
   }
}

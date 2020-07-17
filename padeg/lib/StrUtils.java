package padeg.lib;

import java.util.ArrayList;

class StrUtils {

   public static int wordPosition(int n, String s, String wordDelims) {
      int count = 0;
      int i = 0;
      int result = -1;

      while(i < s.length() && count < n) {
         while(i < s.length() && wordDelims.indexOf(s.charAt(i)) >= 0) {
            ++i;
         }

         if(i < s.length()) {
            ++count;
         }

         if(count < n) {
            while(i < s.length() && wordDelims.indexOf(s.charAt(i)) < 0) {
               ++i;
            }
         } else {
            result = i;
         }
      }

      return result;
   }

   static String extractWord(int n, String s, String wordDelims) {
      int i = wordPosition(n, s, wordDelims);
      if(i < 0) {
         return "";
      } else {
         int j;
         for(j = i; j < s.length() && wordDelims.indexOf(s.charAt(j)) < 0; ++j) {
            ;
         }

         return s.substring(i, j);
      }
   }

   public static int wordCount(String s, String wordDelims) {
      int result = 0;
      int i = 0;
      int len = s.length();

      while(i < len) {
         while(i < len && wordDelims.indexOf(s.charAt(i)) >= 0) {
            ++i;
         }

         if(i < len) {
            ++result;
         }

         while(i < len && wordDelims.indexOf(s.charAt(i)) < 0) {
            ++i;
         }
      }

      return result;
   }

   static StrUtils.Border[] countWords(String s, String wordDelims, int max) {
      ArrayList result = new ArrayList();
      int i = 0;
      int len = s.length();

      while(i < len) {
         while(i < len && wordDelims.indexOf(s.charAt(i)) >= 0) {
            ++i;
         }

         if(i < len) {
            StrUtils.Border border = new StrUtils.Border();
            result.add(border);

            for(border.left = i++; i < len && wordDelims.indexOf(s.charAt(i)) < 0; ++i) {
               ;
            }

            border.right = i;
            if(max > 0 && result.size() >= max) {
               break;
            }
         }
      }

      return (StrUtils.Border[])result.toArray(new StrUtils.Border[result.size()]);
   }

   static StrUtils.Border[] countWords(String s, String wordDelims) {
      return countWords(s, wordDelims, 0);
   }

   public static String properCase(String s, String wordDelims) {
      String result = s.toLowerCase();
      char[] ca = result.toCharArray();
      int i = 0;
      int len = result.length();

      while(i < len) {
         while(i < len && wordDelims.indexOf(result.charAt(i)) >= 0) {
            ++i;
         }

         if(i < len) {
            ca[i] = Character.toUpperCase(ca[i]);
         }

         while(i < len && wordDelims.indexOf(result.charAt(i)) < 0) {
            ++i;
         }
      }

      result = String.valueOf(ca);
      return result;
   }

   static class Border {

      int left;
      int right;


   }
}

package org.apache.poi.ss.util;


public class WorkbookUtil {

   public static final String createSafeSheetName(String nameProposal) {
      return createSafeSheetName(nameProposal, ' ');
   }

   public static final String createSafeSheetName(String nameProposal, char replaceChar) {
      if(nameProposal == null) {
         return "null";
      } else if(nameProposal.length() < 1) {
         return "empty";
      } else {
         int length = Math.min(31, nameProposal.length());
         String shortenname = nameProposal.substring(0, length);
         StringBuilder result = new StringBuilder(shortenname);

         for(int i = 0; i < length; ++i) {
            char ch = result.charAt(i);
            switch(ch) {
            case 0:
            case 3:
            case 42:
            case 47:
            case 58:
            case 63:
            case 91:
            case 92:
            case 93:
               result.setCharAt(i, replaceChar);
               break;
            case 39:
               if(i == 0 || i == length - 1) {
                  result.setCharAt(i, replaceChar);
               }
            }
         }

         return result.toString();
      }
   }

   public static void validateSheetName(String sheetName) {
      if(sheetName == null) {
         throw new IllegalArgumentException("sheetName must not be null");
      } else {
         int len = sheetName.length();
         if(len >= 1 && len <= 31) {
            int i = 0;

            while(i < len) {
               char ch = sheetName.charAt(i);
               switch(ch) {
               case 42:
               case 47:
               case 58:
               case 63:
               case 91:
               case 92:
               case 93:
                  throw new IllegalArgumentException("Invalid char (" + ch + ") found at index (" + i + ") in sheet name \'" + sheetName + "\'");
               default:
                  ++i;
               }
            }

            if(sheetName.charAt(0) == 39 || sheetName.charAt(len - 1) == 39) {
               throw new IllegalArgumentException("Invalid sheet name \'" + sheetName + "\'. Sheet names must not begin or end with (\').");
            }
         } else {
            throw new IllegalArgumentException("sheetName \'" + sheetName + "\' is invalid - character count MUST be greater than or equal to 1 and less than or equal to 31");
         }
      }
   }

   public static void validateSheetState(int state) {
      switch(state) {
      case 0:
      case 1:
      case 2:
         return;
      default:
         throw new IllegalArgumentException("Ivalid sheet state : " + state + "\n" + "Sheet state must beone of the Workbook.SHEET_STATE_* constants");
      }
   }
}

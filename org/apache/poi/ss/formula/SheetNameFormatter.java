package org.apache.poi.ss.formula;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.util.CellReference;

public final class SheetNameFormatter {

   private static final char DELIMITER = '\'';
   private static final Pattern CELL_REF_PATTERN = Pattern.compile("([A-Za-z]+)([0-9]+)");


   public static String format(String rawSheetName) {
      StringBuffer sb = new StringBuffer(rawSheetName.length() + 2);
      appendFormat(sb, rawSheetName);
      return sb.toString();
   }

   public static void appendFormat(StringBuffer out, String rawSheetName) {
      boolean needsQuotes = needsDelimiting(rawSheetName);
      if(needsQuotes) {
         out.append('\'');
         appendAndEscape(out, rawSheetName);
         out.append('\'');
      } else {
         out.append(rawSheetName);
      }

   }

   public static void appendFormat(StringBuffer out, String workbookName, String rawSheetName) {
      boolean needsQuotes = needsDelimiting(workbookName) || needsDelimiting(rawSheetName);
      if(needsQuotes) {
         out.append('\'');
         out.append('[');
         appendAndEscape(out, workbookName.replace('[', '(').replace(']', ')'));
         out.append(']');
         appendAndEscape(out, rawSheetName);
         out.append('\'');
      } else {
         out.append('[');
         out.append(workbookName);
         out.append(']');
         out.append(rawSheetName);
      }

   }

   private static void appendAndEscape(StringBuffer sb, String rawSheetName) {
      int len = rawSheetName.length();

      for(int i = 0; i < len; ++i) {
         char ch = rawSheetName.charAt(i);
         if(ch == 39) {
            sb.append('\'');
         }

         sb.append(ch);
      }

   }

   private static boolean needsDelimiting(String rawSheetName) {
      int len = rawSheetName.length();
      if(len < 1) {
         throw new RuntimeException("Zero length string is an invalid sheet name");
      } else if(Character.isDigit(rawSheetName.charAt(0))) {
         return true;
      } else {
         for(int i = 0; i < len; ++i) {
            char ch = rawSheetName.charAt(i);
            if(isSpecialChar(ch)) {
               return true;
            }
         }

         if(Character.isLetter(rawSheetName.charAt(0)) && Character.isDigit(rawSheetName.charAt(len - 1)) && nameLooksLikePlainCellReference(rawSheetName)) {
            return true;
         } else if(nameLooksLikeBooleanLiteral(rawSheetName)) {
            return true;
         } else {
            return false;
         }
      }
   }

   private static boolean nameLooksLikeBooleanLiteral(String rawSheetName) {
      switch(rawSheetName.charAt(0)) {
      case 70:
      case 102:
         return "FALSE".equalsIgnoreCase(rawSheetName);
      case 84:
      case 116:
         return "TRUE".equalsIgnoreCase(rawSheetName);
      default:
         return false;
      }
   }

   static boolean isSpecialChar(char ch) {
      if(Character.isLetterOrDigit(ch)) {
         return false;
      } else {
         switch(ch) {
         case 9:
         case 10:
         case 13:
            throw new RuntimeException("Illegal character (0x" + Integer.toHexString(ch) + ") found in sheet name");
         case 46:
         case 95:
            return false;
         default:
            return true;
         }
      }
   }

   static boolean cellReferenceIsWithinRange(String lettersPrefix, String numbersSuffix) {
      return CellReference.cellReferenceIsWithinRange(lettersPrefix, numbersSuffix, SpreadsheetVersion.EXCEL97);
   }

   static boolean nameLooksLikePlainCellReference(String rawSheetName) {
      Matcher matcher = CELL_REF_PATTERN.matcher(rawSheetName);
      if(!matcher.matches()) {
         return false;
      } else {
         String lettersPrefix = matcher.group(1);
         String numbersSuffix = matcher.group(2);
         return cellReferenceIsWithinRange(lettersPrefix, numbersSuffix);
      }
   }

}

package org.apache.poi.ss.formula.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import org.apache.poi.ss.formula.function.FunctionDataBuilder;
import org.apache.poi.ss.formula.function.FunctionMetadataRegistry;

final class FunctionMetadataReader {

   private static final String METADATA_FILE_NAME = "functionMetadata.txt";
   private static final String ELLIPSIS = "...";
   private static final Pattern TAB_DELIM_PATTERN = Pattern.compile("\t");
   private static final Pattern SPACE_DELIM_PATTERN = Pattern.compile(" ");
   private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
   private static final String[] DIGIT_ENDING_FUNCTION_NAMES = new String[]{"LOG10", "ATAN2", "DAYS360", "SUMXMY2", "SUMX2MY2", "SUMX2PY2"};
   private static final Set DIGIT_ENDING_FUNCTION_NAMES_SET = new HashSet(Arrays.asList(DIGIT_ENDING_FUNCTION_NAMES));


   public static FunctionMetadataRegistry createRegistry() {
      try {
         InputStream e = FunctionMetadataReader.class.getResourceAsStream("functionMetadata.txt");
         if(e == null) {
            throw new RuntimeException("resource \'functionMetadata.txt\' not found");
         } else {
            try {
               BufferedReader br;
               try {
                  br = new BufferedReader(new InputStreamReader(e, "UTF-8"));
               } catch (UnsupportedEncodingException var15) {
                  throw new RuntimeException(var15);
               }

               try {
                  FunctionDataBuilder fdb = new FunctionDataBuilder(400);

                  while(true) {
                     String line = br.readLine();
                     if(line == null) {
                        FunctionMetadataRegistry line1 = fdb.build();
                        return line1;
                     }

                     if(line.length() >= 1 && line.charAt(0) != 35) {
                        String trimLine = line.trim();
                        if(trimLine.length() >= 1) {
                           processLine(fdb, line);
                        }
                     }
                  }
               } finally {
                  br.close();
               }
            } finally {
               e.close();
            }
         }
      } catch (IOException var18) {
         throw new RuntimeException(var18);
      }
   }

   private static void processLine(FunctionDataBuilder fdb, String line) {
      String[] parts = TAB_DELIM_PATTERN.split(line, -2);
      if(parts.length != 8) {
         throw new RuntimeException("Bad line format \'" + line + "\' - expected 8 data fields");
      } else {
         int functionIndex = parseInt(parts[0]);
         String functionName = parts[1];
         int minParams = parseInt(parts[2]);
         int maxParams = parseInt(parts[3]);
         byte returnClassCode = parseReturnTypeCode(parts[4]);
         byte[] parameterClassCodes = parseOperandTypeCodes(parts[5]);
         boolean hasNote = parts[7].length() > 0;
         validateFunctionName(functionName);
         fdb.add(functionIndex, functionName, minParams, maxParams, returnClassCode, parameterClassCodes, hasNote);
      }
   }

   private static byte parseReturnTypeCode(String code) {
      return code.length() == 0?0:parseOperandTypeCode(code);
   }

   private static byte[] parseOperandTypeCodes(String codes) {
      if(codes.length() < 1) {
         return EMPTY_BYTE_ARRAY;
      } else if(isDash(codes)) {
         return EMPTY_BYTE_ARRAY;
      } else {
         String[] array = SPACE_DELIM_PATTERN.split(codes);
         int nItems = array.length;
         if("...".equals(array[nItems - 1])) {
            --nItems;
         }

         byte[] result = new byte[nItems];

         for(int i = 0; i < nItems; ++i) {
            result[i] = parseOperandTypeCode(array[i]);
         }

         return result;
      }
   }

   private static boolean isDash(String codes) {
      if(codes.length() == 1) {
         switch(codes.charAt(0)) {
         case 45:
            return true;
         }
      }

      return false;
   }

   private static byte parseOperandTypeCode(String code) {
      if(code.length() != 1) {
         throw new RuntimeException("Bad operand type code format \'" + code + "\' expected single char");
      } else {
         switch(code.charAt(0)) {
         case 65:
            return (byte)64;
         case 82:
            return (byte)0;
         case 86:
            return (byte)32;
         default:
            throw new IllegalArgumentException("Unexpected operand type code \'" + code + "\' (" + code.charAt(0) + ")");
         }
      }
   }

   private static void validateFunctionName(String functionName) {
      int len = functionName.length();
      int ix = len - 1;
      if(Character.isDigit(functionName.charAt(ix))) {
         while(ix >= 0 && Character.isDigit(functionName.charAt(ix))) {
            --ix;
         }

         if(!DIGIT_ENDING_FUNCTION_NAMES_SET.contains(functionName)) {
            throw new RuntimeException("Invalid function name \'" + functionName + "\' (is footnote number incorrectly appended)");
         }
      }
   }

   private static int parseInt(String valStr) {
      try {
         return Integer.parseInt(valStr);
      } catch (NumberFormatException var2) {
         throw new RuntimeException("Value \'" + valStr + "\' could not be parsed as an integer");
      }
   }

}

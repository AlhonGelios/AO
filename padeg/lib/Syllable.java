package padeg.lib;


public class Syllable {

   private static final String vocalic = "аоуыэяеёюи";
   private static final String legalChar = "абвгдежзийклмнопрстуфхцчшщъыьэюя";
   private int i;
   private int j;
   private int nSyllable;
   private StringBuilder outStr = new StringBuilder();
   private boolean vocalicExist;
   private String inString;
   private char[] lowChars;


   private static char sonic(char index) {
      return "31111311321222312113111111^3^333".charAt(index - 1072);
   }

   public static int countSyllable(String anyWord) {
      int result = 0;
      anyWord = anyWord.toLowerCase();

      for(int i = 0; i < anyWord.length(); ++i) {
         if("аоуыэяеёюи".indexOf(anyWord.charAt(i)) >= 0) {
            ++result;
         }
      }

      return result;
   }

   private static boolean isLegalChar(char ch) {
      return "абвгдежзийклмнопрстуфхцчшщъыьэюя".charAt(0) <= ch && ch <= "абвгдежзийклмнопрстуфхцчшщъыьэюя".charAt("абвгдежзийклмнопрстуфхцчшщъыьэюя".length() - 1);
   }

   public static String strToSonic(String value) {
      StringBuilder result = new StringBuilder();
      value = value.toLowerCase().replace("ё", "е");

      for(int i = 0; i < value.length(); ++i) {
         char ch = value.charAt(i);
         if(isLegalChar(ch)) {
            char test = sonic(ch);
            if(test != 94) {
               result.append(test);
            }
         }
      }

      return result.toString();
   }

   private static void setCut(Syllable.Locals l) {
      if(l.nSyllable > 0 && l.vocalicExist && l.outStr.charAt(l.outStr.length() - 1) != 45) {
         l.outStr.append("-");
         --l.nSyllable;
         ++l.i;
         l.vocalicExist = false;
      }

   }

   private static void copyChar(String anyWord, char[] inStrL, Syllable.Locals l) {
      if(l.j < anyWord.length()) {
         l.outStr.append(anyWord.charAt(l.j));
         if("аоуыэяеёюи".indexOf(inStrL[l.j]) >= 0) {
            l.vocalicExist = true;
         }

         ++l.j;
         if(l.j < inStrL.length && "ъь".indexOf(inStrL[l.j]) >= 0) {
            copyChar(anyWord, inStrL, l);
         }

      }
   }

   public static String divideOnSyllable(String anyWord) {
      Syllable syllable = new Syllable();
      return syllable.divideOnSyllableInt(anyWord);
   }

   private static String divideOnSyllableOld(String anyWord) {
      Syllable.Locals l = new Syllable.Locals((Syllable.NamelessClass879063572)null);
      int separator = anyWord.indexOf("-");
      if(separator >= 0) {
         return divideOnSyllable(anyWord.substring(0, separator)) + "--" + divideOnSyllable(anyWord.substring(separator + 1));
      } else {
         l.vocalicExist = false;
         l.nSyllable = countSyllable(anyWord);
         if(l.nSyllable <= 1) {
            return anyWord;
         } else {
            --l.nSyllable;
            char[] inStrL = anyWord.toLowerCase().toCharArray();
            char[] sonicStr = strToSonic(anyWord).toCharArray();
            l.i = 0;
            l.j = 0;

            do {
               if(sonicStr[l.i] < sonicStr[l.i + 1]) {
                  copyChar(anyWord, inStrL, l);
                  ++l.i;
               } else if(sonicStr[l.i] == sonicStr[l.i + 1]) {
                  switch(sonicStr[l.i]) {
                  case 49:
                     if(l.i == 0) {
                        copyChar(anyWord, inStrL, l);
                        ++l.i;
                     } else if(inStrL[l.j] == inStrL[l.j + 1]) {
                        copyChar(anyWord, inStrL, l);
                        setCut(l);
                     } else if(l.vocalicExist) {
                        setCut(l);
                        copyChar(anyWord, inStrL, l);
                     } else {
                        copyChar(anyWord, inStrL, l);
                        ++l.i;
                     }
                     break;
                  case 50:
                     if(sonicStr[l.i + 1] < sonicStr[l.i + 2]) {
                        copyChar(anyWord, inStrL, l);
                        setCut(l);
                     } else {
                        ++l.i;
                     }
                     break;
                  case 51:
                     copyChar(anyWord, inStrL, l);
                     setCut(l);
                  }
               } else if(sonicStr[l.i] > sonicStr[l.i + 1]) {
                  copyChar(anyWord, inStrL, l);
                  if(inStrL[l.j] == 1081) {
                     copyChar(anyWord, inStrL, l);
                     setCut(l);
                     ++l.i;
                  } else if(sonicStr[l.i + 1] > sonicStr[l.i + 2]) {
                     ++l.i;
                  } else if(sonicStr[l.i + 1] < sonicStr[l.i + 2]) {
                     if(inStrL[l.j + 1] == 1100 && l.j > 2 && "аоуыэяеёюи".indexOf(inStrL[l.j + 2]) < 0 && sonicStr[l.i + 1] != 49) {
                        copyChar(anyWord, inStrL, l);
                        setCut(l);
                        ++l.i;
                     } else if(l.vocalicExist) {
                        setCut(l);
                     } else {
                        ++l.i;
                     }
                  } else {
                     ++l.i;
                  }
               }

               if(!isLegalChar(inStrL[l.j])) {
                  copyChar(anyWord, inStrL, l);
               }
            } while(l.nSyllable > 0);

            for(l.i = l.j; l.i < inStrL.length; ++l.i) {
               copyChar(anyWord, inStrL, l);
            }

            return l.outStr.toString();
         }
      }
   }

   private void setCut() {
      if(this.nSyllable > 0 && this.vocalicExist && this.outStr.charAt(this.outStr.length() - 1) != 45) {
         this.outStr.append("-");
         --this.nSyllable;
         ++this.i;
         this.vocalicExist = false;
      }

   }

   private void copyChar() {
      if(this.j < this.inString.length()) {
         this.outStr.append(this.inString.charAt(this.j));
         if("аоуыэяеёюи".indexOf(this.lowChars[this.j]) >= 0) {
            this.vocalicExist = true;
         }

         ++this.j;
         if(this.j < this.lowChars.length && "ъь".indexOf(this.lowChars[this.j]) >= 0) {
            this.outStr.append(this.inString.charAt(this.j));
            ++this.j;
         }

      }
   }

   public String divideOnSyllableInt(String anyWord) {
      int separator = anyWord.indexOf("-");
      if(separator >= 0) {
         return this.divideOnSyllableInt(anyWord.substring(0, separator)) + "--" + this.divideOnSyllableInt(anyWord.substring(separator + 1));
      } else {
         this.nSyllable = countSyllable(anyWord);
         if(this.nSyllable <= 1) {
            return anyWord;
         } else {
            --this.nSyllable;
            this.vocalicExist = false;
            this.inString = anyWord;
            this.lowChars = anyWord.toLowerCase().toCharArray();
            char[] sonicChars = strToSonic(anyWord).toCharArray();
            this.i = 0;
            this.j = 0;

            do {
               if(sonicChars[this.i] < sonicChars[this.i + 1]) {
                  this.copyChar();
                  ++this.i;
               } else if(sonicChars[this.i] == sonicChars[this.i + 1]) {
                  switch(sonicChars[this.i]) {
                  case 49:
                     if(this.i == 0) {
                        this.copyChar();
                        ++this.i;
                     } else if(this.lowChars[this.j] == this.lowChars[this.j + 1]) {
                        this.copyChar();
                        this.setCut();
                     } else if(this.vocalicExist) {
                        this.setCut();
                        this.copyChar();
                     } else {
                        this.copyChar();
                        ++this.i;
                     }
                     break;
                  case 50:
                     if(sonicChars[this.i + 1] < sonicChars[this.i + 2]) {
                        this.copyChar();
                        this.setCut();
                     } else {
                        ++this.i;
                     }
                     break;
                  case 51:
                     this.copyChar();
                     this.setCut();
                  }
               } else if(sonicChars[this.i] > sonicChars[this.i + 1]) {
                  this.copyChar();
                  if(this.lowChars[this.j] == 1081) {
                     this.copyChar();
                     this.setCut();
                     ++this.i;
                  } else if(sonicChars[this.i + 1] > sonicChars[this.i + 2]) {
                     ++this.i;
                  } else if(sonicChars[this.i + 1] < sonicChars[this.i + 2]) {
                     if(this.lowChars[this.j + 1] == 1100 && this.j > 2 && "аоуыэяеёюи".indexOf(this.lowChars[this.j + 2]) < 0 && sonicChars[this.i + 1] != 49) {
                        this.copyChar();
                        this.setCut();
                        ++this.i;
                     } else if(this.vocalicExist) {
                        this.setCut();
                     } else {
                        ++this.i;
                     }
                  } else {
                     ++this.i;
                  }
               }

               if(!isLegalChar(this.lowChars[this.j])) {
                  this.outStr.append(this.inString.charAt(this.j));
                  ++this.j;
               }
            } while(this.nSyllable > 0);

            if(this.j < this.inString.length()) {
               this.outStr.append(this.inString.substring(this.j));
            }

            return this.outStr.toString();
         }
      }
   }

   private static class Locals {

      int i;
      int j;
      int nSyllable;
      StringBuilder outStr;
      private boolean vocalicExist;


      private Locals() {
         this.outStr = new StringBuilder();
      }

      // $FF: synthetic method
      Locals(Syllable.NamelessClass879063572 x0) {
         this();
      }
   }

   // $FF: synthetic class
   static class NamelessClass879063572 {
   }
}

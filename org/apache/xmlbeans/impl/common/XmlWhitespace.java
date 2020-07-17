package org.apache.xmlbeans.impl.common;


public class XmlWhitespace {

   public static final int WS_UNSPECIFIED = 0;
   public static final int WS_PRESERVE = 1;
   public static final int WS_REPLACE = 2;
   public static final int WS_COLLAPSE = 3;


   public static boolean isSpace(char ch) {
      switch(ch) {
      case 9:
      case 10:
      case 13:
      case 32:
         return true;
      default:
         return false;
      }
   }

   public static boolean isAllSpace(String v) {
      int i = 0;

      for(int len = v.length(); i < len; ++i) {
         if(!isSpace(v.charAt(i))) {
            return false;
         }
      }

      return true;
   }

   public static boolean isAllSpace(CharSequence v) {
      int i = 0;

      for(int len = v.length(); i < len; ++i) {
         if(!isSpace(v.charAt(i))) {
            return false;
         }
      }

      return true;
   }

   public static String collapse(String v) {
      return collapse(v, 3);
   }

   public static String collapse(String v, int wsr) {
      if(wsr != 1 && wsr != 0) {
         if(v.indexOf(10) >= 0) {
            v = v.replace('\n', ' ');
         }

         if(v.indexOf(9) >= 0) {
            v = v.replace('\t', ' ');
         }

         if(v.indexOf(13) >= 0) {
            v = v.replace('\r', ' ');
         }

         if(wsr == 2) {
            return v;
         } else {
            int j = 0;
            int len = v.length();
            if(len == 0) {
               return v;
            } else {
               int i;
               if(v.charAt(0) != 32) {
                  j = 2;

                  while(true) {
                     if(j < len) {
                        label97: {
                           if(v.charAt(j) == 32) {
                              if(v.charAt(j - 1) == 32 || j == len - 1) {
                                 break label97;
                              }

                              ++j;
                              if(v.charAt(j) == 32) {
                                 break label97;
                              }
                           }

                           j += 2;
                           continue;
                        }
                     } else if(j != len || v.charAt(j - 1) != 32) {
                        return v;
                     }

                     i = j;
                     break;
                  }
               } else {
                  while(j + 1 < v.length() && v.charAt(j + 1) == 32) {
                     ++j;
                  }

                  i = 0;
               }

               char[] ch = v.toCharArray();

               while(true) {
                  ++j;
                  if(j >= len) {
                     return new String(ch, 0, i != 0 && ch[i - 1] == 32?i - 1:i);
                  }

                  if(v.charAt(j) != 32) {
                     while(true) {
                        ch[i++] = ch[j++];
                        if(j >= len) {
                           return new String(ch, 0, i != 0 && ch[i - 1] == 32?i - 1:i);
                        }

                        if(ch[j] == 32) {
                           ch[i++] = ch[j++];
                           if(j >= len) {
                              return new String(ch, 0, i != 0 && ch[i - 1] == 32?i - 1:i);
                           }

                           if(ch[j] == 32) {
                              break;
                           }
                        }
                     }
                  }
               }
            }
         }
      } else {
         return v;
      }
   }
}

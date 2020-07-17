package org.apache.xmlbeans.impl.regex;

import java.text.CharacterIterator;
import org.apache.xmlbeans.impl.regex.Match;
import org.apache.xmlbeans.impl.regex.ParseException;
import org.apache.xmlbeans.impl.regex.RegularExpression;

public final class REUtil {

   static final int CACHESIZE = 20;
   static final RegularExpression[] regexCache = new RegularExpression[20];


   static final int composeFromSurrogates(int high, int low) {
      return 65536 + (high - '\ud800' << 10) + low - '\udc00';
   }

   static final boolean isLowSurrogate(int ch) {
      return (ch & '\ufc00') == '\udc00';
   }

   static final boolean isHighSurrogate(int ch) {
      return (ch & '\ufc00') == '\ud800';
   }

   static final String decomposeToSurrogates(int ch) {
      char[] chs = new char[2];
      ch -= 65536;
      chs[0] = (char)((ch >> 10) + '\ud800');
      chs[1] = (char)((ch & 1023) + '\udc00');
      return new String(chs);
   }

   static final String substring(CharacterIterator iterator, int begin, int end) {
      char[] src = new char[end - begin];

      for(int i = 0; i < src.length; ++i) {
         src[i] = iterator.setIndex(i + begin);
      }

      return new String(src);
   }

   static final int getOptionValue(int ch) {
      short ret = 0;
      switch(ch) {
      case 44:
         ret = 1024;
         break;
      case 70:
         ret = 256;
         break;
      case 72:
         ret = 128;
         break;
      case 88:
         ret = 512;
         break;
      case 105:
         ret = 2;
         break;
      case 109:
         ret = 8;
         break;
      case 115:
         ret = 4;
         break;
      case 117:
         ret = 32;
         break;
      case 119:
         ret = 64;
         break;
      case 120:
         ret = 16;
      }

      return ret;
   }

   static final int parseOptions(String opts) throws ParseException {
      if(opts == null) {
         return 0;
      } else {
         int options = 0;

         for(int i = 0; i < opts.length(); ++i) {
            int v = getOptionValue(opts.charAt(i));
            if(v == 0) {
               throw new ParseException("Unknown Option: " + opts.substring(i), -1);
            }

            options |= v;
         }

         return options;
      }
   }

   static final String createOptionString(int options) {
      StringBuffer sb = new StringBuffer(9);
      if((options & 256) != 0) {
         sb.append('F');
      }

      if((options & 128) != 0) {
         sb.append('H');
      }

      if((options & 512) != 0) {
         sb.append('X');
      }

      if((options & 2) != 0) {
         sb.append('i');
      }

      if((options & 8) != 0) {
         sb.append('m');
      }

      if((options & 4) != 0) {
         sb.append('s');
      }

      if((options & 32) != 0) {
         sb.append('u');
      }

      if((options & 64) != 0) {
         sb.append('w');
      }

      if((options & 16) != 0) {
         sb.append('x');
      }

      if((options & 1024) != 0) {
         sb.append(',');
      }

      return sb.toString().intern();
   }

   static String stripExtendedComment(String regex) {
      int len = regex.length();
      StringBuffer buffer = new StringBuffer(len);
      int offset = 0;

      while(offset < len) {
         char ch = regex.charAt(offset++);
         if(ch != 9 && ch != 10 && ch != 12 && ch != 13 && ch != 32) {
            if(ch == 35) {
               while(offset < len) {
                  ch = regex.charAt(offset++);
                  if(ch == 13 || ch == 10) {
                     break;
                  }
               }
            } else if(ch == 92 && offset < len) {
               char next;
               if((next = regex.charAt(offset)) != 35 && next != 9 && next != 10 && next != 12 && next != 13 && next != 32) {
                  buffer.append('\\');
                  buffer.append((char)next);
                  ++offset;
               } else {
                  buffer.append((char)next);
                  ++offset;
               }
            } else {
               buffer.append((char)ch);
            }
         }
      }

      return buffer.toString();
   }

   public static void main(String[] argv) {
      String pattern = null;

      String indent;
      int loc;
      try {
         String e = "";
         indent = null;
         if(argv.length == 0) {
            System.out.println("Error:Usage: java REUtil -i|-m|-s|-u|-w|-X regularExpression String");
            System.exit(0);
         }

         for(loc = 0; loc < argv.length; ++loc) {
            if(argv[loc].length() != 0 && argv[loc].charAt(0) == 45) {
               if(argv[loc].equals("-i")) {
                  e = e + "i";
               } else if(argv[loc].equals("-m")) {
                  e = e + "m";
               } else if(argv[loc].equals("-s")) {
                  e = e + "s";
               } else if(argv[loc].equals("-u")) {
                  e = e + "u";
               } else if(argv[loc].equals("-w")) {
                  e = e + "w";
               } else if(argv[loc].equals("-X")) {
                  e = e + "X";
               } else {
                  System.err.println("Unknown option: " + argv[loc]);
               }
            } else if(pattern == null) {
               pattern = argv[loc];
            } else if(indent == null) {
               indent = argv[loc];
            } else {
               System.err.println("Unnecessary: " + argv[loc]);
            }
         }

         RegularExpression var9 = new RegularExpression(pattern, e);
         System.out.println("RegularExpression: " + var9);
         Match var10 = new Match();
         var9.matches(indent, var10);

         for(int i1 = 0; i1 < var10.getNumberOfGroups(); ++i1) {
            if(i1 == 0) {
               System.out.print("Matched range for the whole pattern: ");
            } else {
               System.out.print("[" + i1 + "]: ");
            }

            if(var10.getBeginning(i1) < 0) {
               System.out.println("-1");
            } else {
               System.out.print(var10.getBeginning(i1) + ", " + var10.getEnd(i1) + ", ");
               System.out.println("\"" + var10.getCapturedText(i1) + "\"");
            }
         }
      } catch (ParseException var7) {
         if(pattern == null) {
            var7.printStackTrace();
         } else {
            System.err.println("org.apache.xerces.utils.regex.ParseException: " + var7.getMessage());
            indent = "        ";
            System.err.println(indent + pattern);
            loc = var7.getLocation();
            if(loc >= 0) {
               System.err.print(indent);

               for(int i = 0; i < loc; ++i) {
                  System.err.print("-");
               }

               System.err.println("^");
            }
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }

   }

   public static RegularExpression createRegex(String pattern, String options) throws ParseException {
      RegularExpression re = null;
      int intOptions = parseOptions(options);
      RegularExpression[] var4 = regexCache;
      synchronized(regexCache) {
         int i;
         for(i = 0; i < 20; ++i) {
            RegularExpression cached = regexCache[i];
            if(cached == null) {
               i = -1;
               break;
            }

            if(cached.equals(pattern, intOptions)) {
               re = cached;
               break;
            }
         }

         if(re != null) {
            if(i != 0) {
               System.arraycopy(regexCache, 0, regexCache, 1, i);
               regexCache[0] = re;
            }
         } else {
            re = new RegularExpression(pattern, options);
            System.arraycopy(regexCache, 0, regexCache, 1, 19);
            regexCache[0] = re;
         }

         return re;
      }
   }

   public static boolean matches(String regex, String target) throws ParseException {
      return createRegex(regex, (String)null).matches(target);
   }

   public static boolean matches(String regex, String options, String target) throws ParseException {
      return createRegex(regex, options).matches(target);
   }

   public static String quoteMeta(String literal) {
      int len = literal.length();
      StringBuffer buffer = null;

      for(int i = 0; i < len; ++i) {
         char ch = literal.charAt(i);
         if(".*+?{[()|\\^$".indexOf(ch) >= 0) {
            if(buffer == null) {
               buffer = new StringBuffer(i + (len - i) * 2);
               if(i > 0) {
                  buffer.append(literal.substring(0, i));
               }
            }

            buffer.append('\\');
            buffer.append((char)ch);
         } else if(buffer != null) {
            buffer.append((char)ch);
         }
      }

      return buffer != null?buffer.toString():literal;
   }

   static void dumpString(String v) {
      for(int i = 0; i < v.length(); ++i) {
         System.out.print(Integer.toHexString(v.charAt(i)));
         System.out.print(" ");
      }

      System.out.println();
   }

}

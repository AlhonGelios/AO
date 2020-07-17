package org.apache.xmlbeans.impl.regex;

import java.io.Serializable;
import java.text.CharacterIterator;
import org.apache.xmlbeans.impl.regex.BMPattern;
import org.apache.xmlbeans.impl.regex.Match;
import org.apache.xmlbeans.impl.regex.Op;
import org.apache.xmlbeans.impl.regex.ParseException;
import org.apache.xmlbeans.impl.regex.ParserForXMLSchema;
import org.apache.xmlbeans.impl.regex.REUtil;
import org.apache.xmlbeans.impl.regex.RangeToken;
import org.apache.xmlbeans.impl.regex.RegexParser;
import org.apache.xmlbeans.impl.regex.Token;

public class RegularExpression implements Serializable {

   static final boolean DEBUG = false;
   String regex;
   int options;
   int nofparen;
   Token tokentree;
   boolean hasBackReferences = false;
   transient int minlength;
   transient Op operations = null;
   transient int numberOfClosures;
   transient RegularExpression.Context context = null;
   transient RangeToken firstChar = null;
   transient String fixedString = null;
   transient int fixedStringOptions;
   transient BMPattern fixedStringTable = null;
   transient boolean fixedStringOnly = false;
   static final int IGNORE_CASE = 2;
   static final int SINGLE_LINE = 4;
   static final int MULTIPLE_LINES = 8;
   static final int EXTENDED_COMMENT = 16;
   static final int USE_UNICODE_CATEGORY = 32;
   static final int UNICODE_WORD_BOUNDARY = 64;
   static final int PROHIBIT_HEAD_CHARACTER_OPTIMIZATION = 128;
   static final int PROHIBIT_FIXED_STRING_OPTIMIZATION = 256;
   static final int XMLSCHEMA_MODE = 512;
   static final int SPECIAL_COMMA = 1024;
   private static final int WT_IGNORE = 0;
   private static final int WT_LETTER = 1;
   private static final int WT_OTHER = 2;
   static final int LINE_FEED = 10;
   static final int CARRIAGE_RETURN = 13;
   static final int LINE_SEPARATOR = 8232;
   static final int PARAGRAPH_SEPARATOR = 8233;


   private synchronized void compile(Token tok) {
      if(this.operations == null) {
         this.numberOfClosures = 0;
         this.operations = this.compile(tok, (Op)null, false);
      }
   }

   private Op compile(Token tok, Op next, boolean reverse) {
      Object ret;
      switch(tok.type) {
      case 0:
         ret = Op.createChar(tok.getChar());
         ((Op)ret).next = next;
         break;
      case 1:
         ret = next;
         int var15;
         if(!reverse) {
            for(var15 = tok.size() - 1; var15 >= 0; --var15) {
               ret = this.compile(tok.getChild(var15), (Op)ret, false);
            }

            return (Op)ret;
         } else {
            for(var15 = 0; var15 < tok.size(); ++var15) {
               ret = this.compile(tok.getChild(var15), (Op)ret, true);
            }

            return (Op)ret;
         }
      case 2:
         Op.UnionOp uni = Op.createUnion(tok.size());

         for(int var16 = 0; var16 < tok.size(); ++var16) {
            uni.addElement(this.compile(tok.getChild(var16), next, reverse));
         }

         ret = uni;
         break;
      case 3:
      case 9:
         Token child = tok.getChild(0);
         int min = tok.getMin();
         int max = tok.getMax();
         int var17;
         if(min >= 0 && min == max) {
            ret = next;

            for(var17 = 0; var17 < min; ++var17) {
               ret = this.compile(child, (Op)ret, reverse);
            }

            return (Op)ret;
         } else {
            if(min > 0 && max > 0) {
               max -= min;
            }

            if(max > 0) {
               ret = next;

               for(var17 = 0; var17 < max; ++var17) {
                  Op.ChildOp var19 = Op.createQuestion(tok.type == 9);
                  var19.next = next;
                  var19.setChild(this.compile(child, (Op)ret, reverse));
                  ret = var19;
               }
            } else {
               Op.ChildOp var18;
               if(tok.type == 9) {
                  var18 = Op.createNonGreedyClosure();
               } else if(child.getMinLength() == 0) {
                  var18 = Op.createClosure(this.numberOfClosures++);
               } else {
                  var18 = Op.createClosure(-1);
               }

               var18.next = next;
               var18.setChild(this.compile(child, var18, reverse));
               ret = var18;
            }

            if(min > 0) {
               for(var17 = 0; var17 < min; ++var17) {
                  ret = this.compile(child, (Op)ret, reverse);
               }
            }
            break;
         }
      case 4:
      case 5:
         ret = Op.createRange(tok);
         ((Op)ret).next = next;
         break;
      case 6:
         if(tok.getParenNumber() == 0) {
            ret = this.compile(tok.getChild(0), next, reverse);
         } else {
            Op.CharOp var14;
            if(reverse) {
               var14 = Op.createCapture(tok.getParenNumber(), next);
               next = this.compile(tok.getChild(0), var14, reverse);
               ret = Op.createCapture(-tok.getParenNumber(), next);
            } else {
               var14 = Op.createCapture(-tok.getParenNumber(), next);
               next = this.compile(tok.getChild(0), var14, reverse);
               ret = Op.createCapture(tok.getParenNumber(), next);
            }
         }
         break;
      case 7:
         ret = next;
         break;
      case 8:
         ret = Op.createAnchor(tok.getChar());
         ((Op)ret).next = next;
         break;
      case 10:
         ret = Op.createString(tok.getString());
         ((Op)ret).next = next;
         break;
      case 11:
         ret = Op.createDot();
         ((Op)ret).next = next;
         break;
      case 12:
         ret = Op.createBackReference(tok.getReferenceNumber());
         ((Op)ret).next = next;
         break;
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      default:
         throw new RuntimeException("Unknown token type: " + tok.type);
      case 20:
         ret = Op.createLook(20, next, this.compile(tok.getChild(0), (Op)null, false));
         break;
      case 21:
         ret = Op.createLook(21, next, this.compile(tok.getChild(0), (Op)null, false));
         break;
      case 22:
         ret = Op.createLook(22, next, this.compile(tok.getChild(0), (Op)null, true));
         break;
      case 23:
         ret = Op.createLook(23, next, this.compile(tok.getChild(0), (Op)null, true));
         break;
      case 24:
         ret = Op.createIndependent(next, this.compile(tok.getChild(0), (Op)null, reverse));
         break;
      case 25:
         ret = Op.createModifier(next, this.compile(tok.getChild(0), (Op)null, reverse), ((Token.ModifierToken)tok).getOptions(), ((Token.ModifierToken)tok).getOptionsMask());
         break;
      case 26:
         Token.ConditionToken ctok = (Token.ConditionToken)tok;
         int ref = ctok.refNumber;
         Op condition = ctok.condition == null?null:this.compile(ctok.condition, (Op)null, reverse);
         Op yes = this.compile(ctok.yes, next, reverse);
         Op no = ctok.no == null?null:this.compile(ctok.no, next, reverse);
         ret = Op.createCondition(next, ref, condition, yes, no);
      }

      return (Op)ret;
   }

   public boolean matches(char[] target) {
      return this.matches(target, 0, target.length, (Match)null);
   }

   public boolean matches(char[] target, int start, int end) {
      return this.matches(target, start, end, (Match)null);
   }

   public boolean matches(char[] target, Match match) {
      return this.matches(target, 0, target.length, match);
   }

   public boolean matches(char[] target, int start, int end, Match match) {
      synchronized(this) {
         if(this.operations == null) {
            this.prepare();
         }

         if(this.context == null) {
            this.context = new RegularExpression.Context();
         }
      }

      RegularExpression.Context con = null;
      RegularExpression.Context limit = this.context;
      synchronized(this.context) {
         con = this.context.inuse?new RegularExpression.Context():this.context;
         con.reset(target, start, end, this.numberOfClosures);
      }

      if(match != null) {
         match.setNumberOfGroups(this.nofparen);
         match.setSource(target);
      } else if(this.hasBackReferences) {
         match = new Match();
         match.setNumberOfGroups(this.nofparen);
      }

      con.match = match;
      int var14;
      if(isSet(this.options, 512)) {
         var14 = this.matchCharArray(con, this.operations, con.start, 1, this.options);
         if(var14 == con.limit) {
            if(con.match != null) {
               con.match.setBeginning(0, con.start);
               con.match.setEnd(0, var14);
            }

            con.inuse = false;
            return true;
         } else {
            return false;
         }
      } else if(this.fixedStringOnly) {
         var14 = this.fixedStringTable.matches(target, con.start, con.limit);
         if(var14 >= 0) {
            if(con.match != null) {
               con.match.setBeginning(0, var14);
               con.match.setEnd(0, var14 + this.fixedString.length());
            }

            con.inuse = false;
            return true;
         } else {
            con.inuse = false;
            return false;
         }
      } else {
         if(this.fixedString != null) {
            var14 = this.fixedStringTable.matches(target, con.start, con.limit);
            if(var14 < 0) {
               con.inuse = false;
               return false;
            }
         }

         var14 = con.limit - this.minlength;
         int matchEnd = -1;
         int matchStart;
         char ch;
         if(this.operations != null && this.operations.type == 7 && this.operations.getChild().type == 0) {
            if(isSet(this.options, 4)) {
               matchStart = con.start;
               matchEnd = this.matchCharArray(con, this.operations, con.start, 1, this.options);
            } else {
               boolean var15 = true;

               for(matchStart = con.start; matchStart <= var14; ++matchStart) {
                  ch = target[matchStart];
                  if(isEOLChar(ch)) {
                     var15 = true;
                  } else {
                     if(var15 && 0 <= (matchEnd = this.matchCharArray(con, this.operations, matchStart, 1, this.options))) {
                        break;
                     }

                     var15 = false;
                  }
               }
            }
         } else if(this.firstChar != null) {
            RangeToken range = this.firstChar;
            int var16;
            if(isSet(this.options, 2)) {
               range = this.firstChar.getCaseInsensitiveToken();

               for(matchStart = con.start; matchStart <= var14; ++matchStart) {
                  ch = target[matchStart];
                  if(REUtil.isHighSurrogate(ch) && matchStart + 1 < con.limit) {
                     var16 = REUtil.composeFromSurrogates(ch, target[matchStart + 1]);
                     if(!range.match(var16)) {
                        continue;
                     }
                  } else if(!range.match(ch)) {
                     char ch1 = Character.toUpperCase((char)ch);
                     if(!range.match(ch1) && !range.match(Character.toLowerCase(ch1))) {
                        continue;
                     }
                  }

                  if(0 <= (matchEnd = this.matchCharArray(con, this.operations, matchStart, 1, this.options))) {
                     break;
                  }
               }
            } else {
               for(matchStart = con.start; matchStart <= var14; ++matchStart) {
                  var16 = target[matchStart];
                  if(REUtil.isHighSurrogate(var16) && matchStart + 1 < con.limit) {
                     var16 = REUtil.composeFromSurrogates(var16, target[matchStart + 1]);
                  }

                  if(range.match(var16) && 0 <= (matchEnd = this.matchCharArray(con, this.operations, matchStart, 1, this.options))) {
                     break;
                  }
               }
            }
         } else {
            for(matchStart = con.start; matchStart <= var14 && 0 > (matchEnd = this.matchCharArray(con, this.operations, matchStart, 1, this.options)); ++matchStart) {
               ;
            }
         }

         if(matchEnd >= 0) {
            if(con.match != null) {
               con.match.setBeginning(0, matchStart);
               con.match.setEnd(0, matchEnd);
            }

            con.inuse = false;
            return true;
         } else {
            con.inuse = false;
            return false;
         }
      }
   }

   private int matchCharArray(RegularExpression.Context con, Op op, int offset, int dx, int opts) {
      char[] target = con.charTarget;

      while(op != null) {
         if(offset > con.limit || offset < con.start) {
            return -1;
         }

         int refno;
         int var12;
         int var13;
         int var15;
         switch(op.type) {
         case 0:
            if(dx > 0) {
               if(offset >= con.limit) {
                  return -1;
               }

               var12 = target[offset];
               if(isSet(opts, 4)) {
                  if(REUtil.isHighSurrogate(var12) && offset + 1 < con.limit) {
                     ++offset;
                  }
               } else {
                  if(REUtil.isHighSurrogate(var12) && offset + 1 < con.limit) {
                     ++offset;
                     var12 = REUtil.composeFromSurrogates(var12, target[offset]);
                  }

                  if(isEOLChar(var12)) {
                     return -1;
                  }
               }

               ++offset;
            } else {
               var12 = offset - 1;
               if(var12 >= con.limit || var12 < 0) {
                  return -1;
               }

               refno = target[var12];
               if(isSet(opts, 4)) {
                  if(REUtil.isLowSurrogate(refno) && var12 - 1 >= 0) {
                     --var12;
                  }
               } else {
                  if(REUtil.isLowSurrogate(refno) && var12 - 1 >= 0) {
                     --var12;
                     refno = REUtil.composeFromSurrogates(target[var12], refno);
                  }

                  if(!isEOLChar(refno)) {
                     return -1;
                  }
               }

               offset = var12;
            }

            op = op.next;
            break;
         case 1:
            if(isSet(opts, 2)) {
               var12 = op.getData();
               if(dx > 0) {
                  if(offset >= con.limit || !matchIgnoreCase(var12, target[offset])) {
                     return -1;
                  }

                  ++offset;
               } else {
                  refno = offset - 1;
                  if(refno >= con.limit || refno < 0 || !matchIgnoreCase(var12, target[refno])) {
                     return -1;
                  }

                  offset = refno;
               }
            } else {
               var12 = op.getData();
               if(dx > 0) {
                  if(offset >= con.limit || var12 != target[offset]) {
                     return -1;
                  }

                  ++offset;
               } else {
                  refno = offset - 1;
                  if(refno >= con.limit || refno < 0 || var12 != target[refno]) {
                     return -1;
                  }

                  offset = refno;
               }
            }

            op = op.next;
            break;
         case 2:
         case 12:
         case 13:
         case 14:
         case 17:
         case 18:
         case 19:
         default:
            throw new RuntimeException("Unknown operation type: " + op.type);
         case 3:
         case 4:
            if(dx > 0) {
               if(offset >= con.limit) {
                  return -1;
               }

               var12 = target[offset];
               if(REUtil.isHighSurrogate(var12) && offset + 1 < con.limit) {
                  ++offset;
                  var12 = REUtil.composeFromSurrogates(var12, target[offset]);
               }

               RangeToken var16 = op.getToken();
               if(isSet(opts, 2)) {
                  var16 = var16.getCaseInsensitiveToken();
                  if(!var16.match(var12)) {
                     if(var12 >= 65536) {
                        return -1;
                     }

                     char var18;
                     if(!var16.match(var18 = Character.toUpperCase((char)var12)) && !var16.match(Character.toLowerCase(var18))) {
                        return -1;
                     }
                  }
               } else if(!var16.match(var12)) {
                  return -1;
               }

               ++offset;
            } else {
               var12 = offset - 1;
               if(var12 >= con.limit || var12 < 0) {
                  return -1;
               }

               refno = target[var12];
               if(REUtil.isLowSurrogate(refno) && var12 - 1 >= 0) {
                  --var12;
                  refno = REUtil.composeFromSurrogates(target[var12], refno);
               }

               RangeToken var19 = op.getToken();
               if(isSet(opts, 2)) {
                  var19 = var19.getCaseInsensitiveToken();
                  if(!var19.match(refno)) {
                     if(refno >= 65536) {
                        return -1;
                     }

                     char var17;
                     if(!var19.match(var17 = Character.toUpperCase((char)refno)) && !var19.match(Character.toLowerCase(var17))) {
                        return -1;
                     }
                  }
               } else if(!var19.match(refno)) {
                  return -1;
               }

               offset = var12;
            }

            op = op.next;
            break;
         case 5:
            boolean go = false;
            switch(op.getData()) {
            case 36:
               if(isSet(opts, 8)) {
                  if(offset != con.limit && (offset >= con.limit || !isEOLChar(target[offset]))) {
                     return -1;
                  }
               } else if(offset != con.limit && (offset + 1 != con.limit || !isEOLChar(target[offset])) && (offset + 2 != con.limit || target[offset] != 13 || target[offset + 1] != 10)) {
                  return -1;
               }
               break;
            case 60:
               if(con.length == 0 || offset == con.limit) {
                  return -1;
               }

               if(getWordType(target, con.start, con.limit, offset, opts) != 1 || getPreviousWordType(target, con.start, con.limit, offset, opts) != 2) {
                  return -1;
               }
               break;
            case 62:
               if(con.length == 0 || offset == con.start) {
                  return -1;
               }

               if(getWordType(target, con.start, con.limit, offset, opts) != 2 || getPreviousWordType(target, con.start, con.limit, offset, opts) != 1) {
                  return -1;
               }
               break;
            case 64:
               if(offset != con.start && (offset <= con.start || !isEOLChar(target[offset - 1]))) {
                  return -1;
               }
               break;
            case 65:
               if(offset != con.start) {
                  return -1;
               }
               break;
            case 66:
               if(con.length == 0) {
                  go = true;
               } else {
                  refno = getWordType(target, con.start, con.limit, offset, opts);
                  go = refno == 0 || refno == getPreviousWordType(target, con.start, con.limit, offset, opts);
               }

               if(!go) {
                  return -1;
               }
               break;
            case 90:
               if(offset != con.limit && (offset + 1 != con.limit || !isEOLChar(target[offset])) && (offset + 2 != con.limit || target[offset] != 13 || target[offset + 1] != 10)) {
                  return -1;
               }
               break;
            case 94:
               if(isSet(opts, 8)) {
                  if(offset != con.start && (offset <= con.start || !isEOLChar(target[offset - 1]))) {
                     return -1;
                  }
               } else if(offset != con.start) {
                  return -1;
               }
               break;
            case 98:
               if(con.length == 0) {
                  return -1;
               }

               refno = getWordType(target, con.start, con.limit, offset, opts);
               if(refno == 0) {
                  return -1;
               }

               var13 = getPreviousWordType(target, con.start, con.limit, offset, opts);
               if(refno == var13) {
                  return -1;
               }
               break;
            case 122:
               if(offset != con.limit) {
                  return -1;
               }
            }

            op = op.next;
            break;
         case 6:
            String var14 = op.getString();
            var13 = var14.length();
            if(!isSet(opts, 2)) {
               if(dx > 0) {
                  if(!regionMatches(target, offset, con.limit, var14, var13)) {
                     return -1;
                  }

                  offset += var13;
               } else {
                  if(!regionMatches(target, offset - var13, con.limit, var14, var13)) {
                     return -1;
                  }

                  offset -= var13;
               }
            } else if(dx > 0) {
               if(!regionMatchesIgnoreCase(target, offset, con.limit, var14, var13)) {
                  return -1;
               }

               offset += var13;
            } else {
               if(!regionMatchesIgnoreCase(target, offset - var13, con.limit, var14, var13)) {
                  return -1;
               }

               offset -= var13;
            }

            op = op.next;
            break;
         case 7:
            refno = op.getData();
            if(refno >= 0) {
               var13 = con.offsets[refno];
               if(var13 >= 0 && var13 == offset) {
                  con.offsets[refno] = -1;
                  op = op.next;
                  break;
               }

               con.offsets[refno] = offset;
            }

            var13 = this.matchCharArray(con, op.getChild(), offset, dx, opts);
            if(refno >= 0) {
               con.offsets[refno] = -1;
            }

            if(var13 >= 0) {
               return var13;
            }

            op = op.next;
            break;
         case 8:
         case 10:
            refno = this.matchCharArray(con, op.next, offset, dx, opts);
            if(refno >= 0) {
               return refno;
            }

            op = op.getChild();
            break;
         case 9:
            refno = this.matchCharArray(con, op.getChild(), offset, dx, opts);
            if(refno >= 0) {
               return refno;
            }

            op = op.next;
            break;
         case 11:
            for(refno = 0; refno < op.size(); ++refno) {
               var13 = this.matchCharArray(con, op.elementAt(refno), offset, dx, opts);
               if(var13 >= 0) {
                  return var13;
               }
            }

            return -1;
         case 15:
            refno = op.getData();
            if(con.match != null && refno > 0) {
               var13 = con.match.getBeginning(refno);
               con.match.setBeginning(refno, offset);
               var15 = this.matchCharArray(con, op.next, offset, dx, opts);
               if(var15 < 0) {
                  con.match.setBeginning(refno, var13);
               }

               return var15;
            }

            if(con.match != null && refno < 0) {
               var13 = -refno;
               var15 = con.match.getEnd(var13);
               con.match.setEnd(var13, offset);
               int ret = this.matchCharArray(con, op.next, offset, dx, opts);
               if(ret < 0) {
                  con.match.setEnd(var13, var15);
               }

               return ret;
            }

            op = op.next;
            break;
         case 16:
            refno = op.getData();
            if(refno > 0 && refno < this.nofparen) {
               if(con.match.getBeginning(refno) >= 0 && con.match.getEnd(refno) >= 0) {
                  var13 = con.match.getBeginning(refno);
                  var15 = con.match.getEnd(refno) - var13;
                  if(!isSet(opts, 2)) {
                     if(dx > 0) {
                        if(!regionMatches(target, offset, con.limit, var13, var15)) {
                           return -1;
                        }

                        offset += var15;
                     } else {
                        if(!regionMatches(target, offset - var15, con.limit, var13, var15)) {
                           return -1;
                        }

                        offset -= var15;
                     }
                  } else if(dx > 0) {
                     if(!regionMatchesIgnoreCase(target, offset, con.limit, var13, var15)) {
                        return -1;
                     }

                     offset += var15;
                  } else {
                     if(!regionMatchesIgnoreCase(target, offset - var15, con.limit, var13, var15)) {
                        return -1;
                     }

                     offset -= var15;
                  }

                  op = op.next;
                  break;
               }

               return -1;
            }

            throw new RuntimeException("Internal Error: Reference number must be more than zero: " + refno);
         case 20:
            if(0 > this.matchCharArray(con, op.getChild(), offset, 1, opts)) {
               return -1;
            }

            op = op.next;
            break;
         case 21:
            if(0 <= this.matchCharArray(con, op.getChild(), offset, 1, opts)) {
               return -1;
            }

            op = op.next;
            break;
         case 22:
            if(0 > this.matchCharArray(con, op.getChild(), offset, -1, opts)) {
               return -1;
            }

            op = op.next;
            break;
         case 23:
            if(0 <= this.matchCharArray(con, op.getChild(), offset, -1, opts)) {
               return -1;
            }

            op = op.next;
            break;
         case 24:
            var13 = this.matchCharArray(con, op.getChild(), offset, dx, opts);
            if(var13 < 0) {
               return var13;
            }

            offset = var13;
            op = op.next;
            break;
         case 25:
            var13 = opts | op.getData();
            var13 &= ~op.getData2();
            var15 = this.matchCharArray(con, op.getChild(), offset, dx, var13);
            if(var15 < 0) {
               return var15;
            }

            offset = var15;
            op = op.next;
            break;
         case 26:
            Op.ConditionOp cop = (Op.ConditionOp)op;
            boolean matchp = false;
            if(cop.refNumber > 0) {
               if(cop.refNumber >= this.nofparen) {
                  throw new RuntimeException("Internal Error: Reference number must be more than zero: " + cop.refNumber);
               }

               matchp = con.match.getBeginning(cop.refNumber) >= 0 && con.match.getEnd(cop.refNumber) >= 0;
            } else {
               matchp = 0 <= this.matchCharArray(con, cop.condition, offset, dx, opts);
            }

            if(matchp) {
               op = cop.yes;
            } else if(cop.no != null) {
               op = cop.no;
            } else {
               op = cop.next;
            }
         }
      }

      return isSet(opts, 512) && offset != con.limit?-1:offset;
   }

   private static final int getPreviousWordType(char[] target, int begin, int end, int offset, int opts) {
      --offset;

      int ret;
      for(ret = getWordType(target, begin, end, offset, opts); ret == 0; ret = getWordType(target, begin, end, offset, opts)) {
         --offset;
      }

      return ret;
   }

   private static final int getWordType(char[] target, int begin, int end, int offset, int opts) {
      return offset >= begin && offset < end?getWordType0(target[offset], opts):2;
   }

   private static final boolean regionMatches(char[] target, int offset, int limit, String part, int partlen) {
      if(offset < 0) {
         return false;
      } else if(limit - offset < partlen) {
         return false;
      } else {
         int i = 0;

         do {
            if(partlen-- <= 0) {
               return true;
            }
         } while(target[offset++] == part.charAt(i++));

         return false;
      }
   }

   private static final boolean regionMatches(char[] target, int offset, int limit, int offset2, int partlen) {
      if(offset < 0) {
         return false;
      } else if(limit - offset < partlen) {
         return false;
      } else {
         int i = offset2;

         do {
            if(partlen-- <= 0) {
               return true;
            }
         } while(target[offset++] == target[i++]);

         return false;
      }
   }

   private static final boolean regionMatchesIgnoreCase(char[] target, int offset, int limit, String part, int partlen) {
      if(offset < 0) {
         return false;
      } else if(limit - offset < partlen) {
         return false;
      } else {
         int i = 0;

         while(partlen-- > 0) {
            char ch1 = target[offset++];
            char ch2 = part.charAt(i++);
            if(ch1 != ch2) {
               char uch1 = Character.toUpperCase(ch1);
               char uch2 = Character.toUpperCase(ch2);
               if(uch1 != uch2 && Character.toLowerCase(uch1) != Character.toLowerCase(uch2)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private static final boolean regionMatchesIgnoreCase(char[] target, int offset, int limit, int offset2, int partlen) {
      if(offset < 0) {
         return false;
      } else if(limit - offset < partlen) {
         return false;
      } else {
         int i = offset2;

         while(partlen-- > 0) {
            char ch1 = target[offset++];
            char ch2 = target[i++];
            if(ch1 != ch2) {
               char uch1 = Character.toUpperCase(ch1);
               char uch2 = Character.toUpperCase(ch2);
               if(uch1 != uch2 && Character.toLowerCase(uch1) != Character.toLowerCase(uch2)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   public boolean matches(String target) {
      return this.matches(target, 0, target.length(), (Match)null);
   }

   public boolean matches(String target, int start, int end) {
      return this.matches(target, start, end, (Match)null);
   }

   public boolean matches(String target, Match match) {
      return this.matches(target, 0, target.length(), match);
   }

   public boolean matches(String target, int start, int end, Match match) {
      synchronized(this) {
         if(this.operations == null) {
            this.prepare();
         }

         if(this.context == null) {
            this.context = new RegularExpression.Context();
         }
      }

      RegularExpression.Context con = null;
      RegularExpression.Context limit = this.context;
      synchronized(this.context) {
         con = this.context.inuse?new RegularExpression.Context():this.context;
         con.reset(target, start, end, this.numberOfClosures);
      }

      if(match != null) {
         match.setNumberOfGroups(this.nofparen);
         match.setSource(target);
      } else if(this.hasBackReferences) {
         match = new Match();
         match.setNumberOfGroups(this.nofparen);
      }

      con.match = match;
      int var14;
      if(isSet(this.options, 512)) {
         var14 = this.matchString(con, this.operations, con.start, 1, this.options);
         if(var14 == con.limit) {
            if(con.match != null) {
               con.match.setBeginning(0, con.start);
               con.match.setEnd(0, var14);
            }

            con.inuse = false;
            return true;
         } else {
            return false;
         }
      } else if(this.fixedStringOnly) {
         var14 = this.fixedStringTable.matches(target, con.start, con.limit);
         if(var14 >= 0) {
            if(con.match != null) {
               con.match.setBeginning(0, var14);
               con.match.setEnd(0, var14 + this.fixedString.length());
            }

            con.inuse = false;
            return true;
         } else {
            con.inuse = false;
            return false;
         }
      } else {
         if(this.fixedString != null) {
            var14 = this.fixedStringTable.matches(target, con.start, con.limit);
            if(var14 < 0) {
               con.inuse = false;
               return false;
            }
         }

         var14 = con.limit - this.minlength;
         int matchEnd = -1;
         int matchStart;
         char ch;
         if(this.operations != null && this.operations.type == 7 && this.operations.getChild().type == 0) {
            if(isSet(this.options, 4)) {
               matchStart = con.start;
               matchEnd = this.matchString(con, this.operations, con.start, 1, this.options);
            } else {
               boolean var15 = true;

               for(matchStart = con.start; matchStart <= var14; ++matchStart) {
                  ch = target.charAt(matchStart);
                  if(isEOLChar(ch)) {
                     var15 = true;
                  } else {
                     if(var15 && 0 <= (matchEnd = this.matchString(con, this.operations, matchStart, 1, this.options))) {
                        break;
                     }

                     var15 = false;
                  }
               }
            }
         } else if(this.firstChar != null) {
            RangeToken range = this.firstChar;
            int var16;
            if(isSet(this.options, 2)) {
               range = this.firstChar.getCaseInsensitiveToken();

               for(matchStart = con.start; matchStart <= var14; ++matchStart) {
                  ch = target.charAt(matchStart);
                  if(REUtil.isHighSurrogate(ch) && matchStart + 1 < con.limit) {
                     var16 = REUtil.composeFromSurrogates(ch, target.charAt(matchStart + 1));
                     if(!range.match(var16)) {
                        continue;
                     }
                  } else if(!range.match(ch)) {
                     char ch1 = Character.toUpperCase((char)ch);
                     if(!range.match(ch1) && !range.match(Character.toLowerCase(ch1))) {
                        continue;
                     }
                  }

                  if(0 <= (matchEnd = this.matchString(con, this.operations, matchStart, 1, this.options))) {
                     break;
                  }
               }
            } else {
               for(matchStart = con.start; matchStart <= var14; ++matchStart) {
                  var16 = target.charAt(matchStart);
                  if(REUtil.isHighSurrogate(var16) && matchStart + 1 < con.limit) {
                     var16 = REUtil.composeFromSurrogates(var16, target.charAt(matchStart + 1));
                  }

                  if(range.match(var16) && 0 <= (matchEnd = this.matchString(con, this.operations, matchStart, 1, this.options))) {
                     break;
                  }
               }
            }
         } else {
            for(matchStart = con.start; matchStart <= var14 && 0 > (matchEnd = this.matchString(con, this.operations, matchStart, 1, this.options)); ++matchStart) {
               ;
            }
         }

         if(matchEnd >= 0) {
            if(con.match != null) {
               con.match.setBeginning(0, matchStart);
               con.match.setEnd(0, matchEnd);
            }

            con.inuse = false;
            return true;
         } else {
            con.inuse = false;
            return false;
         }
      }
   }

   private int matchString(RegularExpression.Context con, Op op, int offset, int dx, int opts) {
      String target = con.strTarget;

      while(op != null) {
         if(offset > con.limit || offset < con.start) {
            return -1;
         }

         int refno;
         int var12;
         int var13;
         int var15;
         switch(op.type) {
         case 0:
            if(dx > 0) {
               if(offset >= con.limit) {
                  return -1;
               }

               var12 = target.charAt(offset);
               if(isSet(opts, 4)) {
                  if(REUtil.isHighSurrogate(var12) && offset + 1 < con.limit) {
                     ++offset;
                  }
               } else {
                  if(REUtil.isHighSurrogate(var12) && offset + 1 < con.limit) {
                     ++offset;
                     var12 = REUtil.composeFromSurrogates(var12, target.charAt(offset));
                  }

                  if(isEOLChar(var12)) {
                     return -1;
                  }
               }

               ++offset;
            } else {
               var12 = offset - 1;
               if(var12 >= con.limit || var12 < 0) {
                  return -1;
               }

               refno = target.charAt(var12);
               if(isSet(opts, 4)) {
                  if(REUtil.isLowSurrogate(refno) && var12 - 1 >= 0) {
                     --var12;
                  }
               } else {
                  if(REUtil.isLowSurrogate(refno) && var12 - 1 >= 0) {
                     --var12;
                     refno = REUtil.composeFromSurrogates(target.charAt(var12), refno);
                  }

                  if(!isEOLChar(refno)) {
                     return -1;
                  }
               }

               offset = var12;
            }

            op = op.next;
            break;
         case 1:
            if(isSet(opts, 2)) {
               var12 = op.getData();
               if(dx > 0) {
                  if(offset >= con.limit || !matchIgnoreCase(var12, target.charAt(offset))) {
                     return -1;
                  }

                  ++offset;
               } else {
                  refno = offset - 1;
                  if(refno >= con.limit || refno < 0 || !matchIgnoreCase(var12, target.charAt(refno))) {
                     return -1;
                  }

                  offset = refno;
               }
            } else {
               var12 = op.getData();
               if(dx > 0) {
                  if(offset >= con.limit || var12 != target.charAt(offset)) {
                     return -1;
                  }

                  ++offset;
               } else {
                  refno = offset - 1;
                  if(refno >= con.limit || refno < 0 || var12 != target.charAt(refno)) {
                     return -1;
                  }

                  offset = refno;
               }
            }

            op = op.next;
            break;
         case 2:
         case 12:
         case 13:
         case 14:
         case 17:
         case 18:
         case 19:
         default:
            throw new RuntimeException("Unknown operation type: " + op.type);
         case 3:
         case 4:
            if(dx > 0) {
               if(offset >= con.limit) {
                  return -1;
               }

               var12 = target.charAt(offset);
               if(REUtil.isHighSurrogate(var12) && offset + 1 < con.limit) {
                  ++offset;
                  var12 = REUtil.composeFromSurrogates(var12, target.charAt(offset));
               }

               RangeToken var16 = op.getToken();
               if(isSet(opts, 2)) {
                  var16 = var16.getCaseInsensitiveToken();
                  if(!var16.match(var12)) {
                     if(var12 >= 65536) {
                        return -1;
                     }

                     char var18;
                     if(!var16.match(var18 = Character.toUpperCase((char)var12)) && !var16.match(Character.toLowerCase(var18))) {
                        return -1;
                     }
                  }
               } else if(!var16.match(var12)) {
                  return -1;
               }

               ++offset;
            } else {
               var12 = offset - 1;
               if(var12 >= con.limit || var12 < 0) {
                  return -1;
               }

               refno = target.charAt(var12);
               if(REUtil.isLowSurrogate(refno) && var12 - 1 >= 0) {
                  --var12;
                  refno = REUtil.composeFromSurrogates(target.charAt(var12), refno);
               }

               RangeToken var19 = op.getToken();
               if(isSet(opts, 2)) {
                  var19 = var19.getCaseInsensitiveToken();
                  if(!var19.match(refno)) {
                     if(refno >= 65536) {
                        return -1;
                     }

                     char var17;
                     if(!var19.match(var17 = Character.toUpperCase((char)refno)) && !var19.match(Character.toLowerCase(var17))) {
                        return -1;
                     }
                  }
               } else if(!var19.match(refno)) {
                  return -1;
               }

               offset = var12;
            }

            op = op.next;
            break;
         case 5:
            boolean go = false;
            switch(op.getData()) {
            case 36:
               if(isSet(opts, 8)) {
                  if(offset != con.limit && (offset >= con.limit || !isEOLChar(target.charAt(offset)))) {
                     return -1;
                  }
               } else if(offset != con.limit && (offset + 1 != con.limit || !isEOLChar(target.charAt(offset))) && (offset + 2 != con.limit || target.charAt(offset) != 13 || target.charAt(offset + 1) != 10)) {
                  return -1;
               }
               break;
            case 60:
               if(con.length == 0 || offset == con.limit) {
                  return -1;
               }

               if(getWordType(target, con.start, con.limit, offset, opts) != 1 || getPreviousWordType(target, con.start, con.limit, offset, opts) != 2) {
                  return -1;
               }
               break;
            case 62:
               if(con.length == 0 || offset == con.start) {
                  return -1;
               }

               if(getWordType(target, con.start, con.limit, offset, opts) != 2 || getPreviousWordType(target, con.start, con.limit, offset, opts) != 1) {
                  return -1;
               }
               break;
            case 64:
               if(offset != con.start && (offset <= con.start || !isEOLChar(target.charAt(offset - 1)))) {
                  return -1;
               }
               break;
            case 65:
               if(offset != con.start) {
                  return -1;
               }
               break;
            case 66:
               if(con.length == 0) {
                  go = true;
               } else {
                  refno = getWordType(target, con.start, con.limit, offset, opts);
                  go = refno == 0 || refno == getPreviousWordType(target, con.start, con.limit, offset, opts);
               }

               if(!go) {
                  return -1;
               }
               break;
            case 90:
               if(offset != con.limit && (offset + 1 != con.limit || !isEOLChar(target.charAt(offset))) && (offset + 2 != con.limit || target.charAt(offset) != 13 || target.charAt(offset + 1) != 10)) {
                  return -1;
               }
               break;
            case 94:
               if(isSet(opts, 8)) {
                  if(offset != con.start && (offset <= con.start || !isEOLChar(target.charAt(offset - 1)))) {
                     return -1;
                  }
               } else if(offset != con.start) {
                  return -1;
               }
               break;
            case 98:
               if(con.length == 0) {
                  return -1;
               }

               refno = getWordType(target, con.start, con.limit, offset, opts);
               if(refno == 0) {
                  return -1;
               }

               var13 = getPreviousWordType(target, con.start, con.limit, offset, opts);
               if(refno == var13) {
                  return -1;
               }
               break;
            case 122:
               if(offset != con.limit) {
                  return -1;
               }
            }

            op = op.next;
            break;
         case 6:
            String var14 = op.getString();
            var13 = var14.length();
            if(!isSet(opts, 2)) {
               if(dx > 0) {
                  if(!regionMatches(target, offset, con.limit, var14, var13)) {
                     return -1;
                  }

                  offset += var13;
               } else {
                  if(!regionMatches(target, offset - var13, con.limit, var14, var13)) {
                     return -1;
                  }

                  offset -= var13;
               }
            } else if(dx > 0) {
               if(!regionMatchesIgnoreCase(target, offset, con.limit, var14, var13)) {
                  return -1;
               }

               offset += var13;
            } else {
               if(!regionMatchesIgnoreCase(target, offset - var13, con.limit, var14, var13)) {
                  return -1;
               }

               offset -= var13;
            }

            op = op.next;
            break;
         case 7:
            refno = op.getData();
            if(refno >= 0) {
               var13 = con.offsets[refno];
               if(var13 >= 0 && var13 == offset) {
                  con.offsets[refno] = -1;
                  op = op.next;
                  break;
               }

               con.offsets[refno] = offset;
            }

            var13 = this.matchString(con, op.getChild(), offset, dx, opts);
            if(refno >= 0) {
               con.offsets[refno] = -1;
            }

            if(var13 >= 0) {
               return var13;
            }

            op = op.next;
            break;
         case 8:
         case 10:
            refno = this.matchString(con, op.next, offset, dx, opts);
            if(refno >= 0) {
               return refno;
            }

            op = op.getChild();
            break;
         case 9:
            refno = this.matchString(con, op.getChild(), offset, dx, opts);
            if(refno >= 0) {
               return refno;
            }

            op = op.next;
            break;
         case 11:
            for(refno = 0; refno < op.size(); ++refno) {
               var13 = this.matchString(con, op.elementAt(refno), offset, dx, opts);
               if(var13 >= 0) {
                  return var13;
               }
            }

            return -1;
         case 15:
            refno = op.getData();
            if(con.match != null && refno > 0) {
               var13 = con.match.getBeginning(refno);
               con.match.setBeginning(refno, offset);
               var15 = this.matchString(con, op.next, offset, dx, opts);
               if(var15 < 0) {
                  con.match.setBeginning(refno, var13);
               }

               return var15;
            }

            if(con.match != null && refno < 0) {
               var13 = -refno;
               var15 = con.match.getEnd(var13);
               con.match.setEnd(var13, offset);
               int ret = this.matchString(con, op.next, offset, dx, opts);
               if(ret < 0) {
                  con.match.setEnd(var13, var15);
               }

               return ret;
            }

            op = op.next;
            break;
         case 16:
            refno = op.getData();
            if(refno > 0 && refno < this.nofparen) {
               if(con.match.getBeginning(refno) >= 0 && con.match.getEnd(refno) >= 0) {
                  var13 = con.match.getBeginning(refno);
                  var15 = con.match.getEnd(refno) - var13;
                  if(!isSet(opts, 2)) {
                     if(dx > 0) {
                        if(!regionMatches(target, offset, con.limit, var13, var15)) {
                           return -1;
                        }

                        offset += var15;
                     } else {
                        if(!regionMatches(target, offset - var15, con.limit, var13, var15)) {
                           return -1;
                        }

                        offset -= var15;
                     }
                  } else if(dx > 0) {
                     if(!regionMatchesIgnoreCase(target, offset, con.limit, var13, var15)) {
                        return -1;
                     }

                     offset += var15;
                  } else {
                     if(!regionMatchesIgnoreCase(target, offset - var15, con.limit, var13, var15)) {
                        return -1;
                     }

                     offset -= var15;
                  }

                  op = op.next;
                  break;
               }

               return -1;
            }

            throw new RuntimeException("Internal Error: Reference number must be more than zero: " + refno);
         case 20:
            if(0 > this.matchString(con, op.getChild(), offset, 1, opts)) {
               return -1;
            }

            op = op.next;
            break;
         case 21:
            if(0 <= this.matchString(con, op.getChild(), offset, 1, opts)) {
               return -1;
            }

            op = op.next;
            break;
         case 22:
            if(0 > this.matchString(con, op.getChild(), offset, -1, opts)) {
               return -1;
            }

            op = op.next;
            break;
         case 23:
            if(0 <= this.matchString(con, op.getChild(), offset, -1, opts)) {
               return -1;
            }

            op = op.next;
            break;
         case 24:
            var13 = this.matchString(con, op.getChild(), offset, dx, opts);
            if(var13 < 0) {
               return var13;
            }

            offset = var13;
            op = op.next;
            break;
         case 25:
            var13 = opts | op.getData();
            var13 &= ~op.getData2();
            var15 = this.matchString(con, op.getChild(), offset, dx, var13);
            if(var15 < 0) {
               return var15;
            }

            offset = var15;
            op = op.next;
            break;
         case 26:
            Op.ConditionOp cop = (Op.ConditionOp)op;
            boolean matchp = false;
            if(cop.refNumber > 0) {
               if(cop.refNumber >= this.nofparen) {
                  throw new RuntimeException("Internal Error: Reference number must be more than zero: " + cop.refNumber);
               }

               matchp = con.match.getBeginning(cop.refNumber) >= 0 && con.match.getEnd(cop.refNumber) >= 0;
            } else {
               matchp = 0 <= this.matchString(con, cop.condition, offset, dx, opts);
            }

            if(matchp) {
               op = cop.yes;
            } else if(cop.no != null) {
               op = cop.no;
            } else {
               op = cop.next;
            }
         }
      }

      return isSet(opts, 512) && offset != con.limit?-1:offset;
   }

   private static final int getPreviousWordType(String target, int begin, int end, int offset, int opts) {
      --offset;

      int ret;
      for(ret = getWordType(target, begin, end, offset, opts); ret == 0; ret = getWordType(target, begin, end, offset, opts)) {
         --offset;
      }

      return ret;
   }

   private static final int getWordType(String target, int begin, int end, int offset, int opts) {
      return offset >= begin && offset < end?getWordType0(target.charAt(offset), opts):2;
   }

   private static final boolean regionMatches(String text, int offset, int limit, String part, int partlen) {
      return limit - offset < partlen?false:text.regionMatches(offset, part, 0, partlen);
   }

   private static final boolean regionMatches(String text, int offset, int limit, int offset2, int partlen) {
      return limit - offset < partlen?false:text.regionMatches(offset, text, offset2, partlen);
   }

   private static final boolean regionMatchesIgnoreCase(String text, int offset, int limit, String part, int partlen) {
      return text.regionMatches(true, offset, part, 0, partlen);
   }

   private static final boolean regionMatchesIgnoreCase(String text, int offset, int limit, int offset2, int partlen) {
      return limit - offset < partlen?false:text.regionMatches(true, offset, text, offset2, partlen);
   }

   public boolean matches(CharacterIterator target) {
      return this.matches(target, (Match)null);
   }

   public boolean matches(CharacterIterator target, Match match) {
      int start = target.getBeginIndex();
      int end = target.getEndIndex();
      synchronized(this) {
         if(this.operations == null) {
            this.prepare();
         }

         if(this.context == null) {
            this.context = new RegularExpression.Context();
         }
      }

      RegularExpression.Context con = null;
      RegularExpression.Context limit = this.context;
      synchronized(this.context) {
         con = this.context.inuse?new RegularExpression.Context():this.context;
         con.reset(target, start, end, this.numberOfClosures);
      }

      if(match != null) {
         match.setNumberOfGroups(this.nofparen);
         match.setSource(target);
      } else if(this.hasBackReferences) {
         match = new Match();
         match.setNumberOfGroups(this.nofparen);
      }

      con.match = match;
      int var14;
      if(isSet(this.options, 512)) {
         var14 = this.matchCharacterIterator(con, this.operations, con.start, 1, this.options);
         if(var14 == con.limit) {
            if(con.match != null) {
               con.match.setBeginning(0, con.start);
               con.match.setEnd(0, var14);
            }

            con.inuse = false;
            return true;
         } else {
            return false;
         }
      } else if(this.fixedStringOnly) {
         var14 = this.fixedStringTable.matches(target, con.start, con.limit);
         if(var14 >= 0) {
            if(con.match != null) {
               con.match.setBeginning(0, var14);
               con.match.setEnd(0, var14 + this.fixedString.length());
            }

            con.inuse = false;
            return true;
         } else {
            con.inuse = false;
            return false;
         }
      } else {
         if(this.fixedString != null) {
            var14 = this.fixedStringTable.matches(target, con.start, con.limit);
            if(var14 < 0) {
               con.inuse = false;
               return false;
            }
         }

         var14 = con.limit - this.minlength;
         int matchEnd = -1;
         int matchStart;
         char ch;
         if(this.operations != null && this.operations.type == 7 && this.operations.getChild().type == 0) {
            if(isSet(this.options, 4)) {
               matchStart = con.start;
               matchEnd = this.matchCharacterIterator(con, this.operations, con.start, 1, this.options);
            } else {
               boolean var15 = true;

               for(matchStart = con.start; matchStart <= var14; ++matchStart) {
                  ch = target.setIndex(matchStart);
                  if(isEOLChar(ch)) {
                     var15 = true;
                  } else {
                     if(var15 && 0 <= (matchEnd = this.matchCharacterIterator(con, this.operations, matchStart, 1, this.options))) {
                        break;
                     }

                     var15 = false;
                  }
               }
            }
         } else if(this.firstChar != null) {
            RangeToken range = this.firstChar;
            int var16;
            if(isSet(this.options, 2)) {
               range = this.firstChar.getCaseInsensitiveToken();

               for(matchStart = con.start; matchStart <= var14; ++matchStart) {
                  ch = target.setIndex(matchStart);
                  if(REUtil.isHighSurrogate(ch) && matchStart + 1 < con.limit) {
                     var16 = REUtil.composeFromSurrogates(ch, target.setIndex(matchStart + 1));
                     if(!range.match(var16)) {
                        continue;
                     }
                  } else if(!range.match(ch)) {
                     char ch1 = Character.toUpperCase((char)ch);
                     if(!range.match(ch1) && !range.match(Character.toLowerCase(ch1))) {
                        continue;
                     }
                  }

                  if(0 <= (matchEnd = this.matchCharacterIterator(con, this.operations, matchStart, 1, this.options))) {
                     break;
                  }
               }
            } else {
               for(matchStart = con.start; matchStart <= var14; ++matchStart) {
                  var16 = target.setIndex(matchStart);
                  if(REUtil.isHighSurrogate(var16) && matchStart + 1 < con.limit) {
                     var16 = REUtil.composeFromSurrogates(var16, target.setIndex(matchStart + 1));
                  }

                  if(range.match(var16) && 0 <= (matchEnd = this.matchCharacterIterator(con, this.operations, matchStart, 1, this.options))) {
                     break;
                  }
               }
            }
         } else {
            for(matchStart = con.start; matchStart <= var14 && 0 > (matchEnd = this.matchCharacterIterator(con, this.operations, matchStart, 1, this.options)); ++matchStart) {
               ;
            }
         }

         if(matchEnd >= 0) {
            if(con.match != null) {
               con.match.setBeginning(0, matchStart);
               con.match.setEnd(0, matchEnd);
            }

            con.inuse = false;
            return true;
         } else {
            con.inuse = false;
            return false;
         }
      }
   }

   private int matchCharacterIterator(RegularExpression.Context con, Op op, int offset, int dx, int opts) {
      CharacterIterator target = con.ciTarget;

      while(op != null) {
         if(offset > con.limit || offset < con.start) {
            return -1;
         }

         int refno;
         int var12;
         int var13;
         int var15;
         switch(op.type) {
         case 0:
            if(dx > 0) {
               if(offset >= con.limit) {
                  return -1;
               }

               var12 = target.setIndex(offset);
               if(isSet(opts, 4)) {
                  if(REUtil.isHighSurrogate(var12) && offset + 1 < con.limit) {
                     ++offset;
                  }
               } else {
                  if(REUtil.isHighSurrogate(var12) && offset + 1 < con.limit) {
                     ++offset;
                     var12 = REUtil.composeFromSurrogates(var12, target.setIndex(offset));
                  }

                  if(isEOLChar(var12)) {
                     return -1;
                  }
               }

               ++offset;
            } else {
               var12 = offset - 1;
               if(var12 >= con.limit || var12 < 0) {
                  return -1;
               }

               refno = target.setIndex(var12);
               if(isSet(opts, 4)) {
                  if(REUtil.isLowSurrogate(refno) && var12 - 1 >= 0) {
                     --var12;
                  }
               } else {
                  if(REUtil.isLowSurrogate(refno) && var12 - 1 >= 0) {
                     --var12;
                     refno = REUtil.composeFromSurrogates(target.setIndex(var12), refno);
                  }

                  if(!isEOLChar(refno)) {
                     return -1;
                  }
               }

               offset = var12;
            }

            op = op.next;
            break;
         case 1:
            if(isSet(opts, 2)) {
               var12 = op.getData();
               if(dx > 0) {
                  if(offset >= con.limit || !matchIgnoreCase(var12, target.setIndex(offset))) {
                     return -1;
                  }

                  ++offset;
               } else {
                  refno = offset - 1;
                  if(refno >= con.limit || refno < 0 || !matchIgnoreCase(var12, target.setIndex(refno))) {
                     return -1;
                  }

                  offset = refno;
               }
            } else {
               var12 = op.getData();
               if(dx > 0) {
                  if(offset >= con.limit || var12 != target.setIndex(offset)) {
                     return -1;
                  }

                  ++offset;
               } else {
                  refno = offset - 1;
                  if(refno >= con.limit || refno < 0 || var12 != target.setIndex(refno)) {
                     return -1;
                  }

                  offset = refno;
               }
            }

            op = op.next;
            break;
         case 2:
         case 12:
         case 13:
         case 14:
         case 17:
         case 18:
         case 19:
         default:
            throw new RuntimeException("Unknown operation type: " + op.type);
         case 3:
         case 4:
            if(dx > 0) {
               if(offset >= con.limit) {
                  return -1;
               }

               var12 = target.setIndex(offset);
               if(REUtil.isHighSurrogate(var12) && offset + 1 < con.limit) {
                  ++offset;
                  var12 = REUtil.composeFromSurrogates(var12, target.setIndex(offset));
               }

               RangeToken var16 = op.getToken();
               if(isSet(opts, 2)) {
                  var16 = var16.getCaseInsensitiveToken();
                  if(!var16.match(var12)) {
                     if(var12 >= 65536) {
                        return -1;
                     }

                     char var18;
                     if(!var16.match(var18 = Character.toUpperCase((char)var12)) && !var16.match(Character.toLowerCase(var18))) {
                        return -1;
                     }
                  }
               } else if(!var16.match(var12)) {
                  return -1;
               }

               ++offset;
            } else {
               var12 = offset - 1;
               if(var12 >= con.limit || var12 < 0) {
                  return -1;
               }

               refno = target.setIndex(var12);
               if(REUtil.isLowSurrogate(refno) && var12 - 1 >= 0) {
                  --var12;
                  refno = REUtil.composeFromSurrogates(target.setIndex(var12), refno);
               }

               RangeToken var19 = op.getToken();
               if(isSet(opts, 2)) {
                  var19 = var19.getCaseInsensitiveToken();
                  if(!var19.match(refno)) {
                     if(refno >= 65536) {
                        return -1;
                     }

                     char var17;
                     if(!var19.match(var17 = Character.toUpperCase((char)refno)) && !var19.match(Character.toLowerCase(var17))) {
                        return -1;
                     }
                  }
               } else if(!var19.match(refno)) {
                  return -1;
               }

               offset = var12;
            }

            op = op.next;
            break;
         case 5:
            boolean go = false;
            switch(op.getData()) {
            case 36:
               if(isSet(opts, 8)) {
                  if(offset != con.limit && (offset >= con.limit || !isEOLChar(target.setIndex(offset)))) {
                     return -1;
                  }
               } else if(offset != con.limit && (offset + 1 != con.limit || !isEOLChar(target.setIndex(offset))) && (offset + 2 != con.limit || target.setIndex(offset) != 13 || target.setIndex(offset + 1) != 10)) {
                  return -1;
               }
               break;
            case 60:
               if(con.length == 0 || offset == con.limit) {
                  return -1;
               }

               if(getWordType(target, con.start, con.limit, offset, opts) != 1 || getPreviousWordType(target, con.start, con.limit, offset, opts) != 2) {
                  return -1;
               }
               break;
            case 62:
               if(con.length == 0 || offset == con.start) {
                  return -1;
               }

               if(getWordType(target, con.start, con.limit, offset, opts) != 2 || getPreviousWordType(target, con.start, con.limit, offset, opts) != 1) {
                  return -1;
               }
               break;
            case 64:
               if(offset != con.start && (offset <= con.start || !isEOLChar(target.setIndex(offset - 1)))) {
                  return -1;
               }
               break;
            case 65:
               if(offset != con.start) {
                  return -1;
               }
               break;
            case 66:
               if(con.length == 0) {
                  go = true;
               } else {
                  refno = getWordType(target, con.start, con.limit, offset, opts);
                  go = refno == 0 || refno == getPreviousWordType(target, con.start, con.limit, offset, opts);
               }

               if(!go) {
                  return -1;
               }
               break;
            case 90:
               if(offset != con.limit && (offset + 1 != con.limit || !isEOLChar(target.setIndex(offset))) && (offset + 2 != con.limit || target.setIndex(offset) != 13 || target.setIndex(offset + 1) != 10)) {
                  return -1;
               }
               break;
            case 94:
               if(isSet(opts, 8)) {
                  if(offset != con.start && (offset <= con.start || !isEOLChar(target.setIndex(offset - 1)))) {
                     return -1;
                  }
               } else if(offset != con.start) {
                  return -1;
               }
               break;
            case 98:
               if(con.length == 0) {
                  return -1;
               }

               refno = getWordType(target, con.start, con.limit, offset, opts);
               if(refno == 0) {
                  return -1;
               }

               var13 = getPreviousWordType(target, con.start, con.limit, offset, opts);
               if(refno == var13) {
                  return -1;
               }
               break;
            case 122:
               if(offset != con.limit) {
                  return -1;
               }
            }

            op = op.next;
            break;
         case 6:
            String var14 = op.getString();
            var13 = var14.length();
            if(!isSet(opts, 2)) {
               if(dx > 0) {
                  if(!regionMatches(target, offset, con.limit, var14, var13)) {
                     return -1;
                  }

                  offset += var13;
               } else {
                  if(!regionMatches(target, offset - var13, con.limit, var14, var13)) {
                     return -1;
                  }

                  offset -= var13;
               }
            } else if(dx > 0) {
               if(!regionMatchesIgnoreCase(target, offset, con.limit, var14, var13)) {
                  return -1;
               }

               offset += var13;
            } else {
               if(!regionMatchesIgnoreCase(target, offset - var13, con.limit, var14, var13)) {
                  return -1;
               }

               offset -= var13;
            }

            op = op.next;
            break;
         case 7:
            refno = op.getData();
            if(refno >= 0) {
               var13 = con.offsets[refno];
               if(var13 >= 0 && var13 == offset) {
                  con.offsets[refno] = -1;
                  op = op.next;
                  break;
               }

               con.offsets[refno] = offset;
            }

            var13 = this.matchCharacterIterator(con, op.getChild(), offset, dx, opts);
            if(refno >= 0) {
               con.offsets[refno] = -1;
            }

            if(var13 >= 0) {
               return var13;
            }

            op = op.next;
            break;
         case 8:
         case 10:
            refno = this.matchCharacterIterator(con, op.next, offset, dx, opts);
            if(refno >= 0) {
               return refno;
            }

            op = op.getChild();
            break;
         case 9:
            refno = this.matchCharacterIterator(con, op.getChild(), offset, dx, opts);
            if(refno >= 0) {
               return refno;
            }

            op = op.next;
            break;
         case 11:
            for(refno = 0; refno < op.size(); ++refno) {
               var13 = this.matchCharacterIterator(con, op.elementAt(refno), offset, dx, opts);
               if(var13 >= 0) {
                  return var13;
               }
            }

            return -1;
         case 15:
            refno = op.getData();
            if(con.match != null && refno > 0) {
               var13 = con.match.getBeginning(refno);
               con.match.setBeginning(refno, offset);
               var15 = this.matchCharacterIterator(con, op.next, offset, dx, opts);
               if(var15 < 0) {
                  con.match.setBeginning(refno, var13);
               }

               return var15;
            }

            if(con.match != null && refno < 0) {
               var13 = -refno;
               var15 = con.match.getEnd(var13);
               con.match.setEnd(var13, offset);
               int ret = this.matchCharacterIterator(con, op.next, offset, dx, opts);
               if(ret < 0) {
                  con.match.setEnd(var13, var15);
               }

               return ret;
            }

            op = op.next;
            break;
         case 16:
            refno = op.getData();
            if(refno > 0 && refno < this.nofparen) {
               if(con.match.getBeginning(refno) >= 0 && con.match.getEnd(refno) >= 0) {
                  var13 = con.match.getBeginning(refno);
                  var15 = con.match.getEnd(refno) - var13;
                  if(!isSet(opts, 2)) {
                     if(dx > 0) {
                        if(!regionMatches(target, offset, con.limit, var13, var15)) {
                           return -1;
                        }

                        offset += var15;
                     } else {
                        if(!regionMatches(target, offset - var15, con.limit, var13, var15)) {
                           return -1;
                        }

                        offset -= var15;
                     }
                  } else if(dx > 0) {
                     if(!regionMatchesIgnoreCase(target, offset, con.limit, var13, var15)) {
                        return -1;
                     }

                     offset += var15;
                  } else {
                     if(!regionMatchesIgnoreCase(target, offset - var15, con.limit, var13, var15)) {
                        return -1;
                     }

                     offset -= var15;
                  }

                  op = op.next;
                  break;
               }

               return -1;
            }

            throw new RuntimeException("Internal Error: Reference number must be more than zero: " + refno);
         case 20:
            if(0 > this.matchCharacterIterator(con, op.getChild(), offset, 1, opts)) {
               return -1;
            }

            op = op.next;
            break;
         case 21:
            if(0 <= this.matchCharacterIterator(con, op.getChild(), offset, 1, opts)) {
               return -1;
            }

            op = op.next;
            break;
         case 22:
            if(0 > this.matchCharacterIterator(con, op.getChild(), offset, -1, opts)) {
               return -1;
            }

            op = op.next;
            break;
         case 23:
            if(0 <= this.matchCharacterIterator(con, op.getChild(), offset, -1, opts)) {
               return -1;
            }

            op = op.next;
            break;
         case 24:
            var13 = this.matchCharacterIterator(con, op.getChild(), offset, dx, opts);
            if(var13 < 0) {
               return var13;
            }

            offset = var13;
            op = op.next;
            break;
         case 25:
            var13 = opts | op.getData();
            var13 &= ~op.getData2();
            var15 = this.matchCharacterIterator(con, op.getChild(), offset, dx, var13);
            if(var15 < 0) {
               return var15;
            }

            offset = var15;
            op = op.next;
            break;
         case 26:
            Op.ConditionOp cop = (Op.ConditionOp)op;
            boolean matchp = false;
            if(cop.refNumber > 0) {
               if(cop.refNumber >= this.nofparen) {
                  throw new RuntimeException("Internal Error: Reference number must be more than zero: " + cop.refNumber);
               }

               matchp = con.match.getBeginning(cop.refNumber) >= 0 && con.match.getEnd(cop.refNumber) >= 0;
            } else {
               matchp = 0 <= this.matchCharacterIterator(con, cop.condition, offset, dx, opts);
            }

            if(matchp) {
               op = cop.yes;
            } else if(cop.no != null) {
               op = cop.no;
            } else {
               op = cop.next;
            }
         }
      }

      return isSet(opts, 512) && offset != con.limit?-1:offset;
   }

   private static final int getPreviousWordType(CharacterIterator target, int begin, int end, int offset, int opts) {
      --offset;

      int ret;
      for(ret = getWordType(target, begin, end, offset, opts); ret == 0; ret = getWordType(target, begin, end, offset, opts)) {
         --offset;
      }

      return ret;
   }

   private static final int getWordType(CharacterIterator target, int begin, int end, int offset, int opts) {
      return offset >= begin && offset < end?getWordType0(target.setIndex(offset), opts):2;
   }

   private static final boolean regionMatches(CharacterIterator target, int offset, int limit, String part, int partlen) {
      if(offset < 0) {
         return false;
      } else if(limit - offset < partlen) {
         return false;
      } else {
         int i = 0;

         do {
            if(partlen-- <= 0) {
               return true;
            }
         } while(target.setIndex(offset++) == part.charAt(i++));

         return false;
      }
   }

   private static final boolean regionMatches(CharacterIterator target, int offset, int limit, int offset2, int partlen) {
      if(offset < 0) {
         return false;
      } else if(limit - offset < partlen) {
         return false;
      } else {
         int i = offset2;

         do {
            if(partlen-- <= 0) {
               return true;
            }
         } while(target.setIndex(offset++) == target.setIndex(i++));

         return false;
      }
   }

   private static final boolean regionMatchesIgnoreCase(CharacterIterator target, int offset, int limit, String part, int partlen) {
      if(offset < 0) {
         return false;
      } else if(limit - offset < partlen) {
         return false;
      } else {
         int i = 0;

         while(partlen-- > 0) {
            char ch1 = target.setIndex(offset++);
            char ch2 = part.charAt(i++);
            if(ch1 != ch2) {
               char uch1 = Character.toUpperCase(ch1);
               char uch2 = Character.toUpperCase(ch2);
               if(uch1 != uch2 && Character.toLowerCase(uch1) != Character.toLowerCase(uch2)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   private static final boolean regionMatchesIgnoreCase(CharacterIterator target, int offset, int limit, int offset2, int partlen) {
      if(offset < 0) {
         return false;
      } else if(limit - offset < partlen) {
         return false;
      } else {
         int i = offset2;

         while(partlen-- > 0) {
            char ch1 = target.setIndex(offset++);
            char ch2 = target.setIndex(i++);
            if(ch1 != ch2) {
               char uch1 = Character.toUpperCase(ch1);
               char uch2 = Character.toUpperCase(ch2);
               if(uch1 != uch2 && Character.toLowerCase(uch1) != Character.toLowerCase(uch2)) {
                  return false;
               }
            }
         }

         return true;
      }
   }

   void prepare() {
      this.compile(this.tokentree);
      this.minlength = this.tokentree.getMinLength();
      this.firstChar = null;
      if(!isSet(this.options, 128) && !isSet(this.options, 512)) {
         RangeToken container = Token.createRange();
         int fresult = this.tokentree.analyzeFirstCharacter(container, this.options);
         if(fresult == 1) {
            container.compactRanges();
            this.firstChar = container;
         }
      }

      if(this.operations != null && (this.operations.type == 6 || this.operations.type == 1) && this.operations.next == null) {
         this.fixedStringOnly = true;
         if(this.operations.type == 6) {
            this.fixedString = this.operations.getString();
         } else if(this.operations.getData() >= 65536) {
            this.fixedString = REUtil.decomposeToSurrogates(this.operations.getData());
         } else {
            char[] container2 = new char[]{(char)this.operations.getData()};
            this.fixedString = new String(container2);
         }

         this.fixedStringOptions = this.options;
         this.fixedStringTable = new BMPattern(this.fixedString, 256, isSet(this.fixedStringOptions, 2));
      } else if(!isSet(this.options, 256) && !isSet(this.options, 512)) {
         Token.FixedStringContainer container1 = new Token.FixedStringContainer();
         this.tokentree.findFixedString(container1, this.options);
         this.fixedString = container1.token == null?null:container1.token.getString();
         this.fixedStringOptions = container1.options;
         if(this.fixedString != null && this.fixedString.length() < 2) {
            this.fixedString = null;
         }

         if(this.fixedString != null) {
            this.fixedStringTable = new BMPattern(this.fixedString, 256, isSet(this.fixedStringOptions, 2));
         }
      }

   }

   private static final boolean isSet(int options, int flag) {
      return (options & flag) == flag;
   }

   public RegularExpression(String regex) throws ParseException {
      this.setPattern(regex, (String)null);
   }

   public RegularExpression(String regex, String options) throws ParseException {
      this.setPattern(regex, options);
   }

   RegularExpression(String regex, Token tok, int parens, boolean hasBackReferences, int options) {
      this.regex = regex;
      this.tokentree = tok;
      this.nofparen = parens;
      this.options = options;
      this.hasBackReferences = hasBackReferences;
   }

   public void setPattern(String newPattern) throws ParseException {
      this.setPattern(newPattern, this.options);
   }

   private void setPattern(String newPattern, int options) throws ParseException {
      this.regex = newPattern;
      this.options = options;
      Object rp = isSet(this.options, 512)?new ParserForXMLSchema():new RegexParser();
      this.tokentree = ((RegexParser)rp).parse(this.regex, this.options);
      this.nofparen = ((RegexParser)rp).parennumber;
      this.hasBackReferences = ((RegexParser)rp).hasBackReferences;
      this.operations = null;
      this.context = null;
   }

   public void setPattern(String newPattern, String options) throws ParseException {
      this.setPattern(newPattern, REUtil.parseOptions(options));
   }

   public String getPattern() {
      return this.regex;
   }

   public String toString() {
      return this.tokentree.toString(this.options);
   }

   public String getOptions() {
      return REUtil.createOptionString(this.options);
   }

   public boolean equals(Object obj) {
      if(obj == null) {
         return false;
      } else if(!(obj instanceof RegularExpression)) {
         return false;
      } else {
         RegularExpression r = (RegularExpression)obj;
         return this.regex.equals(r.regex) && this.options == r.options;
      }
   }

   boolean equals(String pattern, int options) {
      return this.regex.equals(pattern) && this.options == options;
   }

   public int hashCode() {
      return (this.regex + "/" + this.getOptions()).hashCode();
   }

   public int getNumberOfGroups() {
      return this.nofparen;
   }

   private static final int getWordType0(char ch, int opts) {
      if(!isSet(opts, 64)) {
         return isSet(opts, 32)?(Token.getRange("IsWord", true).match(ch)?1:2):(isWordChar(ch)?1:2);
      } else {
         switch(Character.getType(ch)) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 8:
         case 9:
         case 10:
         case 11:
            return 1;
         case 6:
         case 7:
         case 16:
            return 0;
         case 12:
         case 13:
         case 14:
         default:
            return 2;
         case 15:
            switch(ch) {
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
               return 2;
            default:
               return 0;
            }
         }
      }
   }

   private static final boolean isEOLChar(int ch) {
      return ch == 10 || ch == 13 || ch == 8232 || ch == 8233;
   }

   private static final boolean isWordChar(int ch) {
      return ch == 95?true:(ch < 48?false:(ch > 122?false:(ch <= 57?true:(ch < 65?false:(ch <= 90?true:ch >= 97)))));
   }

   private static final boolean matchIgnoreCase(int chardata, int ch) {
      if(chardata == ch) {
         return true;
      } else if(chardata <= '\uffff' && ch <= '\uffff') {
         char uch1 = Character.toUpperCase((char)chardata);
         char uch2 = Character.toUpperCase((char)ch);
         return uch1 == uch2?true:Character.toLowerCase(uch1) == Character.toLowerCase(uch2);
      } else {
         return false;
      }
   }

   static final class Context {

      CharacterIterator ciTarget;
      String strTarget;
      char[] charTarget;
      int start;
      int limit;
      int length;
      Match match;
      boolean inuse = false;
      int[] offsets;


      private void resetCommon(int nofclosures) {
         this.length = this.limit - this.start;
         this.inuse = true;
         this.match = null;
         if(this.offsets == null || this.offsets.length != nofclosures) {
            this.offsets = new int[nofclosures];
         }

         for(int i = 0; i < nofclosures; ++i) {
            this.offsets[i] = -1;
         }

      }

      void reset(CharacterIterator target, int start, int limit, int nofclosures) {
         this.ciTarget = target;
         this.start = start;
         this.limit = limit;
         this.resetCommon(nofclosures);
      }

      void reset(String target, int start, int limit, int nofclosures) {
         this.strTarget = target;
         this.start = start;
         this.limit = limit;
         this.resetCommon(nofclosures);
      }

      void reset(char[] target, int start, int limit, int nofclosures) {
         this.charTarget = target;
         this.start = start;
         this.limit = limit;
         this.resetCommon(nofclosures);
      }
   }
}

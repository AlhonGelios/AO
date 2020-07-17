package org.apache.poi.ss.format;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;
import org.apache.poi.ss.format.CellFormatPart;
import org.apache.poi.ss.format.CellFormatType;
import org.apache.poi.ss.format.CellFormatter;
import org.apache.poi.ss.format.CellNumberPartHandler;
import org.apache.poi.ss.format.CellNumberStringMod;
import org.apache.poi.ss.format.CellTextFormatter;
import org.apache.poi.ss.format.SimpleFraction;
import org.apache.poi.util.LocaleUtil;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public class CellNumberFormatter extends CellFormatter {

   private static final POILogger LOG = POILogFactory.getLogger(CellNumberFormatter.class);
   private final String desc;
   private final String printfFmt;
   private final double scale;
   private final CellNumberFormatter.Special decimalPoint;
   private final CellNumberFormatter.Special slash;
   private final CellNumberFormatter.Special exponent;
   private final CellNumberFormatter.Special numerator;
   private final CellNumberFormatter.Special afterInteger;
   private final CellNumberFormatter.Special afterFractional;
   private final boolean integerCommas;
   private final List specials = new ArrayList();
   private final List integerSpecials = new ArrayList();
   private final List fractionalSpecials = new ArrayList();
   private final List numeratorSpecials = new ArrayList();
   private final List denominatorSpecials = new ArrayList();
   private final List exponentSpecials = new ArrayList();
   private final List exponentDigitSpecials = new ArrayList();
   private final int maxDenominator;
   private final String numeratorFmt;
   private final String denominatorFmt;
   private final boolean improperFraction;
   private final DecimalFormat decimalFmt;
   private static final CellFormatter SIMPLE_NUMBER = new CellNumberFormatter.GeneralNumberFormatter((CellNumberFormatter.NamelessClass1058325758)null);
   private static final CellFormatter SIMPLE_INT = new CellNumberFormatter("#");
   private static final CellFormatter SIMPLE_FLOAT = new CellNumberFormatter("#.#");


   public CellNumberFormatter(String format) {
      super(format);
      CellNumberPartHandler ph = new CellNumberPartHandler();
      StringBuffer descBuf = CellFormatPart.parseFormat(format, CellFormatType.NUMBER, ph);
      this.exponent = ph.getExponent();
      this.specials.addAll(ph.getSpecials());
      this.improperFraction = ph.isImproperFraction();
      if((ph.getDecimalPoint() != null || ph.getExponent() != null) && ph.getSlash() != null) {
         this.slash = null;
         this.numerator = null;
      } else {
         this.slash = ph.getSlash();
         this.numerator = ph.getNumerator();
      }

      int precision = interpretPrecision(ph.getDecimalPoint(), this.specials);
      int fractionPartWidth = 0;
      if(ph.getDecimalPoint() != null) {
         fractionPartWidth = 1 + precision;
         if(precision == 0) {
            this.specials.remove(ph.getDecimalPoint());
            this.decimalPoint = null;
         } else {
            this.decimalPoint = ph.getDecimalPoint();
         }
      } else {
         this.decimalPoint = null;
      }

      if(this.decimalPoint != null) {
         this.afterInteger = this.decimalPoint;
      } else if(this.exponent != null) {
         this.afterInteger = this.exponent;
      } else if(this.numerator != null) {
         this.afterInteger = this.numerator;
      } else {
         this.afterInteger = null;
      }

      if(this.exponent != null) {
         this.afterFractional = this.exponent;
      } else if(this.numerator != null) {
         this.afterFractional = this.numerator;
      } else {
         this.afterFractional = null;
      }

      double[] scaleByRef = new double[]{ph.getScale()};
      this.integerCommas = interpretIntegerCommas(descBuf, this.specials, this.decimalPoint, this.integerEnd(), this.fractionalEnd(), scaleByRef);
      if(this.exponent == null) {
         this.scale = scaleByRef[0];
      } else {
         this.scale = 1.0D;
      }

      if(precision != 0) {
         this.fractionalSpecials.addAll(this.specials.subList(this.specials.indexOf(this.decimalPoint) + 1, this.fractionalEnd()));
      }

      if(this.exponent != null) {
         int fmtBuf = this.specials.indexOf(this.exponent);
         this.exponentSpecials.addAll(this.specialsFor(fmtBuf, 2));
         this.exponentDigitSpecials.addAll(this.specialsFor(fmtBuf + 2));
      }

      if(this.slash != null) {
         if(this.numerator != null) {
            this.numeratorSpecials.addAll(this.specialsFor(this.specials.indexOf(this.numerator)));
         }

         this.denominatorSpecials.addAll(this.specialsFor(this.specials.indexOf(this.slash) + 1));
         if(this.denominatorSpecials.isEmpty()) {
            this.numeratorSpecials.clear();
            this.maxDenominator = 1;
            this.numeratorFmt = null;
            this.denominatorFmt = null;
         } else {
            this.maxDenominator = maxValue(this.denominatorSpecials);
            this.numeratorFmt = singleNumberFormat(this.numeratorSpecials);
            this.denominatorFmt = singleNumberFormat(this.denominatorSpecials);
         }
      } else {
         this.maxDenominator = 1;
         this.numeratorFmt = null;
         this.denominatorFmt = null;
      }

      this.integerSpecials.addAll(this.specials.subList(0, this.integerEnd()));
      StringBuffer fmtBuf1;
      if(this.exponent == null) {
         fmtBuf1 = new StringBuffer("%");
         int first = this.calculateIntegerPartWidth();
         int specialList = first + fractionPartWidth;
         fmtBuf1.append('0').append(specialList).append('.').append(precision);
         fmtBuf1.append("f");
         this.printfFmt = fmtBuf1.toString();
         this.decimalFmt = null;
      } else {
         fmtBuf1 = new StringBuffer();
         boolean first1 = true;
         List specialList1 = this.integerSpecials;
         Iterator dfs;
         CellNumberFormatter.Special s;
         if(this.integerSpecials.size() == 1) {
            fmtBuf1.append("0");
            first1 = false;
         } else {
            dfs = specialList1.iterator();

            while(dfs.hasNext()) {
               s = (CellNumberFormatter.Special)dfs.next();
               if(isDigitFmt(s)) {
                  fmtBuf1.append((char)(first1?'#':'0'));
                  first1 = false;
               }
            }
         }

         if(this.fractionalSpecials.size() > 0) {
            fmtBuf1.append('.');
            dfs = this.fractionalSpecials.iterator();

            while(dfs.hasNext()) {
               s = (CellNumberFormatter.Special)dfs.next();
               if(isDigitFmt(s)) {
                  if(!first1) {
                     fmtBuf1.append('0');
                  }

                  first1 = false;
               }
            }
         }

         fmtBuf1.append('E');
         placeZeros(fmtBuf1, this.exponentSpecials.subList(2, this.exponentSpecials.size()));
         DecimalFormatSymbols dfs1 = DecimalFormatSymbols.getInstance(LocaleUtil.getUserLocale());
         this.decimalFmt = new DecimalFormat(fmtBuf1.toString(), dfs1);
         this.printfFmt = null;
      }

      this.desc = descBuf.toString();
   }

   private static void placeZeros(StringBuffer sb, List specials) {
      Iterator i$ = specials.iterator();

      while(i$.hasNext()) {
         CellNumberFormatter.Special s = (CellNumberFormatter.Special)i$.next();
         if(isDigitFmt(s)) {
            sb.append('0');
         }
      }

   }

   private static CellNumberStringMod insertMod(CellNumberFormatter.Special special, CharSequence toAdd, int where) {
      return new CellNumberStringMod(special, toAdd, where);
   }

   private static CellNumberStringMod deleteMod(CellNumberFormatter.Special start, boolean startInclusive, CellNumberFormatter.Special end, boolean endInclusive) {
      return new CellNumberStringMod(start, startInclusive, end, endInclusive);
   }

   private static CellNumberStringMod replaceMod(CellNumberFormatter.Special start, boolean startInclusive, CellNumberFormatter.Special end, boolean endInclusive, char withChar) {
      return new CellNumberStringMod(start, startInclusive, end, endInclusive, withChar);
   }

   private static String singleNumberFormat(List numSpecials) {
      return "%0" + numSpecials.size() + "d";
   }

   private static int maxValue(List s) {
      return (int)Math.round(Math.pow(10.0D, (double)s.size()) - 1.0D);
   }

   private List specialsFor(int pos, int takeFirst) {
      if(pos >= this.specials.size()) {
         return Collections.emptyList();
      } else {
         ListIterator it = this.specials.listIterator(pos + takeFirst);
         CellNumberFormatter.Special last = (CellNumberFormatter.Special)it.next();

         int end;
         CellNumberFormatter.Special s;
         for(end = pos + takeFirst; it.hasNext(); last = s) {
            s = (CellNumberFormatter.Special)it.next();
            if(!isDigitFmt(s) || s.pos - last.pos > 1) {
               break;
            }

            ++end;
         }

         return this.specials.subList(pos, end + 1);
      }
   }

   private List specialsFor(int pos) {
      return this.specialsFor(pos, 0);
   }

   private static boolean isDigitFmt(CellNumberFormatter.Special s) {
      return s.ch == 48 || s.ch == 63 || s.ch == 35;
   }

   private int calculateIntegerPartWidth() {
      int digitCount = 0;
      Iterator i$ = this.specials.iterator();

      while(i$.hasNext()) {
         CellNumberFormatter.Special s = (CellNumberFormatter.Special)i$.next();
         if(s == this.afterInteger) {
            break;
         }

         if(isDigitFmt(s)) {
            ++digitCount;
         }
      }

      return digitCount;
   }

   private static int interpretPrecision(CellNumberFormatter.Special decimalPoint, List specials) {
      int idx = specials.indexOf(decimalPoint);
      int precision = 0;
      if(idx != -1) {
         for(ListIterator it = specials.listIterator(idx + 1); it.hasNext(); ++precision) {
            CellNumberFormatter.Special s = (CellNumberFormatter.Special)it.next();
            if(!isDigitFmt(s)) {
               break;
            }
         }
      }

      return precision;
   }

   private static boolean interpretIntegerCommas(StringBuffer sb, List specials, CellNumberFormatter.Special decimalPoint, int integerEnd, int fractionalEnd, double[] scale) {
      ListIterator it = specials.listIterator(integerEnd);
      boolean stillScaling = true;
      boolean integerCommas = false;

      CellNumberFormatter.Special removed;
      while(it.hasPrevious()) {
         removed = (CellNumberFormatter.Special)it.previous();
         if(removed.ch != 44) {
            stillScaling = false;
         } else if(stillScaling) {
            scale[0] /= 1000.0D;
         } else {
            integerCommas = true;
         }
      }

      if(decimalPoint != null) {
         for(it = specials.listIterator(fractionalEnd); it.hasPrevious(); scale[0] /= 1000.0D) {
            removed = (CellNumberFormatter.Special)it.previous();
            if(removed.ch != 44) {
               break;
            }
         }
      }

      it = specials.listIterator();
      int var11 = 0;

      while(it.hasNext()) {
         CellNumberFormatter.Special s = (CellNumberFormatter.Special)it.next();
         s.pos -= var11;
         if(s.ch == 44) {
            ++var11;
            it.remove();
            sb.deleteCharAt(s.pos);
         }
      }

      return integerCommas;
   }

   private int integerEnd() {
      return this.afterInteger == null?this.specials.size():this.specials.indexOf(this.afterInteger);
   }

   private int fractionalEnd() {
      return this.afterFractional == null?this.specials.size():this.specials.indexOf(this.afterFractional);
   }

   public void formatValue(StringBuffer toAppendTo, Object valueObject) {
      double value = ((Number)valueObject).doubleValue();
      value *= this.scale;
      boolean negative = value < 0.0D;
      if(negative) {
         value = -value;
      }

      double fractional = 0.0D;
      if(this.slash != null) {
         if(this.improperFraction) {
            fractional = value;
            value = 0.0D;
         } else {
            fractional = value % 1.0D;
            value = (double)((long)value);
         }
      }

      TreeSet mods = new TreeSet();
      StringBuffer output = new StringBuffer(this.desc);
      if(this.exponent != null) {
         this.writeScientific(value, output, mods);
      } else if(this.improperFraction) {
         this.writeFraction(value, (StringBuffer)null, fractional, output, mods);
      } else {
         StringBuffer changes = new StringBuffer();
         Formatter nextChange = new Formatter(changes, LocaleUtil.getUserLocale());

         try {
            nextChange.format(LocaleUtil.getUserLocale(), this.printfFmt, new Object[]{Double.valueOf(value)});
         } finally {
            nextChange.close();
         }

         if(this.numerator == null) {
            this.writeFractional(changes, output);
            this.writeInteger(changes, output, this.integerSpecials, mods, this.integerCommas);
         } else {
            this.writeFraction(value, changes, fractional, output, mods);
         }
      }

      Iterator var26 = mods.iterator();
      CellNumberStringMod var27 = var26.hasNext()?(CellNumberStringMod)var26.next():null;
      BitSet deletedChars = new BitSet();
      int adjust = 0;
      Iterator i$ = this.specials.iterator();

      while(i$.hasNext()) {
         CellNumberFormatter.Special s = (CellNumberFormatter.Special)i$.next();
         int adjustedPos = s.pos + adjust;
         if(!deletedChars.get(s.pos) && output.charAt(adjustedPos) == 35) {
            output.deleteCharAt(adjustedPos);
            --adjust;
            deletedChars.set(s.pos);
         }

         while(var27 != null && s == var27.getSpecial()) {
            int lenBefore = output.length();
            int modPos = s.pos + adjust;
            switch(var27.getOp()) {
            case 1:
               output.insert(modPos, var27.getToAdd());
               break;
            case 2:
               if(!var27.getToAdd().equals(",") || !deletedChars.get(s.pos)) {
                  output.insert(modPos + 1, var27.getToAdd());
               }
               break;
            case 3:
               int delPos = s.pos;
               if(!var27.isStartInclusive()) {
                  ++delPos;
                  ++modPos;
               }

               while(deletedChars.get(delPos)) {
                  ++delPos;
                  ++modPos;
               }

               int delEndPos = var27.getEnd().pos;
               if(var27.isEndInclusive()) {
                  ++delEndPos;
               }

               int modEndPos = delEndPos + adjust;
               if(modPos < modEndPos) {
                  if("".equals(var27.getToAdd())) {
                     output.delete(modPos, modEndPos);
                  } else {
                     char fillCh = var27.getToAdd().charAt(0);

                     for(int i = modPos; i < modEndPos; ++i) {
                        output.setCharAt(i, fillCh);
                     }
                  }

                  deletedChars.set(delPos, delEndPos);
               }
               break;
            default:
               throw new IllegalStateException("Unknown op: " + var27.getOp());
            }

            adjust += output.length() - lenBefore;
            var27 = var26.hasNext()?(CellNumberStringMod)var26.next():null;
         }
      }

      if(negative) {
         toAppendTo.append('-');
      }

      toAppendTo.append(output);
   }

   private void writeScientific(double value, StringBuffer output, Set mods) {
      StringBuffer result = new StringBuffer();
      FieldPosition fractionPos = new FieldPosition(1);
      this.decimalFmt.format(value, result, fractionPos);
      this.writeInteger(result, output, this.integerSpecials, mods, this.integerCommas);
      this.writeFractional(result, output);
      int ePos = fractionPos.getEndIndex();
      int signPos = ePos + 1;
      char expSignRes = result.charAt(signPos);
      if(expSignRes != 45) {
         expSignRes = 43;
         result.insert(signPos, '+');
      }

      ListIterator it = this.exponentSpecials.listIterator(1);
      CellNumberFormatter.Special expSign = (CellNumberFormatter.Special)it.next();
      char expSignFmt = expSign.ch;
      if(expSignRes != 45 && expSignFmt != 43) {
         mods.add(deleteMod(expSign, true, expSign, true));
      } else {
         mods.add(replaceMod(expSign, true, expSign, true, expSignRes));
      }

      StringBuffer exponentNum = new StringBuffer(result.substring(signPos + 1));
      this.writeInteger(exponentNum, output, this.exponentDigitSpecials, mods, false);
   }

   private void writeFraction(double value, StringBuffer result, double fractional, StringBuffer output, Set mods) {
      if(!this.improperFraction) {
         if(fractional == 0.0D && !hasChar('0', new List[]{this.numeratorSpecials})) {
            this.writeInteger(result, output, this.integerSpecials, mods, false);
            CellNumberFormatter.Special ignored2 = lastSpecial(this.integerSpecials);
            CellNumberFormatter.Special d2 = lastSpecial(this.denominatorSpecials);
            if(hasChar('?', new List[]{this.integerSpecials, this.numeratorSpecials, this.denominatorSpecials})) {
               mods.add(replaceMod(ignored2, false, d2, true, ' '));
            } else {
               mods.add(deleteMod(ignored2, false, d2, true));
            }

            return;
         }

         boolean ignored = !hasChar('0', new List[]{this.numeratorSpecials});
         boolean d = !hasChar('0', new List[]{this.integerSpecials});
         boolean frac = this.integerSpecials.isEmpty() || this.integerSpecials.size() == 1 && hasChar('#', new List[]{this.integerSpecials});
         boolean removeBecauseZero = fractional == 0.0D && (frac || ignored);
         boolean removeBecauseFraction = fractional != 0.0D && d;
         if(value == 0.0D && (removeBecauseZero || removeBecauseFraction)) {
            CellNumberFormatter.Special start = lastSpecial(this.integerSpecials);
            boolean hasPlaceHolder = hasChar('?', new List[]{this.integerSpecials, this.numeratorSpecials});
            CellNumberStringMod sm = hasPlaceHolder?replaceMod(start, true, this.numerator, false, ' '):deleteMod(start, true, this.numerator, false);
            mods.add(sm);
         } else {
            this.writeInteger(result, output, this.integerSpecials, mods, false);
         }
      }

      try {
         int ignored1;
         int d1;
         if(fractional != 0.0D && (!this.improperFraction || fractional % 1.0D != 0.0D)) {
            SimpleFraction frac1 = SimpleFraction.buildFractionMaxDenominator(fractional, this.maxDenominator);
            ignored1 = frac1.getNumerator();
            d1 = frac1.getDenominator();
         } else {
            ignored1 = (int)Math.round(fractional);
            d1 = 1;
         }

         if(this.improperFraction) {
            ignored1 = (int)((long)ignored1 + Math.round(value * (double)d1));
         }

         this.writeSingleInteger(this.numeratorFmt, ignored1, output, this.numeratorSpecials, mods);
         this.writeSingleInteger(this.denominatorFmt, d1, output, this.denominatorSpecials, mods);
      } catch (RuntimeException var16) {
         LOG.log(7, new Object[]{"error while fraction evaluation", var16});
      }

   }

   private static boolean hasChar(char ch, List ... numSpecials) {
      List[] arr$ = numSpecials;
      int len$ = numSpecials.length;
      int i$ = 0;

      label21:
      while(i$ < len$) {
         List specials = arr$[i$];
         Iterator i$1 = specials.iterator();

         CellNumberFormatter.Special s;
         do {
            if(!i$1.hasNext()) {
               ++i$;
               continue label21;
            }

            s = (CellNumberFormatter.Special)i$1.next();
         } while(s.ch != ch);

         return true;
      }

      return false;
   }

   private void writeSingleInteger(String fmt, int num, StringBuffer output, List numSpecials, Set mods) {
      StringBuffer sb = new StringBuffer();
      Formatter formatter = new Formatter(sb, LocaleUtil.getUserLocale());

      try {
         formatter.format(LocaleUtil.getUserLocale(), fmt, new Object[]{Integer.valueOf(num)});
      } finally {
         formatter.close();
      }

      this.writeInteger(sb, output, numSpecials, mods, false);
   }

   private void writeInteger(StringBuffer result, StringBuffer output, List numSpecials, Set mods, boolean showCommas) {
      int pos = result.indexOf(".") - 1;
      if(pos < 0) {
         if(this.exponent != null && numSpecials == this.integerSpecials) {
            pos = result.indexOf("E") - 1;
         } else {
            pos = result.length() - 1;
         }
      }

      int strip;
      for(strip = 0; strip < pos; ++strip) {
         char it = result.charAt(strip);
         if(it != 48 && it != 44) {
            break;
         }
      }

      ListIterator var15 = numSpecials.listIterator(numSpecials.size());
      boolean followWithComma = false;
      CellNumberFormatter.Special lastOutputIntegerDigit = null;

      int digit;
      for(digit = 0; var15.hasPrevious(); --pos) {
         char extraLeadingDigits;
         if(pos >= 0) {
            extraLeadingDigits = result.charAt(pos);
         } else {
            extraLeadingDigits = 48;
         }

         CellNumberFormatter.Special s = (CellNumberFormatter.Special)var15.previous();
         followWithComma = showCommas && digit > 0 && digit % 3 == 0;
         boolean zeroStrip = false;
         if(extraLeadingDigits != 48 || s.ch == 48 || s.ch == 63 || pos >= strip) {
            zeroStrip = s.ch == 63 && pos < strip;
            output.setCharAt(s.pos, zeroStrip?' ':extraLeadingDigits);
            lastOutputIntegerDigit = s;
         }

         if(followWithComma) {
            mods.add(insertMod(s, zeroStrip?" ":",", 2));
            followWithComma = false;
         }

         ++digit;
      }

      new StringBuffer();
      if(pos >= 0) {
         ++pos;
         StringBuffer var16 = new StringBuffer(result.substring(0, pos));
         if(showCommas) {
            while(pos > 0) {
               if(digit > 0 && digit % 3 == 0) {
                  var16.insert(pos, ',');
               }

               ++digit;
               --pos;
            }
         }

         mods.add(insertMod(lastOutputIntegerDigit, var16, 1));
      }

   }

   private void writeFractional(StringBuffer result, StringBuffer output) {
      if(this.fractionalSpecials.size() > 0) {
         int digit = result.indexOf(".") + 1;
         int strip;
         if(this.exponent != null) {
            strip = result.indexOf("e") - 1;
         } else {
            strip = result.length() - 1;
         }

         while(strip > digit && result.charAt(strip) == 48) {
            --strip;
         }

         for(Iterator i$ = this.fractionalSpecials.iterator(); i$.hasNext(); ++digit) {
            CellNumberFormatter.Special s = (CellNumberFormatter.Special)i$.next();
            char resultCh = result.charAt(digit);
            if(resultCh == 48 && s.ch != 48 && digit >= strip) {
               if(s.ch == 63) {
                  output.setCharAt(s.pos, ' ');
               }
            } else {
               output.setCharAt(s.pos, resultCh);
            }
         }
      }

   }

   public void simpleValue(StringBuffer toAppendTo, Object value) {
      SIMPLE_NUMBER.formatValue(toAppendTo, value);
   }

   private static CellNumberFormatter.Special lastSpecial(List s) {
      return (CellNumberFormatter.Special)s.get(s.size() - 1);
   }


   private static class GeneralNumberFormatter extends CellFormatter {

      private GeneralNumberFormatter() {
         super("General");
      }

      public void formatValue(StringBuffer toAppendTo, Object value) {
         if(value != null) {
            CellFormatter cf;
            if(value instanceof Number) {
               Number num = (Number)value;
               cf = num.doubleValue() % 1.0D == 0.0D?CellNumberFormatter.SIMPLE_INT:CellNumberFormatter.SIMPLE_FLOAT;
            } else {
               cf = CellTextFormatter.SIMPLE_TEXT;
            }

            cf.formatValue(toAppendTo, value);
         }
      }

      public void simpleValue(StringBuffer toAppendTo, Object value) {
         this.formatValue(toAppendTo, value);
      }

      // $FF: synthetic method
      GeneralNumberFormatter(CellNumberFormatter.NamelessClass1058325758 x0) {
         this();
      }
   }

   // $FF: synthetic class
   static class NamelessClass1058325758 {
   }

   static class Special {

      final char ch;
      int pos;


      Special(char ch, int pos) {
         this.ch = ch;
         this.pos = pos;
      }

      public String toString() {
         return "\'" + this.ch + "\' @ " + this.pos;
      }
   }
}

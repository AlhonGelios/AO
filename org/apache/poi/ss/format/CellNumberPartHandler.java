package org.apache.poi.ss.format;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import org.apache.poi.ss.format.CellFormatPart;
import org.apache.poi.ss.format.CellFormatType;
import org.apache.poi.ss.format.CellNumberFormatter;
import org.apache.poi.util.Internal;

@Internal
public class CellNumberPartHandler implements CellFormatPart.PartHandler {

   private char insertSignForExponent;
   private double scale = 1.0D;
   private CellNumberFormatter.Special decimalPoint;
   private CellNumberFormatter.Special slash;
   private CellNumberFormatter.Special exponent;
   private CellNumberFormatter.Special numerator;
   private final List specials = new LinkedList();
   private boolean improperFraction;


   public String handlePart(Matcher m, String part, CellFormatType type, StringBuffer descBuf) {
      int pos = descBuf.length();
      char firstCh = part.charAt(0);
      switch(firstCh) {
      case 35:
      case 48:
      case 63:
         if(this.insertSignForExponent != 0) {
            this.specials.add(new CellNumberFormatter.Special(this.insertSignForExponent, pos));
            descBuf.append(this.insertSignForExponent);
            this.insertSignForExponent = 0;
            ++pos;
         }

         for(int i = 0; i < part.length(); ++i) {
            char ch = part.charAt(i);
            this.specials.add(new CellNumberFormatter.Special(ch, pos + i));
         }

         return part;
      case 37:
         this.scale *= 100.0D;
         break;
      case 46:
         if(this.decimalPoint == null && this.specials.size() > 0) {
            this.decimalPoint = new CellNumberFormatter.Special('.', pos);
            this.specials.add(this.decimalPoint);
         }
         break;
      case 47:
         if(this.slash == null && this.specials.size() > 0) {
            this.numerator = this.previousNumber();
            this.improperFraction |= this.numerator == firstDigit(this.specials);
            this.slash = new CellNumberFormatter.Special('.', pos);
            this.specials.add(this.slash);
         }
         break;
      case 69:
      case 101:
         if(this.exponent == null && this.specials.size() > 0) {
            this.exponent = new CellNumberFormatter.Special('.', pos);
            this.specials.add(this.exponent);
            this.insertSignForExponent = part.charAt(1);
            return part.substring(0, 1);
         }
         break;
      default:
         return null;
      }

      return part;
   }

   public double getScale() {
      return this.scale;
   }

   public CellNumberFormatter.Special getDecimalPoint() {
      return this.decimalPoint;
   }

   public CellNumberFormatter.Special getSlash() {
      return this.slash;
   }

   public CellNumberFormatter.Special getExponent() {
      return this.exponent;
   }

   public CellNumberFormatter.Special getNumerator() {
      return this.numerator;
   }

   public List getSpecials() {
      return this.specials;
   }

   public boolean isImproperFraction() {
      return this.improperFraction;
   }

   private CellNumberFormatter.Special previousNumber() {
      ListIterator it = this.specials.listIterator(this.specials.size());

      CellNumberFormatter.Special s;
      do {
         if(!it.hasPrevious()) {
            return null;
         }

         s = (CellNumberFormatter.Special)it.previous();
      } while(!isDigitFmt(s));

      CellNumberFormatter.Special last;
      for(last = s; it.hasPrevious(); last = s) {
         s = (CellNumberFormatter.Special)it.previous();
         if(last.pos - s.pos > 1 || !isDigitFmt(s)) {
            break;
         }
      }

      return last;
   }

   private static boolean isDigitFmt(CellNumberFormatter.Special s) {
      return s.ch == 48 || s.ch == 63 || s.ch == 35;
   }

   private static CellNumberFormatter.Special firstDigit(List specials) {
      Iterator i$ = specials.iterator();

      CellNumberFormatter.Special s;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         s = (CellNumberFormatter.Special)i$.next();
      } while(!isDigitFmt(s));

      return s;
   }
}

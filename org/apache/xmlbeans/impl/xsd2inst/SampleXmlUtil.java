package org.apache.xmlbeans.impl.xsd2inst;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.GDate;
import org.apache.xmlbeans.GDateBuilder;
import org.apache.xmlbeans.GDuration;
import org.apache.xmlbeans.GDurationBuilder;
import org.apache.xmlbeans.SchemaLocalElement;
import org.apache.xmlbeans.SchemaParticle;
import org.apache.xmlbeans.SchemaProperty;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.SimpleValue;
import org.apache.xmlbeans.XmlAnySimpleType;
import org.apache.xmlbeans.XmlCalendar;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlDate;
import org.apache.xmlbeans.XmlDateTime;
import org.apache.xmlbeans.XmlDecimal;
import org.apache.xmlbeans.XmlDuration;
import org.apache.xmlbeans.XmlGDay;
import org.apache.xmlbeans.XmlGMonth;
import org.apache.xmlbeans.XmlGMonthDay;
import org.apache.xmlbeans.XmlGYear;
import org.apache.xmlbeans.XmlGYearMonth;
import org.apache.xmlbeans.XmlInteger;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.XmlTime;
import org.apache.xmlbeans.impl.util.Base64;
import org.apache.xmlbeans.impl.util.HexBin;
import org.apache.xmlbeans.soap.SOAPArrayType;
import org.apache.xmlbeans.soap.SchemaWSDLArrayType;

public class SampleXmlUtil {

   private boolean _soapEnc;
   private static final int MAX_ELEMENTS = 1000;
   private int _nElements;
   Random _picker = new Random(1L);
   public static final String[] WORDS = new String[]{"ipsa", "iovis", "rapidum", "iaculata", "e", "nubibus", "ignem", "disiecitque", "rates", "evertitque", "aequora", "ventis", "illum", "exspirantem", "transfixo", "pectore", "flammas", "turbine", "corripuit", "scopuloque", "infixit", "acuto", "ast", "ego", "quae", "divum", "incedo", "regina", "iovisque", "et", "soror", "et", "coniunx", "una", "cum", "gente", "tot", "annos", "bella", "gero", "et", "quisquam", "numen", "iunonis", "adorat", "praeterea", "aut", "supplex", "aris", "imponet", "honorem", "talia", "flammato", "secum", "dea", "corde", "volutans", "nimborum", "in", "patriam", "loca", "feta", "furentibus", "austris", "aeoliam", "venit", "hic", "vasto", "rex", "aeolus", "antro", "luctantis", "ventos", "tempestatesque", "sonoras", "imperio", "premit", "ac", "vinclis", "et", "carcere", "frenat", "illi", "indignantes", "magno", "cum", "murmure", "montis", "circum", "claustra", "fremunt", "celsa", "sedet", "aeolus", "arce", "sceptra", "tenens", "mollitque", "animos", "et", "temperat", "iras", "ni", "faciat", "maria", "ac", "terras", "caelumque", "profundum", "quippe", "ferant", "rapidi", "secum", "verrantque", "per", "auras", "sed", "pater", "omnipotens", "speluncis", "abdidit", "atris", "hoc", "metuens", "molemque", "et", "montis", "insuper", "altos", "imposuit", "regemque", "dedit", "qui", "foedere", "certo", "et", "premere", "et", "laxas", "sciret", "dare", "iussus", "habenas"};
   private static final String[] DNS1 = new String[]{"corp", "your", "my", "sample", "company", "test", "any"};
   private static final String[] DNS2 = new String[]{"com", "org", "com", "gov", "org", "com", "org", "com", "edu"};
   private static final QName HREF = new QName("href");
   private static final QName ID = new QName("id");
   private static final QName XSI_TYPE = new QName("http://www.w3.org/2001/XMLSchema-instance", "type");
   private static final QName ENC_ARRAYTYPE = new QName("http://schemas.xmlsoap.org/soap/encoding/", "arrayType");
   private static final QName ENC_OFFSET = new QName("http://schemas.xmlsoap.org/soap/encoding/", "offset");
   private static final Set SKIPPED_SOAP_ATTRS = new HashSet(Arrays.asList(new QName[]{HREF, ID, ENC_OFFSET}));
   private ArrayList _typeStack = new ArrayList();


   private SampleXmlUtil(boolean soapEnc) {
      this._soapEnc = soapEnc;
   }

   public static String createSampleForType(SchemaType sType) {
      XmlObject object = XmlObject.Factory.newInstance();
      XmlCursor cursor = object.newCursor();
      cursor.toNextToken();
      (new SampleXmlUtil(false)).createSampleForType(sType, cursor);
      XmlOptions options = new XmlOptions();
      options.put("SAVE_PRETTY_PRINT");
      options.put("SAVE_PRETTY_PRINT_INDENT", 2);
      options.put("SAVE_AGGRESSIVE_NAMESPACES");
      String result = object.xmlText(options);
      return result;
   }

   private void createSampleForType(SchemaType stype, XmlCursor xmlc) {
      if(!this._typeStack.contains(stype)) {
         this._typeStack.add(stype);

         try {
            if(!stype.isSimpleType() && !stype.isURType()) {
               this.processAttributes(stype, xmlc);
               switch(stype.getContentType()) {
               case 0:
               case 1:
               default:
                  return;
               case 2:
                  this.processSimpleType(stype, xmlc);
                  return;
               case 3:
                  if(stype.getContentModel() != null) {
                     this.processParticle(stype.getContentModel(), xmlc, false);
                  }

                  return;
               case 4:
                  xmlc.insertChars(this.pick(WORDS) + " ");
                  if(stype.getContentModel() != null) {
                     this.processParticle(stype.getContentModel(), xmlc, true);
                  }

                  xmlc.insertChars(this.pick(WORDS));
                  return;
               }
            }

            this.processSimpleType(stype, xmlc);
         } finally {
            this._typeStack.remove(this._typeStack.size() - 1);
         }

      }
   }

   private void processSimpleType(SchemaType stype, XmlCursor xmlc) {
      String sample = this.sampleDataForSimpleType(stype);
      xmlc.insertChars(sample);
   }

   private String sampleDataForSimpleType(SchemaType sType) {
      if(XmlObject.type.equals(sType)) {
         return "anyType";
      } else if(XmlAnySimpleType.type.equals(sType)) {
         return "anySimpleType";
      } else if(sType.getSimpleVariety() != 3) {
         if(sType.getSimpleVariety() == 2) {
            SchemaType[] var8 = sType.getUnionConstituentTypes();
            return var8.length == 0?"":this.sampleDataForSimpleType(var8[this.pick(var8.length)]);
         } else {
            XmlAnySimpleType[] var7 = sType.getEnumerationValues();
            if(var7 != null && var7.length > 0) {
               return var7[this.pick(var7.length)].getStringValue();
            } else {
               String var9;
               switch(sType.getPrimitiveType().getBuiltinTypeCode()) {
               case 0:
               default:
                  return "";
               case 1:
               case 2:
                  return "anything";
               case 3:
                  return this.pick(2) == 0?"true":"false";
               case 4:
                  var9 = null;

                  try {
                     var9 = new String(Base64.encode(this.formatToLength(this.pick(WORDS), sType).getBytes("utf-8")));
                  } catch (UnsupportedEncodingException var6) {
                     ;
                  }

                  return var9;
               case 5:
                  return HexBin.encode(this.formatToLength(this.pick(WORDS), sType));
               case 6:
                  return this.formatToLength("http://www." + this.pick(DNS1) + "." + this.pick(DNS2) + "/" + this.pick(WORDS) + "/" + this.pick(WORDS), sType);
               case 7:
                  return this.formatToLength("qname", sType);
               case 8:
                  return this.formatToLength("notation", sType);
               case 9:
                  return "1.5E2";
               case 10:
                  return "1.051732E7";
               case 11:
                  switch(this.closestBuiltin(sType).getBuiltinTypeCode()) {
                  case 11:
                  case 12:
                  case 13:
                  case 14:
                  case 15:
                  case 16:
                  case 17:
                  case 18:
                  case 19:
                  case 20:
                  case 21:
                  default:
                     return this.formatDecimal("1000.00", sType);
                  case 22:
                     return this.formatDecimal("100", sType);
                  case 23:
                     return this.formatDecimal("10", sType);
                  case 24:
                     return this.formatDecimal("3", sType);
                  case 25:
                     return this.formatDecimal("1", sType);
                  case 26:
                     return this.formatDecimal("2", sType);
                  case 27:
                     return this.formatDecimal("-200", sType);
                  case 28:
                     return this.formatDecimal("-201", sType);
                  case 29:
                     return this.formatDecimal("200", sType);
                  case 30:
                     return this.formatDecimal("201", sType);
                  case 31:
                     return this.formatDecimal("11", sType);
                  case 32:
                     return this.formatDecimal("7", sType);
                  case 33:
                     return this.formatDecimal("5", sType);
                  case 34:
                     return this.formatDecimal("6", sType);
                  }
               case 12:
                  switch(this.closestBuiltin(sType).getBuiltinTypeCode()) {
                  case 12:
                  case 35:
                     var9 = "string";
                     break;
                  case 36:
                     var9 = "token";
                     break;
                  default:
                     var9 = "string";
                  }

                  return this.formatToLength(var9, sType);
               case 13:
                  return this.formatDuration(sType);
               case 14:
               case 15:
               case 16:
               case 17:
               case 18:
               case 19:
               case 20:
               case 21:
                  return this.formatDate(sType);
               }
            }
         }
      } else {
         SchemaType enumValues = sType.getListItemType();
         StringBuffer result = new StringBuffer();
         int e = this.pickLength(sType);
         if(e > 0) {
            result.append(this.sampleDataForSimpleType(enumValues));
         }

         for(int i = 1; i < e; ++i) {
            result.append(' ');
            result.append(this.sampleDataForSimpleType(enumValues));
         }

         return result.toString();
      }
   }

   private int pick(int n) {
      return this._picker.nextInt(n);
   }

   private String pick(String[] a) {
      return a[this.pick(a.length)];
   }

   private String pick(String[] a, int count) {
      if(count <= 0) {
         return "";
      } else {
         int i = this.pick(a.length);
         StringBuffer sb = new StringBuffer(a[i]);

         while(count-- > 0) {
            ++i;
            if(i >= a.length) {
               i = 0;
            }

            sb.append(' ');
            sb.append(a[i]);
         }

         return sb.toString();
      }
   }

   private String pickDigits(int digits) {
      StringBuffer sb = new StringBuffer();

      while(digits-- > 0) {
         sb.append(Integer.toString(this.pick(10)));
      }

      return sb.toString();
   }

   private int pickLength(SchemaType sType) {
      XmlInteger length = (XmlInteger)sType.getFacet(0);
      if(length != null) {
         return length.getBigIntegerValue().intValue();
      } else {
         XmlInteger min = (XmlInteger)sType.getFacet(1);
         XmlInteger max = (XmlInteger)sType.getFacet(2);
         int minInt;
         if(min == null) {
            minInt = 0;
         } else {
            minInt = min.getBigIntegerValue().intValue();
         }

         int maxInt;
         if(max == null) {
            maxInt = Integer.MAX_VALUE;
         } else {
            maxInt = max.getBigIntegerValue().intValue();
         }

         if(minInt == 0 && maxInt >= 1) {
            minInt = 1;
         }

         if(maxInt > minInt + 2) {
            maxInt = minInt + 2;
         }

         if(maxInt < minInt) {
            maxInt = minInt;
         }

         return minInt + this.pick(maxInt - minInt);
      }
   }

   private String formatToLength(String s, SchemaType sType) {
      String result = s;

      try {
         SimpleValue e = (SimpleValue)sType.getFacet(0);
         if(e == null) {
            e = (SimpleValue)sType.getFacet(1);
         }

         if(e != null) {
            for(int max = e.getIntValue(); result.length() < max; result = result + result) {
               ;
            }
         }

         SimpleValue max1 = (SimpleValue)sType.getFacet(0);
         if(max1 == null) {
            max1 = (SimpleValue)sType.getFacet(2);
         }

         if(max1 != null) {
            int len = max1.getIntValue();
            if(result.length() > len) {
               result = result.substring(0, len);
            }
         }
      } catch (Exception var7) {
         ;
      }

      return result;
   }

   private String formatDecimal(String start, SchemaType sType) {
      BigDecimal result = new BigDecimal(start);
      XmlDecimal xmlD = (XmlDecimal)sType.getFacet(4);
      BigDecimal min = xmlD != null?xmlD.getBigDecimalValue():null;
      xmlD = (XmlDecimal)sType.getFacet(5);
      BigDecimal max = xmlD != null?xmlD.getBigDecimalValue():null;
      boolean minInclusive = true;
      boolean maxInclusive = true;
      xmlD = (XmlDecimal)sType.getFacet(3);
      BigDecimal totalDigits;
      if(xmlD != null) {
         totalDigits = xmlD.getBigDecimalValue();
         if(min == null || min.compareTo(totalDigits) < 0) {
            min = totalDigits;
            minInclusive = false;
         }
      }

      xmlD = (XmlDecimal)sType.getFacet(6);
      if(xmlD != null) {
         totalDigits = xmlD.getBigDecimalValue();
         if(max == null || max.compareTo(totalDigits) > 0) {
            max = totalDigits;
            maxInclusive = false;
         }
      }

      xmlD = (XmlDecimal)sType.getFacet(7);
      int var19 = -1;
      int sigMax;
      if(xmlD != null) {
         var19 = xmlD.getBigDecimalValue().intValue();
         StringBuffer sigMin = new StringBuffer(var19);

         for(sigMax = 0; sigMax < var19; ++sigMax) {
            sigMin.append('9');
         }

         BigDecimal var21 = new BigDecimal(sigMin.toString());
         if(max != null && max.compareTo(var21) > 0) {
            max = var21;
            maxInclusive = true;
         }

         var21 = var21.negate();
         if(min != null && min.compareTo(var21) < 0) {
            min = var21;
            minInclusive = true;
         }
      }

      int var20 = min == null?1:result.compareTo(min);
      sigMax = max == null?-1:result.compareTo(max);
      boolean minOk = var20 > 0 || var20 == 0 && minInclusive;
      boolean maxOk = sigMax < 0 || sigMax == 0 && maxInclusive;
      xmlD = (XmlDecimal)sType.getFacet(8);
      int fractionDigits = -1;
      BigDecimal increment;
      if(xmlD == null) {
         increment = new BigDecimal(1);
      } else {
         fractionDigits = xmlD.getBigDecimalValue().intValue();
         if(fractionDigits > 0) {
            StringBuffer digits = new StringBuffer("0.");

            for(int ONE = 1; ONE < fractionDigits; ++ONE) {
               digits.append('0');
            }

            digits.append('1');
            increment = new BigDecimal(digits.toString());
         } else {
            increment = new BigDecimal(1.0D);
         }
      }

      if(!minOk || !maxOk) {
         if(minOk && !maxOk) {
            if(maxInclusive) {
               result = max;
            } else {
               result = max.subtract(increment);
            }
         } else if(!minOk && maxOk) {
            if(minInclusive) {
               result = min;
            } else {
               result = min.add(increment);
            }
         }
      }

      int var22 = 0;
      BigDecimal var23 = new BigDecimal(BigInteger.ONE);

      for(BigDecimal n = result; n.abs().compareTo(var23) >= 0; ++var22) {
         n = n.movePointLeft(1);
      }

      if(fractionDigits > 0) {
         if(var19 >= 0) {
            result = result.setScale(Math.max(fractionDigits, var19 - var22));
         } else {
            result = result.setScale(fractionDigits);
         }
      } else if(fractionDigits == 0) {
         result = result.setScale(0);
      }

      return result.toString();
   }

   private String formatDuration(SchemaType sType) {
      XmlDuration d = (XmlDuration)sType.getFacet(4);
      GDuration minInclusive = null;
      if(d != null) {
         minInclusive = d.getGDurationValue();
      }

      d = (XmlDuration)sType.getFacet(5);
      GDuration maxInclusive = null;
      if(d != null) {
         maxInclusive = d.getGDurationValue();
      }

      d = (XmlDuration)sType.getFacet(3);
      GDuration minExclusive = null;
      if(d != null) {
         minExclusive = d.getGDurationValue();
      }

      d = (XmlDuration)sType.getFacet(6);
      GDuration maxExclusive = null;
      if(d != null) {
         maxExclusive = d.getGDurationValue();
      }

      GDurationBuilder gdurb = new GDurationBuilder();
      gdurb.setSecond(this.pick(800000));
      gdurb.setMonth(this.pick(20));
      if(minInclusive != null) {
         if(gdurb.getYear() < minInclusive.getYear()) {
            gdurb.setYear(minInclusive.getYear());
         }

         if(gdurb.getMonth() < minInclusive.getMonth()) {
            gdurb.setMonth(minInclusive.getMonth());
         }

         if(gdurb.getDay() < minInclusive.getDay()) {
            gdurb.setDay(minInclusive.getDay());
         }

         if(gdurb.getHour() < minInclusive.getHour()) {
            gdurb.setHour(minInclusive.getHour());
         }

         if(gdurb.getMinute() < minInclusive.getMinute()) {
            gdurb.setMinute(minInclusive.getMinute());
         }

         if(gdurb.getSecond() < minInclusive.getSecond()) {
            gdurb.setSecond(minInclusive.getSecond());
         }

         if(gdurb.getFraction().compareTo(minInclusive.getFraction()) < 0) {
            gdurb.setFraction(minInclusive.getFraction());
         }
      }

      if(maxInclusive != null) {
         if(gdurb.getYear() > maxInclusive.getYear()) {
            gdurb.setYear(maxInclusive.getYear());
         }

         if(gdurb.getMonth() > maxInclusive.getMonth()) {
            gdurb.setMonth(maxInclusive.getMonth());
         }

         if(gdurb.getDay() > maxInclusive.getDay()) {
            gdurb.setDay(maxInclusive.getDay());
         }

         if(gdurb.getHour() > maxInclusive.getHour()) {
            gdurb.setHour(maxInclusive.getHour());
         }

         if(gdurb.getMinute() > maxInclusive.getMinute()) {
            gdurb.setMinute(maxInclusive.getMinute());
         }

         if(gdurb.getSecond() > maxInclusive.getSecond()) {
            gdurb.setSecond(maxInclusive.getSecond());
         }

         if(gdurb.getFraction().compareTo(maxInclusive.getFraction()) > 0) {
            gdurb.setFraction(maxInclusive.getFraction());
         }
      }

      if(minExclusive != null) {
         if(gdurb.getYear() <= minExclusive.getYear()) {
            gdurb.setYear(minExclusive.getYear() + 1);
         }

         if(gdurb.getMonth() <= minExclusive.getMonth()) {
            gdurb.setMonth(minExclusive.getMonth() + 1);
         }

         if(gdurb.getDay() <= minExclusive.getDay()) {
            gdurb.setDay(minExclusive.getDay() + 1);
         }

         if(gdurb.getHour() <= minExclusive.getHour()) {
            gdurb.setHour(minExclusive.getHour() + 1);
         }

         if(gdurb.getMinute() <= minExclusive.getMinute()) {
            gdurb.setMinute(minExclusive.getMinute() + 1);
         }

         if(gdurb.getSecond() <= minExclusive.getSecond()) {
            gdurb.setSecond(minExclusive.getSecond() + 1);
         }

         if(gdurb.getFraction().compareTo(minExclusive.getFraction()) <= 0) {
            gdurb.setFraction(minExclusive.getFraction().add(new BigDecimal(0.001D)));
         }
      }

      if(maxExclusive != null) {
         if(gdurb.getYear() > maxExclusive.getYear()) {
            gdurb.setYear(maxExclusive.getYear());
         }

         if(gdurb.getMonth() > maxExclusive.getMonth()) {
            gdurb.setMonth(maxExclusive.getMonth());
         }

         if(gdurb.getDay() > maxExclusive.getDay()) {
            gdurb.setDay(maxExclusive.getDay());
         }

         if(gdurb.getHour() > maxExclusive.getHour()) {
            gdurb.setHour(maxExclusive.getHour());
         }

         if(gdurb.getMinute() > maxExclusive.getMinute()) {
            gdurb.setMinute(maxExclusive.getMinute());
         }

         if(gdurb.getSecond() > maxExclusive.getSecond()) {
            gdurb.setSecond(maxExclusive.getSecond());
         }

         if(gdurb.getFraction().compareTo(maxExclusive.getFraction()) > 0) {
            gdurb.setFraction(maxExclusive.getFraction());
         }
      }

      gdurb.normalize();
      return gdurb.toString();
   }

   private String formatDate(SchemaType sType) {
      GDateBuilder gdateb = new GDateBuilder(new Date(1000L * (long)this.pick(31536000) + (30L + (long)this.pick(20)) * 365L * 24L * 60L * 60L * 1000L));
      GDate min = null;
      GDate max = null;
      switch(sType.getPrimitiveType().getBuiltinTypeCode()) {
      case 14:
         XmlDateTime c7 = (XmlDateTime)sType.getFacet(4);
         if(c7 != null) {
            min = c7.getGDateValue();
         }

         c7 = (XmlDateTime)sType.getFacet(3);
         if(c7 != null && (min == null || min.compareToGDate(c7.getGDateValue()) <= 0)) {
            min = c7.getGDateValue();
         }

         c7 = (XmlDateTime)sType.getFacet(5);
         if(c7 != null) {
            max = c7.getGDateValue();
         }

         c7 = (XmlDateTime)sType.getFacet(6);
         if(c7 != null && (max == null || max.compareToGDate(c7.getGDateValue()) >= 0)) {
            max = c7.getGDateValue();
         }
         break;
      case 15:
         XmlTime c6 = (XmlTime)sType.getFacet(4);
         if(c6 != null) {
            min = c6.getGDateValue();
         }

         c6 = (XmlTime)sType.getFacet(3);
         if(c6 != null && (min == null || min.compareToGDate(c6.getGDateValue()) <= 0)) {
            min = c6.getGDateValue();
         }

         c6 = (XmlTime)sType.getFacet(5);
         if(c6 != null) {
            max = c6.getGDateValue();
         }

         c6 = (XmlTime)sType.getFacet(6);
         if(c6 != null && (max == null || max.compareToGDate(c6.getGDateValue()) >= 0)) {
            max = c6.getGDateValue();
         }
         break;
      case 16:
         XmlDate c5 = (XmlDate)sType.getFacet(4);
         if(c5 != null) {
            min = c5.getGDateValue();
         }

         c5 = (XmlDate)sType.getFacet(3);
         if(c5 != null && (min == null || min.compareToGDate(c5.getGDateValue()) <= 0)) {
            min = c5.getGDateValue();
         }

         c5 = (XmlDate)sType.getFacet(5);
         if(c5 != null) {
            max = c5.getGDateValue();
         }

         c5 = (XmlDate)sType.getFacet(6);
         if(c5 != null && (max == null || max.compareToGDate(c5.getGDateValue()) >= 0)) {
            max = c5.getGDateValue();
         }
         break;
      case 17:
         XmlGYearMonth c4 = (XmlGYearMonth)sType.getFacet(4);
         if(c4 != null) {
            min = c4.getGDateValue();
         }

         c4 = (XmlGYearMonth)sType.getFacet(3);
         if(c4 != null && (min == null || min.compareToGDate(c4.getGDateValue()) <= 0)) {
            min = c4.getGDateValue();
         }

         c4 = (XmlGYearMonth)sType.getFacet(5);
         if(c4 != null) {
            max = c4.getGDateValue();
         }

         c4 = (XmlGYearMonth)sType.getFacet(6);
         if(c4 != null && (max == null || max.compareToGDate(c4.getGDateValue()) >= 0)) {
            max = c4.getGDateValue();
         }
         break;
      case 18:
         XmlGYear c3 = (XmlGYear)sType.getFacet(4);
         if(c3 != null) {
            min = c3.getGDateValue();
         }

         c3 = (XmlGYear)sType.getFacet(3);
         if(c3 != null && (min == null || min.compareToGDate(c3.getGDateValue()) <= 0)) {
            min = c3.getGDateValue();
         }

         c3 = (XmlGYear)sType.getFacet(5);
         if(c3 != null) {
            max = c3.getGDateValue();
         }

         c3 = (XmlGYear)sType.getFacet(6);
         if(c3 != null && (max == null || max.compareToGDate(c3.getGDateValue()) >= 0)) {
            max = c3.getGDateValue();
         }
         break;
      case 19:
         XmlGMonthDay c2 = (XmlGMonthDay)sType.getFacet(4);
         if(c2 != null) {
            min = c2.getGDateValue();
         }

         c2 = (XmlGMonthDay)sType.getFacet(3);
         if(c2 != null && (min == null || min.compareToGDate(c2.getGDateValue()) <= 0)) {
            min = c2.getGDateValue();
         }

         c2 = (XmlGMonthDay)sType.getFacet(5);
         if(c2 != null) {
            max = c2.getGDateValue();
         }

         c2 = (XmlGMonthDay)sType.getFacet(6);
         if(c2 != null && (max == null || max.compareToGDate(c2.getGDateValue()) >= 0)) {
            max = c2.getGDateValue();
         }
         break;
      case 20:
         XmlGDay c1 = (XmlGDay)sType.getFacet(4);
         if(c1 != null) {
            min = c1.getGDateValue();
         }

         c1 = (XmlGDay)sType.getFacet(3);
         if(c1 != null && (min == null || min.compareToGDate(c1.getGDateValue()) <= 0)) {
            min = c1.getGDateValue();
         }

         c1 = (XmlGDay)sType.getFacet(5);
         if(c1 != null) {
            max = c1.getGDateValue();
         }

         c1 = (XmlGDay)sType.getFacet(6);
         if(c1 != null && (max == null || max.compareToGDate(c1.getGDateValue()) >= 0)) {
            max = c1.getGDateValue();
         }
         break;
      case 21:
         XmlGMonth c = (XmlGMonth)sType.getFacet(4);
         if(c != null) {
            min = c.getGDateValue();
         }

         c = (XmlGMonth)sType.getFacet(3);
         if(c != null && (min == null || min.compareToGDate(c.getGDateValue()) <= 0)) {
            min = c.getGDateValue();
         }

         c = (XmlGMonth)sType.getFacet(5);
         if(c != null) {
            max = c.getGDateValue();
         }

         c = (XmlGMonth)sType.getFacet(6);
         if(c != null && (max == null || max.compareToGDate(c.getGDateValue()) >= 0)) {
            max = c.getGDateValue();
         }
      }

      XmlCalendar c8;
      if(min != null && max == null) {
         if(min.compareToGDate(gdateb) >= 0) {
            c8 = gdateb.getCalendar();
            c8.add(11, this.pick(8));
            gdateb = new GDateBuilder(c8);
         }
      } else if(min == null && max != null) {
         if(max.compareToGDate(gdateb) <= 0) {
            c8 = gdateb.getCalendar();
            c8.add(11, 0 - this.pick(8));
            gdateb = new GDateBuilder(c8);
         }
      } else if(min != null && max != null && (min.compareToGDate(gdateb) >= 0 || max.compareToGDate(gdateb) <= 0)) {
         c8 = min.getCalendar();
         XmlCalendar cmax = max.getCalendar();
         c8.add(11, 1);
         if(c8.after(cmax)) {
            c8.add(11, -1);
            c8.add(12, 1);
            if(c8.after(cmax)) {
               c8.add(12, -1);
               c8.add(13, 1);
               if(c8.after(cmax)) {
                  c8.add(13, -1);
                  c8.add(14, 1);
                  if(c8.after(cmax)) {
                     c8.add(14, -1);
                  }
               }
            }
         }

         gdateb = new GDateBuilder(c8);
      }

      gdateb.setBuiltinTypeCode(sType.getPrimitiveType().getBuiltinTypeCode());
      if(this.pick(2) == 0) {
         gdateb.clearTimeZone();
      }

      return gdateb.toString();
   }

   private SchemaType closestBuiltin(SchemaType sType) {
      while(!sType.isBuiltinType()) {
         sType = sType.getBaseType();
      }

      return sType;
   }

   public static QName crackQName(String qName) {
      int index = qName.lastIndexOf(58);
      String ns;
      String name;
      if(index >= 0) {
         ns = qName.substring(0, index);
         name = qName.substring(index + 1);
      } else {
         ns = "";
         name = qName;
      }

      return new QName(ns, name);
   }

   private void processParticle(SchemaParticle sp, XmlCursor xmlc, boolean mixed) {
      int loop = this.determineMinMaxForSample(sp, xmlc);

      while(loop-- > 0) {
         switch(sp.getParticleType()) {
         case 1:
            this.processAll(sp, xmlc, mixed);
            break;
         case 2:
            this.processChoice(sp, xmlc, mixed);
            break;
         case 3:
            this.processSequence(sp, xmlc, mixed);
            break;
         case 4:
            this.processElement(sp, xmlc, mixed);
            break;
         case 5:
            this.processWildCard(sp, xmlc, mixed);
         }
      }

   }

   private int determineMinMaxForSample(SchemaParticle sp, XmlCursor xmlc) {
      int minOccurs = sp.getIntMinOccurs();
      int maxOccurs = sp.getIntMaxOccurs();
      if(minOccurs == maxOccurs) {
         return minOccurs;
      } else {
         int result = minOccurs;
         if(minOccurs == 0 && this._nElements < 1000) {
            result = 1;
         }

         if(sp.getParticleType() != 4) {
            return result;
         } else {
            if(sp.getMaxOccurs() == null) {
               if(minOccurs == 0) {
                  xmlc.insertComment("Zero or more repetitions:");
               } else {
                  xmlc.insertComment(minOccurs + " or more repetitions:");
               }
            } else if(sp.getIntMaxOccurs() > 1) {
               xmlc.insertComment(minOccurs + " to " + sp.getMaxOccurs() + " repetitions:");
            } else {
               xmlc.insertComment("Optional:");
            }

            return result;
         }
      }
   }

   private String getItemNameOrType(SchemaParticle sp, XmlCursor xmlc) {
      String elementOrTypeName = null;
      if(sp.getParticleType() == 4) {
         elementOrTypeName = "Element (" + sp.getName().getLocalPart() + ")";
      } else {
         elementOrTypeName = this.printParticleType(sp.getParticleType());
      }

      return elementOrTypeName;
   }

   private void processElement(SchemaParticle sp, XmlCursor xmlc, boolean mixed) {
      SchemaLocalElement element = (SchemaLocalElement)sp;
      if(this._soapEnc) {
         xmlc.insertElement(element.getName().getLocalPart());
      } else {
         xmlc.insertElement(element.getName().getLocalPart(), element.getName().getNamespaceURI());
      }

      ++this._nElements;
      xmlc.toPrevToken();
      this.createSampleForType(element.getType(), xmlc);
      xmlc.toNextToken();
   }

   private void moveToken(int numToMove, XmlCursor xmlc) {
      for(int i = 0; i < Math.abs(numToMove); ++i) {
         if(numToMove < 0) {
            xmlc.toPrevToken();
         } else {
            xmlc.toNextToken();
         }
      }

   }

   private static final String formatQName(XmlCursor xmlc, QName qName) {
      XmlCursor parent = xmlc.newCursor();
      parent.toParent();
      String prefix = parent.prefixForNamespace(qName.getNamespaceURI());
      parent.dispose();
      String name;
      if(prefix != null && prefix.length() != 0) {
         name = prefix + ":" + qName.getLocalPart();
      } else {
         name = qName.getLocalPart();
      }

      return name;
   }

   private void processAttributes(SchemaType stype, XmlCursor xmlc) {
      if(this._soapEnc) {
         QName attrProps = stype.getName();
         if(attrProps != null) {
            xmlc.insertAttributeWithValue(XSI_TYPE, formatQName(xmlc, attrProps));
         }
      }

      SchemaProperty[] var7 = stype.getAttributeProperties();

      for(int i = 0; i < var7.length; ++i) {
         SchemaProperty attr = var7[i];
         if(this._soapEnc) {
            if(SKIPPED_SOAP_ATTRS.contains(attr.getName())) {
               continue;
            }

            if(ENC_ARRAYTYPE.equals(attr.getName())) {
               SOAPArrayType var8 = ((SchemaWSDLArrayType)stype.getAttributeModel().getAttribute(attr.getName())).getWSDLArrayType();
               if(var8 != null) {
                  xmlc.insertAttributeWithValue(attr.getName(), formatQName(xmlc, var8.getQName()) + var8.soap11DimensionString());
               }
               continue;
            }
         }

         String defaultValue = attr.getDefaultText();
         xmlc.insertAttributeWithValue(attr.getName(), defaultValue == null?this.sampleDataForSimpleType(attr.getType()):defaultValue);
      }

   }

   private void processSequence(SchemaParticle sp, XmlCursor xmlc, boolean mixed) {
      SchemaParticle[] spc = sp.getParticleChildren();

      for(int i = 0; i < spc.length; ++i) {
         this.processParticle(spc[i], xmlc, mixed);
         if(mixed && i < spc.length - 1) {
            xmlc.insertChars(this.pick(WORDS));
         }
      }

   }

   private void processChoice(SchemaParticle sp, XmlCursor xmlc, boolean mixed) {
      SchemaParticle[] spc = sp.getParticleChildren();
      xmlc.insertComment("You have a CHOICE of the next " + String.valueOf(spc.length) + " items at this level");

      for(int i = 0; i < spc.length; ++i) {
         this.processParticle(spc[i], xmlc, mixed);
      }

   }

   private void processAll(SchemaParticle sp, XmlCursor xmlc, boolean mixed) {
      SchemaParticle[] spc = sp.getParticleChildren();

      for(int i = 0; i < spc.length; ++i) {
         this.processParticle(spc[i], xmlc, mixed);
         if(mixed && i < spc.length - 1) {
            xmlc.insertChars(this.pick(WORDS));
         }
      }

   }

   private void processWildCard(SchemaParticle sp, XmlCursor xmlc, boolean mixed) {
      xmlc.insertComment("You may enter ANY elements at this point");
      xmlc.insertElement("AnyElement");
   }

   private static QName getClosestName(SchemaType sType) {
      while(sType.getName() == null) {
         sType = sType.getBaseType();
      }

      return sType.getName();
   }

   private String printParticleType(int particleType) {
      StringBuffer returnParticleType = new StringBuffer();
      returnParticleType.append("Schema Particle Type: ");
      switch(particleType) {
      case 1:
         returnParticleType.append("ALL\n");
         break;
      case 2:
         returnParticleType.append("CHOICE\n");
         break;
      case 3:
         returnParticleType.append("SEQUENCE\n");
         break;
      case 4:
         returnParticleType.append("ELEMENT\n");
         break;
      case 5:
         returnParticleType.append("WILDCARD\n");
         break;
      default:
         returnParticleType.append("Schema Particle Type Unknown");
      }

      return returnParticleType.toString();
   }

}

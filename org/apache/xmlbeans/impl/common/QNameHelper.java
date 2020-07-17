package org.apache.xmlbeans.impl.common;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import org.apache.xmlbeans.SchemaField;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.impl.common.XMLChar;
import org.apache.xmlbeans.impl.common.XMLNameHelper;
import org.apache.xmlbeans.xml.stream.XMLName;

public class QNameHelper {

   private static final Map WELL_KNOWN_PREFIXES = buildWKP();
   private static final char[] hexdigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
   public static final int MAX_NAME_LENGTH = 64;
   public static final String URI_SHA1_PREFIX = "URI_SHA_1_";


   public static XMLName getXMLName(QName qname) {
      return qname == null?null:XMLNameHelper.forLNS(qname.getLocalPart(), qname.getNamespaceURI());
   }

   public static QName forLNS(String localname, String uri) {
      if(uri == null) {
         uri = "";
      }

      return new QName(uri, localname);
   }

   public static QName forLN(String localname) {
      return new QName("", localname);
   }

   public static QName forPretty(String pretty, int offset) {
      int at = pretty.indexOf(64, offset);
      return at < 0?new QName("", pretty.substring(offset)):new QName(pretty.substring(at + 1), pretty.substring(offset, at));
   }

   public static String pretty(QName name) {
      return name == null?"null":(name.getNamespaceURI() != null && name.getNamespaceURI().length() != 0?name.getLocalPart() + "@" + name.getNamespaceURI():name.getLocalPart());
   }

   private static boolean isSafe(int c) {
      return c >= 97 && c <= 122?true:(c >= 65 && c <= 90?true:c >= 48 && c <= 57);
   }

   public static String hexsafe(String s) {
      StringBuffer result = new StringBuffer();

      int j;
      byte[] var12;
      for(int e = 0; e < s.length(); ++e) {
         char inputBytes = s.charAt(e);
         if(isSafe(inputBytes)) {
            result.append(inputBytes);
         } else {
            Object digest = null;

            try {
               var12 = s.substring(e, e + 1).getBytes("UTF-8");

               for(j = 0; j < var12.length; ++j) {
                  result.append('_');
                  result.append(hexdigits[var12[j] >> 4 & 15]);
                  result.append(hexdigits[var12[j] & 15]);
               }
            } catch (UnsupportedEncodingException var8) {
               result.append("_BAD_UTF8_CHAR");
            }
         }
      }

      if(result.length() <= 64) {
         return result.toString();
      } else {
         try {
            MessageDigest var9 = MessageDigest.getInstance("SHA");
            Object var10 = null;

            byte[] var11;
            try {
               var11 = s.getBytes("UTF-8");
            } catch (UnsupportedEncodingException var6) {
               var11 = new byte[0];
            }

            var12 = var9.digest(var11);

            assert var12.length == 20;

            result = new StringBuffer("URI_SHA_1_");

            for(j = 0; j < var12.length; ++j) {
               result.append(hexdigits[var12[j] >> 4 & 15]);
               result.append(hexdigits[var12[j] & 15]);
            }

            return result.toString();
         } catch (NoSuchAlgorithmException var7) {
            throw new IllegalStateException("Using in a JDK without an SHA implementation");
         }
      }
   }

   public static String hexsafedir(QName name) {
      return name.getNamespaceURI() != null && name.getNamespaceURI().length() != 0?hexsafe(name.getNamespaceURI()) + "/" + hexsafe(name.getLocalPart()):"_nons/" + hexsafe(name.getLocalPart());
   }

   private static Map buildWKP() {
      HashMap result = new HashMap();
      result.put("http://www.w3.org/XML/1998/namespace", "xml");
      result.put("http://www.w3.org/2001/XMLSchema", "xs");
      result.put("http://www.w3.org/2001/XMLSchema-instance", "xsi");
      result.put("http://schemas.xmlsoap.org/wsdl/", "wsdl");
      result.put("http://schemas.xmlsoap.org/soap/encoding/", "soapenc");
      result.put("http://schemas.xmlsoap.org/soap/envelope/", "soapenv");
      return Collections.unmodifiableMap(result);
   }

   public static String readable(SchemaType sType) {
      return readable(sType, WELL_KNOWN_PREFIXES);
   }

   public static String readable(SchemaType sType, Map nsPrefix) {
      if(sType.getName() != null) {
         return readable(sType.getName(), nsPrefix);
      } else if(sType.isAttributeType()) {
         return "attribute type " + readable(sType.getAttributeTypeAttributeName(), nsPrefix);
      } else if(sType.isDocumentType()) {
         return "document type " + readable(sType.getDocumentElementName(), nsPrefix);
      } else if(!sType.isNoType() && sType.getOuterType() != null) {
         SchemaType outerType = sType.getOuterType();
         SchemaField container = sType.getContainerField();
         return outerType.isAttributeType()?"type of attribute " + readable(container.getName(), nsPrefix):(outerType.isDocumentType()?"type of element " + readable(container.getName(), nsPrefix):(container != null?(container.isAttribute()?"type of " + container.getName().getLocalPart() + " attribute in " + readable(outerType, nsPrefix):"type of " + container.getName().getLocalPart() + " element in " + readable(outerType, nsPrefix)):(outerType.getBaseType() == sType?"base type of " + readable(outerType, nsPrefix):(outerType.getSimpleVariety() == 3?"item type of " + readable(outerType, nsPrefix):(outerType.getSimpleVariety() == 2?"member type " + sType.getAnonymousUnionMemberOrdinal() + " of " + readable(outerType, nsPrefix):"inner type in " + readable(outerType, nsPrefix))))));
      } else {
         return "invalid type";
      }
   }

   public static String readable(QName name) {
      return readable(name, WELL_KNOWN_PREFIXES);
   }

   public static String readable(QName name, Map prefixes) {
      if(name.getNamespaceURI().length() == 0) {
         return name.getLocalPart();
      } else {
         String prefix = (String)prefixes.get(name.getNamespaceURI());
         return prefix != null?prefix + ":" + name.getLocalPart():name.getLocalPart() + " in namespace " + name.getNamespaceURI();
      }
   }

   public static String suggestPrefix(String namespace) {
      String result = (String)WELL_KNOWN_PREFIXES.get(namespace);
      if(result != null) {
         return result;
      } else {
         int len = namespace.length();
         int i = namespace.lastIndexOf(47);
         if(i > 0 && i == namespace.length() - 1) {
            len = i;
            i = namespace.lastIndexOf(47, i - 1);
         }

         ++i;
         if(namespace.startsWith("www.", i)) {
            i += 4;
         }

         while(i < len && !XMLChar.isNCNameStart(namespace.charAt(i))) {
            ++i;
         }

         for(int end = i + 1; end < len; ++end) {
            if(!XMLChar.isNCName(namespace.charAt(end)) || !Character.isLetterOrDigit(namespace.charAt(end))) {
               len = end;
               break;
            }
         }

         if(namespace.length() >= i + 3 && startsWithXml(namespace, i)) {
            return namespace.length() >= i + 4?"x" + Character.toLowerCase(namespace.charAt(i + 3)):"ns";
         } else {
            if(len - i > 4) {
               if(isVowel(namespace.charAt(i + 2)) && !isVowel(namespace.charAt(i + 3))) {
                  len = i + 4;
               } else {
                  len = i + 3;
               }
            }

            return len - i == 0?"ns":namespace.substring(i, len).toLowerCase();
         }
      }
   }

   private static boolean startsWithXml(String s, int i) {
      return s.length() < i + 3?false:(s.charAt(i) != 88 && s.charAt(i) != 120?false:(s.charAt(i + 1) != 77 && s.charAt(i + 1) != 109?false:s.charAt(i + 2) == 76 || s.charAt(i + 2) == 108));
   }

   private static boolean isVowel(char ch) {
      switch(ch) {
      case 65:
      case 69:
      case 73:
      case 79:
      case 85:
      case 97:
      case 101:
      case 105:
      case 111:
      case 117:
         return true;
      default:
         return false;
      }
   }

   public static String namespace(SchemaType sType) {
      while(sType != null) {
         if(sType.getName() != null) {
            return sType.getName().getNamespaceURI();
         }

         if(sType.getContainerField() != null && sType.getContainerField().getName().getNamespaceURI().length() > 0) {
            return sType.getContainerField().getName().getNamespaceURI();
         }

         sType = sType.getOuterType();
      }

      return "";
   }

   public static String getLocalPart(String qname) {
      int index = qname.indexOf(58);
      return index < 0?qname:qname.substring(index + 1);
   }

   public static String getPrefixPart(String qname) {
      int index = qname.indexOf(58);
      return index >= 0?qname.substring(0, index):"";
   }

}

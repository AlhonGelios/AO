package org.apache.xmlbeans.impl.common;

import javax.xml.stream.XMLStreamReader;

public final class XmlStreamUtils {

   public static String printEvent(XMLStreamReader xmlr) {
      StringBuffer b = new StringBuffer();
      b.append("EVENT:[" + xmlr.getLocation().getLineNumber() + "][" + xmlr.getLocation().getColumnNumber() + "] ");
      b.append(getName(xmlr.getEventType()));
      b.append(" [");
      int start;
      String var6;
      switch(xmlr.getEventType()) {
      case 1:
         b.append("<");
         printName(xmlr, b);

         for(start = 0; start < xmlr.getNamespaceCount(); ++start) {
            b.append(" ");
            var6 = xmlr.getNamespacePrefix(start);
            if("xmlns".equals(var6)) {
               b.append("xmlns=\"" + xmlr.getNamespaceURI(start) + "\"");
            } else {
               b.append("xmlns:" + var6);
               b.append("=\"");
               b.append(xmlr.getNamespaceURI(start));
               b.append("\"");
            }
         }

         for(start = 0; start < xmlr.getAttributeCount(); ++start) {
            b.append(" ");
            printName(xmlr.getAttributePrefix(start), xmlr.getAttributeNamespace(start), xmlr.getAttributeLocalName(start), b);
            b.append("=\"");
            b.append(xmlr.getAttributeValue(start));
            b.append("\"");
         }

         b.append(">");
         break;
      case 2:
         b.append("</");
         printName(xmlr, b);

         for(start = 0; start < xmlr.getNamespaceCount(); ++start) {
            b.append(" ");
            var6 = xmlr.getNamespacePrefix(start);
            if("xmlns".equals(var6)) {
               b.append("xmlns=\"" + xmlr.getNamespaceURI(start) + "\"");
            } else {
               b.append("xmlns:" + var6);
               b.append("=\"");
               b.append(xmlr.getNamespaceURI(start));
               b.append("\"");
            }
         }

         b.append(">");
         break;
      case 3:
         String target = xmlr.getPITarget();
         if(target == null) {
            target = "";
         }

         String data = xmlr.getPIData();
         if(data == null) {
            data = "";
         }

         b.append("<?");
         b.append(target + " " + data);
         b.append("?>");
         break;
      case 4:
      case 6:
         start = xmlr.getTextStart();
         int length = xmlr.getTextLength();
         b.append(new String(xmlr.getTextCharacters(), start, length));
         break;
      case 5:
         b.append("<!--");
         if(xmlr.hasText()) {
            b.append(xmlr.getText());
         }

         b.append("-->");
         break;
      case 7:
         b.append("<?xml");
         b.append(" version=\'" + xmlr.getVersion() + "\'");
         b.append(" encoding=\'" + xmlr.getCharacterEncodingScheme() + "\'");
         if(xmlr.isStandalone()) {
            b.append(" standalone=\'yes\'");
         } else {
            b.append(" standalone=\'no\'");
         }

         b.append("?>");
      case 8:
      case 10:
      case 11:
      default:
         break;
      case 9:
         b.append(xmlr.getLocalName() + "=");
         if(xmlr.hasText()) {
            b.append("[" + xmlr.getText() + "]");
         }
         break;
      case 12:
         b.append("<![CDATA[");
         if(xmlr.hasText()) {
            b.append(xmlr.getText());
         }

         b.append("]]>");
      }

      b.append("]");
      return b.toString();
   }

   private static void printName(String prefix, String uri, String localName, StringBuffer b) {
      if(uri != null && !"".equals(uri)) {
         b.append("[\'" + uri + "\']:");
      }

      if(prefix != null && !"".equals(prefix)) {
         b.append(prefix + ":");
      }

      if(localName != null) {
         b.append(localName);
      }

   }

   private static void printName(XMLStreamReader xmlr, StringBuffer b) {
      if(xmlr.hasName()) {
         String prefix = xmlr.getPrefix();
         String uri = xmlr.getNamespaceURI();
         String localName = xmlr.getLocalName();
         printName(prefix, uri, localName, b);
      }

   }

   public static String getName(int eventType) {
      switch(eventType) {
      case 1:
         return "START_ELEMENT";
      case 2:
         return "END_ELEMENT";
      case 3:
         return "PROCESSING_INSTRUCTION";
      case 4:
         return "CHARACTERS";
      case 5:
         return "COMMENT";
      case 6:
         return "SPACE";
      case 7:
         return "START_DOCUMENT";
      case 8:
         return "END_DOCUMENT";
      case 9:
         return "ENTITY_REFERENCE";
      case 10:
         return "ATTRIBUTE";
      case 11:
         return "DTD";
      case 12:
         return "CDATA";
      case 13:
         return "NAMESPACE";
      default:
         return "UNKNOWN_EVENT_TYPE";
      }
   }

   public static int getType(String val) {
      return val.equals("START_ELEMENT")?1:(val.equals("SPACE")?6:(val.equals("END_ELEMENT")?2:(val.equals("PROCESSING_INSTRUCTION")?3:(val.equals("CHARACTERS")?4:(val.equals("COMMENT")?5:(val.equals("START_DOCUMENT")?7:(val.equals("END_DOCUMENT")?8:(val.equals("ATTRIBUTE")?10:(val.equals("DTD")?11:(val.equals("CDATA")?12:(val.equals("NAMESPACE")?13:-1)))))))))));
   }
}

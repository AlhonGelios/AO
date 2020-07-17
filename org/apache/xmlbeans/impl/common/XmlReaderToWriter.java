package org.apache.xmlbeans.impl.common;

import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

public final class XmlReaderToWriter {

   public static void writeAll(XMLStreamReader xmlr, XMLStreamWriter writer) throws XMLStreamException {
      while(xmlr.hasNext()) {
         write(xmlr, writer);
         xmlr.next();
      }

      write(xmlr, writer);
      writer.flush();
   }

   public static void write(XMLStreamReader xmlr, XMLStreamWriter writer) throws XMLStreamException {
      String encoding;
      switch(xmlr.getEventType()) {
      case 1:
         String localName = xmlr.getLocalName();
         String namespaceURI = xmlr.getNamespaceURI();
         if(namespaceURI != null && namespaceURI.length() > 0) {
            encoding = xmlr.getPrefix();
            if(encoding != null) {
               writer.writeStartElement(encoding, localName, namespaceURI);
            } else {
               writer.writeStartElement(namespaceURI, localName);
            }
         } else {
            writer.writeStartElement(localName);
         }

         int var7 = 0;

         int var8;
         for(var8 = xmlr.getNamespaceCount(); var7 < var8; ++var7) {
            writer.writeNamespace(xmlr.getNamespacePrefix(var7), xmlr.getNamespaceURI(var7));
         }

         var7 = 0;

         for(var8 = xmlr.getAttributeCount(); var7 < var8; ++var7) {
            String attUri = xmlr.getAttributeNamespace(var7);
            if(attUri != null) {
               writer.writeAttribute(attUri, xmlr.getAttributeLocalName(var7), xmlr.getAttributeValue(var7));
            } else {
               writer.writeAttribute(xmlr.getAttributeLocalName(var7), xmlr.getAttributeValue(var7));
            }
         }

         return;
      case 2:
         writer.writeEndElement();
         break;
      case 3:
         writer.writeProcessingInstruction(xmlr.getPITarget(), xmlr.getPIData());
         break;
      case 4:
      case 6:
         writer.writeCharacters(xmlr.getTextCharacters(), xmlr.getTextStart(), xmlr.getTextLength());
         break;
      case 5:
         writer.writeComment(xmlr.getText());
         break;
      case 7:
         encoding = xmlr.getCharacterEncodingScheme();
         String version = xmlr.getVersion();
         if(encoding != null && version != null) {
            writer.writeStartDocument(encoding, version);
         } else if(version != null) {
            writer.writeStartDocument(xmlr.getVersion());
         }
         break;
      case 8:
         writer.writeEndDocument();
         break;
      case 9:
         writer.writeEntityRef(xmlr.getLocalName());
      case 10:
      default:
         break;
      case 11:
         writer.writeDTD(xmlr.getText());
         break;
      case 12:
         writer.writeCData(xmlr.getText());
      }

   }
}

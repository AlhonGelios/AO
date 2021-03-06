package org.apache.poi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.util.DocumentHelper;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class POIXMLTypeLoader {

   public static final XmlOptions DEFAULT_XML_OPTIONS = new XmlOptions();


   private static XmlOptions getXmlOptions(XmlOptions options) {
      return options == null?DEFAULT_XML_OPTIONS:options;
   }

   public static XmlObject newInstance(SchemaType type, XmlOptions options) {
      return XmlBeans.getContextTypeLoader().newInstance(type, getXmlOptions(options));
   }

   public static XmlObject parse(String xmlText, SchemaType type, XmlOptions options) throws XmlException {
      try {
         return parse((Reader)(new StringReader(xmlText)), type, options);
      } catch (IOException var4) {
         throw new XmlException("Unable to parse xml bean", var4);
      }
   }

   public static XmlObject parse(File file, SchemaType type, XmlOptions options) throws XmlException, IOException {
      FileInputStream is = new FileInputStream(file);

      XmlObject var4;
      try {
         var4 = parse((InputStream)is, type, options);
      } finally {
         is.close();
      }

      return var4;
   }

   public static XmlObject parse(URL file, SchemaType type, XmlOptions options) throws XmlException, IOException {
      InputStream is = file.openStream();

      XmlObject var4;
      try {
         var4 = parse(is, type, options);
      } finally {
         is.close();
      }

      return var4;
   }

   public static XmlObject parse(InputStream jiois, SchemaType type, XmlOptions options) throws XmlException, IOException {
      try {
         Document e = DocumentHelper.readDocument(jiois);
         return XmlBeans.getContextTypeLoader().parse((Node)e.getDocumentElement(), type, getXmlOptions(options));
      } catch (SAXException var4) {
         throw new IOException("Unable to parse xml bean", var4);
      }
   }

   public static XmlObject parse(XMLStreamReader xsr, SchemaType type, XmlOptions options) throws XmlException {
      return XmlBeans.getContextTypeLoader().parse(xsr, type, getXmlOptions(options));
   }

   public static XmlObject parse(Reader jior, SchemaType type, XmlOptions options) throws XmlException, IOException {
      try {
         Document e = DocumentHelper.readDocument(new InputSource(jior));
         return XmlBeans.getContextTypeLoader().parse((Node)e.getDocumentElement(), type, getXmlOptions(options));
      } catch (SAXException var4) {
         throw new XmlException("Unable to parse xml bean", var4);
      }
   }

   public static XmlObject parse(Node node, SchemaType type, XmlOptions options) throws XmlException {
      return XmlBeans.getContextTypeLoader().parse(node, type, getXmlOptions(options));
   }

   public static XmlObject parse(XMLInputStream xis, SchemaType type, XmlOptions options) throws XmlException, XMLStreamException {
      return XmlBeans.getContextTypeLoader().parse(xis, type, getXmlOptions(options));
   }

   public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, SchemaType type, XmlOptions options) throws XmlException, XMLStreamException {
      return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, type, getXmlOptions(options));
   }

   static {
      DEFAULT_XML_OPTIONS.setSaveOuter();
      DEFAULT_XML_OPTIONS.setUseDefaultNamespace();
      DEFAULT_XML_OPTIONS.setSaveAggressiveNamespaces();
      DEFAULT_XML_OPTIONS.setCharacterEncoding("UTF-8");
      HashMap map = new HashMap();
      map.put("http://schemas.openxmlformats.org/drawingml/2006/main", "a");
      map.put("http://schemas.openxmlformats.org/drawingml/2006/chart", "c");
      map.put("http://schemas.openxmlformats.org/drawingml/2006/wordprocessingDrawing", "wp");
      map.put("http://schemas.openxmlformats.org/markup-compatibility/2006", "ve");
      map.put("http://schemas.openxmlformats.org/officeDocument/2006/math", "m");
      map.put("http://schemas.openxmlformats.org/officeDocument/2006/relationships", "r");
      map.put("http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes", "vt");
      map.put("http://schemas.openxmlformats.org/presentationml/2006/main", "p");
      map.put("http://schemas.openxmlformats.org/wordprocessingml/2006/main", "w");
      map.put("http://schemas.microsoft.com/office/word/2006/wordml", "wne");
      map.put("urn:schemas-microsoft-com:office:office", "o");
      map.put("urn:schemas-microsoft-com:office:excel", "x");
      map.put("urn:schemas-microsoft-com:office:word", "w10");
      map.put("urn:schemas-microsoft-com:vml", "v");
      DEFAULT_XML_OPTIONS.setSaveSuggestedPrefixes(Collections.unmodifiableMap(map));
   }
}

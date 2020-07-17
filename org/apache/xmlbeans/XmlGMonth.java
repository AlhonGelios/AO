package org.apache.xmlbeans;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.Calendar;
import javax.xml.stream.XMLStreamReader;
import org.apache.xmlbeans.GDate;
import org.apache.xmlbeans.GDateSpecification;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlAnySimpleType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.w3c.dom.Node;

public interface XmlGMonth extends XmlAnySimpleType {

   SchemaType type = XmlBeans.getBuiltinTypeSystem().typeForHandle("_BI_gMonth");


   Calendar getCalendarValue();

   void setCalendarValue(Calendar var1);

   GDate getGDateValue();

   void setGDateValue(GDate var1);

   int getIntValue();

   void setIntValue(int var1);

   Calendar calendarValue();

   void set(Calendar var1);

   GDate gDateValue();

   void set(GDateSpecification var1);

   int intValue();

   void set(int var1);


   public static final class Factory {

      public static XmlGMonth newInstance() {
         return (XmlGMonth)XmlBeans.getContextTypeLoader().newInstance(XmlGMonth.type, (XmlOptions)null);
      }

      public static XmlGMonth newInstance(XmlOptions options) {
         return (XmlGMonth)XmlBeans.getContextTypeLoader().newInstance(XmlGMonth.type, options);
      }

      public static XmlGMonth newValue(Object obj) {
         return (XmlGMonth)XmlGMonth.type.newValue(obj);
      }

      public static XmlGMonth parse(String s) throws XmlException {
         return (XmlGMonth)XmlBeans.getContextTypeLoader().parse(s, XmlGMonth.type, (XmlOptions)null);
      }

      public static XmlGMonth parse(String s, XmlOptions options) throws XmlException {
         return (XmlGMonth)XmlBeans.getContextTypeLoader().parse(s, XmlGMonth.type, options);
      }

      public static XmlGMonth parse(File f) throws XmlException, IOException {
         return (XmlGMonth)XmlBeans.getContextTypeLoader().parse(f, XmlGMonth.type, (XmlOptions)null);
      }

      public static XmlGMonth parse(File f, XmlOptions options) throws XmlException, IOException {
         return (XmlGMonth)XmlBeans.getContextTypeLoader().parse(f, XmlGMonth.type, options);
      }

      public static XmlGMonth parse(URL u) throws XmlException, IOException {
         return (XmlGMonth)XmlBeans.getContextTypeLoader().parse(u, XmlGMonth.type, (XmlOptions)null);
      }

      public static XmlGMonth parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (XmlGMonth)XmlBeans.getContextTypeLoader().parse(u, XmlGMonth.type, options);
      }

      public static XmlGMonth parse(InputStream is) throws XmlException, IOException {
         return (XmlGMonth)XmlBeans.getContextTypeLoader().parse(is, XmlGMonth.type, (XmlOptions)null);
      }

      public static XmlGMonth parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (XmlGMonth)XmlBeans.getContextTypeLoader().parse(is, XmlGMonth.type, options);
      }

      public static XmlGMonth parse(Reader r) throws XmlException, IOException {
         return (XmlGMonth)XmlBeans.getContextTypeLoader().parse(r, XmlGMonth.type, (XmlOptions)null);
      }

      public static XmlGMonth parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (XmlGMonth)XmlBeans.getContextTypeLoader().parse(r, XmlGMonth.type, options);
      }

      public static XmlGMonth parse(Node node) throws XmlException {
         return (XmlGMonth)XmlBeans.getContextTypeLoader().parse(node, XmlGMonth.type, (XmlOptions)null);
      }

      public static XmlGMonth parse(Node node, XmlOptions options) throws XmlException {
         return (XmlGMonth)XmlBeans.getContextTypeLoader().parse(node, XmlGMonth.type, options);
      }

      public static XmlGMonth parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (XmlGMonth)XmlBeans.getContextTypeLoader().parse(xis, XmlGMonth.type, (XmlOptions)null);
      }

      public static XmlGMonth parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (XmlGMonth)XmlBeans.getContextTypeLoader().parse(xis, XmlGMonth.type, options);
      }

      public static XmlGMonth parse(XMLStreamReader xsr) throws XmlException {
         return (XmlGMonth)XmlBeans.getContextTypeLoader().parse(xsr, XmlGMonth.type, (XmlOptions)null);
      }

      public static XmlGMonth parse(XMLStreamReader xsr, XmlOptions options) throws XmlException {
         return (XmlGMonth)XmlBeans.getContextTypeLoader().parse(xsr, XmlGMonth.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlGMonth.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlGMonth.type, options);
      }

   }
}

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

public interface XmlGYearMonth extends XmlAnySimpleType {

   SchemaType type = XmlBeans.getBuiltinTypeSystem().typeForHandle("_BI_gYearMonth");


   Calendar getCalendarValue();

   void setCalendarValue(Calendar var1);

   GDate getGDateValue();

   void setGDateValue(GDate var1);

   Calendar calendarValue();

   void set(Calendar var1);

   GDate gDateValue();

   void set(GDateSpecification var1);


   public static final class Factory {

      public static XmlGYearMonth newInstance() {
         return (XmlGYearMonth)XmlBeans.getContextTypeLoader().newInstance(XmlGYearMonth.type, (XmlOptions)null);
      }

      public static XmlGYearMonth newInstance(XmlOptions options) {
         return (XmlGYearMonth)XmlBeans.getContextTypeLoader().newInstance(XmlGYearMonth.type, options);
      }

      public static XmlGYearMonth newValue(Object obj) {
         return (XmlGYearMonth)XmlGYearMonth.type.newValue(obj);
      }

      public static XmlGYearMonth parse(String s) throws XmlException {
         return (XmlGYearMonth)XmlBeans.getContextTypeLoader().parse(s, XmlGYearMonth.type, (XmlOptions)null);
      }

      public static XmlGYearMonth parse(String s, XmlOptions options) throws XmlException {
         return (XmlGYearMonth)XmlBeans.getContextTypeLoader().parse(s, XmlGYearMonth.type, options);
      }

      public static XmlGYearMonth parse(File f) throws XmlException, IOException {
         return (XmlGYearMonth)XmlBeans.getContextTypeLoader().parse(f, XmlGYearMonth.type, (XmlOptions)null);
      }

      public static XmlGYearMonth parse(File f, XmlOptions options) throws XmlException, IOException {
         return (XmlGYearMonth)XmlBeans.getContextTypeLoader().parse(f, XmlGYearMonth.type, options);
      }

      public static XmlGYearMonth parse(URL u) throws XmlException, IOException {
         return (XmlGYearMonth)XmlBeans.getContextTypeLoader().parse(u, XmlGYearMonth.type, (XmlOptions)null);
      }

      public static XmlGYearMonth parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (XmlGYearMonth)XmlBeans.getContextTypeLoader().parse(u, XmlGYearMonth.type, options);
      }

      public static XmlGYearMonth parse(InputStream is) throws XmlException, IOException {
         return (XmlGYearMonth)XmlBeans.getContextTypeLoader().parse(is, XmlGYearMonth.type, (XmlOptions)null);
      }

      public static XmlGYearMonth parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (XmlGYearMonth)XmlBeans.getContextTypeLoader().parse(is, XmlGYearMonth.type, options);
      }

      public static XmlGYearMonth parse(Reader r) throws XmlException, IOException {
         return (XmlGYearMonth)XmlBeans.getContextTypeLoader().parse(r, XmlGYearMonth.type, (XmlOptions)null);
      }

      public static XmlGYearMonth parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (XmlGYearMonth)XmlBeans.getContextTypeLoader().parse(r, XmlGYearMonth.type, options);
      }

      public static XmlGYearMonth parse(Node node) throws XmlException {
         return (XmlGYearMonth)XmlBeans.getContextTypeLoader().parse(node, XmlGYearMonth.type, (XmlOptions)null);
      }

      public static XmlGYearMonth parse(Node node, XmlOptions options) throws XmlException {
         return (XmlGYearMonth)XmlBeans.getContextTypeLoader().parse(node, XmlGYearMonth.type, options);
      }

      public static XmlGYearMonth parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (XmlGYearMonth)XmlBeans.getContextTypeLoader().parse(xis, XmlGYearMonth.type, (XmlOptions)null);
      }

      public static XmlGYearMonth parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (XmlGYearMonth)XmlBeans.getContextTypeLoader().parse(xis, XmlGYearMonth.type, options);
      }

      public static XmlGYearMonth parse(XMLStreamReader xsr) throws XmlException {
         return (XmlGYearMonth)XmlBeans.getContextTypeLoader().parse(xsr, XmlGYearMonth.type, (XmlOptions)null);
      }

      public static XmlGYearMonth parse(XMLStreamReader xsr, XmlOptions options) throws XmlException {
         return (XmlGYearMonth)XmlBeans.getContextTypeLoader().parse(xsr, XmlGYearMonth.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlGYearMonth.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlGYearMonth.type, options);
      }

   }
}

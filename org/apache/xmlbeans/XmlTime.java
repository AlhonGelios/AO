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

public interface XmlTime extends XmlAnySimpleType {

   SchemaType type = XmlBeans.getBuiltinTypeSystem().typeForHandle("_BI_time");


   Calendar getCalendarValue();

   void setCalendarValue(Calendar var1);

   GDate getGDateValue();

   void setGDateValue(GDate var1);

   Calendar calendarValue();

   void set(Calendar var1);

   GDate gDateValue();

   void set(GDateSpecification var1);


   public static final class Factory {

      public static XmlTime newInstance() {
         return (XmlTime)XmlBeans.getContextTypeLoader().newInstance(XmlTime.type, (XmlOptions)null);
      }

      public static XmlTime newInstance(XmlOptions options) {
         return (XmlTime)XmlBeans.getContextTypeLoader().newInstance(XmlTime.type, options);
      }

      public static XmlTime newValue(Object obj) {
         return (XmlTime)XmlTime.type.newValue(obj);
      }

      public static XmlTime parse(String s) throws XmlException {
         return (XmlTime)XmlBeans.getContextTypeLoader().parse(s, XmlTime.type, (XmlOptions)null);
      }

      public static XmlTime parse(String s, XmlOptions options) throws XmlException {
         return (XmlTime)XmlBeans.getContextTypeLoader().parse(s, XmlTime.type, options);
      }

      public static XmlTime parse(File f) throws XmlException, IOException {
         return (XmlTime)XmlBeans.getContextTypeLoader().parse(f, XmlTime.type, (XmlOptions)null);
      }

      public static XmlTime parse(File f, XmlOptions options) throws XmlException, IOException {
         return (XmlTime)XmlBeans.getContextTypeLoader().parse(f, XmlTime.type, options);
      }

      public static XmlTime parse(URL u) throws XmlException, IOException {
         return (XmlTime)XmlBeans.getContextTypeLoader().parse(u, XmlTime.type, (XmlOptions)null);
      }

      public static XmlTime parse(URL u, XmlOptions options) throws XmlException, IOException {
         return (XmlTime)XmlBeans.getContextTypeLoader().parse(u, XmlTime.type, options);
      }

      public static XmlTime parse(InputStream is) throws XmlException, IOException {
         return (XmlTime)XmlBeans.getContextTypeLoader().parse(is, XmlTime.type, (XmlOptions)null);
      }

      public static XmlTime parse(InputStream is, XmlOptions options) throws XmlException, IOException {
         return (XmlTime)XmlBeans.getContextTypeLoader().parse(is, XmlTime.type, options);
      }

      public static XmlTime parse(Reader r) throws XmlException, IOException {
         return (XmlTime)XmlBeans.getContextTypeLoader().parse(r, XmlTime.type, (XmlOptions)null);
      }

      public static XmlTime parse(Reader r, XmlOptions options) throws XmlException, IOException {
         return (XmlTime)XmlBeans.getContextTypeLoader().parse(r, XmlTime.type, options);
      }

      public static XmlTime parse(Node node) throws XmlException {
         return (XmlTime)XmlBeans.getContextTypeLoader().parse(node, XmlTime.type, (XmlOptions)null);
      }

      public static XmlTime parse(Node node, XmlOptions options) throws XmlException {
         return (XmlTime)XmlBeans.getContextTypeLoader().parse(node, XmlTime.type, options);
      }

      public static XmlTime parse(XMLInputStream xis) throws XmlException, XMLStreamException {
         return (XmlTime)XmlBeans.getContextTypeLoader().parse(xis, XmlTime.type, (XmlOptions)null);
      }

      public static XmlTime parse(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return (XmlTime)XmlBeans.getContextTypeLoader().parse(xis, XmlTime.type, options);
      }

      public static XmlTime parse(XMLStreamReader xsr) throws XmlException {
         return (XmlTime)XmlBeans.getContextTypeLoader().parse(xsr, XmlTime.type, (XmlOptions)null);
      }

      public static XmlTime parse(XMLStreamReader xsr, XmlOptions options) throws XmlException {
         return (XmlTime)XmlBeans.getContextTypeLoader().parse(xsr, XmlTime.type, options);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlTime.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream xis, XmlOptions options) throws XmlException, XMLStreamException {
         return XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, XmlTime.type, options);
      }

   }
}

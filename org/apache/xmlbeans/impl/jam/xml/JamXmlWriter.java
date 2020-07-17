package org.apache.xmlbeans.impl.jam.xml;

import java.io.Writer;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import org.apache.xmlbeans.impl.jam.JAnnotatedElement;
import org.apache.xmlbeans.impl.jam.JAnnotation;
import org.apache.xmlbeans.impl.jam.JAnnotationValue;
import org.apache.xmlbeans.impl.jam.JClass;
import org.apache.xmlbeans.impl.jam.JComment;
import org.apache.xmlbeans.impl.jam.JConstructor;
import org.apache.xmlbeans.impl.jam.JField;
import org.apache.xmlbeans.impl.jam.JInvokable;
import org.apache.xmlbeans.impl.jam.JMethod;
import org.apache.xmlbeans.impl.jam.JParameter;
import org.apache.xmlbeans.impl.jam.JSourcePosition;
import org.apache.xmlbeans.impl.jam.xml.JamXmlElements;

class JamXmlWriter implements JamXmlElements {

   private XMLStreamWriter mOut;
   private boolean mInBody = false;
   private boolean mWriteSourceURI = false;


   public JamXmlWriter(Writer out) throws XMLStreamException {
      if(out == null) {
         throw new IllegalArgumentException("null out");
      } else {
         this.mOut = XMLOutputFactory.newInstance().createXMLStreamWriter(out);
      }
   }

   public JamXmlWriter(XMLStreamWriter out) {
      if(out == null) {
         throw new IllegalArgumentException("null out");
      } else {
         this.mOut = out;
      }
   }

   public void begin() throws XMLStreamException {
      if(this.mInBody) {
         throw new XMLStreamException("begin() already called");
      } else {
         this.mOut.writeStartElement("jam-service");
         this.mInBody = true;
      }
   }

   public void end() throws XMLStreamException {
      if(!this.mInBody) {
         throw new XMLStreamException("begin() never called");
      } else {
         this.mOut.writeEndElement();
         this.mInBody = false;
      }
   }

   public void write(JClass clazz) throws XMLStreamException {
      this.assertStarted();
      this.mOut.writeStartElement("class");
      this.writeValueElement("name", clazz.getFieldDescriptor());
      this.writeValueElement("is-interface", clazz.isInterface());
      this.writeModifiers(clazz.getModifiers());
      JClass sc = clazz.getSuperclass();
      if(sc != null) {
         this.writeValueElement("superclass", sc.getFieldDescriptor());
      }

      this.writeClassList("interface", clazz.getInterfaces());
      JField[] m = clazz.getDeclaredFields();

      int i;
      for(i = 0; i < m.length; ++i) {
         this.write(m[i]);
      }

      JConstructor[] var5 = clazz.getConstructors();

      for(i = 0; i < var5.length; ++i) {
         this.write(var5[i]);
      }

      JMethod[] var6 = clazz.getDeclaredMethods();

      for(i = 0; i < var6.length; ++i) {
         this.write(var6[i]);
      }

      this.writeAnnotatedElement(clazz);
      this.mOut.writeEndElement();
   }

   private void write(JMethod method) throws XMLStreamException {
      this.mOut.writeStartElement("method");
      this.writeValueElement("name", method.getSimpleName());
      this.writeValueElement("return-type", method.getReturnType().getFieldDescriptor());
      this.writeInvokable(method);
      this.mOut.writeEndElement();
   }

   private void write(JConstructor ctor) throws XMLStreamException {
      this.mOut.writeStartElement("constructor");
      this.writeInvokable(ctor);
      this.mOut.writeEndElement();
   }

   private void write(JField field) throws XMLStreamException {
      this.mOut.writeStartElement("field");
      this.writeValueElement("name", field.getSimpleName());
      this.writeModifiers(field.getModifiers());
      this.writeValueElement("type", field.getType().getFieldDescriptor());
      this.writeAnnotatedElement(field);
      this.mOut.writeEndElement();
   }

   private void writeInvokable(JInvokable ji) throws XMLStreamException {
      this.writeModifiers(ji.getModifiers());
      JParameter[] params = ji.getParameters();

      for(int i = 0; i < params.length; ++i) {
         this.mOut.writeStartElement("parameter");
         this.writeValueElement("name", params[i].getSimpleName());
         this.writeValueElement("type", params[i].getType().getFieldDescriptor());
         this.writeAnnotatedElement(params[i]);
         this.mOut.writeEndElement();
      }

      this.writeAnnotatedElement(ji);
   }

   private void writeClassList(String elementName, JClass[] clazzes) throws XMLStreamException {
      for(int i = 0; i < clazzes.length; ++i) {
         this.mOut.writeStartElement(elementName);
         this.mOut.writeCharacters(clazzes[i].getFieldDescriptor());
         this.mOut.writeEndElement();
      }

   }

   private void writeModifiers(int mods) throws XMLStreamException {
      this.mOut.writeStartElement("modifiers");
      this.mOut.writeCharacters(String.valueOf(mods));
      this.mOut.writeEndElement();
   }

   private void writeValueElement(String elementName, boolean b) throws XMLStreamException {
      this.mOut.writeStartElement(elementName);
      this.mOut.writeCharacters(String.valueOf(b));
      this.mOut.writeEndElement();
   }

   private void writeValueElement(String elementName, int x) throws XMLStreamException {
      this.mOut.writeStartElement(elementName);
      this.mOut.writeCharacters(String.valueOf(x));
      this.mOut.writeEndElement();
   }

   private void writeValueElement(String elementName, String val) throws XMLStreamException {
      this.mOut.writeStartElement(elementName);
      this.mOut.writeCharacters(val);
      this.mOut.writeEndElement();
   }

   private void writeValueElement(String elementName, String[] vals) throws XMLStreamException {
      for(int i = 0; i < vals.length; ++i) {
         this.writeValueElement(elementName, vals[i]);
      }

   }

   private void writeAnnotatedElement(JAnnotatedElement ae) throws XMLStreamException {
      JAnnotation[] anns = ae.getAnnotations();

      for(int jc = 0; jc < anns.length; ++jc) {
         this.writeAnnotation(anns[jc]);
      }

      JComment var5 = ae.getComment();
      if(var5 != null) {
         String pos = var5.getText();
         if(pos != null) {
            pos = pos.trim();
            if(pos.length() > 0) {
               this.mOut.writeStartElement("comment");
               this.mOut.writeCData(var5.getText());
               this.mOut.writeEndElement();
            }
         }
      }

      JSourcePosition var6 = ae.getSourcePosition();
      if(var6 != null) {
         this.mOut.writeStartElement("source-position");
         if(var6.getLine() != -1) {
            this.writeValueElement("line", var6.getLine());
         }

         if(var6.getColumn() != -1) {
            this.writeValueElement("column", var6.getColumn());
         }

         if(this.mWriteSourceURI && var6.getSourceURI() != null) {
            this.writeValueElement("source-uri", var6.getSourceURI().toString());
         }

         this.mOut.writeEndElement();
      }

   }

   private void writeAnnotation(JAnnotation ann) throws XMLStreamException {
      this.mOut.writeStartElement("annotation");
      this.writeValueElement("name", ann.getQualifiedName());
      JAnnotationValue[] values = ann.getValues();

      for(int i = 0; i < values.length; ++i) {
         this.writeAnnotationValue(values[i]);
      }

      this.mOut.writeEndElement();
   }

   private void writeAnnotationValue(JAnnotationValue val) throws XMLStreamException {
      this.mOut.writeStartElement("annotation-value");
      this.writeValueElement("name", val.getName());
      this.writeValueElement("type", val.getType().getFieldDescriptor());
      if(val.getType().isArrayType()) {
         this.writeValueElement("value", val.asStringArray());
      } else {
         this.writeValueElement("value", val.asString());
      }

      this.mOut.writeEndElement();
   }

   private void assertStarted() throws XMLStreamException {
      if(!this.mInBody) {
         throw new XMLStreamException("begin() not called");
      }
   }
}

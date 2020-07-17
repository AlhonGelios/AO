package org.apache.poi.xwpf.usermodel;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.namespace.QName;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLException;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.xwpf.usermodel.XWPFAbstractNum;
import org.apache.poi.xwpf.usermodel.XWPFNum;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlOptions;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTAbstractNum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNum;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTNumbering;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.NumberingDocument;

public class XWPFNumbering extends POIXMLDocumentPart {

   protected List abstractNums;
   protected List nums;
   boolean isNew;
   private CTNumbering ctNumbering;


   public XWPFNumbering(PackagePart part) throws IOException, OpenXML4JException {
      super(part);
      this.abstractNums = new ArrayList();
      this.nums = new ArrayList();
      this.isNew = true;
   }

   @Deprecated
   public XWPFNumbering(PackagePart part, PackageRelationship rel) throws IOException, OpenXML4JException {
      this(part);
   }

   public XWPFNumbering() {
      this.abstractNums = new ArrayList();
      this.nums = new ArrayList();
      this.abstractNums = new ArrayList();
      this.nums = new ArrayList();
      this.isNew = true;
   }

   protected void onDocumentRead() throws IOException {
      NumberingDocument numberingDoc = null;
      InputStream is = this.getPackagePart().getInputStream();

      try {
         numberingDoc = NumberingDocument.Factory.parse(is, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         this.ctNumbering = numberingDoc.getNumbering();
         CTNum[] e = this.ctNumbering.getNumArray();
         int len$ = e.length;

         int i$;
         for(i$ = 0; i$ < len$; ++i$) {
            CTNum ctAbstractNum = e[i$];
            this.nums.add(new XWPFNum(ctAbstractNum, this));
         }

         CTAbstractNum[] var12 = this.ctNumbering.getAbstractNumArray();
         len$ = var12.length;

         for(i$ = 0; i$ < len$; ++i$) {
            CTAbstractNum var13 = var12[i$];
            this.abstractNums.add(new XWPFAbstractNum(var13, this));
         }

         this.isNew = false;
      } catch (XmlException var10) {
         throw new POIXMLException();
      } finally {
         is.close();
      }
   }

   protected void commit() throws IOException {
      XmlOptions xmlOptions = new XmlOptions(POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      xmlOptions.setSaveSyntheticDocumentElement(new QName(CTNumbering.type.getName().getNamespaceURI(), "numbering"));
      PackagePart part = this.getPackagePart();
      OutputStream out = part.getOutputStream();
      this.ctNumbering.save(out, xmlOptions);
      out.close();
   }

   public void setNumbering(CTNumbering numbering) {
      this.ctNumbering = numbering;
   }

   public boolean numExist(BigInteger numID) {
      Iterator i$ = this.nums.iterator();

      XWPFNum num;
      do {
         if(!i$.hasNext()) {
            return false;
         }

         num = (XWPFNum)i$.next();
      } while(!num.getCTNum().getNumId().equals(numID));

      return true;
   }

   public BigInteger addNum(XWPFNum num) {
      this.ctNumbering.addNewNum();
      int pos = this.ctNumbering.sizeOfNumArray() - 1;
      this.ctNumbering.setNumArray(pos, num.getCTNum());
      this.nums.add(num);
      return num.getCTNum().getNumId();
   }

   public BigInteger addNum(BigInteger abstractNumID) {
      CTNum ctNum = this.ctNumbering.addNewNum();
      ctNum.addNewAbstractNumId();
      ctNum.getAbstractNumId().setVal(abstractNumID);
      ctNum.setNumId(BigInteger.valueOf((long)(this.nums.size() + 1)));
      XWPFNum num = new XWPFNum(ctNum, this);
      this.nums.add(num);
      return ctNum.getNumId();
   }

   public void addNum(BigInteger abstractNumID, BigInteger numID) {
      CTNum ctNum = this.ctNumbering.addNewNum();
      ctNum.addNewAbstractNumId();
      ctNum.getAbstractNumId().setVal(abstractNumID);
      ctNum.setNumId(numID);
      XWPFNum num = new XWPFNum(ctNum, this);
      this.nums.add(num);
   }

   public XWPFNum getNum(BigInteger numID) {
      Iterator i$ = this.nums.iterator();

      XWPFNum num;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         num = (XWPFNum)i$.next();
      } while(!num.getCTNum().getNumId().equals(numID));

      return num;
   }

   public XWPFAbstractNum getAbstractNum(BigInteger abstractNumID) {
      Iterator i$ = this.abstractNums.iterator();

      XWPFAbstractNum abstractNum;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         abstractNum = (XWPFAbstractNum)i$.next();
      } while(!abstractNum.getAbstractNum().getAbstractNumId().equals(abstractNumID));

      return abstractNum;
   }

   public BigInteger getIdOfAbstractNum(XWPFAbstractNum abstractNum) {
      CTAbstractNum copy = (CTAbstractNum)abstractNum.getCTAbstractNum().copy();
      XWPFAbstractNum newAbstractNum = new XWPFAbstractNum(copy, this);

      for(int i = 0; i < this.abstractNums.size(); ++i) {
         newAbstractNum.getCTAbstractNum().setAbstractNumId(BigInteger.valueOf((long)i));
         newAbstractNum.setNumbering(this);
         if(newAbstractNum.getCTAbstractNum().valueEquals(((XWPFAbstractNum)this.abstractNums.get(i)).getCTAbstractNum())) {
            return newAbstractNum.getCTAbstractNum().getAbstractNumId();
         }
      }

      return null;
   }

   public BigInteger addAbstractNum(XWPFAbstractNum abstractNum) {
      int pos = this.abstractNums.size();
      if(abstractNum.getAbstractNum() != null) {
         this.ctNumbering.addNewAbstractNum().set(abstractNum.getAbstractNum());
      } else {
         this.ctNumbering.addNewAbstractNum();
         abstractNum.getAbstractNum().setAbstractNumId(BigInteger.valueOf((long)pos));
         this.ctNumbering.setAbstractNumArray(pos, abstractNum.getAbstractNum());
      }

      this.abstractNums.add(abstractNum);
      return abstractNum.getCTAbstractNum().getAbstractNumId();
   }

   public boolean removeAbstractNum(BigInteger abstractNumID) {
      if(abstractNumID.byteValue() < this.abstractNums.size()) {
         this.ctNumbering.removeAbstractNum(abstractNumID.byteValue());
         this.abstractNums.remove(abstractNumID.byteValue());
         return true;
      } else {
         return false;
      }
   }

   public BigInteger getAbstractNumID(BigInteger numID) {
      XWPFNum num = this.getNum(numID);
      return num == null?null:(num.getCTNum() == null?null:(num.getCTNum().getAbstractNumId() == null?null:num.getCTNum().getAbstractNumId().getVal()));
   }
}

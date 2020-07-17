package org.openxmlformats.schemas.wordprocessingml.x2006.main;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.util.List;
import javax.xml.stream.XMLStreamReader;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.xmlbeans.SchemaType;
import org.apache.xmlbeans.XmlBeans;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.xml.stream.XMLInputStream;
import org.apache.xmlbeans.xml.stream.XMLStreamException;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDataBinding;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTDecimalNumber;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTEmpty;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTLock;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTOnOff;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTPlaceholder;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRPr;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtComboBox;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDate;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDocPart;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtDropDownList;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTSdtText;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTString;
import org.w3c.dom.Node;

public interface CTSdtPr extends XmlObject {

   SchemaType type = (SchemaType)XmlBeans.typeSystemForClassLoader(CTSdtPr.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sF1327CCA741569E70F9CA8C9AF9B44B2").resolveHandle("ctsdtpre24dtype");


   List getRPrList();

   CTRPr[] getRPrArray();

   CTRPr getRPrArray(int var1);

   int sizeOfRPrArray();

   void setRPrArray(CTRPr[] var1);

   void setRPrArray(int var1, CTRPr var2);

   CTRPr insertNewRPr(int var1);

   CTRPr addNewRPr();

   void removeRPr(int var1);

   List getAliasList();

   CTString[] getAliasArray();

   CTString getAliasArray(int var1);

   int sizeOfAliasArray();

   void setAliasArray(CTString[] var1);

   void setAliasArray(int var1, CTString var2);

   CTString insertNewAlias(int var1);

   CTString addNewAlias();

   void removeAlias(int var1);

   List getLockList();

   CTLock[] getLockArray();

   CTLock getLockArray(int var1);

   int sizeOfLockArray();

   void setLockArray(CTLock[] var1);

   void setLockArray(int var1, CTLock var2);

   CTLock insertNewLock(int var1);

   CTLock addNewLock();

   void removeLock(int var1);

   List getPlaceholderList();

   CTPlaceholder[] getPlaceholderArray();

   CTPlaceholder getPlaceholderArray(int var1);

   int sizeOfPlaceholderArray();

   void setPlaceholderArray(CTPlaceholder[] var1);

   void setPlaceholderArray(int var1, CTPlaceholder var2);

   CTPlaceholder insertNewPlaceholder(int var1);

   CTPlaceholder addNewPlaceholder();

   void removePlaceholder(int var1);

   List getShowingPlcHdrList();

   CTOnOff[] getShowingPlcHdrArray();

   CTOnOff getShowingPlcHdrArray(int var1);

   int sizeOfShowingPlcHdrArray();

   void setShowingPlcHdrArray(CTOnOff[] var1);

   void setShowingPlcHdrArray(int var1, CTOnOff var2);

   CTOnOff insertNewShowingPlcHdr(int var1);

   CTOnOff addNewShowingPlcHdr();

   void removeShowingPlcHdr(int var1);

   List getDataBindingList();

   CTDataBinding[] getDataBindingArray();

   CTDataBinding getDataBindingArray(int var1);

   int sizeOfDataBindingArray();

   void setDataBindingArray(CTDataBinding[] var1);

   void setDataBindingArray(int var1, CTDataBinding var2);

   CTDataBinding insertNewDataBinding(int var1);

   CTDataBinding addNewDataBinding();

   void removeDataBinding(int var1);

   List getTemporaryList();

   CTOnOff[] getTemporaryArray();

   CTOnOff getTemporaryArray(int var1);

   int sizeOfTemporaryArray();

   void setTemporaryArray(CTOnOff[] var1);

   void setTemporaryArray(int var1, CTOnOff var2);

   CTOnOff insertNewTemporary(int var1);

   CTOnOff addNewTemporary();

   void removeTemporary(int var1);

   List getIdList();

   CTDecimalNumber[] getIdArray();

   CTDecimalNumber getIdArray(int var1);

   int sizeOfIdArray();

   void setIdArray(CTDecimalNumber[] var1);

   void setIdArray(int var1, CTDecimalNumber var2);

   CTDecimalNumber insertNewId(int var1);

   CTDecimalNumber addNewId();

   void removeId(int var1);

   List getTagList();

   CTString[] getTagArray();

   CTString getTagArray(int var1);

   int sizeOfTagArray();

   void setTagArray(CTString[] var1);

   void setTagArray(int var1, CTString var2);

   CTString insertNewTag(int var1);

   CTString addNewTag();

   void removeTag(int var1);

   List getEquationList();

   CTEmpty[] getEquationArray();

   CTEmpty getEquationArray(int var1);

   int sizeOfEquationArray();

   void setEquationArray(CTEmpty[] var1);

   void setEquationArray(int var1, CTEmpty var2);

   CTEmpty insertNewEquation(int var1);

   CTEmpty addNewEquation();

   void removeEquation(int var1);

   List getComboBoxList();

   CTSdtComboBox[] getComboBoxArray();

   CTSdtComboBox getComboBoxArray(int var1);

   int sizeOfComboBoxArray();

   void setComboBoxArray(CTSdtComboBox[] var1);

   void setComboBoxArray(int var1, CTSdtComboBox var2);

   CTSdtComboBox insertNewComboBox(int var1);

   CTSdtComboBox addNewComboBox();

   void removeComboBox(int var1);

   List getDateList();

   CTSdtDate[] getDateArray();

   CTSdtDate getDateArray(int var1);

   int sizeOfDateArray();

   void setDateArray(CTSdtDate[] var1);

   void setDateArray(int var1, CTSdtDate var2);

   CTSdtDate insertNewDate(int var1);

   CTSdtDate addNewDate();

   void removeDate(int var1);

   List getDocPartObjList();

   CTSdtDocPart[] getDocPartObjArray();

   CTSdtDocPart getDocPartObjArray(int var1);

   int sizeOfDocPartObjArray();

   void setDocPartObjArray(CTSdtDocPart[] var1);

   void setDocPartObjArray(int var1, CTSdtDocPart var2);

   CTSdtDocPart insertNewDocPartObj(int var1);

   CTSdtDocPart addNewDocPartObj();

   void removeDocPartObj(int var1);

   List getDocPartListList();

   CTSdtDocPart[] getDocPartListArray();

   CTSdtDocPart getDocPartListArray(int var1);

   int sizeOfDocPartListArray();

   void setDocPartListArray(CTSdtDocPart[] var1);

   void setDocPartListArray(int var1, CTSdtDocPart var2);

   CTSdtDocPart insertNewDocPartList(int var1);

   CTSdtDocPart addNewDocPartList();

   void removeDocPartList(int var1);

   List getDropDownListList();

   CTSdtDropDownList[] getDropDownListArray();

   CTSdtDropDownList getDropDownListArray(int var1);

   int sizeOfDropDownListArray();

   void setDropDownListArray(CTSdtDropDownList[] var1);

   void setDropDownListArray(int var1, CTSdtDropDownList var2);

   CTSdtDropDownList insertNewDropDownList(int var1);

   CTSdtDropDownList addNewDropDownList();

   void removeDropDownList(int var1);

   List getPictureList();

   CTEmpty[] getPictureArray();

   CTEmpty getPictureArray(int var1);

   int sizeOfPictureArray();

   void setPictureArray(CTEmpty[] var1);

   void setPictureArray(int var1, CTEmpty var2);

   CTEmpty insertNewPicture(int var1);

   CTEmpty addNewPicture();

   void removePicture(int var1);

   List getRichTextList();

   CTEmpty[] getRichTextArray();

   CTEmpty getRichTextArray(int var1);

   int sizeOfRichTextArray();

   void setRichTextArray(CTEmpty[] var1);

   void setRichTextArray(int var1, CTEmpty var2);

   CTEmpty insertNewRichText(int var1);

   CTEmpty addNewRichText();

   void removeRichText(int var1);

   List getTextList();

   CTSdtText[] getTextArray();

   CTSdtText getTextArray(int var1);

   int sizeOfTextArray();

   void setTextArray(CTSdtText[] var1);

   void setTextArray(int var1, CTSdtText var2);

   CTSdtText insertNewText(int var1);

   CTSdtText addNewText();

   void removeText(int var1);

   List getCitationList();

   CTEmpty[] getCitationArray();

   CTEmpty getCitationArray(int var1);

   int sizeOfCitationArray();

   void setCitationArray(CTEmpty[] var1);

   void setCitationArray(int var1, CTEmpty var2);

   CTEmpty insertNewCitation(int var1);

   CTEmpty addNewCitation();

   void removeCitation(int var1);

   List getGroupList();

   CTEmpty[] getGroupArray();

   CTEmpty getGroupArray(int var1);

   int sizeOfGroupArray();

   void setGroupArray(CTEmpty[] var1);

   void setGroupArray(int var1, CTEmpty var2);

   CTEmpty insertNewGroup(int var1);

   CTEmpty addNewGroup();

   void removeGroup(int var1);

   List getBibliographyList();

   CTEmpty[] getBibliographyArray();

   CTEmpty getBibliographyArray(int var1);

   int sizeOfBibliographyArray();

   void setBibliographyArray(CTEmpty[] var1);

   void setBibliographyArray(int var1, CTEmpty var2);

   CTEmpty insertNewBibliography(int var1);

   CTEmpty addNewBibliography();

   void removeBibliography(int var1);


   public static final class Factory {

      public static CTSdtPr newInstance() {
         return (CTSdtPr)POIXMLTypeLoader.newInstance(CTSdtPr.type, (XmlOptions)null);
      }

      public static CTSdtPr newInstance(XmlOptions var0) {
         return (CTSdtPr)POIXMLTypeLoader.newInstance(CTSdtPr.type, var0);
      }

      public static CTSdtPr parse(String var0) throws XmlException {
         return (CTSdtPr)POIXMLTypeLoader.parse(var0, CTSdtPr.type, (XmlOptions)null);
      }

      public static CTSdtPr parse(String var0, XmlOptions var1) throws XmlException {
         return (CTSdtPr)POIXMLTypeLoader.parse(var0, CTSdtPr.type, var1);
      }

      public static CTSdtPr parse(File var0) throws XmlException, IOException {
         return (CTSdtPr)POIXMLTypeLoader.parse(var0, CTSdtPr.type, (XmlOptions)null);
      }

      public static CTSdtPr parse(File var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSdtPr)POIXMLTypeLoader.parse(var0, CTSdtPr.type, var1);
      }

      public static CTSdtPr parse(URL var0) throws XmlException, IOException {
         return (CTSdtPr)POIXMLTypeLoader.parse(var0, CTSdtPr.type, (XmlOptions)null);
      }

      public static CTSdtPr parse(URL var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSdtPr)POIXMLTypeLoader.parse(var0, CTSdtPr.type, var1);
      }

      public static CTSdtPr parse(InputStream var0) throws XmlException, IOException {
         return (CTSdtPr)POIXMLTypeLoader.parse(var0, CTSdtPr.type, (XmlOptions)null);
      }

      public static CTSdtPr parse(InputStream var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSdtPr)POIXMLTypeLoader.parse(var0, CTSdtPr.type, var1);
      }

      public static CTSdtPr parse(Reader var0) throws XmlException, IOException {
         return (CTSdtPr)POIXMLTypeLoader.parse(var0, CTSdtPr.type, (XmlOptions)null);
      }

      public static CTSdtPr parse(Reader var0, XmlOptions var1) throws XmlException, IOException {
         return (CTSdtPr)POIXMLTypeLoader.parse(var0, CTSdtPr.type, var1);
      }

      public static CTSdtPr parse(XMLStreamReader var0) throws XmlException {
         return (CTSdtPr)POIXMLTypeLoader.parse(var0, CTSdtPr.type, (XmlOptions)null);
      }

      public static CTSdtPr parse(XMLStreamReader var0, XmlOptions var1) throws XmlException {
         return (CTSdtPr)POIXMLTypeLoader.parse(var0, CTSdtPr.type, var1);
      }

      public static CTSdtPr parse(Node var0) throws XmlException {
         return (CTSdtPr)POIXMLTypeLoader.parse(var0, CTSdtPr.type, (XmlOptions)null);
      }

      public static CTSdtPr parse(Node var0, XmlOptions var1) throws XmlException {
         return (CTSdtPr)POIXMLTypeLoader.parse(var0, CTSdtPr.type, var1);
      }

      public static CTSdtPr parse(XMLInputStream var0) throws XmlException, XMLStreamException {
         return (CTSdtPr)POIXMLTypeLoader.parse(var0, CTSdtPr.type, (XmlOptions)null);
      }

      public static CTSdtPr parse(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return (CTSdtPr)POIXMLTypeLoader.parse(var0, CTSdtPr.type, var1);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSdtPr.type, (XmlOptions)null);
      }

      public static XMLInputStream newValidatingXMLInputStream(XMLInputStream var0, XmlOptions var1) throws XmlException, XMLStreamException {
         return POIXMLTypeLoader.newValidatingXMLInputStream(var0, CTSdtPr.type, var1);
      }

   }
}

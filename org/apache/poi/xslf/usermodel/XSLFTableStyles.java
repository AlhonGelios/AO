package org.apache.poi.xslf.usermodel;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.xslf.usermodel.XSLFTableStyle;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyle;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTableStyleList;
import org.openxmlformats.schemas.drawingml.x2006.main.TblStyleLstDocument;

public class XSLFTableStyles extends POIXMLDocumentPart implements Iterable {

   private CTTableStyleList _tblStyleLst;
   private List _styles;


   public XSLFTableStyles() {}

   public XSLFTableStyles(PackagePart part) throws IOException, XmlException {
      super(part);
      InputStream is = this.getPackagePart().getInputStream();
      TblStyleLstDocument styleDoc = TblStyleLstDocument.Factory.parse(is);
      is.close();
      this._tblStyleLst = styleDoc.getTblStyleLst();
      CTTableStyle[] tblStyleArray = this._tblStyleLst.getTblStyleArray();
      this._styles = new ArrayList(tblStyleArray.length);
      CTTableStyle[] arr$ = tblStyleArray;
      int len$ = tblStyleArray.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTTableStyle c = arr$[i$];
         this._styles.add(new XSLFTableStyle(c));
      }

   }

   @Deprecated
   public XSLFTableStyles(PackagePart part, PackageRelationship rel) throws IOException, XmlException {
      this(part);
   }

   public CTTableStyleList getXmlObject() {
      return this._tblStyleLst;
   }

   public Iterator iterator() {
      return this._styles.iterator();
   }

   public List getStyles() {
      return Collections.unmodifiableList(this._styles);
   }
}

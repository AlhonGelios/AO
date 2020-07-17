package org.apache.poi.xssf.usermodel;

import com.microsoft.schemas.office.excel.CTClientData;
import com.microsoft.schemas.office.excel.STObjectType;
import com.microsoft.schemas.office.office.CTIdMap;
import com.microsoft.schemas.office.office.CTShapeLayout;
import com.microsoft.schemas.office.office.STConnectType;
import com.microsoft.schemas.office.office.STInsetMode;
import com.microsoft.schemas.vml.CTPath;
import com.microsoft.schemas.vml.CTShadow;
import com.microsoft.schemas.vml.CTShape;
import com.microsoft.schemas.vml.CTShapetype;
import com.microsoft.schemas.vml.STExt;
import com.microsoft.schemas.vml.STStrokeJoinStyle;
import com.microsoft.schemas.vml.STTrueFalse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.namespace.QName;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.util.DocumentHelper;
import org.apache.poi.xssf.util.EvilUnclosedBRFixingInputStream;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public final class XSSFVMLDrawing extends POIXMLDocumentPart {

   private static final QName QNAME_SHAPE_LAYOUT = new QName("urn:schemas-microsoft-com:office:office", "shapelayout");
   private static final QName QNAME_SHAPE_TYPE = new QName("urn:schemas-microsoft-com:vml", "shapetype");
   private static final QName QNAME_SHAPE = new QName("urn:schemas-microsoft-com:vml", "shape");
   private static final String COMMENT_SHAPE_TYPE_ID = "_x0000_t202";
   private static final Pattern ptrn_shapeId = Pattern.compile("_x0000_s(\\d+)");
   private List _qnames;
   private List _items;
   private String _shapeTypeId;
   private int _shapeId;


   protected XSSFVMLDrawing() {
      this._qnames = new ArrayList();
      this._items = new ArrayList();
      this._shapeId = 1024;
      this.newDrawing();
   }

   protected XSSFVMLDrawing(PackagePart part) throws IOException, XmlException {
      super(part);
      this._qnames = new ArrayList();
      this._items = new ArrayList();
      this._shapeId = 1024;
      this.read(this.getPackagePart().getInputStream());
   }

   @Deprecated
   protected XSSFVMLDrawing(PackagePart part, PackageRelationship rel) throws IOException, XmlException {
      this(part);
   }

   protected void read(InputStream is) throws IOException, XmlException {
      Document doc;
      try {
         doc = DocumentHelper.readDocument((InputStream)(new EvilUnclosedBRFixingInputStream(is)));
      } catch (SAXException var14) {
         throw new XmlException(var14.getMessage(), var14);
      }

      XmlObject root = XmlObject.Factory.parse((Node)doc, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
      this._qnames = new ArrayList();
      this._items = new ArrayList();
      XmlObject[] arr$ = root.selectPath("$this/xml/*");
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         XmlObject obj = arr$[i$];
         Node nd = obj.getDomNode();
         QName qname = new QName(nd.getNamespaceURI(), nd.getLocalName());
         if(qname.equals(QNAME_SHAPE_LAYOUT)) {
            this._items.add(CTShapeLayout.Factory.parse(obj.xmlText(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS));
         } else if(qname.equals(QNAME_SHAPE_TYPE)) {
            CTShapetype doc2 = CTShapetype.Factory.parse(obj.xmlText(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
            this._items.add(doc2);
            this._shapeTypeId = doc2.getId();
         } else if(qname.equals(QNAME_SHAPE)) {
            CTShape var15 = CTShape.Factory.parse(obj.xmlText(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
            String e = var15.getId();
            if(e != null) {
               Matcher m = ptrn_shapeId.matcher(e);
               if(m.find()) {
                  this._shapeId = Math.max(this._shapeId, Integer.parseInt(m.group(1)));
               }
            }

            this._items.add(var15);
         } else {
            Document var16;
            try {
               InputSource var17 = new InputSource(new StringReader(obj.xmlText()));
               var16 = DocumentHelper.readDocument(var17);
            } catch (SAXException var13) {
               throw new XmlException(var13.getMessage(), var13);
            }

            this._items.add(XmlObject.Factory.parse((Node)var16, POIXMLTypeLoader.DEFAULT_XML_OPTIONS));
         }

         this._qnames.add(qname);
      }

   }

   protected List getItems() {
      return this._items;
   }

   protected void write(OutputStream out) throws IOException {
      XmlObject rootObject = XmlObject.Factory.newInstance();
      XmlCursor rootCursor = rootObject.newCursor();
      rootCursor.toNextToken();
      rootCursor.beginElement("xml");

      for(int i = 0; i < this._items.size(); ++i) {
         XmlCursor xc = ((XmlObject)this._items.get(i)).newCursor();
         rootCursor.beginElement((QName)this._qnames.get(i));

         while(xc.toNextToken() == XmlCursor.TokenType.ATTR) {
            Node anode = xc.getDomNode();
            rootCursor.insertAttributeWithValue(anode.getLocalName(), anode.getNamespaceURI(), anode.getNodeValue());
         }

         xc.toStartDoc();
         xc.copyXmlContents(rootCursor);
         rootCursor.toNextToken();
         xc.dispose();
      }

      rootCursor.dispose();
      rootObject.save(out, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
   }

   protected void commit() throws IOException {
      PackagePart part = this.getPackagePart();
      OutputStream out = part.getOutputStream();
      this.write(out);
      out.close();
   }

   private void newDrawing() {
      CTShapeLayout layout = CTShapeLayout.Factory.newInstance();
      layout.setExt(STExt.EDIT);
      CTIdMap idmap = layout.addNewIdmap();
      idmap.setExt(STExt.EDIT);
      idmap.setData("1");
      this._items.add(layout);
      this._qnames.add(QNAME_SHAPE_LAYOUT);
      CTShapetype shapetype = CTShapetype.Factory.newInstance();
      this._shapeTypeId = "_x0000_t202";
      shapetype.setId(this._shapeTypeId);
      shapetype.setCoordsize("21600,21600");
      shapetype.setSpt(202.0F);
      shapetype.setPath2("m,l,21600r21600,l21600,xe");
      shapetype.addNewStroke().setJoinstyle(STStrokeJoinStyle.MITER);
      CTPath path = shapetype.addNewPath();
      path.setGradientshapeok(STTrueFalse.T);
      path.setConnecttype(STConnectType.RECT);
      this._items.add(shapetype);
      this._qnames.add(QNAME_SHAPE_TYPE);
   }

   protected CTShape newCommentShape() {
      CTShape shape = CTShape.Factory.newInstance();
      shape.setId("_x0000_s" + ++this._shapeId);
      shape.setType("#" + this._shapeTypeId);
      shape.setStyle("position:absolute; visibility:hidden");
      shape.setFillcolor("#ffffe1");
      shape.setInsetmode(STInsetMode.AUTO);
      shape.addNewFill().setColor("#ffffe1");
      CTShadow shadow = shape.addNewShadow();
      shadow.setOn(STTrueFalse.T);
      shadow.setColor("black");
      shadow.setObscured(STTrueFalse.T);
      shape.addNewPath().setConnecttype(STConnectType.NONE);
      shape.addNewTextbox().setStyle("mso-direction-alt:auto");
      CTClientData cldata = shape.addNewClientData();
      cldata.setObjectType(STObjectType.NOTE);
      cldata.addNewMoveWithCells();
      cldata.addNewSizeWithCells();
      cldata.addNewAnchor().setStringValue("1, 15, 0, 2, 3, 15, 3, 16");
      cldata.addNewAutoFill().setStringValue("False");
      cldata.addNewRow().setBigIntegerValue(new BigInteger("0"));
      cldata.addNewColumn().setBigIntegerValue(new BigInteger("0"));
      this._items.add(shape);
      this._qnames.add(QNAME_SHAPE);
      return shape;
   }

   protected CTShape findCommentShape(int row, int col) {
      Iterator i$ = this._items.iterator();

      while(i$.hasNext()) {
         XmlObject itm = (XmlObject)i$.next();
         if(itm instanceof CTShape) {
            CTShape sh = (CTShape)itm;
            if(sh.sizeOfClientDataArray() > 0) {
               CTClientData cldata = sh.getClientDataArray(0);
               if(cldata.getObjectType() == STObjectType.NOTE) {
                  int crow = cldata.getRowArray(0).intValue();
                  int ccol = cldata.getColumnArray(0).intValue();
                  if(crow == row && ccol == col) {
                     return sh;
                  }
               }
            }
         }
      }

      return null;
   }

   protected boolean removeCommentShape(int row, int col) {
      CTShape shape = this.findCommentShape(row, col);
      return shape != null && this._items.remove(shape);
   }

}

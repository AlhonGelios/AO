package org.apache.poi.xslf.usermodel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.POIXMLException;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.xslf.usermodel.DrawingTable;
import org.apache.poi.xslf.usermodel.DrawingTableCell;
import org.apache.poi.xslf.usermodel.DrawingTableRow;
import org.apache.poi.xslf.usermodel.DrawingTextBody;
import org.apache.poi.xslf.usermodel.DrawingTextPlaceholder;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.impl.values.XmlAnyTypeImpl;
import org.openxmlformats.schemas.drawingml.x2006.main.CTGraphicalObjectData;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTable;
import org.openxmlformats.schemas.drawingml.x2006.main.CTTextBody;
import org.openxmlformats.schemas.presentationml.x2006.main.CTApplicationNonVisualDrawingProps;
import org.openxmlformats.schemas.presentationml.x2006.main.CTCommonSlideData;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGraphicalObjectFrame;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape;
import org.openxmlformats.schemas.presentationml.x2006.main.CTShape;

public class XSLFCommonSlideData {

   private final CTCommonSlideData data;


   public XSLFCommonSlideData(CTCommonSlideData data) {
      this.data = data;
   }

   public List getDrawingText() {
      CTGroupShape gs = this.data.getSpTree();
      ArrayList out = new ArrayList();
      this.processShape(gs, out);
      CTGroupShape[] arr$ = gs.getGrpSpArray();
      int len$ = arr$.length;

      int i$;
      for(i$ = 0; i$ < len$; ++i$) {
         CTGroupShape frame = arr$[i$];
         this.processShape(frame, out);
      }

      CTGraphicalObjectFrame[] var21 = gs.getGraphicFrameArray();
      len$ = var21.length;

      for(i$ = 0; i$ < len$; ++i$) {
         CTGraphicalObjectFrame var22 = var21[i$];
         CTGraphicalObjectData data = var22.getGraphic().getGraphicData();
         XmlCursor c = data.newCursor();
         c.selectPath("declare namespace pic=\'" + CTTable.type.getName().getNamespaceURI() + "\' .//pic:tbl");

         while(c.toNextSelection()) {
            Object o = c.getObject();
            if(o instanceof XmlAnyTypeImpl) {
               try {
                  o = CTTable.Factory.parse(((XmlObject)o).toString(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
               } catch (XmlException var20) {
                  throw new POIXMLException(var20);
               }
            }

            if(o instanceof CTTable) {
               DrawingTable table = new DrawingTable((CTTable)o);
               DrawingTableRow[] arr$1 = table.getRows();
               int len$1 = arr$1.length;

               for(int i$1 = 0; i$1 < len$1; ++i$1) {
                  DrawingTableRow row = arr$1[i$1];
                  DrawingTableCell[] arr$2 = row.getCells();
                  int len$2 = arr$2.length;

                  for(int i$2 = 0; i$2 < len$2; ++i$2) {
                     DrawingTableCell cell = arr$2[i$2];
                     DrawingTextBody textBody = cell.getTextBody();
                     out.add(textBody);
                  }
               }
            }
         }

         c.dispose();
      }

      return out;
   }

   public List getText() {
      ArrayList paragraphs = new ArrayList();
      Iterator i$ = this.getDrawingText().iterator();

      while(i$.hasNext()) {
         DrawingTextBody textBody = (DrawingTextBody)i$.next();
         paragraphs.addAll(Arrays.asList(textBody.getParagraphs()));
      }

      return paragraphs;
   }

   private void processShape(CTGroupShape gs, List out) {
      CTShape[] arr$ = gs.getSpArray();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CTShape shape = arr$[i$];
         CTTextBody ctTextBody = shape.getTxBody();
         if(ctTextBody != null) {
            CTApplicationNonVisualDrawingProps nvpr = shape.getNvSpPr().getNvPr();
            Object textBody;
            if(nvpr.isSetPh()) {
               textBody = new DrawingTextPlaceholder(ctTextBody, nvpr.getPh());
            } else {
               textBody = new DrawingTextBody(ctTextBody);
            }

            out.add(textBody);
         }
      }

   }
}

package org.apache.poi.xdgf.usermodel;

import com.microsoft.schemas.office.visio.x2012.main.ConnectType;
import com.microsoft.schemas.office.visio.x2012.main.PageContentsType;
import com.microsoft.schemas.office.visio.x2012.main.ShapeSheetType;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLException;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.util.Internal;
import org.apache.poi.xdgf.exceptions.XDGFException;
import org.apache.poi.xdgf.usermodel.XDGFConnection;
import org.apache.poi.xdgf.usermodel.XDGFDocument;
import org.apache.poi.xdgf.usermodel.XDGFShape;
import org.apache.poi.xdgf.usermodel.shape.ShapeRenderer;
import org.apache.poi.xdgf.usermodel.shape.ShapeVisitor;
import org.apache.poi.xdgf.usermodel.shape.exceptions.StopVisiting;
import org.apache.poi.xdgf.xml.XDGFXMLDocumentPart;

public class XDGFBaseContents extends XDGFXMLDocumentPart {

   protected PageContentsType _pageContents;
   protected List _toplevelShapes;
   protected Map _shapes;
   protected List _connections;


   public XDGFBaseContents(PackagePart part, XDGFDocument document) {
      super(part, document);
      this._toplevelShapes = new ArrayList();
      this._shapes = new HashMap();
      this._connections = new ArrayList();
   }

   @Deprecated
   public XDGFBaseContents(PackagePart part, PackageRelationship rel, XDGFDocument document) {
      this(part, document);
   }

   @Internal
   public PageContentsType getXmlObject() {
      return this._pageContents;
   }

   protected void onDocumentRead() {
      int len$;
      int i$;
      XDGFShape from;
      if(this._pageContents.isSetShapes()) {
         ShapeSheetType[] arr$ = this._pageContents.getShapes().getShapeArray();
         len$ = arr$.length;

         for(i$ = 0; i$ < len$; ++i$) {
            ShapeSheetType connect = arr$[i$];
            from = new XDGFShape(connect, this, this._document);
            this._toplevelShapes.add(from);
            this.addToShapeIndex(from);
         }
      }

      if(this._pageContents.isSetConnects()) {
         ConnectType[] var7 = this._pageContents.getConnects().getConnectArray();
         len$ = var7.length;

         for(i$ = 0; i$ < len$; ++i$) {
            ConnectType var8 = var7[i$];
            from = (XDGFShape)this._shapes.get(Long.valueOf(var8.getFromSheet()));
            XDGFShape to = (XDGFShape)this._shapes.get(Long.valueOf(var8.getToSheet()));
            if(from == null) {
               throw new POIXMLException(this.toString() + "; Connect; Invalid from id: " + var8.getFromSheet());
            }

            if(to == null) {
               throw new POIXMLException(this.toString() + "; Connect; Invalid to id: " + var8.getToSheet());
            }

            this._connections.add(new XDGFConnection(var8, from, to));
         }
      }

   }

   protected void addToShapeIndex(XDGFShape shape) {
      this._shapes.put(Long.valueOf(shape.getID()), shape);
      List shapes = shape.getShapes();
      if(shapes != null) {
         Iterator i$ = shapes.iterator();

         while(i$.hasNext()) {
            XDGFShape subshape = (XDGFShape)i$.next();
            this.addToShapeIndex(subshape);
         }

      }
   }

   public void draw(Graphics2D graphics) {
      this.visitShapes(new ShapeRenderer(graphics));
   }

   public XDGFShape getShapeById(long id) {
      return (XDGFShape)this._shapes.get(Long.valueOf(id));
   }

   public Map getShapesMap() {
      return Collections.unmodifiableMap(this._shapes);
   }

   public Collection getShapes() {
      return this._shapes.values();
   }

   public List getTopLevelShapes() {
      return Collections.unmodifiableList(this._toplevelShapes);
   }

   public List getConnections() {
      return Collections.unmodifiableList(this._connections);
   }

   public String toString() {
      return this.getPackagePart().getPartName().toString();
   }

   public void visitShapes(ShapeVisitor visitor) {
      try {
         Iterator e = this._toplevelShapes.iterator();

         while(e.hasNext()) {
            XDGFShape shape = (XDGFShape)e.next();
            shape.visitShapes(visitor, new AffineTransform(), 0);
         }
      } catch (StopVisiting var4) {
         ;
      } catch (POIXMLException var5) {
         throw XDGFException.wrap((POIXMLDocumentPart)this, var5);
      }

   }
}

package org.apache.poi.xdgf.usermodel;

import com.microsoft.schemas.office.visio.x2012.main.PageType;
import java.awt.geom.Rectangle2D;
import org.apache.poi.POIXMLException;
import org.apache.poi.util.Internal;
import org.apache.poi.xdgf.geom.Dimension2dDouble;
import org.apache.poi.xdgf.usermodel.XDGFCell;
import org.apache.poi.xdgf.usermodel.XDGFDocument;
import org.apache.poi.xdgf.usermodel.XDGFPageContents;
import org.apache.poi.xdgf.usermodel.XDGFPageSheet;
import org.apache.poi.xdgf.usermodel.XDGFPages;
import org.apache.poi.xdgf.usermodel.XDGFSheet;

public class XDGFPage {

   private PageType _page;
   protected XDGFPageContents _content;
   protected XDGFPages _pages;
   protected XDGFSheet _pageSheet = null;


   public XDGFPage(PageType page, XDGFPageContents content, XDGFDocument document, XDGFPages pages) {
      this._page = page;
      this._content = content;
      this._pages = pages;
      content.setPage(this);
      if(page.isSetPageSheet()) {
         this._pageSheet = new XDGFPageSheet(page.getPageSheet(), document);
      }

   }

   @Internal
   protected PageType getXmlObject() {
      return this._page;
   }

   public long getID() {
      return this._page.getID();
   }

   public String getName() {
      return this._page.getName();
   }

   public XDGFPageContents getContent() {
      return this._content;
   }

   public XDGFSheet getPageSheet() {
      return this._pageSheet;
   }

   public long getPageNumber() {
      return (long)(this._pages.getPageList().indexOf(this) + 1);
   }

   public Dimension2dDouble getPageSize() {
      XDGFCell w = this._pageSheet.getCell("PageWidth");
      XDGFCell h = this._pageSheet.getCell("PageHeight");
      if(w != null && h != null) {
         return new Dimension2dDouble(Double.parseDouble(w.getValue()), Double.parseDouble(h.getValue()));
      } else {
         throw new POIXMLException("Cannot determine page size");
      }
   }

   public java.awt.geom.Point2D.Double getPageOffset() {
      XDGFCell xoffcell = this._pageSheet.getCell("XRulerOrigin");
      XDGFCell yoffcell = this._pageSheet.getCell("YRulerOrigin");
      double xoffset = 0.0D;
      double yoffset = 0.0D;
      if(xoffcell != null) {
         xoffset = Double.parseDouble(xoffcell.getValue());
      }

      if(xoffcell != null) {
         yoffset = Double.parseDouble(yoffcell.getValue());
      }

      return new java.awt.geom.Point2D.Double(xoffset, yoffset);
   }

   public Rectangle2D getBoundingBox() {
      Dimension2dDouble sz = this.getPageSize();
      java.awt.geom.Point2D.Double offset = this.getPageOffset();
      return new java.awt.geom.Rectangle2D.Double(-offset.getX(), -offset.getY(), sz.getWidth(), sz.getHeight());
   }
}

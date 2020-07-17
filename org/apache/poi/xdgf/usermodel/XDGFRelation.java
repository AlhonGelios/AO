package org.apache.poi.xdgf.usermodel;

import java.util.HashMap;
import java.util.Map;
import org.apache.poi.POIXMLRelation;
import org.apache.poi.xdgf.usermodel.XDGFMasterContents;
import org.apache.poi.xdgf.usermodel.XDGFMasters;
import org.apache.poi.xdgf.usermodel.XDGFPageContents;
import org.apache.poi.xdgf.usermodel.XDGFPages;

public class XDGFRelation extends POIXMLRelation {

   private static final Map _table = new HashMap();
   public static final XDGFRelation DOCUMENT = new XDGFRelation("application/vnd.ms-visio.drawing.main+xml", "http://schemas.microsoft.com/visio/2010/relationships/document", "/visio/document.xml", (Class)null);
   public static final XDGFRelation MASTERS = new XDGFRelation("application/vnd.ms-visio.masters+xml", "http://schemas.microsoft.com/visio/2010/relationships/masters", "/visio/masters/masters.xml", XDGFMasters.class);
   public static final XDGFRelation MASTER = new XDGFRelation("application/vnd.ms-visio.master+xml", "http://schemas.microsoft.com/visio/2010/relationships/master", "/visio/masters/master#.xml", XDGFMasterContents.class);
   public static final XDGFRelation IMAGES = new XDGFRelation((String)null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", (String)null, (Class)null);
   public static final XDGFRelation PAGES = new XDGFRelation("application/vnd.ms-visio.pages+xml", "http://schemas.microsoft.com/visio/2010/relationships/pages", "/visio/pages/pages.xml", XDGFPages.class);
   public static final XDGFRelation PAGE = new XDGFRelation("application/vnd.ms-visio.page+xml", "http://schemas.microsoft.com/visio/2010/relationships/page", "/visio/pages/page#.xml", XDGFPageContents.class);
   public static final XDGFRelation WINDOW = new XDGFRelation("application/vnd.ms-visio.windows+xml", "http://schemas.microsoft.com/visio/2010/relationships/windows", "/visio/windows.xml", (Class)null);


   private XDGFRelation(String type, String rel, String defaultName, Class cls) {
      super(type, rel, defaultName, cls);
      _table.put(rel, this);
   }

   public static XDGFRelation getInstance(String rel) {
      return (XDGFRelation)_table.get(rel);
   }

}

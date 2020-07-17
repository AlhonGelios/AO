package org.apache.poi;

import org.apache.poi.POIXMLDocumentPart;

public abstract class POIXMLRelation {

   protected String _type;
   protected String _relation;
   protected String _defaultName;
   private Class _cls;


   public POIXMLRelation(String type, String rel, String defaultName, Class cls) {
      this._type = type;
      this._relation = rel;
      this._defaultName = defaultName;
      this._cls = cls;
   }

   public POIXMLRelation(String type, String rel, String defaultName) {
      this(type, rel, defaultName, (Class)null);
   }

   public String getContentType() {
      return this._type;
   }

   public String getRelation() {
      return this._relation;
   }

   public String getDefaultFileName() {
      return this._defaultName;
   }

   public String getFileName(int index) {
      return this._defaultName.indexOf("#") == -1?this.getDefaultFileName():this._defaultName.replace("#", Integer.toString(index));
   }

   public Integer getFileNameIndex(POIXMLDocumentPart part) {
      String regex = this._defaultName.replace("#", "(\\d+)");
      return Integer.valueOf(part.getPackagePart().getPartName().getName().replaceAll(regex, "$1"));
   }

   public Class getRelationClass() {
      return this._cls;
   }
}

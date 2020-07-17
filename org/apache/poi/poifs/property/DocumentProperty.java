package org.apache.poi.poifs.property;

import org.apache.poi.poifs.filesystem.OPOIFSDocument;
import org.apache.poi.poifs.property.Property;

public class DocumentProperty extends Property {

   private OPOIFSDocument _document = null;


   public DocumentProperty(String name, int size) {
      this.setName(name);
      this.setSize(size);
      this.setNodeColor((byte)1);
      this.setPropertyType((byte)2);
   }

   protected DocumentProperty(int index, byte[] array, int offset) {
      super(index, array, offset);
   }

   public void setDocument(OPOIFSDocument doc) {
      this._document = doc;
   }

   public OPOIFSDocument getDocument() {
      return this._document;
   }

   public boolean shouldUseSmallBlocks() {
      return super.shouldUseSmallBlocks();
   }

   public boolean isDirectory() {
      return false;
   }

   protected void preWrite() {}

   public void updateSize(int size) {
      this.setSize(size);
   }
}

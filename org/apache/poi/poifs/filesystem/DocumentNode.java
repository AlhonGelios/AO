package org.apache.poi.poifs.filesystem;

import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.poifs.dev.POIFSViewable;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.EntryNode;
import org.apache.poi.poifs.filesystem.OPOIFSDocument;
import org.apache.poi.poifs.property.DocumentProperty;

public class DocumentNode extends EntryNode implements DocumentEntry, POIFSViewable {

   private OPOIFSDocument _document;


   DocumentNode(DocumentProperty property, DirectoryNode parent) {
      super(property, parent);
      this._document = property.getDocument();
   }

   OPOIFSDocument getDocument() {
      return this._document;
   }

   public int getSize() {
      return this.getProperty().getSize();
   }

   public boolean isDocumentEntry() {
      return true;
   }

   protected boolean isDeleteOK() {
      return true;
   }

   public Object[] getViewableArray() {
      return new Object[0];
   }

   public Iterator getViewableIterator() {
      ArrayList components = new ArrayList();
      components.add(this.getProperty());
      components.add(this._document);
      return components.iterator();
   }

   public boolean preferArray() {
      return false;
   }

   public String getShortDescription() {
      return this.getName();
   }
}

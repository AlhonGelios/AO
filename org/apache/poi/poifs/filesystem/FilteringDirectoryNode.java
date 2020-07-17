package org.apache.poi.poifs.filesystem;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.poi.hpsf.ClassID;
import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.Entry;
import org.apache.poi.poifs.filesystem.POIFSWriterListener;

public class FilteringDirectoryNode implements DirectoryEntry {

   private Set excludes;
   private Map childExcludes;
   private DirectoryEntry directory;


   public FilteringDirectoryNode(DirectoryEntry directory, Collection excludes) {
      this.directory = directory;
      this.excludes = new HashSet();
      this.childExcludes = new HashMap();
      Iterator i$ = excludes.iterator();

      while(i$.hasNext()) {
         String excl = (String)i$.next();
         int splitAt = excl.indexOf(47);
         if(splitAt == -1) {
            this.excludes.add(excl);
         } else {
            String child = excl.substring(0, splitAt);
            String childExcl = excl.substring(splitAt + 1);
            if(!this.childExcludes.containsKey(child)) {
               this.childExcludes.put(child, new ArrayList());
            }

            ((List)this.childExcludes.get(child)).add(childExcl);
         }
      }

   }

   public DirectoryEntry createDirectory(String name) throws IOException {
      return this.directory.createDirectory(name);
   }

   public DocumentEntry createDocument(String name, InputStream stream) throws IOException {
      return this.directory.createDocument(name, stream);
   }

   public DocumentEntry createDocument(String name, int size, POIFSWriterListener writer) throws IOException {
      return this.directory.createDocument(name, size, writer);
   }

   public Iterator getEntries() {
      return new FilteringDirectoryNode.FilteringIterator((FilteringDirectoryNode.NamelessClass535779489)null);
   }

   public Iterator iterator() {
      return this.getEntries();
   }

   public int getEntryCount() {
      int size = this.directory.getEntryCount();
      Iterator i$ = this.excludes.iterator();

      while(i$.hasNext()) {
         String excl = (String)i$.next();
         if(this.directory.hasEntry(excl)) {
            --size;
         }
      }

      return size;
   }

   public Set getEntryNames() {
      HashSet names = new HashSet();
      Iterator i$ = this.directory.getEntryNames().iterator();

      while(i$.hasNext()) {
         String name = (String)i$.next();
         if(!this.excludes.contains(name)) {
            names.add(name);
         }
      }

      return names;
   }

   public boolean isEmpty() {
      return this.getEntryCount() == 0;
   }

   public boolean hasEntry(String name) {
      return this.excludes.contains(name)?false:this.directory.hasEntry(name);
   }

   public Entry getEntry(String name) throws FileNotFoundException {
      if(this.excludes.contains(name)) {
         throw new FileNotFoundException(name);
      } else {
         Entry entry = this.directory.getEntry(name);
         return this.wrapEntry(entry);
      }
   }

   private Entry wrapEntry(Entry entry) {
      String name = entry.getName();
      return (Entry)(this.childExcludes.containsKey(name) && entry instanceof DirectoryEntry?new FilteringDirectoryNode((DirectoryEntry)entry, (Collection)this.childExcludes.get(name)):entry);
   }

   public ClassID getStorageClsid() {
      return this.directory.getStorageClsid();
   }

   public void setStorageClsid(ClassID clsidStorage) {
      this.directory.setStorageClsid(clsidStorage);
   }

   public boolean delete() {
      return this.directory.delete();
   }

   public boolean renameTo(String newName) {
      return this.directory.renameTo(newName);
   }

   public String getName() {
      return this.directory.getName();
   }

   public DirectoryEntry getParent() {
      return this.directory.getParent();
   }

   public boolean isDirectoryEntry() {
      return true;
   }

   public boolean isDocumentEntry() {
      return false;
   }

   private class FilteringIterator implements Iterator {

      private Iterator parent;
      private Entry next;


      private FilteringIterator() {
         this.parent = FilteringDirectoryNode.this.directory.getEntries();
         this.locateNext();
      }

      private void locateNext() {
         this.next = null;

         while(this.parent.hasNext() && this.next == null) {
            Entry e = (Entry)this.parent.next();
            if(!FilteringDirectoryNode.this.excludes.contains(e.getName())) {
               this.next = FilteringDirectoryNode.this.wrapEntry(e);
            }
         }

      }

      public boolean hasNext() {
         return this.next != null;
      }

      public Entry next() {
         Entry e = this.next;
         this.locateNext();
         return e;
      }

      public void remove() {
         throw new UnsupportedOperationException("Remove not supported");
      }

      // $FF: synthetic method
      FilteringIterator(FilteringDirectoryNode.NamelessClass535779489 x1) {
         this();
      }
   }

   // $FF: synthetic class
   static class NamelessClass535779489 {
   }
}

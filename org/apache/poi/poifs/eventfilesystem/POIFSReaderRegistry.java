package org.apache.poi.poifs.eventfilesystem;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.poi.poifs.eventfilesystem.POIFSReaderListener;
import org.apache.poi.poifs.filesystem.DocumentDescriptor;
import org.apache.poi.poifs.filesystem.POIFSDocumentPath;

class POIFSReaderRegistry {

   private Set omnivorousListeners = new HashSet();
   private Map selectiveListeners = new HashMap();
   private Map chosenDocumentDescriptors = new HashMap();


   void registerListener(POIFSReaderListener listener, POIFSDocumentPath path, String documentName) {
      if(!this.omnivorousListeners.contains(listener)) {
         Object descriptors = (Set)this.selectiveListeners.get(listener);
         if(descriptors == null) {
            descriptors = new HashSet();
            this.selectiveListeners.put(listener, descriptors);
         }

         DocumentDescriptor descriptor = new DocumentDescriptor(path, documentName);
         if(((Set)descriptors).add(descriptor)) {
            Object listeners = (Set)this.chosenDocumentDescriptors.get(descriptor);
            if(listeners == null) {
               listeners = new HashSet();
               this.chosenDocumentDescriptors.put(descriptor, listeners);
            }

            ((Set)listeners).add(listener);
         }
      }

   }

   void registerListener(POIFSReaderListener listener) {
      if(!this.omnivorousListeners.contains(listener)) {
         this.removeSelectiveListener(listener);
         this.omnivorousListeners.add(listener);
      }

   }

   Iterator getListeners(POIFSDocumentPath path, String name) {
      HashSet rval = new HashSet(this.omnivorousListeners);
      Set selectiveListenersInner = (Set)this.chosenDocumentDescriptors.get(new DocumentDescriptor(path, name));
      if(selectiveListenersInner != null) {
         rval.addAll(selectiveListenersInner);
      }

      return rval.iterator();
   }

   private void removeSelectiveListener(POIFSReaderListener listener) {
      Set selectedDescriptors = (Set)this.selectiveListeners.remove(listener);
      if(selectedDescriptors != null) {
         Iterator iter = selectedDescriptors.iterator();

         while(iter.hasNext()) {
            this.dropDocument(listener, (DocumentDescriptor)iter.next());
         }
      }

   }

   private void dropDocument(POIFSReaderListener listener, DocumentDescriptor descriptor) {
      Set listeners = (Set)this.chosenDocumentDescriptors.get(descriptor);
      listeners.remove(listener);
      if(listeners.size() == 0) {
         this.chosenDocumentDescriptors.remove(descriptor);
      }

   }
}

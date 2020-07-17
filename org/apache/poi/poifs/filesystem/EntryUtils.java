package org.apache.poi.poifs.filesystem;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.DocumentInputStream;
import org.apache.poi.poifs.filesystem.DocumentNode;
import org.apache.poi.poifs.filesystem.Entry;
import org.apache.poi.poifs.filesystem.FilteringDirectoryNode;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.poifs.filesystem.OPOIFSFileSystem;
import org.apache.poi.util.Internal;

@Internal
public class EntryUtils {

   @Internal
   public static void copyNodeRecursively(Entry entry, DirectoryEntry target) throws IOException {
      DirectoryEntry newTarget = null;
      if(entry.isDirectoryEntry()) {
         DirectoryEntry dentry = (DirectoryEntry)entry;
         newTarget = target.createDirectory(entry.getName());
         newTarget.setStorageClsid(dentry.getStorageClsid());
         Iterator dstream = dentry.getEntries();

         while(dstream.hasNext()) {
            copyNodeRecursively((Entry)dstream.next(), newTarget);
         }
      } else {
         DocumentEntry dentry1 = (DocumentEntry)entry;
         DocumentInputStream dstream1 = new DocumentInputStream(dentry1);
         target.createDocument(dentry1.getName(), dstream1);
         dstream1.close();
      }

   }

   public static void copyNodes(DirectoryEntry sourceRoot, DirectoryEntry targetRoot) throws IOException {
      Iterator i$ = sourceRoot.iterator();

      while(i$.hasNext()) {
         Entry entry = (Entry)i$.next();
         copyNodeRecursively(entry, targetRoot);
      }

   }

   public static void copyNodes(FilteringDirectoryNode filteredSource, FilteringDirectoryNode filteredTarget) throws IOException {
      copyNodes((DirectoryEntry)filteredSource, (DirectoryEntry)filteredTarget);
   }

   public static void copyNodes(DirectoryEntry sourceRoot, DirectoryEntry targetRoot, List excepts) throws IOException {
      Iterator entries = sourceRoot.getEntries();

      while(entries.hasNext()) {
         Entry entry = (Entry)entries.next();
         if(!excepts.contains(entry.getName())) {
            copyNodeRecursively(entry, targetRoot);
         }
      }

   }

   public static void copyNodes(OPOIFSFileSystem source, OPOIFSFileSystem target) throws IOException {
      copyNodes((DirectoryEntry)source.getRoot(), (DirectoryEntry)target.getRoot());
   }

   public static void copyNodes(NPOIFSFileSystem source, NPOIFSFileSystem target) throws IOException {
      copyNodes((DirectoryEntry)source.getRoot(), (DirectoryEntry)target.getRoot());
   }

   public static void copyNodes(OPOIFSFileSystem source, OPOIFSFileSystem target, List excepts) throws IOException {
      copyNodes(new FilteringDirectoryNode(source.getRoot(), excepts), new FilteringDirectoryNode(target.getRoot(), excepts));
   }

   public static void copyNodes(NPOIFSFileSystem source, NPOIFSFileSystem target, List excepts) throws IOException {
      copyNodes(new FilteringDirectoryNode(source.getRoot(), excepts), new FilteringDirectoryNode(target.getRoot(), excepts));
   }

   public static boolean areDirectoriesIdentical(DirectoryEntry dirA, DirectoryEntry dirB) {
      if(!dirA.getName().equals(dirB.getName())) {
         return false;
      } else if(dirA.getEntryCount() != dirB.getEntryCount()) {
         return false;
      } else {
         HashMap aSizes = new HashMap();
         boolean isDirectory = true;
         Iterator i$ = dirA.iterator();

         Entry a;
         String e;
         while(i$.hasNext()) {
            a = (Entry)i$.next();
            e = a.getName();
            if(a.isDirectoryEntry()) {
               aSizes.put(e, Integer.valueOf(-12345));
            } else {
               aSizes.put(e, Integer.valueOf(((DocumentNode)a).getSize()));
            }
         }

         i$ = dirB.iterator();

         while(i$.hasNext()) {
            a = (Entry)i$.next();
            e = a.getName();
            if(!aSizes.containsKey(e)) {
               return false;
            }

            int match;
            if(a.isDirectoryEntry()) {
               match = -12345;
            } else {
               match = ((DocumentNode)a).getSize();
            }

            if(match != ((Integer)aSizes.get(e)).intValue()) {
               return false;
            }

            aSizes.remove(e);
         }

         if(!aSizes.isEmpty()) {
            return false;
         } else {
            i$ = dirA.iterator();

            while(i$.hasNext()) {
               a = (Entry)i$.next();

               try {
                  Entry e1 = dirB.getEntry(a.getName());
                  boolean match1;
                  if(a.isDirectoryEntry()) {
                     match1 = areDirectoriesIdentical((DirectoryEntry)a, (DirectoryEntry)e1);
                  } else {
                     match1 = areDocumentsIdentical((DocumentEntry)a, (DocumentEntry)e1);
                  }

                  if(!match1) {
                     return false;
                  }
               } catch (FileNotFoundException var8) {
                  return false;
               } catch (IOException var9) {
                  return false;
               }
            }

            return true;
         }
      }
   }

   public static boolean areDocumentsIdentical(DocumentEntry docA, DocumentEntry docB) throws IOException {
      if(!docA.getName().equals(docB.getName())) {
         return false;
      } else if(docA.getSize() != docB.getSize()) {
         return false;
      } else {
         boolean matches = true;
         DocumentInputStream inpA = null;
         DocumentInputStream inpB = null;

         try {
            inpA = new DocumentInputStream(docA);
            inpB = new DocumentInputStream(docB);

            int readA;
            int readB;
            do {
               readA = inpA.read();
               readB = inpB.read();
               if(readA != readB) {
                  matches = false;
                  break;
               }
            } while(readA != -1 && readB != -1);
         } finally {
            if(inpA != null) {
               inpA.close();
            }

            if(inpB != null) {
               inpB.close();
            }

         }

         return matches;
      }
   }
}

package org.apache.poi.poifs.dev;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.poifs.filesystem.DocumentInputStream;
import org.apache.poi.poifs.filesystem.DocumentNode;
import org.apache.poi.poifs.filesystem.Entry;
import org.apache.poi.poifs.filesystem.NPOIFSFileSystem;
import org.apache.poi.poifs.filesystem.NPOIFSStream;
import org.apache.poi.poifs.property.NPropertyTable;
import org.apache.poi.poifs.storage.HeaderBlock;
import org.apache.poi.util.IOUtils;

public class POIFSDump {

   public static void main(String[] args) throws IOException {
      if(args.length == 0) {
         System.err.println("Must specify at least one file to dump");
         System.exit(1);
      }

      boolean dumpProps = false;
      boolean dumpMini = false;
      String[] arr$ = args;
      int len$ = args.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         String filename = arr$[i$];
         if(!filename.equalsIgnoreCase("-dumprops") && !filename.equalsIgnoreCase("-dump-props") && !filename.equalsIgnoreCase("-dump-properties")) {
            if(!filename.equalsIgnoreCase("-dumpmini") && !filename.equalsIgnoreCase("-dump-mini") && !filename.equalsIgnoreCase("-dump-ministream") && !filename.equalsIgnoreCase("-dump-mini-stream")) {
               System.out.println("Dumping " + filename);
               FileInputStream is = new FileInputStream(filename);

               NPOIFSFileSystem fs;
               try {
                  fs = new NPOIFSFileSystem(is);
               } finally {
                  is.close();
               }

               try {
                  DirectoryNode root = fs.getRoot();
                  File file = new File((new File(filename)).getName(), root.getName());
                  if(!file.exists() && !file.mkdirs()) {
                     throw new IOException("Could not create directory " + file);
                  }

                  dump(root, file);
                  if(dumpProps) {
                     HeaderBlock props = fs.getHeaderBlock();
                     dump(fs, props.getPropertyStart(), "properties", file);
                  }

                  if(dumpMini) {
                     NPropertyTable var20 = fs.getPropertyTable();
                     int startBlock = var20.getRoot().getStartBlock();
                     if(startBlock == -2) {
                        System.err.println("No Mini Stream in file");
                     } else {
                        dump(fs, startBlock, "mini-stream", file);
                     }
                  }
               } finally {
                  fs.close();
               }
            } else {
               dumpMini = true;
            }
         } else {
            dumpProps = true;
         }
      }

   }

   public static void dump(DirectoryEntry root, File parent) throws IOException {
      Iterator it = root.getEntries();

      while(it.hasNext()) {
         Entry entry = (Entry)it.next();
         if(entry instanceof DocumentNode) {
            DocumentNode dir = (DocumentNode)entry;
            DocumentInputStream file = new DocumentInputStream(dir);
            byte[] bytes = IOUtils.toByteArray(file);
            file.close();
            FileOutputStream out = new FileOutputStream(new File(parent, dir.getName().trim()));

            try {
               out.write(bytes);
            } finally {
               out.close();
            }
         } else if(entry instanceof DirectoryEntry) {
            DirectoryEntry dir1 = (DirectoryEntry)entry;
            File file1 = new File(parent, entry.getName());
            if(!file1.exists() && !file1.mkdirs()) {
               throw new IOException("Could not create directory " + file1);
            }

            dump(dir1, file1);
         } else {
            System.err.println("Skipping unsupported POIFS entry: " + entry);
         }
      }

   }

   public static void dump(NPOIFSFileSystem fs, int startBlock, String name, File parent) throws IOException {
      File file = new File(parent, name);
      FileOutputStream out = new FileOutputStream(file);

      try {
         NPOIFSStream stream = new NPOIFSStream(fs, startBlock);
         byte[] b = new byte[fs.getBigBlockSize()];
         Iterator i$ = stream.iterator();

         while(i$.hasNext()) {
            ByteBuffer bb = (ByteBuffer)i$.next();
            int len = bb.remaining();
            bb.get(b);
            out.write(b, 0, len);
         }
      } finally {
         out.close();
      }

   }
}

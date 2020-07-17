package org.apache.poi.poifs.filesystem;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Set;
import org.apache.poi.hpsf.ClassID;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.Entry;
import org.apache.poi.poifs.filesystem.POIFSWriterListener;

public interface DirectoryEntry extends Entry, Iterable {

   Iterator getEntries();

   Set getEntryNames();

   boolean isEmpty();

   int getEntryCount();

   boolean hasEntry(String var1);

   Entry getEntry(String var1) throws FileNotFoundException;

   DocumentEntry createDocument(String var1, InputStream var2) throws IOException;

   DocumentEntry createDocument(String var1, int var2, POIFSWriterListener var3) throws IOException;

   DirectoryEntry createDirectory(String var1) throws IOException;

   ClassID getStorageClsid();

   void setStorageClsid(ClassID var1);
}

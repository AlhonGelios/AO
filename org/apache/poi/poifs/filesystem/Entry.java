package org.apache.poi.poifs.filesystem;

import org.apache.poi.poifs.filesystem.DirectoryEntry;

public interface Entry {

   String getName();

   boolean isDirectoryEntry();

   boolean isDocumentEntry();

   DirectoryEntry getParent();

   boolean delete();

   boolean renameTo(String var1);
}

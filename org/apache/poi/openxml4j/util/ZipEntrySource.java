package org.apache.poi.openxml4j.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;

public interface ZipEntrySource {

   Enumeration getEntries();

   InputStream getInputStream(ZipEntry var1) throws IOException;

   void close() throws IOException;

   boolean isClosed();
}

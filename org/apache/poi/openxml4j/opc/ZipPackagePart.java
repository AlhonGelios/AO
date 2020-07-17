package org.apache.poi.openxml4j.opc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.InvalidOperationException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.ZipPackage;
import org.apache.poi.openxml4j.opc.internal.marshallers.ZipPartMarshaller;
import org.apache.poi.util.NotImplemented;

public class ZipPackagePart extends PackagePart {

   private ZipEntry zipEntry;


   public ZipPackagePart(OPCPackage container, PackagePartName partName, String contentType) throws InvalidFormatException {
      super(container, partName, contentType);
   }

   public ZipPackagePart(OPCPackage container, ZipEntry zipEntry, PackagePartName partName, String contentType) throws InvalidFormatException {
      super(container, partName, contentType);
      this.zipEntry = zipEntry;
   }

   public ZipEntry getZipArchive() {
      return this.zipEntry;
   }

   protected InputStream getInputStreamImpl() throws IOException {
      return ((ZipPackage)this._container).getZipArchive().getInputStream(this.zipEntry);
   }

   protected OutputStream getOutputStreamImpl() {
      return null;
   }

   public long getSize() {
      return this.zipEntry.getSize();
   }

   public boolean save(OutputStream os) throws OpenXML4JException {
      return (new ZipPartMarshaller()).marshall(this, os);
   }

   @NotImplemented
   public boolean load(InputStream ios) {
      throw new InvalidOperationException("Method not implemented !");
   }

   @NotImplemented
   public void close() {
      throw new InvalidOperationException("Method not implemented !");
   }

   @NotImplemented
   public void flush() {
      throw new InvalidOperationException("Method not implemented !");
   }
}

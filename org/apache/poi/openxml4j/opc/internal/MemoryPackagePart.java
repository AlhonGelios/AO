package org.apache.poi.openxml4j.opc.internal;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.exceptions.OpenXML4JException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.internal.ContentType;
import org.apache.poi.openxml4j.opc.internal.MemoryPackagePartOutputStream;
import org.apache.poi.openxml4j.opc.internal.marshallers.ZipPartMarshaller;
import org.apache.poi.util.IOUtils;

public final class MemoryPackagePart extends PackagePart {

   protected byte[] data;


   public MemoryPackagePart(OPCPackage pack, PackagePartName partName, String contentType) throws InvalidFormatException {
      super(pack, partName, contentType);
   }

   public MemoryPackagePart(OPCPackage pack, PackagePartName partName, String contentType, boolean loadRelationships) throws InvalidFormatException {
      super(pack, partName, new ContentType(contentType), loadRelationships);
   }

   protected InputStream getInputStreamImpl() {
      if(this.data == null) {
         this.data = new byte[0];
      }

      return new ByteArrayInputStream(this.data);
   }

   protected OutputStream getOutputStreamImpl() {
      return new MemoryPackagePartOutputStream(this);
   }

   public long getSize() {
      return this.data == null?0L:(long)this.data.length;
   }

   public void clear() {
      this.data = null;
   }

   public boolean save(OutputStream os) throws OpenXML4JException {
      return (new ZipPartMarshaller()).marshall(this, os);
   }

   public boolean load(InputStream ios) throws InvalidFormatException {
      ByteArrayOutputStream baos = new ByteArrayOutputStream();

      try {
         IOUtils.copy(ios, baos);
      } catch (IOException var4) {
         throw new InvalidFormatException(var4.getMessage());
      }

      this.data = baos.toByteArray();
      return true;
   }

   public void close() {}

   public void flush() {}
}

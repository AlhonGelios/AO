package org.apache.poi.xslf.usermodel;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackageAccess;
import org.apache.poi.sl.usermodel.SlideShow;
import org.apache.poi.sl.usermodel.SlideShowFactory;
import org.apache.poi.util.Internal;
import org.apache.poi.xslf.usermodel.XMLSlideShow;

@Internal
public class XSLFSlideShowFactory extends SlideShowFactory {

   public static SlideShow createSlideShow(OPCPackage pkg) throws IOException {
      try {
         return new XMLSlideShow(pkg);
      } catch (IllegalArgumentException var2) {
         pkg.revert();
         throw var2;
      }
   }

   public static SlideShow createSlideShow(File file, boolean readOnly) throws IOException, InvalidFormatException {
      OPCPackage pkg = OPCPackage.open(file, readOnly?PackageAccess.READ:PackageAccess.READ_WRITE);
      return createSlideShow(pkg);
   }

   public static SlideShow createSlideShow(InputStream stream) throws IOException, InvalidFormatException {
      OPCPackage pkg = OPCPackage.open(stream);
      return createSlideShow(pkg);
   }
}

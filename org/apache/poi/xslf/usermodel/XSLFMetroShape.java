package org.apache.poi.xslf.usermodel;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackagePartName;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.apache.poi.sl.usermodel.Shape;
import org.apache.poi.util.Internal;
import org.apache.poi.xslf.usermodel.XSLFGroupShape;
import org.apache.poi.xslf.usermodel.XSLFSheet;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.presentationml.x2006.main.CTGroupShape;

@Internal
public class XSLFMetroShape {

   public static Shape parseShape(byte[] metroBytes) throws InvalidFormatException, IOException, XmlException {
      PackagePartName shapePN = PackagingURIHelper.createPartName("/drs/shapexml.xml");
      OPCPackage pkg = null;

      Shape var6;
      try {
         pkg = OPCPackage.open((InputStream)(new ByteArrayInputStream(metroBytes)));
         PackagePart shapePart = pkg.getPart(shapePN);
         CTGroupShape gs = CTGroupShape.Factory.parse(shapePart.getInputStream(), POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         XSLFGroupShape xgs = new XSLFGroupShape(gs, (XSLFSheet)null);
         var6 = (Shape)xgs.getShapes().get(0);
      } finally {
         if(pkg != null) {
            pkg.close();
         }

      }

      return var6;
   }
}

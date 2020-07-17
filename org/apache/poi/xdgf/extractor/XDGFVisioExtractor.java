package org.apache.poi.xdgf.extractor;

import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.POIXMLDocument;
import org.apache.poi.POIXMLTextExtractor;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xdgf.usermodel.XDGFPage;
import org.apache.poi.xdgf.usermodel.XmlVisioDocument;
import org.apache.poi.xdgf.usermodel.shape.ShapeTextVisitor;

public class XDGFVisioExtractor extends POIXMLTextExtractor {

   protected final XmlVisioDocument document;


   public XDGFVisioExtractor(XmlVisioDocument document) {
      super(document);
      this.document = document;
   }

   public XDGFVisioExtractor(OPCPackage openPackage) throws IOException {
      this(new XmlVisioDocument(openPackage));
   }

   public String getText() {
      ShapeTextVisitor visitor = new ShapeTextVisitor();
      Iterator i$ = this.document.getPages().iterator();

      while(i$.hasNext()) {
         XDGFPage page = (XDGFPage)i$.next();
         page.getContent().visitShapes(visitor);
      }

      return visitor.getText().toString();
   }

   public static void main(String[] args) throws IOException {
      if(args.length < 1) {
         System.err.println("Use:");
         System.err.println("  XDGFVisioExtractor <filename.vsdx>");
         System.exit(1);
      }

      XDGFVisioExtractor extractor = new XDGFVisioExtractor(POIXMLDocument.openPackage(args[0]));
      System.out.println(extractor.getText());
      extractor.close();
   }
}

package org.apache.poi.hpsf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import org.apache.poi.hpsf.DocumentSummaryInformation;
import org.apache.poi.hpsf.HPSFRuntimeException;
import org.apache.poi.hpsf.MarkUnsupportedException;
import org.apache.poi.hpsf.MutablePropertySet;
import org.apache.poi.hpsf.MutableSection;
import org.apache.poi.hpsf.NoPropertySetStreamException;
import org.apache.poi.hpsf.PropertySet;
import org.apache.poi.hpsf.SummaryInformation;
import org.apache.poi.hpsf.UnexpectedPropertySetTypeException;
import org.apache.poi.hpsf.wellknown.SectionIDMap;
import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.DocumentEntry;
import org.apache.poi.poifs.filesystem.DocumentInputStream;

public class PropertySetFactory {

   public static PropertySet create(DirectoryEntry dir, String name) throws FileNotFoundException, NoPropertySetStreamException, IOException, UnsupportedEncodingException {
      DocumentInputStream inp = null;

      Object var5;
      try {
         DocumentEntry entry = (DocumentEntry)dir.getEntry(name);
         inp = new DocumentInputStream(entry);

         try {
            PropertySet e = create(inp);
            return e;
         } catch (MarkUnsupportedException var9) {
            var5 = null;
         }
      } finally {
         if(inp != null) {
            inp.close();
         }

      }

      return (PropertySet)var5;
   }

   public static PropertySet create(InputStream stream) throws NoPropertySetStreamException, MarkUnsupportedException, UnsupportedEncodingException, IOException {
      PropertySet ps = new PropertySet(stream);

      try {
         return (PropertySet)(ps.isSummaryInformation()?new SummaryInformation(ps):(ps.isDocumentSummaryInformation()?new DocumentSummaryInformation(ps):ps));
      } catch (UnexpectedPropertySetTypeException var3) {
         throw new IllegalStateException(var3);
      }
   }

   public static SummaryInformation newSummaryInformation() {
      MutablePropertySet ps = new MutablePropertySet();
      MutableSection s = (MutableSection)ps.getFirstSection();
      s.setFormatID(SectionIDMap.SUMMARY_INFORMATION_ID);

      try {
         return new SummaryInformation(ps);
      } catch (UnexpectedPropertySetTypeException var3) {
         throw new HPSFRuntimeException(var3);
      }
   }

   public static DocumentSummaryInformation newDocumentSummaryInformation() {
      MutablePropertySet ps = new MutablePropertySet();
      MutableSection s = (MutableSection)ps.getFirstSection();
      s.setFormatID(SectionIDMap.DOCUMENT_SUMMARY_INFORMATION_ID[0]);

      try {
         return new DocumentSummaryInformation(ps);
      } catch (UnexpectedPropertySetTypeException var3) {
         throw new HPSFRuntimeException(var3);
      }
   }
}

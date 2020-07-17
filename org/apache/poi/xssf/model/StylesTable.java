package org.apache.poi.xssf.model;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;
import org.apache.poi.POIXMLDocumentPart;
import org.apache.poi.POIXMLTypeLoader;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.usermodel.FontFamily;
import org.apache.poi.ss.usermodel.FontScheme;
import org.apache.poi.util.Internal;
import org.apache.poi.xssf.model.ThemesTable;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFactory;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRelation;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellBorder;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellFill;
import org.apache.xmlbeans.XmlException;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorder;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTBorders;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellStyleXfs;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTCellXfs;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxf;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTDxfs;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFill;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFills;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFont;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTFonts;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmt;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTNumFmts;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTStylesheet;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTXf;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.STPatternType;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.StyleSheetDocument;

public class StylesTable extends POIXMLDocumentPart {

   private final SortedMap numberFormats;
   private final List fonts;
   private final List fills;
   private final List borders;
   private final List styleXfs;
   private final List xfs;
   private final List dxfs;
   public static final int FIRST_CUSTOM_STYLE_ID = 165;
   private static final int MAXIMUM_STYLE_ID = SpreadsheetVersion.EXCEL2007.getMaxCellStyles();
   private static final short FIRST_USER_DEFINED_NUMBER_FORMAT_ID = 164;
   private int MAXIMUM_NUMBER_OF_DATA_FORMATS;
   private StyleSheetDocument doc;
   private XSSFWorkbook workbook;
   private ThemesTable theme;


   public void setMaxNumberOfDataFormats(int num) {
      if(num < this.getNumDataFormats()) {
         if(num < 0) {
            throw new IllegalArgumentException("Maximum Number of Data Formats must be greater than or equal to 0");
         } else {
            throw new IllegalStateException("Cannot set the maximum number of data formats less than the current quantity.Data formats must be explicitly removed (via StylesTable.removeNumberFormat) before the limit can be decreased.");
         }
      } else {
         this.MAXIMUM_NUMBER_OF_DATA_FORMATS = num;
      }
   }

   public int getMaxNumberOfDataFormats() {
      return this.MAXIMUM_NUMBER_OF_DATA_FORMATS;
   }

   public StylesTable() {
      this.numberFormats = new TreeMap();
      this.fonts = new ArrayList();
      this.fills = new ArrayList();
      this.borders = new ArrayList();
      this.styleXfs = new ArrayList();
      this.xfs = new ArrayList();
      this.dxfs = new ArrayList();
      this.MAXIMUM_NUMBER_OF_DATA_FORMATS = 250;
      this.doc = StyleSheetDocument.Factory.newInstance();
      this.doc.addNewStyleSheet();
      this.initialize();
   }

   public StylesTable(PackagePart part) throws IOException {
      super(part);
      this.numberFormats = new TreeMap();
      this.fonts = new ArrayList();
      this.fills = new ArrayList();
      this.borders = new ArrayList();
      this.styleXfs = new ArrayList();
      this.xfs = new ArrayList();
      this.dxfs = new ArrayList();
      this.MAXIMUM_NUMBER_OF_DATA_FORMATS = 250;
      this.readFrom(part.getInputStream());
   }

   @Deprecated
   public StylesTable(PackagePart part, PackageRelationship rel) throws IOException {
      this(part);
   }

   public void setWorkbook(XSSFWorkbook wb) {
      this.workbook = wb;
   }

   public ThemesTable getTheme() {
      return this.theme;
   }

   public void setTheme(ThemesTable theme) {
      this.theme = theme;
      Iterator i$ = this.fonts.iterator();

      while(i$.hasNext()) {
         XSSFFont border = (XSSFFont)i$.next();
         border.setThemesTable(theme);
      }

      i$ = this.borders.iterator();

      while(i$.hasNext()) {
         XSSFCellBorder border1 = (XSSFCellBorder)i$.next();
         border1.setThemesTable(theme);
      }

   }

   public void ensureThemesTable() {
      if(this.theme == null) {
         this.theme = (ThemesTable)this.workbook.createRelationship(XSSFRelation.THEME, XSSFFactory.getInstance());
      }
   }

   protected void readFrom(InputStream is) throws IOException {
      try {
         this.doc = StyleSheetDocument.Factory.parse(is, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
         CTStylesheet e = this.doc.getStyleSheet();
         CTNumFmts ctfmts = e.getNumFmts();
         int ctfills;
         if(ctfmts != null) {
            CTNumFmt[] ctfonts = ctfmts.getNumFmtArray();
            ctfills = ctfonts.length;

            for(int ctborders = 0; ctborders < ctfills; ++ctborders) {
               CTNumFmt cellXfs = ctfonts[ctborders];
               short cellStyleXfs = (short)((int)cellXfs.getNumFmtId());
               this.numberFormats.put(Short.valueOf(cellStyleXfs), cellXfs.getFormatCode());
            }
         }

         CTFonts var12 = e.getFonts();
         int var16;
         int var19;
         if(var12 != null) {
            ctfills = 0;
            CTFont[] var14 = var12.getFontArray();
            var16 = var14.length;

            for(var19 = 0; var19 < var16; ++var19) {
               CTFont styleDxfs = var14[var19];
               XSSFFont border = new XSSFFont(styleDxfs, ctfills);
               this.fonts.add(border);
               ++ctfills;
            }
         }

         CTFills var13 = e.getFills();
         if(var13 != null) {
            CTFill[] var15 = var13.getFillArray();
            var16 = var15.length;

            for(var19 = 0; var19 < var16; ++var19) {
               CTFill var21 = var15[var19];
               this.fills.add(new XSSFCellFill(var21));
            }
         }

         CTBorders var17 = e.getBorders();
         if(var17 != null) {
            CTBorder[] var18 = var17.getBorderArray();
            var19 = var18.length;

            for(int var22 = 0; var22 < var19; ++var22) {
               CTBorder var24 = var18[var22];
               this.borders.add(new XSSFCellBorder(var24));
            }
         }

         CTCellXfs var20 = e.getCellXfs();
         if(var20 != null) {
            this.xfs.addAll(Arrays.asList(var20.getXfArray()));
         }

         CTCellStyleXfs var23 = e.getCellStyleXfs();
         if(var23 != null) {
            this.styleXfs.addAll(Arrays.asList(var23.getXfArray()));
         }

         CTDxfs var25 = e.getDxfs();
         if(var25 != null) {
            this.dxfs.addAll(Arrays.asList(var25.getDxfArray()));
         }

      } catch (XmlException var11) {
         throw new IOException(var11.getLocalizedMessage());
      }
   }

   public String getNumberFormatAt(int idx) {
      return this.getNumberFormatAt((short)idx);
   }

   public String getNumberFormatAt(short fmtId) {
      return (String)this.numberFormats.get(Short.valueOf(fmtId));
   }

   private short getNumberFormatId(String fmt) {
      Iterator i$ = this.numberFormats.entrySet().iterator();

      Entry numFmt;
      do {
         if(!i$.hasNext()) {
            throw new IllegalStateException("Number format not in style table: " + fmt);
         }

         numFmt = (Entry)i$.next();
      } while(!((String)numFmt.getValue()).equals(fmt));

      return ((Short)numFmt.getKey()).shortValue();
   }

   public int putNumberFormat(String fmt) {
      if(this.numberFormats.containsValue(fmt)) {
         try {
            return this.getNumberFormatId(fmt);
         } catch (IllegalStateException var4) {
            throw new IllegalStateException("Found the format, but couldn\'t figure out where - should never happen!");
         }
      } else if(this.numberFormats.size() >= this.MAXIMUM_NUMBER_OF_DATA_FORMATS) {
         throw new IllegalStateException("The maximum number of Data Formats was exceeded. You can define up to " + this.MAXIMUM_NUMBER_OF_DATA_FORMATS + " formats in a .xlsx Workbook.");
      } else {
         short formatIndex;
         if(this.numberFormats.isEmpty()) {
            formatIndex = 164;
         } else {
            short nextKey = (short)(((Short)this.numberFormats.lastKey()).shortValue() + 1);
            if(nextKey < 0) {
               throw new IllegalStateException("Cowardly avoiding creating a number format with a negative id.This is probably due to arithmetic overflow.");
            }

            formatIndex = (short)Math.max(nextKey, 164);
         }

         this.numberFormats.put(Short.valueOf(formatIndex), fmt);
         return formatIndex;
      }
   }

   public void putNumberFormat(short index, String fmt) {
      this.numberFormats.put(Short.valueOf(index), fmt);
   }

   public boolean removeNumberFormat(short index) {
      String fmt = (String)this.numberFormats.remove(Short.valueOf(index));
      boolean removed = fmt != null;
      if(removed) {
         Iterator i$ = this.xfs.iterator();

         while(i$.hasNext()) {
            CTXf style = (CTXf)i$.next();
            if(style.isSetNumFmtId() && style.getNumFmtId() == (long)index) {
               style.unsetApplyNumberFormat();
               style.unsetNumFmtId();
            }
         }
      }

      return removed;
   }

   public boolean removeNumberFormat(String fmt) {
      short id = this.getNumberFormatId(fmt);
      return this.removeNumberFormat(id);
   }

   public XSSFFont getFontAt(int idx) {
      return (XSSFFont)this.fonts.get(idx);
   }

   public int putFont(XSSFFont font, boolean forceRegistration) {
      int idx = -1;
      if(!forceRegistration) {
         idx = this.fonts.indexOf(font);
      }

      if(idx != -1) {
         return idx;
      } else {
         idx = this.fonts.size();
         this.fonts.add(font);
         return idx;
      }
   }

   public int putFont(XSSFFont font) {
      return this.putFont(font, false);
   }

   public XSSFCellStyle getStyleAt(int idx) {
      int styleXfId = 0;
      if(((CTXf)this.xfs.get(idx)).getXfId() > 0L) {
         styleXfId = (int)((CTXf)this.xfs.get(idx)).getXfId();
      }

      return new XSSFCellStyle(idx, styleXfId, this, this.theme);
   }

   public int putStyle(XSSFCellStyle style) {
      CTXf mainXF = style.getCoreXf();
      if(!this.xfs.contains(mainXF)) {
         this.xfs.add(mainXF);
      }

      return this.xfs.indexOf(mainXF);
   }

   public XSSFCellBorder getBorderAt(int idx) {
      return (XSSFCellBorder)this.borders.get(idx);
   }

   public int putBorder(XSSFCellBorder border) {
      int idx = this.borders.indexOf(border);
      if(idx != -1) {
         return idx;
      } else {
         this.borders.add(border);
         border.setThemesTable(this.theme);
         return this.borders.size() - 1;
      }
   }

   public XSSFCellFill getFillAt(int idx) {
      return (XSSFCellFill)this.fills.get(idx);
   }

   public List getBorders() {
      return Collections.unmodifiableList(this.borders);
   }

   public List getFills() {
      return Collections.unmodifiableList(this.fills);
   }

   public List getFonts() {
      return Collections.unmodifiableList(this.fonts);
   }

   public Map getNumberFormats() {
      return Collections.unmodifiableMap(this.numberFormats);
   }

   public int putFill(XSSFCellFill fill) {
      int idx = this.fills.indexOf(fill);
      if(idx != -1) {
         return idx;
      } else {
         this.fills.add(fill);
         return this.fills.size() - 1;
      }
   }

   @Internal
   public CTXf getCellXfAt(int idx) {
      return (CTXf)this.xfs.get(idx);
   }

   @Internal
   public int putCellXf(CTXf cellXf) {
      this.xfs.add(cellXf);
      return this.xfs.size();
   }

   @Internal
   public void replaceCellXfAt(int idx, CTXf cellXf) {
      this.xfs.set(idx, cellXf);
   }

   @Internal
   public CTXf getCellStyleXfAt(int idx) {
      try {
         return (CTXf)this.styleXfs.get(idx);
      } catch (IndexOutOfBoundsException var3) {
         return null;
      }
   }

   @Internal
   public int putCellStyleXf(CTXf cellStyleXf) {
      this.styleXfs.add(cellStyleXf);
      return this.styleXfs.size();
   }

   @Internal
   protected void replaceCellStyleXfAt(int idx, CTXf cellStyleXf) {
      this.styleXfs.set(idx, cellStyleXf);
   }

   public int getNumCellStyles() {
      return this.xfs.size();
   }

   public int getNumDataFormats() {
      return this.numberFormats.size();
   }

   @Internal
   public int _getNumberFormatSize() {
      return this.getNumDataFormats();
   }

   @Internal
   int _getXfsSize() {
      return this.xfs.size();
   }

   @Internal
   public int _getStyleXfsSize() {
      return this.styleXfs.size();
   }

   @Internal
   public CTStylesheet getCTStylesheet() {
      return this.doc.getStyleSheet();
   }

   @Internal
   public int _getDXfsSize() {
      return this.dxfs.size();
   }

   public void writeTo(OutputStream out) throws IOException {
      CTStylesheet styleSheet = this.doc.getStyleSheet();
      CTNumFmts formats = CTNumFmts.Factory.newInstance();
      formats.setCount((long)this.numberFormats.size());
      Iterator idx = this.numberFormats.entrySet().iterator();

      while(idx.hasNext()) {
         Entry ctFonts = (Entry)idx.next();
         CTNumFmt ctfnt = formats.addNewNumFmt();
         ctfnt.setNumFmtId((long)((Short)ctFonts.getKey()).shortValue());
         ctfnt.setFormatCode((String)ctFonts.getValue());
      }

      styleSheet.setNumFmts(formats);
      CTFonts var14 = styleSheet.getFonts();
      if(var14 == null) {
         var14 = CTFonts.Factory.newInstance();
      }

      var14.setCount((long)this.fonts.size());
      CTFont[] var15 = new CTFont[this.fonts.size()];
      int var13 = 0;

      XSSFFont ctf;
      for(Iterator ctFills = this.fonts.iterator(); ctFills.hasNext(); var15[var13++] = ctf.getCTFont()) {
         ctf = (XSSFFont)ctFills.next();
      }

      var14.setFontArray(var15);
      styleSheet.setFonts(var14);
      CTFills var16 = styleSheet.getFills();
      if(var16 == null) {
         var16 = CTFills.Factory.newInstance();
      }

      var16.setCount((long)this.fills.size());
      CTFill[] var17 = new CTFill[this.fills.size()];
      var13 = 0;

      XSSFCellFill ctb;
      for(Iterator ctBorders = this.fills.iterator(); ctBorders.hasNext(); var17[var13++] = ctb.getCTFill()) {
         ctb = (XSSFCellFill)ctBorders.next();
      }

      var16.setFillArray(var17);
      styleSheet.setFills(var16);
      CTBorders var18 = styleSheet.getBorders();
      if(var18 == null) {
         var18 = CTBorders.Factory.newInstance();
      }

      var18.setCount((long)this.borders.size());
      CTBorder[] var19 = new CTBorder[this.borders.size()];
      var13 = 0;

      XSSFCellBorder b;
      for(Iterator ctDxfs = this.borders.iterator(); ctDxfs.hasNext(); var19[var13++] = b.getCTBorder()) {
         b = (XSSFCellBorder)ctDxfs.next();
      }

      var18.setBorderArray(var19);
      styleSheet.setBorders(var18);
      if(this.xfs.size() > 0) {
         CTCellXfs var20 = styleSheet.getCellXfs();
         if(var20 == null) {
            var20 = CTCellXfs.Factory.newInstance();
         }

         var20.setCount((long)this.xfs.size());
         var20.setXfArray((CTXf[])this.xfs.toArray(new CTXf[this.xfs.size()]));
         styleSheet.setCellXfs(var20);
      }

      if(this.styleXfs.size() > 0) {
         CTCellStyleXfs var21 = styleSheet.getCellStyleXfs();
         if(var21 == null) {
            var21 = CTCellStyleXfs.Factory.newInstance();
         }

         var21.setCount((long)this.styleXfs.size());
         var21.setXfArray((CTXf[])this.styleXfs.toArray(new CTXf[this.styleXfs.size()]));
         styleSheet.setCellStyleXfs(var21);
      }

      if(this.dxfs.size() > 0) {
         CTDxfs var22 = styleSheet.getDxfs();
         if(var22 == null) {
            var22 = CTDxfs.Factory.newInstance();
         }

         var22.setCount((long)this.dxfs.size());
         var22.setDxfArray((CTDxf[])this.dxfs.toArray(new CTDxf[this.dxfs.size()]));
         styleSheet.setDxfs(var22);
      }

      this.doc.save(out, POIXMLTypeLoader.DEFAULT_XML_OPTIONS);
   }

   protected void commit() throws IOException {
      PackagePart part = this.getPackagePart();
      OutputStream out = part.getOutputStream();
      this.writeTo(out);
      out.close();
   }

   private void initialize() {
      XSSFFont xssfFont = createDefaultFont();
      this.fonts.add(xssfFont);
      CTFill[] ctFill = createDefaultFills();
      this.fills.add(new XSSFCellFill(ctFill[0]));
      this.fills.add(new XSSFCellFill(ctFill[1]));
      CTBorder ctBorder = createDefaultBorder();
      this.borders.add(new XSSFCellBorder(ctBorder));
      CTXf styleXf = createDefaultXf();
      this.styleXfs.add(styleXf);
      CTXf xf = createDefaultXf();
      xf.setXfId(0L);
      this.xfs.add(xf);
   }

   private static CTXf createDefaultXf() {
      CTXf ctXf = CTXf.Factory.newInstance();
      ctXf.setNumFmtId(0L);
      ctXf.setFontId(0L);
      ctXf.setFillId(0L);
      ctXf.setBorderId(0L);
      return ctXf;
   }

   private static CTBorder createDefaultBorder() {
      CTBorder ctBorder = CTBorder.Factory.newInstance();
      ctBorder.addNewBottom();
      ctBorder.addNewTop();
      ctBorder.addNewLeft();
      ctBorder.addNewRight();
      ctBorder.addNewDiagonal();
      return ctBorder;
   }

   private static CTFill[] createDefaultFills() {
      CTFill[] ctFill = new CTFill[]{CTFill.Factory.newInstance(), CTFill.Factory.newInstance()};
      ctFill[0].addNewPatternFill().setPatternType(STPatternType.NONE);
      ctFill[1].addNewPatternFill().setPatternType(STPatternType.DARK_GRAY);
      return ctFill;
   }

   private static XSSFFont createDefaultFont() {
      CTFont ctFont = CTFont.Factory.newInstance();
      XSSFFont xssfFont = new XSSFFont(ctFont, 0);
      xssfFont.setFontHeightInPoints((short)11);
      xssfFont.setColor(XSSFFont.DEFAULT_FONT_COLOR);
      xssfFont.setFontName("Calibri");
      xssfFont.setFamily(FontFamily.SWISS);
      xssfFont.setScheme(FontScheme.MINOR);
      return xssfFont;
   }

   @Internal
   public CTDxf getDxfAt(int idx) {
      return (CTDxf)this.dxfs.get(idx);
   }

   @Internal
   public int putDxf(CTDxf dxf) {
      this.dxfs.add(dxf);
      return this.dxfs.size();
   }

   public XSSFCellStyle createCellStyle() {
      if(this.getNumCellStyles() > MAXIMUM_STYLE_ID) {
         throw new IllegalStateException("The maximum number of Cell Styles was exceeded. You can define up to " + MAXIMUM_STYLE_ID + " style in a .xlsx Workbook");
      } else {
         int xfSize = this.styleXfs.size();
         CTXf xf = CTXf.Factory.newInstance();
         xf.setNumFmtId(0L);
         xf.setFontId(0L);
         xf.setFillId(0L);
         xf.setBorderId(0L);
         xf.setXfId(0L);
         int indexXf = this.putCellXf(xf);
         return new XSSFCellStyle(indexXf - 1, xfSize - 1, this, this.theme);
      }
   }

   public XSSFFont findFont(short boldWeight, short color, short fontHeight, String name, boolean italic, boolean strikeout, short typeOffset, byte underline) {
      Iterator i$ = this.fonts.iterator();

      XSSFFont font;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         font = (XSSFFont)i$.next();
      } while(font.getBoldweight() != boldWeight || font.getColor() != color || font.getFontHeight() != fontHeight || !font.getFontName().equals(name) || font.getItalic() != italic || font.getStrikeout() != strikeout || font.getTypeOffset() != typeOffset || font.getUnderline() != underline);

      return font;
   }

   public XSSFFont findFont(boolean bold, short color, short fontHeight, String name, boolean italic, boolean strikeout, short typeOffset, byte underline) {
      Iterator i$ = this.fonts.iterator();

      XSSFFont font;
      do {
         if(!i$.hasNext()) {
            return null;
         }

         font = (XSSFFont)i$.next();
      } while(font.getBold() != bold || font.getColor() != color || font.getFontHeight() != fontHeight || !font.getFontName().equals(name) || font.getItalic() != italic || font.getStrikeout() != strikeout || font.getTypeOffset() != typeOffset || font.getUnderline() != underline);

      return font;
   }

}

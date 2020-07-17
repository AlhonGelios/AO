package org.apache.poi.xdgf.usermodel.section;

import com.microsoft.schemas.office.visio.x2012.main.CellType;
import com.microsoft.schemas.office.visio.x2012.main.SectionType;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.POIXMLException;
import org.apache.poi.util.Internal;
import org.apache.poi.xdgf.usermodel.XDGFCell;
import org.apache.poi.xdgf.usermodel.XDGFSheet;
import org.apache.poi.xdgf.usermodel.section.CharacterSection;
import org.apache.poi.xdgf.usermodel.section.GenericSection;
import org.apache.poi.xdgf.usermodel.section.GeometrySection;
import org.apache.poi.xdgf.util.ObjectFactory;

public abstract class XDGFSection {

   static final ObjectFactory _sectionTypes = new ObjectFactory();
   protected SectionType _section;
   protected XDGFSheet _containingSheet;
   protected Map _cells = new HashMap();


   public static XDGFSection load(SectionType section, XDGFSheet containingSheet) {
      return (XDGFSection)_sectionTypes.load(section.getN(), new Object[]{section, containingSheet});
   }

   public XDGFSection(SectionType section, XDGFSheet containingSheet) {
      this._section = section;
      this._containingSheet = containingSheet;
      CellType[] arr$ = section.getCellArray();
      int len$ = arr$.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CellType cell = arr$[i$];
         this._cells.put(cell.getN(), new XDGFCell(cell));
      }

   }

   @Internal
   public SectionType getXmlObject() {
      return this._section;
   }

   public String toString() {
      return "<Section type=" + this._section.getN() + " from " + this._containingSheet + ">";
   }

   public abstract void setupMaster(XDGFSection var1);

   static {
      try {
         _sectionTypes.put("LineGradient", GenericSection.class, new Class[]{SectionType.class, XDGFSheet.class});
         _sectionTypes.put("FillGradient", GenericSection.class, new Class[]{SectionType.class, XDGFSheet.class});
         _sectionTypes.put("Character", CharacterSection.class, new Class[]{SectionType.class, XDGFSheet.class});
         _sectionTypes.put("Paragraph", GenericSection.class, new Class[]{SectionType.class, XDGFSheet.class});
         _sectionTypes.put("Tabs", GenericSection.class, new Class[]{SectionType.class, XDGFSheet.class});
         _sectionTypes.put("Scratch", GenericSection.class, new Class[]{SectionType.class, XDGFSheet.class});
         _sectionTypes.put("Connection", GenericSection.class, new Class[]{SectionType.class, XDGFSheet.class});
         _sectionTypes.put("ConnectionABCD", GenericSection.class, new Class[]{SectionType.class, XDGFSheet.class});
         _sectionTypes.put("Field", GenericSection.class, new Class[]{SectionType.class, XDGFSheet.class});
         _sectionTypes.put("Control", GenericSection.class, new Class[]{SectionType.class, XDGFSheet.class});
         _sectionTypes.put("Geometry", GeometrySection.class, new Class[]{SectionType.class, XDGFSheet.class});
         _sectionTypes.put("Actions", GenericSection.class, new Class[]{SectionType.class, XDGFSheet.class});
         _sectionTypes.put("Layer", GenericSection.class, new Class[]{SectionType.class, XDGFSheet.class});
         _sectionTypes.put("User", GenericSection.class, new Class[]{SectionType.class, XDGFSheet.class});
         _sectionTypes.put("Property", GenericSection.class, new Class[]{SectionType.class, XDGFSheet.class});
         _sectionTypes.put("Hyperlink", GenericSection.class, new Class[]{SectionType.class, XDGFSheet.class});
         _sectionTypes.put("Reviewer", GenericSection.class, new Class[]{SectionType.class, XDGFSheet.class});
         _sectionTypes.put("Annotation", GenericSection.class, new Class[]{SectionType.class, XDGFSheet.class});
         _sectionTypes.put("ActionTag", GenericSection.class, new Class[]{SectionType.class, XDGFSheet.class});
      } catch (NoSuchMethodException var1) {
         throw new POIXMLException("Internal error");
      } catch (SecurityException var2) {
         throw new POIXMLException("Internal error");
      }
   }
}

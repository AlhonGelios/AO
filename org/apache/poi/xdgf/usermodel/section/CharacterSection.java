package org.apache.poi.xdgf.usermodel.section;

import com.microsoft.schemas.office.visio.x2012.main.CellType;
import com.microsoft.schemas.office.visio.x2012.main.RowType;
import com.microsoft.schemas.office.visio.x2012.main.SectionType;
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.xdgf.usermodel.XDGFCell;
import org.apache.poi.xdgf.usermodel.XDGFSheet;
import org.apache.poi.xdgf.usermodel.section.XDGFSection;

public class CharacterSection extends XDGFSection {

   Double _fontSize = null;
   Color _fontColor = null;
   Map _characterCells = new HashMap();


   public CharacterSection(SectionType section, XDGFSheet containingSheet) {
      super(section, containingSheet);
      RowType row = section.getRowArray(0);
      CellType[] tmpColor = row.getCellArray();
      int len$ = tmpColor.length;

      for(int i$ = 0; i$ < len$; ++i$) {
         CellType cell = tmpColor[i$];
         this._characterCells.put(cell.getN(), new XDGFCell(cell));
      }

      this._fontSize = XDGFCell.maybeGetDouble(this._characterCells, "Size");
      String var8 = XDGFCell.maybeGetString(this._characterCells, "Color");
      if(var8 != null) {
         this._fontColor = Color.decode(var8);
      }

   }

   public Double getFontSize() {
      return this._fontSize;
   }

   public Color getFontColor() {
      return this._fontColor;
   }

   public void setupMaster(XDGFSection section) {}
}

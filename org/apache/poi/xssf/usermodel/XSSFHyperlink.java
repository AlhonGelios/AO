package org.apache.poi.xssf.usermodel;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.openxml4j.opc.PackagePart;
import org.apache.poi.openxml4j.opc.PackageRelationship;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.util.CellReference;
import org.apache.poi.util.Internal;
import org.apache.poi.xssf.usermodel.XSSFRelation;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTHyperlink;

public class XSSFHyperlink implements Hyperlink {

   private final HyperlinkType _type;
   private final PackageRelationship _externalRel;
   private final CTHyperlink _ctHyperlink;
   private String _location;


   protected XSSFHyperlink(int type) {
      this(HyperlinkType.forInt(type));
   }

   protected XSSFHyperlink(HyperlinkType type) {
      this._type = type;
      this._ctHyperlink = CTHyperlink.Factory.newInstance();
      this._externalRel = null;
   }

   protected XSSFHyperlink(CTHyperlink ctHyperlink, PackageRelationship hyperlinkRel) {
      this._ctHyperlink = ctHyperlink;
      this._externalRel = hyperlinkRel;
      if(this._externalRel == null) {
         if(ctHyperlink.getLocation() != null) {
            this._type = HyperlinkType.DOCUMENT;
            this._location = ctHyperlink.getLocation();
         } else {
            if(ctHyperlink.getId() != null) {
               throw new IllegalStateException("The hyperlink for cell " + ctHyperlink.getRef() + " references relation " + ctHyperlink.getId() + ", but that didn\'t exist!");
            }

            this._type = HyperlinkType.DOCUMENT;
         }
      } else {
         URI target = this._externalRel.getTargetURI();
         this._location = target.toString();
         if(ctHyperlink.getLocation() != null) {
            this._location = this._location + "#" + ctHyperlink.getLocation();
         }

         if(!this._location.startsWith("http://") && !this._location.startsWith("https://") && !this._location.startsWith("ftp://")) {
            if(this._location.startsWith("mailto:")) {
               this._type = HyperlinkType.EMAIL;
            } else {
               this._type = HyperlinkType.FILE;
            }
         } else {
            this._type = HyperlinkType.URL;
         }
      }

   }

   @Internal
   public XSSFHyperlink(Hyperlink other) {
      if(other instanceof XSSFHyperlink) {
         XSSFHyperlink xlink = (XSSFHyperlink)other;
         this._type = xlink.getTypeEnum();
         this._location = xlink._location;
         this._externalRel = xlink._externalRel;
         this._ctHyperlink = (CTHyperlink)xlink._ctHyperlink.copy();
      } else {
         this._type = other.getTypeEnum();
         this._location = other.getAddress();
         this._externalRel = null;
         this._ctHyperlink = CTHyperlink.Factory.newInstance();
         this.setCellReference(new CellReference(other.getFirstRow(), other.getFirstColumn()));
      }

   }

   @Internal
   public CTHyperlink getCTHyperlink() {
      return this._ctHyperlink;
   }

   public boolean needsRelationToo() {
      return this._type != HyperlinkType.DOCUMENT;
   }

   protected void generateRelationIfNeeded(PackagePart sheetPart) {
      if(this._externalRel == null && this.needsRelationToo()) {
         PackageRelationship rel = sheetPart.addExternalRelationship(this._location, XSSFRelation.SHEET_HYPERLINKS.getRelation());
         this._ctHyperlink.setId(rel.getId());
      }

   }

   public int getType() {
      return this._type.getCode();
   }

   public HyperlinkType getTypeEnum() {
      return this._type;
   }

   public String getCellRef() {
      return this._ctHyperlink.getRef();
   }

   public String getAddress() {
      return this._location;
   }

   public String getLabel() {
      return this._ctHyperlink.getDisplay();
   }

   public String getLocation() {
      return this._ctHyperlink.getLocation();
   }

   public void setLabel(String label) {
      this._ctHyperlink.setDisplay(label);
   }

   public void setLocation(String location) {
      this._ctHyperlink.setLocation(location);
   }

   public void setAddress(String address) {
      this.validate(address);
      this._location = address;
      if(this._type == HyperlinkType.DOCUMENT) {
         this.setLocation(address);
      }

   }

   private void validate(String address) {
      switch(XSSFHyperlink.NamelessClass1523136941.$SwitchMap$org$apache$poi$common$usermodel$HyperlinkType[this._type.ordinal()]) {
      case 1:
      case 2:
      case 3:
         try {
            new URI(address);
         } catch (URISyntaxException var3) {
            throw new IllegalArgumentException("Address of hyperlink must be a valid URI", var3);
         }
      case 4:
         return;
      default:
         throw new IllegalStateException("Invalid Hyperlink type: " + this._type);
      }
   }

   @Internal
   public void setCellReference(String ref) {
      this._ctHyperlink.setRef(ref);
   }

   @Internal
   protected void setCellReference(CellReference ref) {
      this.setCellReference(ref.formatAsString());
   }

   private CellReference buildCellReference() {
      String ref = this._ctHyperlink.getRef();
      if(ref == null) {
         ref = "A1";
      }

      return new CellReference(ref);
   }

   public int getFirstColumn() {
      return this.buildCellReference().getCol();
   }

   public int getLastColumn() {
      return this.buildCellReference().getCol();
   }

   public int getFirstRow() {
      return this.buildCellReference().getRow();
   }

   public int getLastRow() {
      return this.buildCellReference().getRow();
   }

   public void setFirstColumn(int col) {
      this.setCellReference(new CellReference(this.getFirstRow(), col));
   }

   public void setLastColumn(int col) {
      this.setFirstColumn(col);
   }

   public void setFirstRow(int row) {
      this.setCellReference(new CellReference(row, this.getFirstColumn()));
   }

   public void setLastRow(int row) {
      this.setFirstRow(row);
   }

   public String getTooltip() {
      return this._ctHyperlink.getTooltip();
   }

   public void setTooltip(String text) {
      this._ctHyperlink.setTooltip(text);
   }

   // $FF: synthetic class
   static class NamelessClass1523136941 {

      // $FF: synthetic field
      static final int[] $SwitchMap$org$apache$poi$common$usermodel$HyperlinkType = new int[HyperlinkType.values().length];


      static {
         try {
            $SwitchMap$org$apache$poi$common$usermodel$HyperlinkType[HyperlinkType.EMAIL.ordinal()] = 1;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$common$usermodel$HyperlinkType[HyperlinkType.FILE.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$common$usermodel$HyperlinkType[HyperlinkType.URL.ordinal()] = 3;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$org$apache$poi$common$usermodel$HyperlinkType[HyperlinkType.DOCUMENT.ordinal()] = 4;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }
}

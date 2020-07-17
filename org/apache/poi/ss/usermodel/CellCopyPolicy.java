package org.apache.poi.ss.usermodel;


public class CellCopyPolicy {

   public static final boolean DEFAULT_COPY_CELL_VALUE_POLICY = true;
   public static final boolean DEFAULT_COPY_CELL_STYLE_POLICY = true;
   public static final boolean DEFAULT_COPY_CELL_FORMULA_POLICY = true;
   public static final boolean DEFAULT_COPY_HYPERLINK_POLICY = true;
   public static final boolean DEFAULT_MERGE_HYPERLINK_POLICY = false;
   public static final boolean DEFAULT_COPY_ROW_HEIGHT_POLICY = true;
   public static final boolean DEFAULT_CONDENSE_ROWS_POLICY = false;
   public static final boolean DEFAULT_COPY_MERGED_REGIONS_POLICY = true;
   private boolean copyCellValue;
   private boolean copyCellStyle;
   private boolean copyCellFormula;
   private boolean copyHyperlink;
   private boolean mergeHyperlink;
   private boolean copyRowHeight;
   private boolean condenseRows;
   private boolean copyMergedRegions;


   public CellCopyPolicy() {
      this.copyCellValue = true;
      this.copyCellStyle = true;
      this.copyCellFormula = true;
      this.copyHyperlink = true;
      this.mergeHyperlink = false;
      this.copyRowHeight = true;
      this.condenseRows = false;
      this.copyMergedRegions = true;
   }

   public CellCopyPolicy(CellCopyPolicy other) {
      this.copyCellValue = true;
      this.copyCellStyle = true;
      this.copyCellFormula = true;
      this.copyHyperlink = true;
      this.mergeHyperlink = false;
      this.copyRowHeight = true;
      this.condenseRows = false;
      this.copyMergedRegions = true;
      this.copyCellValue = other.isCopyCellValue();
      this.copyCellStyle = other.isCopyCellStyle();
      this.copyCellFormula = other.isCopyCellFormula();
      this.copyHyperlink = other.isCopyHyperlink();
      this.mergeHyperlink = other.isMergeHyperlink();
      this.copyRowHeight = other.isCopyRowHeight();
      this.condenseRows = other.isCondenseRows();
      this.copyMergedRegions = other.isCopyMergedRegions();
   }

   private CellCopyPolicy(CellCopyPolicy.Builder builder) {
      this.copyCellValue = true;
      this.copyCellStyle = true;
      this.copyCellFormula = true;
      this.copyHyperlink = true;
      this.mergeHyperlink = false;
      this.copyRowHeight = true;
      this.condenseRows = false;
      this.copyMergedRegions = true;
      this.copyCellValue = builder.copyCellValue;
      this.copyCellStyle = builder.copyCellStyle;
      this.copyCellFormula = builder.copyCellFormula;
      this.copyHyperlink = builder.copyHyperlink;
      this.mergeHyperlink = builder.mergeHyperlink;
      this.copyRowHeight = builder.copyRowHeight;
      this.condenseRows = builder.condenseRows;
      this.copyMergedRegions = builder.copyMergedRegions;
   }

   public CellCopyPolicy.Builder createBuilder() {
      CellCopyPolicy.Builder builder = (new CellCopyPolicy.Builder()).cellValue(this.copyCellValue).cellStyle(this.copyCellStyle).cellFormula(this.copyCellFormula).copyHyperlink(this.copyHyperlink).mergeHyperlink(this.mergeHyperlink).rowHeight(this.copyRowHeight).condenseRows(this.condenseRows).mergedRegions(this.copyMergedRegions);
      return builder;
   }

   public boolean isCopyCellValue() {
      return this.copyCellValue;
   }

   public void setCopyCellValue(boolean copyCellValue) {
      this.copyCellValue = copyCellValue;
   }

   public boolean isCopyCellStyle() {
      return this.copyCellStyle;
   }

   public void setCopyCellStyle(boolean copyCellStyle) {
      this.copyCellStyle = copyCellStyle;
   }

   public boolean isCopyCellFormula() {
      return this.copyCellFormula;
   }

   public void setCopyCellFormula(boolean copyCellFormula) {
      this.copyCellFormula = copyCellFormula;
   }

   public boolean isCopyHyperlink() {
      return this.copyHyperlink;
   }

   public void setCopyHyperlink(boolean copyHyperlink) {
      this.copyHyperlink = copyHyperlink;
   }

   public boolean isMergeHyperlink() {
      return this.mergeHyperlink;
   }

   public void setMergeHyperlink(boolean mergeHyperlink) {
      this.mergeHyperlink = mergeHyperlink;
   }

   public boolean isCopyRowHeight() {
      return this.copyRowHeight;
   }

   public void setCopyRowHeight(boolean copyRowHeight) {
      this.copyRowHeight = copyRowHeight;
   }

   public boolean isCondenseRows() {
      return this.condenseRows;
   }

   public void setCondenseRows(boolean condenseRows) {
      this.condenseRows = condenseRows;
   }

   public boolean isCopyMergedRegions() {
      return this.copyMergedRegions;
   }

   public void setCopyMergedRegions(boolean copyMergedRegions) {
      this.copyMergedRegions = copyMergedRegions;
   }

   // $FF: synthetic method
   CellCopyPolicy(CellCopyPolicy.Builder x0, CellCopyPolicy.NamelessClass631961984 x1) {
      this(x0);
   }

   // $FF: synthetic class
   static class NamelessClass631961984 {
   }

   public static class Builder {

      private boolean copyCellValue = true;
      private boolean copyCellStyle = true;
      private boolean copyCellFormula = true;
      private boolean copyHyperlink = true;
      private boolean mergeHyperlink = false;
      private boolean copyRowHeight = true;
      private boolean condenseRows = false;
      private boolean copyMergedRegions = true;


      public CellCopyPolicy.Builder cellValue(boolean copyCellValue) {
         this.copyCellValue = copyCellValue;
         return this;
      }

      public CellCopyPolicy.Builder cellStyle(boolean copyCellStyle) {
         this.copyCellStyle = copyCellStyle;
         return this;
      }

      public CellCopyPolicy.Builder cellFormula(boolean copyCellFormula) {
         this.copyCellFormula = copyCellFormula;
         return this;
      }

      public CellCopyPolicy.Builder copyHyperlink(boolean copyHyperlink) {
         this.copyHyperlink = copyHyperlink;
         return this;
      }

      public CellCopyPolicy.Builder mergeHyperlink(boolean mergeHyperlink) {
         this.mergeHyperlink = mergeHyperlink;
         return this;
      }

      public CellCopyPolicy.Builder rowHeight(boolean copyRowHeight) {
         this.copyRowHeight = copyRowHeight;
         return this;
      }

      public CellCopyPolicy.Builder condenseRows(boolean condenseRows) {
         this.condenseRows = condenseRows;
         return this;
      }

      public CellCopyPolicy.Builder mergedRegions(boolean copyMergedRegions) {
         this.copyMergedRegions = copyMergedRegions;
         return this;
      }

      public CellCopyPolicy build() {
         return new CellCopyPolicy(this, (CellCopyPolicy.NamelessClass631961984)null);
      }
   }
}

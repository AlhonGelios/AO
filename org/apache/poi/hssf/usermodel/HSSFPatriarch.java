package org.apache.poi.hssf.usermodel;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.poi.ddf.EscherComplexProperty;
import org.apache.poi.ddf.EscherContainerRecord;
import org.apache.poi.ddf.EscherDgRecord;
import org.apache.poi.ddf.EscherOptRecord;
import org.apache.poi.ddf.EscherProperty;
import org.apache.poi.ddf.EscherSpRecord;
import org.apache.poi.ddf.EscherSpgrRecord;
import org.apache.poi.hssf.model.DrawingManager2;
import org.apache.poi.hssf.record.CommonObjectDataSubRecord;
import org.apache.poi.hssf.record.EmbeddedObjectRefSubRecord;
import org.apache.poi.hssf.record.EndSubRecord;
import org.apache.poi.hssf.record.EscherAggregate;
import org.apache.poi.hssf.record.FtCfSubRecord;
import org.apache.poi.hssf.record.FtPioGrbitSubRecord;
import org.apache.poi.hssf.record.NoteRecord;
import org.apache.poi.hssf.record.ObjRecord;
import org.apache.poi.hssf.usermodel.HSSFAnchor;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFCombobox;
import org.apache.poi.hssf.usermodel.HSSFComment;
import org.apache.poi.hssf.usermodel.HSSFObjectData;
import org.apache.poi.hssf.usermodel.HSSFPicture;
import org.apache.poi.hssf.usermodel.HSSFPictureData;
import org.apache.poi.hssf.usermodel.HSSFPolygon;
import org.apache.poi.hssf.usermodel.HSSFShape;
import org.apache.poi.hssf.usermodel.HSSFShapeContainer;
import org.apache.poi.hssf.usermodel.HSSFShapeFactory;
import org.apache.poi.hssf.usermodel.HSSFShapeGroup;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFSimpleShape;
import org.apache.poi.hssf.usermodel.HSSFTextbox;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.poifs.filesystem.DirectoryEntry;
import org.apache.poi.poifs.filesystem.DirectoryNode;
import org.apache.poi.ss.usermodel.Chart;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.Drawing;
import org.apache.poi.util.HexDump;
import org.apache.poi.util.Internal;
import org.apache.poi.util.NotImplemented;
import org.apache.poi.util.StringUtil;

public final class HSSFPatriarch implements HSSFShapeContainer, Drawing {

   private final List _shapes = new ArrayList();
   private final EscherSpgrRecord _spgrRecord;
   private final EscherContainerRecord _mainSpgrContainer;
   private EscherAggregate _boundAggregate;
   private final HSSFSheet _sheet;


   HSSFPatriarch(HSSFSheet sheet, EscherAggregate boundAggregate) {
      this._sheet = sheet;
      this._boundAggregate = boundAggregate;
      this._mainSpgrContainer = (EscherContainerRecord)this._boundAggregate.getEscherContainer().getChildContainers().get(0);
      EscherContainerRecord spContainer = (EscherContainerRecord)((EscherContainerRecord)this._boundAggregate.getEscherContainer().getChildContainers().get(0)).getChild(0);
      this._spgrRecord = (EscherSpgrRecord)spContainer.getChildById((short)-4087);
      this.buildShapeTree();
   }

   static HSSFPatriarch createPatriarch(HSSFPatriarch patriarch, HSSFSheet sheet) {
      HSSFPatriarch newPatriarch = new HSSFPatriarch(sheet, new EscherAggregate(true));
      newPatriarch.afterCreate();
      Iterator i$ = patriarch.getChildren().iterator();

      while(i$.hasNext()) {
         HSSFShape shape = (HSSFShape)i$.next();
         HSSFShape newShape;
         if(shape instanceof HSSFShapeGroup) {
            newShape = ((HSSFShapeGroup)shape).cloneShape(newPatriarch);
         } else {
            newShape = shape.cloneShape();
         }

         newPatriarch.onCreate(newShape);
         newPatriarch.addShape(newShape);
      }

      return newPatriarch;
   }

   protected void preSerialize() {
      Map tailRecords = this._boundAggregate.getTailRecords();
      HashSet coordinates = new HashSet(tailRecords.size());
      Iterator i$ = tailRecords.values().iterator();

      while(i$.hasNext()) {
         NoteRecord rec = (NoteRecord)i$.next();
         String noteRef = (new CellReference(rec.getRow(), rec.getColumn())).formatAsString();
         if(coordinates.contains(noteRef)) {
            throw new IllegalStateException("found multiple cell comments for cell " + noteRef);
         }

         coordinates.add(noteRef);
      }

   }

   public boolean removeShape(HSSFShape shape) {
      boolean isRemoved = this._mainSpgrContainer.removeChildRecord(shape.getEscherContainer());
      if(isRemoved) {
         shape.afterRemove(this);
         this._shapes.remove(shape);
      }

      return isRemoved;
   }

   void afterCreate() {
      DrawingManager2 drawingManager = this._sheet.getWorkbook().getWorkbook().getDrawingManager();
      short dgId = drawingManager.findNewDrawingGroupId();
      this._boundAggregate.setDgId(dgId);
      this._boundAggregate.setMainSpRecordId(this.newShapeId());
      drawingManager.incrementDrawingsSaved();
   }

   public HSSFShapeGroup createGroup(HSSFClientAnchor anchor) {
      HSSFShapeGroup group = new HSSFShapeGroup((HSSFShape)null, anchor);
      this.addShape(group);
      this.onCreate(group);
      return group;
   }

   public HSSFSimpleShape createSimpleShape(HSSFClientAnchor anchor) {
      HSSFSimpleShape shape = new HSSFSimpleShape((HSSFShape)null, anchor);
      this.addShape(shape);
      this.onCreate(shape);
      return shape;
   }

   public HSSFPicture createPicture(HSSFClientAnchor anchor, int pictureIndex) {
      HSSFPicture shape = new HSSFPicture((HSSFShape)null, anchor);
      shape.setPictureIndex(pictureIndex);
      this.addShape(shape);
      this.onCreate(shape);
      return shape;
   }

   public HSSFPicture createPicture(ClientAnchor anchor, int pictureIndex) {
      return this.createPicture((HSSFClientAnchor)anchor, pictureIndex);
   }

   public HSSFObjectData createObjectData(HSSFClientAnchor anchor, int storageId, int pictureIndex) {
      ObjRecord obj = new ObjRecord();
      CommonObjectDataSubRecord ftCmo = new CommonObjectDataSubRecord();
      ftCmo.setObjectType((short)8);
      ftCmo.setLocked(true);
      ftCmo.setPrintable(true);
      ftCmo.setAutofill(true);
      ftCmo.setAutoline(true);
      ftCmo.setReserved1(0);
      ftCmo.setReserved2(0);
      ftCmo.setReserved3(0);
      obj.addSubRecord(ftCmo);
      FtCfSubRecord ftCf = new FtCfSubRecord();
      HSSFPictureData pictData = (HSSFPictureData)this.getSheet().getWorkbook().getAllPictures().get(pictureIndex - 1);
      switch(pictData.getFormat()) {
      case 2:
      case 3:
         ftCf.setFlags((short)2);
         break;
      case 4:
      case 5:
      case 6:
      case 7:
         ftCf.setFlags((short)9);
         break;
      default:
         throw new IllegalStateException("Invalid picture type: " + pictData.getFormat());
      }

      obj.addSubRecord(ftCf);
      FtPioGrbitSubRecord ftPioGrbit = new FtPioGrbitSubRecord();
      ftPioGrbit.setFlagByBit(1, true);
      obj.addSubRecord(ftPioGrbit);
      EmbeddedObjectRefSubRecord ftPictFmla = new EmbeddedObjectRefSubRecord();
      ftPictFmla.setUnknownFormulaData(new byte[]{(byte)2, (byte)0, (byte)0, (byte)0, (byte)0});
      ftPictFmla.setOleClassname("Paket");
      ftPictFmla.setStorageId(storageId);
      obj.addSubRecord(ftPictFmla);
      obj.addSubRecord(new EndSubRecord());
      String entryName = "MBD" + HexDump.toHex(storageId);

      DirectoryEntry oleRoot;
      try {
         DirectoryNode shape = this._sheet.getWorkbook().getRootDirectory();
         if(shape == null) {
            throw new FileNotFoundException();
         }

         oleRoot = (DirectoryEntry)shape.getEntry(entryName);
      } catch (FileNotFoundException var16) {
         throw new IllegalStateException("trying to add ole shape without actually adding data first - use HSSFWorkbook.addOlePackage first", var16);
      }

      HSSFPicture shape1 = new HSSFPicture((HSSFShape)null, anchor);
      shape1.setPictureIndex(pictureIndex);
      EscherContainerRecord spContainer = shape1.getEscherContainer();
      EscherSpRecord spRecord = (EscherSpRecord)spContainer.getChildById((short)-4086);
      spRecord.setFlags(spRecord.getFlags() | 16);
      HSSFObjectData oleShape = new HSSFObjectData(spContainer, obj, oleRoot);
      this.addShape(oleShape);
      this.onCreate(oleShape);
      return oleShape;
   }

   public HSSFPolygon createPolygon(HSSFClientAnchor anchor) {
      HSSFPolygon shape = new HSSFPolygon((HSSFShape)null, anchor);
      this.addShape(shape);
      this.onCreate(shape);
      return shape;
   }

   public HSSFTextbox createTextbox(HSSFClientAnchor anchor) {
      HSSFTextbox shape = new HSSFTextbox((HSSFShape)null, anchor);
      this.addShape(shape);
      this.onCreate(shape);
      return shape;
   }

   public HSSFComment createComment(HSSFAnchor anchor) {
      HSSFComment shape = new HSSFComment((HSSFShape)null, anchor);
      this.addShape(shape);
      this.onCreate(shape);
      return shape;
   }

   HSSFSimpleShape createComboBox(HSSFAnchor anchor) {
      HSSFCombobox shape = new HSSFCombobox((HSSFShape)null, anchor);
      this.addShape(shape);
      this.onCreate(shape);
      return shape;
   }

   public HSSFComment createCellComment(ClientAnchor anchor) {
      return this.createComment((HSSFAnchor)anchor);
   }

   public List getChildren() {
      return Collections.unmodifiableList(this._shapes);
   }

   @Internal
   public void addShape(HSSFShape shape) {
      shape.setPatriarch(this);
      this._shapes.add(shape);
   }

   private void onCreate(HSSFShape shape) {
      EscherContainerRecord spgrContainer = (EscherContainerRecord)this._boundAggregate.getEscherContainer().getChildContainers().get(0);
      EscherContainerRecord spContainer = shape.getEscherContainer();
      int shapeId = this.newShapeId();
      shape.setShapeId(shapeId);
      spgrContainer.addChildRecord(spContainer);
      shape.afterInsert(this);
      this.setFlipFlags(shape);
   }

   public int countOfAllChildren() {
      int count = this._shapes.size();

      HSSFShape shape;
      for(Iterator iterator = this._shapes.iterator(); iterator.hasNext(); count += shape.countOfAllChildren()) {
         shape = (HSSFShape)iterator.next();
      }

      return count;
   }

   public void setCoordinates(int x1, int y1, int x2, int y2) {
      this._spgrRecord.setRectY1(y1);
      this._spgrRecord.setRectY2(y2);
      this._spgrRecord.setRectX1(x1);
      this._spgrRecord.setRectX2(x2);
   }

   public void clear() {
      ArrayList copy = new ArrayList(this._shapes);
      Iterator i$ = copy.iterator();

      while(i$.hasNext()) {
         HSSFShape shape = (HSSFShape)i$.next();
         this.removeShape(shape);
      }

   }

   int newShapeId() {
      DrawingManager2 dm = this._sheet.getWorkbook().getWorkbook().getDrawingManager();
      EscherDgRecord dg = (EscherDgRecord)this._boundAggregate.getEscherContainer().getChildById((short)-4088);
      short drawingGroupId = dg.getDrawingGroupId();
      return dm.allocateShapeId(drawingGroupId, dg);
   }

   public boolean containsChart() {
      EscherOptRecord optRecord = (EscherOptRecord)this._boundAggregate.findFirstWithId((short)-4085);
      if(optRecord == null) {
         return false;
      } else {
         Iterator it = optRecord.getEscherProperties().iterator();

         while(it.hasNext()) {
            EscherProperty prop = (EscherProperty)it.next();
            if(prop.getPropertyNumber() == 896 && prop.isComplex()) {
               EscherComplexProperty cp = (EscherComplexProperty)prop;
               String str = StringUtil.getFromUnicodeLE(cp.getComplexData());
               if(str.equals("Chart 1 ")) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public int getX1() {
      return this._spgrRecord.getRectX1();
   }

   public int getY1() {
      return this._spgrRecord.getRectY1();
   }

   public int getX2() {
      return this._spgrRecord.getRectX2();
   }

   public int getY2() {
      return this._spgrRecord.getRectY2();
   }

   @Internal
   public EscherAggregate getBoundAggregate() {
      return this._boundAggregate;
   }

   public HSSFClientAnchor createAnchor(int dx1, int dy1, int dx2, int dy2, int col1, int row1, int col2, int row2) {
      return new HSSFClientAnchor(dx1, dy1, dx2, dy2, (short)col1, row1, (short)col2, row2);
   }

   @NotImplemented
   public Chart createChart(ClientAnchor anchor) {
      throw new RuntimeException("NotImplemented");
   }

   void buildShapeTree() {
      EscherContainerRecord dgContainer = this._boundAggregate.getEscherContainer();
      if(dgContainer != null) {
         EscherContainerRecord spgrConrainer = (EscherContainerRecord)dgContainer.getChildContainers().get(0);
         List spgrChildren = spgrConrainer.getChildContainers();

         for(int i = 0; i < spgrChildren.size(); ++i) {
            EscherContainerRecord spContainer = (EscherContainerRecord)spgrChildren.get(i);
            if(i != 0) {
               HSSFShapeFactory.createShapeTree(spContainer, this._boundAggregate, this, this._sheet.getWorkbook().getRootDirectory());
            }
         }

      }
   }

   private void setFlipFlags(HSSFShape shape) {
      EscherSpRecord sp = (EscherSpRecord)shape.getEscherContainer().getChildById((short)-4086);
      if(shape.getAnchor().isHorizontallyFlipped()) {
         sp.setFlags(sp.getFlags() | 64);
      }

      if(shape.getAnchor().isVerticallyFlipped()) {
         sp.setFlags(sp.getFlags() | 128);
      }

   }

   public Iterator iterator() {
      return this._shapes.iterator();
   }

   protected HSSFSheet getSheet() {
      return this._sheet;
   }
}

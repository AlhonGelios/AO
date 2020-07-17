package org.apache.poi.hssf.record;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.poi.ddf.DefaultEscherRecordFactory;
import org.apache.poi.ddf.EscherContainerRecord;
import org.apache.poi.ddf.EscherDgRecord;
import org.apache.poi.ddf.EscherRecord;
import org.apache.poi.ddf.EscherSerializationListener;
import org.apache.poi.ddf.EscherSpRecord;
import org.apache.poi.ddf.EscherSpgrRecord;
import org.apache.poi.hssf.record.AbstractEscherHolderRecord;
import org.apache.poi.hssf.record.CommonObjectDataSubRecord;
import org.apache.poi.hssf.record.ContinueRecord;
import org.apache.poi.hssf.record.DrawingRecord;
import org.apache.poi.hssf.record.NoteRecord;
import org.apache.poi.hssf.record.ObjRecord;
import org.apache.poi.hssf.record.Record;
import org.apache.poi.hssf.record.RecordBase;
import org.apache.poi.hssf.record.RecordFormatException;
import org.apache.poi.util.POILogFactory;
import org.apache.poi.util.POILogger;

public final class EscherAggregate extends AbstractEscherHolderRecord {

   public static final short sid = 9876;
   private static POILogger log = POILogFactory.getLogger(EscherAggregate.class);
   public static final short ST_MIN = 0;
   public static final short ST_NOT_PRIMATIVE = 0;
   public static final short ST_RECTANGLE = 1;
   public static final short ST_ROUNDRECTANGLE = 2;
   public static final short ST_ELLIPSE = 3;
   public static final short ST_DIAMOND = 4;
   public static final short ST_ISOCELESTRIANGLE = 5;
   public static final short ST_RIGHTTRIANGLE = 6;
   public static final short ST_PARALLELOGRAM = 7;
   public static final short ST_TRAPEZOID = 8;
   public static final short ST_HEXAGON = 9;
   public static final short ST_OCTAGON = 10;
   public static final short ST_PLUS = 11;
   public static final short ST_STAR = 12;
   public static final short ST_ARROW = 13;
   public static final short ST_THICKARROW = 14;
   public static final short ST_HOMEPLATE = 15;
   public static final short ST_CUBE = 16;
   public static final short ST_BALLOON = 17;
   public static final short ST_SEAL = 18;
   public static final short ST_ARC = 19;
   public static final short ST_LINE = 20;
   public static final short ST_PLAQUE = 21;
   public static final short ST_CAN = 22;
   public static final short ST_DONUT = 23;
   public static final short ST_TEXTSIMPLE = 24;
   public static final short ST_TEXTOCTAGON = 25;
   public static final short ST_TEXTHEXAGON = 26;
   public static final short ST_TEXTCURVE = 27;
   public static final short ST_TEXTWAVE = 28;
   public static final short ST_TEXTRING = 29;
   public static final short ST_TEXTONCURVE = 30;
   public static final short ST_TEXTONRING = 31;
   public static final short ST_STRAIGHTCONNECTOR1 = 32;
   public static final short ST_BENTCONNECTOR2 = 33;
   public static final short ST_BENTCONNECTOR3 = 34;
   public static final short ST_BENTCONNECTOR4 = 35;
   public static final short ST_BENTCONNECTOR5 = 36;
   public static final short ST_CURVEDCONNECTOR2 = 37;
   public static final short ST_CURVEDCONNECTOR3 = 38;
   public static final short ST_CURVEDCONNECTOR4 = 39;
   public static final short ST_CURVEDCONNECTOR5 = 40;
   public static final short ST_CALLOUT1 = 41;
   public static final short ST_CALLOUT2 = 42;
   public static final short ST_CALLOUT3 = 43;
   public static final short ST_ACCENTCALLOUT1 = 44;
   public static final short ST_ACCENTCALLOUT2 = 45;
   public static final short ST_ACCENTCALLOUT3 = 46;
   public static final short ST_BORDERCALLOUT1 = 47;
   public static final short ST_BORDERCALLOUT2 = 48;
   public static final short ST_BORDERCALLOUT3 = 49;
   public static final short ST_ACCENTBORDERCALLOUT1 = 50;
   public static final short ST_ACCENTBORDERCALLOUT2 = 51;
   public static final short ST_ACCENTBORDERCALLOUT3 = 52;
   public static final short ST_RIBBON = 53;
   public static final short ST_RIBBON2 = 54;
   public static final short ST_CHEVRON = 55;
   public static final short ST_PENTAGON = 56;
   public static final short ST_NOSMOKING = 57;
   public static final short ST_SEAL8 = 58;
   public static final short ST_SEAL16 = 59;
   public static final short ST_SEAL32 = 60;
   public static final short ST_WEDGERECTCALLOUT = 61;
   public static final short ST_WEDGERRECTCALLOUT = 62;
   public static final short ST_WEDGEELLIPSECALLOUT = 63;
   public static final short ST_WAVE = 64;
   public static final short ST_FOLDEDCORNER = 65;
   public static final short ST_LEFTARROW = 66;
   public static final short ST_DOWNARROW = 67;
   public static final short ST_UPARROW = 68;
   public static final short ST_LEFTRIGHTARROW = 69;
   public static final short ST_UPDOWNARROW = 70;
   public static final short ST_IRREGULARSEAL1 = 71;
   public static final short ST_IRREGULARSEAL2 = 72;
   public static final short ST_LIGHTNINGBOLT = 73;
   public static final short ST_HEART = 74;
   public static final short ST_PICTUREFRAME = 75;
   public static final short ST_QUADARROW = 76;
   public static final short ST_LEFTARROWCALLOUT = 77;
   public static final short ST_RIGHTARROWCALLOUT = 78;
   public static final short ST_UPARROWCALLOUT = 79;
   public static final short ST_DOWNARROWCALLOUT = 80;
   public static final short ST_LEFTRIGHTARROWCALLOUT = 81;
   public static final short ST_UPDOWNARROWCALLOUT = 82;
   public static final short ST_QUADARROWCALLOUT = 83;
   public static final short ST_BEVEL = 84;
   public static final short ST_LEFTBRACKET = 85;
   public static final short ST_RIGHTBRACKET = 86;
   public static final short ST_LEFTBRACE = 87;
   public static final short ST_RIGHTBRACE = 88;
   public static final short ST_LEFTUPARROW = 89;
   public static final short ST_BENTUPARROW = 90;
   public static final short ST_BENTARROW = 91;
   public static final short ST_SEAL24 = 92;
   public static final short ST_STRIPEDRIGHTARROW = 93;
   public static final short ST_NOTCHEDRIGHTARROW = 94;
   public static final short ST_BLOCKARC = 95;
   public static final short ST_SMILEYFACE = 96;
   public static final short ST_VERTICALSCROLL = 97;
   public static final short ST_HORIZONTALSCROLL = 98;
   public static final short ST_CIRCULARARROW = 99;
   public static final short ST_NOTCHEDCIRCULARARROW = 100;
   public static final short ST_UTURNARROW = 101;
   public static final short ST_CURVEDRIGHTARROW = 102;
   public static final short ST_CURVEDLEFTARROW = 103;
   public static final short ST_CURVEDUPARROW = 104;
   public static final short ST_CURVEDDOWNARROW = 105;
   public static final short ST_CLOUDCALLOUT = 106;
   public static final short ST_ELLIPSERIBBON = 107;
   public static final short ST_ELLIPSERIBBON2 = 108;
   public static final short ST_FLOWCHARTPROCESS = 109;
   public static final short ST_FLOWCHARTDECISION = 110;
   public static final short ST_FLOWCHARTINPUTOUTPUT = 111;
   public static final short ST_FLOWCHARTPREDEFINEDPROCESS = 112;
   public static final short ST_FLOWCHARTINTERNALSTORAGE = 113;
   public static final short ST_FLOWCHARTDOCUMENT = 114;
   public static final short ST_FLOWCHARTMULTIDOCUMENT = 115;
   public static final short ST_FLOWCHARTTERMINATOR = 116;
   public static final short ST_FLOWCHARTPREPARATION = 117;
   public static final short ST_FLOWCHARTMANUALINPUT = 118;
   public static final short ST_FLOWCHARTMANUALOPERATION = 119;
   public static final short ST_FLOWCHARTCONNECTOR = 120;
   public static final short ST_FLOWCHARTPUNCHEDCARD = 121;
   public static final short ST_FLOWCHARTPUNCHEDTAPE = 122;
   public static final short ST_FLOWCHARTSUMMINGJUNCTION = 123;
   public static final short ST_FLOWCHARTOR = 124;
   public static final short ST_FLOWCHARTCOLLATE = 125;
   public static final short ST_FLOWCHARTSORT = 126;
   public static final short ST_FLOWCHARTEXTRACT = 127;
   public static final short ST_FLOWCHARTMERGE = 128;
   public static final short ST_FLOWCHARTOFFLINESTORAGE = 129;
   public static final short ST_FLOWCHARTONLINESTORAGE = 130;
   public static final short ST_FLOWCHARTMAGNETICTAPE = 131;
   public static final short ST_FLOWCHARTMAGNETICDISK = 132;
   public static final short ST_FLOWCHARTMAGNETICDRUM = 133;
   public static final short ST_FLOWCHARTDISPLAY = 134;
   public static final short ST_FLOWCHARTDELAY = 135;
   public static final short ST_TEXTPLAINTEXT = 136;
   public static final short ST_TEXTSTOP = 137;
   public static final short ST_TEXTTRIANGLE = 138;
   public static final short ST_TEXTTRIANGLEINVERTED = 139;
   public static final short ST_TEXTCHEVRON = 140;
   public static final short ST_TEXTCHEVRONINVERTED = 141;
   public static final short ST_TEXTRINGINSIDE = 142;
   public static final short ST_TEXTRINGOUTSIDE = 143;
   public static final short ST_TEXTARCHUPCURVE = 144;
   public static final short ST_TEXTARCHDOWNCURVE = 145;
   public static final short ST_TEXTCIRCLECURVE = 146;
   public static final short ST_TEXTBUTTONCURVE = 147;
   public static final short ST_TEXTARCHUPPOUR = 148;
   public static final short ST_TEXTARCHDOWNPOUR = 149;
   public static final short ST_TEXTCIRCLEPOUR = 150;
   public static final short ST_TEXTBUTTONPOUR = 151;
   public static final short ST_TEXTCURVEUP = 152;
   public static final short ST_TEXTCURVEDOWN = 153;
   public static final short ST_TEXTCASCADEUP = 154;
   public static final short ST_TEXTCASCADEDOWN = 155;
   public static final short ST_TEXTWAVE1 = 156;
   public static final short ST_TEXTWAVE2 = 157;
   public static final short ST_TEXTWAVE3 = 158;
   public static final short ST_TEXTWAVE4 = 159;
   public static final short ST_TEXTINFLATE = 160;
   public static final short ST_TEXTDEFLATE = 161;
   public static final short ST_TEXTINFLATEBOTTOM = 162;
   public static final short ST_TEXTDEFLATEBOTTOM = 163;
   public static final short ST_TEXTINFLATETOP = 164;
   public static final short ST_TEXTDEFLATETOP = 165;
   public static final short ST_TEXTDEFLATEINFLATE = 166;
   public static final short ST_TEXTDEFLATEINFLATEDEFLATE = 167;
   public static final short ST_TEXTFADERIGHT = 168;
   public static final short ST_TEXTFADELEFT = 169;
   public static final short ST_TEXTFADEUP = 170;
   public static final short ST_TEXTFADEDOWN = 171;
   public static final short ST_TEXTSLANTUP = 172;
   public static final short ST_TEXTSLANTDOWN = 173;
   public static final short ST_TEXTCANUP = 174;
   public static final short ST_TEXTCANDOWN = 175;
   public static final short ST_FLOWCHARTALTERNATEPROCESS = 176;
   public static final short ST_FLOWCHARTOFFPAGECONNECTOR = 177;
   public static final short ST_CALLOUT90 = 178;
   public static final short ST_ACCENTCALLOUT90 = 179;
   public static final short ST_BORDERCALLOUT90 = 180;
   public static final short ST_ACCENTBORDERCALLOUT90 = 181;
   public static final short ST_LEFTRIGHTUPARROW = 182;
   public static final short ST_SUN = 183;
   public static final short ST_MOON = 184;
   public static final short ST_BRACKETPAIR = 185;
   public static final short ST_BRACEPAIR = 186;
   public static final short ST_SEAL4 = 187;
   public static final short ST_DOUBLEWAVE = 188;
   public static final short ST_ACTIONBUTTONBLANK = 189;
   public static final short ST_ACTIONBUTTONHOME = 190;
   public static final short ST_ACTIONBUTTONHELP = 191;
   public static final short ST_ACTIONBUTTONINFORMATION = 192;
   public static final short ST_ACTIONBUTTONFORWARDNEXT = 193;
   public static final short ST_ACTIONBUTTONBACKPREVIOUS = 194;
   public static final short ST_ACTIONBUTTONEND = 195;
   public static final short ST_ACTIONBUTTONBEGINNING = 196;
   public static final short ST_ACTIONBUTTONRETURN = 197;
   public static final short ST_ACTIONBUTTONDOCUMENT = 198;
   public static final short ST_ACTIONBUTTONSOUND = 199;
   public static final short ST_ACTIONBUTTONMOVIE = 200;
   public static final short ST_HOSTCONTROL = 201;
   public static final short ST_TEXTBOX = 202;
   public static final short ST_NIL = 4095;
   private final Map shapeToObj = new HashMap();
   private final Map tailRec = new LinkedHashMap();


   public EscherAggregate(boolean createDefaultTree) {
      if(createDefaultTree) {
         this.buildBaseTree();
      }

   }

   public short getSid() {
      return (short)9876;
   }

   public String toString() {
      String nl = System.getProperty("line.separtor");
      StringBuilder result = new StringBuilder();
      result.append('[').append(this.getRecordName()).append(']').append(nl);
      Iterator i$ = this.getEscherRecords().iterator();

      while(i$.hasNext()) {
         EscherRecord escherRecord = (EscherRecord)i$.next();
         result.append(escherRecord.toString());
      }

      result.append("[/").append(this.getRecordName()).append(']').append(nl);
      return result.toString();
   }

   public String toXml(String tab) {
      StringBuilder builder = new StringBuilder();
      builder.append(tab).append("<").append(this.getRecordName()).append(">\n");
      Iterator i$ = this.getEscherRecords().iterator();

      while(i$.hasNext()) {
         EscherRecord escherRecord = (EscherRecord)i$.next();
         builder.append(escherRecord.toXml(tab + "\t"));
      }

      builder.append(tab).append("</").append(this.getRecordName()).append(">\n");
      return builder.toString();
   }

   private static boolean isDrawingLayerRecord(short sid) {
      return sid == 236 || sid == 60 || sid == 93 || sid == 438;
   }

   public static EscherAggregate createAggregate(List records, int locFirstDrawingRecord) {
      final ArrayList shapeRecords = new ArrayList();
      DefaultEscherRecordFactory recordFactory = new DefaultEscherRecordFactory() {
         public EscherRecord createRecord(byte[] data, int offset) {
            EscherRecord r = super.createRecord(data, offset);
            if(r.getRecordId() == -4079 || r.getRecordId() == -4083) {
               shapeRecords.add(r);
            }

            return r;
         }
      };
      ByteArrayOutputStream buffer = new ByteArrayOutputStream();
      EscherAggregate agg = new EscherAggregate(false);
      int loc = locFirstDrawingRecord;

      while(loc + 1 < records.size() && isDrawingLayerRecord(sid(records, loc))) {
         try {
            if(sid(records, loc) != 236 && sid(records, loc) != 60) {
               ++loc;
               continue;
            }

            if(sid(records, loc) == 236) {
               buffer.write(((DrawingRecord)records.get(loc)).getRecordData());
            } else {
               buffer.write(((ContinueRecord)records.get(loc)).getData());
            }
         } catch (IOException var10) {
            throw new RuntimeException("Couldn\'t get data from drawing/continue records", var10);
         }

         ++loc;
      }

      int locLastDrawingRecord;
      for(int pos = 0; pos < buffer.size(); pos += locLastDrawingRecord) {
         EscherRecord shapeIndex = recordFactory.createRecord(buffer.toByteArray(), pos);
         locLastDrawingRecord = shapeIndex.fillFields(buffer.toByteArray(), pos, recordFactory);
         agg.addEscherRecord(shapeIndex);
      }

      loc = locFirstDrawingRecord + 1;
      int var11 = 0;

      while(loc < records.size() && isDrawingLayerRecord(sid(records, loc))) {
         if(!isObjectRecord(records, loc)) {
            ++loc;
         } else {
            Record var12 = (Record)records.get(loc);
            agg.shapeToObj.put(shapeRecords.get(var11++), var12);
            ++loc;
         }
      }

      while(loc < records.size() && sid(records, loc) == 28) {
         NoteRecord var13 = (NoteRecord)records.get(loc);
         agg.tailRec.put(Integer.valueOf(var13.getShapeId()), var13);
         ++loc;
      }

      records.subList(locFirstDrawingRecord, loc).clear();
      records.add(locFirstDrawingRecord, agg);
      return agg;
   }

   public int serialize(int offset, byte[] data) {
      List records = this.getEscherRecords();
      int size = this.getEscherRecordSize(records);
      byte[] buffer = new byte[size];
      final ArrayList spEndingOffsets = new ArrayList();
      final ArrayList shapes = new ArrayList();
      int pos = 0;

      EscherRecord bytesWritten;
      for(Iterator writtenEscherBytes = records.iterator(); writtenEscherBytes.hasNext(); pos += bytesWritten.serialize(pos, buffer, new EscherSerializationListener() {
         public void beforeRecordSerialize(int offset, short recordId, EscherRecord record) {}
         public void afterRecordSerialize(int offset, short recordId, int size, EscherRecord record) {
            if(recordId == -4079 || recordId == -4083) {
               spEndingOffsets.add(Integer.valueOf(offset));
               shapes.add(record);
            }

         }
      })) {
         Object i = writtenEscherBytes.next();
         bytesWritten = (EscherRecord)i;
      }

      shapes.add(0, (Object)null);
      spEndingOffsets.add(0, Integer.valueOf(0));
      pos = offset;
      int var15 = 0;

      int var16;
      int var17;
      for(var16 = 1; var16 < shapes.size(); ++var16) {
         var17 = ((Integer)spEndingOffsets.get(var16)).intValue() - 1;
         int noteRecord;
         if(var16 == 1) {
            noteRecord = 0;
         } else {
            noteRecord = ((Integer)spEndingOffsets.get(var16 - 1)).intValue();
         }

         byte[] rec = new byte[var17 - noteRecord + 1];
         System.arraycopy(buffer, noteRecord, rec, 0, rec.length);
         pos += this.writeDataIntoDrawingRecord(rec, var15, pos, data, var16);
         var15 += rec.length;
         Record obj = (Record)this.shapeToObj.get(shapes.get(var16));
         pos += obj.serialize(pos, data);
         if(var16 == shapes.size() - 1 && var17 < buffer.length - 1) {
            rec = new byte[buffer.length - var17 - 1];
            System.arraycopy(buffer, var17 + 1, rec, 0, rec.length);
            pos += this.writeDataIntoDrawingRecord(rec, var15, pos, data, var16);
         }
      }

      if(pos - offset < buffer.length - 1) {
         byte[] var18 = new byte[buffer.length - (pos - offset)];
         System.arraycopy(buffer, pos - offset, var18, 0, var18.length);
         pos += this.writeDataIntoDrawingRecord(var18, var15, pos, data, var16);
      }

      NoteRecord var20;
      for(Iterator var19 = this.tailRec.values().iterator(); var19.hasNext(); pos += var20.serialize(pos, data)) {
         var20 = (NoteRecord)var19.next();
      }

      var17 = pos - offset;
      if(var17 != this.getRecordSize()) {
         throw new RecordFormatException(var17 + " bytes written but getRecordSize() reports " + this.getRecordSize());
      } else {
         return var17;
      }
   }

   private int writeDataIntoDrawingRecord(byte[] drawingData, int writtenEscherBytes, int pos, byte[] data, int i) {
      int temp = 0;
      int j;
      byte[] buf1;
      ContinueRecord drawing1;
      if(writtenEscherBytes + drawingData.length > 8224 && i != 1) {
         for(j = 0; j < drawingData.length; j += 8224) {
            buf1 = new byte[Math.min(8224, drawingData.length - j)];
            System.arraycopy(drawingData, j, buf1, 0, Math.min(8224, drawingData.length - j));
            drawing1 = new ContinueRecord(buf1);
            temp += drawing1.serialize(pos + temp, data);
         }
      } else {
         for(j = 0; j < drawingData.length; j += 8224) {
            if(j == 0) {
               DrawingRecord buf = new DrawingRecord();
               byte[] drawing = new byte[Math.min(8224, drawingData.length - j)];
               System.arraycopy(drawingData, j, drawing, 0, Math.min(8224, drawingData.length - j));
               buf.setData(drawing);
               temp += buf.serialize(pos + temp, data);
            } else {
               buf1 = new byte[Math.min(8224, drawingData.length - j)];
               System.arraycopy(drawingData, j, buf1, 0, Math.min(8224, drawingData.length - j));
               drawing1 = new ContinueRecord(buf1);
               temp += drawing1.serialize(pos + temp, data);
            }
         }
      }

      return temp;
   }

   private int getEscherRecordSize(List records) {
      int size = 0;

      EscherRecord record;
      for(Iterator i$ = records.iterator(); i$.hasNext(); size += record.getRecordSize()) {
         record = (EscherRecord)i$.next();
      }

      return size;
   }

   public int getRecordSize() {
      int continueRecordsHeadersSize = 0;
      List records = this.getEscherRecords();
      int rawEscherSize = this.getEscherRecordSize(records);
      byte[] buffer = new byte[rawEscherSize];
      final ArrayList spEndingOffsets = new ArrayList();
      int pos = 0;

      EscherRecord objRecordSize;
      for(Iterator drawingRecordSize = records.iterator(); drawingRecordSize.hasNext(); pos += objRecordSize.serialize(pos, buffer, new EscherSerializationListener() {
         public void beforeRecordSerialize(int offset, short recordId, EscherRecord record) {}
         public void afterRecordSerialize(int offset, short recordId, int size, EscherRecord record) {
            if(recordId == -4079 || recordId == -4083) {
               spEndingOffsets.add(Integer.valueOf(offset));
            }

         }
      })) {
         objRecordSize = (EscherRecord)drawingRecordSize.next();
      }

      spEndingOffsets.add(0, Integer.valueOf(0));

      int var12;
      for(var12 = 1; var12 < spEndingOffsets.size(); ++var12) {
         if(var12 == spEndingOffsets.size() - 1 && ((Integer)spEndingOffsets.get(var12)).intValue() < pos) {
            continueRecordsHeadersSize += 4;
         }

         if(((Integer)spEndingOffsets.get(var12)).intValue() - ((Integer)spEndingOffsets.get(var12 - 1)).intValue() > 8224) {
            continueRecordsHeadersSize += (((Integer)spEndingOffsets.get(var12)).intValue() - ((Integer)spEndingOffsets.get(var12 - 1)).intValue()) / 8224 * 4;
         }
      }

      var12 = rawEscherSize + this.shapeToObj.size() * 4;
      if(rawEscherSize != 0 && spEndingOffsets.size() == 1) {
         continueRecordsHeadersSize += 4;
      }

      int var13 = 0;

      Record i$;
      for(Iterator tailRecordSize = this.shapeToObj.values().iterator(); tailRecordSize.hasNext(); var13 += i$.getRecordSize()) {
         i$ = (Record)tailRecordSize.next();
      }

      int var14 = 0;

      NoteRecord noteRecord;
      for(Iterator var15 = this.tailRec.values().iterator(); var15.hasNext(); var14 += noteRecord.getRecordSize()) {
         noteRecord = (NoteRecord)var15.next();
      }

      return var12 + var13 + var14 + continueRecordsHeadersSize;
   }

   public void associateShapeToObjRecord(EscherRecord r, Record objRecord) {
      this.shapeToObj.put(r, objRecord);
   }

   public void removeShapeToObjRecord(EscherRecord rec) {
      this.shapeToObj.remove(rec);
   }

   protected String getRecordName() {
      return "ESCHERAGGREGATE";
   }

   private static boolean isObjectRecord(List records, int loc) {
      return sid(records, loc) == 93 || sid(records, loc) == 438;
   }

   private void buildBaseTree() {
      EscherContainerRecord dgContainer = new EscherContainerRecord();
      EscherContainerRecord spgrContainer = new EscherContainerRecord();
      EscherContainerRecord spContainer1 = new EscherContainerRecord();
      EscherSpgrRecord spgr = new EscherSpgrRecord();
      EscherSpRecord sp1 = new EscherSpRecord();
      dgContainer.setRecordId((short)-4094);
      dgContainer.setOptions((short)15);
      EscherDgRecord dg = new EscherDgRecord();
      dg.setRecordId((short)-4088);
      byte dgId = 1;
      dg.setOptions((short)(dgId << 4));
      dg.setNumShapes(0);
      dg.setLastMSOSPID(1024);
      spgrContainer.setRecordId((short)-4093);
      spgrContainer.setOptions((short)15);
      spContainer1.setRecordId((short)-4092);
      spContainer1.setOptions((short)15);
      spgr.setRecordId((short)-4087);
      spgr.setOptions((short)1);
      spgr.setRectX1(0);
      spgr.setRectY1(0);
      spgr.setRectX2(1023);
      spgr.setRectY2(255);
      sp1.setRecordId((short)-4086);
      sp1.setOptions((short)2);
      sp1.setVersion((short)2);
      sp1.setShapeId(-1);
      sp1.setFlags(5);
      dgContainer.addChildRecord(dg);
      dgContainer.addChildRecord(spgrContainer);
      spgrContainer.addChildRecord(spContainer1);
      spContainer1.addChildRecord(spgr);
      spContainer1.addChildRecord(sp1);
      this.addEscherRecord(dgContainer);
   }

   public void setDgId(short dgId) {
      EscherContainerRecord dgContainer = this.getEscherContainer();
      EscherDgRecord dg = (EscherDgRecord)dgContainer.getChildById((short)-4088);
      dg.setOptions((short)(dgId << 4));
   }

   public void setMainSpRecordId(int shapeId) {
      EscherContainerRecord dgContainer = this.getEscherContainer();
      EscherContainerRecord spgrConatiner = (EscherContainerRecord)dgContainer.getChildById((short)-4093);
      EscherContainerRecord spContainer = (EscherContainerRecord)spgrConatiner.getChild(0);
      EscherSpRecord sp = (EscherSpRecord)spContainer.getChildById((short)-4086);
      sp.setShapeId(shapeId);
   }

   private static short sid(List records, int loc) {
      RecordBase record = (RecordBase)records.get(loc);
      return record instanceof Record?((Record)record).getSid():-1;
   }

   public Map getShapeToObjMapping() {
      return Collections.unmodifiableMap(this.shapeToObj);
   }

   public Map getTailRecords() {
      return Collections.unmodifiableMap(this.tailRec);
   }

   public NoteRecord getNoteRecordByObj(ObjRecord obj) {
      CommonObjectDataSubRecord cod = (CommonObjectDataSubRecord)obj.getSubRecords().get(0);
      return (NoteRecord)this.tailRec.get(Integer.valueOf(cod.getObjectId()));
   }

   public void addTailRecord(NoteRecord note) {
      this.tailRec.put(Integer.valueOf(note.getShapeId()), note);
   }

   public void removeTailRecord(NoteRecord note) {
      this.tailRec.remove(Integer.valueOf(note.getShapeId()));
   }

}

package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.AppDTVImpl;
import com.microsoft.sqlserver.jdbc.BaseInputStream;
import com.microsoft.sqlserver.jdbc.DDC;
import com.microsoft.sqlserver.jdbc.DTV;
import com.microsoft.sqlserver.jdbc.DTVImpl;
import com.microsoft.sqlserver.jdbc.DataTypes;
import com.microsoft.sqlserver.jdbc.InputStreamGetterArgs;
import com.microsoft.sqlserver.jdbc.JDBCType;
import com.microsoft.sqlserver.jdbc.JavaType;
import com.microsoft.sqlserver.jdbc.PLPInputStream;
import com.microsoft.sqlserver.jdbc.PLPXMLInputStream;
import com.microsoft.sqlserver.jdbc.SQLCollation;
import com.microsoft.sqlserver.jdbc.SQLServerConnection;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.SSLenType;
import com.microsoft.sqlserver.jdbc.SSType;
import com.microsoft.sqlserver.jdbc.SimpleInputStream;
import com.microsoft.sqlserver.jdbc.StreamSetterArgs;
import com.microsoft.sqlserver.jdbc.TDSReader;
import com.microsoft.sqlserver.jdbc.TDSReaderMark;
import com.microsoft.sqlserver.jdbc.TypeInfo;
import java.io.IOException;
import java.util.Calendar;

final class ServerDTVImpl extends DTVImpl {

   private int valueLength;
   private TDSReaderMark valueMark;
   private boolean isNull;
   private static final int STREAMCONSUMED = -2;


   void setValue(DTV var1, SQLCollation var2, JDBCType var3, Object var4, JavaType var5, StreamSetterArgs var6, Calendar var7, Integer var8, SQLServerConnection var9) throws SQLServerException {
      var1.setImpl(new AppDTVImpl());
      var1.setValue(var2, var3, var4, var5, var6, var7, var8, var9);
   }

   void setValue(Object var1, JavaType var2) {
      assert false;

   }

   void setPositionAfterStreamed(TDSReader var1) {
      this.valueMark = var1.mark();
      this.valueLength = -2;
   }

   void setStreamSetterArgs(StreamSetterArgs var1) {
      assert false;

   }

   void setCalendar(Calendar var1) {
      assert false;

   }

   void setScale(Integer var1) {
      assert false;

   }

   StreamSetterArgs getStreamSetterArgs() {
      assert false;

      return null;
   }

   Calendar getCalendar() {
      assert false;

      return null;
   }

   Integer getScale() {
      assert false;

      return null;
   }

   boolean isNull() {
      return this.isNull;
   }

   void setJdbcType(JDBCType var1) {
      assert false;

   }

   JDBCType getJdbcType() {
      assert false;

      return JDBCType.UNKNOWN;
   }

   JavaType getJavaType() {
      assert false;

      return JavaType.OBJECT;
   }

   final void initFromCompressedNull() {
      assert this.valueMark == null;

      this.isNull = true;
   }

   final void skipValue(TypeInfo var1, TDSReader var2, boolean var3) throws SQLServerException {
      if(null != this.valueMark || !this.isNull) {
         if(null == this.valueMark) {
            this.getValuePrep(var1, var2);
         }

         var2.reset(this.valueMark);
         if(this.valueLength != -2) {
            if(this.valueLength == -1) {
               assert SSLenType.PARTLENTYPE == var1.getSSLenType();

               PLPInputStream var4 = PLPInputStream.makeTempStream(var2, var3, this);

               try {
                  if(null != var4) {
                     var4.close();
                  }
               } catch (IOException var6) {
                  var2.getConnection().terminate(3, var6.getMessage());
               }
            } else {
               assert this.valueLength >= 0;

               var2.skip(this.valueLength);
            }
         }

      }
   }

   private final void getValuePrep(TypeInfo var1, TDSReader var2) throws SQLServerException {
      assert null == this.valueMark;

      switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$SSLenType[var1.getSSLenType().ordinal()]) {
      case 1:
         this.valueLength = -1;
         this.isNull = PLPInputStream.isNull(var2);
         break;
      case 2:
         this.valueLength = var1.getMaxLength();
         this.isNull = 0 == this.valueLength;
         break;
      case 3:
         this.valueLength = var2.readUnsignedByte();
         this.isNull = 0 == this.valueLength;
         break;
      case 4:
         this.valueLength = var2.readUnsignedShort();
         this.isNull = '\uffff' == this.valueLength;
         if(this.isNull) {
            this.valueLength = 0;
         }
         break;
      case 5:
         if(SSType.TEXT != var1.getSSType() && SSType.IMAGE != var1.getSSType() && SSType.NTEXT != var1.getSSType()) {
            this.valueLength = var2.readInt();
            this.isNull = 0 == this.valueLength;
         } else {
            this.isNull = 0 == var2.readUnsignedByte();
            if(this.isNull) {
               this.valueLength = 0;
            } else {
               var2.skip(24);
               this.valueLength = var2.readInt();
            }
         }
      }

      if(this.valueLength > var1.getMaxLength()) {
         var2.throwInvalidTDS();
      }

      this.valueMark = var2.mark();
   }

   Object getValue(DTV var1, JDBCType var2, int var3, InputStreamGetterArgs var4, Calendar var5, TypeInfo var6, TDSReader var7) throws SQLServerException {
      Object var8 = null;
      if(null == this.valueMark && !this.isNull) {
         this.getValuePrep(var6, var7);
      }

      assert this.valueMark != null || this.valueMark == null && this.isNull;

      boolean var9 = false;
      if(null != var4) {
         if(!var4.streamType.convertsFrom(var6)) {
            DataTypes.throwConversionError(var6.getSSType().toString(), var4.streamType.toString());
         }
      } else {
         if(!var6.getSSType().convertsTo(var2)) {
            DataTypes.throwConversionError(var6.getSSType().toString(), var2.toString());
         }

         var4 = InputStreamGetterArgs.getDefaultArgs();
      }

      if(-2 == this.valueLength) {
         throw new SQLServerException((Object)null, SQLServerException.getErrString("R_dataAlreadyAccessed"), (String)null, 0, false);
      } else {
         if(!this.isNull) {
            var7.reset(this.valueMark);
            label73:
            switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$SSType[var6.getSSType().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
               var8 = DDC.convertStreamToObject(PLPInputStream.makeStream(var7, var4, this), var6, var2, var4);
               break;
            case 5:
               var8 = DDC.convertStreamToObject((BaseInputStream)(!var2.isBinary() && var2 != JDBCType.SQLXML?PLPInputStream.makeStream(var7, var4, this):PLPXMLInputStream.makeXMLStream(var7, var4, this)), var6, var2, var4);
               break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
               var8 = DDC.convertStreamToObject(new SimpleInputStream(var7, this.valueLength, var4, this), var6, var2, var4);
               break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
               switch(this.valueLength) {
               case 1:
                  var8 = DDC.convertIntegerToObject(var7.readUnsignedByte(), this.valueLength, var2, var4.streamType);
                  break label73;
               case 2:
                  var8 = DDC.convertIntegerToObject(var7.readShort(), this.valueLength, var2, var4.streamType);
                  break label73;
               case 3:
               case 5:
               case 6:
               case 7:
               default:
                  assert false : "Unexpected valueLength" + this.valueLength;
                  break label73;
               case 4:
                  var8 = DDC.convertIntegerToObject(var7.readInt(), this.valueLength, var2, var4.streamType);
                  break label73;
               case 8:
                  var8 = DDC.convertLongToObject(var7.readLong(), var2, var4.streamType);
                  break label73;
               }
            case 21:
            case 22:
               var8 = var7.readDecimal(this.valueLength, var6, var2, var4.streamType);
               break;
            case 23:
            case 24:
               var8 = var7.readMoney(this.valueLength, var2, var4.streamType);
               break;
            case 25:
               var8 = var7.readFloat(this.valueLength, var2, var4.streamType);
               break;
            case 26:
               var8 = var7.readReal(this.valueLength, var2, var4.streamType);
               break;
            case 27:
            case 28:
               var8 = var7.readDateTime(this.valueLength, var5, var2, var4.streamType);
               break;
            case 29:
               var8 = var7.readDate(this.valueLength, var5, var2);
               break;
            case 30:
               var8 = var7.readTime(this.valueLength, var6, var5, var2);
               break;
            case 31:
               var8 = var7.readDateTime2(this.valueLength, var6, var5, var2);
               break;
            case 32:
               var8 = var7.readDateTimeOffset(this.valueLength, var6, var2);
               break;
            case 33:
               var8 = var7.readGUID(this.valueLength, var2, var4.streamType);
               break;
            default:
               assert false : "Unexpected SSType " + var6.getSSType();
            }
         }

         assert this.isNull || null != var8;

         return var8;
      }
   }

   Object getSetterValue() {
      assert false;

      return null;
   }

}

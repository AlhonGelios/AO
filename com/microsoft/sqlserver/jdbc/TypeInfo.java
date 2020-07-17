package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.Encoding;
import com.microsoft.sqlserver.jdbc.SQLCollation;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import com.microsoft.sqlserver.jdbc.SSLenType;
import com.microsoft.sqlserver.jdbc.SSType;
import com.microsoft.sqlserver.jdbc.TDS;
import com.microsoft.sqlserver.jdbc.TDSReader;
import com.microsoft.sqlserver.jdbc.TDSType;
import com.microsoft.sqlserver.jdbc.UDTTDSHeader;
import com.microsoft.sqlserver.jdbc.XMLTDSHeader;
import java.util.EnumMap;
import java.util.Map;

final class TypeInfo {

   private int maxLength;
   private SSLenType ssLenType;
   private int precision;
   private int displaySize;
   private int scale;
   private short flags;
   private SSType ssType;
   private int userType;
   private String udtTypeName;
   private SQLCollation collation;
   private String charset;
   static int UPDATABLE_READ_ONLY = 0;
   static int UPDATABLE_READ_WRITE = 1;
   static int UPDATABLE_UNKNOWN = 2;
   private static final Map builderMap = new EnumMap(TDSType.class);


   SSType getSSType() {
      return this.ssType;
   }

   SSLenType getSSLenType() {
      return this.ssLenType;
   }

   String getSSTypeName() {
      return SSType.UDT == this.ssType?this.udtTypeName:this.ssType.toString();
   }

   int getMaxLength() {
      return this.maxLength;
   }

   int getPrecision() {
      return this.precision;
   }

   int getDisplaySize() {
      return this.displaySize;
   }

   int getScale() {
      return this.scale;
   }

   SQLCollation getSQLCollation() {
      return this.collation;
   }

   String getCharset() {
      return this.charset;
   }

   boolean isNullable() {
      return 1 == (this.flags & 1);
   }

   boolean isCaseSensitive() {
      return 2 == (this.flags & 2);
   }

   boolean isSparseColumnSet() {
      return 1024 == (this.flags & 1024);
   }

   int getUpdatability() {
      return this.flags >> 2 & 3;
   }

   boolean isIdentity() {
      return 16 == (this.flags & 16);
   }

   byte[] getFlags() {
      byte[] var1 = new byte[]{(byte)(this.flags & 255), (byte)(this.flags >> 8 & 255)};
      return var1;
   }

   boolean supportsFastAsciiConversion() {
      switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$SSType[this.ssType.ordinal()]) {
      case 4:
      case 5:
      case 6:
      case 7:
         return this.collation.hasAsciiCompatibleSBCS();
      default:
         return false;
      }
   }

   static TypeInfo getInstance(TDSReader var0) throws SQLServerException {
      TypeInfo var1 = new TypeInfo();
      var1.userType = var0.readInt();
      var1.flags = var0.readShort();
      TDSType var2 = null;

      try {
         var2 = TDSType.valueOf(var0.readUnsignedByte());
      } catch (IllegalArgumentException var4) {
         var0.getConnection().terminate(4, var4.getMessage(), var4);
      }

      assert null != builderMap.get(var2) : "Missing TypeInfo builder for TDSType " + var2;

      return ((TypeInfo.Builder)builderMap.get(var2)).build(var1, var0);
   }

   static {
      TypeInfo.Builder[] var0 = TypeInfo.Builder.values();
      int var1 = var0.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         TypeInfo.Builder var3 = var0[var2];
         builderMap.put(var3.getTDSType(), var3);
      }

   }

   static enum Builder {

      BIT("BIT", 0, TDSType.BIT1, new TypeInfo.Builder.FixedLenStrategy(SSType.BIT, 1, 1, "1".length(), 0)),
      BIGINT("BIGINT", 1, TDSType.INT8, new TypeInfo.Builder.FixedLenStrategy(SSType.BIGINT, 8, Long.toString(Long.MAX_VALUE).length(), ("-" + Long.toString(Long.MAX_VALUE)).length(), 0)),
      INTEGER("INTEGER", 2, TDSType.INT4, new TypeInfo.Builder.FixedLenStrategy(SSType.INTEGER, 4, Integer.toString(Integer.MAX_VALUE).length(), ("-" + Integer.toString(Integer.MAX_VALUE)).length(), 0)),
      SMALLINT("SMALLINT", 3, TDSType.INT2, new TypeInfo.Builder.FixedLenStrategy(SSType.SMALLINT, 2, Short.toString((short)32767).length(), ("-" + Short.toString((short)32767)).length(), 0)),
      TINYINT("TINYINT", 4, TDSType.INT1, new TypeInfo.Builder.FixedLenStrategy(SSType.TINYINT, 1, Byte.toString((byte)127).length(), Byte.toString((byte)127).length(), 0)),
      REAL("REAL", 5, TDSType.FLOAT4, new TypeInfo.Builder.FixedLenStrategy(SSType.REAL, 4, 7, 13, 0)),
      FLOAT("FLOAT", 6, TDSType.FLOAT8, new TypeInfo.Builder.FixedLenStrategy(SSType.FLOAT, 8, 15, 22, 0)),
      SMALLDATETIME("SMALLDATETIME", 7, TDSType.DATETIME4, new TypeInfo.Builder.FixedLenStrategy(SSType.SMALLDATETIME, 4, "yyyy-mm-dd hh:mm".length(), "yyyy-mm-dd hh:mm".length(), 0)),
      DATETIME("DATETIME", 8, TDSType.DATETIME8, new TypeInfo.Builder.FixedLenStrategy(SSType.DATETIME, 8, "yyyy-mm-dd hh:mm:ss.fff".length(), "yyyy-mm-dd hh:mm:ss.fff".length(), 3)),
      SMALLMONEY("SMALLMONEY", 9, TDSType.MONEY4, new TypeInfo.Builder.FixedLenStrategy(SSType.SMALLMONEY, 4, Integer.toString(Integer.MAX_VALUE).length(), ("-." + Integer.toString(Integer.MAX_VALUE)).length(), 4)),
      MONEY("MONEY", 10, TDSType.MONEY8, new TypeInfo.Builder.FixedLenStrategy(SSType.MONEY, 8, Long.toString(Long.MAX_VALUE).length(), ("-." + Long.toString(Long.MAX_VALUE)).length(), 4)),
      BITN("BITN", 11, TDSType.BITN, new TypeInfo.Builder.Strategy() {
         public void apply(TypeInfo var1, TDSReader var2) throws SQLServerException {
            if(1 != var2.readUnsignedByte()) {
               var2.throwInvalidTDS();
            }

            TypeInfo.Builder.BIT.build(var1, var2);
            var1.ssLenType = SSLenType.BYTELENTYPE;
         }
      }),
      INTN("INTN", 12, TDSType.INTN, new TypeInfo.Builder.Strategy() {
         public void apply(TypeInfo var1, TDSReader var2) throws SQLServerException {
            switch(var2.readUnsignedByte()) {
            case 1:
               TypeInfo.Builder.TINYINT.build(var1, var2);
               break;
            case 2:
               TypeInfo.Builder.SMALLINT.build(var1, var2);
               break;
            case 3:
            case 5:
            case 6:
            case 7:
            default:
               var2.throwInvalidTDS();
               break;
            case 4:
               TypeInfo.Builder.INTEGER.build(var1, var2);
               break;
            case 8:
               TypeInfo.Builder.BIGINT.build(var1, var2);
            }

            var1.ssLenType = SSLenType.BYTELENTYPE;
         }
      }),
      DECIMAL("DECIMAL", 13, TDSType.DECIMALN, new TypeInfo.Builder.DecimalNumericStrategy(SSType.DECIMAL)),
      NUMERIC("NUMERIC", 14, TDSType.NUMERICN, new TypeInfo.Builder.DecimalNumericStrategy(SSType.NUMERIC)),
      FLOATN("FLOATN", 15, TDSType.FLOATN, new TypeInfo.Builder.BigOrSmallByteLenStrategy(FLOAT, REAL)),
      MONEYN("MONEYN", 16, TDSType.MONEYN, new TypeInfo.Builder.BigOrSmallByteLenStrategy(MONEY, SMALLMONEY)),
      DATETIMEN("DATETIMEN", 17, TDSType.DATETIMEN, new TypeInfo.Builder.BigOrSmallByteLenStrategy(DATETIME, SMALLDATETIME)),
      TIME("TIME", 18, TDSType.TIMEN, new TypeInfo.Builder.KatmaiScaledTemporalStrategy(SSType.TIME)),
      DATETIME2("DATETIME2", 19, TDSType.DATETIME2N, new TypeInfo.Builder.KatmaiScaledTemporalStrategy(SSType.DATETIME2)),
      DATETIMEOFFSET("DATETIMEOFFSET", 20, TDSType.DATETIMEOFFSETN, new TypeInfo.Builder.KatmaiScaledTemporalStrategy(SSType.DATETIMEOFFSET)),
      DATE("DATE", 21, TDSType.DATEN, new TypeInfo.Builder.Strategy() {
         public void apply(TypeInfo var1, TDSReader var2) throws SQLServerException {
            var1.ssType = SSType.DATE;
            var1.ssLenType = SSLenType.BYTELENTYPE;
            var1.maxLength = 3;
            var1.displaySize = var1.precision = "yyyy-mm-dd".length();
         }
      }),
      BIGBINARY("BIGBINARY", 22, TDSType.BIGBINARY, new TypeInfo.Builder.Strategy() {
         public void apply(TypeInfo var1, TDSReader var2) throws SQLServerException {
            var1.ssLenType = SSLenType.USHORTLENTYPE;
            var1.maxLength = var2.readUnsignedShort();
            if(var1.maxLength > 8000) {
               var2.throwInvalidTDS();
            }

            var1.precision = var1.maxLength;
            var1.displaySize = 2 * var1.maxLength;
            var1.ssType = 80 == var1.userType?SSType.TIMESTAMP:SSType.BINARY;
         }
      }),
      BIGVARBINARY("BIGVARBINARY", 23, TDSType.BIGVARBINARY, new TypeInfo.Builder.Strategy() {
         public void apply(TypeInfo var1, TDSReader var2) throws SQLServerException {
            var1.maxLength = var2.readUnsignedShort();
            if('\uffff' == var1.maxLength) {
               var1.ssLenType = SSLenType.PARTLENTYPE;
               var1.ssType = SSType.VARBINARYMAX;
               var1.displaySize = var1.precision = Integer.MAX_VALUE;
            } else if(var1.maxLength <= 8000) {
               var1.ssLenType = SSLenType.USHORTLENTYPE;
               var1.ssType = SSType.VARBINARY;
               var1.precision = var1.maxLength;
               var1.displaySize = 2 * var1.maxLength;
            } else {
               var2.throwInvalidTDS();
            }

         }
      }),
      IMAGE("IMAGE", 24, TDSType.IMAGE, new TypeInfo.Builder.Strategy() {
         public void apply(TypeInfo var1, TDSReader var2) throws SQLServerException {
            var1.ssLenType = SSLenType.LONGLENTYPE;
            var1.maxLength = var2.readInt();
            if(var1.maxLength < 0) {
               var2.throwInvalidTDS();
            }

            var1.ssType = SSType.IMAGE;
            var1.displaySize = var1.precision = Integer.MAX_VALUE;
         }
      }),
      BIGCHAR("BIGCHAR", 25, TDSType.BIGCHAR, new TypeInfo.Builder.Strategy() {
         public void apply(TypeInfo var1, TDSReader var2) throws SQLServerException {
            var1.ssLenType = SSLenType.USHORTLENTYPE;
            var1.maxLength = var2.readUnsignedShort();
            if(var1.maxLength > 8000) {
               var2.throwInvalidTDS();
            }

            var1.displaySize = var1.precision = var1.maxLength;
            var1.ssType = SSType.CHAR;
            var1.collation = var2.readCollation();
            var1.charset = var1.collation.getCharset();
         }
      }),
      BIGVARCHAR("BIGVARCHAR", 26, TDSType.BIGVARCHAR, new TypeInfo.Builder.Strategy() {
         public void apply(TypeInfo var1, TDSReader var2) throws SQLServerException {
            var1.maxLength = var2.readUnsignedShort();
            if('\uffff' == var1.maxLength) {
               var1.ssLenType = SSLenType.PARTLENTYPE;
               var1.ssType = SSType.VARCHARMAX;
               var1.displaySize = var1.precision = Integer.MAX_VALUE;
            } else if(var1.maxLength <= 8000) {
               var1.ssLenType = SSLenType.USHORTLENTYPE;
               var1.ssType = SSType.VARCHAR;
               var1.displaySize = var1.precision = var1.maxLength;
            } else {
               var2.throwInvalidTDS();
            }

            var1.collation = var2.readCollation();
            var1.charset = var1.collation.getCharset();
         }
      }),
      TEXT("TEXT", 27, TDSType.TEXT, new TypeInfo.Builder.Strategy() {
         public void apply(TypeInfo var1, TDSReader var2) throws SQLServerException {
            var1.ssLenType = SSLenType.LONGLENTYPE;
            var1.maxLength = var2.readInt();
            if(var1.maxLength < 0) {
               var2.throwInvalidTDS();
            }

            var1.ssType = SSType.TEXT;
            var1.displaySize = var1.precision = Integer.MAX_VALUE;
            var1.collation = var2.readCollation();
            var1.charset = var1.collation.getCharset();
         }
      }),
      NCHAR("NCHAR", 28, TDSType.NCHAR, new TypeInfo.Builder.Strategy() {
         public void apply(TypeInfo var1, TDSReader var2) throws SQLServerException {
            var1.ssLenType = SSLenType.USHORTLENTYPE;
            var1.maxLength = var2.readUnsignedShort();
            if(var1.maxLength > 8000 || 0 != var1.maxLength % 2) {
               var2.throwInvalidTDS();
            }

            var1.displaySize = var1.precision = var1.maxLength / 2;
            var1.ssType = SSType.NCHAR;
            var1.collation = var2.readCollation();
            var1.charset = Encoding.UNICODE.charsetName();
         }
      }),
      NVARCHAR("NVARCHAR", 29, TDSType.NVARCHAR, new TypeInfo.Builder.Strategy() {
         public void apply(TypeInfo var1, TDSReader var2) throws SQLServerException {
            var1.maxLength = var2.readUnsignedShort();
            if('\uffff' == var1.maxLength) {
               var1.ssLenType = SSLenType.PARTLENTYPE;
               var1.ssType = SSType.NVARCHARMAX;
               var1.displaySize = var1.precision = 1073741823;
            } else if(var1.maxLength <= 8000 && 0 == var1.maxLength % 2) {
               var1.ssLenType = SSLenType.USHORTLENTYPE;
               var1.ssType = SSType.NVARCHAR;
               var1.displaySize = var1.precision = var1.maxLength / 2;
            } else {
               var2.throwInvalidTDS();
            }

            var1.collation = var2.readCollation();
            var1.charset = Encoding.UNICODE.charsetName();
         }
      }),
      NTEXT("NTEXT", 30, TDSType.NTEXT, new TypeInfo.Builder.Strategy() {
         public void apply(TypeInfo var1, TDSReader var2) throws SQLServerException {
            var1.ssLenType = SSLenType.LONGLENTYPE;
            var1.maxLength = var2.readInt();
            if(var1.maxLength < 0) {
               var2.throwInvalidTDS();
            }

            var1.ssType = SSType.NTEXT;
            var1.displaySize = var1.precision = 1073741823;
            var1.collation = var2.readCollation();
            var1.charset = Encoding.UNICODE.charsetName();
         }
      }),
      GUID("GUID", 31, TDSType.GUID, new TypeInfo.Builder.Strategy() {
         public void apply(TypeInfo var1, TDSReader var2) throws SQLServerException {
            int var3 = var2.readUnsignedByte();
            if(var3 != 16 && var3 != 0) {
               var2.throwInvalidTDS();
            }

            var1.ssLenType = SSLenType.BYTELENTYPE;
            var1.ssType = SSType.GUID;
            var1.maxLength = var3;
            var1.displaySize = var1.precision = "NNNNNNNN-NNNN-NNNN-NNNN-NNNNNNNNNNNN".length();
         }
      }),
      UDT("UDT", 32, TDSType.UDT, new TypeInfo.Builder.Strategy() {
         public void apply(TypeInfo var1, TDSReader var2) throws SQLServerException {
            UDTTDSHeader var3 = new UDTTDSHeader(var2);
            var1.maxLength = var3.getMaxLen();
            if('\uffff' == var1.maxLength) {
               var1.precision = Integer.MAX_VALUE;
               var1.displaySize = Integer.MAX_VALUE;
            } else if(var1.maxLength <= 8000) {
               var1.precision = var1.maxLength;
               var1.displaySize = 2 * var1.maxLength;
            } else {
               var2.throwInvalidTDS();
            }

            var1.ssLenType = SSLenType.PARTLENTYPE;
            var1.ssType = SSType.UDT;
            var1.udtTypeName = var3.getTypeName();
         }
      }),
      XML("XML", 33, TDSType.XML, new TypeInfo.Builder.Strategy() {
         public void apply(TypeInfo var1, TDSReader var2) throws SQLServerException {
            new XMLTDSHeader(var2);
            var1.ssLenType = SSLenType.PARTLENTYPE;
            var1.ssType = SSType.XML;
            var1.displaySize = var1.precision = 1073741823;
            var1.charset = Encoding.UNICODE.charsetName();
         }
      }),
      SQL_VARIANT("SQL_VARIANT", 34, TDSType.SQL_VARIANT, new TypeInfo.Builder.Strategy() {
         public void apply(TypeInfo var1, TDSReader var2) throws SQLServerException {
            SQLServerException.makeFromDriverError(var2.getConnection(), (Object)null, SQLServerException.getErrString("R_variantNotSupported"), "08006", false);
         }
      });
      private final TDSType tdsType;
      private final TypeInfo.Builder.Strategy strategy;
      // $FF: synthetic field
      private static final TypeInfo.Builder[] $VALUES = new TypeInfo.Builder[]{BIT, BIGINT, INTEGER, SMALLINT, TINYINT, REAL, FLOAT, SMALLDATETIME, DATETIME, SMALLMONEY, MONEY, BITN, INTN, DECIMAL, NUMERIC, FLOATN, MONEYN, DATETIMEN, TIME, DATETIME2, DATETIMEOFFSET, DATE, BIGBINARY, BIGVARBINARY, IMAGE, BIGCHAR, BIGVARCHAR, TEXT, NCHAR, NVARCHAR, NTEXT, GUID, UDT, XML, SQL_VARIANT};
      // $FF: synthetic field
      static final boolean $assertionsDisabled = !TypeInfo.class.desiredAssertionStatus();


      private Builder(String var1, int var2, TDSType var3, TypeInfo.Builder.Strategy var4) {
         this.tdsType = var3;
         this.strategy = var4;
      }

      final TDSType getTDSType() {
         return this.tdsType;
      }

      final TypeInfo build(TypeInfo var1, TDSReader var2) throws SQLServerException {
         this.strategy.apply(var1, var2);
         if(!$assertionsDisabled && null == var1.ssType) {
            throw new AssertionError();
         } else if(!$assertionsDisabled && null == var1.ssLenType) {
            throw new AssertionError();
         } else {
            return var1;
         }
      }


      private static final class BigOrSmallByteLenStrategy implements TypeInfo.Builder.Strategy {

         private final TypeInfo.Builder bigBuilder;
         private final TypeInfo.Builder smallBuilder;


         BigOrSmallByteLenStrategy(TypeInfo.Builder var1, TypeInfo.Builder var2) {
            this.bigBuilder = var1;
            this.smallBuilder = var2;
         }

         public void apply(TypeInfo var1, TDSReader var2) throws SQLServerException {
            switch(var2.readUnsignedByte()) {
            case 4:
               this.smallBuilder.build(var1, var2);
               break;
            case 8:
               this.bigBuilder.build(var1, var2);
               break;
            default:
               var2.throwInvalidTDS();
            }

            var1.ssLenType = SSLenType.BYTELENTYPE;
         }
      }

      private static final class FixedLenStrategy implements TypeInfo.Builder.Strategy {

         private final SSType ssType;
         private final int maxLength;
         private final int precision;
         private final int displaySize;
         private final int scale;


         FixedLenStrategy(SSType var1, int var2, int var3, int var4, int var5) {
            this.ssType = var1;
            this.maxLength = var2;
            this.precision = var3;
            this.displaySize = var4;
            this.scale = var5;
         }

         public void apply(TypeInfo var1, TDSReader var2) {
            var1.ssLenType = SSLenType.FIXEDLENTYPE;
            var1.ssType = this.ssType;
            var1.maxLength = this.maxLength;
            var1.precision = this.precision;
            var1.displaySize = this.displaySize;
            var1.scale = this.scale;
         }
      }

      private static final class DecimalNumericStrategy implements TypeInfo.Builder.Strategy {

         private final SSType ssType;


         DecimalNumericStrategy(SSType var1) {
            this.ssType = var1;
         }

         public void apply(TypeInfo var1, TDSReader var2) throws SQLServerException {
            int var3 = var2.readUnsignedByte();
            int var4 = var2.readUnsignedByte();
            int var5 = var2.readUnsignedByte();
            if(var3 > 17) {
               var2.throwInvalidTDS();
            }

            var1.ssLenType = SSLenType.BYTELENTYPE;
            var1.ssType = this.ssType;
            var1.maxLength = var3;
            var1.precision = var4;
            var1.displaySize = var4 + 2;
            var1.scale = var5;
         }
      }

      private static final class KatmaiScaledTemporalStrategy implements TypeInfo.Builder.Strategy {

         private final SSType ssType;
         // $FF: synthetic field
         static final boolean $assertionsDisabled = !TypeInfo.class.desiredAssertionStatus();


         KatmaiScaledTemporalStrategy(SSType var1) {
            this.ssType = var1;
         }

         private int getPrecision(String var1, int var2) {
            return var1.length() + (var2 > 0?1 + var2:0);
         }

         public void apply(TypeInfo var1, TDSReader var2) throws SQLServerException {
            var1.scale = var2.readUnsignedByte();
            if(var1.scale > 7) {
               var2.throwInvalidTDS();
            }

            switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$SSType[this.ssType.ordinal()]) {
            case 1:
               var1.precision = this.getPrecision("hh:mm:ss", var1.scale);
               var1.maxLength = TDS.timeValueLength(var1.scale);
               break;
            case 2:
               var1.precision = this.getPrecision("yyyy-mm-dd hh:mm:ss", var1.scale);
               var1.maxLength = TDS.datetime2ValueLength(var1.scale);
               break;
            case 3:
               var1.precision = this.getPrecision("yyyy-mm-dd hh:mm:ss +HH:MM", var1.scale);
               var1.maxLength = TDS.datetimeoffsetValueLength(var1.scale);
               break;
            default:
               if(!$assertionsDisabled) {
                  throw new AssertionError("Unexpected SSType: " + this.ssType);
               }
            }

            var1.ssLenType = SSLenType.BYTELENTYPE;
            var1.ssType = this.ssType;
            var1.displaySize = var1.precision;
         }

      }

      private interface Strategy {

         void apply(TypeInfo var1, TDSReader var2) throws SQLServerException;
      }
   }
}

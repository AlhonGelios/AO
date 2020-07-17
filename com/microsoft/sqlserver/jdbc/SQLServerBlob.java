package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.BaseInputStream;
import com.microsoft.sqlserver.jdbc.DataTypes;
import com.microsoft.sqlserver.jdbc.DriverJDBCVersion;
import com.microsoft.sqlserver.jdbc.JDBCType;
import com.microsoft.sqlserver.jdbc.SQLServerBlobOutputStream;
import com.microsoft.sqlserver.jdbc.SQLServerConnection;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.sql.Blob;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class SQLServerBlob implements Blob, Serializable {

   private byte[] value;
   private SQLServerConnection con;
   private boolean isClosed = false;
   ArrayList activeStreams = new ArrayList(1);
   private static final Logger logger = Logger.getLogger("com.microsoft.sqlserver.jdbc.internals.SQLServerBlob");
   private static int baseID = 0;
   private final String traceID = " SQLServerBlob:" + nextInstanceID();


   public final String toString() {
      return this.traceID;
   }

   private static synchronized int nextInstanceID() {
      ++baseID;
      return baseID;
   }

   @Deprecated
   public SQLServerBlob(SQLServerConnection var1, byte[] var2) {
      this.con = var1;
      if(null == var2) {
         throw new NullPointerException(SQLServerException.getErrString("R_cantSetNull"));
      } else {
         this.value = var2;
         if(logger.isLoggable(Level.FINE)) {
            String var3 = null != var1?var1.toString():"null connection";
            logger.fine(this.toString() + " created by (" + var3 + ")");
         }

      }
   }

   SQLServerBlob(SQLServerConnection var1) {
      this.con = var1;
      this.value = new byte[0];
      if(logger.isLoggable(Level.FINE)) {
         logger.fine(this.toString() + " created by (" + var1.toString() + ")");
      }

   }

   SQLServerBlob(BaseInputStream var1) throws SQLServerException {
      this.value = var1.getBytes();
      if(logger.isLoggable(Level.FINE)) {
         logger.fine(this.toString() + " created by (null connection)");
      }

   }

   public void free() throws SQLException {
      DriverJDBCVersion.checkSupportsJDBC4();
      if(!this.isClosed) {
         if(null != this.activeStreams) {
            Iterator var1 = this.activeStreams.iterator();

            while(var1.hasNext()) {
               Closeable var2 = (Closeable)var1.next();

               try {
                  var2.close();
               } catch (IOException var4) {
                  logger.fine(this.toString() + " ignored IOException closing stream " + var2 + ": " + var4.getMessage());
               }
            }

            this.activeStreams = null;
         }

         this.value = null;
         this.isClosed = true;
      }

   }

   private final void checkClosed() throws SQLServerException {
      if(this.isClosed) {
         MessageFormat var1 = new MessageFormat(SQLServerException.getErrString("R_isFreed"));
         SQLServerException.makeFromDriverError(this.con, (Object)null, var1.format(new Object[]{"Blob"}), (String)null, true);
      }

   }

   public InputStream getBinaryStream() throws SQLException {
      this.checkClosed();
      return this.getBinaryStreamInternal(0, this.value.length);
   }

   public InputStream getBinaryStream(long var1, long var3) throws SQLException {
      DriverJDBCVersion.checkSupportsJDBC4();
      throw new SQLFeatureNotSupportedException(SQLServerException.getErrString("R_notSupported"));
   }

   private InputStream getBinaryStreamInternal(int var1, int var2) {
      assert null != this.value;

      assert var1 >= 0;

      assert 0 <= var2 && var2 <= this.value.length - var1;

      assert null != this.activeStreams;

      ByteArrayInputStream var3 = new ByteArrayInputStream(this.value, var1, var2);
      this.activeStreams.add(var3);
      return var3;
   }

   public byte[] getBytes(long var1, int var3) throws SQLException {
      this.checkClosed();
      MessageFormat var4;
      Object[] var5;
      if(var1 < 1L) {
         var4 = new MessageFormat(SQLServerException.getErrString("R_invalidPositionIndex"));
         var5 = new Object[]{new Long(var1)};
         SQLServerException.makeFromDriverError(this.con, (Object)null, var4.format(var5), (String)null, true);
      }

      if(var3 < 0) {
         var4 = new MessageFormat(SQLServerException.getErrString("R_invalidLength"));
         var5 = new Object[]{new Integer(var3)};
         SQLServerException.makeFromDriverError(this.con, (Object)null, var4.format(var5), (String)null, true);
      }

      --var1;
      if(var1 > (long)this.value.length) {
         var1 = (long)this.value.length;
      }

      if((long)var3 > (long)this.value.length - var1) {
         var3 = (int)((long)this.value.length - var1);
      }

      byte[] var6 = new byte[var3];
      System.arraycopy(this.value, (int)var1, var6, 0, var3);
      return var6;
   }

   public long length() throws SQLException {
      this.checkClosed();
      return (long)this.value.length;
   }

   public long position(Blob var1, long var2) throws SQLException {
      this.checkClosed();
      if(var2 < 1L) {
         MessageFormat var4 = new MessageFormat(SQLServerException.getErrString("R_invalidPositionIndex"));
         Object[] var5 = new Object[]{new Long(var2)};
         SQLServerException.makeFromDriverError(this.con, (Object)null, var4.format(var5), (String)null, true);
      }

      return null == var1?-1L:this.position(var1.getBytes(1L, (int)var1.length()), var2);
   }

   public long position(byte[] var1, long var2) throws SQLException {
      this.checkClosed();
      if(var2 < 1L) {
         MessageFormat var4 = new MessageFormat(SQLServerException.getErrString("R_invalidPositionIndex"));
         Object[] var5 = new Object[]{new Long(var2)};
         SQLServerException.makeFromDriverError(this.con, (Object)null, var4.format(var5), (String)null, true);
      }

      if(null == var1) {
         return -1L;
      } else {
         --var2;
         int var7 = (int)var2;

         while(var7 <= this.value.length - var1.length) {
            boolean var8 = true;
            int var6 = 0;

            while(true) {
               if(var6 < var1.length) {
                  if(this.value[var7 + var6] == var1[var6]) {
                     ++var6;
                     continue;
                  }

                  var8 = false;
               }

               if(var8) {
                  return (long)(var7 + 1);
               }

               ++var7;
               break;
            }
         }

         return -1L;
      }
   }

   public void truncate(long var1) throws SQLException {
      this.checkClosed();
      if(var1 < 0L) {
         MessageFormat var3 = new MessageFormat(SQLServerException.getErrString("R_invalidLength"));
         Object[] var4 = new Object[]{new Long(var1)};
         SQLServerException.makeFromDriverError(this.con, (Object)null, var3.format(var4), (String)null, true);
      }

      if((long)this.value.length > var1) {
         byte[] var5 = new byte[(int)var1];
         System.arraycopy(this.value, 0, var5, 0, (int)var1);
         this.value = var5;
      }

   }

   public OutputStream setBinaryStream(long var1) throws SQLException {
      this.checkClosed();
      if(var1 < 1L) {
         MessageFormat var3 = new MessageFormat(SQLServerException.getErrString("R_invalidPositionIndex"));
         SQLServerException.makeFromDriverError(this.con, (Object)null, var3.format(new Object[]{Long.valueOf(var1)}), (String)null, true);
      }

      return new SQLServerBlobOutputStream(this, var1);
   }

   public int setBytes(long var1, byte[] var3) throws SQLException {
      this.checkClosed();
      if(null == var3) {
         SQLServerException.makeFromDriverError(this.con, (Object)null, SQLServerException.getErrString("R_cantSetNull"), (String)null, true);
      }

      return this.setBytes(var1, var3, 0, var3.length);
   }

   public int setBytes(long var1, byte[] var3, int var4, int var5) throws SQLException {
      this.checkClosed();
      if(null == var3) {
         SQLServerException.makeFromDriverError(this.con, (Object)null, SQLServerException.getErrString("R_cantSetNull"), (String)null, true);
      }

      MessageFormat var6;
      Object[] var7;
      if(var4 < 0 || var4 > var3.length) {
         var6 = new MessageFormat(SQLServerException.getErrString("R_invalidOffset"));
         var7 = new Object[]{new Integer(var4)};
         SQLServerException.makeFromDriverError(this.con, (Object)null, var6.format(var7), (String)null, true);
      }

      if(var5 < 0 || var5 > var3.length - var4) {
         var6 = new MessageFormat(SQLServerException.getErrString("R_invalidLength"));
         var7 = new Object[]{new Integer(var5)};
         SQLServerException.makeFromDriverError(this.con, (Object)null, var6.format(var7), (String)null, true);
      }

      if(var1 <= 0L || var1 > (long)(this.value.length + 1)) {
         var6 = new MessageFormat(SQLServerException.getErrString("R_invalidPositionIndex"));
         var7 = new Object[]{new Long(var1)};
         SQLServerException.makeFromDriverError(this.con, (Object)null, var6.format(var7), (String)null, true);
      }

      --var1;
      if((long)var5 >= (long)this.value.length - var1) {
         DataTypes.getCheckedLength(this.con, JDBCType.BLOB, var1 + (long)var5, false);

         assert var1 + (long)var5 <= 2147483647L;

         byte[] var8 = new byte[(int)var1 + var5];
         System.arraycopy(this.value, 0, var8, 0, (int)var1);
         System.arraycopy(var3, var4, var8, (int)var1, var5);
         this.value = var8;
      } else {
         System.arraycopy(var3, var4, this.value, (int)var1, var5);
      }

      return var5;
   }

}

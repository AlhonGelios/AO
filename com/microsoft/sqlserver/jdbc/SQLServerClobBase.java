package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.DataTypes;
import com.microsoft.sqlserver.jdbc.DriverJDBCVersion;
import com.microsoft.sqlserver.jdbc.JDBCType;
import com.microsoft.sqlserver.jdbc.ReaderInputStream;
import com.microsoft.sqlserver.jdbc.SQLCollation;
import com.microsoft.sqlserver.jdbc.SQLServerClobAsciiOutputStream;
import com.microsoft.sqlserver.jdbc.SQLServerClobWriter;
import com.microsoft.sqlserver.jdbc.SQLServerConnection;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.sql.Clob;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

abstract class SQLServerClobBase implements Serializable {

   private String value;
   private final SQLCollation sqlCollation;
   private boolean isClosed = false;
   private ArrayList activeStreams = new ArrayList(1);
   SQLServerConnection con;
   private final Logger logger;
   private final String traceID = this.getClass().getName().substring(1 + this.getClass().getName().lastIndexOf(46)) + ":" + nextInstanceID();
   private static int baseID = 0;


   public final String toString() {
      return this.traceID;
   }

   private static synchronized int nextInstanceID() {
      ++baseID;
      return baseID;
   }

   abstract JDBCType getJdbcType();

   private String getDisplayClassName() {
      String var1 = this.getJdbcType().className();
      return var1.substring(1 + var1.lastIndexOf(46));
   }

   SQLServerClobBase(SQLServerConnection var1, String var2, SQLCollation var3, Logger var4) {
      this.con = var1;
      this.value = var2;
      this.sqlCollation = var3;
      this.logger = var4;
      if(var4.isLoggable(Level.FINE)) {
         String var5 = null != var1?var1.toString():"null connection";
         var4.fine(this.toString() + " created by (" + var5 + ")");
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
                  this.logger.fine(this.toString() + " ignored IOException closing stream " + var2 + ": " + var4.getMessage());
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
         SQLServerException.makeFromDriverError(this.con, (Object)null, var1.format(new Object[]{this.getDisplayClassName()}), (String)null, true);
      }

   }

   public InputStream getAsciiStream() throws SQLException {
      this.checkClosed();
      if(null != this.sqlCollation && !this.sqlCollation.supportsAsciiConversion()) {
         DataTypes.throwConversionError(this.getDisplayClassName(), "AsciiStream");
      }

      BufferedInputStream var1;
      try {
         var1 = new BufferedInputStream(new ReaderInputStream(new StringReader(this.value), "US-ASCII", (long)this.value.length()));
      } catch (UnsupportedEncodingException var3) {
         throw new SQLServerException(var3.getMessage(), (String)null, 0, var3);
      }

      this.activeStreams.add(var1);
      return var1;
   }

   public Reader getCharacterStream() throws SQLException {
      this.checkClosed();
      StringReader var1 = new StringReader(this.value);
      this.activeStreams.add(var1);
      return var1;
   }

   public Reader getCharacterStream(long var1, long var3) throws SQLException {
      DriverJDBCVersion.checkSupportsJDBC4();
      throw new SQLFeatureNotSupportedException(SQLServerException.getErrString("R_notSupported"));
   }

   public String getSubString(long var1, int var3) throws SQLException {
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
      if(var1 > (long)this.value.length()) {
         var1 = (long)this.value.length();
      }

      if((long)var3 > (long)this.value.length() - var1) {
         var3 = (int)((long)this.value.length() - var1);
      }

      return this.value.substring((int)var1, (int)var1 + var3);
   }

   public long length() throws SQLException {
      this.checkClosed();
      return (long)this.value.length();
   }

   public long position(Clob var1, long var2) throws SQLException {
      this.checkClosed();
      if(var2 < 1L) {
         MessageFormat var4 = new MessageFormat(SQLServerException.getErrString("R_invalidPositionIndex"));
         Object[] var5 = new Object[]{new Long(var2)};
         SQLServerException.makeFromDriverError(this.con, (Object)null, var4.format(var5), (String)null, true);
      }

      return null == var1?-1L:this.position(var1.getSubString(1L, (int)var1.length()), var2);
   }

   public long position(String var1, long var2) throws SQLException {
      this.checkClosed();
      if(var2 < 1L) {
         MessageFormat var4 = new MessageFormat(SQLServerException.getErrString("R_invalidPositionIndex"));
         Object[] var5 = new Object[]{new Long(var2)};
         SQLServerException.makeFromDriverError(this.con, (Object)null, var4.format(var5), (String)null, true);
      }

      if(null == var1) {
         return -1L;
      } else {
         int var6 = this.value.indexOf(var1, (int)(var2 - 1L));
         return -1 != var6?(long)(var6 + 1):-1L;
      }
   }

   public void truncate(long var1) throws SQLException {
      this.checkClosed();
      if(var1 < 0L) {
         MessageFormat var3 = new MessageFormat(SQLServerException.getErrString("R_invalidLength"));
         Object[] var4 = new Object[]{new Long(var1)};
         SQLServerException.makeFromDriverError(this.con, (Object)null, var3.format(var4), (String)null, true);
      }

      if(var1 <= 2147483647L && (long)this.value.length() > var1) {
         this.value = this.value.substring(0, (int)var1);
      }

   }

   public OutputStream setAsciiStream(long var1) throws SQLException {
      this.checkClosed();
      if(var1 < 1L) {
         MessageFormat var3 = new MessageFormat(SQLServerException.getErrString("R_invalidPositionIndex"));
         Object[] var4 = new Object[]{new Long(var1)};
         SQLServerException.makeFromDriverError(this.con, (Object)null, var3.format(var4), (String)null, true);
      }

      return new SQLServerClobAsciiOutputStream(this, var1);
   }

   public Writer setCharacterStream(long var1) throws SQLException {
      this.checkClosed();
      if(var1 < 1L) {
         MessageFormat var3 = new MessageFormat(SQLServerException.getErrString("R_invalidPositionIndex"));
         Object[] var4 = new Object[]{new Long(var1)};
         SQLServerException.makeFromDriverError(this.con, (Object)null, var3.format(var4), (String)null, true);
      }

      return new SQLServerClobWriter(this, var1);
   }

   public int setString(long var1, String var3) throws SQLException {
      this.checkClosed();
      if(null == var3) {
         SQLServerException.makeFromDriverError(this.con, (Object)null, SQLServerException.getErrString("R_cantSetNull"), (String)null, true);
      }

      return this.setString(var1, var3, 0, var3.length());
   }

   public int setString(long var1, String var3, int var4, int var5) throws SQLException {
      this.checkClosed();
      if(null == var3) {
         SQLServerException.makeFromDriverError(this.con, (Object)null, SQLServerException.getErrString("R_cantSetNull"), (String)null, true);
      }

      MessageFormat var6;
      Object[] var7;
      if(var4 < 0 || var4 > var3.length()) {
         var6 = new MessageFormat(SQLServerException.getErrString("R_invalidOffset"));
         var7 = new Object[]{new Integer(var4)};
         SQLServerException.makeFromDriverError(this.con, (Object)null, var6.format(var7), (String)null, true);
      }

      if(var5 < 0 || var5 > var3.length() - var4) {
         var6 = new MessageFormat(SQLServerException.getErrString("R_invalidLength"));
         var7 = new Object[]{new Integer(var5)};
         SQLServerException.makeFromDriverError(this.con, (Object)null, var6.format(var7), (String)null, true);
      }

      if(var1 < 1L || var1 > (long)(this.value.length() + 1)) {
         var6 = new MessageFormat(SQLServerException.getErrString("R_invalidPositionIndex"));
         var7 = new Object[]{new Long(var1)};
         SQLServerException.makeFromDriverError(this.con, (Object)null, var6.format(var7), (String)null, true);
      }

      --var1;
      StringBuilder var8;
      if((long)var5 >= (long)this.value.length() - var1) {
         DataTypes.getCheckedLength(this.con, this.getJdbcType(), var1 + (long)var5, false);

         assert var1 + (long)var5 <= 2147483647L;

         var8 = new StringBuilder((int)var1 + var5);
         var8.append(this.value.substring(0, (int)var1));
         var8.append(var3.substring(var4, var4 + var5));
         this.value = var8.toString();
      } else {
         var8 = new StringBuilder(this.value.length());
         var8.append(this.value.substring(0, (int)var1));
         var8.append(var3.substring(var4, var4 + var5));
         var8.append(this.value.substring((int)var1 + var5));
         this.value = var8.toString();
      }

      return var5;
   }

}

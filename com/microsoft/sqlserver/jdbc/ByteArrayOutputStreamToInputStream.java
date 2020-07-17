package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

final class ByteArrayOutputStreamToInputStream extends ByteArrayOutputStream {

   ByteArrayInputStream getInputStream() throws SQLServerException {
      ByteArrayInputStream var1 = new ByteArrayInputStream(this.buf, 0, this.count);
      return var1;
   }
}

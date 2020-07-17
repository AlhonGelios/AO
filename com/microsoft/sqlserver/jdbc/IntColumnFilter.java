package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.ColumnFilter;
import com.microsoft.sqlserver.jdbc.DataTypes;
import com.microsoft.sqlserver.jdbc.JDBCType;
import com.microsoft.sqlserver.jdbc.SQLServerException;

abstract class IntColumnFilter extends ColumnFilter {

   abstract int oneValueToAnother(int var1);

   final Object apply(Object var1, JDBCType var2) throws SQLServerException {
      if(var1 == null) {
         return var1;
      } else {
         switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$JDBCType[var2.ordinal()]) {
         case 1:
            return new Integer(this.oneValueToAnother(((Integer)var1).intValue()));
         case 2:
         case 3:
            return new Short((short)this.oneValueToAnother(((Short)var1).intValue()));
         case 4:
            return new Long((long)this.oneValueToAnother(((Long)var1).intValue()));
         case 5:
         case 6:
         case 7:
            return Integer.toString(this.oneValueToAnother(Integer.parseInt((String)var1)));
         default:
            DataTypes.throwConversionError("int", var2.toString());
            return var1;
         }
      }
   }
}

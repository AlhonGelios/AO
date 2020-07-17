package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.ColumnFilter;
import com.microsoft.sqlserver.jdbc.DataTypes;
import com.microsoft.sqlserver.jdbc.JDBCType;
import com.microsoft.sqlserver.jdbc.SQLServerException;

class IntColumnIdentityFilter extends ColumnFilter {

   private static final String zeroOneToYesNo(int var0) {
      return 0 == var0?"NO":"YES";
   }

   final Object apply(Object var1, JDBCType var2) throws SQLServerException {
      if(var1 == null) {
         return var1;
      } else {
         switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$JDBCType[var2.ordinal()]) {
         case 1:
         case 2:
            assert var1 instanceof Number;

            return zeroOneToYesNo(((Number)var1).intValue());
         case 3:
         case 4:
         case 5:
            assert var1 instanceof String;

            return zeroOneToYesNo(Integer.parseInt((String)var1));
         default:
            DataTypes.throwConversionError("char", var2.toString());
            return var1;
         }
      }
   }

}

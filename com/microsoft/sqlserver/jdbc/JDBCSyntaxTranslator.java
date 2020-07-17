package com.microsoft.sqlserver.jdbc;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class JDBCSyntaxTranslator {

   private String procedureName = null;
   private boolean hasReturnValueSyntax = false;
   private static final String sqlIdentifierPart = "(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))";
   private static final String sqlIdentifierWithoutGroups = "((?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))(?:\\.(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))){0,3}?)";
   private static final String sqlIdentifierWithGroups = "((?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?)))(?:\\.((?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))))?";
   private static final Pattern jdbcCallSyntax = Pattern.compile("(?s)\\s*?\\{\\s*?(\\?\\s*?=)?\\s*?[cC][aA][lL][lL]\\s+?((?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))(?:\\.(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))){0,3}?)(?:\\s*?\\((.*)\\))?\\s*\\}.*+");
   private static final Pattern sqlExecSyntax = Pattern.compile("\\s*?[eE][xX][eE][cC](?:[uU][tT][eE])??\\s+?(((?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))(?:\\.(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))){0,3}?)\\s*?=\\s+?)??((?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))(?:\\.(?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))){0,3}?)(?:$|(?:\\s+?.*+))");
   private static final Pattern limitSyntaxWithOffset = Pattern.compile("\\{\\s*[lL][iI][mM][iI][tT]\\s+(.*)\\s+[oO][fF][fF][sS][eE][tT]\\s+(.*)\\}");
   private static final Pattern limitSyntaxGeneric = Pattern.compile("\\{\\s*[lL][iI][mM][iI][tT]\\s+(.*)(\\s+[oO][fF][fF][sS][eE][tT](.*)\\}|\\s*\\})");
   private static final Pattern selectPattern = Pattern.compile("([sS][eE][lL][eE][cC][tT])\\s+");
   private static final Pattern openQueryPattern = Pattern.compile("[oO][pP][eE][nN][qQ][uU][eE][rR][yY]\\s*\\(.*,\\s*\'(.*)\'\\s*\\)");
   private static final Pattern openRowsetPattern = Pattern.compile("[oO][pP][eE][nN][rR][oO][wW][sS][eE][tT]\\s*\\(.*,.*,\\s*\'(.*)\'\\s*\\)");
   private static final Pattern limitOnlyPattern = Pattern.compile("\\{\\s*[lL][iI][mM][iI][tT]\\s+(((\\(|\\s)*)(\\d*|\\?)((\\)|\\s)*))\\s*\\}");


   String getProcedureName() {
      return this.procedureName;
   }

   boolean hasReturnValueSyntax() {
      return this.hasReturnValueSyntax;
   }

   static String getSQLIdentifierWithGroups() {
      return "((?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?)))(?:\\.((?:(?:\\[(?:[^\\]]|(?:\\]\\]))+?\\])|(?:\"(?:[^\"]|(?:\"\"))+?\")|(?:\\S+?))))?";
   }

   int translateLimit(StringBuffer var1, int var2, char var3) throws SQLServerException {
      Matcher var4 = selectPattern.matcher(var1);
      Matcher var5 = openQueryPattern.matcher(var1);
      Matcher var6 = openRowsetPattern.matcher(var1);
      Matcher var7 = limitOnlyPattern.matcher(var1);
      Matcher var8 = limitSyntaxWithOffset.matcher(var1);
      int var9 = var2;
      Stack var10 = new Stack();
      JDBCSyntaxTranslator.State var11 = JDBCSyntaxTranslator.State.START;

      while(var2 < var1.length()) {
         char var12 = var1.charAt(var2);
         switch(null.$SwitchMap$com$microsoft$sqlserver$jdbc$JDBCSyntaxTranslator$State[var11.ordinal()]) {
         case 1:
            var11 = JDBCSyntaxTranslator.State.PROCESS;
            break;
         case 2:
            if(var3 == var12) {
               var11 = JDBCSyntaxTranslator.State.END;
            } else if(39 == var12) {
               var11 = JDBCSyntaxTranslator.State.QUOTE;
            } else if(40 == var12) {
               var11 = JDBCSyntaxTranslator.State.SUBQUERY;
            } else if(var7.find(var2) && var2 == var7.start()) {
               var11 = JDBCSyntaxTranslator.State.LIMIT;
            } else if(var8.find(var2) && var2 == var8.start()) {
               var11 = JDBCSyntaxTranslator.State.OFFSET;
            } else if(var5.find(var2) && var2 == var5.start()) {
               var11 = JDBCSyntaxTranslator.State.OPENQUERY;
            } else if(var6.find(var2) && var2 == var6.start()) {
               var11 = JDBCSyntaxTranslator.State.OPENROWSET;
            } else {
               if(var4.find(var2) && var2 == var4.start()) {
                  var11 = JDBCSyntaxTranslator.State.SELECT;
                  continue;
               }

               ++var2;
            }
            break;
         case 3:
            throw new SQLServerException(SQLServerException.getErrString("R_limitOffsetNotSupported"), (String)null, 0, (Throwable)null);
         case 4:
            int var13 = 0;
            int var14 = 0;
            int var15 = -1;
            String var16 = var7.group(2);

            String var17;
            for(var17 = var7.group(5); -1 != (var15 = var16.indexOf(40, var15 + 1)); ++var13) {
               ;
            }

            for(var15 = -1; -1 != (var15 = var17.indexOf(41, var15 + 1)); ++var14) {
               ;
            }

            if(var13 != var14) {
               throw new SQLServerException(SQLServerException.getErrString("R_limitEscapeSyntaxError"), (String)null, 0, (Throwable)null);
            }

            if(!var10.empty()) {
               Integer var18 = (Integer)var10.pop();
               String var19 = var7.group(1);
               var1.delete(var7.start() - 1, var7.end());
               if(63 == var19.charAt(0)) {
                  var1.insert(var18.intValue(), " TOP (" + var19 + ")");
                  var2 += 7 + var19.length() - 1;
               } else {
                  var1.insert(var18.intValue(), " TOP " + var19);
                  var2 += 5 + var19.length() - 1;
               }
            } else {
               var2 = var7.end() - 1;
            }

            var11 = JDBCSyntaxTranslator.State.PROCESS;
            break;
         case 5:
            var2 = var4.end(1);
            var10.push(Integer.valueOf(var2));
            var11 = JDBCSyntaxTranslator.State.PROCESS;
            break;
         case 6:
            ++var2;
            if(var1.length() > var2 && 39 == var1.charAt(var2)) {
               ++var2;
               if(var1.length() > var2 && 39 == var1.charAt(var2)) {
                  var11 = JDBCSyntaxTranslator.State.QUOTE;
                  break;
               }

               var11 = JDBCSyntaxTranslator.State.PROCESS;
               break;
            }

            var11 = JDBCSyntaxTranslator.State.QUOTE;
            break;
         case 7:
            ++var2;
            var2 += this.translateLimit(var1, var2, ')');
            var11 = JDBCSyntaxTranslator.State.PROCESS;
            break;
         case 8:
            var2 = var5.start(1);
            var2 += this.translateLimit(var1, var2, '\'');
            var11 = JDBCSyntaxTranslator.State.PROCESS;
            break;
         case 9:
            var2 = var6.start(1);
            var2 += this.translateLimit(var1, var2, '\'');
            var11 = JDBCSyntaxTranslator.State.PROCESS;
            break;
         case 10:
            ++var2;
            return var2 - var9;
         }
      }

      return var2 - var9;
   }

   String translate(String var1) throws SQLServerException {
      Matcher var2 = jdbcCallSyntax.matcher(var1);
      if(var2.matches()) {
         this.hasReturnValueSyntax = null != var2.group(1);
         this.procedureName = var2.group(2);
         String var3 = var2.group(3);
         var1 = "EXEC " + (this.hasReturnValueSyntax?"? = ":"") + this.procedureName + (null != var3?" " + var3:"");
      } else {
         var2 = sqlExecSyntax.matcher(var1);
         if(var2.matches()) {
            this.hasReturnValueSyntax = null != var2.group(1);
            this.procedureName = var2.group(3);
         }
      }

      var2 = limitSyntaxGeneric.matcher(var1);
      if(var2.find()) {
         StringBuffer var4 = new StringBuffer(var1);
         this.translateLimit(var4, 0, '\u0000');
         return var4.toString();
      } else {
         return var1;
      }
   }


   static enum State {

      START("START", 0),
      END("END", 1),
      SUBQUERY("SUBQUERY", 2),
      SELECT("SELECT", 3),
      OPENQUERY("OPENQUERY", 4),
      OPENROWSET("OPENROWSET", 5),
      LIMIT("LIMIT", 6),
      OFFSET("OFFSET", 7),
      QUOTE("QUOTE", 8),
      PROCESS("PROCESS", 9);
      // $FF: synthetic field
      private static final JDBCSyntaxTranslator.State[] $VALUES = new JDBCSyntaxTranslator.State[]{START, END, SUBQUERY, SELECT, OPENQUERY, OPENROWSET, LIMIT, OFFSET, QUOTE, PROCESS};


      private State(String var1, int var2) {}

   }
}

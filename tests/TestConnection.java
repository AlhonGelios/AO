package tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestConnection {

   public static void main(String[] args) {
      String connectionUrl = "jdbc:sqlserver://projectownserver.database.windows.net:1433;database=Project;user=Alexander@projectownserver;password={password here!};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
      Connection con = null;
      Statement stmt = null;
      Object rs = null;

      try {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
         con = DriverManager.getConnection(connectionUrl);
         String e = "CREATE TABLE Abiturient (aid int primary key, SName text, Fname text, MName text)";
         stmt = con.createStatement();
         stmt.executeUpdate(e);
      } catch (Exception var22) {
         var22.printStackTrace();
      } finally {
         if(rs != null) {
            try {
               ((ResultSet)rs).close();
            } catch (Exception var21) {
               ;
            }
         }

         if(stmt != null) {
            try {
               stmt.close();
            } catch (Exception var20) {
               ;
            }
         }

         if(con != null) {
            try {
               con.close();
            } catch (Exception var19) {
               ;
            }
         }

      }

   }
}

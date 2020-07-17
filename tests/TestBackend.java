package tests;

import backend.ModelDBConnection;
import java.sql.SQLException;

public class TestBackend {

   public static void main(String[] args) throws SQLException {
      ModelDBConnection.setConnectionParameters("MSServer", "localhost", "Ordinator", "user", "password");
      ModelDBConnection.initConnection();
      String[] c = ModelDBConnection.getAbiturientPassportByID("3");
      String[] k = ModelDBConnection.getAllGroupsNames();

      for(int a = 0; a < k.length; ++a) {
         System.out.println(k[a]);
      }

      String[][] var6 = ModelDBConnection.getListAbiturientsByEntranceTestAndGroupIDs("1", "1c1");

      for(int i = 0; i < var6.length; ++i) {
         for(int j = 0; j < var6[i].length; ++j) {
            System.out.print(var6[i][j] + " ");
         }

         System.out.println();
      }

   }
}

package backend;

import backend.MessageProcessing;
import java.awt.Component;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ModelDBConnection {

   static String login;
   static String password;
   static String serverAddress;
   static String serverType;
   static String dbName;
   static Connection con = null;
   static CallableStatement cstmt = null;
   static ResultSet rset = null;
   static Statement stmt = null;
   static boolean DEBUG = false;


   public static void setConnectionParameters(String serverType, String serverAddress, String dbName, String login, String password) {
      serverType = serverType;
      serverAddress = serverAddress;
      dbName = dbName;
      login = login;
      password = password;
      con = null;
   }

   public static String getLogin() {
      return login;
   }

   public static String getPassword() {
      return password;
   }

   public static String getServerAddress() {
      return serverAddress;
   }

   public static String getServerType() {
      return serverType;
   }

   public static String getDBName() {
      return dbName;
   }

   public static Connection getConnection() {
      return con;
   }

   public static boolean initConnection() {
      if(con == null) {
         try {
            String e = null;
            String var1 = serverType;
            switch(serverType.hashCode()) {
            case -1327858030:
               if(var1.equals("AzureServer")) {
                  e = "jdbc:sqlserver://" + serverAddress + ":1433;database=" + dbName + ";user=" + login + ";password=" + password + ";encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
               }
               break;
            case -121188215:
               if(var1.equals("MSServer")) {
                  e = "jdbc:sqlserver://" + serverAddress + ":1433;databaseName=" + dbName + ";user=" + login + ";password=" + password + ";";
               }
            }

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(e);
         } catch (Exception var2) {
            var2.printStackTrace();
            return false;
         }
      }

      return true;
   }

   public static int getCount(String tableName) {
      if(initConnection()) {
         try {
            boolean e = false;
            cstmt = con.prepareCall("{? = call getCount(?)}");
            cstmt.registerOutParameter(1, 4);
            cstmt.setString(2, tableName);
            cstmt.execute();
            int e1 = cstmt.getInt(1);
            return e1;
         } catch (Exception var2) {
            var2.printStackTrace();
            return -1;
         }
      } else {
         return -1;
      }
   }

   public static int getCountForAbitID(String tableName, String aid) {
      if(initConnection()) {
         try {
            boolean e = false;
            cstmt = con.prepareCall("{? = call getCountForAbitID(?,?)}");
            cstmt.registerOutParameter(1, 4);
            cstmt.setString(2, tableName);
            cstmt.setString(3, aid);
            cstmt.execute();
            int e1 = cstmt.getInt(1);
            return e1;
         } catch (NumberFormatException var3) {
            var3.printStackTrace();
            return -1;
         } catch (Exception var4) {
            var4.printStackTrace();
            return -1;
         }
      } else {
         return -1;
      }
   }

   public static String[][] getAllAbiturients() {
      String[][] data = null;

      try {
         cstmt = con.prepareCall("{call getAllAbiturients}", 1004, 1007);
         rset = cstmt.executeQuery();
         int e = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(e > 0) {
            ResultSetMetaData rsmd = rset.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            data = new String[e][numberOfColumns];

            for(int curPos = 0; rset.next(); ++curPos) {
               for(int i = 0; i < numberOfColumns; ++i) {
                  if(rset.getObject(i + 1) != null) {
                     if(rset.getObject(i + 1) instanceof Date) {
                        SimpleDateFormat format = new SimpleDateFormat();
                        format.applyPattern("yyyy-MM-dd");
                        Date docDate = format.parse(rset.getObject(i + 1).toString());
                        format.applyPattern("dd.MM.yyyy");
                        data[curPos][i] = format.format(docDate);
                     } else {
                        data[curPos][i] = rset.getObject(i + 1).toString();
                     }
                  }
               }
            }
         }

         cstmt.close();
         rset.close();
         return data;
      } catch (Exception var8) {
         var8.printStackTrace();
         return null;
      }
   }

   public static String[] getAbiturientGeneralInfoByID(String aid) throws SQLException {
      try {
         cstmt = con.prepareCall("{call getAbiturientGeneralInfoByID(?)}", 1004, 1007);
         cstmt.setString(1, aid);
         rset = cstmt.executeQuery();
         ResultSetMetaData e = rset.getMetaData();
         int numberOfColumns = e.getColumnCount();
         String[] result = new String[numberOfColumns];

         int i;
         for(i = 0; i < result.length; ++i) {
            result[i] = "";
         }

         result[0] = aid;

         while(rset.next()) {
            for(i = 0; i < numberOfColumns; ++i) {
               if(rset.getObject(i + 1) != null) {
                  if(rset.getObject(i + 1) instanceof Date) {
                     SimpleDateFormat format = new SimpleDateFormat();
                     format.applyPattern("yyyy-MM-dd");
                     Date docDate = format.parse(rset.getObject(i + 1).toString());
                     format.applyPattern("dd.MM.yyyy");
                     result[i] = format.format(docDate);
                  } else {
                     result[i] = rset.getObject(i + 1).toString();
                  }
               }
            }
         }

         cstmt.close();
         rset.close();
         return result;
      } catch (Exception var7) {
         return null;
      }
   }

   public static void insertAbiturient(String[] info) throws SQLException {
      String snils = null;
      String is_enrolled = null;
      String needSpecConditions = null;
      String id_returnReason = null;
      String returnDate = null;
      String registrationDate = null;
      String needHostel = null;
      String phoneNumbers = null;
      String email = null;
      String id_nationality = null;
      String id_gender = null;
      String birthplace = null;
      String birthday = null;
      String MName = null;
      String FName = null;
      String SName = null;
      String aid = null;
      String query = null;
      switch(info.length) {
      case 10:
         aid = info[0];
         SName = "\'" + info[1] + "\'";
         FName = "\'" + info[2] + "\'";
         MName = "\'" + info[3] + "\'";
         birthday = "\'" + info[4] + "\'";
         id_gender = info[5];
         id_nationality = info[6];
         registrationDate = "\'" + info[7] + "\'";
         needHostel = "\'" + info[8] + "\'";
         snils = "\'" + info[9] + "\'";
         query = "insert into Abiturient (aid, SName, FName, MName, Birthday, id_gender, id_nationality, registrationDate, needHostel, snils) Values (" + aid + ", " + SName + ", " + FName + ", " + MName + ", " + birthday + ", " + id_gender + ", " + id_nationality + ", " + registrationDate + ", " + needHostel + ", " + snils + ");";
         break;
      case 16:
         aid = info[0];
         SName = "\'" + info[1] + "\'";
         FName = "\'" + info[2] + "\'";
         MName = "\'" + info[3] + "\'";
         birthday = "\'" + info[4] + "\'";
         birthplace = "\'" + info[5] + "\'";
         id_gender = info[6];
         id_nationality = info[7];
         email = "\'" + info[8] + "\'";
         phoneNumbers = "\'" + info[9] + "\'";
         needHostel = info[10];
         registrationDate = "\'" + info[11] + "\'";
         returnDate = "\'" + info[12] + "\'";
         id_returnReason = info[13];
         needSpecConditions = info[14];
         is_enrolled = info[15];
         query = "insert into Abiturient Values (" + aid + ", " + SName + ", " + FName + ", " + MName + ", " + birthday + ", " + birthplace + ", " + id_gender + ", " + id_nationality + ", " + email + ", " + phoneNumbers + ", " + needHostel + ", " + registrationDate + ", " + returnDate + ", " + id_returnReason + ", " + needSpecConditions + ", " + is_enrolled + ");";
      }

      if(initConnection()) {
         query = query.replaceAll("\'null\'", "null");
         stmt = con.createStatement();
         stmt.executeUpdate(query);
         stmt.close();
      }

   }

   public static void editAbiturient(String[] info) throws SQLException {
      String is_enrolled = null;
      String needSpecConditions = null;
      String id_returnReason = null;
      String returnDate = null;
      String registrationDate = null;
      String needHostel = null;
      String phoneNumbers = null;
      String email = null;
      String id_nationality = null;
      String id_gender = null;
      String birthplace = null;
      String birthday = null;
      String MName = null;
      String FName = null;
      String SName = null;
      String aid = null;
      String query = null;
      switch(info.length) {
      case 8:
         aid = info[0];
         SName = "\'" + info[1] + "\'";
         FName = "\'" + info[2] + "\'";
         MName = "\'" + info[3] + "\'";
         birthday = "\'" + info[4] + "\'";
         id_gender = info[5];
         id_nationality = info[6];
         registrationDate = "\'" + info[7] + "\'";
         query = "update Abiturient set SName = " + SName + ", FName = " + FName + ", MName = " + MName + ", Birthday = " + birthday + ", id_gender = " + id_gender + ", id_nationality = " + id_nationality + ", registrationDate = " + registrationDate + " where aid = " + aid + ";";
         break;
      case 11:
         aid = info[0];
         SName = "\'" + info[1] + "\'";
         FName = "\'" + info[2] + "\'";
         MName = "\'" + info[3] + "\'";
         birthday = "\'" + info[4] + "\'";
         id_gender = info[5];
         id_nationality = info[6];
         registrationDate = "\'" + info[7] + "\'";
         returnDate = info[8] == null?null:"\'" + info[8] + "\'";
         id_returnReason = info[9];
         String snils = "\'" + info[10] + "\'";
         query = "update Abiturient set SName = " + SName + ", FName = " + FName + ", MName = " + MName + ", Birthday = " + birthday + ", id_gender = " + id_gender + ", id_nationality = " + id_nationality + ", registrationDate = " + registrationDate + ", returnDate = " + returnDate + ", id_returnReason = " + id_returnReason + ", snils = " + snils + " where aid = " + aid + ";";
         query = query.replaceAll("\'null\'", "null");
         System.out.println(query);
         break;
      case 16:
         aid = info[0];
         SName = "\'" + info[1] + "\'";
         FName = "\'" + info[2] + "\'";
         MName = "\'" + info[3] + "\'";
         birthday = "\'" + info[4] + "\'";
         birthplace = "\'" + info[5] + "\'";
         id_gender = info[6];
         id_nationality = info[7];
         email = "\'" + info[8] + "\'";
         phoneNumbers = "\'" + info[9] + "\'";
         needHostel = info[10];
         registrationDate = "\'" + info[11] + "\'";
         returnDate = "\'" + info[12] + "\'";
         id_returnReason = info[13];
         needSpecConditions = info[14];
         is_enrolled = info[15];
         query = "update Abiturient set SName = " + SName + ", FName = " + FName + ", MName = " + MName + ", Birthday = " + birthday + ", Birthplace = " + birthplace + ", id_gender = " + id_gender + ", id_nationality = " + id_nationality + ", email = " + email + ", phoneNumbers = " + phoneNumbers + ", needHostel = " + needHostel + ", registrationDate = " + registrationDate + ", returnDate = " + returnDate + ", id_returnReason = " + id_returnReason + ", needSpecConditions = " + needSpecConditions + ", is_enrolled = " + is_enrolled + " where aid = " + aid + ";";
      }

      if(initConnection()) {
         stmt = con.createStatement();
         stmt.executeUpdate(query);
         stmt.close();
      }

   }

   public static void deleteAbiturient(String aid) throws SQLException {
      cstmt = con.prepareCall("{call deleteAbiturient(?)}");
      cstmt.setString(1, aid);
      cstmt.execute();
      cstmt.close();
   }

   public static String[] getNamesFromTableOrderedById(String table) {
      try {
         cstmt = con.prepareCall("{call getNamesFromTableOrderedById(?)}", 1004, 1007);
         cstmt.setString(1, table);
         rset = cstmt.executeQuery();
         int e = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         int i = 0;

         String[] listElems;
         for(listElems = new String[e]; rset.next(); ++i) {
            listElems[i] = rset.getString(1);
         }

         cstmt.close();
         rset.close();
         return listElems;
      } catch (Exception var4) {
         var4.printStackTrace();
         return null;
      }
   }

   public static String[][] getAllFromTableOrderedById(String table) throws SQLException {
      String id;
      label81: {
         label80: {
            id = "id";
            switch(table.hashCode()) {
            case -1480319125:
               if(table.equals("AbiturientIndividualAchievement")) {
                  break label80;
               }
               break;
            case -804206243:
               if(table.equals("AbiturientPassport")) {
                  break label80;
               }
               break;
            case -797243063:
               if(table.equals("AbiturientAddress")) {
                  break label80;
               }
               break;
            case -712216928:
               if(table.equals("AbiturientEntranceTests")) {
                  break label80;
               }
               break;
            case -484828494:
               if(table.equals("AdmissionPlan")) {
                  id = "specialtyCode";
                  break label81;
               }
               break;
            case 82025960:
               if(table.equals("Users")) {
                  id = "userLogin";
                  break label81;
               }
               break;
            case 715469867:
               if(table.equals("Abiturient")) {
                  id = "aid";
                  break label81;
               }
               break;
            case 1316200082:
               if(table.equals("AbiturientPostgraduateEducation")) {
                  break label80;
               }
               break;
            case 1646425979:
               if(table.equals("AbiturientCompetitiveGroup")) {
                  break label80;
               }
            }

            id = "id";
            break label81;
         }

         id = "aid_abiturient";
      }

      String[][] data = null;

      try {
         cstmt = con.prepareCall("{call getAllFromTable(?, ?)}", 1004, 1007);
         cstmt.setString(1, table);
         cstmt.setString(2, id);
         rset = cstmt.executeQuery();
         int e = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(e > 0) {
            ResultSetMetaData rsmd = rset.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            data = new String[e][numberOfColumns];

            for(int curPos = 0; rset.next(); ++curPos) {
               for(int i = 0; i < numberOfColumns; ++i) {
                  if(rset.getObject(i + 1) != null) {
                     data[curPos][i] = rset.getObject(i + 1).toString();
                     System.out.println(data[curPos][i]);
                  }
               }
            }
         }

         cstmt.close();
         rset.close();
         return data;
      } catch (Exception var9) {
         var9.printStackTrace();
         return null;
      }
   }

   public static String[][] getAllFromTable(String table) throws SQLException {
      String[][] data = null;

      try {
         cstmt = con.prepareCall("{call getAllFromTable(?, ?)}", 1004, 1007);
         cstmt.setString(1, table);
         cstmt.setString(2, (String)null);
         rset = cstmt.executeQuery();
         int e = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(e > 0) {
            ResultSetMetaData rsmd = rset.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            data = new String[e][numberOfColumns];

            for(int curPos = 0; rset.next(); ++curPos) {
               for(int i = 0; i < numberOfColumns; ++i) {
                  if(rset.getObject(i + 1) != null) {
                     data[curPos][i] = rset.getObject(i + 1).toString();
                  }
               }
            }
         }

         cstmt.close();
         rset.close();
         return data;
      } catch (Exception var7) {
         var7.printStackTrace();
         return null;
      }
   }

   public static void updateElementInTableById(String table, String[] data) throws SQLException {
      String id;
      label121: {
         label120: {
            id = "id";
            switch(table.hashCode()) {
            case -1480319125:
               if(!table.equals("AbiturientIndividualAchievement")) {
                  break label120;
               }
               break;
            case -808347605:
               if(!table.equals("InfoForOrdinatorIS")) {
                  break label120;
               }
               break;
            case -804206243:
               if(!table.equals("AbiturientPassport")) {
                  break label120;
               }
               break;
            case -797243063:
               if(!table.equals("AbiturientAddress")) {
                  break label120;
               }
               break;
            case -712216928:
               if(!table.equals("AbiturientEntranceTests")) {
                  break label120;
               }
               break;
            case -484828494:
               if(table.equals("AdmissionPlan")) {
                  id = "specialtyCode";
                  break label121;
               }
               break label120;
            case 82025960:
               if(table.equals("Users")) {
                  id = "userLogin";
                  break label121;
               }
               break label120;
            case 149511918:
               if(!table.equals("AbiturientHigherEducation")) {
                  break label120;
               }
               break;
            case 715469867:
               if(table.equals("Abiturient")) {
                  id = "aid";
                  break label121;
               }
               break label120;
            case 1233089595:
               if(!table.equals("AbiturientSpecialistCertificate")) {
                  break label120;
               }
               break;
            case 1316200082:
               if(!table.equals("AbiturientPostgraduateEducation")) {
                  break label120;
               }
               break;
            case 1646425979:
               if(!table.equals("AbiturientCompetitiveGroup")) {
                  break label120;
               }
               break;
            case 1771764296:
               if(!table.equals("AbiturientAccreditationCertificate")) {
                  break label120;
               }
               break;
            default:
               break label120;
            }

            id = "aid_abiturient";
            break label121;
         }

         id = "id";
      }

      String query = "select * from " + table + " where " + id + " = " + (!table.equals("Users")?data[0]:"\'" + data[0] + "\'") + ";";
      System.out.println(query);
      boolean numberOfColumns = false;
      if(initConnection()) {
         stmt = con.createStatement();
         rset = stmt.executeQuery(query);
         ResultSetMetaData rsmd = rset.getMetaData();
         int var9 = rsmd.getColumnCount();

         int countStrings;
         for(countStrings = 0; rset.next(); ++countStrings) {
            ;
         }

         int i;
         if(countStrings > 0) {
            query = "update " + table + " set ";

            for(i = 1; i < var9; ++i) {
               if(i == var9 - 1) {
                  query = query + rsmd.getColumnLabel(i + 1) + " = " + "\'" + data[i] + "\'";
               } else {
                  query = query + rsmd.getColumnLabel(i + 1) + " = " + "\'" + data[i] + "\'" + ", ";
               }
            }

            query = query + " where " + id + " = " + (!table.equals("Users")?data[0]:"\'" + data[0] + "\'") + ";";
            if(table.equals("Users")) {
               query = query + " DROP LOGIN " + data[0] + "; CREATE LOGIN " + data[0] + " WITH PASSWORD = \'" + data[1] + "\'; ALTER SERVER ROLE sysadmin ADD MEMBER " + data[0];
            }
         } else {
            query = "insert into " + table + " values (" + (!table.equals("Users")?data[0]:"\'" + data[0] + "\'") + ", ";

            for(i = 1; i < var9; ++i) {
               if(i == var9 - 1) {
                  query = query + "\'" + data[i] + "\')";
               } else {
                  query = query + "\'" + data[i] + "\'" + ", ";
               }
            }

            if(table.equals("Users")) {
               query = query + "; CREATE LOGIN " + data[0] + " WITH PASSWORD = \'" + data[1] + "\'; ALTER SERVER ROLE sysadmin ADD MEMBER " + data[0];
            }
         }

         stmt.close();
         rset.close();
      }

      query = query.replaceAll("\'null\'", "null");
      System.out.println(query);
      stmt = con.createStatement();
      stmt.executeUpdate(query);
      stmt.close();
      rset.close();
   }

   public static void updateElementInTableByExpression(String table, String[] data, int countOfExprParams) throws SQLException {
      String id;
      label138: {
         label137: {
            id = "id";
            switch(table.hashCode()) {
            case -1480319125:
               if(table.equals("AbiturientIndividualAchievement")) {
                  break label137;
               }
               break;
            case -804206243:
               if(table.equals("AbiturientPassport")) {
                  break label137;
               }
               break;
            case -797243063:
               if(table.equals("AbiturientAddress")) {
                  break label137;
               }
               break;
            case -712216928:
               if(table.equals("AbiturientEntranceTests")) {
                  break label137;
               }
               break;
            case -484828494:
               if(table.equals("AdmissionPlan")) {
                  id = "specialtyCode";
                  break label138;
               }
               break;
            case 82025960:
               if(table.equals("Users")) {
                  id = "userLogin";
                  break label138;
               }
               break;
            case 149511918:
               if(table.equals("AbiturientHigherEducation")) {
                  break label137;
               }
               break;
            case 715469867:
               if(table.equals("Abiturient")) {
                  id = "aid";
                  break label138;
               }
               break;
            case 1316200082:
               if(table.equals("AbiturientPostgraduateEducation")) {
                  break label137;
               }
               break;
            case 1646425979:
               if(table.equals("AbiturientCompetitiveGroup")) {
                  break label137;
               }
            }

            id = "id";
            break label138;
         }

         id = "aid_abiturient";
      }

      String query = "select * from " + table + " where " + id + " = 0;";
      System.out.println(query);
      boolean numberOfColumns = false;
      if(initConnection()) {
         stmt = con.createStatement();
         rset = stmt.executeQuery(query);
         ResultSetMetaData rsmd = rset.getMetaData();
         int var10 = rsmd.getColumnCount();
         int countStrings = 0;
         query = "select * from " + table + " where ";

         int i;
         for(i = 0; i < countOfExprParams; ++i) {
            if(i == countOfExprParams - 1) {
               query = query + rsmd.getColumnLabel(i + 1) + (data[i] != null?" = " + data[i]:" is " + data[i]) + ";";
            } else {
               query = query + rsmd.getColumnLabel(i + 1) + (data[i] != null?" = " + data[i]:" is " + data[i]) + " and ";
            }
         }

         System.out.println(query);
         stmt = con.createStatement();

         for(rset = stmt.executeQuery(query); rset.next(); ++countStrings) {
            ;
         }

         if(countStrings > 0) {
            query = "update " + table + " set ";

            for(i = 1; i < var10; ++i) {
               if(i == var10 - 1) {
                  query = query + rsmd.getColumnLabel(i + 1) + " = " + "\'" + data[i] + "\'";
               } else {
                  query = query + rsmd.getColumnLabel(i + 1) + " = " + "\'" + data[i] + "\'" + ", ";
               }
            }

            query = query + " where ";

            for(i = 0; i < countOfExprParams; ++i) {
               if(i == countOfExprParams - 1) {
                  query = query + rsmd.getColumnLabel(i + 1) + (data[i] != null?" = " + data[i]:" is " + data[i]) + ";";
               } else {
                  query = query + rsmd.getColumnLabel(i + 1) + (data[i] != null?" = " + data[i]:" is " + data[i]) + " and ";
               }
            }
         } else {
            query = "insert into " + table + " values (" + data[0] + ", ";

            for(i = 1; i < var10; ++i) {
               if(i == var10 - 1) {
                  query = query + "\'" + data[i] + "\')";
               } else {
                  query = query + "\'" + data[i] + "\'" + ", ";
               }
            }
         }

         stmt.close();
         rset.close();
      }

      query = query.replaceAll("\'null\'", "null");
      System.out.println(query);
      stmt = con.createStatement();
      stmt.executeUpdate(query);
      stmt.close();
      rset.close();
   }

   public static void updateElementInTableByIds(String table, String[] data) throws SQLException {
      String id1 = "aid_abiturient";
      String id2 = "";
      switch(table.hashCode()) {
      case -1480319125:
         if(table.equals("AbiturientIndividualAchievement")) {
            id1 = "aid_abiturient";
            id2 = "id_individual_achievement";
         }
         break;
      case -712216928:
         if(table.equals("AbiturientEntranceTests")) {
            id1 = "aid_abiturient";
            id2 = "id_entranceTest";
         }
      }

      String query = "select * from " + table + " where " + id1 + " = " + data[0] + " and " + id2 + " = " + data[1] + ";";
      System.out.println(query);
      boolean numberOfColumns = false;
      if(initConnection()) {
         stmt = con.createStatement();
         rset = stmt.executeQuery(query);
         ResultSetMetaData rsmd = rset.getMetaData();
         int var10 = rsmd.getColumnCount();

         int countStrings;
         for(countStrings = 0; rset.next(); ++countStrings) {
            ;
         }

         int i;
         if(countStrings > 0) {
            query = "update " + table + " set ";

            for(i = 1; i < var10; ++i) {
               if(i == var10 - 1) {
                  query = query + rsmd.getColumnLabel(i + 1) + " = " + "\'" + data[i] + "\'";
               } else {
                  query = query + rsmd.getColumnLabel(i + 1) + " = " + "\'" + data[i] + "\'" + ", ";
               }
            }

            query = query + " where " + id1 + " = " + data[0] + " and " + id2 + " = " + data[1] + ";";
         } else {
            query = "insert into " + table + " values (" + data[0] + ", ";

            for(i = 1; i < var10; ++i) {
               if(i == var10 - 1) {
                  query = query + "\'" + data[i] + "\')";
               } else {
                  query = query + "\'" + data[i] + "\'" + ", ";
               }
            }
         }

         stmt.close();
         rset.close();
      }

      query = query.replaceAll("\'null\'", "null");
      System.out.println(query);
      stmt = con.createStatement();
      stmt.executeUpdate(query);
      stmt.close();
      rset.close();
   }

   public static void deleteElementInTableById(String table, String data) throws SQLException {
      String id;
      label58: {
         label57: {
            id = "id";
            switch(table.hashCode()) {
            case -1480319125:
               if(table.equals("AbiturientIndividualAchievement")) {
                  break label57;
               }
               break;
            case -804206243:
               if(table.equals("AbiturientPassport")) {
                  break label57;
               }
               break;
            case -797243063:
               if(table.equals("AbiturientAddress")) {
                  break label57;
               }
               break;
            case -712216928:
               if(table.equals("AbiturientEntranceTests")) {
                  break label57;
               }
               break;
            case -484828494:
               if(table.equals("AdmissionPlan")) {
                  id = "specialtyCode";
                  break label58;
               }
               break;
            case 82025960:
               if(table.equals("Users")) {
                  id = "userLogin";
                  break label58;
               }
               break;
            case 149511918:
               if(table.equals("AbiturientHigherEducation")) {
                  break label57;
               }
               break;
            case 715469867:
               if(table.equals("Abiturient")) {
                  id = "aid";
                  break label58;
               }
               break;
            case 1233089595:
               if(table.equals("AbiturientSpecialistCertificate")) {
                  break label57;
               }
               break;
            case 1316200082:
               if(table.equals("AbiturientPostgraduateEducation")) {
                  break label57;
               }
               break;
            case 1646425979:
               if(table.equals("AbiturientCompetitiveGroup")) {
                  break label57;
               }
               break;
            case 1771764296:
               if(table.equals("AbiturientAccreditationCertificate")) {
                  break label57;
               }
            }

            id = "id";
            break label58;
         }

         id = "aid_abiturient";
      }

      cstmt = con.prepareCall("{call deleteElementInTableById(?, ?, ?)}");
      cstmt.setString(1, table);
      cstmt.setString(2, id);
      cstmt.setString(3, !table.equals("Users")?data:"\'" + data + "\'");
      cstmt.execute();
      cstmt.close();
   }

   public static void deleteElementInTableByExpression(String table, String[] data, int countOfExprParams) throws SQLException {
      String id = "aid_abiturient";
      switch(table.hashCode()) {
      case -484828494:
         if(table.equals("AdmissionPlan")) {
            id = "specialtyCode";
         }
         break;
      case 1646425979:
         if(table.equals("AbiturientCompetitiveGroup")) {
            id = "aid_abiturient";
         }
      }

      String query;
      if(countOfExprParams > 0) {
         query = "select * from " + table + " where " + id + " = 0;";
         System.out.println(query);
         stmt = con.createStatement();
         rset = stmt.executeQuery(query);
         ResultSetMetaData rsmd = rset.getMetaData();
         query = "delete from " + table + " where ";

         for(int i = 0; i < countOfExprParams; ++i) {
            if(i == countOfExprParams - 1) {
               query = query + rsmd.getColumnLabel(i + 1) + " = " + data[i] + ";";
            } else {
               query = query + rsmd.getColumnLabel(i + 1) + " = " + data[i] + " and ";
            }
         }

         System.out.println(query);
      } else {
         query = "delete from " + table;
      }

      query = query.replaceAll("= null", "is null");
      stmt = con.createStatement();
      stmt.executeUpdate(query);
      stmt.close();
   }

   public static void deleteElementInTableByIds(String table, String[] data) throws SQLException {
      String id1 = "aid_abiturient";
      String id2 = "";
      switch(table.hashCode()) {
      case -1480319125:
         if(table.equals("AbiturientIndividualAchievement")) {
            id1 = "aid_abiturient";
            id2 = "id_individual_achievement";
         }
         break;
      case -712216928:
         if(table.equals("AbiturientEntranceTests")) {
            id1 = "aid_abiturient";
            id2 = "id_entranceTest";
         }
      }

      cstmt = con.prepareCall("{call deleteElementInTableByIds(?, ?, ?, ?, ?)}");
      cstmt.setString(1, table);
      cstmt.setString(2, id1);
      cstmt.setString(3, data[0]);
      cstmt.setString(4, id2);
      cstmt.setString(5, data[1]);
      cstmt.execute();
      cstmt.close();
   }

   public static String[][] getAllAchievmentsByAbiturientId(String aid, boolean need_all_columns) {
      String[][] data = null;

      try {
         cstmt = con.prepareCall("{call getAllAchievmentsByAbiturientId(?, ?)}", 1004, 1007);
         cstmt.setString(1, aid);
         cstmt.setBoolean(2, need_all_columns);
         rset = cstmt.executeQuery();
         int e = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(e > 0) {
            ResultSetMetaData rsmd = rset.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            data = new String[e][numberOfColumns];

            for(int curPos = 0; rset.next(); ++curPos) {
               for(int i = 0; i < numberOfColumns; ++i) {
                  if(rset.getObject(i + 1) != null) {
                     if(rset.getObject(i + 1) instanceof Date) {
                        SimpleDateFormat format = new SimpleDateFormat();
                        format.applyPattern("yyyy-MM-dd");
                        Date docDate = format.parse(rset.getObject(i + 1).toString());
                        format.applyPattern("dd.MM.yyyy");
                        data[curPos][i] = format.format(docDate);
                     } else {
                        data[curPos][i] = rset.getObject(i + 1).toString();
                     }
                  }
               }
            }
         }

         cstmt.close();
         rset.close();
         return data;
      } catch (Exception var10) {
         var10.printStackTrace();
         return null;
      }
   }

   public static String[][] getAllEntranceTestsResultsByAbiturientId(String aid, boolean need_all_columns) {
      String[][] data = null;

      try {
         cstmt = con.prepareCall("{call getAllEntranceTestsResultsByAbiturientId(?, ?)}", 1004, 1007);
         cstmt.setString(1, aid);
         cstmt.setBoolean(2, need_all_columns);
         rset = cstmt.executeQuery();
         int e = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(e > 0) {
            ResultSetMetaData rsmd = rset.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            data = new String[e][numberOfColumns];

            for(int curPos = 0; rset.next(); ++curPos) {
               for(int i = 0; i < numberOfColumns; ++i) {
                  if(rset.getObject(i + 1) != null) {
                     if(rset.getObject(i + 1) instanceof Date) {
                        SimpleDateFormat format = new SimpleDateFormat();
                        format.applyPattern("yyyy-MM-dd");
                        Date docDate = format.parse(rset.getObject(i + 1).toString());
                        format.applyPattern("dd.MM.yyyy");
                        data[curPos][i] = format.format(docDate);
                     } else {
                        data[curPos][i] = rset.getObject(i + 1).toString();
                     }
                  }
               }
            }
         }

         cstmt.close();
         rset.close();
         return data;
      } catch (Exception var10) {
         var10.printStackTrace();
         return null;
      }
   }

   public static String[][] getAllCompetitiveGroupsByAbiturientId(String aid) {
      String[][] data = null;

      try {
         cstmt = con.prepareCall("{call getAllAllCompetitiveGroupsByAbiturientId(?)}", 1004, 1007);
         cstmt.setString(1, aid);
         rset = cstmt.executeQuery();
         int e = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(e > 0) {
            ResultSetMetaData rsmd = rset.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            data = new String[e][numberOfColumns];

            for(int curPos = 0; rset.next(); ++curPos) {
               for(int i = 0; i < numberOfColumns; ++i) {
                  if(rset.getObject(i + 1) != null) {
                     data[curPos][i] = rset.getObject(i + 1).toString();
                  }
               }
            }
         }

         cstmt.close();
         rset.close();
         return data;
      } catch (Exception var7) {
         var7.printStackTrace();
         return null;
      }
   }

   public static String[] getAbiturientPassportByID(String aid) throws SQLException {
      try {
         cstmt = con.prepareCall("{call getAbiturientPassportByID(?)}", 1004, 1007);
         cstmt.setString(1, aid);
         rset = cstmt.executeQuery();
         ResultSetMetaData e = rset.getMetaData();
         int numberOfColumns = e.getColumnCount();
         String[] result = new String[numberOfColumns];
         result[0] = aid;

         while(rset.next()) {
            for(int i = 0; i < numberOfColumns; ++i) {
               if(rset.getObject(i + 1) != null) {
                  if(rset.getObject(i + 1) instanceof Date) {
                     SimpleDateFormat format = new SimpleDateFormat();
                     format.applyPattern("yyyy-MM-dd");
                     Date docDate = format.parse(rset.getObject(i + 1).toString());
                     format.applyPattern("dd.MM.yyyy");
                     result[i] = format.format(docDate);
                  } else {
                     result[i] = rset.getObject(i + 1).toString();
                  }
               }
            }
         }

         cstmt.close();
         rset.close();
         return result;
      } catch (Exception var7) {
         return null;
      }
   }

   public static void updateAbiturientPassportByID(String aid, String[] data) throws SQLException {
      try {
         String e = "update Abiturient set Birthplace = \'" + data[5] + "\' where aid = " + aid + ";";
         String[] abiturientPassportInfo = new String[6];
         abiturientPassportInfo[0] = aid;

         for(int i = 1; i < abiturientPassportInfo.length; ++i) {
            abiturientPassportInfo[i] = data[i - 1];
         }

         updateElementInTableById("AbiturientPassport", abiturientPassportInfo);
         e = e.replaceAll("\'null\'", "null");
         System.out.println(e);
         stmt = con.createStatement();
         stmt.executeUpdate(e);
         stmt.close();
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public static String[] getAbiturientAddressAndContactsByID(String aid) throws SQLException {
      try {
         cstmt = con.prepareCall("{call getAbiturientAddressAndContactsByID(?)}", 1004, 1007);
         cstmt.setString(1, aid);
         rset = cstmt.executeQuery();
         ResultSetMetaData e = rset.getMetaData();
         int numberOfColumns = e.getColumnCount();
         String[] result = new String[numberOfColumns];
         result[0] = aid;

         while(rset.next()) {
            for(int i = 0; i < numberOfColumns; ++i) {
               if(rset.getObject(i + 1) != null) {
                  if(rset.getObject(i + 1) instanceof Date) {
                     SimpleDateFormat format = new SimpleDateFormat();
                     format.applyPattern("yyyy-MM-dd");
                     Date docDate = format.parse(rset.getObject(i + 1).toString());
                     format.applyPattern("dd.MM.yyyy");
                     result[i] = format.format(docDate);
                  } else {
                     result[i] = rset.getObject(i + 1).toString();
                  }
               }
            }
         }

         cstmt.close();
         rset.close();
         return result;
      } catch (Exception var7) {
         return null;
      }
   }

   public static void updateAbiturientAddressAndContactsByID(String aid, String[] data) throws SQLException {
      try {
         String e = "update Abiturient set email = \'" + data[4] + "\', phoneNumbers = \'" + data[5] + "\' where aid = " + aid + ";";
         String[] abiturientAddressInfo = new String[5];
         abiturientAddressInfo[0] = aid;

         for(int i = 1; i < abiturientAddressInfo.length; ++i) {
            abiturientAddressInfo[i] = data[i - 1];
         }

         updateElementInTableById("AbiturientAddress", abiturientAddressInfo);
         e = e.replaceAll("\'null\'", "null");
         System.out.println(e);
         stmt = con.createStatement();
         stmt.executeUpdate(e);
         stmt.close();
      } catch (Exception var5) {
         var5.printStackTrace();
      }

   }

   public static String[] getAbiturientEducationByID(String aid, String nameTable) throws SQLException {
      try {
         cstmt = con.prepareCall("{call getAbiturientEducationByID(?, ?)}", 1004, 1007);
         cstmt.setString(1, aid);
         cstmt.setString(2, nameTable);
         rset = cstmt.executeQuery();
         ResultSetMetaData e = rset.getMetaData();
         int numberOfColumns = e.getColumnCount();
         String[] result = new String[numberOfColumns];
         result[0] = aid;

         while(rset.next()) {
            for(int i = 0; i < numberOfColumns; ++i) {
               if(rset.getObject(i + 1) != null) {
                  if(rset.getObject(i + 1) instanceof Date) {
                     SimpleDateFormat format = new SimpleDateFormat();
                     format.applyPattern("yyyy-MM-dd");
                     Date docDate = format.parse(rset.getObject(i + 1).toString());
                     format.applyPattern("dd.MM.yyyy");
                     result[i] = format.format(docDate);
                  } else {
                     result[i] = rset.getObject(i + 1).toString();
                  }
               }
            }
         }

         cstmt.close();
         rset.close();
         return result;
      } catch (Exception var8) {
         return null;
      }
   }

   public static String[] getAbiturientCertificatByID(String aid, String nameTable) throws SQLException {
      try {
         cstmt = con.prepareCall("{call getAbiturientCertificatByID(?, ?)}", 1004, 1007);
         cstmt.setString(1, aid);
         cstmt.setString(2, nameTable);
         rset = cstmt.executeQuery();
         ResultSetMetaData e = rset.getMetaData();
         int numberOfColumns = e.getColumnCount();
         String[] result = new String[numberOfColumns];
         result[0] = aid;

         while(rset.next()) {
            for(int i = 0; i < numberOfColumns; ++i) {
               if(rset.getObject(i + 1) != null) {
                  if(rset.getObject(i + 1) instanceof Date) {
                     SimpleDateFormat format = new SimpleDateFormat();
                     format.applyPattern("yyyy-MM-dd");
                     Date docDate = format.parse(rset.getObject(i + 1).toString());
                     format.applyPattern("dd.MM.yyyy");
                     result[i] = format.format(docDate);
                  } else {
                     result[i] = rset.getObject(i + 1).toString();
                  }
               }
            }
         }

         cstmt.close();
         rset.close();
         return result;
      } catch (Exception var8) {
         return null;
      }
   }

   public static String[] getElementFromTableByIDs(String table, String[] data) {
      try {
         String e = "aid_abiturient";
         String id2 = "";
         switch(table.hashCode()) {
         case -1480319125:
            if(table.equals("AbiturientIndividualAchievement")) {
               e = "aid_abiturient";
               id2 = "id_individual_achievement";
            }
            break;
         case -712216928:
            if(table.equals("AbiturientEntranceTests")) {
               e = "aid_abiturient";
               id2 = "id_entranceTest";
            }
         }

         cstmt = con.prepareCall("{call getElementFromTableByIDs(?, ?, ?, ?, ?)}", 1004, 1007);
         cstmt.setString(1, table);
         cstmt.setString(2, e);
         cstmt.setString(3, data[0]);
         cstmt.setString(4, id2);
         cstmt.setString(5, data[1]);
         rset = cstmt.executeQuery();
         ResultSetMetaData rsmd = rset.getMetaData();
         int numberOfColumns = rsmd.getColumnCount();
         String[] result = new String[numberOfColumns];

         int i;
         for(i = 0; i < result.length; ++i) {
            result[i] = "";
         }

         while(rset.next()) {
            for(i = 0; i < numberOfColumns; ++i) {
               if(rset.getObject(i + 1) != null) {
                  result[i] = rset.getObject(i + 1).toString();
               }

               System.out.println("Read: " + result[i]);
            }
         }

         cstmt.close();
         rset.close();
         return result;
      } catch (Exception var9) {
         return null;
      }
   }

   public static void updateAbiturientEducationByID(String nameTable, String[] data) throws SQLException {
      try {
         updateElementInTableById(nameTable, data);
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public static void updateAbiturientCertificateByID(String nameTable, String[] data) throws SQLException {
      try {
         updateElementInTableById(nameTable, data);
      } catch (Exception var3) {
         var3.printStackTrace();
      }

   }

   public static void updateAbiturientIndividualAchivementByID(String[] data) throws SQLException {
      try {
         updateElementInTableByIds("AbiturientIndividualAchievement", data);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public static void updateAbiturientEntranceTestsResultsByID(String[] data) throws SQLException {
      try {
         String e = "update Abiturient set needSpecConditions = \'" + data[data.length - 1] + "\' where aid = " + data[0] + ";";
         String[] abiturientEntranceTestsResultsInfo = new String[data.length - 1];

         for(int i = 0; i < abiturientEntranceTestsResultsInfo.length; ++i) {
            abiturientEntranceTestsResultsInfo[i] = data[i];
         }

         updateElementInTableByIds("AbiturientEntranceTests", abiturientEntranceTestsResultsInfo);
         System.out.println(e);
         stmt = con.createStatement();
         stmt.executeUpdate(e);
         stmt.close();
      } catch (Exception var4) {
         var4.printStackTrace();
      }

   }

   public static boolean needAbiturientSpecialConditionsByID(String aid) {
      boolean state = false;
      String query = "select needSpecConditions from Abiturient where aid = " + aid + ";";
      System.out.println(query);

      try {
         stmt = con.createStatement();

         for(rset = stmt.executeQuery(query); rset.next(); state = rset.getBoolean(1)) {
            ;
         }

         stmt.close();
         rset.close();
         return state;
      } catch (Exception var4) {
         var4.printStackTrace();
         return state;
      }
   }

   public static void updateAbiturientCompetitiveGroupByID(String[] data) throws SQLException {
      try {
         updateElementInTableByExpression("AbiturientCompetitiveGroup", data, 8);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }

   public static void deleteAbiturientCompetitiveGroupByID(String aid, String[] data) throws SQLException {
      deleteElementInTableByExpression("AbiturientCompetitiveGroup", data, 8);
   }

   public static int getFreeNumberInGroupByExam(String idEntranceTest, String testGroup) {
      if(initConnection()) {
         try {
            boolean e = false;
            cstmt = con.prepareCall("{? = call getFreeNumberInGroup(?,?)}");
            cstmt.registerOutParameter(1, 4);
            cstmt.setString(2, idEntranceTest);
            cstmt.setString(3, testGroup);
            cstmt.execute();
            int e1 = cstmt.getInt(1);
            return e1;
         } catch (NumberFormatException var3) {
            var3.printStackTrace();
            return -1;
         } catch (Exception var4) {
            var4.printStackTrace();
            return -1;
         }
      } else {
         return -1;
      }
   }

   public static String[][] getAdmissionPlan() {
      String[][] data = null;

      try {
         cstmt = con.prepareCall("{call getAdmissionPlan()}", 1004, 1007);
         rset = cstmt.executeQuery();
         int e = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(e > 0) {
            ResultSetMetaData rsmd = rset.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            data = new String[e][numberOfColumns];

            for(int curPos = 0; rset.next(); ++curPos) {
               for(int i = 0; i < numberOfColumns; ++i) {
                  if(rset.getObject(i + 1) != null) {
                     data[curPos][i] = rset.getObject(i + 1).toString();
                  }
               }
            }
         }

         cstmt.close();
         rset.close();
         return data;
      } catch (Exception var6) {
         var6.printStackTrace();
         return null;
      }
   }

   public static boolean checkUser(String login, String password) {
      if(initConnection()) {
         try {
            cstmt = con.prepareCall("{? = call checkUser(?, ?)}");
            cstmt.registerOutParameter(1, 4);
            cstmt.setString(2, login);
            cstmt.setString(3, password);
            cstmt.execute();
            boolean e = cstmt.getBoolean(1);
            return e;
         } catch (Exception var3) {
            var3.printStackTrace();
            MessageProcessing.displayErrorMessage((Component)null, var3);
            return false;
         }
      } else {
         return false;
      }
   }

   public static void updateCompetitiveBallsByID(String aid) throws SQLException {
      if(initConnection()) {
         cstmt = con.prepareCall("{call updateCompetitiveBallsByID(?)}");
         cstmt.setString(1, aid);
         cstmt.execute();
         cstmt.close();
      }

   }

   public static String[] getAllGroupsNames() {
      String[] data = null;

      try {
         cstmt = con.prepareCall("{? = call getAllGroupsNames}", 1004, 1007);
         cstmt.registerOutParameter(1, 4);
         rset = cstmt.executeQuery();
         int e = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(e > 0) {
            data = new String[e];

            for(int curPos = 0; rset.next(); ++curPos) {
               if(rset.getObject(1) != null) {
                  data[curPos] = rset.getObject(1).toString();
               }
            }
         }
      } catch (SQLException var3) {
         var3.printStackTrace();
      }

      return data;
   }

   public static String[][] getListAbiturientsByEntranceTestAndGroupIDs(String idET, String group) {
      String[][] data = null;

      try {
         cstmt = con.prepareCall("{? = call getListAbiturientsByEntranceTestAndGroupIDs(?, ?)}", 1004, 1007);
         cstmt.registerOutParameter(1, 4);
         cstmt.setString(2, idET);
         cstmt.setString(3, group);
         rset = cstmt.executeQuery();
         int e = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(e > 0) {
            ResultSetMetaData rsmd = rset.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            data = new String[e][numberOfColumns];

            for(int curPos = 0; rset.next(); ++curPos) {
               for(int i = 0; i < numberOfColumns; ++i) {
                  if(rset.getObject(i + 1) != null) {
                     data[curPos][i] = rset.getObject(i + 1).toString();
                  }
               }
            }
         }

         cstmt.close();
         rset.close();
      } catch (SQLException var8) {
         var8.printStackTrace();
      }

      return data;
   }

   public static void prepareCompetition(boolean isOrdinatorBD) throws SQLException {
      if(initConnection()) {
         cstmt = con.prepareCall("{call prepareCompetition(?)}");
         cstmt.setBoolean(1, isOrdinatorBD);
         cstmt.execute();
         cstmt.close();
      }

   }

   public static void playCompetition(boolean isOrdinatorBD) throws SQLException {
      if(initConnection()) {
         cstmt = con.prepareCall("{call playCompetition(?)}");
         cstmt.setBoolean(1, isOrdinatorBD);
         cstmt.execute();
         cstmt.close();
      }

   }

   public static void clearCompetitionResults() throws SQLException {
      if(initConnection()) {
         cstmt = con.prepareCall("{call clearCompetitionResults}");
         cstmt.execute();
         cstmt.close();
      }

   }

   public static String[][] getStatisticsGZGU(boolean count) {
      String[][] data = null;

      try {
         cstmt = con.prepareCall("{call getStatisticsGZGU(?)}", 1004, 1007);
         cstmt.setBoolean(1, count);
         rset = cstmt.executeQuery();
         int e = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(e > 0) {
            ResultSetMetaData rsmd = rset.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            data = new String[e][numberOfColumns];

            for(int curPos = 0; rset.next(); ++curPos) {
               for(int i = 0; i < numberOfColumns; ++i) {
                  if(rset.getObject(i + 1) != null) {
                     data[curPos][i] = rset.getObject(i + 1).toString();
                  }
               }
            }
         }

         cstmt.close();
         rset.close();
      } catch (SQLException var7) {
         var7.printStackTrace();
      }

      return data;
   }

   public static String[][] getStatisticsMinZdrav(boolean count) {
      String[][] data = null;

      try {
         cstmt = con.prepareCall("{call getStatisticsMinZdrav(?)}", 1004, 1007);
         cstmt.setBoolean(1, count);
         rset = cstmt.executeQuery();
         int e = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(e > 0) {
            ResultSetMetaData rsmd = rset.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            data = new String[e][numberOfColumns];

            for(int curPos = 0; rset.next(); ++curPos) {
               for(int i = 0; i < numberOfColumns; ++i) {
                  if(rset.getObject(i + 1) != null) {
                     data[curPos][i] = rset.getObject(i + 1).toString();
                  }
               }
            }
         }

         cstmt.close();
         rset.close();
      } catch (SQLException var7) {
         var7.printStackTrace();
      }

      return data;
   }

   public static String[][] getStatisticsRegionFull_SubmittedDocuments(boolean count) {
      String[][] data = null;

      try {
         cstmt = con.prepareCall("{call getStatisticsRegionFull_SubmittedDocuments(?)}", 1004, 1007);
         cstmt.setBoolean(1, count);
         rset = cstmt.executeQuery();
         int e = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(e > 0) {
            ResultSetMetaData rsmd = rset.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            data = new String[e][numberOfColumns];

            for(int curPos = 0; rset.next(); ++curPos) {
               for(int i = 0; i < numberOfColumns; ++i) {
                  if(rset.getObject(i + 1) != null) {
                     data[curPos][i] = rset.getObject(i + 1).toString();
                  }
               }
            }
         }

         cstmt.close();
         rset.close();
      } catch (SQLException var7) {
         var7.printStackTrace();
      }

      return data;
   }

   public static String[][] getStatisticsRegionFull_Enrolled(boolean count) {
      String[][] data = null;

      try {
         cstmt = con.prepareCall("{call getStatisticsRegionFull_Enrolled(?)}", 1004, 1007);
         cstmt.setBoolean(1, count);
         rset = cstmt.executeQuery();
         int e = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(e > 0) {
            ResultSetMetaData rsmd = rset.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            data = new String[e][numberOfColumns];

            for(int curPos = 0; rset.next(); ++curPos) {
               for(int i = 0; i < numberOfColumns; ++i) {
                  if(rset.getObject(i + 1) != null) {
                     data[curPos][i] = rset.getObject(i + 1).toString();
                  }
               }
            }
         }

         cstmt.close();
         rset.close();
      } catch (SQLException var7) {
         var7.printStackTrace();
      }

      return data;
   }

   public static String[][] getStatisticsRegionShort(boolean count) {
      String[][] data = null;

      try {
         cstmt = con.prepareCall("{call getStatisticsRegionShort(?)}", 1004, 1007);
         cstmt.setBoolean(1, count);
         rset = cstmt.executeQuery();
         int e = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(e > 0) {
            ResultSetMetaData rsmd = rset.getMetaData();
            int numberOfColumns = rsmd.getColumnCount();
            data = new String[e][numberOfColumns];

            for(int curPos = 0; rset.next(); ++curPos) {
               for(int i = 0; i < numberOfColumns; ++i) {
                  if(rset.getObject(i + 1) != null) {
                     data[curPos][i] = rset.getObject(i + 1).toString();
                  }
               }
            }
         }

         cstmt.close();
         rset.close();
      } catch (SQLException var7) {
         var7.printStackTrace();
      }

      return data;
   }

   public static String[] getAbiturientInfoForOrdinatorISByID(String aid) throws SQLException {
      try {
         String e = "select  * from InfoForOrdinatorIS where aid_abiturient = " + aid;
         cstmt = con.prepareCall(e, 1004, 1007);
         rset = cstmt.executeQuery();
         ResultSetMetaData rsmd = rset.getMetaData();
         int numberOfColumns = rsmd.getColumnCount();
         String[] result = new String[numberOfColumns];
         result[0] = aid;

         while(rset.next()) {
            for(int i = 0; i < numberOfColumns; ++i) {
               if(rset.getObject(i + 1) != null) {
                  if(rset.getObject(i + 1) instanceof Date) {
                     SimpleDateFormat format = new SimpleDateFormat();
                     format.applyPattern("yyyy-MM-dd");
                     Date docDate = format.parse(rset.getObject(i + 1).toString());
                     format.applyPattern("dd.MM.yyyy");
                     result[i] = format.format(docDate);
                  } else {
                     result[i] = rset.getObject(i + 1).toString();
                  }
               }
            }
         }

         cstmt.close();
         rset.close();
         return result;
      } catch (Exception var8) {
         return null;
      }
   }

   public static void updateAbiturientInfoForOrdinatorISByID(String aid, String[] data) throws SQLException {
      try {
         String[] e = new String[5];
         e[0] = aid;

         for(int i = 1; i < e.length; ++i) {
            e[i] = data[i - 1];
         }

         updateElementInTableById("InfoForOrdinatorIS", e);
      } catch (Exception var4) {
         var4.printStackTrace();
      }

   }
}

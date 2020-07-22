package outputDoc;

import backend.ModelDBConnection;
import java.io.File;
import java.io.PrintWriter;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class OutputExportFiles {

   private static String currentPath = (new File("")).getAbsolutePath();


   public static int getCurrentYear() {
      Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
      calendar.setTime(new Date());
      return calendar.get(1);
   }

   public static void printIndividualAchievements() throws Exception {
      String moduleTypeCode = ModelDBConnection.getDBName().equals("Aspirant")?"1_":"2_";
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      Connection con = ModelDBConnection.getConnection();
      Object rset1 = null;
      CallableStatement cstmt1 = null;
      File file = new File(currentPath + "\\InstitutionAchievements_" + moduleType + ".txt");
      if(!file.exists()) {
         file.createNewFile();
      }

      PrintWriter out = new PrintWriter(file.getAbsoluteFile());
      out.println("<Root>");
      out.println("<AuthData>");
      out.println("<Login>ulitinh@nizhgma.ru</Login>");
      out.println("<Pass>Grandopera200352</Pass>");
      out.println("</AuthData>");
      String query = "select id, name, score from IndividualAchievement order by id";
      CallableStatement cstmt = con.prepareCall(query, 1004, 1007);
      ResultSet rset = cstmt.executeQuery();
      int countOfTargOrgs = rset.last()?rset.getRow():0;
      rset.beforeFirst();
      if(countOfTargOrgs > 0) {
         out.println("<PackageData>");
         out.println("<InstitutionAchievements>");

         while(rset.next()) {
            out.println("<InstitutionAchievement>");
            out.println("<InstitutionAchievementUID>ia18_" + moduleTypeCode + rset.getInt(1) + "_" + getCurrentYear() + "</InstitutionAchievementUID>");
            out.println("<Name>" + rset.getString(2) + "_" + getCurrentYear() + "</Name>");
            out.println("<IdCategory>13</IdCategory>");
            out.println("<MaxValue>" + rset.getInt(3) + "</MaxValue>");
            out.println("<CampaignUID>" + getCurrentYear() + "_КВК" + "</CampaignUID>");
            out.println("</InstitutionAchievement>");
            String query1 = "update IndividualAchievement set codeFIS = \'ia18_" + moduleTypeCode + rset.getInt(1) + "_" + getCurrentYear() + "\' where id = " + rset.getInt(1) + ";";
            cstmt1 = con.prepareCall(query1, 1004, 1007);
            cstmt1.execute();
         }

         out.println("</InstitutionAchievements>");
         out.println("</PackageData>");
      }

      out.println("</Root>");
      out.close();
      rset.close();
   }

   public static void printTargetOrganisations() throws Exception {
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      Connection con = ModelDBConnection.getConnection();
      Object rset1 = null;
      CallableStatement cstmt1 = null;
      File file = new File(currentPath + "\\TargetOrgs_" + moduleType + ".txt");
      if(!file.exists()) {
         file.createNewFile();
      }

      PrintWriter out = new PrintWriter(file.getAbsoluteFile());
      out.println("<Root>");
      out.println("<AuthData>");
      out.println("<Login>ulitinh@nizhgma.ru</Login>");
      out.println("<Pass>Grandopera200352</Pass>");
      out.println("</AuthData>");
      if(moduleType.equals("ординатура")) {
         String query = "select id, name from TargetOrganisation order by id";
         CallableStatement cstmt = con.prepareCall(query, 1004, 1007);
         ResultSet rset = cstmt.executeQuery();
         int countOfTargOrgs = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(countOfTargOrgs > 0) {
            out.println("<PackageData>");
            out.println("<TargetOrganizations>");

            while(rset.next()) {
               out.println("<TargetOrganization>");
               out.println("<Name>" + rset.getString(2) + "_" + getCurrentYear() + "</Name>");
               out.println("<UID>corg18_2_" + rset.getInt(1) + "_" + getCurrentYear() + "</UID>");
               out.println("</TargetOrganization>");
               String query1 = "update TargetOrganisation set codeFIS = \'corg18_2_" + rset.getInt(1) + "_" + getCurrentYear() + "\' where id = " + rset.getInt(1) + ";";
               cstmt1 = con.prepareCall(query1, 1004, 1007);
               cstmt1.execute();
            }

            out.println("</TargetOrganizations>");
            out.println("</PackageData>");
         }

         out.println("</Root>");
         out.close();
         rset.close();
      }

   }

   public static void printAssesmentPlanGeneral() throws Exception {
      String moduleTypeCode = ModelDBConnection.getDBName().equals("Aspirant")?"1_":"2_";
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      Connection con = ModelDBConnection.getConnection();
      ResultSet rset = null;
      CallableStatement cstmt = null;
      File file = new File(currentPath + "\\AssesmentPlanGeneral_" + moduleType + ".txt");
      if(!file.exists()) {
         file.createNewFile();
      }

      PrintWriter out = new PrintWriter(file.getAbsoluteFile());
      out.println("<Root>");
      out.println("<AuthData>");
      out.println("<Login>login</Login>");
      out.println("<Pass>password</Pass>");
      out.println("</AuthData>");
      String query;
      int countOfTargOrgs;
      if(moduleType.equals("ординатура")) {
         query = "select\t" + (ModelDBConnection.getDBName().equals("Aspirant")?"codeFIS":"codeDirection") + ", " + "((select ISNULL(sum(AdmissionPlan.placeCount), 0) from AdmissionPlan where " + (ModelDBConnection.getDBName().equals("Aspirant")?"course = Course":"specialtyCode = Speciality") + ".id and competitiveGroup = 2) - (select ISNULL(sum(AdmissionPlan.placeCount), 0) from AdmissionPlan where " + (ModelDBConnection.getDBName().equals("Aspirant")?"course = Course":"specialtyCode = Speciality") + ".id and competitiveGroup in (1))), " + "(select ISNULL(sum(AdmissionPlan.placeCount), 0) from AdmissionPlan where " + (ModelDBConnection.getDBName().equals("Aspirant")?"course = Course":"specialtyCode = Speciality") + ".id and competitiveGroup in (3, 4)), " + "(select ISNULL(sum(AdmissionPlan.placeCount), 0) from AdmissionPlan where " + (ModelDBConnection.getDBName().equals("Aspirant")?"course = Course":"specialtyCode = Speciality") + ".id and competitiveGroup = 1) " + "from " + (ModelDBConnection.getDBName().equals("Aspirant")?"Course order by Course":"Speciality order by Speciality") + ".id";
         cstmt = con.prepareCall(query, 1004, 1007);
         rset = cstmt.executeQuery();
         countOfTargOrgs = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(countOfTargOrgs > 0) {
            out.println("<PackageData>");
            out.println("<AdmissionInfo>");
            out.println("<AdmissionVolume>");

            while(rset.next()) {
               out.println("<Item>");
               out.println("<UID>18_" + moduleTypeCode + rset.getString(1) + "_" + getCurrentYear() + "</UID>");
               out.println("<CampaignUID>" + getCurrentYear() + "_КВК" + "</CampaignUID>");
               out.println("<EducationLevelID>18</EducationLevelID>");
               out.println("<DirectionID>" + rset.getString(1) + "</DirectionID>");
               out.println("<NumberBudgetO>" + rset.getString(2) + "</NumberBudgetO>");
               out.println("<NumberPaidO>" + rset.getString(3) + "</NumberPaidO>");
               out.println("<NumberTargetO>" + rset.getString(4) + "</NumberTargetO>");
               out.println("<IsPlan>false</IsPlan>");
               out.println("</Item>");
            }

            out.println("</AdmissionVolume>");
            out.println("</AdmissionInfo>");
            out.println("</PackageData>");
         }
      }

      out.println("</Root>");
      out.close();
      rset.close();
      file = new File(currentPath + "\\AssesmentPlanDistributed_" + moduleType + ".txt");
      if(!file.exists()) {
         file.createNewFile();
      }

      out = new PrintWriter(file.getAbsoluteFile());
      out.println("<Root>");
      out.println("<AuthData>");
      out.println("<Login>login</Login>");
      out.println("<Pass>password</Pass>");
      out.println("</AuthData>");
      if(moduleType.equals("ординатура")) {
         query = "select\t" + (ModelDBConnection.getDBName().equals("Aspirant")?"codeFIS":"codeDirection") + ", " + "((select ISNULL(sum(AdmissionPlan.placeCount), 0) from AdmissionPlan where " + (ModelDBConnection.getDBName().equals("Aspirant")?"course = Course":"specialtyCode = Speciality") + ".id and competitiveGroup = 2) - (select ISNULL(sum(AdmissionPlan.placeCount), 0) from AdmissionPlan where " + (ModelDBConnection.getDBName().equals("Aspirant")?"course = Course":"specialtyCode = Speciality") + ".id and competitiveGroup in (1))), " + "(select ISNULL(sum(AdmissionPlan.placeCount), 0) from AdmissionPlan where " + (ModelDBConnection.getDBName().equals("Aspirant")?"course = Course":"specialtyCode = Speciality") + ".id and competitiveGroup in (3, 4)), " + "(select ISNULL(sum(AdmissionPlan.placeCount), 0) from AdmissionPlan where " + (ModelDBConnection.getDBName().equals("Aspirant")?"course = Course":"specialtyCode = Speciality") + ".id and competitiveGroup = 1) " + "from " + (ModelDBConnection.getDBName().equals("Aspirant")?"Course order by Course":"Speciality order by Speciality") + ".id";
         cstmt = con.prepareCall(query, 1004, 1007);
         rset = cstmt.executeQuery();
         countOfTargOrgs = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(countOfTargOrgs > 0) {
            out.println("<PackageData>");
            out.println("<AdmissionInfo>");
            out.println("<DistributedAdmissionVolume>");

            while(rset.next()) {
               out.println("<Item>");
               out.println("<AdmissionVolumeUID>18_" + moduleTypeCode + rset.getString(1) + "_" + getCurrentYear() + "</AdmissionVolumeUID>");
               out.println("<LevelBudget>1</LevelBudget>");
               out.println("<NumberBudgetO>" + rset.getString(2) + "</NumberBudgetO>");
               out.println("<NumberTargetO>" + rset.getString(4) + "</NumberTargetO>");
               out.println("<IsPlan>false</IsPlan>");
               out.println("</Item>");
            }

            out.println("</DistributedAdmissionVolume>");
            out.println("</AdmissionInfo>");
            out.println("</PackageData>");
         }
      }

      out.println("</Root>");
      out.close();
      rset.close();
   }

   public static void printCompetitiveGroups() throws Exception {
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      Connection con = ModelDBConnection.getConnection();
      ResultSet rset = null;
      CallableStatement cstmt = null;
      String[][] allEntrtanceTests = ModelDBConnection.getAllFromTableOrderedById("EntranceTest");
      File file = new File(currentPath + "\\CompetitiveGroups_" + moduleType + ".txt");
      if(!file.exists()) {
         file.createNewFile();
      }

      PrintWriter out = new PrintWriter(file.getAbsoluteFile());
      out.println("<Root>");
      out.println("<AuthData>");
      out.println("<Login>login</Login>");
      out.println("<Pass>password</Pass>");
      out.println("</AuthData>");
      if(moduleType.equals("ординатура")) {
         String query = "select\tCompetitiveGroup.codeFIS, EducationForm.codeFIS, case when targetOrganisation is null then null else (select codeFIS from TargetOrganisation where id = targetOrganisation) end, case when targetOrganisation is null then \'\' else (select name from TargetOrganisation where id = targetOrganisation) end, Speciality.codeDirection, Speciality.name, Speciality.codeByStandart, placeCount, CompetitiveGroup.id, case when targetOrganisation is null then \'\' else targetOrganisation end, isNULL((select placeCount from AdmissionPlan where specialtyCode = Speciality.id and educationForm = EducationForm.id and competitiveGroup = 1), 0)from\tAdmissionPlan join Speciality on (specialtyCode = Speciality.id) join EducationForm on (educationForm = EducationForm.id) join CompetitiveGroup on (competitiveGroup = CompetitiveGroup.id)";
         cstmt = con.prepareCall(query, 1004, 1007);
         rset = cstmt.executeQuery();
         int countOfCompGroups = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(countOfCompGroups > 0) {
            out.println("<PackageData>");
            out.println("<AdmissionInfo>");
            out.println("<CompetitiveGroups>");

            while(rset.next()) {
               out.println("<CompetitiveGroup>");
               out.println("<UID>18_2_" + rset.getString(1) + "_" + rset.getString(2) + "_" + rset.getString(5) + "_" + rset.getString(9) + "_" + rset.getString(10) + "_" + getCurrentYear() + "</UID>");
               out.println("<CampaignUID>" + getCurrentYear() + "_КВК" + "</CampaignUID>");
               out.println("<Name>" + rset.getString(6) + (!rset.getString(4).equals("")?": " + rset.getString(4):"_" + rset.getString(9)) + "_" + getCurrentYear() + "</Name>");
               out.println("<EducationLevelID>18</EducationLevelID>");
               out.println("<EducationSourceID>" + rset.getString(1) + "</EducationSourceID>");
               out.println("<EducationFormID>" + rset.getString(2) + "</EducationFormID>");
               out.println("<DirectionID>" + rset.getString(5) + "</DirectionID>");
               out.println("<EduPrograms>");
               out.println("<EduProgram>");
               out.println("<UID>op18_2_" + rset.getString(5) + "_" + getCurrentYear() + "</UID>");
               out.println("</EduProgram>");
               out.println("</EduPrograms>");
               String var9;
               switch((var9 = rset.getString(1)).hashCode()) {
               case 1571:
                  if(var9.equals("14")) {
                     out.println("<CompetitiveGroupItem>");
                     out.println("<NumberBudgetO>" + (Integer.valueOf(rset.getString(8)).intValue() - Integer.valueOf(rset.getString(11)).intValue()) + "</NumberBudgetO>");
                     out.println("</CompetitiveGroupItem>");
                     out.println("<LevelBudget>1</LevelBudget>");
                  }
                  break;
               case 1572:
                  if(var9.equals("15")) {
                     out.println("<CompetitiveGroupItem>");
                     out.println("<NumberPaidO>" + rset.getString(8) + "</NumberPaidO>");
                     out.println("</CompetitiveGroupItem>");
                  }
                  break;
               case 1573:
                  if(var9.equals("16")) {
                     out.println("<CompetitiveGroupItem>");
                     out.println("<NumberTargetO>" + rset.getString(8) + "</NumberTargetO>");
                     out.println("</CompetitiveGroupItem>");
                     String i = "select codeFIS from TargetOrganisation order by id";
                     ResultSet rsetTargetOrgs = null;
                     CallableStatement cstmtTargetOrgs = null;
                     cstmtTargetOrgs = con.prepareCall(i, 1004, 1007);
                     rsetTargetOrgs = cstmtTargetOrgs.executeQuery();
                     int countOfTargOrgs = rsetTargetOrgs.last()?rsetTargetOrgs.getRow():0;
                     rsetTargetOrgs.beforeFirst();
                     if(countOfTargOrgs > 0) {
                        out.println("<TargetOrganizations>");

                        while(rsetTargetOrgs.next()) {
                           out.println("<TargetOrganization>");
                           out.println("<UID>" + rsetTargetOrgs.getString(1) + "</UID>");
                           out.println("</TargetOrganization>");
                        }

                        out.println("</TargetOrganizations>");
                     }

                     rsetTargetOrgs.close();
                     cstmtTargetOrgs.close();
                     out.println("<LevelBudget>1</LevelBudget>");
                  }
               }

               out.println("<EntranceTestItems>");

               for(int var14 = 0; var14 < allEntrtanceTests.length; ++var14) {
                  out.println("<EntranceTestItem>");
                  out.println("<UID>et18_2_" + rset.getString(1) + "_" + rset.getString(2) + "_" + rset.getString(5) + "_" + rset.getString(9) + "_" + rset.getString(10) + "_" + allEntrtanceTests[var14][0] + "_" + getCurrentYear() + "</UID>");
                  out.println("<EntranceTestTypeID>1</EntranceTestTypeID>");
                  out.println("<MinScore>" + allEntrtanceTests[var14][2] + "</MinScore>");
                  out.println("<EntranceTestPriority>" + allEntrtanceTests[var14][0] + "</EntranceTestPriority>");
                  out.println("<EntranceTestSubject>");
                  out.println("<SubjectName>" + allEntrtanceTests[var14][1] + "</SubjectName>");
                  out.println("</EntranceTestSubject>");
                  out.println("</EntranceTestItem>");
               }

               out.println("</EntranceTestItems>");
               out.println("</CompetitiveGroup>");
            }

            out.println("</CompetitiveGroups>");
            out.println("</AdmissionInfo>");
            out.println("</PackageData>");
         }

         out.println("</Root>");
         out.close();
         rset.close();
      }

   }

   public static void printEducationPrograms() throws Exception {
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      Connection con = ModelDBConnection.getConnection();
      ResultSet rset = null;
      CallableStatement cstmt = null;
      String[][] allEntrtanceTests = ModelDBConnection.getAllFromTableOrderedById("EntranceTest");
      File file = new File(currentPath + "\\EducationPrograms_" + moduleType + ".txt");
      if(!file.exists()) {
         file.createNewFile();
      }

      PrintWriter out = new PrintWriter(file.getAbsoluteFile());
      out.println("<Root>");
      out.println("<AuthData>");
      out.println("<Login>login</Login>");
      out.println("<Pass>password</Pass>");
      out.println("</AuthData>");
      if(moduleType.equals("ординатура")) {
         String query = "select\tdistinct cast(CompetitiveGroup.codeFIS as varchar(max)), cast(EducationForm.codeFIS as varchar(max)), case when targetOrganisation is null then null else (select cast(codeFIS as varchar(max)) from TargetOrganisation where id = targetOrganisation) end, case when targetOrganisation is null then \'\' else (select cast(name as varchar(max)) from TargetOrganisation where id = targetOrganisation) end, cast(Speciality.codeDirection as varchar(max)), cast(Speciality.name as varchar(max)), cast(Speciality.codeByStandart as varchar(max)), placeCount, CompetitiveGroup.id, case when targetOrganisation is null then \'\' else targetOrganisation end from\tAdmissionPlan join Speciality on (specialtyCode = Speciality.id) join EducationForm on (educationForm = EducationForm.id) join CompetitiveGroup on (competitiveGroup = CompetitiveGroup.id)";
         cstmt = con.prepareCall(query, 1004, 1007);
         rset = cstmt.executeQuery();
         int countOfCompGroups = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(countOfCompGroups > 0) {
            out.println("<PackageData>");
            out.println("<InstitutionPrograms>");

            while(rset.next()) {
               out.println("<InstitutionProgram>");
               out.println("<UID>op18_2_" + rset.getString(5) + "_" + getCurrentYear() + "</UID>");
               out.println("<Name>" + rset.getString(6) + "</Name>");
               out.println("<Code>" + rset.getString(7) + "</Code>");
               out.println("</InstitutionProgram>");
            }

            out.println("</InstitutionPrograms>");
            out.println("</PackageData>");
         }

         out.println("</Root>");
         out.close();
         rset.close();
      }

   }

   public static void printAbiturientsAssesments() throws Exception {
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      Connection con = ModelDBConnection.getConnection();
      File file = new File(currentPath + "\\Abiturients_" + moduleType + "_" + (new SimpleDateFormat("dd.MM.yyyy")).format(new Date()) + ".xml");
      if(!file.exists()) {
         file.createNewFile();
      }

      PrintWriter out = new PrintWriter(file.getAbsoluteFile());
      out.println("<Root>");
      out.println("<AuthData>");
      out.println("<Login>login</Login>");
      out.println("<Pass>password</Pass>");
      out.println("</AuthData>");
      if(moduleType.equals("ординатура")) {
         String query_generalInfo = "select\taid, SName, FName, isNULL(MName, \'\'), (select codeFIS from Gender where id = id_gender), isNULL(email, \'\'), (select codeFIS from Region where id = id_region), (select codeFIS from LocalityType where id = id_localityType), factAddress, registrationDate, isNULL(needHostel, 0), case when returnDate is null then 1 else 0 end, isNULL(AbiturientPassport.paspSeries, \'\'), AbiturientPassport.paspNumber, AbiturientPassport.paspGivenDate, (select codeFIS from PassportType where id = AbiturientPassport.id_passportType), (select codeFIS from Nationality where id = id_nationality), Birthday, Birthplace, isNULL(AbiturientHigherEducation.diplomaSeries, \'\'), isNULL(AbiturientHigherEducation.diplomaNumber, \'\'), isNULL(AbiturientHigherEducation.instituteName, \'\'), returnDate, id_returnReason from\tAbiturient join AbiturientAddress on (Abiturient.aid = AbiturientAddress.aid_abiturient) join AbiturientPassport on (Abiturient.aid = AbiturientPassport.aid_abiturient) join AbiturientHigherEducation on (Abiturient.aid = AbiturientHigherEducation.aid_abiturient) order by aid";
         CallableStatement cstmt = con.prepareCall(query_generalInfo, 1004, 1007);
         ResultSet rset = cstmt.executeQuery();
         int countOfAbiturientss = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(countOfAbiturientss > 0) {
            out.println("<PackageData>");
            out.println("<Applications>");

            while(rset.next()) {
               out.println("<Application>");
               out.println("<UID>" + rset.getInt(1) + "_" + "18_" + "2_" + getCurrentYear() + "</UID>");
               out.println("<ApplicationNumber>" + rset.getInt(1) + "_" + "18_" + "2_" + getCurrentYear() + "</ApplicationNumber>");
               out.println("<Entrant>");
               out.println("<UID>eo" + rset.getInt(1) + "_" + "18_" + "2_" + getCurrentYear() + "</UID>");
               out.println("<LastName>" + rset.getString(2) + "</LastName>");
               out.println("<FirstName>" + rset.getString(3) + "</FirstName>");
               if(!rset.getString(4).equals("")) {
                  out.println("<MiddleName>" + rset.getString(4) + "</MiddleName>");
               }

               out.println("<GenderID>" + rset.getString(5) + "</GenderID>");
               out.println("<EmailOrMailAddress>");
               if(!rset.getString(6).equals("")) {
                  out.println("<Email>" + rset.getString(6) + "</Email>");
               }

               out.println("<MailAddress>");
               out.println("<RegionID>" + rset.getString(7) + "</RegionID>");
               out.println("<TownTypeID>" + rset.getString(8) + "</TownTypeID>");
               out.println("<Address>" + rset.getString(9) + "</Address>");
               out.println("</MailAddress>");
               out.println("</EmailOrMailAddress>");
               out.println("</Entrant>");
               out.println("<RegistrationDate>" + rset.getString(10) + "T09:00:00</RegistrationDate>");
               out.println("<NeedHostel>" + rset.getInt(11) + "</NeedHostel>");
               out.println("<StatusID>" + (rset.getInt(12) > 0?4:6) + "</StatusID>");
               if (rset.getInt(12) == 0) {
                  out.println("<ReturnDocumentsDate>" + rset.getString(23) + "T09:00:00</ReturnDocumentsDate>");
                  out.println("<ReturnDocumentsTypeId>" + rset.getInt(24) + "</ReturnDocumentsTypeId>");
               };
               String query_competitiveGroups = "select  CompetitiveGroup.codeFIS, EducationForm.codeFIS, Speciality.codeDirection, CompetitiveGroup.id, case when targetOrganisation is null then \'\' else targetOrganisation end, case when targetOrganisation is null then \'\' else (select codeFIS from TargetOrganisation where id = targetOrganisation) end, case when originalsReceivedDate is null then \'\' else cast(originalsReceivedDate as varchar) end from\tAbiturientCompetitiveGroup join Speciality on (speciality = Speciality.id) join EducationForm on (educationForm = EducationForm.id) join CompetitiveGroup on (competitiveGroup = CompetitiveGroup.id) where aid_abiturient = " + rset.getInt(1);
               CallableStatement cstmt1 = con.prepareCall(query_competitiveGroups, 1004, 1007);
               ResultSet rset1 = cstmt1.executeQuery();
               int countOfCompetitiveGroupsByCurAbiturient = rset1.last()?rset1.getRow():0;
               rset1.beforeFirst();
               String[] competitiveGroupsByCurAbiturient = new String[countOfCompetitiveGroupsByCurAbiturient];
               int curCompetitiveGroupsByCurAbiturient = 0;
               out.println("<FinSourceAndEduForms>");

               while(rset1.next()) {
                  competitiveGroupsByCurAbiturient[curCompetitiveGroupsByCurAbiturient] = "18_2_" + rset1.getString(1) + "_" + rset1.getString(2) + "_" + rset1.getString(3) + "_" + rset1.getString(4) + "_" + rset1.getString(5) + "_" + getCurrentYear();
                  out.println("<FinSourceEduForm>");
                  out.println("<CompetitiveGroupUID>" + competitiveGroupsByCurAbiturient[curCompetitiveGroupsByCurAbiturient] + "</CompetitiveGroupUID>");
                  if(!rset1.getString(6).equals("")) {
                     out.println("<TargetOrganizationUID>" + rset1.getString(6) + "</TargetOrganizationUID>");
                  }

                  if(!rset1.getString(7).equals("")) {
                     out.println("<IsAgreedDate>" + rset1.getString(7) + "T09:00:00</IsAgreedDate>");
                  }

                  out.println("</FinSourceEduForm>");
                  ++curCompetitiveGroupsByCurAbiturient;
               }

               rset1.close();
               out.println("</FinSourceAndEduForms>");
               String query_EntranceTests = "select\tid_entranceTest, isNULL(score, 0), (select name from EntranceTest where id = id_entranceTest), isNULL(testDate, (select certificateGivenDate from AbiturientAccreditationCertificate where AbiturientEntranceTests.aid_abiturient = AbiturientAccreditationCertificate.aid_abiturient)), (select codeFIS from AssessmentBase where id = id_assessmentBase) from\tAbiturientEntranceTests where aid_abiturient = " + rset.getInt(1);
               cstmt1 = con.prepareCall(query_EntranceTests, 1004, 1007);
               rset1 = cstmt1.executeQuery();
               int countOfEntranceTestsByCurAbiturient = rset1.last()?rset1.getRow():0;
               rset1.beforeFirst();
               String[][] entranceTestsDetailsByCurAbiturient = new String[countOfEntranceTestsByCurAbiturient][5];

               for(byte curEntranceTestByCurAbiturient = 0; rset1.next(); entranceTestsDetailsByCurAbiturient[curEntranceTestByCurAbiturient][4] = rset1.getString(5)) {
                  entranceTestsDetailsByCurAbiturient[curEntranceTestByCurAbiturient][0] = rset1.getString(1);
                  entranceTestsDetailsByCurAbiturient[curEntranceTestByCurAbiturient][1] = rset1.getString(2);
                  entranceTestsDetailsByCurAbiturient[curEntranceTestByCurAbiturient][2] = rset1.getString(3);
                  entranceTestsDetailsByCurAbiturient[curEntranceTestByCurAbiturient][3] = rset1.getString(4);
               }

               out.println("<EntranceTestResults>");

               for(int indAchievements = 0; indAchievements < entranceTestsDetailsByCurAbiturient.length; ++indAchievements) {
                  for(int customDoc = 0; customDoc < competitiveGroupsByCurAbiturient.length; ++customDoc) {
                     out.println("<EntranceTestResult>");
                     out.println("<UID>etr_" + rset.getInt(1) + "_" + "18_" + "2_" + getCurrentYear() + competitiveGroupsByCurAbiturient[customDoc] + entranceTestsDetailsByCurAbiturient[indAchievements][0] + "</UID>");
                     out.println("<ResultValue>" + entranceTestsDetailsByCurAbiturient[indAchievements][1] + "</ResultValue>");
                     out.println("<ResultSourceTypeID>2</ResultSourceTypeID>");
                     out.println("<EntranceTestSubject>");
                     out.println("<SubjectName>" + entranceTestsDetailsByCurAbiturient[indAchievements][2] + "</SubjectName>");
                     out.println("</EntranceTestSubject>");
                     out.println("<EntranceTestTypeID>1</EntranceTestTypeID>");
                     out.println("<CompetitiveGroupUID>" + competitiveGroupsByCurAbiturient[customDoc] + "</CompetitiveGroupUID>");
                     out.println("<ResultDocument>");
                     out.println("<InstitutionDocument>");
                     out.println("<DocumentNumber>el_" + rset.getInt(1) + "_" + "18_" + "2_" + getCurrentYear() + competitiveGroupsByCurAbiturient[customDoc] + entranceTestsDetailsByCurAbiturient[indAchievements][0] + "</DocumentNumber>");
                     out.println("<DocumentDate>" + (entranceTestsDetailsByCurAbiturient[indAchievements][3] != null?entranceTestsDetailsByCurAbiturient[indAchievements][3]:getCurrentYear() + "-08-04") + "</DocumentDate>");
                     out.println("<DocumentTypeID>" + entranceTestsDetailsByCurAbiturient[indAchievements][4] + "</DocumentTypeID>");
                     out.println("</InstitutionDocument>");
                     out.println("</ResultDocument>");
                     out.println("</EntranceTestResult>");
                  }
               }

               out.println("</EntranceTestResults>");
               out.println("<ApplicationDocuments>");
               out.println("<IdentityDocument>");
               out.println("<UID>id_" + rset.getInt(1) + "_" + "18_" + "2_" + getCurrentYear() + "</UID>");
               out.println("<OriginalReceivedDate>" + rset.getString(10) + "</OriginalReceivedDate>");
               if(!rset.getString(13).equals("")) {
                  out.println("<DocumentSeries>" + rset.getString(13) + "</DocumentSeries>");
               }

               out.println("<DocumentNumber>" + rset.getString(14) + "</DocumentNumber>");
               out.println("<DocumentDate>" + rset.getString(15) + "</DocumentDate>");
               out.println("<IdentityDocumentTypeID>" + rset.getString(16) + "</IdentityDocumentTypeID>");
               out.println("<NationalityTypeID>" + rset.getString(17) + "</NationalityTypeID>");
               out.println("<BirthDate>" + rset.getString(18) + "</BirthDate>");
               if(rset.getString(19) != null) {
                  out.println("<BirthPlace>" + rset.getString(19) + "</BirthPlace>");
               }

               out.println("</IdentityDocument>");
               out.println("<EduDocuments>");
               out.println("<EduDocument>");
               out.println("<HighEduDiplomaDocument>");
               out.println("<UID>ed_" + rset.getInt(1) + "_" + "18_" + "2_" + getCurrentYear() + "</UID>");
               out.println("<OriginalReceivedDate>" + rset.getString(10) + "</OriginalReceivedDate>");
               if(!rset.getString(20).equals("")) {
                  out.println("<DocumentSeries>" + rset.getString(20) + "</DocumentSeries>");
               }

               out.println("<DocumentNumber>" + rset.getString(21) + "</DocumentNumber>");
               out.println("<DocumentOrganization>" + rset.getString(22) + "</DocumentOrganization>");
               out.println("</HighEduDiplomaDocument>");
               out.println("</EduDocument>");
               out.println("</EduDocuments>");
               String query_IndAchievements = "select\tid_individual_achievement, (select codeFIS from IndividualAchievement where id = id_individual_achievement), score, isNULL(documentName, \'\'), case when issueDate is null then \'\' else cast(issueDate as varchar) end, isNULL(issuedBy, \'\') from\tAbiturientIndividualAchievement where aid_abiturient = " + rset.getInt(1);
               String var22 = "";
               String var23 = "";
               cstmt1 = con.prepareCall(query_IndAchievements, 1004, 1007);
               rset1 = cstmt1.executeQuery();
               int countOfIndAchievementsByCurAbiturient = rset1.last()?rset1.getRow():0;
               rset1.beforeFirst();
               if(countOfIndAchievementsByCurAbiturient > 0) {
                  out.println("<CustomDocuments>");

                  for(var22 = "<IndividualAchievements>"; rset1.next(); var23 = "") {
                     var22 = var22 + "<IndividualAchievement><IAUID>ia" + rset.getInt(1) + "_" + "18_" + "2_" + getCurrentYear() + rset1.getString(1) + "</IAUID>" + "<InstitutionAchievementUID>" + rset1.getString(2) + "</InstitutionAchievementUID>" + "<IAMark>" + rset1.getInt(3) + "</IAMark>" + "<IADocumentUID>iad" + rset.getInt(1) + "_" + "18_" + "2_" + getCurrentYear() + rset1.getString(1) + "</IADocumentUID>" + "</IndividualAchievement>";
                     var23 = var23 + "<CustomDocument><UID>iad" + rset.getInt(1) + "_" + "18_" + "2_" + getCurrentYear() + rset1.getString(1) + "</UID>" + "<DocumentName>" + rset1.getString(4) + "</DocumentName>" + "<DocumentDate>" + (rset1.getString(5).equals("")?rset.getString(10):rset1.getString(5)) + "</DocumentDate>" + "<DocumentOrganization>" + rset1.getString(6) + "</DocumentOrganization>" + "</CustomDocument>";
                     out.println(var23);
                  }

                  out.println("</CustomDocuments>");
                  var22 = var22 + "</IndividualAchievements>";
               }

               out.println("</ApplicationDocuments>");
               out.println(var22);
               out.println("</Application>");
            }

            out.println("</Applications>");
            out.println("</PackageData>");
         }

         out.println("</Root>");
         out.close();
         rset.close();
      }

   }

   public static void printAbiturientsForOrdIS() throws Exception {
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      Connection con = ModelDBConnection.getConnection();
      File file = new File(currentPath + "\\Abiturients_IS_" + moduleType + "_" + (new SimpleDateFormat("dd.MM.yyyy")).format(new Date()) + ".csv");
      if(!file.exists()) {
         file.createNewFile();
      }

      PrintWriter out = new PrintWriter(file.getAbsoluteFile(), "UTF8");
      if(moduleType.equals("ординатура")) {
         String query_generalInfo = "select\tAbiturient.aid,  isNULL(Abiturient.snils, \'\'),  isNULL(Abiturient.SName, \'\'),  isNULL(Abiturient.FName, \'\'),  isNULL(Abiturient.MName, \'\'), \'1.2.643.5.1.13.13.12.4.52.55\', \'3\', CONVERT(varchar, Abiturient.Birthday, 104), Nationality.name, Speciality.codeByStandart, case when AbiturientCompetitiveGroup.competitiveGroup in (1,2,6,7,8,9,10,11,12,13,14,15,16,17) then \'бюджет\' else \'договор\' end, CONVERT(varchar, Abiturient.registrationDate, 104), case when AbiturientCompetitiveGroup.competitiveGroup in (1,6,7,8,9,10,11,12,13,14,15,16,17) then \'да\' else \'нет\' end from\tAbiturient,  AbiturientCompetitiveGroup, Speciality, Nationality  where\t(Abiturient.aid = AbiturientCompetitiveGroup.aid_abiturient and Speciality.id = AbiturientCompetitiveGroup.speciality and Abiturient.id_nationality = Nationality.id and Abiturient.returnDate is null) and snils != 11111111111 order by Abiturient.aid";
         CallableStatement cstmt = con.prepareCall(query_generalInfo, 1004, 1007);
         ResultSet rset = cstmt.executeQuery();
         int countOfAbiturientss = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(countOfAbiturientss > 0) {
            out.println("snils;surname;name;patronymic;oid;compaignId;dateOfBirth;citizenship;specialty;financingType;applicationDate;targetReception;testResultType;testResultOrganization;testResultYear");

            ResultSet rset1;
            for(; rset.next(); rset1.close()) {
               String citizenCode;
               label162: {
                  label161: {
                     out.print(rset.getString(2) + ";");
                     out.print(rset.getString(3) + ";");
                     out.print(rset.getString(4) + ";");
                     out.print(rset.getString(5) + ";");
                     out.print(rset.getString(6) + ";");
                     out.print(rset.getString(7) + ";");
                     out.print(rset.getString(8) + ";");
                     citizenCode = "";
                     String var12;
                     switch((var12 = rset.getString(9)).hashCode()) {
                     case -1764972107:
                        if(var12.equals("Приднестровская Молдавская Республика")) {
                           break label161;
                        }
                        break;
                     case -1761702881:
                        if(var12.equals("Боливия")) {
                           citizenCode = "68";
                           break label162;
                        }
                        break;
                     case -1164139097:
                        if(var12.equals("Киргизия")) {
                           citizenCode = "417";
                           break label162;
                        }
                        break;
                     case -1108219200:
                        if(var12.equals("Туркмения")) {
                           citizenCode = "795";
                           break label162;
                        }
                        break;
                     case -985101012:
                        if(var12.equals("Марокко")) {
                           citizenCode = "504";
                           break label162;
                        }
                        break;
                     case -548678217:
                        if(var12.equals("Азербайджан")) {
                           citizenCode = "31";
                           break label162;
                        }
                        break;
                     case -546214460:
                        if(var12.equals("Узбекистан")) {
                           citizenCode = "860";
                           break label162;
                        }
                        break;
                     case -53140485:
                        if(var12.equals("Танзания, Объединенная Республика")) {
                           citizenCode = "834";
                           break label162;
                        }
                        break;
                     case 119167706:
                        if(var12.equals("Нигерия")) {
                           citizenCode = "566";
                           break label162;
                        }
                        break;
                     case 319709323:
                        if(var12.equals("Кот д Ивуар")) {
                           citizenCode = "384";
                           break label162;
                        }
                        break;
                     case 466517392:
                        if(var12.equals("Гондурас")) {
                           citizenCode = "340";
                           break label162;
                        }
                        break;
                     case 675953278:
                        if(var12.equals("Иордания")) {
                           citizenCode = "400";
                           break label162;
                        }
                        break;
                     case 878730162:
                        if(var12.equals("Египет")) {
                           citizenCode = "818";
                           break label162;
                        }
                        break;
                     case 933323717:
                        if(var12.equals("Замбия")) {
                           citizenCode = "894";
                           break label162;
                        }
                        break;
                     case 942503986:
                        if(var12.equals("Российская Федерация")) {
                           citizenCode = "643";
                           break label162;
                        }
                        break;
                     case 993796019:
                        if(var12.equals("Алжир")) {
                           citizenCode = "12";
                           break label162;
                        }
                        break;
                     case 1002859225:
                        if(var12.equals("Кения")) {
                           citizenCode = "404";
                           break label162;
                        }
                        break;
                     case 1003127172:
                        if(var12.equals("Конго")) {
                           citizenCode = "178";
                           break label162;
                        }
                        break;
                     case 1003861282:
                        if(var12.equals("Ливан")) {
                           citizenCode = "422";
                           break label162;
                        }
                        break;
                     case 1009732031:
                        if(var12.equals("Судан")) {
                           citizenCode = "736";
                           break label162;
                        }
                        break;
                     case 1036464021:
                        if(var12.equals("Кувейт")) {
                           citizenCode = "414";
                           break label162;
                        }
                        break;
                     case 1048020028:
                        if(var12.equals("Латвия")) {
                           citizenCode = "428";
                           break label162;
                        }
                        break;
                     case 1218330052:
                        if(var12.equals("Украина")) {
                           citizenCode = "804";
                           break label162;
                        }
                        break;
                     case 1232543630:
                        if(var12.equals("Сомали")) {
                           citizenCode = "706";
                           break label162;
                        }
                        break;
                     case 1490499179:
                        if(var12.equals("Эквадор")) {
                           citizenCode = "218";
                           break label162;
                        }
                        break;
                     case 1703863755:
                        if(var12.equals("Армения")) {
                           citizenCode = "51";
                           break label162;
                        }
                        break;
                     case 1706105124:
                        if(var12.equals("Эстония")) {
                           citizenCode = "233";
                           break label162;
                        }
                        break;
                     case 1817227143:
                        if(var12.equals("Беларусь")) {
                           citizenCode = "112";
                           break label162;
                        }
                        break;
                     case 2037640292:
                        if(var12.equals("Казахстан")) {
                           citizenCode = "398";
                           break label162;
                        }
                        break;
                     case 17576532:
                        if(var12.equals("Йеменская Республика")) {
                           citizenCode = "887";
                           break label162;
                        }
                        break;
                        
                     case 2068443093:
                        if(var12.equals("Республика Молдова")) {
                           break label161;
                        }
                     }

                     citizenCode = rset.getString(9);
                     break label162;
                  }

                  citizenCode = "498";
               }

               out.print(citizenCode + ";");
               out.print(rset.getString(10) + ";");
               out.print(rset.getString(11) + ";");
               out.print(rset.getString(12) + ";");
               out.print(rset.getString(13) + ";");
               String query_EntranceTests = "select  * from InfoForOrdinatorIS where aid_abiturient = " + rset.getInt(1);
               System.out.println(query_EntranceTests);
               CallableStatement cstmt1 = con.prepareCall(query_EntranceTests, 1004, 1007);
               rset1 = cstmt1.executeQuery();
               int countOfEntranceTestsByCurAbiturient = rset1.last()?rset1.getRow():0;
               rset1.beforeFirst();
               rset1.next();
               System.out.println(countOfEntranceTestsByCurAbiturient);
               if(countOfEntranceTestsByCurAbiturient > 0) {
                  out.print(rset1.getString(2) + ";");
                  out.print(rset1.getString(3) + ";");
                  out.println(rset1.getString(4));
               } else {
                  out.println(";;");
               }
            }
         }

         out.close();
         rset.close();
      }

   }

   public static void printforOrdISAbiturientsResultsRequest() throws Exception {
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      Connection con = ModelDBConnection.getConnection();
      File file = new File(currentPath + "\\Abiturients_results_request_" + moduleType + "_" + (new SimpleDateFormat("dd.MM.yyyy")).format(new Date()) + ".txt");
      if(!file.exists()) {
         file.createNewFile();
      }

      PrintWriter out = new PrintWriter(file.getAbsoluteFile(), "UTF8");
      if(moduleType.equals("ординатура")) {
         String query_generalInfo = "select\tAbiturient.aid,  isNULL(Abiturient.snils, \'\'),  \'1.2.643.5.1.13.13.12.4.52.55\', CONVERT(varchar, Abiturient.Birthday, 104) from\tAbiturient order by Abiturient.aid";
         CallableStatement cstmt = con.prepareCall(query_generalInfo, 1004, 1007);
         ResultSet rset = cstmt.executeQuery();
         int countOfAbiturientss = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(countOfAbiturientss > 0) {
            out.println("snils;oid;dateOfBirth;testResultType;testResultYear;testResultOrganization;specialty");

            ResultSet rset1;
            for(; rset.next(); rset1.close()) {
               out.print(rset.getString(2) + ";");
               out.print(rset.getString(3) + ";");
               out.print(rset.getString(4) + ";");
               String query_EntranceTests = "select  * from InfoForOrdinatorIS where aid_abiturient = " + rset.getInt(1);
               CallableStatement cstmt1 = con.prepareCall(query_EntranceTests, 1004, 1007);
               rset1 = cstmt1.executeQuery();
               int countOfEntranceTestsByCurAbiturient = rset1.last()?rset1.getRow():0;
               rset1.beforeFirst();
               rset1.next();
               if(countOfEntranceTestsByCurAbiturient > 0) {
                  out.print(rset1.getString(2) + ";");
                  out.print(rset1.getString(4) + ";");
                  out.print(rset1.getString(3) + ";");
                  out.println(rset1.getString(5));
               } else {
                  out.println(";;;");
               }
            }
         }

         out.close();
         rset.close();
      }

   }

   public static void printforOrdISAbiturientsLoginRequest() throws Exception {
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      Connection con = ModelDBConnection.getConnection();
      File file = new File(currentPath + "\\Abiturients_login_request_" + moduleType + "_" + (new SimpleDateFormat("dd.MM.yyyy")).format(new Date()) + ".txt");
      if(!file.exists()) {
         file.createNewFile();
      }

      PrintWriter out = new PrintWriter(file.getAbsoluteFile(), "UTF8");
      if(moduleType.equals("ординатура")) {
         String query_generalInfo = "select\tAbiturient.aid,  isNULL(Abiturient.snils, \'\'),  \'1.2.643.5.1.13.13.12.4.52.55\', CONVERT(varchar, Abiturient.Birthday, 104), isNULL(CONVERT(varchar, AbiturientEntranceTests.testDate, 104), \'\') from\tAbiturient, AbiturientEntranceTests where (Abiturient.aid = AbiturientEntranceTests.aid_abiturient and isNULL(CONVERT(varchar, AbiturientEntranceTests.testDate, 104), \'\') not like \'\' and isNULL(Abiturient.snils, \'\') not in (\'\', \'-\')) order by Abiturient.aid";
         System.out.println(query_generalInfo);
         CallableStatement cstmt = con.prepareCall(query_generalInfo, 1004, 1007);
         ResultSet rset = cstmt.executeQuery();
         int countOfAbiturientss = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(countOfAbiturientss > 0) {
            out.println("snils;oid;dateOfBirth;specialty;date;attemptType;retryReason");

            ResultSet rset1;
            for(; rset.next(); rset1.close()) {
               out.print(rset.getString(2) + ";");
               out.print(rset.getString(3) + ";");
               out.print(rset.getString(4) + ";");
               String query_EntranceTests = "select  * from InfoForOrdinatorIS where aid_abiturient = " + rset.getInt(1);
               CallableStatement cstmt1 = con.prepareCall(query_EntranceTests, 1004, 1007);
               rset1 = cstmt1.executeQuery();
               int countOfEntranceTestsByCurAbiturient = rset1.last()?rset1.getRow():0;
               rset1.beforeFirst();
               rset1.next();
               if(countOfEntranceTestsByCurAbiturient > 0) {
                  out.print(rset1.getString(5) + ";");
                  out.println(rset.getString(5) + ";1;");
               } else {
                  out.println(";;;");
               }
            }
         }

         out.close();
         rset.close();
      }

   }

   public static void printAbiturientsReturnForOrdIS() throws Exception {
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      Connection con = ModelDBConnection.getConnection();
      File file = new File(currentPath + "\\Abiturients_IS_Return_" + moduleType + "_" + (new SimpleDateFormat("dd.MM.yyyy")).format(new Date()) + ".txt");
      if(!file.exists()) {
         file.createNewFile();
      }

      PrintWriter out = new PrintWriter(file.getAbsoluteFile(), "UTF8");
      if(moduleType.equals("ординатура")) {
         String query_generalInfo = "select\tAbiturient.aid,  isNULL(Abiturient.snils, \'\'),  isNULL(Abiturient.SName, \'\'),  isNULL(Abiturient.FName, \'\'),  isNULL(Abiturient.MName, \'\'), \'1.2.643.5.1.13.13.12.4.52.55\', \'2\', CONVERT(varchar, Abiturient.Birthday, 104), Nationality.name, Speciality.codeByStandart, case when AbiturientCompetitiveGroup.competitiveGroup in (1,2) then \'бюджет\' else \'договор\' end, CONVERT(varchar, Abiturient.registrationDate, 104), case when AbiturientCompetitiveGroup.competitiveGroup in (1) then \'да\' else \'нет\' end from\tAbiturient,  AbiturientCompetitiveGroup, Speciality, Nationality  where\t(Abiturient.aid = AbiturientCompetitiveGroup.aid_abiturient and Speciality.id = AbiturientCompetitiveGroup.speciality and Abiturient.id_nationality = Nationality.id and Abiturient.returnDate is not null)  order by Abiturient.aid";
         CallableStatement cstmt = con.prepareCall(query_generalInfo, 1004, 1007);
         ResultSet rset = cstmt.executeQuery();
         int countOfAbiturientss = rset.last()?rset.getRow():0;
         rset.beforeFirst();
         if(countOfAbiturientss > 0) {
            out.println("snils;oid;compaignId;dateOfBirth;specialty;financingType;targetReception;applicationDate;initiative");

            while(rset.next()) {
               out.print(rset.getString(2) + ";");
               out.print(rset.getString(6) + ";");
               out.print(rset.getString(7) + ";");
               out.print(rset.getString(8) + ";");
               out.print(rset.getString(10) + ";");
               out.print(rset.getString(11) + ";");
               out.print(rset.getString(13) + ";");
               out.print(rset.getString(12) + ";1");
            }
         }

         out.close();
         rset.close();
      }

   }

   public static void main(String[] args) {
      try {
         ModelDBConnection.setConnectionParameters("MSServer", "localhost", "Aspirant", "igor_sa", "200352");
         ModelDBConnection.initConnection();
         printIndividualAchievements();
         printTargetOrganisations();
         printAssesmentPlanGeneral();
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }
}

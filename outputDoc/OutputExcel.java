package outputDoc;

import backend.ModelDBConnection;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class OutputExcel {

   private static String currentPath = (new File("")).getAbsolutePath();


   public static void writeAdmissionPlan() throws Exception {
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(currentPath + "\\Dots\\План_приема" + ".xltx"));
      XSSFSheet sheet = workbook.getSheetAt(0);
      XSSFFont fontForNames = workbook.createFont();
      fontForNames.setFontHeight(11.0D);
      fontForNames.setFontName("Arial Cyr");
      XSSFCellStyle styleForNames = workbook.createCellStyle();
      styleForNames.setFont(fontForNames);
      styleForNames.setBorderBottom((short)1);
      styleForNames.setBorderLeft((short)1);
      styleForNames.setBorderRight((short)1);
      styleForNames.setBorderTop((short)1);
      styleForNames.setAlignment((short)2);
      styleForNames.setVerticalAlignment((short)1);
      String[][] plan = ModelDBConnection.getAdmissionPlan();
      int rowNum = 2;

      for(int path = 0; path < plan.length; ++path) {
         ++rowNum;
         XSSFRow row = sheet.createRow(rowNum);

         for(int file = 0; file < plan[path].length; ++file) {
            row.createCell(file + 1).setCellValue(plan[path][file]);
            row.getCell(file + 1).setCellStyle(styleForNames);
         }
      }

      String var10 = currentPath + "\\files\\План_приема" + "_" + moduleType + "_" + (new SimpleDateFormat("dd.MM.yyyy")).format(new Date()) + ".xls";
      File var11 = new File(var10);
      if(var11.exists()) {
         var11.delete();
      }

      var11.createNewFile();
      workbook.write(new FileOutputStream(var11));
      Desktop.getDesktop().open(var11);
   }

   public static void writeListGroupsOnEntranceTests() throws Exception {
      XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(currentPath + "\\Dots\\Списки_групп" + ".xltx"));
      XSSFFont fontForEntranceTestName = workbook.createFont();
      fontForEntranceTestName.setBold(true);
      fontForEntranceTestName.setFontHeight(12.0D);
      fontForEntranceTestName.setFontName("Arial Cyr");
      XSSFCellStyle styleForCellsWithCenterAlg = workbook.createCellStyle();
      styleForCellsWithCenterAlg.setAlignment((short)2);
      styleForCellsWithCenterAlg.setVerticalAlignment((short)1);
      styleForCellsWithCenterAlg.setFont(fontForEntranceTestName);
      XSSFCellStyle styleForCellsWithLeftAlg = workbook.createCellStyle();
      styleForCellsWithLeftAlg.setAlignment((short)1);
      styleForCellsWithLeftAlg.setVerticalAlignment((short)1);
      styleForCellsWithLeftAlg.setFont(fontForEntranceTestName);
      XSSFFont fontForNames = workbook.createFont();
      fontForNames.setFontHeight(11.0D);
      fontForNames.setFontName("Arial Cyr");
      XSSFCellStyle styleForNames = workbook.createCellStyle();
      styleForNames.setFont(fontForNames);
      styleForNames.setBorderBottom((short)1);
      styleForNames.setBorderLeft((short)1);
      styleForNames.setBorderRight((short)1);
      styleForNames.setBorderTop((short)1);
      styleForNames.setAlignment((short)2);
      styleForNames.setVerticalAlignment((short)1);
      String[][] entranceTests = ModelDBConnection.getAllFromTableOrderedById("EntranceTest");
      String[] entranceTestGroups = ModelDBConnection.getAllGroupsNames();
      int numSheet = 0;

      for(int path = 0; path < entranceTests.length; ++path) {
         boolean file = false;

         for(int etg_i = 0; etg_i < entranceTestGroups.length; ++etg_i) {
            byte var17 = 0;
            String[][] studentsList = ModelDBConnection.getListAbiturientsByEntranceTestAndGroupIDs(entranceTests[path][0], entranceTestGroups[etg_i]);
            if(studentsList != null) {
               XSSFSheet sheet = workbook.cloneSheet(0);
               ++numSheet;
               workbook.setSheetName(numSheet, entranceTests[path][1] + "_" + entranceTestGroups[etg_i]);
               int var18 = var17 + 1;
               XSSFRow row = sheet.createRow(var17);
               row.createCell(0).setCellValue("Список группы №" + entranceTestGroups[etg_i] + " вступительного испытания " + entranceTests[path][1]);
               row.getCell(0).setCellStyle(styleForCellsWithCenterAlg);
               ++var18;

               for(int i = 0; i < studentsList.length; ++i) {
                  ++var18;
                  row = sheet.getRow(var18);
                  row.getCell(2).setCellValue(studentsList[i][0] + " " + studentsList[i][1] + " " + studentsList[i][2]);
                  row.getCell(2).setCellStyle(styleForNames);
                  row.getCell(3).setCellValue(entranceTestGroups[etg_i] + "ord" + studentsList[i][7]);
                  row.getCell(3).setCellStyle(styleForNames);
                  row.getCell(4).setCellValue(studentsList[i][5] + studentsList[i][6]);
                  row.getCell(4).setCellStyle(styleForNames);
               }
            }
         }
      }

      workbook.removeSheetAt(0);
      String var16 = currentPath + "\\files\\Списки_групп" + "_" + (new SimpleDateFormat("dd.MM.yyyy")).format(new Date()) + ".xls";
      File var19 = new File(var16);
      if(var19.exists()) {
         var19.delete();
      }

      var19.createNewFile();
      workbook.write(new FileOutputStream(var19));
   }

   public static void writeResultsEntranceTest() throws Exception {
      XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(currentPath + "\\Dots\\Результаты_Вступительных" + ".xltx"));
      XSSFFont fontForEntranceTestName = workbook.createFont();
      fontForEntranceTestName.setBold(true);
      fontForEntranceTestName.setFontHeight(12.0D);
      fontForEntranceTestName.setFontName("Arial Cyr");
      XSSFCellStyle styleForCellsWithCenterAlg = workbook.createCellStyle();
      styleForCellsWithCenterAlg.setAlignment((short)2);
      styleForCellsWithCenterAlg.setVerticalAlignment((short)1);
      styleForCellsWithCenterAlg.setFont(fontForEntranceTestName);
      XSSFCellStyle styleForCellsWithLeftAlg = workbook.createCellStyle();
      styleForCellsWithLeftAlg.setAlignment((short)1);
      styleForCellsWithLeftAlg.setVerticalAlignment((short)1);
      styleForCellsWithLeftAlg.setFont(fontForEntranceTestName);
      XSSFFont fontForNames = workbook.createFont();
      fontForNames.setFontHeight(11.0D);
      fontForNames.setFontName("Arial Cyr");
      XSSFCellStyle styleForNames = workbook.createCellStyle();
      styleForNames.setFont(fontForNames);
      styleForNames.setBorderBottom((short)1);
      styleForNames.setBorderLeft((short)1);
      styleForNames.setBorderRight((short)1);
      styleForNames.setBorderTop((short)1);
      styleForNames.setAlignment((short)2);
      styleForNames.setVerticalAlignment((short)1);
      String[][] entranceTests = ModelDBConnection.getAllFromTableOrderedById("EntranceTest");
      String[] entranceTestGroups = ModelDBConnection.getAllGroupsNames();
      int numSheet = 0;

      for(int path = 0; path < entranceTests.length; ++path) {
         boolean file = false;

         for(int etg_i = 0; etg_i < entranceTestGroups.length; ++etg_i) {
            byte var17 = 0;
            String[][] studentsTest = ModelDBConnection.getListAbiturientsByEntranceTestAndGroupIDs(entranceTests[path][0], entranceTestGroups[etg_i]);
            if(studentsTest != null) {
               XSSFSheet sheet = workbook.cloneSheet(0);
               ++numSheet;
               workbook.setSheetName(numSheet, entranceTests[path][1] + "_" + entranceTestGroups[etg_i]);
               int var18 = var17 + 1;
               XSSFRow row = sheet.createRow(var18);
               row.createCell(0).setCellValue("вступительного испытания " + entranceTests[path][1] + " по программам ординатуры");
               row.getCell(0).setCellStyle(styleForCellsWithCenterAlg);
               ++var18;
               ++var18;
               ++var18;
               row = sheet.getRow(var18);
               sheet.addMergedRegion(new CellRangeAddress(var18, var18, 0, 2));
               row.createCell(0).setCellValue("Дата проведения: " + (studentsTest[0][4] != null?studentsTest[0][4]:""));
               row.getCell(0).setCellStyle(styleForCellsWithLeftAlg);
               row.createCell(4).setCellValue(entranceTestGroups[etg_i]);
               row.getCell(4).setCellStyle(styleForCellsWithCenterAlg);
               ++var18;
               ++var18;

               for(int i = 0; i < studentsTest.length; ++i) {
                  ++var18;
                  row = sheet.getRow(var18);
                  row.getCell(2).setCellValue(studentsTest[i][0] + " " + studentsTest[i][1] + " " + studentsTest[i][2]);
                  row.getCell(2).setCellStyle(styleForNames);
                  row.getCell(3).setCellValue(studentsTest[i][3] != null?studentsTest[i][3]:"неявка");
                  row.getCell(3).setCellStyle(styleForNames);
               }
            }
         }
      }

      workbook.removeSheetAt(0);
      String var16 = currentPath + "\\files\\Результаты_Вступительных" + "_" + (new SimpleDateFormat("dd.MM.yyyy")).format(new Date()) + ".xls";
      File var19 = new File(var16);
      if(var19.exists()) {
         var19.delete();
      }

      var19.createNewFile();
      workbook.write(new FileOutputStream(var19));
   }

   public static void writeListOfSubmittedDocuments(boolean forProtocol) throws Exception {
      String curDate = (new SimpleDateFormat("yyyy-MM-dd")).format(new Date());
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      Connection con = ModelDBConnection.getConnection();
      ResultSet rset = null;
      CallableStatement cstmt = null;
      XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(currentPath + "\\Dots\\Список_подавших_" + moduleType + ".xltx"));
      XSSFSheet sheet = workbook.getSheetAt(0);
      XSSFFont fontForCategories = workbook.createFont();
      fontForCategories.setBold(true);
      XSSFCellStyle styleForCategories = workbook.createCellStyle();
      styleForCategories.setFont(fontForCategories);
      styleForCategories.setAlignment((short)2);
      XSSFFont fontForTargetOrgs = workbook.createFont();
      fontForTargetOrgs.setBold(true);
      XSSFCellStyle styleForTargetOrgs = workbook.createCellStyle();
      styleForTargetOrgs.setFont(fontForTargetOrgs);
      XSSFFont fontForSpecialities = workbook.createFont();
      fontForSpecialities.setBold(true);
      fontForSpecialities.setItalic(true);
      XSSFCellStyle styleForSpecialities = workbook.createCellStyle();
      styleForSpecialities.setFont(fontForSpecialities);
      styleForSpecialities.setAlignment((short)2);
      XSSFFont fontForNames = workbook.createFont();
      fontForNames.setBold(true);
      XSSFCellStyle styleForNames = workbook.createCellStyle();
      styleForNames.setFont(fontForNames);
      styleForNames.setBorderBottom((short)1);
      styleForNames.setBorderLeft((short)1);
      styleForNames.setBorderRight((short)1);
      styleForNames.setBorderTop((short)1);
      styleForNames.setAlignment((short)2);
      styleForNames.setVerticalAlignment((short)1);
      styleForNames.setWrapText(true);
      XSSFCellStyle styleForCells = workbook.createCellStyle();
      styleForCells.setBorderBottom((short)1);
      styleForCells.setBorderLeft((short)1);
      styleForCells.setBorderRight((short)1);
      styleForCells.setBorderTop((short)1);
      styleForCells.setVerticalAlignment((short)1);
      XSSFCellStyle styleForCellsWithCenterAlg = workbook.createCellStyle();
      styleForCellsWithCenterAlg.setBorderBottom((short)1);
      styleForCellsWithCenterAlg.setBorderLeft((short)1);
      styleForCellsWithCenterAlg.setBorderRight((short)1);
      styleForCellsWithCenterAlg.setBorderTop((short)1);
      styleForCellsWithCenterAlg.setAlignment((short)2);
      styleForCellsWithCenterAlg.setVerticalAlignment((short)1);
      styleForCellsWithCenterAlg.setWrapText(true);
      int rowNum = 1;
      boolean numPP = true;
      String[][] specialities = moduleType.equals("аспирантура")?ModelDBConnection.getAllFromTableOrderedById("Course"):ModelDBConnection.getAllFromTableOrderedById("Speciality");
      String[][] targetOrganisations = ModelDBConnection.getAllFromTableOrderedById("TargetOrganisation");
      String[][] educationStandarts = moduleType.equals("аспирантура")?ModelDBConnection.getAllFromTableOrderedById("EducationForm"):ModelDBConnection.getAllFromTableOrderedById("EducationStandard");
      String[][] competitiveGroups = ModelDBConnection.getAllFromTableOrderedById("CompetitiveGroup");

      for(int path = 0; path < specialities.length; ++path) {
         String query = moduleType.equals("аспирантура")?"select * from AbiturientCompetitiveGroup where course = \'" + specialities[path][0] + "\'" + (forProtocol?" and aid_abiturient in (select aid from Abiturient where registrationDate like \'" + curDate + "\')":""):"select * from AbiturientCompetitiveGroup where speciality = \'" + specialities[path][0] + "\'" + (forProtocol?" and aid_abiturient in (select aid from Abiturient where registrationDate like \'" + curDate + "\')":"");
         cstmt = con.prepareCall(query, 1004, 1007);
         rset = cstmt.executeQuery();
         int file = rset.last()?rset.getRow():0;
         rset.close();
         if(file > 0) {
            XSSFRow row = sheet.createRow(rowNum++);
            row = sheet.createRow(rowNum++);
            row.createCell(1).setCellValue((moduleType.equals("аспирантура")?"Направление: ":"Специальность: ") + specialities[path][1]);
            sheet.addMergedRegion(new CellRangeAddress(rowNum - 1, rowNum - 1, 1, 2));
            row.getCell(1).setCellStyle(styleForSpecialities);

            for(int cg_i = 0; cg_i < competitiveGroups.length; ++cg_i) {
               int countAbitsOnCurSpecOnCurCompGr;
               int es_i;
               int countAbitsOnCurSpecOnCurCompGrAndSt;
               int var33;
               if(competitiveGroups[cg_i][0].equals("1")) {
                  query = moduleType.equals("аспирантура")?"select * from AbiturientCompetitiveGroup where course = \'" + specialities[path][0] + "\' and competitiveGroup in (1,2)" + (forProtocol?" and aid_abiturient in (select aid from Abiturient where registrationDate like \'" + curDate + "\')":""):"select * from AbiturientCompetitiveGroup where speciality = \'" + specialities[path][0] + "\' and competitiveGroup in (1,2)" + (forProtocol?" and aid_abiturient in (select aid from Abiturient where registrationDate like \'" + curDate + "\')":"");
                  cstmt = con.prepareCall(query, 1004, 1007);
                  rset = cstmt.executeQuery();
                  countAbitsOnCurSpecOnCurCompGr = rset.last()?rset.getRow():0;
                  rset.close();
                  if(countAbitsOnCurSpecOnCurCompGr > 0) {
                     row = sheet.createRow(rowNum++);
                     row.createCell(1).setCellValue("МЕСТА В РАМКАХ КЦП");
                     sheet.addMergedRegion(new CellRangeAddress(rowNum - 1, rowNum - 1, 1, 2));
                     row.getCell(1).setCellStyle(styleForCategories);
                  }

                  query = moduleType.equals("аспирантура")?"select * from AbiturientCompetitiveGroup where course = \'" + specialities[path][0] + "\' and targetOrganisation is not null" + (forProtocol?" and aid_abiturient in (select aid from Abiturient where registrationDate like \'" + curDate + "\')":""):"select * from AbiturientCompetitiveGroup where speciality = \'" + specialities[path][0] + "\' and targetOrganisation is not null" + (forProtocol?" and aid_abiturient in (select aid from Abiturient where registrationDate like \'" + curDate + "\')":"");
                  cstmt = con.prepareCall(query, 1004, 1007);
                  rset = cstmt.executeQuery();
                  es_i = rset.last()?rset.getRow():0;
                  rset.close();
                  if(es_i > 0) {
                     row = sheet.createRow(rowNum++);
                     row.createCell(1).setCellValue("места по целевому приему");
                     row.getCell(1).setCellStyle(styleForTargetOrgs);
                     if(!moduleType.equals("аспирантура")) {
                        var33 = 1;
                        query = "select SName, Fname, isNULL(MName,\'\') as MName1, TargetOrganisation.name, ReturnReasons.name from (AbiturientCompetitiveGroup join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid) join TargetOrganisation on (AbiturientCompetitiveGroup.targetOrganisation = TargetOrganisation.id)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where speciality = \'" + specialities[path][0] + "\' and targetOrganisation is not null" + (forProtocol?" and aid_abiturient in (select aid from Abiturient where registrationDate like \'" + curDate + "\')":"") + " order by SName, Fname, MName1";
                        cstmt = con.prepareCall(query, 1004, 1007);
                        rset = cstmt.executeQuery();
                        countAbitsOnCurSpecOnCurCompGrAndSt = rset.last()?rset.getRow():0;
                        rset.beforeFirst();
                        if(countAbitsOnCurSpecOnCurCompGrAndSt > 0) {
                           row = sheet.createRow(rowNum++);
                           row = sheet.createRow(rowNum++);
                           if(moduleType.equals("аспирантура")) {
                              row.createCell(0).setCellValue("№п/п");
                              row.createCell(1).setCellValue("ФИО");
                              row.createCell(2).setCellValue("Специальность");
                              row.createCell(3).setCellValue("Статус документов");
                              row.createCell(4).setCellValue("Примечание");
                              row.getCell(0).setCellStyle(styleForNames);
                              row.getCell(1).setCellStyle(styleForNames);
                              row.getCell(2).setCellStyle(styleForNames);
                              row.getCell(3).setCellStyle(styleForNames);
                              row.getCell(4).setCellStyle(styleForNames);
                           } else {
                              row.createCell(0).setCellValue("№п/п");
                              row.createCell(1).setCellValue("ФИО");
                              row.createCell(2).setCellValue("Целевая организация");
                              row.createCell(3).setCellValue("Статус документов");
                              row.createCell(4).setCellValue("Примечание");
                              row.getCell(0).setCellStyle(styleForNames);
                              row.getCell(1).setCellStyle(styleForNames);
                              row.getCell(2).setCellStyle(styleForNames);
                              row.getCell(3).setCellStyle(styleForNames);
                              row.getCell(4).setCellStyle(styleForNames);
                           }

                           while(rset.next()) {
                              row = sheet.createRow(rowNum++);
                              if(moduleType.equals("аспирантура")) {
                                 row.createCell(0).setCellValue((double)(var33++));
                                 row.createCell(1).setCellValue(rset.getString(1) + " " + rset.getString(2) + " " + rset.getString(3));
                                 row.createCell(2).setCellValue(rset.getString(4));
                                 row.createCell(3).setCellValue(rset.getString(5) != null?"Отозваны":"Приняты");
                                 row.createCell(4).setCellValue(rset.getString(5));
                                 row.getCell(0).setCellStyle(styleForCells);
                                 row.getCell(1).setCellStyle(styleForCells);
                                 row.getCell(2).setCellStyle(styleForCellsWithCenterAlg);
                                 row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
                                 row.getCell(4).setCellStyle(styleForCellsWithCenterAlg);
                              } else {
                                 row.createCell(0).setCellValue((double)(var33++));
                                 row.createCell(1).setCellValue(rset.getString(1) + " " + rset.getString(2) + " " + rset.getString(3));
                                 row.createCell(2).setCellValue(rset.getString(4));
                                 row.createCell(3).setCellValue(rset.getString(5) != null?"Отозваны":"Приняты");
                                 row.createCell(4).setCellValue(rset.getString(5));
                                 row.getCell(0).setCellStyle(styleForCells);
                                 row.getCell(1).setCellStyle(styleForCells);
                                 row.getCell(2).setCellStyle(styleForCellsWithCenterAlg);
                                 row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
                                 row.getCell(4).setCellStyle(styleForCellsWithCenterAlg);
                              }
                           }
                        }

                        rset.close();
                     } else {
                        for(countAbitsOnCurSpecOnCurCompGrAndSt = 0; countAbitsOnCurSpecOnCurCompGrAndSt < targetOrganisations.length; ++countAbitsOnCurSpecOnCurCompGrAndSt) {
                           var33 = 1;
                           query = moduleType.equals("аспирантура")?"select SName, Fname, isNULL(MName,\'\') as MName1, Speciality.name, ReturnReasons.name from (Speciality join AbiturientCompetitiveGroup on (AbiturientCompetitiveGroup.speciality = Speciality.id) join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where course = \'" + specialities[path][0] + "\' and targetOrganisation = \'" + targetOrganisations[countAbitsOnCurSpecOnCurCompGrAndSt][0] + "\'" + (forProtocol?" and aid_abiturient in (select aid from Abiturient where registrationDate like \'" + curDate + "\')":"") + " order by SName, Fname, MName1":"select SName, Fname, isNULL(MName,\'\') as MName1, ReturnReasons.name from (AbiturientCompetitiveGroup join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where speciality = \'" + specialities[path][0] + "\' and targetOrganisation = \'" + targetOrganisations[countAbitsOnCurSpecOnCurCompGrAndSt][0] + "\'" + (forProtocol?" and aid_abiturient in (select aid from Abiturient where registrationDate like \'" + curDate + "\')":"") + " order by SName, Fname, MName1";
                           cstmt = con.prepareCall(query, 1004, 1007);
                           rset = cstmt.executeQuery();
                           int countAbitsOnCurSpecOnCurTargOrg = rset.last()?rset.getRow():0;
                           rset.beforeFirst();
                           if(countAbitsOnCurSpecOnCurTargOrg > 0) {
                              row = sheet.createRow(rowNum++);
                              row = sheet.createRow(rowNum++);
                              row.createCell(0).setCellValue("Целевая организация: " + targetOrganisations[countAbitsOnCurSpecOnCurCompGrAndSt][1]);
                              sheet.addMergedRegion(new CellRangeAddress(rowNum - 1, rowNum - 1, 0, 3));
                              row.getCell(0).setCellStyle(styleForTargetOrgs);
                              row = sheet.createRow(rowNum++);
                              if(moduleType.equals("аспирантура")) {
                                 row.createCell(0).setCellValue("№п/п");
                                 row.createCell(1).setCellValue("ФИО");
                                 row.createCell(2).setCellValue("Специальность");
                                 row.createCell(3).setCellValue("Статус документов");
                                 row.createCell(4).setCellValue("Примечание");
                                 row.getCell(0).setCellStyle(styleForNames);
                                 row.getCell(1).setCellStyle(styleForNames);
                                 row.getCell(2).setCellStyle(styleForNames);
                                 row.getCell(3).setCellStyle(styleForNames);
                                 row.getCell(4).setCellStyle(styleForNames);
                              } else {
                                 row.createCell(0).setCellValue("№п/п");
                                 row.createCell(1).setCellValue("ФИО");
                                 row.createCell(2).setCellValue("Статус документов");
                                 row.createCell(3).setCellValue("Примечание");
                                 row.getCell(0).setCellStyle(styleForNames);
                                 row.getCell(1).setCellStyle(styleForNames);
                                 row.getCell(2).setCellStyle(styleForNames);
                                 row.getCell(3).setCellStyle(styleForNames);
                              }

                              while(rset.next()) {
                                 row = sheet.createRow(rowNum++);
                                 if(moduleType.equals("аспирантура")) {
                                    row.createCell(0).setCellValue((double)(var33++));
                                    row.createCell(1).setCellValue(rset.getString(1) + " " + rset.getString(2) + " " + rset.getString(3));
                                    row.createCell(2).setCellValue(rset.getString(4));
                                    row.createCell(3).setCellValue(rset.getString(5) != null?"Отозваны":"Приняты");
                                    row.createCell(4).setCellValue(rset.getString(5));
                                    row.getCell(0).setCellStyle(styleForCells);
                                    row.getCell(1).setCellStyle(styleForCells);
                                    row.getCell(2).setCellStyle(styleForCellsWithCenterAlg);
                                    row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
                                    row.getCell(4).setCellStyle(styleForCellsWithCenterAlg);
                                 } else {
                                    row.createCell(0).setCellValue((double)(var33++));
                                    row.createCell(1).setCellValue(rset.getString(1) + " " + rset.getString(2) + " " + rset.getString(3));
                                    row.createCell(2).setCellValue(rset.getString(4) != null?"Отозваны":"Приняты");
                                    row.createCell(3).setCellValue(rset.getString(4));
                                    row.getCell(0).setCellStyle(styleForCells);
                                    row.getCell(1).setCellStyle(styleForCells);
                                    row.getCell(2).setCellStyle(styleForCellsWithCenterAlg);
                                    row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
                                 }
                              }
                           }

                           rset.close();
                        }
                     }
                  }
               } else {
                  query = moduleType.equals("аспирантура")?"select SName, Fname, isNULL(MName,\'\') as MName1, Speciality.name, ReturnReasons.name, EducationForm.name from (Speciality join AbiturientCompetitiveGroup on (AbiturientCompetitiveGroup.speciality = Speciality.id) join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid) join EducationForm on (AbiturientCompetitiveGroup.educationForm = EducationForm.id)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where course = \'" + specialities[path][0] + "\' and competitiveGroup = \'" + competitiveGroups[cg_i][0] + "\' and targetOrganisation is null" + (forProtocol?" and aid_abiturient in (select aid from Abiturient where registrationDate like \'" + curDate + "\')":"") + " order by SName, Fname, MName1":"select SName, Fname, isNULL(MName,\'\') as MName1, ReturnReasons.name, EducationStandard.name from (AbiturientCompetitiveGroup join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid) join EducationStandard on (AbiturientCompetitiveGroup.educationStandard = EducationStandard.id)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where speciality = \'" + specialities[path][0] + "\' and competitiveGroup = \'" + competitiveGroups[cg_i][0] + "\' and targetOrganisation is null" + (forProtocol?" and aid_abiturient in (select aid from Abiturient where registrationDate like \'" + curDate + "\')":"") + " order by SName, Fname, MName1";
                  cstmt = con.prepareCall(query, 1004, 1007);
                  rset = cstmt.executeQuery();
                  countAbitsOnCurSpecOnCurCompGr = rset.last()?rset.getRow():0;
                  rset.close();
                  if(countAbitsOnCurSpecOnCurCompGr > 0 && competitiveGroups[cg_i][0].equals("3")) {
                     row = sheet.createRow(rowNum++);
                     row = sheet.createRow(rowNum++);
                     row.createCell(1).setCellValue("МЕСТА ПО ДОГОВОРАМ ОБ ОКАЗАНИИ ПЛАТНЫХ УСЛУГ");
                     sheet.addMergedRegion(new CellRangeAddress(rowNum - 1, rowNum - 1, 1, 2));
                     row.getCell(1).setCellStyle(styleForCategories);
                  }

                  for(es_i = 0; es_i < educationStandarts.length; ++es_i) {
                     query = moduleType.equals("аспирантура")?"select SName, Fname, isNULL(MName,\'\') as MName1, Speciality.name, ReturnReasons.name, EducationForm.name from (Speciality join AbiturientCompetitiveGroup on (AbiturientCompetitiveGroup.speciality = Speciality.id) join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid) join EducationForm on (AbiturientCompetitiveGroup.educationForm = EducationForm.id)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where course = \'" + specialities[path][0] + "\' and competitiveGroup = \'" + competitiveGroups[cg_i][0] + "\' and educationForm = \'" + educationStandarts[es_i][0] + "\' and targetOrganisation is null" + (forProtocol?" and aid_abiturient in (select aid from Abiturient where registrationDate like \'" + curDate + "\')":"") + " order by SName, Fname, MName1":"select SName, Fname, isNULL(MName,\'\') as MName1, ReturnReasons.name, EducationStandard.name from (AbiturientCompetitiveGroup join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid) join EducationStandard on (AbiturientCompetitiveGroup.educationStandard = EducationStandard.id)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where speciality = \'" + specialities[path][0] + "\' and competitiveGroup = \'" + competitiveGroups[cg_i][0] + "\' and targetOrganisation is null" + (forProtocol?" and aid_abiturient in (select aid from Abiturient where registrationDate like \'" + curDate + "\')":"") + " order by SName, Fname, MName1";
                     cstmt = con.prepareCall(query, 1004, 1007);
                     rset = cstmt.executeQuery();
                     countAbitsOnCurSpecOnCurCompGrAndSt = rset.last()?rset.getRow():0;
                     rset.beforeFirst();
                     if(countAbitsOnCurSpecOnCurCompGrAndSt > 0) {
                        var33 = 1;
                        row = sheet.createRow(rowNum++);
                        row = sheet.createRow(rowNum++);
                        if(moduleType.equals("аспирантура")) {
                           row.createCell(1).setCellValue("Форма обучения: " + educationStandarts[es_i][1]);
                           row.getCell(1).setCellStyle(styleForTargetOrgs);
                           row = sheet.createRow(rowNum++);
                           row.createCell(1).setCellValue("по общему конкурсу");
                        } else {
                           row.createCell(1).setCellValue("по общему конкурсу" + (competitiveGroups[cg_i][0].equals("4")?" (места для иностранных граждан)":""));
                        }

                        row.getCell(1).setCellStyle(styleForTargetOrgs);
                        ++rowNum;
                        row = sheet.createRow(rowNum++);
                        if(moduleType.equals("аспирантура")) {
                           row.createCell(0).setCellValue("№п/п");
                           row.createCell(1).setCellValue("ФИО");
                           row.createCell(2).setCellValue("Специальность");
                           row.createCell(3).setCellValue("Статус документов");
                           row.createCell(4).setCellValue("Примечание");
                           row.getCell(0).setCellStyle(styleForNames);
                           row.getCell(1).setCellStyle(styleForNames);
                           row.getCell(2).setCellStyle(styleForNames);
                           row.getCell(3).setCellStyle(styleForNames);
                           row.getCell(4).setCellStyle(styleForNames);
                        } else {
                           row.createCell(0).setCellValue("№п/п");
                           row.createCell(1).setCellValue("ФИО");
                           row.createCell(2).setCellValue("Статус документов");
                           row.createCell(3).setCellValue("Примечание");
                           row.getCell(0).setCellStyle(styleForNames);
                           row.getCell(1).setCellStyle(styleForNames);
                           row.getCell(2).setCellStyle(styleForNames);
                           row.getCell(3).setCellStyle(styleForNames);
                        }

                        while(rset.next()) {
                           row = sheet.createRow(rowNum++);
                           if(moduleType.equals("аспирантура")) {
                              row.createCell(0).setCellValue((double)(var33++));
                              row.createCell(1).setCellValue(rset.getString(1) + " " + rset.getString(2) + " " + rset.getString(3));
                              row.createCell(2).setCellValue(rset.getString(4));
                              row.createCell(3).setCellValue(rset.getString(5) != null?"Отозваны":"Приняты");
                              row.createCell(4).setCellValue(rset.getString(5));
                              row.getCell(0).setCellStyle(styleForCells);
                              row.getCell(1).setCellStyle(styleForCells);
                              row.getCell(2).setCellStyle(styleForCellsWithCenterAlg);
                              row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
                              row.getCell(4).setCellStyle(styleForCellsWithCenterAlg);
                           } else {
                              row.createCell(0).setCellValue((double)(var33++));
                              row.createCell(1).setCellValue(rset.getString(1) + " " + rset.getString(2) + " " + rset.getString(3));
                              row.createCell(2).setCellValue(rset.getString(4) != null?"Отозваны":"Приняты");
                              row.createCell(3).setCellValue(rset.getString(4));
                              row.getCell(0).setCellStyle(styleForCells);
                              row.getCell(1).setCellStyle(styleForCells);
                              row.getCell(2).setCellStyle(styleForCellsWithCenterAlg);
                              row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
                           }
                        }
                     }

                     rset.close();
                     if(!moduleType.equals("аспирантура")) {
                        break;
                     }
                  }
               }
            }
         }
      }

      String var34 = currentPath + "\\files\\" + "Список_подавших_" + moduleType + "_" + (forProtocol?"за ":"") + (new SimpleDateFormat("dd.MM.yyyy")).format(new Date()) + (forProtocol?"_на протокол":"") + ".xls";
      File var35 = new File(var34);
      if(var35.exists()) {
         var35.delete();
      }

      var35.createNewFile();
      workbook.write(new FileOutputStream(var35));
      Desktop.getDesktop().open(var35);
   }

   public static void writeStatistics() throws Exception {
      XSSFWorkbook workbook = new XSSFWorkbook();
      XSSFSheet sheetGZGU_sp = workbook.createSheet("ГЗГУ_Специальность");
      String[][] statisticsGZGU_speciality = ModelDBConnection.getStatisticsGZGU(false);
      sheetGZGU_sp.addMergedRegion(new CellRangeAddress(0, 0, 2, 4));
      sheetGZGU_sp.addMergedRegion(new CellRangeAddress(0, 0, 5, 7));
      XSSFRow row = sheetGZGU_sp.createRow(0);
      row.createCell(0).setCellValue("Специальноcть");
      row.createCell(1).setCellValue("Форма обучения");
      row.createCell(2).setCellValue("Количество поданных заявлений");
      row.createCell(5).setCellValue("Количество зачисленных");
      row = sheetGZGU_sp.createRow(1);
      row.createCell(2).setCellValue("всего");
      row.createCell(3).setCellValue("в т.ч. целевая квота");
      row.createCell(4).setCellValue("на коммерческие места");
      row.createCell(5).setCellValue("всего");
      row.createCell(6).setCellValue("в т.ч. целевая квота");
      row.createCell(7).setCellValue("на коммерческие места");

      int sheetGZGU_crs;
      for(sheetGZGU_crs = 2; sheetGZGU_crs < statisticsGZGU_speciality.length + 2; ++sheetGZGU_crs) {
         row = sheetGZGU_sp.createRow(sheetGZGU_crs);
         row.createCell(0).setCellValue(statisticsGZGU_speciality[sheetGZGU_crs - 2][0]);
         row.createCell(1).setCellValue(statisticsGZGU_speciality[sheetGZGU_crs - 2][1]);
         row.createCell(2).setCellValue((double)(Integer.valueOf(statisticsGZGU_speciality[sheetGZGU_crs - 2][2]).intValue() + Integer.valueOf(statisticsGZGU_speciality[sheetGZGU_crs - 2][3]).intValue()));
         row.createCell(3).setCellValue((double)Integer.valueOf(statisticsGZGU_speciality[sheetGZGU_crs - 2][3]).intValue());
         row.createCell(4).setCellValue((double)Integer.valueOf(statisticsGZGU_speciality[sheetGZGU_crs - 2][4]).intValue());
         row.createCell(5).setCellValue((double)(Integer.valueOf(statisticsGZGU_speciality[sheetGZGU_crs - 2][5]).intValue() + Integer.valueOf(statisticsGZGU_speciality[sheetGZGU_crs - 2][6]).intValue()));
         row.createCell(6).setCellValue((double)Integer.valueOf(statisticsGZGU_speciality[sheetGZGU_crs - 2][6]).intValue());
         row.createCell(7).setCellValue((double)Integer.valueOf(statisticsGZGU_speciality[sheetGZGU_crs - 2][7]).intValue());
      }

      for(sheetGZGU_crs = 0; sheetGZGU_crs < statisticsGZGU_speciality[0].length; ++sheetGZGU_crs) {
         sheetGZGU_sp.autoSizeColumn(sheetGZGU_crs);
      }

      XSSFSheet var31 = workbook.createSheet("ГЗГУ_Направление");
      String[][] statisticsGZGU_course = ModelDBConnection.getStatisticsGZGU(true);
      var31.addMergedRegion(new CellRangeAddress(0, 0, 2, 4));
      var31.addMergedRegion(new CellRangeAddress(0, 0, 5, 7));
      row = var31.createRow(0);
      row.createCell(0).setCellValue("Направление");
      row.createCell(1).setCellValue("Форма обучения");
      row.createCell(2).setCellValue("Количество поданных заявлений");
      row.createCell(5).setCellValue("Количество зачисленных");
      row = var31.createRow(1);
      row.createCell(2).setCellValue("всего");
      row.createCell(3).setCellValue("в т.ч. целевая квота");
      row.createCell(4).setCellValue("на коммерческие места");
      row.createCell(5).setCellValue("всего");
      row.createCell(6).setCellValue("в т.ч. целевая квота");
      row.createCell(7).setCellValue("на коммерческие места");

      int sheetMinZdrav_sp;
      for(sheetMinZdrav_sp = 2; sheetMinZdrav_sp < statisticsGZGU_course.length + 2; ++sheetMinZdrav_sp) {
         row = var31.createRow(sheetMinZdrav_sp);
         row.createCell(0).setCellValue(statisticsGZGU_course[sheetMinZdrav_sp - 2][0]);
         row.createCell(1).setCellValue(statisticsGZGU_course[sheetMinZdrav_sp - 2][1]);
         row.createCell(2).setCellValue((double)(Integer.valueOf(statisticsGZGU_course[sheetMinZdrav_sp - 2][2]).intValue() + Integer.valueOf(statisticsGZGU_course[sheetMinZdrav_sp - 2][3]).intValue()));
         row.createCell(3).setCellValue((double)Integer.valueOf(statisticsGZGU_course[sheetMinZdrav_sp - 2][3]).intValue());
         row.createCell(4).setCellValue((double)Integer.valueOf(statisticsGZGU_course[sheetMinZdrav_sp - 2][4]).intValue());
         row.createCell(5).setCellValue((double)(Integer.valueOf(statisticsGZGU_course[sheetMinZdrav_sp - 2][5]).intValue() + Integer.valueOf(statisticsGZGU_course[sheetMinZdrav_sp - 2][6]).intValue()));
         row.createCell(6).setCellValue((double)Integer.valueOf(statisticsGZGU_course[sheetMinZdrav_sp - 2][6]).intValue());
         row.createCell(7).setCellValue((double)Integer.valueOf(statisticsGZGU_course[sheetMinZdrav_sp - 2][7]).intValue());
      }

      for(sheetMinZdrav_sp = 0; sheetMinZdrav_sp < statisticsGZGU_speciality[0].length; ++sheetMinZdrav_sp) {
         var31.autoSizeColumn(sheetMinZdrav_sp);
      }

      XSSFSheet var32 = workbook.createSheet("МинЗдрав_Специальность");
      String[][] statisticsMinZdrav_speciality = ModelDBConnection.getStatisticsMinZdrav(false);
      row = var32.createRow(0);
      row.createCell(0).setCellValue("Специальноcть");
      row.createCell(1).setCellValue("Форма обучения");
      row.createCell(2).setCellValue("Наименование целевой организации");
      row.createCell(3).setCellValue("План приема");
      row.createCell(4).setCellValue("Количество поданных заявлений");
      row.createCell(5).setCellValue("Количество зачисленных");

      int sheetMinZdrav_crs;
      for(sheetMinZdrav_crs = 1; sheetMinZdrav_crs < statisticsMinZdrav_speciality.length + 1; ++sheetMinZdrav_crs) {
         row = var32.createRow(sheetMinZdrav_crs);
         row.createCell(0).setCellValue(statisticsMinZdrav_speciality[sheetMinZdrav_crs - 1][0]);
         row.createCell(1).setCellValue(statisticsMinZdrav_speciality[sheetMinZdrav_crs - 1][1]);
         row.createCell(2).setCellValue(statisticsMinZdrav_speciality[sheetMinZdrav_crs - 1][2]);
         row.createCell(3).setCellValue("terra incognita");
         row.createCell(4).setCellValue((double)Integer.valueOf(statisticsMinZdrav_speciality[sheetMinZdrav_crs - 1][3]).intValue());
         row.createCell(5).setCellValue((double)Integer.valueOf(statisticsMinZdrav_speciality[sheetMinZdrav_crs - 1][4]).intValue());
      }

      for(sheetMinZdrav_crs = 0; sheetMinZdrav_crs <= statisticsMinZdrav_speciality[0].length; ++sheetMinZdrav_crs) {
         var32.autoSizeColumn(sheetMinZdrav_crs);
      }

      XSSFSheet var33 = workbook.createSheet("МинЗдрав_Направление");
      String[][] statisticsMinZdrav_cousre = ModelDBConnection.getStatisticsMinZdrav(true);
      row = var33.createRow(0);
      row.createCell(0).setCellValue("Направление");
      row.createCell(1).setCellValue("Форма обучения");
      row.createCell(2).setCellValue("Наименование целевой организации");
      row.createCell(3).setCellValue("План приема");
      row.createCell(4).setCellValue("Количество поданных заявлений");
      row.createCell(5).setCellValue("Количество зачисленных");

      int row0;
      for(row0 = 1; row0 < statisticsMinZdrav_cousre.length + 1; ++row0) {
         row = var33.createRow(row0);
         row.createCell(0).setCellValue(statisticsMinZdrav_cousre[row0 - 1][0]);
         row.createCell(1).setCellValue(statisticsMinZdrav_cousre[row0 - 1][1]);
         row.createCell(2).setCellValue(statisticsMinZdrav_cousre[row0 - 1][2]);
         row.createCell(3).setCellValue("terra incognita");
         row.createCell(4).setCellValue((double)Integer.valueOf(statisticsMinZdrav_cousre[row0 - 1][3]).intValue());
         row.createCell(5).setCellValue((double)Integer.valueOf(statisticsMinZdrav_cousre[row0 - 1][4]).intValue());
      }

      for(row0 = 0; row0 <= statisticsMinZdrav_cousre[0].length; ++row0) {
         var33.autoSizeColumn(row0);
      }

      XSSFSheet sheetRegionFull_SubmittedDocuments_sp = workbook.createSheet("РC по регионам_Подано_Специальность");
      String[][] statisticsRegionFull_SubmittedDocuments_speciality = ModelDBConnection.getStatisticsRegionFull_SubmittedDocuments(false);
      XSSFRow var34 = sheetRegionFull_SubmittedDocuments_sp.createRow(0);
      var34.createCell(0).setCellValue("Специальноcть");
      var34.createCell(1).setCellValue("Форма обучения");
      var34.createCell(2).setCellValue("Источник финансирования");
      XSSFRow row1 = sheetRegionFull_SubmittedDocuments_sp.createRow(1);
      int regionNumber = 1;

      for(int jRow = 1; !statisticsRegionFull_SubmittedDocuments_speciality[0][3].equals(statisticsRegionFull_SubmittedDocuments_speciality[jRow][3]); ++jRow) {
         ++regionNumber;
      }

      int tmp = 0;

      int pitch;
      for(pitch = 3; tmp != regionNumber; pitch += 2) {
         sheetRegionFull_SubmittedDocuments_sp.addMergedRegion(new CellRangeAddress(0, 0, pitch, pitch + 1));
         var34.createCell(pitch).setCellValue(statisticsRegionFull_SubmittedDocuments_speciality[tmp][3]);
         row1.createCell(pitch).setCellValue("Подано заявлений");
         row1.createCell(pitch + 1).setCellValue("в т.ч. на целевые места");
         ++tmp;
      }

      int gap = 0;

      int sheetRegionFull_SubmittedDocuments_crs;
      int sheetRegionFull_Enrolled_sp;
      for(sheetRegionFull_SubmittedDocuments_crs = 2; sheetRegionFull_SubmittedDocuments_crs < statisticsRegionFull_SubmittedDocuments_speciality.length + 2; sheetRegionFull_SubmittedDocuments_crs += regionNumber) {
         if(sheetRegionFull_SubmittedDocuments_crs == 2) {
            row = sheetRegionFull_SubmittedDocuments_sp.createRow(sheetRegionFull_SubmittedDocuments_crs);
         } else {
            row = sheetRegionFull_SubmittedDocuments_sp.createRow(2 + gap);
         }

         row.createCell(0).setCellValue(statisticsRegionFull_SubmittedDocuments_speciality[sheetRegionFull_SubmittedDocuments_crs - 2][0]);
         row.createCell(1).setCellValue(statisticsRegionFull_SubmittedDocuments_speciality[sheetRegionFull_SubmittedDocuments_crs - 2][1]);
         row.createCell(2).setCellValue(statisticsRegionFull_SubmittedDocuments_speciality[sheetRegionFull_SubmittedDocuments_crs - 2][2]);
         int statisticsRegionFull_SubmittedDocuments_course = 0;

         for(sheetRegionFull_Enrolled_sp = 3; sheetRegionFull_Enrolled_sp < regionNumber * 2 + 3; sheetRegionFull_Enrolled_sp += 2) {
            row.createCell(sheetRegionFull_Enrolled_sp).setCellValue((double)Integer.valueOf(statisticsRegionFull_SubmittedDocuments_speciality[sheetRegionFull_SubmittedDocuments_crs - 2 + statisticsRegionFull_SubmittedDocuments_course][4]).intValue());
            row.createCell(sheetRegionFull_Enrolled_sp + 1).setCellValue((double)Integer.valueOf(statisticsRegionFull_SubmittedDocuments_speciality[sheetRegionFull_SubmittedDocuments_crs - 2 + statisticsRegionFull_SubmittedDocuments_course][5]).intValue());
            ++statisticsRegionFull_SubmittedDocuments_course;
         }

         ++gap;
      }

      for(sheetRegionFull_SubmittedDocuments_crs = 0; sheetRegionFull_SubmittedDocuments_crs <= statisticsRegionFull_SubmittedDocuments_speciality[0].length + 1; ++sheetRegionFull_SubmittedDocuments_crs) {
         sheetRegionFull_SubmittedDocuments_sp.autoSizeColumn(sheetRegionFull_SubmittedDocuments_crs);
      }

      XSSFSheet var35 = workbook.createSheet("РC по регионам_Подано_Направление");
      String[][] var36 = ModelDBConnection.getStatisticsRegionFull_SubmittedDocuments(true);
      var34 = var35.createRow(0);
      var34.createCell(0).setCellValue("Направление");
      var34.createCell(1).setCellValue("Форма обучения");
      var34.createCell(2).setCellValue("Источник финансирования");
      row1 = var35.createRow(1);
      tmp = 0;

      for(pitch = 3; tmp != regionNumber; pitch += 2) {
         var35.addMergedRegion(new CellRangeAddress(0, 0, pitch, pitch + 1));
         var34.createCell(pitch).setCellValue(var36[tmp][3]);
         row1.createCell(pitch).setCellValue("Подано заявлений");
         row1.createCell(pitch + 1).setCellValue("в т.ч. на целевые места");
         ++tmp;
      }

      gap = 0;

      for(sheetRegionFull_Enrolled_sp = 2; sheetRegionFull_Enrolled_sp < var36.length + 2; sheetRegionFull_Enrolled_sp += regionNumber) {
         if(sheetRegionFull_Enrolled_sp == 2) {
            row = var35.createRow(sheetRegionFull_Enrolled_sp);
         } else {
            row = var35.createRow(2 + gap);
         }

         row.createCell(0).setCellValue(var36[sheetRegionFull_Enrolled_sp - 2][0]);
         row.createCell(1).setCellValue(var36[sheetRegionFull_Enrolled_sp - 2][1]);
         row.createCell(2).setCellValue(var36[sheetRegionFull_Enrolled_sp - 2][2]);
         tmp = 0;

         for(int statisticsRegionFull_Enrolled_speciality = 3; statisticsRegionFull_Enrolled_speciality < regionNumber * 2 + 3; statisticsRegionFull_Enrolled_speciality += 2) {
            row.createCell(statisticsRegionFull_Enrolled_speciality).setCellValue((double)Integer.valueOf(var36[sheetRegionFull_Enrolled_sp - 2 + tmp][4]).intValue());
            row.createCell(statisticsRegionFull_Enrolled_speciality + 1).setCellValue((double)Integer.valueOf(var36[sheetRegionFull_Enrolled_sp - 2 + tmp][5]).intValue());
            ++tmp;
         }

         ++gap;
      }

      for(sheetRegionFull_Enrolled_sp = 0; sheetRegionFull_Enrolled_sp <= var36[0].length + 1; ++sheetRegionFull_Enrolled_sp) {
         var35.autoSizeColumn(sheetRegionFull_Enrolled_sp);
      }

      XSSFSheet var38 = workbook.createSheet("РC по регионам_Зачислено_Специальность");
      String[][] var37 = ModelDBConnection.getStatisticsRegionFull_Enrolled(false);
      var34 = var38.createRow(0);
      var34.createCell(0).setCellValue("Специальноcть");
      var34.createCell(1).setCellValue("Форма обучения");
      var34.createCell(2).setCellValue("Источник финансирования");
      row1 = var38.createRow(1);
      tmp = 0;

      for(pitch = 3; tmp != regionNumber; pitch += 2) {
         var38.addMergedRegion(new CellRangeAddress(0, 0, pitch, pitch + 1));
         var34.createCell(pitch).setCellValue(var37[tmp][3]);
         row1.createCell(pitch).setCellValue("Подано заявлений");
         row1.createCell(pitch + 1).setCellValue("в т.ч. на целевые места");
         ++tmp;
      }

      gap = 0;

      int sheetRegionFull_Enrolled_crs;
      int sheetRegionShort_sp;
      for(sheetRegionFull_Enrolled_crs = 2; sheetRegionFull_Enrolled_crs < var37.length + 2; sheetRegionFull_Enrolled_crs += regionNumber) {
         if(sheetRegionFull_Enrolled_crs == 2) {
            row = var38.createRow(sheetRegionFull_Enrolled_crs);
         } else {
            row = var38.createRow(2 + gap);
         }

         row.createCell(0).setCellValue(var37[sheetRegionFull_Enrolled_crs - 2][0]);
         row.createCell(1).setCellValue(var37[sheetRegionFull_Enrolled_crs - 2][1]);
         row.createCell(2).setCellValue(var37[sheetRegionFull_Enrolled_crs - 2][2]);
         int statisticsRegionFull_Enrolled_course = 0;

         for(sheetRegionShort_sp = 3; sheetRegionShort_sp < regionNumber * 2 + 3; sheetRegionShort_sp += 2) {
            row.createCell(sheetRegionShort_sp).setCellValue((double)Integer.valueOf(var37[sheetRegionFull_Enrolled_crs - 2 + statisticsRegionFull_Enrolled_course][4]).intValue());
            row.createCell(sheetRegionShort_sp + 1).setCellValue((double)Integer.valueOf(var37[sheetRegionFull_Enrolled_crs - 2 + statisticsRegionFull_Enrolled_course][5]).intValue());
            ++statisticsRegionFull_Enrolled_course;
         }

         ++gap;
      }

      for(sheetRegionFull_Enrolled_crs = 0; sheetRegionFull_Enrolled_crs <= var37[0].length + 1; ++sheetRegionFull_Enrolled_crs) {
         var38.autoSizeColumn(sheetRegionFull_Enrolled_crs);
      }

      XSSFSheet var39 = workbook.createSheet("РC по регионам_Зачислено_Направление");
      String[][] var40 = ModelDBConnection.getStatisticsRegionFull_Enrolled(true);
      var34 = var39.createRow(0);
      var34.createCell(0).setCellValue("Направление");
      var34.createCell(1).setCellValue("Форма обучения");
      var34.createCell(2).setCellValue("Источник финансирования");
      row1 = var39.createRow(1);
      tmp = 0;

      for(pitch = 3; tmp != regionNumber; pitch += 2) {
         var39.addMergedRegion(new CellRangeAddress(0, 0, pitch, pitch + 1));
         var34.createCell(pitch).setCellValue(var40[tmp][3]);
         row1.createCell(pitch).setCellValue("Подано заявлений");
         row1.createCell(pitch + 1).setCellValue("в т.ч. на целевые места");
         ++tmp;
      }

      gap = 0;

      for(sheetRegionShort_sp = 2; sheetRegionShort_sp < var40.length + 2; sheetRegionShort_sp += regionNumber) {
         if(sheetRegionShort_sp == 2) {
            row = var39.createRow(sheetRegionShort_sp);
         } else {
            row = var39.createRow(2 + gap);
         }

         row.createCell(0).setCellValue(var40[sheetRegionShort_sp - 2][0]);
         row.createCell(1).setCellValue(var40[sheetRegionShort_sp - 2][1]);
         row.createCell(2).setCellValue(var40[sheetRegionShort_sp - 2][2]);
         tmp = 0;

         for(int statisticsRegionShort_speciality = 3; statisticsRegionShort_speciality < regionNumber * 2 + 3; statisticsRegionShort_speciality += 2) {
            row.createCell(statisticsRegionShort_speciality).setCellValue((double)Integer.valueOf(var40[sheetRegionShort_sp - 2 + tmp][4]).intValue());
            row.createCell(statisticsRegionShort_speciality + 1).setCellValue((double)Integer.valueOf(var40[sheetRegionShort_sp - 2 + tmp][5]).intValue());
            ++tmp;
         }

         ++gap;
      }

      for(sheetRegionShort_sp = 0; sheetRegionShort_sp <= var40[0].length + 1; ++sheetRegionShort_sp) {
         var39.autoSizeColumn(sheetRegionShort_sp);
      }

      XSSFSheet var42 = workbook.createSheet("Сокращенная статистика по регионам_Специальность");
      String[][] var41 = ModelDBConnection.getStatisticsRegionShort(false);
      var42.addMergedRegion(new CellRangeAddress(0, 0, 4, 6));
      var42.addMergedRegion(new CellRangeAddress(0, 0, 7, 9));
      row = var42.createRow(0);
      row.createCell(0).setCellValue("Специальноcть");
      row.createCell(1).setCellValue("Форма обучения");
      row.createCell(2).setCellValue("Источник финансирования");
      row.createCell(3).setCellValue("Целевая организация");
      row.createCell(4).setCellValue("Подано заявлений");
      row.createCell(7).setCellValue("Зачислено");
      row = var42.createRow(1);
      row.createCell(4).setCellValue("Из Н.Новгорода");
      row.createCell(5).setCellValue("Из Нижегородской обл.");
      row.createCell(6).setCellValue("За пределами Нижегородской обл.");
      row.createCell(7).setCellValue("Из Н.Новгорода");
      row.createCell(8).setCellValue("Из Нижегородской обл.");
      row.createCell(9).setCellValue("За пределами Нижегородской обл.");

      int sheetRegionShort_crs;
      for(sheetRegionShort_crs = 2; sheetRegionShort_crs < var41.length + 2; ++sheetRegionShort_crs) {
         row = var42.createRow(sheetRegionShort_crs);
         row.createCell(0).setCellValue(var41[sheetRegionShort_crs - 2][1]);
         row.createCell(1).setCellValue(var41[sheetRegionShort_crs - 2][3]);
         row.createCell(2).setCellValue(var41[sheetRegionShort_crs - 2][5]);
         row.createCell(3).setCellValue(var41[sheetRegionShort_crs - 2][7]);
         row.createCell(4).setCellValue((double)Integer.valueOf(var41[sheetRegionShort_crs - 2][8]).intValue());
         row.createCell(5).setCellValue((double)Integer.valueOf(var41[sheetRegionShort_crs - 2][9]).intValue());
         row.createCell(6).setCellValue((double)Integer.valueOf(var41[sheetRegionShort_crs - 2][10]).intValue());
         row.createCell(7).setCellValue((double)Integer.valueOf(var41[sheetRegionShort_crs - 2][11]).intValue());
         row.createCell(8).setCellValue((double)Integer.valueOf(var41[sheetRegionShort_crs - 2][12]).intValue());
         row.createCell(9).setCellValue((double)Integer.valueOf(var41[sheetRegionShort_crs - 2][13]).intValue());
      }

      for(sheetRegionShort_crs = 0; sheetRegionShort_crs <= var41[0].length; ++sheetRegionShort_crs) {
         var42.autoSizeColumn(sheetRegionShort_crs);
      }

      XSSFSheet var43 = workbook.createSheet("Сокращ стат по регионам_Напр");
      String[][] statisticsRegionShort_course = ModelDBConnection.getStatisticsRegionShort(true);
      var43.addMergedRegion(new CellRangeAddress(0, 0, 4, 6));
      var43.addMergedRegion(new CellRangeAddress(0, 0, 7, 9));
      row = var43.createRow(0);
      row.createCell(0).setCellValue("Направление");
      row.createCell(1).setCellValue("Форма обучения");
      row.createCell(2).setCellValue("Источник финансирования");
      row.createCell(3).setCellValue("Целевая организация");
      row.createCell(4).setCellValue("Подано заявлений");
      row.createCell(7).setCellValue("Зачислено");
      row = var43.createRow(1);
      row.createCell(4).setCellValue("Из Н.Новгорода");
      row.createCell(5).setCellValue("Из Нижегородской обл.");
      row.createCell(6).setCellValue("За пределами Нижегородской обл.");
      row.createCell(7).setCellValue("Из Н.Новгорода");
      row.createCell(8).setCellValue("Из Нижегородской обл.");
      row.createCell(9).setCellValue("За пределами Нижегородской обл.");

      int path;
      for(path = 2; path < statisticsRegionShort_course.length + 2; ++path) {
         row = var43.createRow(path);
         row.createCell(0).setCellValue(statisticsRegionShort_course[path - 2][1]);
         row.createCell(1).setCellValue(statisticsRegionShort_course[path - 2][3]);
         row.createCell(2).setCellValue(statisticsRegionShort_course[path - 2][5]);
         row.createCell(3).setCellValue(statisticsRegionShort_course[path - 2][7]);
         row.createCell(4).setCellValue((double)Integer.valueOf(statisticsRegionShort_course[path - 2][8]).intValue());
         row.createCell(5).setCellValue((double)Integer.valueOf(statisticsRegionShort_course[path - 2][9]).intValue());
         row.createCell(6).setCellValue((double)Integer.valueOf(statisticsRegionShort_course[path - 2][10]).intValue());
         row.createCell(7).setCellValue((double)Integer.valueOf(statisticsRegionShort_course[path - 2][11]).intValue());
         row.createCell(8).setCellValue((double)Integer.valueOf(statisticsRegionShort_course[path - 2][12]).intValue());
         row.createCell(9).setCellValue((double)Integer.valueOf(statisticsRegionShort_course[path - 2][13]).intValue());
      }

      for(path = 0; path <= statisticsRegionShort_course[0].length; ++path) {
         var43.autoSizeColumn(path);
      }

      String var44 = currentPath + "\\files\\Статистика" + "_" + (new SimpleDateFormat("dd.MM.yyyy")).format(new Date()) + ".xls";
      File file = new File(var44);
      if(file.exists()) {
         file.delete();
      }

      file.createNewFile();
      workbook.write(new FileOutputStream(file));
   }

   public static void writeStatisticsShort() throws Exception {
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      Connection con = ModelDBConnection.getConnection();
      ResultSet rset = null;
      CallableStatement cstmt = null;
      XSSFWorkbook workbook = new XSSFWorkbook();
      byte rowNum = 0;
      XSSFFont fontForNames = workbook.createFont();
      fontForNames.setBold(true);
      XSSFCellStyle styleForNames = workbook.createCellStyle();
      styleForNames.setFont(fontForNames);
      styleForNames.setBorderBottom((short)1);
      styleForNames.setBorderLeft((short)1);
      styleForNames.setBorderRight((short)1);
      styleForNames.setBorderTop((short)1);
      styleForNames.setAlignment((short)2);
      styleForNames.setVerticalAlignment((short)1);
      XSSFCellStyle styleForCells = workbook.createCellStyle();
      styleForCells.setBorderBottom((short)1);
      styleForCells.setBorderLeft((short)1);
      styleForCells.setBorderRight((short)1);
      styleForCells.setBorderTop((short)1);
      styleForCells.setVerticalAlignment((short)1);
      XSSFCellStyle styleForCellsWithCenterAlg = workbook.createCellStyle();
      styleForCellsWithCenterAlg.setBorderBottom((short)1);
      styleForCellsWithCenterAlg.setBorderLeft((short)1);
      styleForCellsWithCenterAlg.setBorderRight((short)1);
      styleForCellsWithCenterAlg.setBorderTop((short)1);
      styleForCellsWithCenterAlg.setAlignment((short)2);
      styleForCellsWithCenterAlg.setVerticalAlignment((short)1);
      styleForCellsWithCenterAlg.setWrapText(true);
      XSSFSheet sheetSpecialityStatistics = workbook.createSheet("Статистика по специальностям");
      sheetSpecialityStatistics.addMergedRegion(new CellRangeAddress(0, 1, 0, 0));
      sheetSpecialityStatistics.addMergedRegion(new CellRangeAddress(0, 1, 1, 1));
      sheetSpecialityStatistics.addMergedRegion(new CellRangeAddress(0, 0, 2, 4));
      sheetSpecialityStatistics.addMergedRegion(new CellRangeAddress(0, 0, 5, 7));
      XSSFRow row = sheetSpecialityStatistics.createRow(rowNum);
      row.createCell(0).setCellValue("Специальноcть");
      row.createCell(1).setCellValue("Форма обучения");
      row.createCell(2).setCellValue("Количество поданных заявлений");
      row.createCell(5).setCellValue("Количество зачисленных");
      row.getCell(0).setCellStyle(styleForNames);
      row.getCell(1).setCellStyle(styleForNames);
      row.getCell(2).setCellStyle(styleForNames);
      row.getCell(5).setCellStyle(styleForNames);
      int var17 = rowNum + 1;
      row = sheetSpecialityStatistics.createRow(var17);
      row.createCell(2).setCellValue("всего (бюджет)");
      row.createCell(3).setCellValue("в т.ч. целевая квота");
      row.createCell(4).setCellValue("на коммерческие места");
      row.createCell(5).setCellValue("всего (бюджет)");
      row.createCell(6).setCellValue("в т.ч. целевая квота");
      row.createCell(7).setCellValue("на коммерческие места");
      row.getCell(2).setCellStyle(styleForNames);
      row.getCell(3).setCellStyle(styleForNames);
      row.getCell(4).setCellStyle(styleForNames);
      row.getCell(5).setCellStyle(styleForNames);
      row.getCell(6).setCellStyle(styleForNames);
      row.getCell(7).setCellStyle(styleForNames);
      ++var17;
      String query_bySpecialities = "select\tSpeciality.name, EducationForm.name, (select count(*) from AbiturientCompetitiveGroup where speciality = Speciality.id and educationForm = EducationForm.id and competitiveGroup in (1, 2)), (select count(*) from AbiturientCompetitiveGroup where speciality = Speciality.id and educationForm = EducationForm.id and competitiveGroup in (1)), (select count(*) from AbiturientCompetitiveGroup where speciality = Speciality.id and educationForm = EducationForm.id and competitiveGroup in (3, 4)), (select count(*) from AbiturientCompetitiveGroup where speciality = Speciality.id and educationForm = EducationForm.id and competitiveGroup in (1, 2) and isNULL(markEnrollment, 0) > 0), (select count(*) from AbiturientCompetitiveGroup where speciality = Speciality.id and educationForm = EducationForm.id and competitiveGroup in (1) and isNULL(markEnrollment, 0) > 0), (select count(*) from AbiturientCompetitiveGroup where speciality = Speciality.id and educationForm = EducationForm.id and competitiveGroup in (3, 4) and isNULL(markEnrollment, 0) > 0) from\tSpeciality, EducationForm where exists (select * from AbiturientCompetitiveGroup where speciality = Speciality.id and educationForm = EducationForm.id) order by Speciality.id, EducationForm.id";
      cstmt = con.prepareCall(query_bySpecialities, 1004, 1007);
      rset = cstmt.executeQuery();

      while(rset.next()) {
         row = sheetSpecialityStatistics.createRow(var17++);
         row.createCell(0).setCellValue(rset.getString(1));
         row.createCell(1).setCellValue(rset.getString(2));
         row.createCell(2).setCellValue((double)rset.getInt(3));
         row.createCell(3).setCellValue((double)rset.getInt(4));
         row.createCell(4).setCellValue((double)rset.getInt(5));
         row.createCell(5).setCellValue((double)rset.getInt(6));
         row.createCell(6).setCellValue((double)rset.getInt(7));
         row.createCell(7).setCellValue((double)rset.getInt(8));
         row.getCell(0).setCellStyle(styleForCells);
         row.getCell(1).setCellStyle(styleForCells);
         row.getCell(2).setCellStyle(styleForCellsWithCenterAlg);
         row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
         row.getCell(4).setCellStyle(styleForCellsWithCenterAlg);
         row.getCell(5).setCellStyle(styleForCellsWithCenterAlg);
         row.getCell(6).setCellStyle(styleForCellsWithCenterAlg);
         row.getCell(7).setCellStyle(styleForCellsWithCenterAlg);
      }

      rset.close();
      rowNum = 0;
      XSSFSheet sheetCourseStatistics = workbook.createSheet("Статистика по направлениям");
      sheetCourseStatistics.addMergedRegion(new CellRangeAddress(0, 1, 0, 0));
      sheetCourseStatistics.addMergedRegion(new CellRangeAddress(0, 1, 1, 1));
      sheetCourseStatistics.addMergedRegion(new CellRangeAddress(0, 0, 2, 4));
      sheetCourseStatistics.addMergedRegion(new CellRangeAddress(0, 0, 5, 7));
      row = sheetCourseStatistics.createRow(rowNum);
      row.createCell(0).setCellValue("Направление");
      row.createCell(1).setCellValue("Форма обучения");
      row.createCell(2).setCellValue("Количество поданных заявлений");
      row.createCell(5).setCellValue("Количество зачисленных");
      row.getCell(0).setCellStyle(styleForNames);
      row.getCell(1).setCellStyle(styleForNames);
      row.getCell(2).setCellStyle(styleForNames);
      row.getCell(5).setCellStyle(styleForNames);
      var17 = rowNum + 1;
      row = sheetCourseStatistics.createRow(var17);
      row.createCell(2).setCellValue("всего (бюджет)");
      row.createCell(3).setCellValue("в т.ч. целевая квота");
      row.createCell(4).setCellValue("на коммерческие места");
      row.createCell(5).setCellValue("всего (бюджет)");
      row.createCell(6).setCellValue("в т.ч. целевая квота");
      row.createCell(7).setCellValue("на коммерческие места");
      row.getCell(2).setCellStyle(styleForNames);
      row.getCell(3).setCellStyle(styleForNames);
      row.getCell(4).setCellStyle(styleForNames);
      row.getCell(5).setCellStyle(styleForNames);
      row.getCell(6).setCellStyle(styleForNames);
      row.getCell(7).setCellStyle(styleForNames);
      ++var17;
      String query_byCourses = "select\tCourse.name, EducationForm.name, (select count(*) from AbiturientCompetitiveGroup where course = Course.id and educationForm = EducationForm.id and competitiveGroup in (1, 2)), (select count(*) from AbiturientCompetitiveGroup where course = Course.id and educationForm = EducationForm.id and competitiveGroup in (1)), (select count(*) from AbiturientCompetitiveGroup where course = Course.id and educationForm = EducationForm.id and competitiveGroup in (3, 4)), (select count(*) from AbiturientCompetitiveGroup where course = Course.id and educationForm = EducationForm.id and competitiveGroup in (1, 2) and isNULL(markEnrollment, 0) > 0), (select count(*) from AbiturientCompetitiveGroup where course = Course.id and educationForm = EducationForm.id and competitiveGroup in (1) and isNULL(markEnrollment, 0) > 0), (select count(*) from AbiturientCompetitiveGroup where course = Course.id and educationForm = EducationForm.id and competitiveGroup in (3, 4) and isNULL(markEnrollment, 0) > 0) from\tCourse, EducationForm where exists (select * from AbiturientCompetitiveGroup where course = Course.id and educationForm = EducationForm.id) order by Course.id, EducationForm.id";
      cstmt = con.prepareCall(query_byCourses, 1004, 1007);
      rset = cstmt.executeQuery();

      while(rset.next()) {
         row = sheetCourseStatistics.createRow(var17++);
         row.createCell(0).setCellValue(rset.getString(1));
         row.createCell(1).setCellValue(rset.getString(2));
         row.createCell(2).setCellValue((double)rset.getInt(3));
         row.createCell(3).setCellValue((double)rset.getInt(4));
         row.createCell(4).setCellValue((double)rset.getInt(5));
         row.createCell(5).setCellValue((double)rset.getInt(6));
         row.createCell(6).setCellValue((double)rset.getInt(7));
         row.createCell(7).setCellValue((double)rset.getInt(8));
         row.getCell(0).setCellStyle(styleForCells);
         row.getCell(1).setCellStyle(styleForCells);
         row.getCell(2).setCellStyle(styleForCellsWithCenterAlg);
         row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
         row.getCell(4).setCellStyle(styleForCellsWithCenterAlg);
         row.getCell(5).setCellStyle(styleForCellsWithCenterAlg);
         row.getCell(6).setCellStyle(styleForCellsWithCenterAlg);
         row.getCell(7).setCellStyle(styleForCellsWithCenterAlg);
      }

      rset.close();
      String path = currentPath + "\\files\\Статистика_" + moduleType + "_" + (new SimpleDateFormat("dd.MM.yyyy")).format(new Date()) + ".xls";
      File file = new File(path);
      if(file.exists()) {
         file.delete();
      }

      file.createNewFile();
      workbook.write(new FileOutputStream(file));
      Desktop.getDesktop().open(file);
   }

   public static void writeStatisticsForIndividualAchievements() throws Exception {
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      Connection con = ModelDBConnection.getConnection();
      ResultSet rset = null;
      CallableStatement cstmt = null;
      String[][] allIndividualAchievements = ModelDBConnection.getAllFromTableOrderedById("IndividualAchievement");
      XSSFWorkbook workbook = new XSSFWorkbook();
      byte rowNum = 0;
      XSSFFont fontForNames = workbook.createFont();
      fontForNames.setBold(true);
      XSSFCellStyle styleForNames = workbook.createCellStyle();
      styleForNames.setFont(fontForNames);
      styleForNames.setBorderBottom((short)1);
      styleForNames.setBorderLeft((short)1);
      styleForNames.setBorderRight((short)1);
      styleForNames.setBorderTop((short)1);
      styleForNames.setAlignment((short)2);
      styleForNames.setVerticalAlignment((short)1);
      styleForNames.setWrapText(true);
      XSSFCellStyle styleForCells = workbook.createCellStyle();
      styleForCells.setBorderBottom((short)1);
      styleForCells.setBorderLeft((short)1);
      styleForCells.setBorderRight((short)1);
      styleForCells.setBorderTop((short)1);
      styleForCells.setVerticalAlignment((short)1);
      XSSFCellStyle styleForCellsWithCenterAlg = workbook.createCellStyle();
      styleForCellsWithCenterAlg.setBorderBottom((short)1);
      styleForCellsWithCenterAlg.setBorderLeft((short)1);
      styleForCellsWithCenterAlg.setBorderRight((short)1);
      styleForCellsWithCenterAlg.setBorderTop((short)1);
      styleForCellsWithCenterAlg.setAlignment((short)2);
      styleForCellsWithCenterAlg.setVerticalAlignment((short)1);
      styleForCellsWithCenterAlg.setWrapText(true);
      XSSFSheet sheetSpecialityStatistics = workbook.createSheet("Статистика по специальностям");
      sheetSpecialityStatistics.addMergedRegion(new CellRangeAddress(0, 1, 0, 0));
      sheetSpecialityStatistics.addMergedRegion(new CellRangeAddress(0, 1, 1, 1));
      sheetSpecialityStatistics.addMergedRegion(new CellRangeAddress(0, 1, 2, 2));
      sheetSpecialityStatistics.addMergedRegion(new CellRangeAddress(0, 0, 3, 3 + allIndividualAchievements.length - 1));
      sheetSpecialityStatistics.addMergedRegion(new CellRangeAddress(0, 0, 3 + allIndividualAchievements.length, 3 + allIndividualAchievements.length + allIndividualAchievements.length - 1));
      XSSFRow row = sheetSpecialityStatistics.createRow(rowNum);
      row.createCell(0).setCellValue("Специальноcть");
      row.createCell(1).setCellValue("Форма обучения");
      row.createCell(2).setCellValue("Конкурсная группа");
      row.createCell(3).setCellValue("Подано заявлений по категориям");
      row.createCell(3 + allIndividualAchievements.length).setCellValue("Зачислено по категориям");
      row.getCell(0).setCellStyle(styleForNames);
      row.getCell(1).setCellStyle(styleForNames);
      row.getCell(2).setCellStyle(styleForNames);
      row.getCell(3).setCellStyle(styleForNames);
      row.getCell(3 + allIndividualAchievements.length).setCellStyle(styleForNames);
      int var18 = rowNum + 1;
      row = sheetSpecialityStatistics.createRow(var18);

      int query_bySpecialities;
      for(query_bySpecialities = 0; query_bySpecialities < allIndividualAchievements.length; ++query_bySpecialities) {
         row.createCell(3 + query_bySpecialities).setCellValue(allIndividualAchievements[query_bySpecialities][1]);
         row.getCell(3 + query_bySpecialities).setCellStyle(styleForNames);
      }

      for(query_bySpecialities = 0; query_bySpecialities < allIndividualAchievements.length; ++query_bySpecialities) {
         row.createCell(3 + allIndividualAchievements.length + query_bySpecialities).setCellValue(allIndividualAchievements[query_bySpecialities][1]);
         row.getCell(3 + allIndividualAchievements.length + query_bySpecialities).setCellStyle(styleForNames);
      }

      ++var18;
      String var19 = "select\tSpeciality.name, EducationForm.name, CompetitiveGroup.name, ";

      int sheetCourseStatistics;
      for(sheetCourseStatistics = 0; sheetCourseStatistics < allIndividualAchievements.length; ++sheetCourseStatistics) {
         var19 = var19 + "(select count(*) from AbiturientCompetitiveGroup where speciality = Speciality.id and educationForm = EducationForm.id and competitiveGroup = CompetitiveGroup.id and exists(select * from AbiturientIndividualAchievement where (AbiturientIndividualAchievement.aid_abiturient = AbiturientCompetitiveGroup.aid_abiturient and AbiturientIndividualAchievement.id_individual_achievement = " + allIndividualAchievements[sheetCourseStatistics][0] + "))), ";
      }

      for(sheetCourseStatistics = 0; sheetCourseStatistics < allIndividualAchievements.length; ++sheetCourseStatistics) {
         var19 = var19 + "(select count(*) from AbiturientCompetitiveGroup where speciality = Speciality.id and educationForm = EducationForm.id and competitiveGroup = CompetitiveGroup.id and isNULL(markEnrollment, 0) > 0 and exists(select * from AbiturientIndividualAchievement where (AbiturientIndividualAchievement.aid_abiturient = AbiturientCompetitiveGroup.aid_abiturient and AbiturientIndividualAchievement.id_individual_achievement = " + allIndividualAchievements[sheetCourseStatistics][0] + ")))";
         var19 = var19 + (sheetCourseStatistics == allIndividualAchievements.length - 1?" ":", ");
      }

      var19 = var19 + "from Speciality, EducationForm, CompetitiveGroup where exists (select * from AbiturientCompetitiveGroup where speciality = Speciality.id and educationForm = EducationForm.id) order by Speciality.id, EducationForm.id, CompetitiveGroup.id";
      cstmt = con.prepareCall(var19, 1004, 1007);
      rset = cstmt.executeQuery();

      while(rset.next()) {
         row = sheetSpecialityStatistics.createRow(var18++);
         row.createCell(0).setCellValue(rset.getString(1));
         row.createCell(1).setCellValue(rset.getString(2));
         row.createCell(2).setCellValue(rset.getString(3));

         for(sheetCourseStatistics = 0; sheetCourseStatistics < allIndividualAchievements.length; ++sheetCourseStatistics) {
            row.createCell(3 + sheetCourseStatistics).setCellValue((double)rset.getInt(4 + sheetCourseStatistics));
         }

         for(sheetCourseStatistics = 0; sheetCourseStatistics < allIndividualAchievements.length; ++sheetCourseStatistics) {
            row.createCell(3 + allIndividualAchievements.length + sheetCourseStatistics).setCellValue((double)rset.getInt(4 + allIndividualAchievements.length + sheetCourseStatistics));
         }

         row.getCell(0).setCellStyle(styleForCells);
         row.getCell(1).setCellStyle(styleForCells);
         row.getCell(2).setCellStyle(styleForCells);

         for(sheetCourseStatistics = 0; sheetCourseStatistics < allIndividualAchievements.length; ++sheetCourseStatistics) {
            row.getCell(3 + sheetCourseStatistics).setCellStyle(styleForCellsWithCenterAlg);
         }

         for(sheetCourseStatistics = 0; sheetCourseStatistics < allIndividualAchievements.length; ++sheetCourseStatistics) {
            row.getCell(3 + allIndividualAchievements.length + sheetCourseStatistics).setCellStyle(styleForCellsWithCenterAlg);
         }
      }

      rset.close();
      rowNum = 0;
      XSSFSheet var21 = workbook.createSheet("Статистика по направлениям");
      var21.addMergedRegion(new CellRangeAddress(0, 1, 0, 0));
      var21.addMergedRegion(new CellRangeAddress(0, 1, 1, 1));
      var21.addMergedRegion(new CellRangeAddress(0, 1, 2, 2));
      var21.addMergedRegion(new CellRangeAddress(0, 0, 3, 3 + allIndividualAchievements.length - 1));
      var21.addMergedRegion(new CellRangeAddress(0, 0, 3 + allIndividualAchievements.length, 3 + allIndividualAchievements.length + allIndividualAchievements.length - 1));
      row = var21.createRow(rowNum);
      row.createCell(0).setCellValue("Направление");
      row.createCell(1).setCellValue("Форма обучения");
      row.createCell(2).setCellValue("Конкурсная группа");
      row.createCell(3).setCellValue("Подано заявлений по категориям");
      row.createCell(3 + allIndividualAchievements.length).setCellValue("Зачислено по категориям");
      row.getCell(0).setCellStyle(styleForNames);
      row.getCell(1).setCellStyle(styleForNames);
      row.getCell(2).setCellStyle(styleForNames);
      row.getCell(3).setCellStyle(styleForNames);
      row.getCell(3 + allIndividualAchievements.length).setCellStyle(styleForNames);
      var18 = rowNum + 1;
      row = var21.createRow(var18);

      int query_byCourses;
      for(query_byCourses = 0; query_byCourses < allIndividualAchievements.length; ++query_byCourses) {
         row.createCell(3 + query_byCourses).setCellValue(allIndividualAchievements[query_byCourses][1]);
         row.getCell(3 + query_byCourses).setCellStyle(styleForNames);
      }

      for(query_byCourses = 0; query_byCourses < allIndividualAchievements.length; ++query_byCourses) {
         row.createCell(3 + allIndividualAchievements.length + query_byCourses).setCellValue(allIndividualAchievements[query_byCourses][1]);
         row.getCell(3 + allIndividualAchievements.length + query_byCourses).setCellStyle(styleForNames);
      }

      ++var18;
      String var20 = "select\tCourse.name, EducationForm.name, CompetitiveGroup.name, ";

      int path;
      for(path = 0; path < allIndividualAchievements.length; ++path) {
         var20 = var20 + "(select count(*) from AbiturientCompetitiveGroup where course = Course.id and educationForm = EducationForm.id and competitiveGroup = CompetitiveGroup.id and exists(select * from AbiturientIndividualAchievement where (AbiturientIndividualAchievement.aid_abiturient = AbiturientCompetitiveGroup.aid_abiturient and AbiturientIndividualAchievement.id_individual_achievement = " + allIndividualAchievements[path][0] + "))), ";
      }

      for(path = 0; path < allIndividualAchievements.length; ++path) {
         var20 = var20 + "(select count(*) from AbiturientCompetitiveGroup where course = Course.id and educationForm = EducationForm.id and competitiveGroup = CompetitiveGroup.id and isNULL(markEnrollment, 0) > 0 and exists(select * from AbiturientIndividualAchievement where (AbiturientIndividualAchievement.aid_abiturient = AbiturientCompetitiveGroup.aid_abiturient and AbiturientIndividualAchievement.id_individual_achievement = " + allIndividualAchievements[path][0] + ")))";
         var20 = var20 + (path == allIndividualAchievements.length - 1?" ":", ");
      }

      var20 = var20 + "from Course, EducationForm, CompetitiveGroup where exists (select * from AbiturientCompetitiveGroup where course = Course.id and educationForm = EducationForm.id) order by Course.id, EducationForm.id, CompetitiveGroup.id";
      cstmt = con.prepareCall(var20, 1004, 1007);
      rset = cstmt.executeQuery();

      while(rset.next()) {
         row = var21.createRow(var18++);
         row.createCell(0).setCellValue(rset.getString(1));
         row.createCell(1).setCellValue(rset.getString(2));
         row.createCell(2).setCellValue(rset.getString(3));

         for(path = 0; path < allIndividualAchievements.length; ++path) {
            row.createCell(3 + path).setCellValue((double)rset.getInt(4 + path));
         }

         for(path = 0; path < allIndividualAchievements.length; ++path) {
            row.createCell(3 + allIndividualAchievements.length + path).setCellValue((double)rset.getInt(4 + allIndividualAchievements.length + path));
         }

         row.getCell(0).setCellStyle(styleForCells);
         row.getCell(1).setCellStyle(styleForCells);
         row.getCell(2).setCellStyle(styleForCells);

         for(path = 0; path < allIndividualAchievements.length; ++path) {
            row.getCell(3 + path).setCellStyle(styleForCellsWithCenterAlg);
         }

         for(path = 0; path < allIndividualAchievements.length; ++path) {
            row.getCell(3 + allIndividualAchievements.length + path).setCellStyle(styleForCellsWithCenterAlg);
         }
      }

      rset.close();
      String var22 = currentPath + "\\files\\Статистика_по_ИД_" + moduleType + "_" + (new SimpleDateFormat("dd.MM.yyyy")).format(new Date()) + ".xls";
      File file = new File(var22);
      if(file.exists()) {
         file.delete();
      }

      file.createNewFile();
      workbook.write(new FileOutputStream(file));
      Desktop.getDesktop().open(file);
   }

   public static void writeStatisticsForCountries() throws Exception {
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      Connection con = ModelDBConnection.getConnection();
      ResultSet rset = null;
      CallableStatement cstmt = null;
      String[][] allCountries = ModelDBConnection.getAllFromTableOrderedById("Nationality");
      XSSFWorkbook workbook = new XSSFWorkbook();
      byte rowNum = 0;
      XSSFFont fontForNames = workbook.createFont();
      fontForNames.setBold(true);
      XSSFCellStyle styleForNames = workbook.createCellStyle();
      styleForNames.setFont(fontForNames);
      styleForNames.setBorderBottom((short)1);
      styleForNames.setBorderLeft((short)1);
      styleForNames.setBorderRight((short)1);
      styleForNames.setBorderTop((short)1);
      styleForNames.setAlignment((short)2);
      styleForNames.setVerticalAlignment((short)1);
      styleForNames.setWrapText(true);
      XSSFCellStyle styleForCells = workbook.createCellStyle();
      styleForCells.setBorderBottom((short)1);
      styleForCells.setBorderLeft((short)1);
      styleForCells.setBorderRight((short)1);
      styleForCells.setBorderTop((short)1);
      styleForCells.setVerticalAlignment((short)1);
      XSSFCellStyle styleForCellsWithCenterAlg = workbook.createCellStyle();
      styleForCellsWithCenterAlg.setBorderBottom((short)1);
      styleForCellsWithCenterAlg.setBorderLeft((short)1);
      styleForCellsWithCenterAlg.setBorderRight((short)1);
      styleForCellsWithCenterAlg.setBorderTop((short)1);
      styleForCellsWithCenterAlg.setAlignment((short)2);
      styleForCellsWithCenterAlg.setVerticalAlignment((short)1);
      styleForCellsWithCenterAlg.setWrapText(true);
      XSSFSheet sheetSpecialityStatistics = workbook.createSheet("Статистика по специальностям");
      sheetSpecialityStatistics.addMergedRegion(new CellRangeAddress(0, 1, 0, 0));
      sheetSpecialityStatistics.addMergedRegion(new CellRangeAddress(0, 1, 1, 1));
      sheetSpecialityStatistics.addMergedRegion(new CellRangeAddress(0, 1, 2, 2));
      sheetSpecialityStatistics.addMergedRegion(new CellRangeAddress(0, 0, 3, 3 + allCountries.length - 1));
      sheetSpecialityStatistics.addMergedRegion(new CellRangeAddress(0, 0, 3 + allCountries.length, 3 + allCountries.length + allCountries.length - 1));
      XSSFRow row = sheetSpecialityStatistics.createRow(rowNum);
      row.createCell(0).setCellValue("Специальноcть");
      row.createCell(1).setCellValue("Форма обучения");
      row.createCell(2).setCellValue("Конкурсная группа");
      row.createCell(3).setCellValue("Подано заявлений по категориям");
      row.createCell(3 + allCountries.length).setCellValue("Зачислено по категориям");
      row.getCell(0).setCellStyle(styleForNames);
      row.getCell(1).setCellStyle(styleForNames);
      row.getCell(2).setCellStyle(styleForNames);
      row.getCell(3).setCellStyle(styleForNames);
      row.getCell(3 + allCountries.length).setCellStyle(styleForNames);
      int var18 = rowNum + 1;
      row = sheetSpecialityStatistics.createRow(var18);

      int query_bySpecialities;
      for(query_bySpecialities = 0; query_bySpecialities < allCountries.length; ++query_bySpecialities) {
         row.createCell(3 + query_bySpecialities).setCellValue(allCountries[query_bySpecialities][1]);
         row.getCell(3 + query_bySpecialities).setCellStyle(styleForNames);
      }

      for(query_bySpecialities = 0; query_bySpecialities < allCountries.length; ++query_bySpecialities) {
         row.createCell(3 + allCountries.length + query_bySpecialities).setCellValue(allCountries[query_bySpecialities][1]);
         row.getCell(3 + allCountries.length + query_bySpecialities).setCellStyle(styleForNames);
      }

      ++var18;
      String var19 = "select\tSpeciality.name, EducationForm.name, CompetitiveGroup.name, ";

      int sheetCourseStatistics;
      for(sheetCourseStatistics = 0; sheetCourseStatistics < allCountries.length; ++sheetCourseStatistics) {
         var19 = var19 + "(select count(*) from AbiturientCompetitiveGroup where speciality = Speciality.id and educationForm = EducationForm.id and competitiveGroup = CompetitiveGroup.id and exists(select * from Abiturient where (Abiturient.aid = AbiturientCompetitiveGroup.aid_abiturient and Abiturient.id_nationality = " + allCountries[sheetCourseStatistics][0] + "))), ";
      }

      for(sheetCourseStatistics = 0; sheetCourseStatistics < allCountries.length; ++sheetCourseStatistics) {
         var19 = var19 + "(select count(*) from AbiturientCompetitiveGroup where speciality = Speciality.id and educationForm = EducationForm.id and competitiveGroup = CompetitiveGroup.id and isNULL(markEnrollment, 0) > 0 and exists(select * from Abiturient where (Abiturient.aid = AbiturientCompetitiveGroup.aid_abiturient and Abiturient.id_nationality = " + allCountries[sheetCourseStatistics][0] + ")))";
         var19 = var19 + (sheetCourseStatistics == allCountries.length - 1?" ":", ");
      }

      var19 = var19 + "from Speciality, EducationForm, CompetitiveGroup where exists (select * from AbiturientCompetitiveGroup where speciality = Speciality.id and educationForm = EducationForm.id) order by Speciality.id, EducationForm.id, CompetitiveGroup.id";
      cstmt = con.prepareCall(var19, 1004, 1007);
      rset = cstmt.executeQuery();

      while(rset.next()) {
         row = sheetSpecialityStatistics.createRow(var18++);
         row.createCell(0).setCellValue(rset.getString(1));
         row.createCell(1).setCellValue(rset.getString(2));
         row.createCell(2).setCellValue(rset.getString(3));

         for(sheetCourseStatistics = 0; sheetCourseStatistics < allCountries.length; ++sheetCourseStatistics) {
            row.createCell(3 + sheetCourseStatistics).setCellValue((double)rset.getInt(4 + sheetCourseStatistics));
         }

         for(sheetCourseStatistics = 0; sheetCourseStatistics < allCountries.length; ++sheetCourseStatistics) {
            row.createCell(3 + allCountries.length + sheetCourseStatistics).setCellValue((double)rset.getInt(4 + allCountries.length + sheetCourseStatistics));
         }

         row.getCell(0).setCellStyle(styleForCells);
         row.getCell(1).setCellStyle(styleForCells);
         row.getCell(2).setCellStyle(styleForCells);

         for(sheetCourseStatistics = 0; sheetCourseStatistics < allCountries.length; ++sheetCourseStatistics) {
            row.getCell(3 + sheetCourseStatistics).setCellStyle(styleForCellsWithCenterAlg);
         }

         for(sheetCourseStatistics = 0; sheetCourseStatistics < allCountries.length; ++sheetCourseStatistics) {
            row.getCell(3 + allCountries.length + sheetCourseStatistics).setCellStyle(styleForCellsWithCenterAlg);
         }
      }

      rset.close();
      rowNum = 0;
      XSSFSheet var21 = workbook.createSheet("Статистика по направлениям");
      var21.addMergedRegion(new CellRangeAddress(0, 1, 0, 0));
      var21.addMergedRegion(new CellRangeAddress(0, 1, 1, 1));
      var21.addMergedRegion(new CellRangeAddress(0, 1, 2, 2));
      var21.addMergedRegion(new CellRangeAddress(0, 0, 3, 3 + allCountries.length - 1));
      var21.addMergedRegion(new CellRangeAddress(0, 0, 3 + allCountries.length, 3 + allCountries.length + allCountries.length - 1));
      row = var21.createRow(rowNum);
      row.createCell(0).setCellValue("Направление");
      row.createCell(1).setCellValue("Форма обучения");
      row.createCell(2).setCellValue("Конкурсная группа");
      row.createCell(3).setCellValue("Подано заявлений по категориям");
      row.createCell(3 + allCountries.length).setCellValue("Зачислено по категориям");
      row.getCell(0).setCellStyle(styleForNames);
      row.getCell(1).setCellStyle(styleForNames);
      row.getCell(2).setCellStyle(styleForNames);
      row.getCell(3).setCellStyle(styleForNames);
      row.getCell(3 + allCountries.length).setCellStyle(styleForNames);
      var18 = rowNum + 1;
      row = var21.createRow(var18);

      int query_byCourses;
      for(query_byCourses = 0; query_byCourses < allCountries.length; ++query_byCourses) {
         row.createCell(3 + query_byCourses).setCellValue(allCountries[query_byCourses][1]);
         row.getCell(3 + query_byCourses).setCellStyle(styleForNames);
      }

      for(query_byCourses = 0; query_byCourses < allCountries.length; ++query_byCourses) {
         row.createCell(3 + allCountries.length + query_byCourses).setCellValue(allCountries[query_byCourses][1]);
         row.getCell(3 + allCountries.length + query_byCourses).setCellStyle(styleForNames);
      }

      ++var18;
      String var20 = "select\tCourse.name, EducationForm.name, CompetitiveGroup.name, ";

      int path;
      for(path = 0; path < allCountries.length; ++path) {
         var20 = var20 + "(select count(*) from AbiturientCompetitiveGroup where course = Course.id and educationForm = EducationForm.id and competitiveGroup = CompetitiveGroup.id and exists(select * from Abiturient where (Abiturient.aid = AbiturientCompetitiveGroup.aid_abiturient and Abiturient.id_nationality = " + allCountries[path][0] + "))), ";
      }

      for(path = 0; path < allCountries.length; ++path) {
         var20 = var20 + "(select count(*) from AbiturientCompetitiveGroup where course = Course.id and educationForm = EducationForm.id and competitiveGroup = CompetitiveGroup.id and isNULL(markEnrollment, 0) > 0 and exists(select * from Abiturient where (Abiturient.aid = AbiturientCompetitiveGroup.aid_abiturient and Abiturient.id_nationality = " + allCountries[path][0] + ")))";
         var20 = var20 + (path == allCountries.length - 1?" ":", ");
      }

      var20 = var20 + "from Course, EducationForm, CompetitiveGroup where exists (select * from AbiturientCompetitiveGroup where course = Course.id and educationForm = EducationForm.id) order by Course.id, EducationForm.id, CompetitiveGroup.id";
      cstmt = con.prepareCall(var20, 1004, 1007);
      rset = cstmt.executeQuery();

      while(rset.next()) {
         row = var21.createRow(var18++);
         row.createCell(0).setCellValue(rset.getString(1));
         row.createCell(1).setCellValue(rset.getString(2));
         row.createCell(2).setCellValue(rset.getString(3));

         for(path = 0; path < allCountries.length; ++path) {
            row.createCell(3 + path).setCellValue((double)rset.getInt(4 + path));
         }

         for(path = 0; path < allCountries.length; ++path) {
            row.createCell(3 + allCountries.length + path).setCellValue((double)rset.getInt(4 + allCountries.length + path));
         }

         row.getCell(0).setCellStyle(styleForCells);
         row.getCell(1).setCellStyle(styleForCells);
         row.getCell(2).setCellStyle(styleForCells);

         for(path = 0; path < allCountries.length; ++path) {
            row.getCell(3 + path).setCellStyle(styleForCellsWithCenterAlg);
         }

         for(path = 0; path < allCountries.length; ++path) {
            row.getCell(3 + allCountries.length + path).setCellStyle(styleForCellsWithCenterAlg);
         }
      }

      rset.close();
      String var22 = currentPath + "\\files\\Статистика_по_странам_" + moduleType + "_" + (new SimpleDateFormat("dd.MM.yyyy")).format(new Date()) + ".xls";
      File file = new File(var22);
      if(file.exists()) {
         file.delete();
      }

      file.createNewFile();
      workbook.write(new FileOutputStream(file));
      Desktop.getDesktop().open(file);
   }

   public static void writeStatisticsForEducationShort() throws Exception {
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      Connection con = ModelDBConnection.getConnection();
      ResultSet rset = null;
      CallableStatement cstmt = null;
      XSSFWorkbook workbook = new XSSFWorkbook();
      byte rowNum = 0;
      XSSFFont fontForNames = workbook.createFont();
      fontForNames.setBold(true);
      XSSFCellStyle styleForNames = workbook.createCellStyle();
      styleForNames.setFont(fontForNames);
      styleForNames.setBorderBottom((short)1);
      styleForNames.setBorderLeft((short)1);
      styleForNames.setBorderRight((short)1);
      styleForNames.setBorderTop((short)1);
      styleForNames.setAlignment((short)2);
      styleForNames.setVerticalAlignment((short)1);
      styleForNames.setWrapText(true);
      XSSFCellStyle styleForCells = workbook.createCellStyle();
      styleForCells.setBorderBottom((short)1);
      styleForCells.setBorderLeft((short)1);
      styleForCells.setBorderRight((short)1);
      styleForCells.setBorderTop((short)1);
      styleForCells.setVerticalAlignment((short)1);
      XSSFCellStyle styleForCellsWithCenterAlg = workbook.createCellStyle();
      styleForCellsWithCenterAlg.setBorderBottom((short)1);
      styleForCellsWithCenterAlg.setBorderLeft((short)1);
      styleForCellsWithCenterAlg.setBorderRight((short)1);
      styleForCellsWithCenterAlg.setBorderTop((short)1);
      styleForCellsWithCenterAlg.setAlignment((short)2);
      styleForCellsWithCenterAlg.setVerticalAlignment((short)1);
      styleForCellsWithCenterAlg.setWrapText(true);
      XSSFSheet sheetSpecialityStatistics = workbook.createSheet("Статистика по специальностям");
      sheetSpecialityStatistics.addMergedRegion(new CellRangeAddress(0, 1, 0, 0));
      sheetSpecialityStatistics.addMergedRegion(new CellRangeAddress(0, 1, 1, 1));
      sheetSpecialityStatistics.addMergedRegion(new CellRangeAddress(0, 1, 2, 2));
      sheetSpecialityStatistics.addMergedRegion(new CellRangeAddress(0, 0, 3, 4));
      sheetSpecialityStatistics.addMergedRegion(new CellRangeAddress(0, 0, 5, 6));
      XSSFRow row = sheetSpecialityStatistics.createRow(rowNum);
      row.createCell(0).setCellValue("Специальноcть");
      row.createCell(1).setCellValue("Форма обучения");
      row.createCell(2).setCellValue("Конкурсная группа");
      row.createCell(3).setCellValue("Подано заявлений по категориям");
      row.createCell(5).setCellValue("Зачислено по категориям");
      row.getCell(0).setCellStyle(styleForNames);
      row.getCell(1).setCellStyle(styleForNames);
      row.getCell(2).setCellStyle(styleForNames);
      row.getCell(3).setCellStyle(styleForNames);
      row.getCell(5).setCellStyle(styleForNames);
      int var17 = rowNum + 1;
      row = sheetSpecialityStatistics.createRow(var17);
      row.createCell(3).setCellValue("Закончили ПИМУ/НижГМА");
      row.createCell(4).setCellValue("Закончили др.ВУЗы");
      row.createCell(5).setCellValue("Закончили ПИМУ/НижГМА");
      row.createCell(6).setCellValue("Закончили др.ВУЗы");
      row.getCell(3).setCellStyle(styleForNames);
      row.getCell(4).setCellStyle(styleForNames);
      row.getCell(5).setCellStyle(styleForNames);
      row.getCell(6).setCellStyle(styleForNames);
      ++var17;
      String query_bySpecialities = "select  Speciality.name,  EducationForm.name,  CompetitiveGroup.name,  (select count (AbiturientCompetitiveGroup.aid_abiturient) from AbiturientCompetitiveGroup, AbiturientHigherEducation where (speciality = Speciality.id and educationForm = EducationForm.id and competitiveGroup = CompetitiveGroup.id and AbiturientCompetitiveGroup.aid_abiturient = AbiturientHigherEducation.aid_abiturient and AbiturientHigherEducation.instituteName like \'%Нижегородск%\')), (select count (AbiturientCompetitiveGroup.aid_abiturient) from AbiturientCompetitiveGroup, AbiturientHigherEducation where (speciality = Speciality.id and educationForm = EducationForm.id and competitiveGroup = CompetitiveGroup.id and AbiturientCompetitiveGroup.aid_abiturient = AbiturientHigherEducation.aid_abiturient and AbiturientHigherEducation.instituteName not like \'%Нижегородск%\')), (select count (AbiturientCompetitiveGroup.aid_abiturient) from AbiturientCompetitiveGroup, AbiturientHigherEducation where (speciality = Speciality.id and educationForm = EducationForm.id and competitiveGroup = CompetitiveGroup.id and AbiturientCompetitiveGroup.aid_abiturient = AbiturientHigherEducation.aid_abiturient and AbiturientHigherEducation.instituteName like \'%Нижегородск%\' and isNULL(markEnrollment, 0) > 0)), (select count (AbiturientCompetitiveGroup.aid_abiturient) from AbiturientCompetitiveGroup, AbiturientHigherEducation where (speciality = Speciality.id and educationForm = EducationForm.id and competitiveGroup = CompetitiveGroup.id and AbiturientCompetitiveGroup.aid_abiturient = AbiturientHigherEducation.aid_abiturient and AbiturientHigherEducation.instituteName not like \'%Нижегородск%\' and isNULL(markEnrollment, 0) > 0)) from  Speciality, EducationForm, CompetitiveGroup order by Speciality.id, EducationForm.id, CompetitiveGroup.id";
      cstmt = con.prepareCall(query_bySpecialities, 1004, 1007);
      rset = cstmt.executeQuery();

      while(rset.next()) {
         row = sheetSpecialityStatistics.createRow(var17++);
         row.createCell(0).setCellValue(rset.getString(1));
         row.createCell(1).setCellValue(rset.getString(2));
         row.createCell(2).setCellValue(rset.getString(3));
         row.createCell(3).setCellValue((double)rset.getInt(4));
         row.createCell(4).setCellValue((double)rset.getInt(5));
         row.createCell(5).setCellValue((double)rset.getInt(6));
         row.createCell(6).setCellValue((double)rset.getInt(7));
         row.getCell(0).setCellStyle(styleForCells);
         row.getCell(1).setCellStyle(styleForCells);
         row.getCell(2).setCellStyle(styleForCells);
         row.getCell(3).setCellStyle(styleForCells);
         row.getCell(4).setCellStyle(styleForCells);
         row.getCell(5).setCellStyle(styleForCells);
         row.getCell(6).setCellStyle(styleForCells);
      }

      rset.close();
      rowNum = 0;
      XSSFSheet sheetCourseStatistics = workbook.createSheet("Статистика по направлениям");
      sheetCourseStatistics.addMergedRegion(new CellRangeAddress(0, 1, 0, 0));
      sheetCourseStatistics.addMergedRegion(new CellRangeAddress(0, 1, 1, 1));
      sheetCourseStatistics.addMergedRegion(new CellRangeAddress(0, 1, 2, 2));
      sheetCourseStatistics.addMergedRegion(new CellRangeAddress(0, 0, 3, 4));
      sheetCourseStatistics.addMergedRegion(new CellRangeAddress(0, 0, 5, 6));
      row = sheetCourseStatistics.createRow(rowNum);
      row.createCell(0).setCellValue("Направление");
      row.createCell(1).setCellValue("Форма обучения");
      row.createCell(2).setCellValue("Конкурсная группа");
      row.createCell(3).setCellValue("Подано заявлений по категориям");
      row.createCell(5).setCellValue("Зачислено по категориям");
      row.getCell(0).setCellStyle(styleForNames);
      row.getCell(1).setCellStyle(styleForNames);
      row.getCell(2).setCellStyle(styleForNames);
      row.getCell(3).setCellStyle(styleForNames);
      row.getCell(5).setCellStyle(styleForNames);
      var17 = rowNum + 1;
      row = sheetSpecialityStatistics.createRow(var17);
      row.createCell(3).setCellValue("Закончили ПИМУ/НижГМА");
      row.createCell(4).setCellValue("Закончили др.ВУЗы");
      row.createCell(5).setCellValue("Закончили ПИМУ/НижГМА");
      row.createCell(6).setCellValue("Закончили др.ВУЗы");
      row.getCell(3).setCellStyle(styleForNames);
      row.getCell(4).setCellStyle(styleForNames);
      row.getCell(5).setCellStyle(styleForNames);
      row.getCell(6).setCellStyle(styleForNames);
      ++var17;
      String query_byCourses = "select  Course.name,  EducationForm.name,  CompetitiveGroup.name,  (select count (AbiturientCompetitiveGroup.aid_abiturient) from AbiturientCompetitiveGroup, AbiturientHigherEducation where (course = Course.id and educationForm = EducationForm.id and competitiveGroup = CompetitiveGroup.id and AbiturientCompetitiveGroup.aid_abiturient = AbiturientHigherEducation.aid_abiturient and AbiturientHigherEducation.instituteName like \'%Нижегородск%\')), (select count (AbiturientCompetitiveGroup.aid_abiturient) from AbiturientCompetitiveGroup, AbiturientHigherEducation where (course = Course.id and educationForm = EducationForm.id and competitiveGroup = CompetitiveGroup.id and AbiturientCompetitiveGroup.aid_abiturient = AbiturientHigherEducation.aid_abiturient and AbiturientHigherEducation.instituteName not like \'%Нижегородск%\')), (select count (AbiturientCompetitiveGroup.aid_abiturient) from AbiturientCompetitiveGroup, AbiturientHigherEducation where (course = Course.id and educationForm = EducationForm.id and competitiveGroup = CompetitiveGroup.id and AbiturientCompetitiveGroup.aid_abiturient = AbiturientHigherEducation.aid_abiturient and AbiturientHigherEducation.instituteName like \'%Нижегородск%\' and isNULL(markEnrollment, 0) > 0)), (select count (AbiturientCompetitiveGroup.aid_abiturient) from AbiturientCompetitiveGroup, AbiturientHigherEducation where (course = Course.id and educationForm = EducationForm.id and competitiveGroup = CompetitiveGroup.id and AbiturientCompetitiveGroup.aid_abiturient = AbiturientHigherEducation.aid_abiturient and AbiturientHigherEducation.instituteName not like \'%Нижегородск%\' and isNULL(markEnrollment, 0) > 0)) from  Course, EducationForm, CompetitiveGroup order by Course.id, EducationForm.id, CompetitiveGroup.id";
      cstmt = con.prepareCall(query_byCourses, 1004, 1007);
      rset = cstmt.executeQuery();

      while(rset.next()) {
         row = sheetSpecialityStatistics.createRow(var17++);
         row.createCell(0).setCellValue(rset.getString(1));
         row.createCell(1).setCellValue(rset.getString(2));
         row.createCell(2).setCellValue(rset.getString(3));
         row.createCell(3).setCellValue((double)rset.getInt(4));
         row.createCell(4).setCellValue((double)rset.getInt(5));
         row.createCell(5).setCellValue((double)rset.getInt(6));
         row.createCell(6).setCellValue((double)rset.getInt(7));
         row.getCell(0).setCellStyle(styleForCells);
         row.getCell(1).setCellStyle(styleForCells);
         row.getCell(2).setCellStyle(styleForCells);
         row.getCell(3).setCellStyle(styleForCells);
         row.getCell(4).setCellStyle(styleForCells);
         row.getCell(5).setCellStyle(styleForCells);
         row.getCell(6).setCellStyle(styleForCells);
      }

      rset.close();
      String path = currentPath + "\\files\\Статистика_по_окончаниюВУЗа_" + moduleType + "_" + (new SimpleDateFormat("dd.MM.yyyy")).format(new Date()) + ".xls";
      File file = new File(path);
      if(file.exists()) {
         file.delete();
      }

      file.createNewFile();
      workbook.write(new FileOutputStream(file));
      Desktop.getDesktop().open(file);
   }

   public static void writeAdmissionProgressAspirant() throws Exception {
      Connection con = ModelDBConnection.getConnection();
      ResultSet rset = null;
      CallableStatement cstmt = null;
      XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(currentPath + "\\Dots\\Ход_подачи_аспирантура.xltx"));
      XSSFSheet sheet = workbook.getSheetAt(0);
      byte rowNum = 1;
      XSSFRow row = sheet.getRow(rowNum);
      row.getCell(0).setCellValue("на " + (new SimpleDateFormat("dd.MM.yyyy")).format(new Date()));
      String[][] courses = ModelDBConnection.getAllFromTableOrderedById("Course");
      int var14 = 4;

      for(int evaluator = 0; evaluator < courses.length; ++evaluator) {
         String query = "select count(*) from AbiturientCompetitiveGroup, EducationForm, CompetitiveGroup where AbiturientCompetitiveGroup.educationForm = EducationForm.id and AbiturientCompetitiveGroup.competitiveGroup = CompetitiveGroup.id and course = \'" + courses[evaluator][0] + "\' and EducationForm.name like \'очная\' and CompetitiveGroup.name like \'%КЦП%\'";
         cstmt = con.prepareCall(query, 1004, 1007);
         rset = cstmt.executeQuery();
         rset.next();
         int path = rset.getInt(1);
         rset.close();
         row = sheet.getRow(var14);
         row.getCell(4).setCellValue((double)path);
         var14 += 2;
         query = "select count(*) from AbiturientCompetitiveGroup, EducationForm, CompetitiveGroup where AbiturientCompetitiveGroup.educationForm = EducationForm.id and AbiturientCompetitiveGroup.competitiveGroup = CompetitiveGroup.id and course = \'" + courses[evaluator][0] + "\' and EducationForm.name like \'очная\' and CompetitiveGroup.name like \'%договор%\'";
         cstmt = con.prepareCall(query, 1004, 1007);
         rset = cstmt.executeQuery();
         rset.next();
         path = rset.getInt(1);
         rset.close();
         row = sheet.getRow(var14);
         row.getCell(4).setCellValue((double)path);
         ++var14;
         query = "select count(*) from AbiturientCompetitiveGroup, EducationForm, CompetitiveGroup where AbiturientCompetitiveGroup.educationForm = EducationForm.id and AbiturientCompetitiveGroup.competitiveGroup = CompetitiveGroup.id and course = \'" + courses[evaluator][0] + "\' and EducationForm.name like \'заочная\' and CompetitiveGroup.name like \'%договор%\'";
         cstmt = con.prepareCall(query, 1004, 1007);
         rset = cstmt.executeQuery();
         rset.next();
         path = rset.getInt(1);
         rset.close();
         row = sheet.getRow(var14);
         row.getCell(4).setCellValue((double)path);
         var14 += 2;
      }

      XSSFFormulaEvaluator var15 = workbook.getCreationHelper().createFormulaEvaluator();
      Iterator file = sheet.iterator();

      while(file.hasNext()) {
         Row var16 = (Row)file.next();
         Iterator var13 = var16.iterator();

         while(var13.hasNext()) {
            Cell c = (Cell)var13.next();
            if(c.getCellType() == 2) {
               var15.evaluateFormulaCell(c);
            }
         }
      }

      String var17 = currentPath + "\\files\\Ход_подачи_аспирантура_" + (new SimpleDateFormat("dd.MM.yyyy")).format(new Date()) + ".xls";
      File var18 = new File(var17);
      if(var18.exists()) {
         var18.delete();
      }

      var18.createNewFile();
      workbook.write(new FileOutputStream(var18));
      Desktop.getDesktop().open(var18);
   }

   public static void writeAdmissionProgressOrdinator() throws Exception {
      Connection con = ModelDBConnection.getConnection();
      ResultSet rset = null;
      CallableStatement cstmt = null;
      XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(currentPath + "\\Dots\\Ход_подачи_ординатура.xltx"));
      XSSFSheet sheet = workbook.getSheetAt(0);
      byte rowNum = 1;
      XSSFRow row = sheet.getRow(rowNum);
      row.getCell(0).setCellValue("на " + (new SimpleDateFormat("dd.MM.yyyy")).format(new Date()));
      String[][] specialities = ModelDBConnection.getAllFromTableOrderedById("Speciality");
      int var14 = 6;

      for(int evaluator = 0; evaluator < specialities.length; ++evaluator) {
         String query = "select count(*) from AbiturientCompetitiveGroup, EducationForm, CompetitiveGroup where AbiturientCompetitiveGroup.educationForm = EducationForm.id and AbiturientCompetitiveGroup.competitiveGroup = CompetitiveGroup.id and speciality = \'" + specialities[evaluator][0] + "\' and EducationForm.name like \'очная\' and targetOrganisation is not null";
         cstmt = con.prepareCall(query, 1004, 1007);
         rset = cstmt.executeQuery();
         rset.next();
         int path = rset.getInt(1);
         rset.close();
         row = sheet.getRow(var14);
         row.getCell(6).setCellValue((double)path);
         query = "select count(*) from AbiturientCompetitiveGroup, EducationForm, CompetitiveGroup where AbiturientCompetitiveGroup.educationForm = EducationForm.id and AbiturientCompetitiveGroup.competitiveGroup = CompetitiveGroup.id and speciality = \'" + specialities[evaluator][0] + "\' and EducationForm.name like \'очная\' and CompetitiveGroup.name like \'%КЦП%\'";
         cstmt = con.prepareCall(query, 1004, 1007);
         rset = cstmt.executeQuery();
         rset.next();
         path = rset.getInt(1);
         rset.close();
         row = sheet.getRow(var14);
         row.getCell(7).setCellValue((double)path);
         query = "select count(*) from AbiturientCompetitiveGroup, EducationForm, CompetitiveGroup where AbiturientCompetitiveGroup.educationForm = EducationForm.id and AbiturientCompetitiveGroup.competitiveGroup = CompetitiveGroup.id and speciality = \'" + specialities[evaluator][0] + "\' and EducationForm.name like \'очная\' and CompetitiveGroup.name like \'%договор%\'";
         cstmt = con.prepareCall(query, 1004, 1007);
         rset = cstmt.executeQuery();
         rset.next();
         path = rset.getInt(1);
         rset.close();
         row = sheet.getRow(var14);
         row.getCell(8).setCellValue((double)path);
         ++var14;
      }

      XSSFFormulaEvaluator var15 = workbook.getCreationHelper().createFormulaEvaluator();
      Iterator file = sheet.iterator();

      while(file.hasNext()) {
         Row var16 = (Row)file.next();
         Iterator var13 = var16.iterator();

         while(var13.hasNext()) {
            Cell c = (Cell)var13.next();
            if(c.getCellType() == 2) {
               var15.evaluateFormulaCell(c);
            }
         }
      }

      String var17 = currentPath + "\\files\\Ход_подачи_ординатура_" + (new SimpleDateFormat("dd.MM.yyyy")).format(new Date()) + ".xls";
      File var18 = new File(var17);
      if(var18.exists()) {
         var18.delete();
      }

      var18.createNewFile();
      workbook.write(new FileOutputStream(var18));
      Desktop.getDesktop().open(var18);
   }

   public static void writeListForAccreditationTestResultsCheck(boolean needAll) throws Exception {
      String curDate = (new SimpleDateFormat("yyyy-MM-dd")).format(new Date());
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      XSSFWorkbook workbook = new XSSFWorkbook();
      XSSFSheet sheet = workbook.createSheet();
      Connection con = ModelDBConnection.getConnection();
      ResultSet rset = null;
      CallableStatement cstmt = null;
      XSSFFont fontForNames = workbook.createFont();
      fontForNames.setBold(true);
      XSSFCellStyle styleForNames = workbook.createCellStyle();
      styleForNames.setFont(fontForNames);
      styleForNames.setBorderBottom((short)1);
      styleForNames.setBorderLeft((short)1);
      styleForNames.setBorderRight((short)1);
      styleForNames.setBorderTop((short)1);
      styleForNames.setAlignment((short)2);
      styleForNames.setVerticalAlignment((short)1);
      styleForNames.setWrapText(true);
      XSSFCellStyle styleForCells = workbook.createCellStyle();
      styleForCells.setBorderBottom((short)1);
      styleForCells.setBorderLeft((short)1);
      styleForCells.setBorderRight((short)1);
      styleForCells.setBorderTop((short)1);
      styleForCells.setVerticalAlignment((short)1);
      styleForCells.setWrapText(true);
      XSSFCellStyle styleForCellsWithCenterAlg = workbook.createCellStyle();
      styleForCellsWithCenterAlg.setBorderBottom((short)1);
      styleForCellsWithCenterAlg.setBorderLeft((short)1);
      styleForCellsWithCenterAlg.setBorderRight((short)1);
      styleForCellsWithCenterAlg.setBorderTop((short)1);
      styleForCellsWithCenterAlg.setAlignment((short)2);
      styleForCellsWithCenterAlg.setVerticalAlignment((short)1);
      styleForCellsWithCenterAlg.setWrapText(true);
      byte rowNum = 0;
      int var17 = rowNum + 1;
      XSSFRow row = sheet.createRow(rowNum);
      String query;
      SimpleDateFormat path;
      Date file;
      if(needAll) {
         row.createCell(0).setCellValue("№п/п");
         row.createCell(1).setCellValue("Фамилия");
         row.createCell(2).setCellValue("Имя");
         row.createCell(3).setCellValue("Отчество");
         row.createCell(4).setCellValue("СНИЛС");
         row.createCell(5).setCellValue("Дата рождения");
         row.createCell(6).setCellValue("Номер протокола/свидетельства аккредитации");
         row.createCell(7).setCellValue("Дата протокола/свидетельства аккредитации");
         row.createCell(8).setCellValue("Гражданство");
         row.createCell(9).setCellValue("Гражданин РФ?");
         row.createCell(10).setCellValue("Специальность");
         row.getCell(0).setCellStyle(styleForNames);
         row.getCell(1).setCellStyle(styleForNames);
         row.getCell(2).setCellStyle(styleForNames);
         row.getCell(3).setCellStyle(styleForNames);
         row.getCell(4).setCellStyle(styleForNames);
         row.getCell(5).setCellStyle(styleForNames);
         row.getCell(6).setCellStyle(styleForNames);
         row.getCell(7).setCellStyle(styleForNames);
         row.getCell(8).setCellStyle(styleForNames);
         row.getCell(9).setCellStyle(styleForNames);
         row.getCell(10).setCellStyle(styleForNames);
         query = "select\tSName, FName, isNULL(MName, \'\'), SNILS, Birthday, (select certificateNumber from AbiturientAccreditationCertificate where (AbiturientAccreditationCertificate.aid_abiturient = Abiturient.aid)) as accreditationCertificateNumber, (select certificateGivenDate from AbiturientAccreditationCertificate where (AbiturientAccreditationCertificate.aid_abiturient = Abiturient.aid)) as accreditationCertificateDate, Nationality.name, (select diplomaSpeciality from AbiturientHigherEducation where (AbiturientHigherEducation.aid_abiturient = Abiturient.aid)) as diplomaSpeciality from Abiturient join Nationality on (Nationality.id = Abiturient.id_nationality) order by SName, FName, MName";
         cstmt = con.prepareCall(query, 1004, 1007);
         rset = cstmt.executeQuery();

         while(rset.next()) {
            row = sheet.createRow(var17++);
            row.createCell(0).setCellValue((double)(var17 - 1));
            row.createCell(1).setCellValue(rset.getString(1));
            row.createCell(2).setCellValue(rset.getString(2));
            row.createCell(3).setCellValue(rset.getString(3) == null?"":rset.getString(3));
            row.createCell(4).setCellValue(rset.getString(4) == null?"":rset.getString(4));
            if(rset.getString(5) != null) {
               path = new SimpleDateFormat();
               path.applyPattern("yyyy-MM-dd");
               file = path.parse(rset.getString(5));
               path.applyPattern("dd.MM.yyyy");
               row.createCell(5).setCellValue(path.format(file));
            } else {
               row.createCell(5).setCellValue("");
            }

            row.createCell(6).setCellValue(rset.getString(6) == null?"":rset.getString(6));
            row.createCell(7).setCellValue(rset.getString(7) == null?"":rset.getString(7));
            row.createCell(8).setCellValue(rset.getString(8) == null?"":rset.getString(8));
            row.createCell(9).setCellValue(rset.getString(8) == null?"":(rset.getString(8).equals("Российская Федерация")?"Да":"Нет"));
            row.createCell(10).setCellValue(rset.getString(9) == null?"":rset.getString(9));
            row.getCell(0).setCellStyle(styleForCellsWithCenterAlg);
            row.getCell(1).setCellStyle(styleForCells);
            row.getCell(2).setCellStyle(styleForCells);
            row.getCell(3).setCellStyle(styleForCells);
            row.getCell(4).setCellStyle(styleForCellsWithCenterAlg);
            row.getCell(5).setCellStyle(styleForCellsWithCenterAlg);
            row.getCell(6).setCellStyle(styleForCellsWithCenterAlg);
            row.getCell(7).setCellStyle(styleForCellsWithCenterAlg);
            row.getCell(8).setCellStyle(styleForCells);
            row.getCell(9).setCellStyle(styleForCellsWithCenterAlg);
            row.getCell(10).setCellStyle(styleForCellsWithCenterAlg);
         }
      } else {
         row.createCell(0).setCellValue("№п/п");
         row.createCell(1).setCellValue("Фамилия");
         row.createCell(2).setCellValue("Имя");
         row.createCell(3).setCellValue("Отчество");
         row.createCell(4).setCellValue("СНИЛС");
         row.createCell(5).setCellValue("Специальность ВПО");
         row.createCell(6).setCellValue("Гражданство");
         row.createCell(7).setCellValue("Гражданин РФ?");
         row.createCell(8).setCellValue("Планируемая дата теста");
         row.getCell(0).setCellStyle(styleForNames);
         row.getCell(1).setCellStyle(styleForNames);
         row.getCell(2).setCellStyle(styleForNames);
         row.getCell(3).setCellStyle(styleForNames);
         row.getCell(4).setCellStyle(styleForNames);
         row.getCell(5).setCellStyle(styleForNames);
         row.getCell(6).setCellStyle(styleForNames);
         row.getCell(7).setCellStyle(styleForNames);
         row.getCell(8).setCellStyle(styleForNames);
         query = "select\tSName, FName, isNULL(MName, \'\'), SNILS, (select diplomaSpeciality from AbiturientHigherEducation where (AbiturientHigherEducation.aid_abiturient = Abiturient.aid)) as diplomaSpeciality, Nationality.name, (select testDate from AbiturientEntranceTests where (AbiturientEntranceTests.aid_abiturient = Abiturient.aid)) as testDate from Abiturient join Nationality on (Nationality.id = Abiturient.id_nationality) where aid in (select aid_abiturient from AbiturientEntranceTests where (AbiturientEntranceTests.testDate is not null)) order by SName, FName, MName";
         cstmt = con.prepareCall(query, 1004, 1007);
         rset = cstmt.executeQuery();

         while(rset.next()) {
            row = sheet.createRow(var17++);
            row.createCell(0).setCellValue((double)(var17 - 1));
            row.createCell(1).setCellValue(rset.getString(1));
            row.createCell(2).setCellValue(rset.getString(2));
            row.createCell(3).setCellValue(rset.getString(3) == null?"":rset.getString(3));
            row.createCell(4).setCellValue(rset.getString(4) == null?"":rset.getString(4));
            row.createCell(5).setCellValue(rset.getString(5) == null?"":rset.getString(5));
            row.createCell(6).setCellValue(rset.getString(6) == null?"":rset.getString(6));
            row.createCell(7).setCellValue(rset.getString(6) == null?"":(rset.getString(6).equals("Российская Федерация")?"Да":"Нет"));
            if(rset.getString(7) != null) {
               path = new SimpleDateFormat();
               path.applyPattern("yyyy-MM-dd");
               file = path.parse(rset.getString(7));
               path.applyPattern("dd.MM.yyyy");
               row.createCell(8).setCellValue(path.format(file));
            } else {
               row.createCell(8).setCellValue("");
            }

            row.getCell(0).setCellStyle(styleForCellsWithCenterAlg);
            row.getCell(1).setCellStyle(styleForCells);
            row.getCell(2).setCellStyle(styleForCells);
            row.getCell(3).setCellStyle(styleForCells);
            row.getCell(4).setCellStyle(styleForCellsWithCenterAlg);
            row.getCell(5).setCellStyle(styleForCells);
            row.getCell(6).setCellStyle(styleForCellsWithCenterAlg);
            row.getCell(7).setCellStyle(styleForCellsWithCenterAlg);
            row.getCell(8).setCellStyle(styleForCellsWithCenterAlg);
         }
      }

      rset.close();
      String var18 = currentPath + "\\files\\" + "Список_для_аккредитации_" + moduleType + "_" + (needAll?"все_":"") + (new SimpleDateFormat("dd.MM.yyyy")).format(new Date()) + ".xls";
      File var19 = new File(var18);
      if(var19.exists()) {
         var19.delete();
      }

      var19.createNewFile();
      workbook.write(new FileOutputStream(var19));
      Desktop.getDesktop().open(var19);
   }

   public static void writeJournalOfSubmittedDocuments() throws Exception {
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      Connection con = ModelDBConnection.getConnection();
      ResultSet rset = null;
      CallableStatement cstmt = null;
      XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(currentPath + "\\Dots\\Журнал_принятых_документов.xltx"));
      XSSFSheet sheet = workbook.getSheetAt(0);
      int countAbits = 0;
      int rowNum = 2;
      XSSFFont fontForCells = workbook.createFont();
      fontForCells.setFontHeight(8.0D);
      fontForCells.setFontName("Arial");
      XSSFCellStyle styleForCells = workbook.createCellStyle();
      styleForCells.setFont(fontForCells);
      styleForCells.setBorderBottom((short)1);
      styleForCells.setBorderLeft((short)1);
      styleForCells.setBorderRight((short)1);
      styleForCells.setBorderTop((short)1);
      styleForCells.setVerticalAlignment((short)1);
      styleForCells.setWrapText(true);
      XSSFCellStyle styleForComment = workbook.createCellStyle();
      styleForComment.setFont(fontForCells);
      styleForComment.setWrapText(true);
      String query = "select\taid, registrationDate, SName + \' \' + FName + \' \' + isNULL(MName, \'\'), (select \'Диплом \' + cast(isNULL(diplomaSeries, \'\') as varchar(max)) + case when diplomaNumber is null then \'\' else \' №\' + cast(diplomaNumber as varchar(max)) end + \', выдан \' + cast(instituteName as varchar(max)) from AbiturientHigherEducation where aid = aid_abiturient), (select cast(isNULL(indexAddress, \'\') as varchar(max)) + \', \' + cast(Region.name as varchar(max)) + \', \' + cast(factAddress as varchar(max)) from AbiturientAddress join Region on (AbiturientAddress.id_region = Region.id) where aid = aid_abiturient) from Abiturient order by aid";
      cstmt = con.prepareCall(query, 1004, 1007);
      rset = cstmt.executeQuery();

      XSSFRow row;
      while(rset.next()) {
         countAbits = rset.getInt(1);
         row = sheet.createRow(rowNum++);
         row.createCell(0).setCellValue((double)rset.getInt(1));
         row.createCell(1).setCellValue((double)rset.getInt(1));
         SimpleDateFormat path = new SimpleDateFormat();
         path.applyPattern("yyyy-MM-dd");
         Date file = path.parse(rset.getString(2));
         path.applyPattern("dd.MM.yyyy");
         row.createCell(2).setCellValue(path.format(file));
         row.createCell(3).setCellValue(rset.getString(3));
         row.createCell(4).setCellValue(rset.getString(4));
         row.createCell(5).setCellValue(rset.getString(5));
         row.createCell(6).setCellValue("");
         row.createCell(7).setCellValue("");
         row.createCell(8).setCellValue("");
         row.createCell(9).setCellValue("");
         row.getCell(0).setCellStyle(styleForCells);
         row.getCell(1).setCellStyle(styleForCells);
         row.getCell(2).setCellStyle(styleForCells);
         row.getCell(3).setCellStyle(styleForCells);
         row.getCell(4).setCellStyle(styleForCells);
         row.getCell(5).setCellStyle(styleForCells);
         row.getCell(6).setCellStyle(styleForCells);
         row.getCell(7).setCellStyle(styleForCells);
         row.getCell(8).setCellStyle(styleForCells);
         row.getCell(9).setCellStyle(styleForCells);
      }

      rset.close();
      ++rowNum;
      sheet.addMergedRegion(new CellRangeAddress(rowNum, rowNum, 0, 9));
      row = sheet.createRow(rowNum++);
      row.createCell(0).setCellValue("Журнал закрыт \"___\"_____________20___ г. в 17.00.\r\nЗарегистрировано всего " + countAbits + "() заявлений абитуриентов. К конкурсу допущено " + countAbits + "() абитуриентов.\r\n" + "\r\n\r\n" + "Председатель приемной комиссии,\r\n" + "И.о ректора Н.Н. Карякин\r\n" + "\r\n" + "Заместитель Председателя приемной комиссии,\r\n" + "Начальник управления по организации приема в ВУЗ Е.С. Богомолова\r\n" + "\r\n" + "Ответственный секретарь приемной комиссии, доцент М.В. Ашина ");
      row.getCell(0).setCellStyle(styleForComment);
      String var15 = currentPath + "\\files\\" + "Журнал_" + moduleType + ".xls";
      File var16 = new File(var15);
      if(var16.exists()) {
         var16.delete();
      }

      var16.createNewFile();
      workbook.write(new FileOutputStream(var16));
      Desktop.getDesktop().open(var16);
   }

   public static void writeListForSPRUT() throws Exception {
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      Connection con = ModelDBConnection.getConnection();
      ResultSet rset = null;
      CallableStatement cstmt = null;
      XSSFWorkbook workbook = new XSSFWorkbook();
      byte rowNum = 0;
      XSSFSheet sheetSPRUT = workbook.createSheet("СПРУТ");
      XSSFRow row = sheetSPRUT.createRow(rowNum);
      row.createCell(0).setCellValue("№Дела");
      row.createCell(1).setCellValue("Фамилия");
      row.createCell(2).setCellValue("Имя");
      row.createCell(3).setCellValue("Отчество");
      row.createCell(4).setCellValue("ФИО");
      row.createCell(5).setCellValue("Дата рождения");
      row.createCell(6).setCellValue("Место рождения");
      row.createCell(7).setCellValue("Пол");
      row.createCell(8).setCellValue("Гражданство");
      row.createCell(9).setCellValue("Документ удостоверяющий личность");
      row.createCell(10).setCellValue("Серия");
      row.createCell(11).setCellValue("Номер");
      row.createCell(12).setCellValue("Когда и кем выдан");
      row.createCell(13).setCellValue("Адрес-индекс");
      row.createCell(14).setCellValue("Адрес-область");
      row.createCell(15).setCellValue("Адрес");
      row.createCell(16).setCellValue("Телефоны");
      row.createCell(17).setCellValue("Эл.адрес");
      row.createCell(18).setCellValue("Наименование учреждения, которое окончил");
      row.createCell(19).setCellValue("Год окончания");
      row.createCell(20).setCellValue("Данные о документе об окончании (диплом)");
      row.createCell(21).setCellValue("Конкурсный балл");
      row.createCell(22).setCellValue("Наименование направления (при зачислении)");
      row.createCell(23).setCellValue("Наименование специальности (при зачислении)");
      row.createCell(24).setCellValue("Форма обучения (при зачислении)");
      row.createCell(25).setCellValue("Бюджет/договор (при зачислении)");
      int var11 = rowNum + 1;
      String queryForSPRUT = "SELECT\taid, isNULL(SName, \'\'), isNULL(Fname, \'\'), isNULL(MName, \'\'), isNULL(Birthday, \'\'), isNULL(Birthplace, \'\'), (select name from Gender where Gender.id = id_gender), (select name from Nationality where Nationality.id = id_nationality), (select name from PassportType where PassportType.id = id_passportType), isNULL(paspSeries, \'\'), isNULL(paspNumber, \'\'), isNULL(paspGivenBy, \'\'), isNULL(paspGivenDate, \'\'), isNULL(indexAddress, \'\'), isNULL((select name from Region where Region.id = id_region), \'\'), isNULL(factAddress, \'\'), isNULL(phoneNumbers, \'\'), isNULL(email, \'\'), isNULL(instituteName, \'\'), isNULL(graduationYear, \'\'), cast(isNULL(diplomaSeries, \'\') as varchar(max))  + \' \' + cast(isNULL(diplomaNumber, \'\') as varchar(max)), competitiveBall, (select name from Course where Course.id = course), (select name from Speciality where Speciality.id = speciality), (select name from EducationForm where EducationForm.id = educationForm), case when competitiveGroup > 2 then \'Комм.\' else \'Бюджет\' end FROM\t(((Abiturient  left outer join AbiturientPassport on (Abiturient.aid = AbiturientPassport.aid_abiturient)) left outer join AbiturientAddress on (Abiturient.aid = AbiturientAddress.aid_abiturient)) left outer join AbiturientHigherEducation on (Abiturient.aid = AbiturientHigherEducation.aid_abiturient)) join AbiturientCompetitiveGroup on (Abiturient.aid = AbiturientCompetitiveGroup.aid_abiturient and AbiturientCompetitiveGroup.markEnrollment > 0) order by aid";
      cstmt = con.prepareCall(queryForSPRUT, 1004, 1007);
      rset = cstmt.executeQuery();

      while(rset.next()) {
         row = sheetSPRUT.createRow(var11++);
         row.createCell(0).setCellValue((double)rset.getInt(1));
         row.createCell(1).setCellValue(rset.getString(2));
         row.createCell(2).setCellValue(rset.getString(3));
         row.createCell(3).setCellValue(rset.getString(4));
         row.createCell(4).setCellValue(rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4));
         SimpleDateFormat path;
         if(rset.getString(5) != null) {
            path = new SimpleDateFormat();
            path.applyPattern("yyyy-MM-dd");
            Date file = path.parse(rset.getString(5));
            path.applyPattern("dd.MM.yyyy");
            row.createCell(5).setCellValue(path.format(file));
         } else {
            row.createCell(5).setCellValue("");
         }

         row.createCell(6).setCellValue(rset.getString(6));
         row.createCell(7).setCellValue(rset.getString(7));
         row.createCell(8).setCellValue(rset.getString(8));
         row.createCell(9).setCellValue(rset.getString(9));
         row.createCell(10).setCellValue(rset.getString(10));
         row.createCell(11).setCellValue(rset.getString(11));
         if(rset.getString(13) != null) {
            path = new SimpleDateFormat();
            path.applyPattern("yyyy-MM-dd");
            path.parse(rset.getString(13));
            path.applyPattern("dd.MM.yyyy");
            row.createCell(12).setCellValue(rset.getString(12) + " " + rset.getString(13));
         } else {
            row.createCell(12).setCellValue(rset.getString(12));
         }

         row.createCell(13).setCellValue(rset.getString(14));
         row.createCell(14).setCellValue(rset.getString(15));
         row.createCell(15).setCellValue(rset.getString(16));
         row.createCell(16).setCellValue(rset.getString(17));
         row.createCell(17).setCellValue(rset.getString(18));
         row.createCell(18).setCellValue(rset.getString(19));
         row.createCell(19).setCellValue(rset.getString(20));
         row.createCell(20).setCellValue(rset.getString(21));
         row.createCell(21).setCellValue(rset.getString(22));
         row.createCell(22).setCellValue(rset.getString(23));
         row.createCell(23).setCellValue(rset.getString(24));
         row.createCell(24).setCellValue(rset.getString(25));
         row.createCell(25).setCellValue(rset.getString(26));
      }

      rset.close();
      String var12 = currentPath + "\\files\\Выгрузка_СПРУТ_" + moduleType + "_" + (new SimpleDateFormat("dd.MM.yyyy")).format(new Date()) + ".xls";
      File var13 = new File(var12);
      if(var13.exists()) {
         var13.delete();
      }

      var13.createNewFile();
      workbook.write(new FileOutputStream(var13));
      Desktop.getDesktop().open(var13);
   }

   public static void main(String[] args) {
      try {
         ModelDBConnection.setConnectionParameters("MSServer", "localhost", "Ordinator", "igor_sa", "200352");
         ModelDBConnection.initConnection();
         writeStatisticsForIndividualAchievements();
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }
}

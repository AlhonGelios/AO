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
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import padeg.lib.Padeg;

public class OutputCompetition {

   private static String currentPath = (new File("")).getAbsolutePath();


   public static void outputCompetitionResults(boolean forInternalNeeds) throws Exception {
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      Connection con = ModelDBConnection.getConnection();
      ResultSet rset = null;
      CallableStatement cstmt = null;
      XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(currentPath + "\\Dots\\Конкурсный_список_" + moduleType + ".xltx"));
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
      styleForCells.setWrapText(true);
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
      String[][] specialities = moduleType.equals("аспирантура")?ModelDBConnection.getAllFromTable("Course"):ModelDBConnection.getAllFromTable("Speciality");
      String[][] targetOrganisations = ModelDBConnection.getAllFromTable("TargetOrganisation");
      String[][] educationStandarts = moduleType.equals("аспирантура")?ModelDBConnection.getAllFromTable("EducationForm"):ModelDBConnection.getAllFromTable("EducationStandard");
      String[][] competitiveGroups = ModelDBConnection.getAllFromTableOrderedById("CompetitiveGroup");
      String[][] allEntranceTestNames = ModelDBConnection.getAllFromTableOrderedById("EntranceTest");

      for(int path = 0; path < specialities.length; ++path) {
         boolean wasWritten = false;
         boolean flag = false;
         String query = moduleType.equals("аспирантура")?"select * from AbiturientCompetitiveGroup where course = \'" + specialities[path][0] + "\'" + (forInternalNeeds?"":"and AbiturientCompetitiveGroup.markEnrollment > -1 "):"select * from AbiturientCompetitiveGroup where speciality = \'" + specialities[path][0] + "\'" + (forInternalNeeds?"":"and AbiturientCompetitiveGroup.markEnrollment > -1 ");
         cstmt = con.prepareCall(query, 1004, 1007);
         rset = cstmt.executeQuery();
         int file = rset.last()?rset.getRow():0;
         rset.close();
         if(file > 0) {
            XSSFRow row = sheet.createRow(rowNum++);
            row = sheet.createRow(rowNum++);
            row.createCell(1).setCellValue((moduleType.equals("аспирантура")?"Направление: ":"Специальность: ") + specialities[path][1]);
            sheet.addMergedRegion(new CellRangeAddress(rowNum - 1, rowNum - 1, 1, 9));
            row.getCell(1).setCellStyle(styleForSpecialities);

            for(int cg_i = 1; cg_i < competitiveGroups.length; ++cg_i) {
               int countAbitsOnCurSpecOnCurCompGr;
               int es_i;
               int countAbitsOnCurSpecOnCurCompGrAndSt;
               int curCellNum;
               int abitAllIndAchivments;
               int indAchSum;
               int allAchivmentsForCurAbit;
               int abitAllCompetitiveGroups;
               int allCompetitiveGroupsForCurAbit;
               int curCompGroupNum;
               int var42;
               boolean var45;
               byte var46;
               int var48;
               String[][] var49;
               String var54;
               String var55;
               String[][] var56;
               String[][] var57;
               // в рамках КЦП
               if((!competitiveGroups[cg_i][0].equals("3") || !competitiveGroups[cg_i][0].equals("4") || !competitiveGroups[cg_i][0].equals("5")) && (!flag)) {
                  flag = true;
                  query = moduleType.equals("аспирантура")?"select * from AbiturientCompetitiveGroup where course = \'" + specialities[path][0] + "\' and competitiveGroup in (1,2) " + (forInternalNeeds?"":"and AbiturientCompetitiveGroup.markEnrollment > -1 "):"select * from AbiturientCompetitiveGroup where speciality = \'" + specialities[path][0] + "\' and competitiveGroup in (\'" + cg_i + "\') " + (forInternalNeeds?"":"and AbiturientCompetitiveGroup.markEnrollment > -1 ");
                  cstmt = con.prepareCall(query, 1004, 1007);
                  rset = cstmt.executeQuery();
                  countAbitsOnCurSpecOnCurCompGr = rset.last()?rset.getRow():0;
                  rset.close();
                  if(countAbitsOnCurSpecOnCurCompGr > 0) {
                     row = sheet.createRow(rowNum++);
                     row.createCell(1).setCellValue("МЕСТА В РАМКАХ КЦП");
                     sheet.addMergedRegion(new CellRangeAddress(rowNum - 1, rowNum - 1, 1, 9));
                     row.getCell(1).setCellStyle(styleForCategories);

                     for (int to_i = 0; to_i < targetOrganisations.length; ++to_i){
                        query = moduleType.equals("аспирантура")?"select * from AbiturientCompetitiveGroup where course = \'" + specialities[path][0] + "\' and targetOrganisation is not null " + (forInternalNeeds?"":"and AbiturientCompetitiveGroup.markEnrollment > -1 "):"select * from AbiturientCompetitiveGroup where speciality = \'" + specialities[path][0] + "\' and targetOrganisation =  \'" + targetOrganisations[to_i][0] + "\'" + (forInternalNeeds?"":"and AbiturientCompetitiveGroup.markEnrollment > -1 ");
                        cstmt = con.prepareCall(query, 1004, 1007);
                        rset = cstmt.executeQuery();
                        es_i = rset.last()?rset.getRow():0;
                        rset.close();
                        if(es_i > 0) {
                           row = sheet.createRow(rowNum++);
                           row = sheet.createRow(rowNum++);
                           row.createCell(1).setCellValue("места по целевому приему: " + targetOrganisations[to_i][1]);
                           row.getCell(1).setCellStyle(styleForTargetOrgs);
                           if(!moduleType.equals("аспирантура")) {
                              var42 = 1;
                              query = "select aid, SName, Fname, isNULL(MName,\'\'), competitiveBall, case when originalsReceivedDate is not null then \'+\' else \'-\' end, case when returnDate is not null then \'+\' else \'-\' end, (select sum(isNULL(score, 0)) from AbiturientEntranceTests where AbiturientCompetitiveGroup.aid_abiturient = AbiturientEntranceTests.aid_abiturient) as entranceTestsSum, (select isNull(avgBall, 0) from AbiturientHigherEducation where AbiturientCompetitiveGroup.aid_abiturient = AbiturientHigherEducation.aid_abiturient) as avgDiplomaBall, Chair.name, TargetOrganisation.name from (Chair join AbiturientCompetitiveGroup on (AbiturientCompetitiveGroup.chair = Chair.id) join TargetOrganisation on (AbiturientCompetitiveGroup.targetOrganisation = TargetOrganisation.id) join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where speciality = \'" + specialities[path][0] + "\' and targetOrganisation =  \'" + targetOrganisations[to_i][0] + "\' " + (forInternalNeeds?"":"and AbiturientCompetitiveGroup.markEnrollment > -1 ") + "order by competitiveBall desc, entranceTestsSum desc, avgDiplomaBall desc";
                              System.out.println(query);
                              cstmt = con.prepareCall(query, 1004, 1007);
                              rset = cstmt.executeQuery();
                              countAbitsOnCurSpecOnCurCompGrAndSt = rset.last()?rset.getRow():0;
                              rset.beforeFirst();
                              if(countAbitsOnCurSpecOnCurCompGrAndSt > 0) {
                                 //row = sheet.createRow(rowNum++);
                                 row = sheet.createRow(rowNum++);
                                 var45 = false;
                                 if(moduleType.equals("аспирантура")) {
                                    row.createCell(0).setCellValue("№п/п");
                                    row.getCell(0).setCellStyle(styleForNames);
                                    row.createCell(1).setCellValue("№ЛД");
                                    row.getCell(1).setCellStyle(styleForNames);
                                    row.createCell(2).setCellValue("ФИО");
                                    row.getCell(2).setCellStyle(styleForNames);
                                    row.createCell(3).setCellValue("Конкурсный балл");
                                    row.getCell(3).setCellStyle(styleForNames);
                                    var46 = 4;

                                    for(var48 = 0; var48 < allEntranceTestNames.length; ++var48) {
                                       row.createCell(var46 + var48).setCellValue(allEntranceTestNames[var48][1]);
                                       row.getCell(var46 + var48).setCellStyle(styleForNames);
                                    }

                                    curCellNum = var46 + allEntranceTestNames.length;
                                    row.createCell(curCellNum).setCellValue("Балл за ИД");
                                    row.getCell(curCellNum).setCellStyle(styleForNames);
                                    ++curCellNum;
                                    row.createCell(curCellNum).setCellValue("Наличие оригинала/согласия на зачисление");
                                    row.getCell(curCellNum).setCellStyle(styleForNames);
                                    ++curCellNum;
                                    row.createCell(curCellNum).setCellValue("Специальность");
                                    row.getCell(curCellNum).setCellStyle(styleForNames);
                                    ++curCellNum;
                                    row.createCell(curCellNum).setCellValue("Забрал документы");
                                    row.getCell(curCellNum).setCellStyle(styleForNames);
                                    ++curCellNum;
                                    row.createCell(curCellNum).setCellValue("Список ИД");
                                    row.getCell(curCellNum).setCellStyle(styleForNames);
                                    ++curCellNum;
                                 } else {
                                    row.createCell(0).setCellValue("№п/п");
                                    row.getCell(0).setCellStyle(styleForNames);
                                    row.createCell(1).setCellValue("№ЛД");
                                    row.getCell(1).setCellStyle(styleForNames);
                                    row.createCell(2).setCellValue("ФИО");
                                    row.getCell(2).setCellStyle(styleForNames);
                                    row.createCell(3).setCellValue("Конкурсный балл");
                                    row.getCell(3).setCellStyle(styleForNames);
                                    var46 = 4;

                                    for(var48 = 0; var48 < allEntranceTestNames.length; ++var48) {
                                       row.createCell(var46 + var48).setCellValue(allEntranceTestNames[var48][1]);
                                       row.getCell(var46 + var48).setCellStyle(styleForNames);
                                    }

                                    curCellNum = var46 + allEntranceTestNames.length;
                                    row.createCell(curCellNum).setCellValue("Балл за ИД");
                                    row.getCell(curCellNum).setCellStyle(styleForNames);
                                    ++curCellNum;
                                    row.createCell(curCellNum).setCellValue("Средний балл по диплому");
                                    row.getCell(curCellNum).setCellStyle(styleForNames);
                                    ++curCellNum;
                                    row.createCell(curCellNum).setCellValue("Наличие оригинала/согласия на зачисление");
                                    row.getCell(curCellNum).setCellStyle(styleForNames);
                                    ++curCellNum;
                                    row.createCell(curCellNum).setCellValue("Кафедра");
                                    row.getCell(curCellNum).setCellStyle(styleForNames);
                                    ++curCellNum;
                                    row.createCell(curCellNum).setCellValue("Забрал документы");
                                    row.getCell(curCellNum).setCellStyle(styleForNames);
                                    ++curCellNum;
                                    row.createCell(curCellNum).setCellValue("Список ИД");
                                    row.getCell(curCellNum).setCellStyle(styleForNames);
                                    ++curCellNum;
                                    row.createCell(curCellNum).setCellValue("Приоритеты");
                                    row.getCell(curCellNum).setCellStyle(styleForNames);
                                    ++curCellNum;
                                    row.createCell(curCellNum).setCellValue("Целевая организация");
                                    row.getCell(curCellNum).setCellStyle(styleForNames);
                                    ++curCellNum;
                                 }

                                 while(rset.next()) {
                                    row = sheet.createRow(rowNum++);
                                    if(moduleType.equals("аспирантура")) {
                                       row.createCell(0).setCellValue((double)(var42++));
                                       row.getCell(0).setCellStyle(styleForCellsWithCenterAlg);
                                       row.createCell(1).setCellValue((double)rset.getInt(1));
                                       row.getCell(1).setCellStyle(styleForCellsWithCenterAlg);
                                       row.createCell(2).setCellValue(rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4));
                                       row.getCell(2).setCellStyle(styleForCells);
                                       row.createCell(3).setCellValue((double)rset.getInt(5));
                                       row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
                                       var57 = ModelDBConnection.getAllEntranceTestsResultsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                                       var46 = 4;

                                       for(abitAllIndAchivments = 0; abitAllIndAchivments < allEntranceTestNames.length; ++abitAllIndAchivments) {
                                          for(indAchSum = 0; indAchSum < var57.length; ++indAchSum) {
                                             if(allEntranceTestNames[abitAllIndAchivments][1].equals(var57[indAchSum][0])) {
                                                row.createCell(var46 + abitAllIndAchivments).setCellValue(var57[indAchSum][4]);
                                                row.getCell(var46 + abitAllIndAchivments).setCellStyle(styleForCellsWithCenterAlg);
                                                break;
                                             }
                                          }
                                       }

                                       curCellNum = var46 + allEntranceTestNames.length;
                                       var49 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), true);
                                       indAchSum = 0;
                                       if(moduleType.equals("аспирантура")) {
                                          for(allAchivmentsForCurAbit = 0; allAchivmentsForCurAbit < (var49 == null?0:var49.length); ++allAchivmentsForCurAbit) {
                                             indAchSum += Integer.valueOf(var49[allAchivmentsForCurAbit][2]).intValue();
                                          }
                                       } else {
                                          allAchivmentsForCurAbit = 0;
                                          abitAllCompetitiveGroups = 0;

                                          for(allCompetitiveGroupsForCurAbit = 0; allCompetitiveGroupsForCurAbit < (var49 == null?0:var49.length); ++allCompetitiveGroupsForCurAbit) {
                                             if(Integer.valueOf(var49[allCompetitiveGroupsForCurAbit][1]).intValue() <= 11) {
                                                allAchivmentsForCurAbit += Integer.valueOf(var49[allCompetitiveGroupsForCurAbit][2]).intValue();
                                             } else {
                                                abitAllCompetitiveGroups += Integer.valueOf(var49[allCompetitiveGroupsForCurAbit][2]).intValue();
                                             }
                                          }

                                          indAchSum = allAchivmentsForCurAbit + (abitAllCompetitiveGroups > 5?5:abitAllCompetitiveGroups);
                                          //indAchSum = indAchSum > 100?100:indAchSum;
                                       }

                                       row.createCell(curCellNum).setCellValue((double)indAchSum);
                                       row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                       ++curCellNum;
                                       row.createCell(curCellNum).setCellValue(rset.getString(6));
                                       row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                       ++curCellNum;
                                       row.createCell(curCellNum).setCellValue(rset.getString(7));
                                       row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                       ++curCellNum;
                                       row.createCell(curCellNum).setCellValue(rset.getString(8));
                                       row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                       var49 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                                       var55 = "";

                                       for(abitAllCompetitiveGroups = 0; abitAllCompetitiveGroups < (var49 == null?0:var49.length); ++abitAllCompetitiveGroups) {
                                          var55 = var55 + var49[abitAllCompetitiveGroups][0] + ";\n";
                                       }

                                       ++curCellNum;
                                       row.createCell(curCellNum).setCellValue(var55);
                                       row.getCell(curCellNum).setCellStyle(styleForCells);
                                    } else {
                                       row.createCell(0).setCellValue((double)(var42++));
                                       row.getCell(0).setCellStyle(styleForCellsWithCenterAlg);
                                       row.createCell(1).setCellValue((double)rset.getInt(1));
                                       row.getCell(1).setCellStyle(styleForCellsWithCenterAlg);
                                       row.createCell(2).setCellValue(rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4));
                                       row.getCell(2).setCellStyle(styleForCells);
                                       row.createCell(3).setCellValue((double)rset.getInt(5));
                                       row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
                                       var57 = ModelDBConnection.getAllEntranceTestsResultsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                                       var46 = 4;
                                       abitAllIndAchivments = 0;

                                       while(abitAllIndAchivments < allEntranceTestNames.length) {
                                          indAchSum = 0;

                                          while(true) {
                                             if(indAchSum < var57.length) {
                                                if(!allEntranceTestNames[abitAllIndAchivments][1].equals(var57[indAchSum][0])) {
                                                   ++indAchSum;
                                                   continue;
                                                }

                                                row.createCell(var46 + abitAllIndAchivments).setCellValue(var57[indAchSum][4]);
                                                row.getCell(var46 + abitAllIndAchivments).setCellStyle(styleForCellsWithCenterAlg);
                                             }

                                             ++abitAllIndAchivments;
                                             break;
                                          }
                                       }

                                       curCellNum = var46 + allEntranceTestNames.length;
                                       var49 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), true);
                                       indAchSum = 0;
                                       if(moduleType.equals("аспирантура")) {
                                          for(allAchivmentsForCurAbit = 0; allAchivmentsForCurAbit < (var49 == null?0:var49.length); ++allAchivmentsForCurAbit) {
                                             indAchSum += Integer.valueOf(var49[allAchivmentsForCurAbit][2]).intValue();
                                          }
                                       } else {
                                          allAchivmentsForCurAbit = 0;
                                          abitAllCompetitiveGroups = 0;

                                          for(allCompetitiveGroupsForCurAbit = 0; allCompetitiveGroupsForCurAbit < (var49 == null?0:var49.length); ++allCompetitiveGroupsForCurAbit) {
                                             if(Integer.valueOf(var49[allCompetitiveGroupsForCurAbit][1]).intValue() <= 11) {
                                                allAchivmentsForCurAbit += Integer.valueOf(var49[allCompetitiveGroupsForCurAbit][2]).intValue();
                                             } else {
                                                abitAllCompetitiveGroups += Integer.valueOf(var49[allCompetitiveGroupsForCurAbit][2]).intValue();
                                             }
                                          }

                                          indAchSum = allAchivmentsForCurAbit + (abitAllCompetitiveGroups > 5?5:abitAllCompetitiveGroups);
                                          //indAchSum = indAchSum > 100?100:indAchSum;
                                       }

                                       row.createCell(curCellNum).setCellValue((double)indAchSum);
                                       row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                       ++curCellNum;
                                       row.createCell(curCellNum).setCellValue(rset.getString(9));
                                       row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                       ++curCellNum;
                                       row.createCell(curCellNum).setCellValue(rset.getString(6));
                                       row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                       ++curCellNum;
                                       row.createCell(curCellNum).setCellValue(rset.getString(10));
                                       row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                       ++curCellNum;
                                       row.createCell(curCellNum).setCellValue(rset.getString(7));
                                       row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                       var49 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                                       var55 = "";

                                       for(abitAllCompetitiveGroups = 0; abitAllCompetitiveGroups < (var49 == null?0:var49.length); ++abitAllCompetitiveGroups) {
                                          var55 = var55 + var49[abitAllCompetitiveGroups][0] + ";\n";
                                       }

                                       ++curCellNum;
                                       row.createCell(curCellNum).setCellValue(var55);
                                       row.getCell(curCellNum).setCellStyle(styleForCells);
                                       var56 = ModelDBConnection.getAllCompetitiveGroupsByAbiturientId(String.valueOf(rset.getInt(1)));
                                       var54 = "";

                                       for(curCompGroupNum = 0; curCompGroupNum < (var56 == null?0:var56.length); ++curCompGroupNum) {
                                          var54 = var54 + var56[curCompGroupNum][13] + "(" + var56[curCompGroupNum][14] + ");\n";
                                       }

                                       ++curCellNum;
                                       row.createCell(curCellNum).setCellValue(var54);
                                       row.getCell(curCellNum).setCellStyle(styleForCells);
                                       ++curCellNum;
                                       row.createCell(curCellNum).setCellValue(rset.getString(11));
                                       row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                    }
                                 }
                              }

                              rset.close();
                           } else {
                              
                                 var42 = 1;
                                 query = moduleType.equals("аспирантура")?"select aid, SName, Fname, isNULL(MName,\'\'), competitiveBall, case when originalsReceivedDate is not null then \'+\' else \'-\' end, Speciality.name, case when returnDate is not null then \'+\' else \'-\' end, (select sum(isNULL(score, 0)) from AbiturientEntranceTests where AbiturientCompetitiveGroup.aid_abiturient = AbiturientEntranceTests.aid_abiturient) as entranceTestsSum from (Speciality join AbiturientCompetitiveGroup on (AbiturientCompetitiveGroup.speciality = Speciality.id) join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where course = \'" + specialities[path][0] + "\' and targetOrganisation = \'" + targetOrganisations[to_i][0] + "\' " + (forInternalNeeds?"":"and AbiturientCompetitiveGroup.markEnrollment > -1 ") + "order by competitiveBall desc, entranceTestsSum desc":"select aid, SName, Fname, isNULL(MName,\'\'), competitiveBall, case when originalsReceivedDate is not null then \'+\' else \'-\' end, case when returnDate is not null then \'+\' else \'-\' end, (select sum(isNULL(score, 0)) from AbiturientEntranceTests where AbiturientCompetitiveGroup.aid_abiturient = AbiturientEntranceTests.aid_abiturient) as entranceTestsSum, (select isNull(avgBall, 0) from AbiturientHigherEducation where AbiturientCompetitiveGroup.aid_abiturient = AbiturientHigherEducation.aid_abiturient) as avgDiplomaBall, Chair.name from (Chair join AbiturientCompetitiveGroup on (AbiturientCompetitiveGroup.chair = Chair.id) join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where speciality = \'" + specialities[path][0] + "\' and targetOrganisation = \'" + targetOrganisations[to_i][0] + "\' " + (forInternalNeeds?"":"and AbiturientCompetitiveGroup.markEnrollment > -1 ") + "order by competitiveBall desc, entranceTestsSum desc, avgDiplomaBall desc";
                                 cstmt = con.prepareCall(query, 1004, 1007);
                                 rset = cstmt.executeQuery();
                                 curCellNum = rset.last()?rset.getRow():0;
                                 rset.beforeFirst();
                                 if(curCellNum > 0) {
                                    row = sheet.createRow(rowNum++);
                                    row = sheet.createRow(rowNum++);
                                    row.createCell(0).setCellValue("Целевая организация: " + targetOrganisations[to_i][1]);
                                    sheet.addMergedRegion(new CellRangeAddress(rowNum - 1, rowNum - 1, 0, 4));
                                    row.getCell(0).setCellStyle(styleForTargetOrgs);
                                    row = sheet.createRow(rowNum++);
                                    boolean abitAllEntranceResults = false;
                                    byte var47;
                                    if(moduleType.equals("аспирантура")) {
                                       row.createCell(0).setCellValue("№п/п");
                                       row.getCell(0).setCellStyle(styleForNames);
                                       row.createCell(1).setCellValue("№ЛД");
                                       row.getCell(1).setCellStyle(styleForNames);
                                       row.createCell(2).setCellValue("ФИО");
                                       row.getCell(2).setCellStyle(styleForNames);
                                       row.createCell(3).setCellValue("Конкурсный балл");
                                       row.getCell(3).setCellStyle(styleForNames);
                                       var47 = 4;

                                       for(abitAllIndAchivments = 0; abitAllIndAchivments < allEntranceTestNames.length; ++abitAllIndAchivments) {
                                          row.createCell(var47 + abitAllIndAchivments).setCellValue(allEntranceTestNames[abitAllIndAchivments][1]);
                                          row.getCell(var47 + abitAllIndAchivments).setCellStyle(styleForNames);
                                       }

                                       var48 = var47 + allEntranceTestNames.length;
                                       row.createCell(var48).setCellValue("Балл за ИД");
                                       row.getCell(var48).setCellStyle(styleForNames);
                                       ++var48;
                                       row.createCell(var48).setCellValue("Наличие оригинала/согласия на зачисление");
                                       row.getCell(var48).setCellStyle(styleForNames);
                                       ++var48;
                                       row.createCell(var48).setCellValue("Специальность");
                                       row.getCell(var48).setCellStyle(styleForNames);
                                       ++var48;
                                       row.createCell(var48).setCellValue("Забрал документы");
                                       row.getCell(var48).setCellStyle(styleForNames);
                                       ++var48;
                                       row.createCell(var48).setCellValue("Список ИД");
                                       row.getCell(var48).setCellStyle(styleForNames);
                                       ++var48;
                                    } else {
                                       row.createCell(0).setCellValue("№п/п");
                                       row.getCell(0).setCellStyle(styleForNames);
                                       row.createCell(1).setCellValue("№ЛД");
                                       row.getCell(1).setCellStyle(styleForNames);
                                       row.createCell(2).setCellValue("ФИО");
                                       row.getCell(2).setCellStyle(styleForNames);
                                       row.createCell(3).setCellValue("Конкурсный балл");
                                       row.getCell(3).setCellStyle(styleForNames);
                                       var47 = 4;

                                       for(abitAllIndAchivments = 0; abitAllIndAchivments < allEntranceTestNames.length; ++abitAllIndAchivments) {
                                          row.createCell(var47 + abitAllIndAchivments).setCellValue(allEntranceTestNames[abitAllIndAchivments][1]);
                                          row.getCell(var47 + abitAllIndAchivments).setCellStyle(styleForNames);
                                       }

                                       var48 = var47 + allEntranceTestNames.length;
                                       row.createCell(var48).setCellValue("Балл за ИД");
                                       row.getCell(var48).setCellStyle(styleForNames);
                                       ++var48;
                                       row.createCell(var48).setCellValue("Средний балл по диплому");
                                       row.getCell(var48).setCellStyle(styleForNames);
                                       ++var48;
                                       row.createCell(var48).setCellValue("Наличие оригинала/согласия на зачисление");
                                       row.getCell(var48).setCellStyle(styleForNames);
                                       ++var48;
                                       row.createCell(var48).setCellValue("Кафедра");
                                       row.getCell(var48).setCellStyle(styleForNames);
                                       ++var48;
                                       row.createCell(var48).setCellValue("Забрал документы");
                                       row.getCell(var48).setCellStyle(styleForNames);
                                       ++var48;
                                       row.createCell(var48).setCellValue("Список ИД");
                                       row.getCell(var48).setCellStyle(styleForNames);
                                       ++var48;
                                       row.createCell(var48).setCellValue("Приоритеты");
                                       row.getCell(var48).setCellStyle(styleForNames);
                                       ++var48;
                                    }

                                    while(rset.next()) {
                                       row = sheet.createRow(rowNum++);
                                       String[][] var50;
                                       String var51;
                                       if(moduleType.equals("аспирантура")) {
                                          row.createCell(0).setCellValue((double)(var42++));
                                          row.getCell(0).setCellStyle(styleForCellsWithCenterAlg);
                                          row.createCell(1).setCellValue((double)rset.getInt(1));
                                          row.getCell(1).setCellStyle(styleForCellsWithCenterAlg);
                                          row.createCell(2).setCellValue(rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4));
                                          row.getCell(2).setCellStyle(styleForCells);
                                          row.createCell(3).setCellValue((double)rset.getInt(5));
                                          row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
                                          var49 = ModelDBConnection.getAllEntranceTestsResultsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                                          var47 = 4;

                                          for(indAchSum = 0; indAchSum < allEntranceTestNames.length; ++indAchSum) {
                                             for(allAchivmentsForCurAbit = 0; allAchivmentsForCurAbit < var49.length; ++allAchivmentsForCurAbit) {
                                                if(allEntranceTestNames[indAchSum][1].equals(var49[allAchivmentsForCurAbit][0])) {
                                                   row.createCell(var47 + indAchSum).setCellValue(var49[allAchivmentsForCurAbit][4]);
                                                   row.getCell(var47 + indAchSum).setCellStyle(styleForCellsWithCenterAlg);
                                                   break;
                                                }
                                             }
                                          }

                                          var48 = var47 + allEntranceTestNames.length;
                                          var50 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), true);
                                          allAchivmentsForCurAbit = 0;
                                          if(moduleType.equals("аспирантура")) {
                                             for(abitAllCompetitiveGroups = 0; abitAllCompetitiveGroups < (var50 == null?0:var50.length); ++abitAllCompetitiveGroups) {
                                                allAchivmentsForCurAbit += Integer.valueOf(var50[abitAllCompetitiveGroups][2]).intValue();
                                             }
                                          } else {
                                             abitAllCompetitiveGroups = 0;
                                             allCompetitiveGroupsForCurAbit = 0;

                                             for(curCompGroupNum = 0; curCompGroupNum < (var50 == null?0:var50.length); ++curCompGroupNum) {
                                                if(Integer.valueOf(var50[curCompGroupNum][1]).intValue() <= 11) {
                                                   abitAllCompetitiveGroups += Integer.valueOf(var50[curCompGroupNum][2]).intValue();
                                                } else {
                                                   allCompetitiveGroupsForCurAbit += Integer.valueOf(var50[curCompGroupNum][2]).intValue();
                                                }
                                             }

                                             allAchivmentsForCurAbit = abitAllCompetitiveGroups + (allCompetitiveGroupsForCurAbit > 5?5:allCompetitiveGroupsForCurAbit);
                                             //allAchivmentsForCurAbit = allAchivmentsForCurAbit > 100?100:allAchivmentsForCurAbit;
                                          }

                                          row.createCell(var48).setCellValue((double)allAchivmentsForCurAbit);
                                          row.getCell(var48).setCellStyle(styleForCellsWithCenterAlg);
                                          ++var48;
                                          row.createCell(var48).setCellValue(rset.getString(6));
                                          row.getCell(var48).setCellStyle(styleForCellsWithCenterAlg);
                                          ++var48;
                                          row.createCell(var48).setCellValue(rset.getString(7));
                                          row.getCell(var48).setCellStyle(styleForCellsWithCenterAlg);
                                          ++var48;
                                          row.createCell(var48).setCellValue(rset.getString(8));
                                          row.getCell(var48).setCellStyle(styleForCellsWithCenterAlg);
                                          var50 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                                          var51 = "";

                                          for(allCompetitiveGroupsForCurAbit = 0; allCompetitiveGroupsForCurAbit < (var50 == null?0:var50.length); ++allCompetitiveGroupsForCurAbit) {
                                             var51 = var51 + var50[allCompetitiveGroupsForCurAbit][0] + ";\n";
                                          }

                                          ++var48;
                                          row.createCell(var48).setCellValue(var51);
                                          row.getCell(var48).setCellStyle(styleForCells);
                                       } else {
                                          row.createCell(0).setCellValue((double)(var42++));
                                          row.getCell(0).setCellStyle(styleForCellsWithCenterAlg);
                                          row.createCell(1).setCellValue((double)rset.getInt(1));
                                          row.getCell(1).setCellStyle(styleForCellsWithCenterAlg);
                                          row.createCell(2).setCellValue(rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4));
                                          row.getCell(2).setCellStyle(styleForCells);
                                          row.createCell(3).setCellValue((double)rset.getInt(5));
                                          row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
                                          var49 = ModelDBConnection.getAllEntranceTestsResultsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                                          var47 = 4;
                                          indAchSum = 0;

                                          while(indAchSum < allEntranceTestNames.length) {
                                             allAchivmentsForCurAbit = 0;

                                             while(true) {
                                                if(allAchivmentsForCurAbit < var49.length) {
                                                   if(!allEntranceTestNames[indAchSum][1].equals(var49[allAchivmentsForCurAbit][0])) {
                                                      ++allAchivmentsForCurAbit;
                                                      continue;
                                                   }

                                                   row.createCell(var47 + indAchSum).setCellValue(var49[allAchivmentsForCurAbit][4]);
                                                   row.getCell(var47 + indAchSum).setCellStyle(styleForCellsWithCenterAlg);
                                                }

                                                ++indAchSum;
                                                break;
                                             }
                                          }

                                          var48 = var47 + allEntranceTestNames.length;
                                          var50 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), true);
                                          allAchivmentsForCurAbit = 0;
                                          if(moduleType.equals("аспирантура")) {
                                             for(abitAllCompetitiveGroups = 0; abitAllCompetitiveGroups < (var50 == null?0:var50.length); ++abitAllCompetitiveGroups) {
                                                allAchivmentsForCurAbit += Integer.valueOf(var50[abitAllCompetitiveGroups][2]).intValue();
                                             }
                                          } else {
                                             abitAllCompetitiveGroups = 0;
                                             allCompetitiveGroupsForCurAbit = 0;

                                             for(curCompGroupNum = 0; curCompGroupNum < (var50 == null?0:var50.length); ++curCompGroupNum) {
                                                if(Integer.valueOf(var50[curCompGroupNum][1]).intValue() <= 11) {
                                                   abitAllCompetitiveGroups += Integer.valueOf(var50[curCompGroupNum][2]).intValue();
                                                } else {
                                                   allCompetitiveGroupsForCurAbit += Integer.valueOf(var50[curCompGroupNum][2]).intValue();
                                                }
                                             }

                                             allAchivmentsForCurAbit = abitAllCompetitiveGroups + (allCompetitiveGroupsForCurAbit > 5?5:allCompetitiveGroupsForCurAbit);
                                             //allAchivmentsForCurAbit = allAchivmentsForCurAbit > 100?100:allAchivmentsForCurAbit;
                                          }

                                          row.createCell(var48).setCellValue((double)allAchivmentsForCurAbit);
                                          row.getCell(var48).setCellStyle(styleForCellsWithCenterAlg);
                                          ++var48;
                                          row.createCell(var48).setCellValue(rset.getString(9));
                                          row.getCell(var48).setCellStyle(styleForCellsWithCenterAlg);
                                          ++var48;
                                          row.createCell(var48).setCellValue(rset.getString(6));
                                          row.getCell(var48).setCellStyle(styleForCellsWithCenterAlg);
                                          ++var48;
                                          row.createCell(var48).setCellValue(rset.getString(10));
                                          row.getCell(var48).setCellStyle(styleForCellsWithCenterAlg);
                                          ++var48;
                                          row.createCell(var48).setCellValue(rset.getString(7));
                                          row.getCell(var48).setCellStyle(styleForCellsWithCenterAlg);
                                          var50 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                                          var51 = "";

                                          for(allCompetitiveGroupsForCurAbit = 0; allCompetitiveGroupsForCurAbit < (var50 == null?0:var50.length); ++allCompetitiveGroupsForCurAbit) {
                                             var51 = var51 + var50[allCompetitiveGroupsForCurAbit][0] + ";\n";
                                          }

                                          ++var48;
                                          row.createCell(var48).setCellValue(var51);
                                          row.getCell(var48).setCellStyle(styleForCells);
                                          String[][] var52 = ModelDBConnection.getAllCompetitiveGroupsByAbiturientId(String.valueOf(rset.getInt(1)));
                                          String var53 = "";

                                          for(int curCompGroupNum1 = 0; curCompGroupNum1 < (var52 == null?0:var52.length); ++curCompGroupNum1) {
                                             var53 = var53 + var52[curCompGroupNum1][13] + "(" + var52[curCompGroupNum1][14] + ");\n";
                                          }

                                          ++var48;
                                          row.createCell(var48).setCellValue(var53);
                                          row.getCell(var48).setCellStyle(styleForCells);
                                       }
                                    }
                                 }

                                 rset.close();
                              
                           }
                        }
                     }

                     query = moduleType.equals("аспирантура")?"select * from AbiturientCompetitiveGroup where course = \'" + specialities[path][0] + "\' and targetOrganisation is not null " + (forInternalNeeds?"":"and AbiturientCompetitiveGroup.markEnrollment > -1 "):"select * from AbiturientCompetitiveGroup where speciality = \'" + specialities[path][0] + "\' and targetOrganisation is null" + (forInternalNeeds?"":"and AbiturientCompetitiveGroup.markEnrollment > -1 ");
                     cstmt = con.prepareCall(query, 1004, 1007);
                     rset = cstmt.executeQuery();
                     es_i = rset.last()?rset.getRow():0;
                     rset.close();
                     if(es_i > 0) {
                        row = sheet.createRow(rowNum++);
                        row = sheet.createRow(rowNum++);
                        row.createCell(1).setCellValue("места в рамках общего конкурса");
                        row.getCell(1).setCellStyle(styleForTargetOrgs);
                         if(!moduleType.equals("аспирантура")) {
                            var42 = 1;
                            query = "select aid, SName, Fname, isNULL(MName,\'\'), competitiveBall, case when originalsReceivedDate is not null then \'+\' else \'-\' end, case when returnDate is not null then \'+\' else \'-\' end, (select sum(isNULL(score, 0)) from AbiturientEntranceTests where AbiturientCompetitiveGroup.aid_abiturient = AbiturientEntranceTests.aid_abiturient) as entranceTestsSum, (select isNull(avgBall, 0) from AbiturientHigherEducation where AbiturientCompetitiveGroup.aid_abiturient = AbiturientHigherEducation.aid_abiturient) as avgDiplomaBall, Chair.name from (Chair join AbiturientCompetitiveGroup on (AbiturientCompetitiveGroup.chair = Chair.id) join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where speciality = \'" + specialities[path][0] + "\' and targetOrganisation is null and competitiveGroup = 2" + (forInternalNeeds?"":"and AbiturientCompetitiveGroup.markEnrollment > -1 ")  + "order by competitiveBall desc, entranceTestsSum desc, avgDiplomaBall desc";
                           System.out.println(query);
                           cstmt = con.prepareCall(query, 1004, 1007);
                           rset = cstmt.executeQuery();
                           countAbitsOnCurSpecOnCurCompGrAndSt = rset.last()?rset.getRow():0;
                           rset.beforeFirst();
                           if(countAbitsOnCurSpecOnCurCompGrAndSt > 0) {
                              //row = sheet.createRow(rowNum++);
                              row = sheet.createRow(rowNum++);
                              var45 = false;
                              if(moduleType.equals("аспирантура")) {
                                 row.createCell(0).setCellValue("№п/п");
                                 row.getCell(0).setCellStyle(styleForNames);
                                 row.createCell(1).setCellValue("№ЛД");
                                 row.getCell(1).setCellStyle(styleForNames);
                                 row.createCell(2).setCellValue("ФИО");
                                 row.getCell(2).setCellStyle(styleForNames);
                                 row.createCell(3).setCellValue("Конкурсный балл");
                                 row.getCell(3).setCellStyle(styleForNames);
                                 var46 = 4;

                                 for(var48 = 0; var48 < allEntranceTestNames.length; ++var48) {
                                    row.createCell(var46 + var48).setCellValue(allEntranceTestNames[var48][1]);
                                    row.getCell(var46 + var48).setCellStyle(styleForNames);
                                 }

                                 curCellNum = var46 + allEntranceTestNames.length;
                                 row.createCell(curCellNum).setCellValue("Балл за ИД");
                                 row.getCell(curCellNum).setCellStyle(styleForNames);
                                 ++curCellNum;
                                 row.createCell(curCellNum).setCellValue("Наличие оригинала/согласия на зачисление");
                                 row.getCell(curCellNum).setCellStyle(styleForNames);
                                 ++curCellNum;
                                 row.createCell(curCellNum).setCellValue("Специальность");
                                 row.getCell(curCellNum).setCellStyle(styleForNames);
                                 ++curCellNum;
                                 row.createCell(curCellNum).setCellValue("Забрал документы");
                                 row.getCell(curCellNum).setCellStyle(styleForNames);
                                 ++curCellNum;
                                 row.createCell(curCellNum).setCellValue("Список ИД");
                                 row.getCell(curCellNum).setCellStyle(styleForNames);
                                 ++curCellNum;
                              } else {
                                 row.createCell(0).setCellValue("№п/п");
                                 row.getCell(0).setCellStyle(styleForNames);
                                 row.createCell(1).setCellValue("№ЛД");
                                 row.getCell(1).setCellStyle(styleForNames);
                                 row.createCell(2).setCellValue("ФИО");
                                 row.getCell(2).setCellStyle(styleForNames);
                                 row.createCell(3).setCellValue("Конкурсный балл");
                                 row.getCell(3).setCellStyle(styleForNames);
                                 var46 = 4;

                                 for(var48 = 0; var48 < allEntranceTestNames.length; ++var48) {
                                    row.createCell(var46 + var48).setCellValue(allEntranceTestNames[var48][1]);
                                    row.getCell(var46 + var48).setCellStyle(styleForNames);
                                 }

                                 curCellNum = var46 + allEntranceTestNames.length;
                                 row.createCell(curCellNum).setCellValue("Балл за ИД");
                                 row.getCell(curCellNum).setCellStyle(styleForNames);
                                 ++curCellNum;
                                 row.createCell(curCellNum).setCellValue("Средний балл по диплому");
                                 row.getCell(curCellNum).setCellStyle(styleForNames);
                                 ++curCellNum;
                                 row.createCell(curCellNum).setCellValue("Наличие оригинала/согласия на зачисление");
                                 row.getCell(curCellNum).setCellStyle(styleForNames);
                                 ++curCellNum;
                                 row.createCell(curCellNum).setCellValue("Кафедра");
                                 row.getCell(curCellNum).setCellStyle(styleForNames);
                                 ++curCellNum;
                                 row.createCell(curCellNum).setCellValue("Забрал документы");
                                 row.getCell(curCellNum).setCellStyle(styleForNames);
                                 ++curCellNum;
                                 row.createCell(curCellNum).setCellValue("Список ИД");
                                 row.getCell(curCellNum).setCellStyle(styleForNames);
                                 ++curCellNum;
                                 row.createCell(curCellNum).setCellValue("Приоритеты");
                                 row.getCell(curCellNum).setCellStyle(styleForNames);
                                 ++curCellNum;
                                 // row.createCell(curCellNum).setCellValue("Целевая организация");
                                 // row.getCell(curCellNum).setCellStyle(styleForNames);
                                 // ++curCellNum;
                              }

                              while(rset.next()) {
                                 row = sheet.createRow(rowNum++);
                                 if(moduleType.equals("аспирантура")) {
                                    row.createCell(0).setCellValue((double)(var42++));
                                    row.getCell(0).setCellStyle(styleForCellsWithCenterAlg);
                                    row.createCell(1).setCellValue((double)rset.getInt(1));
                                    row.getCell(1).setCellStyle(styleForCellsWithCenterAlg);
                                    row.createCell(2).setCellValue(rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4));
                                    row.getCell(2).setCellStyle(styleForCells);
                                    row.createCell(3).setCellValue((double)rset.getInt(5));
                                    row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
                                    var57 = ModelDBConnection.getAllEntranceTestsResultsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                                    var46 = 4;

                                    for(abitAllIndAchivments = 0; abitAllIndAchivments < allEntranceTestNames.length; ++abitAllIndAchivments) {
                                       for(indAchSum = 0; indAchSum < var57.length; ++indAchSum) {
                                          if(allEntranceTestNames[abitAllIndAchivments][1].equals(var57[indAchSum][0])) {
                                             row.createCell(var46 + abitAllIndAchivments).setCellValue(var57[indAchSum][4]);
                                             row.getCell(var46 + abitAllIndAchivments).setCellStyle(styleForCellsWithCenterAlg);
                                             break;
                                          }
                                       }
                                    }

                                    curCellNum = var46 + allEntranceTestNames.length;
                                    var49 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), true);
                                    indAchSum = 0;
                                    if(moduleType.equals("аспирантура")) {
                                       for(allAchivmentsForCurAbit = 0; allAchivmentsForCurAbit < (var49 == null?0:var49.length); ++allAchivmentsForCurAbit) {
                                          indAchSum += Integer.valueOf(var49[allAchivmentsForCurAbit][2]).intValue();
                                       }
                                    } else {
                                       allAchivmentsForCurAbit = 0;
                                       abitAllCompetitiveGroups = 0;

                                       for(allCompetitiveGroupsForCurAbit = 0; allCompetitiveGroupsForCurAbit < (var49 == null?0:var49.length); ++allCompetitiveGroupsForCurAbit) {
                                          if(Integer.valueOf(var49[allCompetitiveGroupsForCurAbit][1]).intValue() <= 11) {
                                             allAchivmentsForCurAbit += Integer.valueOf(var49[allCompetitiveGroupsForCurAbit][2]).intValue();
                                          } else {
                                             abitAllCompetitiveGroups += Integer.valueOf(var49[allCompetitiveGroupsForCurAbit][2]).intValue();
                                          }
                                       }

                                       indAchSum = allAchivmentsForCurAbit + (abitAllCompetitiveGroups > 5?5:abitAllCompetitiveGroups);
                                       //indAchSum = indAchSum > 100?100:indAchSum;
                                    }

                                    row.createCell(curCellNum).setCellValue((double)indAchSum);
                                    row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                    ++curCellNum;
                                    row.createCell(curCellNum).setCellValue(rset.getString(6));
                                    row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                    ++curCellNum;
                                    row.createCell(curCellNum).setCellValue(rset.getString(7));
                                    row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                    ++curCellNum;
                                    row.createCell(curCellNum).setCellValue(rset.getString(8));
                                    row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                    var49 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                                    var55 = "";

                                    for(abitAllCompetitiveGroups = 0; abitAllCompetitiveGroups < (var49 == null?0:var49.length); ++abitAllCompetitiveGroups) {
                                       var55 = var55 + var49[abitAllCompetitiveGroups][0] + ";\n";
                                    }

                                    ++curCellNum;
                                    row.createCell(curCellNum).setCellValue(var55);
                                    row.getCell(curCellNum).setCellStyle(styleForCells);
                                 } else {
                                    row.createCell(0).setCellValue((double)(var42++));
                                    row.getCell(0).setCellStyle(styleForCellsWithCenterAlg);
                                    row.createCell(1).setCellValue((double)rset.getInt(1));
                                    row.getCell(1).setCellStyle(styleForCellsWithCenterAlg);
                                    row.createCell(2).setCellValue(rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4));
                                    row.getCell(2).setCellStyle(styleForCells);
                                    row.createCell(3).setCellValue((double)rset.getInt(5));
                                    row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
                                    var57 = ModelDBConnection.getAllEntranceTestsResultsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                                    var46 = 4;
                                    abitAllIndAchivments = 0;

                                    while(abitAllIndAchivments < allEntranceTestNames.length) {
                                       indAchSum = 0;

                                       while(true) {
                                          if(indAchSum < var57.length) {
                                             if(!allEntranceTestNames[abitAllIndAchivments][1].equals(var57[indAchSum][0])) {
                                                ++indAchSum;
                                                continue;
                                             }

                                             row.createCell(var46 + abitAllIndAchivments).setCellValue(var57[indAchSum][4]);
                                             row.getCell(var46 + abitAllIndAchivments).setCellStyle(styleForCellsWithCenterAlg);
                                          }

                                          ++abitAllIndAchivments;
                                          break;
                                       }
                                    }

                                    curCellNum = var46 + allEntranceTestNames.length;
                                    var49 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), true);
                                    indAchSum = 0;
                                    if(moduleType.equals("аспирантура")) {
                                       for(allAchivmentsForCurAbit = 0; allAchivmentsForCurAbit < (var49 == null?0:var49.length); ++allAchivmentsForCurAbit) {
                                          indAchSum += Integer.valueOf(var49[allAchivmentsForCurAbit][2]).intValue();
                                       }
                                    } else {
                                       allAchivmentsForCurAbit = 0;
                                       abitAllCompetitiveGroups = 0;

                                       for(allCompetitiveGroupsForCurAbit = 0; allCompetitiveGroupsForCurAbit < (var49 == null?0:var49.length); ++allCompetitiveGroupsForCurAbit) {
                                          if(Integer.valueOf(var49[allCompetitiveGroupsForCurAbit][1]).intValue() <= 11) {
                                             allAchivmentsForCurAbit += Integer.valueOf(var49[allCompetitiveGroupsForCurAbit][2]).intValue();
                                          } else {
                                             abitAllCompetitiveGroups += Integer.valueOf(var49[allCompetitiveGroupsForCurAbit][2]).intValue();
                                          }
                                       }

                                       indAchSum = allAchivmentsForCurAbit + (abitAllCompetitiveGroups > 5?5:abitAllCompetitiveGroups);
                                       //indAchSum = indAchSum > 100?100:indAchSum;
                                    }

                                    row.createCell(curCellNum).setCellValue((double)indAchSum);
                                    row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                    ++curCellNum;
                                    row.createCell(curCellNum).setCellValue(rset.getString(9));
                                    row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                    ++curCellNum;
                                    row.createCell(curCellNum).setCellValue(rset.getString(6));
                                    row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                    ++curCellNum;
                                    row.createCell(curCellNum).setCellValue(rset.getString(10));
                                    row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                    ++curCellNum;
                                    row.createCell(curCellNum).setCellValue(rset.getString(7));
                                    row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                    var49 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                                    var55 = "";

                                    for(abitAllCompetitiveGroups = 0; abitAllCompetitiveGroups < (var49 == null?0:var49.length); ++abitAllCompetitiveGroups) {
                                       var55 = var55 + var49[abitAllCompetitiveGroups][0] + ";\n";
                                    }

                                    ++curCellNum;
                                    row.createCell(curCellNum).setCellValue(var55);
                                    row.getCell(curCellNum).setCellStyle(styleForCells);
                                    var56 = ModelDBConnection.getAllCompetitiveGroupsByAbiturientId(String.valueOf(rset.getInt(1)));
                                    var54 = "";

                                    for(curCompGroupNum = 0; curCompGroupNum < (var56 == null?0:var56.length); ++curCompGroupNum) {
                                       var54 = var54 + var56[curCompGroupNum][13] + "(" + var56[curCompGroupNum][14] + ");\n";
                                    }

                                    ++curCellNum;
                                    row.createCell(curCellNum).setCellValue(var54);
                                    row.getCell(curCellNum).setCellStyle(styleForCells);
                                    ++curCellNum;
                                    // row.createCell(curCellNum).setCellValue(rset.getString(11));
                                    // row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                 }
                              }
                           }

                           rset.close();
                        } else {                    
                              var42 = 1;
                              query = moduleType.equals("аспирантура")?"select aid, SName, Fname, isNULL(MName,\'\'), competitiveBall, case when originalsReceivedDate is not null then \'+\' else \'-\' end, Speciality.name, case when returnDate is not null then \'+\' else \'-\' end, (select sum(isNULL(score, 0)) from AbiturientEntranceTests where AbiturientCompetitiveGroup.aid_abiturient = AbiturientEntranceTests.aid_abiturient) as entranceTestsSum from (Speciality join AbiturientCompetitiveGroup on (AbiturientCompetitiveGroup.speciality = Speciality.id) join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where course = \'" + specialities[path][0] + "\' and targetOrganisation is null " + (forInternalNeeds?"":"and AbiturientCompetitiveGroup.markEnrollment > -1 ") + "order by competitiveBall desc, entranceTestsSum desc":"select aid, SName, Fname, isNULL(MName,\'\'), competitiveBall, case when originalsReceivedDate is not null then \'+\' else \'-\' end, case when returnDate is not null then \'+\' else \'-\' end, (select sum(isNULL(score, 0)) from AbiturientEntranceTests where AbiturientCompetitiveGroup.aid_abiturient = AbiturientEntranceTests.aid_abiturient) as entranceTestsSum, (select isNull(avgBall, 0) from AbiturientHigherEducation where AbiturientCompetitiveGroup.aid_abiturient = AbiturientHigherEducation.aid_abiturient) as avgDiplomaBall, Chair.name from (Chair join AbiturientCompetitiveGroup on (AbiturientCompetitiveGroup.chair = Chair.id) join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where speciality = \'" + specialities[path][0] + "\' and targetOrganisation is null " + (forInternalNeeds?"":"and AbiturientCompetitiveGroup.markEnrollment > -1 ") + "order by competitiveBall desc, entranceTestsSum desc, avgDiplomaBall desc";
                              cstmt = con.prepareCall(query, 1004, 1007);
                              rset = cstmt.executeQuery();
                              curCellNum = rset.last()?rset.getRow():0;
                              rset.beforeFirst();
                              if(curCellNum > 0) {
                                 row = sheet.createRow(rowNum++);
                                 row = sheet.createRow(rowNum++);
                                 row.createCell(0).setCellValue("Целевая организация: ");
                                 sheet.addMergedRegion(new CellRangeAddress(rowNum - 1, rowNum - 1, 0, 4));
                                 row.getCell(0).setCellStyle(styleForTargetOrgs);
                                 row = sheet.createRow(rowNum++);
                                 boolean abitAllEntranceResults = false;
                                 byte var47;
                                 if(moduleType.equals("аспирантура")) {
                                    row.createCell(0).setCellValue("№п/п");
                                    row.getCell(0).setCellStyle(styleForNames);
                                    row.createCell(1).setCellValue("№ЛД");
                                    row.getCell(1).setCellStyle(styleForNames);
                                    row.createCell(2).setCellValue("ФИО");
                                    row.getCell(2).setCellStyle(styleForNames);
                                    row.createCell(3).setCellValue("Конкурсный балл");
                                    row.getCell(3).setCellStyle(styleForNames);
                                    var47 = 4;

                                    for(abitAllIndAchivments = 0; abitAllIndAchivments < allEntranceTestNames.length; ++abitAllIndAchivments) {
                                       row.createCell(var47 + abitAllIndAchivments).setCellValue(allEntranceTestNames[abitAllIndAchivments][1]);
                                       row.getCell(var47 + abitAllIndAchivments).setCellStyle(styleForNames);
                                    }

                                    var48 = var47 + allEntranceTestNames.length;
                                    row.createCell(var48).setCellValue("Балл за ИД");
                                    row.getCell(var48).setCellStyle(styleForNames);
                                    ++var48;
                                    row.createCell(var48).setCellValue("Наличие оригинала/согласия на зачисление");
                                    row.getCell(var48).setCellStyle(styleForNames);
                                    ++var48;
                                    row.createCell(var48).setCellValue("Специальность");
                                    row.getCell(var48).setCellStyle(styleForNames);
                                    ++var48;
                                    row.createCell(var48).setCellValue("Забрал документы");
                                    row.getCell(var48).setCellStyle(styleForNames);
                                    ++var48;
                                    row.createCell(var48).setCellValue("Список ИД");
                                    row.getCell(var48).setCellStyle(styleForNames);
                                    ++var48;
                                 } else {
                                    row.createCell(0).setCellValue("№п/п");
                                    row.getCell(0).setCellStyle(styleForNames);
                                    row.createCell(1).setCellValue("№ЛД");
                                    row.getCell(1).setCellStyle(styleForNames);
                                    row.createCell(2).setCellValue("ФИО");
                                    row.getCell(2).setCellStyle(styleForNames);
                                    row.createCell(3).setCellValue("Конкурсный балл");
                                    row.getCell(3).setCellStyle(styleForNames);
                                    var47 = 4;

                                    for(abitAllIndAchivments = 0; abitAllIndAchivments < allEntranceTestNames.length; ++abitAllIndAchivments) {
                                       row.createCell(var47 + abitAllIndAchivments).setCellValue(allEntranceTestNames[abitAllIndAchivments][1]);
                                       row.getCell(var47 + abitAllIndAchivments).setCellStyle(styleForNames);
                                    }

                                    var48 = var47 + allEntranceTestNames.length;
                                    row.createCell(var48).setCellValue("Балл за ИД");
                                    row.getCell(var48).setCellStyle(styleForNames);
                                    ++var48;
                                    row.createCell(var48).setCellValue("Средний балл по диплому");
                                    row.getCell(var48).setCellStyle(styleForNames);
                                    ++var48;
                                    row.createCell(var48).setCellValue("Наличие оригинала/согласия на зачисление");
                                    row.getCell(var48).setCellStyle(styleForNames);
                                    ++var48;
                                    row.createCell(var48).setCellValue("Кафедра");
                                    row.getCell(var48).setCellStyle(styleForNames);
                                    ++var48;
                                    row.createCell(var48).setCellValue("Забрал документы");
                                    row.getCell(var48).setCellStyle(styleForNames);
                                    ++var48;
                                    row.createCell(var48).setCellValue("Список ИД");
                                    row.getCell(var48).setCellStyle(styleForNames);
                                    ++var48;
                                    row.createCell(var48).setCellValue("Приоритеты");
                                    row.getCell(var48).setCellStyle(styleForNames);
                                    ++var48;
                                 }

                                 while(rset.next()) {
                                    row = sheet.createRow(rowNum++);
                                    String[][] var50;
                                    String var51;
                                    if(moduleType.equals("аспирантура")) {
                                       row.createCell(0).setCellValue((double)(var42++));
                                       row.getCell(0).setCellStyle(styleForCellsWithCenterAlg);
                                       row.createCell(1).setCellValue((double)rset.getInt(1));
                                       row.getCell(1).setCellStyle(styleForCellsWithCenterAlg);
                                       row.createCell(2).setCellValue(rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4));
                                       row.getCell(2).setCellStyle(styleForCells);
                                       row.createCell(3).setCellValue((double)rset.getInt(5));
                                       row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
                                       var49 = ModelDBConnection.getAllEntranceTestsResultsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                                       var47 = 4;

                                       for(indAchSum = 0; indAchSum < allEntranceTestNames.length; ++indAchSum) {
                                          for(allAchivmentsForCurAbit = 0; allAchivmentsForCurAbit < var49.length; ++allAchivmentsForCurAbit) {
                                             if(allEntranceTestNames[indAchSum][1].equals(var49[allAchivmentsForCurAbit][0])) {
                                                row.createCell(var47 + indAchSum).setCellValue(var49[allAchivmentsForCurAbit][4]);
                                                row.getCell(var47 + indAchSum).setCellStyle(styleForCellsWithCenterAlg);
                                                break;
                                             }
                                          }
                                       }

                                       var48 = var47 + allEntranceTestNames.length;
                                       var50 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), true);
                                       allAchivmentsForCurAbit = 0;
                                       if(moduleType.equals("аспирантура")) {
                                          for(abitAllCompetitiveGroups = 0; abitAllCompetitiveGroups < (var50 == null?0:var50.length); ++abitAllCompetitiveGroups) {
                                             allAchivmentsForCurAbit += Integer.valueOf(var50[abitAllCompetitiveGroups][2]).intValue();
                                          }
                                       } else {
                                          abitAllCompetitiveGroups = 0;
                                          allCompetitiveGroupsForCurAbit = 0;

                                          for(curCompGroupNum = 0; curCompGroupNum < (var50 == null?0:var50.length); ++curCompGroupNum) {
                                             if(Integer.valueOf(var50[curCompGroupNum][1]).intValue() <= 11) {
                                                abitAllCompetitiveGroups += Integer.valueOf(var50[curCompGroupNum][2]).intValue();
                                             } else {
                                                allCompetitiveGroupsForCurAbit += Integer.valueOf(var50[curCompGroupNum][2]).intValue();
                                             }
                                          }

                                          allAchivmentsForCurAbit = abitAllCompetitiveGroups + (allCompetitiveGroupsForCurAbit > 5?5:allCompetitiveGroupsForCurAbit);
                                          //allAchivmentsForCurAbit = allAchivmentsForCurAbit > 100?100:allAchivmentsForCurAbit;
                                       }

                                       row.createCell(var48).setCellValue((double)allAchivmentsForCurAbit);
                                       row.getCell(var48).setCellStyle(styleForCellsWithCenterAlg);
                                       ++var48;
                                       row.createCell(var48).setCellValue(rset.getString(6));
                                       row.getCell(var48).setCellStyle(styleForCellsWithCenterAlg);
                                       ++var48;
                                       row.createCell(var48).setCellValue(rset.getString(7));
                                       row.getCell(var48).setCellStyle(styleForCellsWithCenterAlg);
                                       ++var48;
                                       row.createCell(var48).setCellValue(rset.getString(8));
                                       row.getCell(var48).setCellStyle(styleForCellsWithCenterAlg);
                                       var50 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                                       var51 = "";

                                       for(allCompetitiveGroupsForCurAbit = 0; allCompetitiveGroupsForCurAbit < (var50 == null?0:var50.length); ++allCompetitiveGroupsForCurAbit) {
                                          var51 = var51 + var50[allCompetitiveGroupsForCurAbit][0] + ";\n";
                                       }

                                       ++var48;
                                       row.createCell(var48).setCellValue(var51);
                                       row.getCell(var48).setCellStyle(styleForCells);
                                    } else {
                                       row.createCell(0).setCellValue((double)(var42++));
                                       row.getCell(0).setCellStyle(styleForCellsWithCenterAlg);
                                       row.createCell(1).setCellValue((double)rset.getInt(1));
                                       row.getCell(1).setCellStyle(styleForCellsWithCenterAlg);
                                       row.createCell(2).setCellValue(rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4));
                                       row.getCell(2).setCellStyle(styleForCells);
                                       row.createCell(3).setCellValue((double)rset.getInt(5));
                                       row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
                                       var49 = ModelDBConnection.getAllEntranceTestsResultsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                                       var47 = 4;
                                       indAchSum = 0;

                                       while(indAchSum < allEntranceTestNames.length) {
                                          allAchivmentsForCurAbit = 0;

                                          while(true) {
                                             if(allAchivmentsForCurAbit < var49.length) {
                                                if(!allEntranceTestNames[indAchSum][1].equals(var49[allAchivmentsForCurAbit][0])) {
                                                   ++allAchivmentsForCurAbit;
                                                   continue;
                                                }

                                                row.createCell(var47 + indAchSum).setCellValue(var49[allAchivmentsForCurAbit][4]);
                                                row.getCell(var47 + indAchSum).setCellStyle(styleForCellsWithCenterAlg);
                                             }

                                             ++indAchSum;
                                             break;
                                          }
                                       }

                                       var48 = var47 + allEntranceTestNames.length;
                                       var50 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), true);
                                       allAchivmentsForCurAbit = 0;
                                       if(moduleType.equals("аспирантура")) {
                                          for(abitAllCompetitiveGroups = 0; abitAllCompetitiveGroups < (var50 == null?0:var50.length); ++abitAllCompetitiveGroups) {
                                             allAchivmentsForCurAbit += Integer.valueOf(var50[abitAllCompetitiveGroups][2]).intValue();
                                          }
                                       } else {
                                          abitAllCompetitiveGroups = 0;
                                          allCompetitiveGroupsForCurAbit = 0;

                                          for(curCompGroupNum = 0; curCompGroupNum < (var50 == null?0:var50.length); ++curCompGroupNum) {
                                             if(Integer.valueOf(var50[curCompGroupNum][1]).intValue() <= 11) {
                                                abitAllCompetitiveGroups += Integer.valueOf(var50[curCompGroupNum][2]).intValue();
                                             } else {
                                                allCompetitiveGroupsForCurAbit += Integer.valueOf(var50[curCompGroupNum][2]).intValue();
                                             }
                                          }

                                          allAchivmentsForCurAbit = abitAllCompetitiveGroups + (allCompetitiveGroupsForCurAbit > 5?5:allCompetitiveGroupsForCurAbit);
                                          //allAchivmentsForCurAbit = allAchivmentsForCurAbit > 100?100:allAchivmentsForCurAbit;
                                       }

                                       row.createCell(var48).setCellValue((double)allAchivmentsForCurAbit);
                                       row.getCell(var48).setCellStyle(styleForCellsWithCenterAlg);
                                       ++var48;
                                       row.createCell(var48).setCellValue(rset.getString(9));
                                       row.getCell(var48).setCellStyle(styleForCellsWithCenterAlg);
                                       ++var48;
                                       row.createCell(var48).setCellValue(rset.getString(6));
                                       row.getCell(var48).setCellStyle(styleForCellsWithCenterAlg);
                                       ++var48;
                                       row.createCell(var48).setCellValue(rset.getString(10));
                                       row.getCell(var48).setCellStyle(styleForCellsWithCenterAlg);
                                       ++var48;
                                       row.createCell(var48).setCellValue(rset.getString(7));
                                       row.getCell(var48).setCellStyle(styleForCellsWithCenterAlg);
                                       var50 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                                       var51 = "";

                                       for(allCompetitiveGroupsForCurAbit = 0; allCompetitiveGroupsForCurAbit < (var50 == null?0:var50.length); ++allCompetitiveGroupsForCurAbit) {
                                          var51 = var51 + var50[allCompetitiveGroupsForCurAbit][0] + ";\n";
                                       }

                                       ++var48;
                                       row.createCell(var48).setCellValue(var51);
                                       row.getCell(var48).setCellStyle(styleForCells);
                                       String[][] var52 = ModelDBConnection.getAllCompetitiveGroupsByAbiturientId(String.valueOf(rset.getInt(1)));
                                       String var53 = "";

                                       for(int curCompGroupNum1 = 0; curCompGroupNum1 < (var52 == null?0:var52.length); ++curCompGroupNum1) {
                                          var53 = var53 + var52[curCompGroupNum1][13] + "(" + var52[curCompGroupNum1][14] + ");\n";
                                       }

                                       ++var48;
                                       row.createCell(var48).setCellValue(var53);
                                       row.getCell(var48).setCellStyle(styleForCells);
                                    }
                                 }
                              }

                              rset.close();
                           
                        }
                     }

                  }
                  // платники и иностранцы
               } 
               else {
                  query = moduleType.equals("аспирантура")?"select aid, SName, Fname, isNULL(MName,\'\'), competitiveBall, case when originalsReceivedDate is not null then \'+\' else \'-\' end, Speciality.name, case when returnDate is not null then \'+\' else \'-\' end, EducationForm.name, (select sum(isNULL(score, 0)) from AbiturientEntranceTests where AbiturientCompetitiveGroup.aid_abiturient = AbiturientEntranceTests.aid_abiturient) as entranceTestsSum from (Speciality join AbiturientCompetitiveGroup on (AbiturientCompetitiveGroup.speciality = Speciality.id) join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid) join EducationForm on (AbiturientCompetitiveGroup.educationForm = EducationForm.id)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where course = \'" + specialities[path][0] + "\' and competitiveGroup = \'" + competitiveGroups[cg_i][0] + "\' and targetOrganisation is null " + (forInternalNeeds?"":"and AbiturientCompetitiveGroup.markEnrollment > -1 ") + "order by competitiveBall desc, entranceTestsSum desc":"select aid, SName, Fname, isNULL(MName,\'\'), competitiveBall, case when originalsReceivedDate is not null then \'+\' else \'-\' end, case when returnDate is not null then \'+\' else \'-\' end, EducationStandard.name, (select sum(isNULL(score, 0)) from AbiturientEntranceTests where AbiturientCompetitiveGroup.aid_abiturient = AbiturientEntranceTests.aid_abiturient) as entranceTestsSum, (select isNull(avgBall, 0) from AbiturientHigherEducation where AbiturientCompetitiveGroup.aid_abiturient = AbiturientHigherEducation.aid_abiturient) as avgDiplomaBall, Chair.name from (Chair join AbiturientCompetitiveGroup on (AbiturientCompetitiveGroup.chair = Chair.id) join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid) join EducationStandard on (AbiturientCompetitiveGroup.educationStandard = EducationStandard.id)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where speciality = \'" + specialities[path][0] + "\' and competitiveGroup = \'" + competitiveGroups[cg_i][0] + "\' and targetOrganisation is null " + (forInternalNeeds?"":"and AbiturientCompetitiveGroup.markEnrollment > -1 ") + "order by competitiveBall desc, entranceTestsSum desc, avgDiplomaBall desc";
                  cstmt = con.prepareCall(query, 1004, 1007);
                  rset = cstmt.executeQuery();
                  countAbitsOnCurSpecOnCurCompGr = rset.last()?rset.getRow():0;
                  rset.close();
                  if(countAbitsOnCurSpecOnCurCompGr > 0 && (competitiveGroups[cg_i][0].equals("3") || !wasWritten && competitiveGroups[cg_i][0].equals("4"))) {
                     row = sheet.createRow(rowNum++);
                     row = sheet.createRow(rowNum++);
                     row.createCell(1).setCellValue("МЕСТА ПО ДОГОВОРАМ ОБ ОКАЗАНИИ ПЛАТНЫХ УСЛУГ");
                     sheet.addMergedRegion(new CellRangeAddress(rowNum - 1, rowNum - 1, 1, 9));
                     row.getCell(1).setCellStyle(styleForCategories);
                     wasWritten = true;
                  }

                  for(es_i = 0; es_i < educationStandarts.length; ++es_i) {
                     query = moduleType.equals("аспирантура")?"select aid, SName, Fname, isNULL(MName,\'\'), competitiveBall, case when originalsReceivedDate is not null then \'+\' else \'-\' end, Speciality.name, case when returnDate is not null then \'+\' else \'-\' end, EducationForm.name, (select sum(isNULL(score, 0)) from AbiturientEntranceTests where AbiturientCompetitiveGroup.aid_abiturient = AbiturientEntranceTests.aid_abiturient) as entranceTestsSum from (Speciality join AbiturientCompetitiveGroup on (AbiturientCompetitiveGroup.speciality = Speciality.id) join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid) join EducationForm on (AbiturientCompetitiveGroup.educationForm = EducationForm.id)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where course = \'" + specialities[path][0] + "\' and competitiveGroup = \'" + competitiveGroups[cg_i][0] + "\' and educationForm = \'" + educationStandarts[es_i][0] + "\' and targetOrganisation is null " + (forInternalNeeds?"":"and AbiturientCompetitiveGroup.markEnrollment > -1 ") + "order by competitiveBall desc, entranceTestsSum desc":"select aid, SName, Fname, isNULL(MName,\'\'), competitiveBall, case when originalsReceivedDate is not null then \'+\' else \'-\' end, case when returnDate is not null then \'+\' else \'-\' end, EducationStandard.name, (select sum(isNULL(score, 0)) from AbiturientEntranceTests where AbiturientCompetitiveGroup.aid_abiturient = AbiturientEntranceTests.aid_abiturient) as entranceTestsSum, (select isNull(avgBall, 0) from AbiturientHigherEducation where AbiturientCompetitiveGroup.aid_abiturient = AbiturientHigherEducation.aid_abiturient) as avgDiplomaBall, Chair.name from (Chair join AbiturientCompetitiveGroup on (AbiturientCompetitiveGroup.chair = Chair.id) join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid) join EducationStandard on (AbiturientCompetitiveGroup.educationStandard = EducationStandard.id)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where speciality = \'" + specialities[path][0] + "\' and competitiveGroup = \'" + competitiveGroups[cg_i][0] + "\' and targetOrganisation is null " + (forInternalNeeds?"":"and AbiturientCompetitiveGroup.markEnrollment > -1 ") + "order by competitiveBall desc, entranceTestsSum desc, avgDiplomaBall desc";
                     cstmt = con.prepareCall(query, 1004, 1007);
                     rset = cstmt.executeQuery();
                     countAbitsOnCurSpecOnCurCompGrAndSt = rset.last()?rset.getRow():0;
                     rset.beforeFirst();
                     if(countAbitsOnCurSpecOnCurCompGrAndSt > 0) {
                        var42 = 1;
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
                        var45 = false;
                        if(moduleType.equals("аспирантура")) {
                           row.createCell(0).setCellValue("№п/п");
                           row.getCell(0).setCellStyle(styleForNames);
                           row.createCell(1).setCellValue("№ЛД");
                           row.getCell(1).setCellStyle(styleForNames);
                           row.createCell(2).setCellValue("ФИО");
                           row.getCell(2).setCellStyle(styleForNames);
                           row.createCell(3).setCellValue("Конкурсный балл");
                           row.getCell(3).setCellStyle(styleForNames);
                           var46 = 4;

                           for(var48 = 0; var48 < allEntranceTestNames.length; ++var48) {
                              row.createCell(var46 + var48).setCellValue(allEntranceTestNames[var48][1]);
                              row.getCell(var46 + var48).setCellStyle(styleForNames);
                           }

                           curCellNum = var46 + allEntranceTestNames.length;
                           row.createCell(curCellNum).setCellValue("Балл за ИД");
                           row.getCell(curCellNum).setCellStyle(styleForNames);
                           ++curCellNum;
                           row.createCell(curCellNum).setCellValue("Наличие оригинала/согласия на зачисление");
                           row.getCell(curCellNum).setCellStyle(styleForNames);
                           ++curCellNum;
                           row.createCell(curCellNum).setCellValue("Специальность");
                           row.getCell(curCellNum).setCellStyle(styleForNames);
                           ++curCellNum;
                           row.createCell(curCellNum).setCellValue("Забрал документы");
                           row.getCell(curCellNum).setCellStyle(styleForNames);
                           ++curCellNum;
                           row.createCell(curCellNum).setCellValue("Список ИД");
                           row.getCell(curCellNum).setCellStyle(styleForNames);
                           ++curCellNum;
                        } else {
                           row.createCell(0).setCellValue("№п/п");
                           row.getCell(0).setCellStyle(styleForNames);
                           row.createCell(1).setCellValue("№ЛД");
                           row.getCell(1).setCellStyle(styleForNames);
                           row.createCell(2).setCellValue("ФИО");
                           row.getCell(2).setCellStyle(styleForNames);
                           row.createCell(3).setCellValue("Конкурсный балл");
                           row.getCell(3).setCellStyle(styleForNames);
                           var46 = 4;

                           for(var48 = 0; var48 < allEntranceTestNames.length; ++var48) {
                              row.createCell(var46 + var48).setCellValue(allEntranceTestNames[var48][1]);
                              row.getCell(var46 + var48).setCellStyle(styleForNames);
                           }

                           curCellNum = var46 + allEntranceTestNames.length;
                           row.createCell(curCellNum).setCellValue("Балл за ИД");
                           row.getCell(curCellNum).setCellStyle(styleForNames);
                           ++curCellNum;
                           row.createCell(curCellNum).setCellValue("Средний балл по диплому");
                           row.getCell(curCellNum).setCellStyle(styleForNames);
                           ++curCellNum;
                           row.createCell(curCellNum).setCellValue("Наличие оригинала/согласия на зачисление");
                           row.getCell(curCellNum).setCellStyle(styleForNames);
                           ++curCellNum;
                           row.createCell(curCellNum).setCellValue("Кафедра");
                           row.getCell(curCellNum).setCellStyle(styleForNames);
                           ++curCellNum;
                           row.createCell(curCellNum).setCellValue("Забрал документы");
                           row.getCell(curCellNum).setCellStyle(styleForNames);
                           ++curCellNum;
                           row.createCell(curCellNum).setCellValue("Список ИД");
                           row.getCell(curCellNum).setCellStyle(styleForNames);
                           ++curCellNum;
                           row.createCell(curCellNum).setCellValue("Приоритеты");
                           row.getCell(curCellNum).setCellStyle(styleForNames);
                           ++curCellNum;
                        }

                        while(rset.next()) {
                           row = sheet.createRow(rowNum++);
                           if(moduleType.equals("аспирантура")) {
                              row.createCell(0).setCellValue((double)(var42++));
                              row.getCell(0).setCellStyle(styleForCellsWithCenterAlg);
                              row.createCell(1).setCellValue((double)rset.getInt(1));
                              row.getCell(1).setCellStyle(styleForCellsWithCenterAlg);
                              row.createCell(2).setCellValue(rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4));
                              row.getCell(2).setCellStyle(styleForCells);
                              row.createCell(3).setCellValue((double)rset.getInt(5));
                              row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
                              var57 = ModelDBConnection.getAllEntranceTestsResultsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                              var46 = 4;
                              abitAllIndAchivments = 0;

                              while(abitAllIndAchivments < allEntranceTestNames.length) {
                                 indAchSum = 0;

                                 while(true) {
                                    if(indAchSum < var57.length) {
                                       if(!allEntranceTestNames[abitAllIndAchivments][1].equals(var57[indAchSum][0])) {
                                          ++indAchSum;
                                          continue;
                                       }

                                       row.createCell(var46 + abitAllIndAchivments).setCellValue(var57[indAchSum][4]);
                                       row.getCell(var46 + abitAllIndAchivments).setCellStyle(styleForCellsWithCenterAlg);
                                    }

                                    ++abitAllIndAchivments;
                                    break;
                                 }
                              }

                              curCellNum = var46 + allEntranceTestNames.length;
                              var49 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), true);
                              indAchSum = 0;
                              if(moduleType.equals("аспирантура")) {
                                 for(allAchivmentsForCurAbit = 0; allAchivmentsForCurAbit < (var49 == null?0:var49.length); ++allAchivmentsForCurAbit) {
                                    indAchSum += Integer.valueOf(var49[allAchivmentsForCurAbit][2]).intValue();
                                 }
                              } else {
                                 allAchivmentsForCurAbit = 0;
                                 abitAllCompetitiveGroups = 0;

                                 for(allCompetitiveGroupsForCurAbit = 0; allCompetitiveGroupsForCurAbit < (var49 == null?0:var49.length); ++allCompetitiveGroupsForCurAbit) {
                                    if(Integer.valueOf(var49[allCompetitiveGroupsForCurAbit][1]).intValue() <= 11) {
                                       allAchivmentsForCurAbit += Integer.valueOf(var49[allCompetitiveGroupsForCurAbit][2]).intValue();
                                    } else {
                                       abitAllCompetitiveGroups += Integer.valueOf(var49[allCompetitiveGroupsForCurAbit][2]).intValue();
                                    }
                                 }

                                 indAchSum = allAchivmentsForCurAbit + (abitAllCompetitiveGroups > 5?5:abitAllCompetitiveGroups);
                                 //indAchSum = indAchSum > 100?100:indAchSum;
                              }

                              row.createCell(curCellNum).setCellValue((double)indAchSum);
                              row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue(rset.getString(6));
                              row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue(rset.getString(7));
                              row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue(rset.getString(8));
                              row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                              var49 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                              var55 = "";

                              for(abitAllCompetitiveGroups = 0; abitAllCompetitiveGroups < (var49 == null?0:var49.length); ++abitAllCompetitiveGroups) {
                                 var55 = var55 + var49[abitAllCompetitiveGroups][0] + ";\n";
                              }

                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue(var55);
                              row.getCell(curCellNum).setCellStyle(styleForCells);
                           } else {
                              row.createCell(0).setCellValue((double)(var42++));
                              row.getCell(0).setCellStyle(styleForCellsWithCenterAlg);
                              row.createCell(1).setCellValue((double)rset.getInt(1));
                              row.getCell(1).setCellStyle(styleForCellsWithCenterAlg);
                              row.createCell(2).setCellValue(rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4));
                              row.getCell(2).setCellStyle(styleForCells);
                              row.createCell(3).setCellValue((double)rset.getInt(5));
                              row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
                              var57 = ModelDBConnection.getAllEntranceTestsResultsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                              var46 = 4;
                              abitAllIndAchivments = 0;

                              while(abitAllIndAchivments < allEntranceTestNames.length) {
                                 indAchSum = 0;

                                 while(true) {
                                    if(indAchSum < var57.length) {
                                       if(!allEntranceTestNames[abitAllIndAchivments][1].equals(var57[indAchSum][0])) {
                                          ++indAchSum;
                                          continue;
                                       }

                                       row.createCell(var46 + abitAllIndAchivments).setCellValue(var57[indAchSum][4]);
                                       row.getCell(var46 + abitAllIndAchivments).setCellStyle(styleForCellsWithCenterAlg);
                                    }

                                    ++abitAllIndAchivments;
                                    break;
                                 }
                              }

                              curCellNum = var46 + allEntranceTestNames.length;
                              var49 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), true);
                              indAchSum = 0;
                              if(moduleType.equals("аспирантура")) {
                                 for(allAchivmentsForCurAbit = 0; allAchivmentsForCurAbit < (var49 == null?0:var49.length); ++allAchivmentsForCurAbit) {
                                    indAchSum += Integer.valueOf(var49[allAchivmentsForCurAbit][2]).intValue();
                                 }
                              } else {
                                 allAchivmentsForCurAbit = 0;
                                 abitAllCompetitiveGroups = 0;

                                 for(allCompetitiveGroupsForCurAbit = 0; allCompetitiveGroupsForCurAbit < (var49 == null?0:var49.length); ++allCompetitiveGroupsForCurAbit) {
                                    if(Integer.valueOf(var49[allCompetitiveGroupsForCurAbit][1]).intValue() <= 11) {
                                       allAchivmentsForCurAbit += Integer.valueOf(var49[allCompetitiveGroupsForCurAbit][2]).intValue();
                                    } else {
                                       abitAllCompetitiveGroups += Integer.valueOf(var49[allCompetitiveGroupsForCurAbit][2]).intValue();
                                    }
                                 }

                                 indAchSum = allAchivmentsForCurAbit + (abitAllCompetitiveGroups > 5?5:abitAllCompetitiveGroups);
                                 //indAchSum = indAchSum > 100?100:indAchSum;
                              }

                              row.createCell(curCellNum).setCellValue((double)indAchSum);
                              row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue(rset.getString(10));
                              row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue(rset.getString(6));
                              row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue(rset.getString(11));
                              row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue(rset.getString(7));
                              row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                              var49 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                              var55 = "";

                              for(abitAllCompetitiveGroups = 0; abitAllCompetitiveGroups < (var49 == null?0:var49.length); ++abitAllCompetitiveGroups) {
                                 var55 = var55 + var49[abitAllCompetitiveGroups][0] + ";\n";
                              }

                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue(var55);
                              row.getCell(curCellNum).setCellStyle(styleForCells);
                              var56 = ModelDBConnection.getAllCompetitiveGroupsByAbiturientId(String.valueOf(rset.getInt(1)));
                              var54 = "";

                              for(curCompGroupNum = 0; curCompGroupNum < (var56 == null?0:var56.length); ++curCompGroupNum) {
                                 var54 = var54 + var56[curCompGroupNum][13] + "(" + var56[curCompGroupNum][14] + ");\n";
                              }

                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue(var54);
                              row.getCell(curCellNum).setCellStyle(styleForCells);
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

      String var43 = currentPath + "\\files\\" + "Конкурсный_список_" + moduleType + "_" + (new SimpleDateFormat("dd.MM.yyyy")).format(new Date()) + ".xls";
      File var44 = new File(var43);
      if(var44.exists()) {
         var44.delete();
      }

      var44.createNewFile();
      workbook.write(new FileOutputStream(var44));
      Desktop.getDesktop().open(var44);
   }

   public static void outputCompetitionResultsForOrder(boolean vinitPadeg) throws Exception {
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      Connection con = ModelDBConnection.getConnection();
      ResultSet rset = null;
      CallableStatement cstmt = null;
      XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(currentPath + "\\Dots\\Конкурсный_список_" + moduleType + ".xltx"));
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
      styleForCells.setWrapText(true);
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
      String[][] specialities = moduleType.equals("аспирантура")?ModelDBConnection.getAllFromTable("Course"):ModelDBConnection.getAllFromTable("Speciality");
      String[][] targetOrganisations = ModelDBConnection.getAllFromTable("TargetOrganisation");
      String[][] educationStandarts = moduleType.equals("аспирантура")?ModelDBConnection.getAllFromTable("EducationForm"):ModelDBConnection.getAllFromTable("EducationStandard");
      String[][] competitiveGroups = ModelDBConnection.getAllFromTableOrderedById("CompetitiveGroup");
      String[][] allEntranceTestNames = ModelDBConnection.getAllFromTableOrderedById("EntranceTest");

      for(int path = 0; path < specialities.length; ++path) {
         boolean wasWritten = false;
         String query = moduleType.equals("аспирантура")?"select * from AbiturientCompetitiveGroup where course = \'" + specialities[path][0] + "\' and AbiturientCompetitiveGroup.markEnrollment > 0 ":"select * from AbiturientCompetitiveGroup where speciality = \'" + specialities[path][0] + "\' and AbiturientCompetitiveGroup.markEnrollment > 0 ";
         cstmt = con.prepareCall(query, 1004, 1007);
         rset = cstmt.executeQuery();
         int file = rset.last()?rset.getRow():0;
         rset.close();
         if(file > 0) {
            XSSFRow row = sheet.createRow(rowNum++);
            row = sheet.createRow(rowNum++);
            row.createCell(1).setCellValue((moduleType.equals("аспирантура")?"Направление: ":"Специальность: ") + specialities[path][1]);
            sheet.addMergedRegion(new CellRangeAddress(rowNum - 1, rowNum - 1, 1, 9));
            row.getCell(1).setCellStyle(styleForSpecialities);

            for(int cg_i = 0; cg_i < competitiveGroups.length; ++cg_i) {
               int countAbitsOnCurSpecOnCurCompGr;
               int es_i;
               int countAbitsOnCurSpecOnCurCompGrAndSt;
               int curCellNum;
               int abitAllIndAchivments;
               int indAchSum;
               int baseAchSum;
               int additionalAchSum;
               int curIndAchNum;
               int var41;
               boolean var44;
               byte var45;
               int var47;
               String[][] var48;
               String[][] var50;
               if(competitiveGroups[cg_i][0].equals("1")) {
                  query = moduleType.equals("аспирантура")?"select * from AbiturientCompetitiveGroup where course = \'" + specialities[path][0] + "\' and competitiveGroup in (1,2) and AbiturientCompetitiveGroup.markEnrollment > 0 ":"select * from AbiturientCompetitiveGroup where speciality = \'" + specialities[path][0] + "\' and competitiveGroup in (1,2) and AbiturientCompetitiveGroup.markEnrollment > 0 ";
                  cstmt = con.prepareCall(query, 1004, 1007);
                  rset = cstmt.executeQuery();
                  countAbitsOnCurSpecOnCurCompGr = rset.last()?rset.getRow():0;
                  rset.close();
                  if(countAbitsOnCurSpecOnCurCompGr > 0) {
                     row = sheet.createRow(rowNum++);
                     row.createCell(1).setCellValue("МЕСТА В РАМКАХ КЦП");
                     sheet.addMergedRegion(new CellRangeAddress(rowNum - 1, rowNum - 1, 1, 9));
                     row.getCell(1).setCellStyle(styleForCategories);
                  }

                  query = moduleType.equals("аспирантура")?"select * from AbiturientCompetitiveGroup where course = \'" + specialities[path][0] + "\' and targetOrganisation is not null and AbiturientCompetitiveGroup.markEnrollment > 0 ":"select * from AbiturientCompetitiveGroup where speciality = \'" + specialities[path][0] + "\' and targetOrganisation is not null and AbiturientCompetitiveGroup.markEnrollment > 0 ";
                  cstmt = con.prepareCall(query, 1004, 1007);
                  rset = cstmt.executeQuery();
                  es_i = rset.last()?rset.getRow():0;
                  rset.close();
                  if(es_i > 0) {
                     row = sheet.createRow(rowNum++);
                     row.createCell(1).setCellValue("места по целевому приему");
                     row.getCell(1).setCellStyle(styleForTargetOrgs);
                     if(!moduleType.equals("аспирантура")) {
                        var41 = 1;
                        query = "select aid, SName, Fname, isNULL(MName,\'\'), competitiveBall, case when originalsReceivedDate is not null then \'+\' else \'-\' end, case when returnDate is not null then \'+\' else \'-\' end, (select sum(isNULL(score, 0)) from AbiturientEntranceTests where AbiturientCompetitiveGroup.aid_abiturient = AbiturientEntranceTests.aid_abiturient) as entranceTestsSum, (select isNull(avgBall, 0) from AbiturientHigherEducation where AbiturientCompetitiveGroup.aid_abiturient = AbiturientHigherEducation.aid_abiturient) as avgDiplomaBall, Chair.name, TargetOrganisation.name from (Chair join AbiturientCompetitiveGroup on (AbiturientCompetitiveGroup.chair = Chair.id) join TargetOrganisation on (AbiturientCompetitiveGroup.targetOrganisation = TargetOrganisation.id) join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where speciality = \'" + specialities[path][0] + "\' and targetOrganisation is not null " + "and AbiturientCompetitiveGroup.markEnrollment > 0 " + "order by competitiveBall desc, entranceTestsSum desc, avgDiplomaBall desc";
                        cstmt = con.prepareCall(query, 1004, 1007);
                        rset = cstmt.executeQuery();
                        countAbitsOnCurSpecOnCurCompGrAndSt = rset.last()?rset.getRow():0;
                        rset.beforeFirst();
                        if(countAbitsOnCurSpecOnCurCompGrAndSt > 0) {
                           row = sheet.createRow(rowNum++);
                           row = sheet.createRow(rowNum++);
                           var44 = false;
                           if(moduleType.equals("аспирантура")) {
                              row.createCell(0).setCellValue("№п/п");
                              row.getCell(0).setCellStyle(styleForNames);
                              row.createCell(1).setCellValue("№ЛД");
                              row.getCell(1).setCellStyle(styleForNames);
                              row.createCell(2).setCellValue("ФИО");
                              row.getCell(2).setCellStyle(styleForNames);
                              row.createCell(3).setCellValue("Конкурсный балл");
                              row.getCell(3).setCellStyle(styleForNames);
                              var45 = 4;

                              for(var47 = 0; var47 < allEntranceTestNames.length; ++var47) {
                                 row.createCell(var45 + var47).setCellValue(allEntranceTestNames[var47][1]);
                                 row.getCell(var45 + var47).setCellStyle(styleForNames);
                              }

                              curCellNum = var45 + allEntranceTestNames.length;
                              row.createCell(curCellNum).setCellValue("Балл за ИД");
                              row.getCell(curCellNum).setCellStyle(styleForNames);
                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue("Наличие оригинала/согласия на зачисление");
                              row.getCell(curCellNum).setCellStyle(styleForNames);
                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue("Специальность");
                              row.getCell(curCellNum).setCellStyle(styleForNames);
                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue("Забрал документы");
                              row.getCell(curCellNum).setCellStyle(styleForNames);
                              ++curCellNum;
                           } else {
                              row.createCell(0).setCellValue("№п/п");
                              row.getCell(0).setCellStyle(styleForNames);
                              row.createCell(1).setCellValue("№ЛД");
                              row.getCell(1).setCellStyle(styleForNames);
                              row.createCell(2).setCellValue("ФИО");
                              row.getCell(2).setCellStyle(styleForNames);
                              row.createCell(3).setCellValue("Конкурсный балл");
                              row.getCell(3).setCellStyle(styleForNames);
                              var45 = 4;

                              for(var47 = 0; var47 < allEntranceTestNames.length; ++var47) {
                                 row.createCell(var45 + var47).setCellValue(allEntranceTestNames[var47][1]);
                                 row.getCell(var45 + var47).setCellStyle(styleForNames);
                              }

                              curCellNum = var45 + allEntranceTestNames.length;
                              row.createCell(curCellNum).setCellValue("Балл за ИД");
                              row.getCell(curCellNum).setCellStyle(styleForNames);
                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue("Средний балл по диплому");
                              row.getCell(curCellNum).setCellStyle(styleForNames);
                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue("Наличие оригинала/согласия на зачисление");
                              row.getCell(curCellNum).setCellStyle(styleForNames);
                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue("Кафедра");
                              row.getCell(curCellNum).setCellStyle(styleForNames);
                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue("Забрал документы");
                              row.getCell(curCellNum).setCellStyle(styleForNames);
                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue("Целевая организация");
                              row.getCell(curCellNum).setCellStyle(styleForNames);
                              ++curCellNum;
                           }

                           while(rset.next()) {
                              row = sheet.createRow(rowNum++);
                              if(moduleType.equals("аспирантура")) {
                                 row.createCell(0).setCellValue((double)(var41++));
                                 row.getCell(0).setCellStyle(styleForCellsWithCenterAlg);
                                 row.createCell(1).setCellValue((double)rset.getInt(1));
                                 row.getCell(1).setCellStyle(styleForCellsWithCenterAlg);
                                 row.createCell(2).setCellValue(vinitPadeg?Padeg.getFIOPadegFSAS(rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4), 4):rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4));
                                 row.getCell(2).setCellStyle(styleForCells);
                                 row.createCell(3).setCellValue((double)rset.getInt(5));
                                 row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
                                 var50 = ModelDBConnection.getAllEntranceTestsResultsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                                 var45 = 4;

                                 for(abitAllIndAchivments = 0; abitAllIndAchivments < allEntranceTestNames.length; ++abitAllIndAchivments) {
                                    for(indAchSum = 0; indAchSum < var50.length; ++indAchSum) {
                                       if(allEntranceTestNames[abitAllIndAchivments][1].equals(var50[indAchSum][0])) {
                                          row.createCell(var45 + abitAllIndAchivments).setCellValue(var50[indAchSum][4]);
                                          row.getCell(var45 + abitAllIndAchivments).setCellStyle(styleForCellsWithCenterAlg);
                                          break;
                                       }
                                    }
                                 }

                                 curCellNum = var45 + allEntranceTestNames.length;
                                 var48 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), true);
                                 indAchSum = 0;
                                 if(moduleType.equals("аспирантура")) {
                                    for(baseAchSum = 0; baseAchSum < (var48 == null?0:var48.length); ++baseAchSum) {
                                       indAchSum += Integer.valueOf(var48[baseAchSum][2]).intValue();
                                    }
                                 } else {
                                    baseAchSum = 0;
                                    additionalAchSum = 0;

                                    for(curIndAchNum = 0; curIndAchNum < (var48 == null?0:var48.length); ++curIndAchNum) {
                                       if(Integer.valueOf(var48[curIndAchNum][1]).intValue() <= 5) {
                                          baseAchSum += Integer.valueOf(var48[curIndAchNum][2]).intValue();
                                       } else {
                                          additionalAchSum += Integer.valueOf(var48[curIndAchNum][2]).intValue();
                                       }
                                    }

                                    indAchSum = baseAchSum + (additionalAchSum > 15?15:additionalAchSum);
                                    indAchSum = indAchSum > 100?100:indAchSum;
                                 }

                                 row.createCell(curCellNum).setCellValue((double)indAchSum);
                                 row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                 ++curCellNum;
                                 row.createCell(curCellNum).setCellValue(rset.getString(6));
                                 row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                 ++curCellNum;
                                 row.createCell(curCellNum).setCellValue(rset.getString(7));
                                 row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                 ++curCellNum;
                                 row.createCell(curCellNum).setCellValue(rset.getString(8));
                                 row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                              } else {
                                 row.createCell(0).setCellValue((double)(var41++));
                                 row.getCell(0).setCellStyle(styleForCellsWithCenterAlg);
                                 row.createCell(1).setCellValue((double)rset.getInt(1));
                                 row.getCell(1).setCellStyle(styleForCellsWithCenterAlg);
                                 row.createCell(2).setCellValue(vinitPadeg?Padeg.getFIOPadegFSAS(rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4), 4):rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4));
                                 row.getCell(2).setCellStyle(styleForCells);
                                 row.createCell(3).setCellValue((double)rset.getInt(5));
                                 row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
                                 var50 = ModelDBConnection.getAllEntranceTestsResultsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                                 var45 = 4;
                                 abitAllIndAchivments = 0;

                                 while(abitAllIndAchivments < allEntranceTestNames.length) {
                                    indAchSum = 0;

                                    while(true) {
                                       if(indAchSum < var50.length) {
                                          if(!allEntranceTestNames[abitAllIndAchivments][1].equals(var50[indAchSum][0])) {
                                             ++indAchSum;
                                             continue;
                                          }

                                          row.createCell(var45 + abitAllIndAchivments).setCellValue(var50[indAchSum][4]);
                                          row.getCell(var45 + abitAllIndAchivments).setCellStyle(styleForCellsWithCenterAlg);
                                       }

                                       ++abitAllIndAchivments;
                                       break;
                                    }
                                 }

                                 curCellNum = var45 + allEntranceTestNames.length;
                                 var48 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), true);
                                 indAchSum = 0;
                                 if(moduleType.equals("аспирантура")) {
                                    for(baseAchSum = 0; baseAchSum < (var48 == null?0:var48.length); ++baseAchSum) {
                                       indAchSum += Integer.valueOf(var48[baseAchSum][2]).intValue();
                                    }
                                 } else {
                                    baseAchSum = 0;
                                    additionalAchSum = 0;

                                    for(curIndAchNum = 0; curIndAchNum < (var48 == null?0:var48.length); ++curIndAchNum) {
                                       if(Integer.valueOf(var48[curIndAchNum][1]).intValue() <= 5) {
                                          baseAchSum += Integer.valueOf(var48[curIndAchNum][2]).intValue();
                                       } else {
                                          additionalAchSum += Integer.valueOf(var48[curIndAchNum][2]).intValue();
                                       }
                                    }

                                    indAchSum = baseAchSum + (additionalAchSum > 15?15:additionalAchSum);
                                    indAchSum = indAchSum > 100?100:indAchSum;
                                 }

                                 row.createCell(curCellNum).setCellValue((double)indAchSum);
                                 row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                 ++curCellNum;
                                 row.createCell(curCellNum).setCellValue(rset.getString(9));
                                 row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                 ++curCellNum;
                                 row.createCell(curCellNum).setCellValue(rset.getString(6));
                                 row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                 ++curCellNum;
                                 row.createCell(curCellNum).setCellValue(rset.getString(10));
                                 row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                 ++curCellNum;
                                 row.createCell(curCellNum).setCellValue(rset.getString(7));
                                 row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                                 ++curCellNum;
                                 row.createCell(curCellNum).setCellValue(rset.getString(11));
                                 row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                              }
                           }
                        }

                        rset.close();
                     } else {
                        for(countAbitsOnCurSpecOnCurCompGrAndSt = 0; countAbitsOnCurSpecOnCurCompGrAndSt < targetOrganisations.length; ++countAbitsOnCurSpecOnCurCompGrAndSt) {
                           var41 = 1;
                           query = moduleType.equals("аспирантура")?"select aid, SName, Fname, isNULL(MName,\'\'), competitiveBall, case when originalsReceivedDate is not null then \'+\' else \'-\' end, Speciality.name, case when returnDate is not null then \'+\' else \'-\' end, (select sum(isNULL(score, 0)) from AbiturientEntranceTests where AbiturientCompetitiveGroup.aid_abiturient = AbiturientEntranceTests.aid_abiturient) as entranceTestsSum from (Speciality join AbiturientCompetitiveGroup on (AbiturientCompetitiveGroup.speciality = Speciality.id) join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where course = \'" + specialities[path][0] + "\' and targetOrganisation = \'" + targetOrganisations[countAbitsOnCurSpecOnCurCompGrAndSt][0] + "\' " + "and AbiturientCompetitiveGroup.markEnrollment > 0 " + "order by competitiveBall desc, entranceTestsSum desc":"select aid, SName, Fname, isNULL(MName,\'\'), competitiveBall, case when originalsReceivedDate is not null then \'+\' else \'-\' end, case when returnDate is not null then \'+\' else \'-\' end, (select sum(isNULL(score, 0)) from AbiturientEntranceTests where AbiturientCompetitiveGroup.aid_abiturient = AbiturientEntranceTests.aid_abiturient) as entranceTestsSum, (select isNull(avgBall, 0) from AbiturientHigherEducation where AbiturientCompetitiveGroup.aid_abiturient = AbiturientHigherEducation.aid_abiturient) as avgDiplomaBall, Chair.name from (Chair join AbiturientCompetitiveGroup on (AbiturientCompetitiveGroup.chair = Chair.id) join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where speciality = \'" + specialities[path][0] + "\' and targetOrganisation = \'" + targetOrganisations[countAbitsOnCurSpecOnCurCompGrAndSt][0] + "\' " + "and AbiturientCompetitiveGroup.markEnrollment > 0 " + "order by competitiveBall desc, entranceTestsSum desc, avgDiplomaBall desc";
                           cstmt = con.prepareCall(query, 1004, 1007);
                           rset = cstmt.executeQuery();
                           curCellNum = rset.last()?rset.getRow():0;
                           rset.beforeFirst();
                           if(curCellNum > 0) {
                              row = sheet.createRow(rowNum++);
                              row = sheet.createRow(rowNum++);
                              row.createCell(0).setCellValue("Целевая организация: " + targetOrganisations[countAbitsOnCurSpecOnCurCompGrAndSt][1]);
                              sheet.addMergedRegion(new CellRangeAddress(rowNum - 1, rowNum - 1, 0, 4));
                              row.getCell(0).setCellStyle(styleForTargetOrgs);
                              row = sheet.createRow(rowNum++);
                              boolean abitAllEntranceResults = false;
                              byte var46;
                              if(moduleType.equals("аспирантура")) {
                                 row.createCell(0).setCellValue("№п/п");
                                 row.getCell(0).setCellStyle(styleForNames);
                                 row.createCell(1).setCellValue("№ЛД");
                                 row.getCell(1).setCellStyle(styleForNames);
                                 row.createCell(2).setCellValue("ФИО");
                                 row.getCell(2).setCellStyle(styleForNames);
                                 row.createCell(3).setCellValue("Конкурсный балл");
                                 row.getCell(3).setCellStyle(styleForNames);
                                 var46 = 4;

                                 for(abitAllIndAchivments = 0; abitAllIndAchivments < allEntranceTestNames.length; ++abitAllIndAchivments) {
                                    row.createCell(var46 + abitAllIndAchivments).setCellValue(allEntranceTestNames[abitAllIndAchivments][1]);
                                    row.getCell(var46 + abitAllIndAchivments).setCellStyle(styleForNames);
                                 }

                                 var47 = var46 + allEntranceTestNames.length;
                                 row.createCell(var47).setCellValue("Балл за ИД");
                                 row.getCell(var47).setCellStyle(styleForNames);
                                 ++var47;
                                 row.createCell(var47).setCellValue("Наличие оригинала/согласия на зачисление");
                                 row.getCell(var47).setCellStyle(styleForNames);
                                 ++var47;
                                 row.createCell(var47).setCellValue("Специальность");
                                 row.getCell(var47).setCellStyle(styleForNames);
                                 ++var47;
                                 row.createCell(var47).setCellValue("Забрал документы");
                                 row.getCell(var47).setCellStyle(styleForNames);
                                 ++var47;
                              } else {
                                 row.createCell(0).setCellValue("№п/п");
                                 row.getCell(0).setCellStyle(styleForNames);
                                 row.createCell(1).setCellValue("№ЛД");
                                 row.getCell(1).setCellStyle(styleForNames);
                                 row.createCell(2).setCellValue("ФИО");
                                 row.getCell(2).setCellStyle(styleForNames);
                                 row.createCell(3).setCellValue("Конкурсный балл");
                                 row.getCell(3).setCellStyle(styleForNames);
                                 var46 = 4;

                                 for(abitAllIndAchivments = 0; abitAllIndAchivments < allEntranceTestNames.length; ++abitAllIndAchivments) {
                                    row.createCell(var46 + abitAllIndAchivments).setCellValue(allEntranceTestNames[abitAllIndAchivments][1]);
                                    row.getCell(var46 + abitAllIndAchivments).setCellStyle(styleForNames);
                                 }

                                 var47 = var46 + allEntranceTestNames.length;
                                 row.createCell(var47).setCellValue("Балл за ИД");
                                 row.getCell(var47).setCellStyle(styleForNames);
                                 ++var47;
                                 row.createCell(var47).setCellValue("Средний балл по диплому");
                                 row.getCell(var47).setCellStyle(styleForNames);
                                 ++var47;
                                 row.createCell(var47).setCellValue("Наличие оригинала/согласия на зачисление");
                                 row.getCell(var47).setCellStyle(styleForNames);
                                 ++var47;
                                 row.createCell(var47).setCellValue("Кафедра");
                                 row.getCell(var47).setCellStyle(styleForNames);
                                 ++var47;
                                 row.createCell(var47).setCellValue("Забрал документы");
                                 row.getCell(var47).setCellStyle(styleForNames);
                                 ++var47;
                              }

                              while(rset.next()) {
                                 row = sheet.createRow(rowNum++);
                                 int curIndAchNum1;
                                 String[][] var49;
                                 if(moduleType.equals("аспирантура")) {
                                    row.createCell(0).setCellValue((double)(var41++));
                                    row.getCell(0).setCellStyle(styleForCellsWithCenterAlg);
                                    row.createCell(1).setCellValue((double)rset.getInt(1));
                                    row.getCell(1).setCellStyle(styleForCellsWithCenterAlg);
                                    row.createCell(2).setCellValue(vinitPadeg?Padeg.getFIOPadegFSAS(rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4), 4):rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4));
                                    row.getCell(2).setCellStyle(styleForCells);
                                    row.createCell(3).setCellValue((double)rset.getInt(5));
                                    row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
                                    var48 = ModelDBConnection.getAllEntranceTestsResultsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                                    var46 = 4;

                                    for(indAchSum = 0; indAchSum < allEntranceTestNames.length; ++indAchSum) {
                                       for(baseAchSum = 0; baseAchSum < var48.length; ++baseAchSum) {
                                          if(allEntranceTestNames[indAchSum][1].equals(var48[baseAchSum][0])) {
                                             row.createCell(var46 + indAchSum).setCellValue(var48[baseAchSum][4]);
                                             row.getCell(var46 + indAchSum).setCellStyle(styleForCellsWithCenterAlg);
                                             break;
                                          }
                                       }
                                    }

                                    var47 = var46 + allEntranceTestNames.length;
                                    var49 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), true);
                                    baseAchSum = 0;
                                    if(moduleType.equals("аспирантура")) {
                                       for(additionalAchSum = 0; additionalAchSum < (var49 == null?0:var49.length); ++additionalAchSum) {
                                          baseAchSum += Integer.valueOf(var49[additionalAchSum][2]).intValue();
                                       }
                                    } else {
                                       additionalAchSum = 0;
                                       curIndAchNum = 0;

                                       for(curIndAchNum1 = 0; curIndAchNum1 < (var49 == null?0:var49.length); ++curIndAchNum1) {
                                          if(Integer.valueOf(var49[curIndAchNum1][1]).intValue() <= 5) {
                                             additionalAchSum += Integer.valueOf(var49[curIndAchNum1][2]).intValue();
                                          } else {
                                             curIndAchNum += Integer.valueOf(var49[curIndAchNum1][2]).intValue();
                                          }
                                       }

                                       baseAchSum = additionalAchSum + (curIndAchNum > 15?15:curIndAchNum);
                                       baseAchSum = baseAchSum > 100?100:baseAchSum;
                                    }

                                    row.createCell(var47).setCellValue((double)baseAchSum);
                                    row.getCell(var47).setCellStyle(styleForCellsWithCenterAlg);
                                    ++var47;
                                    row.createCell(var47).setCellValue(rset.getString(6));
                                    row.getCell(var47).setCellStyle(styleForCellsWithCenterAlg);
                                    ++var47;
                                    row.createCell(var47).setCellValue(rset.getString(7));
                                    row.getCell(var47).setCellStyle(styleForCellsWithCenterAlg);
                                    ++var47;
                                    row.createCell(var47).setCellValue(rset.getString(8));
                                    row.getCell(var47).setCellStyle(styleForCellsWithCenterAlg);
                                 } else {
                                    row.createCell(0).setCellValue((double)(var41++));
                                    row.getCell(0).setCellStyle(styleForCellsWithCenterAlg);
                                    row.createCell(1).setCellValue((double)rset.getInt(1));
                                    row.getCell(1).setCellStyle(styleForCellsWithCenterAlg);
                                    row.createCell(2).setCellValue(vinitPadeg?Padeg.getFIOPadegFSAS(rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4), 4):rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4));
                                    row.getCell(2).setCellStyle(styleForCells);
                                    row.createCell(3).setCellValue((double)rset.getInt(5));
                                    row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
                                    var48 = ModelDBConnection.getAllEntranceTestsResultsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                                    var46 = 4;
                                    indAchSum = 0;

                                    while(indAchSum < allEntranceTestNames.length) {
                                       baseAchSum = 0;

                                       while(true) {
                                          if(baseAchSum < var48.length) {
                                             if(!allEntranceTestNames[indAchSum][1].equals(var48[baseAchSum][0])) {
                                                ++baseAchSum;
                                                continue;
                                             }

                                             row.createCell(var46 + indAchSum).setCellValue(var48[baseAchSum][4]);
                                             row.getCell(var46 + indAchSum).setCellStyle(styleForCellsWithCenterAlg);
                                          }

                                          ++indAchSum;
                                          break;
                                       }
                                    }

                                    var47 = var46 + allEntranceTestNames.length;
                                    var49 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), true);
                                    baseAchSum = 0;
                                    if(moduleType.equals("аспирантура")) {
                                       for(additionalAchSum = 0; additionalAchSum < (var49 == null?0:var49.length); ++additionalAchSum) {
                                          baseAchSum += Integer.valueOf(var49[additionalAchSum][2]).intValue();
                                       }
                                    } else {
                                       additionalAchSum = 0;
                                       curIndAchNum = 0;

                                       for(curIndAchNum1 = 0; curIndAchNum1 < (var49 == null?0:var49.length); ++curIndAchNum1) {
                                          if(Integer.valueOf(var49[curIndAchNum1][1]).intValue() <= 5) {
                                             additionalAchSum += Integer.valueOf(var49[curIndAchNum1][2]).intValue();
                                          } else {
                                             curIndAchNum += Integer.valueOf(var49[curIndAchNum1][2]).intValue();
                                          }
                                       }

                                       baseAchSum = additionalAchSum + (curIndAchNum > 15?15:curIndAchNum);
                                       baseAchSum = baseAchSum > 100?100:baseAchSum;
                                    }

                                    row.createCell(var47).setCellValue((double)baseAchSum);
                                    row.getCell(var47).setCellStyle(styleForCellsWithCenterAlg);
                                    ++var47;
                                    row.createCell(var47).setCellValue(rset.getString(9));
                                    row.getCell(var47).setCellStyle(styleForCellsWithCenterAlg);
                                    ++var47;
                                    row.createCell(var47).setCellValue(rset.getString(6));
                                    row.getCell(var47).setCellStyle(styleForCellsWithCenterAlg);
                                    ++var47;
                                    row.createCell(var47).setCellValue(rset.getString(10));
                                    row.getCell(var47).setCellStyle(styleForCellsWithCenterAlg);
                                    ++var47;
                                    row.createCell(var47).setCellValue(rset.getString(7));
                                    row.getCell(var47).setCellStyle(styleForCellsWithCenterAlg);
                                 }
                              }
                           }

                           rset.close();
                        }
                     }
                  }
               } else {
                  query = moduleType.equals("аспирантура")?"select aid, SName, Fname, isNULL(MName,\'\'), competitiveBall, case when originalsReceivedDate is not null then \'+\' else \'-\' end, Speciality.name, case when returnDate is not null then \'+\' else \'-\' end, EducationForm.name, (select sum(isNULL(score, 0)) from AbiturientEntranceTests where AbiturientCompetitiveGroup.aid_abiturient = AbiturientEntranceTests.aid_abiturient) as entranceTestsSum from (Speciality join AbiturientCompetitiveGroup on (AbiturientCompetitiveGroup.speciality = Speciality.id) join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid) join EducationForm on (AbiturientCompetitiveGroup.educationForm = EducationForm.id)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where course = \'" + specialities[path][0] + "\' and competitiveGroup = \'" + competitiveGroups[cg_i][0] + "\' and targetOrganisation is null " + "and AbiturientCompetitiveGroup.markEnrollment > 0 " + "order by competitiveBall desc, entranceTestsSum desc":"select aid, SName, Fname, isNULL(MName,\'\'), competitiveBall, case when originalsReceivedDate is not null then \'+\' else \'-\' end, case when returnDate is not null then \'+\' else \'-\' end, EducationStandard.name, (select sum(isNULL(score, 0)) from AbiturientEntranceTests where AbiturientCompetitiveGroup.aid_abiturient = AbiturientEntranceTests.aid_abiturient) as entranceTestsSum, (select isNull(avgBall, 0) from AbiturientHigherEducation where AbiturientCompetitiveGroup.aid_abiturient = AbiturientHigherEducation.aid_abiturient) as avgDiplomaBall, Chair.name from (Chair join AbiturientCompetitiveGroup on (AbiturientCompetitiveGroup.chair = Chair.id) join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid) join EducationStandard on (AbiturientCompetitiveGroup.educationStandard = EducationStandard.id)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where speciality = \'" + specialities[path][0] + "\' and competitiveGroup = \'" + competitiveGroups[cg_i][0] + "\' and targetOrganisation is null " + "and AbiturientCompetitiveGroup.markEnrollment > 0 " + "order by competitiveBall desc, entranceTestsSum desc, avgDiplomaBall desc";
                  cstmt = con.prepareCall(query, 1004, 1007);
                  rset = cstmt.executeQuery();
                  countAbitsOnCurSpecOnCurCompGr = rset.last()?rset.getRow():0;
                  rset.close();
                  if(countAbitsOnCurSpecOnCurCompGr > 0 && (competitiveGroups[cg_i][0].equals("3") || !wasWritten && competitiveGroups[cg_i][0].equals("4"))) {
                     row = sheet.createRow(rowNum++);
                     row = sheet.createRow(rowNum++);
                     row.createCell(1).setCellValue("МЕСТА ПО ДОГОВОРАМ ОБ ОКАЗАНИИ ПЛАТНЫХ УСЛУГ");
                     sheet.addMergedRegion(new CellRangeAddress(rowNum - 1, rowNum - 1, 1, 9));
                     row.getCell(1).setCellStyle(styleForCategories);
                     wasWritten = true;
                  }

                  for(es_i = 0; es_i < educationStandarts.length; ++es_i) {
                     query = moduleType.equals("аспирантура")?"select aid, SName, Fname, isNULL(MName,\'\'), competitiveBall, case when originalsReceivedDate is not null then \'+\' else \'-\' end, Speciality.name, case when returnDate is not null then \'+\' else \'-\' end, EducationForm.name, (select sum(isNULL(score, 0)) from AbiturientEntranceTests where AbiturientCompetitiveGroup.aid_abiturient = AbiturientEntranceTests.aid_abiturient) as entranceTestsSum from (Speciality join AbiturientCompetitiveGroup on (AbiturientCompetitiveGroup.speciality = Speciality.id) join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid) join EducationForm on (AbiturientCompetitiveGroup.educationForm = EducationForm.id)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where course = \'" + specialities[path][0] + "\' and competitiveGroup = \'" + competitiveGroups[cg_i][0] + "\' and educationForm = \'" + educationStandarts[es_i][0] + "\' and targetOrganisation is null " + "and AbiturientCompetitiveGroup.markEnrollment > 0 " + "order by competitiveBall desc, entranceTestsSum desc":"select aid, SName, Fname, isNULL(MName,\'\'), competitiveBall, case when originalsReceivedDate is not null then \'+\' else \'-\' end, case when returnDate is not null then \'+\' else \'-\' end, EducationStandard.name, (select sum(isNULL(score, 0)) from AbiturientEntranceTests where AbiturientCompetitiveGroup.aid_abiturient = AbiturientEntranceTests.aid_abiturient) as entranceTestsSum, (select isNull(avgBall, 0) from AbiturientHigherEducation where AbiturientCompetitiveGroup.aid_abiturient = AbiturientHigherEducation.aid_abiturient) as avgDiplomaBall, Chair.name from (Chair join AbiturientCompetitiveGroup on (AbiturientCompetitiveGroup.chair = Chair.id) join Abiturient on (AbiturientCompetitiveGroup.aid_abiturient = Abiturient.aid) join EducationStandard on (AbiturientCompetitiveGroup.educationStandard = EducationStandard.id)) left outer join ReturnReasons on (ReturnReasons.id = Abiturient.id_returnReason) where speciality = \'" + specialities[path][0] + "\' and competitiveGroup = \'" + competitiveGroups[cg_i][0] + "\' and targetOrganisation is null " + "and AbiturientCompetitiveGroup.markEnrollment > 0 " + "order by competitiveBall desc, entranceTestsSum desc, avgDiplomaBall desc";
                     cstmt = con.prepareCall(query, 1004, 1007);
                     rset = cstmt.executeQuery();
                     countAbitsOnCurSpecOnCurCompGrAndSt = rset.last()?rset.getRow():0;
                     rset.beforeFirst();
                     if(countAbitsOnCurSpecOnCurCompGrAndSt > 0) {
                        var41 = 1;
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
                        var44 = false;
                        if(moduleType.equals("аспирантура")) {
                           row.createCell(0).setCellValue("№п/п");
                           row.getCell(0).setCellStyle(styleForNames);
                           row.createCell(1).setCellValue("№ЛД");
                           row.getCell(1).setCellStyle(styleForNames);
                           row.createCell(2).setCellValue("ФИО");
                           row.getCell(2).setCellStyle(styleForNames);
                           row.createCell(3).setCellValue("Конкурсный балл");
                           row.getCell(3).setCellStyle(styleForNames);
                           var45 = 4;

                           for(var47 = 0; var47 < allEntranceTestNames.length; ++var47) {
                              row.createCell(var45 + var47).setCellValue(allEntranceTestNames[var47][1]);
                              row.getCell(var45 + var47).setCellStyle(styleForNames);
                           }

                           curCellNum = var45 + allEntranceTestNames.length;
                           row.createCell(curCellNum).setCellValue("Балл за ИД");
                           row.getCell(curCellNum).setCellStyle(styleForNames);
                           ++curCellNum;
                           row.createCell(curCellNum).setCellValue("Наличие оригинала/согласия на зачисление");
                           row.getCell(curCellNum).setCellStyle(styleForNames);
                           ++curCellNum;
                           row.createCell(curCellNum).setCellValue("Специальность");
                           row.getCell(curCellNum).setCellStyle(styleForNames);
                           ++curCellNum;
                           row.createCell(curCellNum).setCellValue("Забрал документы");
                           row.getCell(curCellNum).setCellStyle(styleForNames);
                           ++curCellNum;
                        } else {
                           row.createCell(0).setCellValue("№п/п");
                           row.getCell(0).setCellStyle(styleForNames);
                           row.createCell(1).setCellValue("№ЛД");
                           row.getCell(1).setCellStyle(styleForNames);
                           row.createCell(2).setCellValue("ФИО");
                           row.getCell(2).setCellStyle(styleForNames);
                           row.createCell(3).setCellValue("Конкурсный балл");
                           row.getCell(3).setCellStyle(styleForNames);
                           var45 = 4;

                           for(var47 = 0; var47 < allEntranceTestNames.length; ++var47) {
                              row.createCell(var45 + var47).setCellValue(allEntranceTestNames[var47][1]);
                              row.getCell(var45 + var47).setCellStyle(styleForNames);
                           }

                           curCellNum = var45 + allEntranceTestNames.length;
                           row.createCell(curCellNum).setCellValue("Балл за ИД");
                           row.getCell(curCellNum).setCellStyle(styleForNames);
                           ++curCellNum;
                           row.createCell(curCellNum).setCellValue("Средний балл по диплому");
                           row.getCell(curCellNum).setCellStyle(styleForNames);
                           ++curCellNum;
                           row.createCell(curCellNum).setCellValue("Наличие оригинала/согласия на зачисление");
                           row.getCell(curCellNum).setCellStyle(styleForNames);
                           ++curCellNum;
                           row.createCell(curCellNum).setCellValue("Кафедра");
                           row.getCell(curCellNum).setCellStyle(styleForNames);
                           ++curCellNum;
                           row.createCell(curCellNum).setCellValue("Забрал документы");
                           row.getCell(curCellNum).setCellStyle(styleForNames);
                           ++curCellNum;
                        }

                        while(rset.next()) {
                           row = sheet.createRow(rowNum++);
                           if(moduleType.equals("аспирантура")) {
                              row.createCell(0).setCellValue((double)(var41++));
                              row.getCell(0).setCellStyle(styleForCellsWithCenterAlg);
                              row.createCell(1).setCellValue((double)rset.getInt(1));
                              row.getCell(1).setCellStyle(styleForCellsWithCenterAlg);
                              row.createCell(2).setCellValue(vinitPadeg?Padeg.getFIOPadegFSAS(rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4), 4):rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4));
                              row.getCell(2).setCellStyle(styleForCells);
                              row.createCell(3).setCellValue((double)rset.getInt(5));
                              row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
                              var50 = ModelDBConnection.getAllEntranceTestsResultsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                              var45 = 4;
                              abitAllIndAchivments = 0;

                              while(abitAllIndAchivments < allEntranceTestNames.length) {
                                 indAchSum = 0;

                                 while(true) {
                                    if(indAchSum < var50.length) {
                                       if(!allEntranceTestNames[abitAllIndAchivments][1].equals(var50[indAchSum][0])) {
                                          ++indAchSum;
                                          continue;
                                       }

                                       row.createCell(var45 + abitAllIndAchivments).setCellValue(var50[indAchSum][4]);
                                       row.getCell(var45 + abitAllIndAchivments).setCellStyle(styleForCellsWithCenterAlg);
                                    }

                                    ++abitAllIndAchivments;
                                    break;
                                 }
                              }

                              curCellNum = var45 + allEntranceTestNames.length;
                              var48 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), true);
                              indAchSum = 0;
                              if(moduleType.equals("аспирантура")) {
                                 for(baseAchSum = 0; baseAchSum < (var48 == null?0:var48.length); ++baseAchSum) {
                                    indAchSum += Integer.valueOf(var48[baseAchSum][2]).intValue();
                                 }
                              } else {
                                 baseAchSum = 0;
                                 additionalAchSum = 0;

                                 for(curIndAchNum = 0; curIndAchNum < (var48 == null?0:var48.length); ++curIndAchNum) {
                                    if(Integer.valueOf(var48[curIndAchNum][1]).intValue() <= 5) {
                                       baseAchSum += Integer.valueOf(var48[curIndAchNum][2]).intValue();
                                    } else {
                                       additionalAchSum += Integer.valueOf(var48[curIndAchNum][2]).intValue();
                                    }
                                 }

                                 indAchSum = baseAchSum + (additionalAchSum > 15?15:additionalAchSum);
                                 indAchSum = indAchSum > 100?100:indAchSum;
                              }

                              row.createCell(curCellNum).setCellValue((double)indAchSum);
                              row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue(rset.getString(6));
                              row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue(rset.getString(7));
                              row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue(rset.getString(8));
                              row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                           } else {
                              row.createCell(0).setCellValue((double)(var41++));
                              row.getCell(0).setCellStyle(styleForCellsWithCenterAlg);
                              row.createCell(1).setCellValue((double)rset.getInt(1));
                              row.getCell(1).setCellStyle(styleForCellsWithCenterAlg);
                              row.createCell(2).setCellValue(vinitPadeg?Padeg.getFIOPadegFSAS(rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4), 4):rset.getString(2) + " " + rset.getString(3) + " " + rset.getString(4));
                              row.getCell(2).setCellStyle(styleForCells);
                              row.createCell(3).setCellValue((double)rset.getInt(5));
                              row.getCell(3).setCellStyle(styleForCellsWithCenterAlg);
                              var50 = ModelDBConnection.getAllEntranceTestsResultsByAbiturientId(String.valueOf(rset.getInt(1)), false);
                              var45 = 4;
                              abitAllIndAchivments = 0;

                              while(abitAllIndAchivments < allEntranceTestNames.length) {
                                 indAchSum = 0;

                                 while(true) {
                                    if(indAchSum < var50.length) {
                                       if(!allEntranceTestNames[abitAllIndAchivments][1].equals(var50[indAchSum][0])) {
                                          ++indAchSum;
                                          continue;
                                       }

                                       row.createCell(var45 + abitAllIndAchivments).setCellValue(var50[indAchSum][4]);
                                       row.getCell(var45 + abitAllIndAchivments).setCellStyle(styleForCellsWithCenterAlg);
                                    }

                                    ++abitAllIndAchivments;
                                    break;
                                 }
                              }

                              curCellNum = var45 + allEntranceTestNames.length;
                              var48 = ModelDBConnection.getAllAchievmentsByAbiturientId(String.valueOf(rset.getInt(1)), true);
                              indAchSum = 0;
                              if(moduleType.equals("аспирантура")) {
                                 for(baseAchSum = 0; baseAchSum < (var48 == null?0:var48.length); ++baseAchSum) {
                                    indAchSum += Integer.valueOf(var48[baseAchSum][2]).intValue();
                                 }
                              } else {
                                 baseAchSum = 0;
                                 additionalAchSum = 0;

                                 for(curIndAchNum = 0; curIndAchNum < (var48 == null?0:var48.length); ++curIndAchNum) {
                                    if(Integer.valueOf(var48[curIndAchNum][1]).intValue() <= 5) {
                                       baseAchSum += Integer.valueOf(var48[curIndAchNum][2]).intValue();
                                    } else {
                                       additionalAchSum += Integer.valueOf(var48[curIndAchNum][2]).intValue();
                                    }
                                 }

                                 indAchSum = baseAchSum + (additionalAchSum > 15?15:additionalAchSum);
                                 indAchSum = indAchSum > 100?100:indAchSum;
                              }

                              row.createCell(curCellNum).setCellValue((double)indAchSum);
                              row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue(rset.getString(10));
                              row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue(rset.getString(6));
                              row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue(rset.getString(11));
                              row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
                              ++curCellNum;
                              row.createCell(curCellNum).setCellValue(rset.getString(7));
                              row.getCell(curCellNum).setCellStyle(styleForCellsWithCenterAlg);
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

      String var42 = currentPath + "\\files\\" + "Конкурсный_список_" + moduleType + "_" + (new SimpleDateFormat("dd.MM.yyyy")).format(new Date()) + ".xls";
      File var43 = new File(var42);
      if(var43.exists()) {
         var43.delete();
      }

      var43.createNewFile();
      workbook.write(new FileOutputStream(var43));
      Desktop.getDesktop().open(var43);
   }

   public static void main(String[] args) {
      try {
         ModelDBConnection.setConnectionParameters("MSServer", "localhost", "Ordinator", "igor_sa", "200352");
         ModelDBConnection.initConnection();
         outputCompetitionResults(true);
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }
}

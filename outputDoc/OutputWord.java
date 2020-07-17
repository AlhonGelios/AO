package outputDoc;

import backend.ModelDBConnection;
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.xwpf.usermodel.BreakType;
import org.apache.poi.xwpf.usermodel.IBodyElement;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

public class OutputWord {

   private static String currentPath = (new File("")).getAbsolutePath();


   public static void writeStatement(String[][] allCompetitiveGroups, String[] generalInfo, String[] passportData, String[] addressContacts, String[] highEducation, String[] postGraduateEducation, String[] sertSpecData, String[] accreditSpecData, String needSpecialConditions, String[][] indAchievments, String[][] allExamsWithLanguages) throws Exception {
      XWPFDocument doc_out = new XWPFDocument();
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      String hasPublications = "Нет";
      int file;
      if(ModelDBConnection.getDBName().equals("Aspirant")) {
         for(file = 0; file < (indAchievments != null?indAchievments.length:0); ++file) {
            if(indAchievments[file][1].equals("Научные публикации") || indAchievments[file][1].equals("Научные труды")) {
               hasPublications = "Да";
               break;
            }
         }
      }

      for(file = 0; file < allCompetitiveGroups.length; ++file) {
         int outputStream = 0;
         XWPFDocument doc = new XWPFDocument(new FileInputStream(currentPath + "/Dots/Заявление_" + moduleType + ".dotx"));
         boolean start_replace = false;
         Iterator var19 = doc.getParagraphs().iterator();

         Iterator var21;
         while(var19.hasNext()) {
            XWPFParagraph tbl = (XWPFParagraph)var19.next();
            var21 = tbl.getRuns().iterator();

            while(var21.hasNext()) {
               XWPFRun row = (XWPFRun)var21.next();
               if(row.getText(0) != null) {
                  if(start_replace) {
                     String cell;
                     String var23;
                     switch((var23 = row.getText(0)).hashCode()) {
                     case -2135039293:
                        if(var23.equals("Название_уч_заведения")) {
                           cell = row.getText(0).replace("Название_уч_заведения", highEducation[4] != null?highEducation[4]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case -1835742619:
                        if(var23.equals("Диплом_номер")) {
                           cell = row.getText(0).replace("Диплом_номер", highEducation[2] != null?highEducation[2]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case -1832312702:
                        if(var23.equals("Диплом_серия")) {
                           cell = row.getText(0).replace("Диплом_серия", highEducation[1] != null?highEducation[1]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case -1744658395:
                        if(var23.equals("Название_интернатура")) {
                           cell = row.getText(0).replace("Название_интернатура", postGraduateEducation[4] != null?postGraduateEducation[4]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case -1741172316:
                        if(var23.equals("Электронный_адрес")) {
                           cell = row.getText(0).replace("Электронный_адрес", addressContacts[4] != null?addressContacts[4]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case -1641830305:
                        if(var23.equals("Серт_спец_номер")) {
                           cell = row.getText(0).replace("Серт_спец_номер", sertSpecData[2] != null?sertSpecData[2]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case -1638400388:
                        if(var23.equals("Серт_спец_серия")) {
                           cell = row.getText(0).replace("Серт_спец_серия", sertSpecData[1] != null?sertSpecData[1]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case -1629568576:
                        if(var23.equals("Конкурсная_группа")) {
                           cell = row.getText(0).replace("Конкурсная_группа", allCompetitiveGroups[file][3] != null?allCompetitiveGroups[file][3]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case -1534922964:
                        if(var23.equals("Свид_аккред_кем_выдан")) {
                           cell = row.getText(0).replace("Свид_аккред_кем_выдан", accreditSpecData[3] != null?accreditSpecData[3]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case -1516366512:
                        if(var23.equals("Дипл_серия_интерн")) {
                           cell = row.getText(0).replace("Дипл_серия_интерн", postGraduateEducation[1] != null?postGraduateEducation[1]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case -1516018031:
                        if(var23.equals("Дата_зап")) {
                           cell = row.getText(0).replace("Дата_зап", generalInfo[7] != null?generalInfo[7] + " г.":"");
                           row.setText(cell, 0);
                        }
                        break;
                     case -1431311438:
                        if(var23.equals("Специальность")) {
                           cell = row.getText(0).replace("Специальность", allCompetitiveGroups[file][1] != null?allCompetitiveGroups[file][1]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case -1184604696:
                        if(var23.equals("Свид_аккред_номер")) {
                           cell = row.getText(0).replace("Свид_аккред_номер", accreditSpecData[2] != null?accreditSpecData[2]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case -1181174779:
                        if(var23.equals("Свид_аккред_серия")) {
                           cell = row.getText(0).replace("Свид_аккред_серия", accreditSpecData[1] != null?accreditSpecData[1]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case -1026044899:
                        if(var23.equals("Свид_аккред_дата_выдачи")) {
                           cell = row.getText(0).replace("Свид_аккред_дата_выдачи", accreditSpecData[4] != null?accreditSpecData[4] + " г.":"");
                           row.setText(cell, 0);
                        }
                        break;
                     case -887365495:
                        if(var23.equals("Язык_испытания")) {
                           cell = row.getText(0).replace("Язык_испытания", allExamsWithLanguages[outputStream][1] != null?allExamsWithLanguages[outputStream][1]:"");
                           ++outputStream;
                           row.setText(cell, 0);
                        }
                        break;
                     case -814024397:
                        if(var23.equals("Год_оконч_ВУЗа")) {
                           cell = row.getText(0).replace("Год_оконч_ВУЗа", highEducation[5] != null?highEducation[5]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case -719866198:
                        if(var23.equals("Название_испытания")) {
                           cell = row.getText(0).replace("Название_испытания", allExamsWithLanguages[outputStream][0] != null?allExamsWithLanguages[outputStream][0]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case -552099183:
                        if(var23.equals("Диплом_специальность")) {
                           cell = row.getText(0).replace("Диплом_специальность", highEducation[3] != null?highEducation[3]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case -547478981:
                        if(var23.equals("Гражданство")) {
                           cell = row.getText(0).replace("Гражданство", generalInfo[6] != null?generalInfo[6]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case -478994494:
                        if(!var23.equals("Док_подтв_инд_достиж")) {
                           break;
                        }

                        String var39 = "";

                        for(int r = 0; r < (indAchievments != null?indAchievments.length:0); ++r) {
                           var39 = var39 + (indAchievments[r][3] != null?indAchievments[r][3] + ", ":"") + (indAchievments[r][4] != null?"серия: " + indAchievments[r][4] + ", ":"") + (indAchievments[r][5] != null?"номер: " + indAchievments[r][5] + ", ":"") + (indAchievments[r][6] == null && indAchievments[r][7] == null?"":"выдан: ") + (indAchievments[r][6] != null?indAchievments[r][6] + ", ":"") + (indAchievments[r][7] != null?indAchievments[r][7] + " г.;":";");
                        }

                        cell = row.getText(0).replace("Док_подтв_инд_достиж", !var39.equals(";")?var39:"");
                        row.setText(cell, 0);
                        break;
                     case -260925226:
                        if(var23.equals("Место_рождения")) {
                           cell = row.getText(0).replace("Место_рождения", passportData[5] != null?passportData[5]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case -230177794:
                        if(var23.equals("Общежитие")) {
                           cell = row.getText(0).replace("Общежитие", generalInfo[8]);
                           row.setText(cell, 0);
                        }
                        break;
                     case 125:
                        if(var23.equals("}")) {
                           start_replace = false;
                           row.setText("", 0);
                        }
                        break;
                     case 3355:
                        if(var23.equals("id")) {
                           cell = row.getText(0).replace("id", generalInfo[0] != null?generalInfo[0]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case 104110:
                        if(var23.equals("idi")) {
                           cell = row.getText(0).replace("idi", generalInfo[0] != null?generalInfo[0] + "/" + (file + 1):"");
                           row.setText(cell, 0);
                        }
                        break;
                     case 1041835:
                        if(var23.equals("Имя")) {
                           cell = row.getText(0).replace("Имя", generalInfo[2] != null?generalInfo[2]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case 1048604:
                        if(var23.equals("Пол")) {
                           cell = row.getText(0).replace("Пол", generalInfo[5] != null?generalInfo[5]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case 8200532:
                        if(var23.equals("Серт_спец_дата_выдачи")) {
                           cell = row.getText(0).replace("Серт_спец_дата_выдачи", sertSpecData[4] != null?sertSpecData[4] + " г.":"");
                           row.setText(cell, 0);
                        }
                        break;
                     case 13714097:
                        if(var23.equals("паспорт")) {
                           cell = row.getText(0).replace("паспорт", passportData[0] != null?passportData[0]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case 151962757:
                        if(var23.equals("Почтовый_адрес")) {
                           cell = row.getText(0).replace("Почтовый_адрес", (addressContacts[2] != null?addressContacts[2] + ", ":"") + (addressContacts[0] != null?addressContacts[0] + ", ":"") + (addressContacts[3] != null?addressContacts[3]:""));
                           row.setText(cell, 0);
                        }
                        break;
                     case 414285147:
                        if(var23.equals("Форма_обучения")) {
                           cell = row.getText(0).replace("Форма_обучения", allCompetitiveGroups[file][4] != null?allCompetitiveGroups[file][4]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case 515708429:
                        if(var23.equals("Дипл_номер_интерн")) {
                           cell = row.getText(0).replace("Дипл_номер_интерн", postGraduateEducation[2] != null?postGraduateEducation[2]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case 519842270:
                        if(var23.equals("Год_оконч_интерн")) {
                           cell = row.getText(0).replace("Год_оконч_интерн", postGraduateEducation[5] != null?postGraduateEducation[5]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case 557192534:
                        if(var23.equals("Труды_и_др")) {
                           cell = row.getText(0).replace("Труды_и_др", hasPublications);
                           row.setText(cell, 0);
                        }
                        break;
                     case 606200553:
                        if(var23.equals("Направление_подготовки")) {
                           cell = row.getText(0).replace("Направление_подготовки", allCompetitiveGroups[file][0] != null?allCompetitiveGroups[file][0]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case 634109594:
                        if(var23.equals("Спец_интерн_дипл")) {
                           cell = row.getText(0).replace("Спец_интерн_дипл", postGraduateEducation[3] != null?postGraduateEducation[3]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case 659951056:
                        if(var23.equals("Дата_рождения")) {
                           cell = row.getText(0).replace("Дата_рождения", generalInfo[4] != null?generalInfo[4] + " г.":"");
                           row.setText(cell, 0);
                        }
                        break;
                     case 723133987:
                        if(var23.equals("Серт_спец_кем_выдан")) {
                           cell = row.getText(0).replace("Серт_спец_кем_выдан", sertSpecData[3] != null?sertSpecData[3]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case 1005896838:
                        if(var23.equals("Номер")) {
                           cell = row.getText(0).replace("Номер", passportData[2] != null?passportData[2]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case 1008572386:
                        if(var23.equals("СНИЛС")) {
                           cell = row.getText(0).replace("СНИЛС", generalInfo[9] != null?generalInfo[9]:"");
                           ++outputStream;
                           row.setText(cell, 0);
                        }
                        break;
                     case 1009326755:
                        if(var23.equals("Серия")) {
                           cell = row.getText(0).replace("Серия", passportData[1] != null?passportData[1]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case 1220271445:
                        if(var23.equals("Спецусловия_испытаний")) {
                           cell = row.getText(0).replace("Спецусловия_испытаний", needSpecialConditions);
                           row.setText(cell, 0);
                        }
                        break;
                     case 1384963605:
                        if(var23.equals("Телефоны")) {
                           cell = row.getText(0).replace("Телефоны", addressContacts[5] != null?addressContacts[5]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case 1538279293:
                        if(var23.equals("Кафедра")) {
                           cell = row.getText(0).replace("Кафедра", allCompetitiveGroups[file][2] != null?allCompetitiveGroups[file][2]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case 1735512431:
                        if(var23.equals("Когда_и_кем_выдан")) {
                           cell = row.getText(0).replace("Когда_и_кем_выдан", (passportData[3] != null?passportData[3] + ", ":"") + (passportData[4] != null?passportData[4] + " г.":""));
                           row.setText(cell, 0);
                        }
                        break;
                     case 1816089226:
                        if(var23.equals("Фамилия")) {
                           cell = row.getText(0).replace("Фамилия", generalInfo[1] != null?generalInfo[1]:"");
                           row.setText(cell, 0);
                        }
                        break;
                     case 1832304696:
                        if(!var23.equals("Инд_достижения")) {
                           break;
                        }

                        String p = "";

                        for(int indAchivmentsDocs = 0; indAchivmentsDocs < (indAchievments != null?indAchievments.length:0); ++indAchivmentsDocs) {
                           p = p + indAchievments[indAchivmentsDocs][1] + (Integer.valueOf(indAchievments[indAchivmentsDocs][2]).intValue() > 0?" - " + indAchievments[indAchivmentsDocs][2] + " балл;":"; ");
                        }

                        cell = row.getText(0).replace("Инд_достижения", p);
                        row.setText(cell, 0);
                        break;
                     case 1999766751:
                        if(var23.equals("Отчество")) {
                           cell = row.getText(0).replace("Отчество", generalInfo[3] != null?generalInfo[3]:"");
                           row.setText(cell, 0);
                        }
                     }
                  } else if(row.getText(0).equals("{")) {
                     start_replace = true;
                     row.setText("", 0);
                  }
               }
            }
         }

         var19 = doc.getTables().iterator();

         while(var19.hasNext()) {
            XWPFTable var35 = (XWPFTable)var19.next();
            var21 = var35.getRows().iterator();

            while(var21.hasNext()) {
               XWPFTableRow var36 = (XWPFTableRow)var21.next();
               Iterator var37 = var36.getTableCells().iterator();

               while(var37.hasNext()) {
                  XWPFTableCell var43 = (XWPFTableCell)var37.next();
                  Iterator var40 = var43.getParagraphs().iterator();

                  while(var40.hasNext()) {
                     XWPFParagraph var38 = (XWPFParagraph)var40.next();
                     Iterator var27 = var38.getRuns().iterator();

                     while(var27.hasNext()) {
                        XWPFRun var41 = (XWPFRun)var27.next();
                        if(var41.getText(0) != null) {
                           if(start_replace) {
                              String text;
                              String var29;
                              switch((var29 = var41.getText(0)).hashCode()) {
                              case -2135039293:
                                 if(var29.equals("Название_уч_заведения")) {
                                    text = var41.getText(0).replace("Название_уч_заведения", highEducation[4] != null?highEducation[4]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case -1835742619:
                                 if(var29.equals("Диплом_номер")) {
                                    text = var41.getText(0).replace("Диплом_номер", highEducation[2] != null?highEducation[2]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case -1832312702:
                                 if(var29.equals("Диплом_серия")) {
                                    text = var41.getText(0).replace("Диплом_серия", highEducation[1] != null?highEducation[1]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case -1744658395:
                                 if(var29.equals("Название_интернатура")) {
                                    text = var41.getText(0).replace("Название_интернатура", postGraduateEducation[4] != null?postGraduateEducation[4]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case -1741172316:
                                 if(var29.equals("Электронный_адрес")) {
                                    text = var41.getText(0).replace("Электронный_адрес", addressContacts[4] != null?addressContacts[4]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case -1641830305:
                                 if(var29.equals("Серт_спец_номер")) {
                                    text = var41.getText(0).replace("Серт_спец_номер", sertSpecData[2] != null?sertSpecData[2]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case -1638400388:
                                 if(var29.equals("Серт_спец_серия")) {
                                    text = var41.getText(0).replace("Серт_спец_серия", sertSpecData[1] != null?sertSpecData[1]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case -1629568576:
                                 if(var29.equals("Конкурсная_группа")) {
                                    text = var41.getText(0).replace("Конкурсная_группа", allCompetitiveGroups[file][3] != null?allCompetitiveGroups[file][3]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case -1534922964:
                                 if(var29.equals("Свид_аккред_кем_выдан")) {
                                    text = var41.getText(0).replace("Свид_аккред_кем_выдан", accreditSpecData[3] != null?accreditSpecData[3]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case -1516366512:
                                 if(var29.equals("Дипл_серия_интерн")) {
                                    text = var41.getText(0).replace("Дипл_серия_интерн", postGraduateEducation[1] != null?postGraduateEducation[1]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case -1516018031:
                                 if(var29.equals("Дата_зап")) {
                                    text = var41.getText(0).replace("Дата_зап", generalInfo[7] != null?generalInfo[7] + " г.":"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case -1431311438:
                                 if(var29.equals("Специальность")) {
                                    text = var41.getText(0).replace("Специальность", allCompetitiveGroups[file][1] != null?allCompetitiveGroups[file][1]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case -1184604696:
                                 if(var29.equals("Свид_аккред_номер")) {
                                    text = var41.getText(0).replace("Свид_аккред_номер", accreditSpecData[2] != null?accreditSpecData[2]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case -1181174779:
                                 if(var29.equals("Свид_аккред_серия")) {
                                    text = var41.getText(0).replace("Свид_аккред_серия", accreditSpecData[1] != null?accreditSpecData[1]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case -1026044899:
                                 if(var29.equals("Свид_аккред_дата_выдачи")) {
                                    text = var41.getText(0).replace("Свид_аккред_дата_выдачи", accreditSpecData[4] != null?accreditSpecData[4] + " г.":"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case -887365495:
                                 if(var29.equals("Язык_испытания")) {
                                    text = var41.getText(0).replace("Язык_испытания", allExamsWithLanguages[outputStream][1] != null?allExamsWithLanguages[outputStream][1]:"");
                                    ++outputStream;
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case -814024397:
                                 if(var29.equals("Год_оконч_ВУЗа")) {
                                    text = var41.getText(0).replace("Год_оконч_ВУЗа", highEducation[5] != null?highEducation[5]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case -719866198:
                                 if(var29.equals("Название_испытания")) {
                                    text = var41.getText(0).replace("Название_испытания", allExamsWithLanguages[outputStream][0] != null?allExamsWithLanguages[outputStream][0]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case -552099183:
                                 if(var29.equals("Диплом_специальность")) {
                                    text = var41.getText(0).replace("Диплом_специальность", highEducation[3] != null?highEducation[3]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case -547478981:
                                 if(var29.equals("Гражданство")) {
                                    text = var41.getText(0).replace("Гражданство", generalInfo[6] != null?generalInfo[6]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case -478994494:
                                 if(!var29.equals("Док_подтв_инд_достиж")) {
                                    break;
                                 }

                                 String var42 = "";

                                 for(int j = 0; j < (indAchievments != null?indAchievments.length:0); ++j) {
                                    var42 = var42 + (indAchievments[j][3] != null?indAchievments[j][3] + ", ":"") + (indAchievments[j][4] != null?"серия: " + indAchievments[j][4] + ", ":"") + (indAchievments[j][5] != null?"номер: " + indAchievments[j][5] + ", ":"") + (indAchievments[j][6] == null && indAchievments[j][7] == null?"":"выдан: ") + (indAchievments[j][6] != null?indAchievments[j][6] + ", ":"") + (indAchievments[j][7] != null?indAchievments[j][7] + " г.;":";");
                                 }

                                 text = var41.getText(0).replace("Док_подтв_инд_достиж", !var42.equals(";")?var42:"");
                                 var41.setText(text, 0);
                                 break;
                              case -260925226:
                                 if(var29.equals("Место_рождения")) {
                                    text = var41.getText(0).replace("Место_рождения", passportData[5] != null?passportData[5]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case -230177794:
                                 if(var29.equals("Общежитие")) {
                                    text = var41.getText(0).replace("Общежитие", generalInfo[8]);
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 125:
                                 if(var29.equals("}")) {
                                    start_replace = false;
                                    var41.setText("", 0);
                                 }
                                 break;
                              case 3355:
                                 if(var29.equals("id")) {
                                    text = var41.getText(0).replace("id", generalInfo[0] != null?generalInfo[0]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 104110:
                                 if(var29.equals("idi")) {
                                    text = var41.getText(0).replace("idi", generalInfo[0] != null?generalInfo[0] + "/" + (file + 1):"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 1041835:
                                 if(var29.equals("Имя")) {
                                    text = var41.getText(0).replace("Имя", generalInfo[2] != null?generalInfo[2]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 1048604:
                                 if(var29.equals("Пол")) {
                                    text = var41.getText(0).replace("Пол", generalInfo[5] != null?generalInfo[5]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 8200532:
                                 if(var29.equals("Серт_спец_дата_выдачи")) {
                                    text = var41.getText(0).replace("Серт_спец_дата_выдачи", sertSpecData[4] != null?sertSpecData[4] + " г.":"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 13714097:
                                 if(var29.equals("паспорт")) {
                                    text = var41.getText(0).replace("паспорт", passportData[0] != null?passportData[0]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 151962757:
                                 if(var29.equals("Почтовый_адрес")) {
                                    text = var41.getText(0).replace("Почтовый_адрес", (addressContacts[2] != null?addressContacts[2] + ", ":"") + (addressContacts[0] != null?addressContacts[0] + ", ":"") + (addressContacts[3] != null?addressContacts[3]:""));
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 414285147:
                                 if(var29.equals("Форма_обучения")) {
                                    text = var41.getText(0).replace("Форма_обучения", allCompetitiveGroups[file][4] != null?allCompetitiveGroups[file][4]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 515708429:
                                 if(var29.equals("Дипл_номер_интерн")) {
                                    text = var41.getText(0).replace("Дипл_номер_интерн", postGraduateEducation[2] != null?postGraduateEducation[2]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 519842270:
                                 if(var29.equals("Год_оконч_интерн")) {
                                    text = var41.getText(0).replace("Год_оконч_интерн", postGraduateEducation[5] != null?postGraduateEducation[5]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 557192534:
                                 if(var29.equals("Труды_и_др")) {
                                    text = var41.getText(0).replace("Труды_и_др", hasPublications);
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 606200553:
                                 if(var29.equals("Направление_подготовки")) {
                                    text = var41.getText(0).replace("Направление_подготовки", allCompetitiveGroups[file][0] != null?allCompetitiveGroups[file][0]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 634109594:
                                 if(var29.equals("Спец_интерн_дипл")) {
                                    text = var41.getText(0).replace("Спец_интерн_дипл", postGraduateEducation[3] != null?postGraduateEducation[3]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 659951056:
                                 if(var29.equals("Дата_рождения")) {
                                    text = var41.getText(0).replace("Дата_рождения", generalInfo[4] != null?generalInfo[4] + " г.":"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 723133987:
                                 if(var29.equals("Серт_спец_кем_выдан")) {
                                    text = var41.getText(0).replace("Серт_спец_кем_выдан", sertSpecData[3] != null?sertSpecData[3]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 1005896838:
                                 if(var29.equals("Номер")) {
                                    text = var41.getText(0).replace("Номер", passportData[2] != null?passportData[2]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 1008572386:
                                 if(var29.equals("СНИЛС")) {
                                    text = var41.getText(0).replace("СНИЛС", generalInfo[9] != null?generalInfo[9]:"");
                                    ++outputStream;
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 1009326755:
                                 if(var29.equals("Серия")) {
                                    text = var41.getText(0).replace("Серия", passportData[1] != null?passportData[1]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 1220271445:
                                 if(var29.equals("Спецусловия_испытаний")) {
                                    text = var41.getText(0).replace("Спецусловия_испытаний", needSpecialConditions);
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 1384963605:
                                 if(var29.equals("Телефоны")) {
                                    text = var41.getText(0).replace("Телефоны", addressContacts[5] != null?addressContacts[5]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 1538279293:
                                 if(var29.equals("Кафедра")) {
                                    text = var41.getText(0).replace("Кафедра", allCompetitiveGroups[file][2] != null?allCompetitiveGroups[file][2]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 1735512431:
                                 if(var29.equals("Когда_и_кем_выдан")) {
                                    text = var41.getText(0).replace("Когда_и_кем_выдан", (passportData[3] != null?passportData[3] + ", ":"") + (passportData[4] != null?passportData[4] + " г.":""));
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 1816089226:
                                 if(var29.equals("Фамилия")) {
                                    text = var41.getText(0).replace("Фамилия", generalInfo[1] != null?generalInfo[1]:"");
                                    var41.setText(text, 0);
                                 }
                                 break;
                              case 1832304696:
                                 if(!var29.equals("Инд_достижения")) {
                                    break;
                                 }

                                 String indAchivments = "";

                                 for(int indAchivmentsDocs1 = 0; indAchivmentsDocs1 < (indAchievments != null?indAchievments.length:0); ++indAchivmentsDocs1) {
                                    indAchivments = indAchivments + indAchievments[indAchivmentsDocs1][1] + (Integer.valueOf(indAchievments[indAchivmentsDocs1][2] != null?indAchievments[indAchivmentsDocs1][2]:"0").intValue() > 0?" - " + indAchievments[indAchivmentsDocs1][2] + " баллов;":"; ");
                                 }

                                 text = var41.getText(0).replace("Инд_достижения", indAchivments);
                                 var41.setText(text, 0);
                                 break;
                              case 1999766751:
                                 if(var29.equals("Отчество")) {
                                    text = var41.getText(0).replace("Отчество", generalInfo[3] != null?generalInfo[3]:"");
                                    var41.setText(text, 0);
                                 }
                              }
                           } else if(var41.getText(0).equals("{")) {
                              start_replace = true;
                              var41.setText("", 0);
                           }
                        }
                     }
                  }
               }
            }
         }

         copyElements(doc, doc_out);
      }

      File var33 = new File(currentPath + "/files/" + generalInfo[0] + "_statement.doc");
      if(var33 != null) {
         FileOutputStream var34 = new FileOutputStream(new File(var33.getAbsolutePath()));
         doc_out.write(var34);
         var34.flush();
         var34.close();
      }

      Desktop.getDesktop().open(var33);
   }

   public static void writeStatementApps(String[][] allCompetitiveGroups, String[] generalInfo, String[] highEducation, String[] postGraduateEducation) throws Exception {
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      XWPFDocument doc = new XWPFDocument(new FileInputStream(currentPath + "/Dots/Приложение_к_заявлению_" + moduleType + ".dotx"));
      boolean start_replace = false;
      int currentCompetitiveGroup = -1;
      Iterator outputStream = doc.getParagraphs().iterator();

      Iterator var11;
      while(outputStream.hasNext()) {
         XWPFParagraph file = (XWPFParagraph)outputStream.next();
         var11 = file.getRuns().iterator();

         while(var11.hasNext()) {
            XWPFRun row = (XWPFRun)var11.next();
            if(row.getText(0) != null) {
               if(start_replace) {
                  String cell;
                  String var13;
                  switch((var13 = row.getText(0)).hashCode()) {
                  case -1629568576:
                     if(var13.equals("Конкурсная_группа")) {
                        cell = row.getText(0).replace("Конкурсная_группа", currentCompetitiveGroup >= allCompetitiveGroups.length?"":(allCompetitiveGroups[currentCompetitiveGroup][3] != null?allCompetitiveGroups[currentCompetitiveGroup][3]:""));
                        row.setText(cell, 0);
                     }
                     break;
                  case -1516018031:
                     if(var13.equals("Дата_зап")) {
                        cell = row.getText(0).replace("Дата_зап", generalInfo[7] != null?generalInfo[7] + " г.":"");
                        row.setText(cell, 0);
                     }
                     break;
                  case -1431311438:
                     if(var13.equals("Специальность")) {
                        cell = row.getText(0).replace("Специальность", currentCompetitiveGroup >= allCompetitiveGroups.length?"":(allCompetitiveGroups[currentCompetitiveGroup][1] != null?allCompetitiveGroups[currentCompetitiveGroup][1]:""));
                        row.setText(cell, 0);
                     }
                     break;
                  case -1164612849:
                     if(var13.equals("НазваниеУчЗаведенияТест")) {
                        cell = row.getText(0).replace("НазваниеУчЗаведенияТест", postGraduateEducation[4] != null?postGraduateEducation[4]:(highEducation[4] != null?highEducation[4]:""));
                        row.setText(cell, 0);
                     }
                     break;
                  case -199930754:
                     if(var13.equals("ТестСпециальность")) {
                        cell = row.getText(0).replace("ТестСпециальность", postGraduateEducation[3] != null?postGraduateEducation[3]:(highEducation[3] != null?highEducation[3]:""));
                        row.setText(cell, 0);
                     }
                     break;
                  case 125:
                     if(var13.equals("}")) {
                        start_replace = false;
                        row.setText("", 0);
                     }
                     break;
                  case 3355:
                     if(var13.equals("id")) {
                        cell = row.getText(0).replace("id", generalInfo[0] != null?generalInfo[0]:"");
                        row.setText(cell, 0);
                     }
                     break;
                  case 1041835:
                     if(var13.equals("Имя")) {
                        cell = row.getText(0).replace("Имя", generalInfo[2] != null?generalInfo[2]:"");
                        row.setText(cell, 0);
                     }
                     break;
                  case 414285147:
                     if(var13.equals("Форма_обучения")) {
                        cell = row.getText(0).replace("Форма_обучения", currentCompetitiveGroup >= allCompetitiveGroups.length?"":(allCompetitiveGroups[currentCompetitiveGroup][4] != null?allCompetitiveGroups[currentCompetitiveGroup][4]:""));
                        row.setText(cell, 0);
                     }
                     break;
                  case 524537441:
                     if(var13.equals("ГодОкончВУЗаТест")) {
                        cell = row.getText(0).replace("ГодОкончВУЗаТест", postGraduateEducation[5] != null?postGraduateEducation[5]:(highEducation[5] != null?highEducation[5]:""));
                        row.setText(cell, 0);
                     }
                     break;
                  case 606200553:
                     if(var13.equals("Направление_подготовки")) {
                        cell = row.getText(0).replace("Направление_подготовки", currentCompetitiveGroup >= allCompetitiveGroups.length?"":(allCompetitiveGroups[currentCompetitiveGroup][0] != null?allCompetitiveGroups[currentCompetitiveGroup][0]:""));
                        row.setText(cell, 0);
                     }
                     break;
                  case 693923088:
                     if(var13.equals("Приоритет")) {
                        ++currentCompetitiveGroup;
                        cell = row.getText(0).replace("Приоритет", currentCompetitiveGroup >= allCompetitiveGroups.length?"":String.valueOf(currentCompetitiveGroup + 1));
                        row.setText(cell, 0);
                     }
                     break;
                  case 1538279293:
                     if(var13.equals("Кафедра")) {
                        cell = row.getText(0).replace("Кафедра", currentCompetitiveGroup >= allCompetitiveGroups.length?"":(allCompetitiveGroups[currentCompetitiveGroup][2] != null?allCompetitiveGroups[currentCompetitiveGroup][2]:""));
                        row.setText(cell, 0);
                     }
                     break;
                  case 1816089226:
                     if(var13.equals("Фамилия")) {
                        cell = row.getText(0).replace("Фамилия", generalInfo[1] != null?generalInfo[1]:"");
                        row.setText(cell, 0);
                     }
                     break;
                  case 1999766751:
                     if(var13.equals("Отчество")) {
                        cell = row.getText(0).replace("Отчество", generalInfo[3] != null?generalInfo[3]:"");
                        row.setText(cell, 0);
                     }
                  }
               } else if(row.getText(0).equals("{")) {
                  start_replace = true;
                  row.setText("", 0);
               }
            }
         }
      }

      outputStream = doc.getTables().iterator();

      while(outputStream.hasNext()) {
         XWPFTable var20 = (XWPFTable)outputStream.next();
         var11 = var20.getRows().iterator();

         while(var11.hasNext()) {
            XWPFTableRow var23 = (XWPFTableRow)var11.next();
            Iterator var24 = var23.getTableCells().iterator();

            while(var24.hasNext()) {
               XWPFTableCell var25 = (XWPFTableCell)var24.next();
               Iterator var15 = var25.getParagraphs().iterator();

               while(var15.hasNext()) {
                  XWPFParagraph p = (XWPFParagraph)var15.next();
                  Iterator var17 = p.getRuns().iterator();

                  while(var17.hasNext()) {
                     XWPFRun r = (XWPFRun)var17.next();
                     if(r.getText(0) != null) {
                        if(start_replace) {
                           String text;
                           String var19;
                           switch((var19 = r.getText(0)).hashCode()) {
                           case -1629568576:
                              if(var19.equals("Конкурсная_группа")) {
                                 text = r.getText(0).replace("Конкурсная_группа", currentCompetitiveGroup >= allCompetitiveGroups.length?"":(allCompetitiveGroups[currentCompetitiveGroup][3] != null?allCompetitiveGroups[currentCompetitiveGroup][3]:""));
                                 r.setText(text, 0);
                              }
                              break;
                           case -1516018031:
                              if(var19.equals("Дата_зап")) {
                                 text = r.getText(0).replace("Дата_зап", generalInfo[7] != null?generalInfo[7] + " г.":"");
                                 r.setText(text, 0);
                              }
                              break;
                           case -1431311438:
                              if(var19.equals("Специальность")) {
                                 text = r.getText(0).replace("Специальность", currentCompetitiveGroup >= allCompetitiveGroups.length?"":(allCompetitiveGroups[currentCompetitiveGroup][1] != null?allCompetitiveGroups[currentCompetitiveGroup][1]:""));
                                 r.setText(text, 0);
                              }
                              break;
                           case -1164612849:
                              if(var19.equals("НазваниеУчЗаведенияТест")) {
                                 text = r.getText(0).replace("НазваниеУчЗаведенияТест", postGraduateEducation[4] != null?postGraduateEducation[4]:(highEducation[4] != null?highEducation[4]:""));
                                 r.setText(text, 0);
                              }
                              break;
                           case -199930754:
                              if(var19.equals("ТестСпециальность")) {
                                 text = r.getText(0).replace("ТестСпециальность", postGraduateEducation[3] != null?postGraduateEducation[3]:(highEducation[3] != null?highEducation[3]:""));
                                 r.setText(text, 0);
                              }
                              break;
                           case 125:
                              if(var19.equals("}")) {
                                 start_replace = false;
                                 r.setText("", 0);
                              }
                              break;
                           case 3355:
                              if(var19.equals("id")) {
                                 text = r.getText(0).replace("id", generalInfo[0] != null?generalInfo[0]:"");
                                 r.setText(text, 0);
                              }
                              break;
                           case 1041835:
                              if(var19.equals("Имя")) {
                                 text = r.getText(0).replace("Имя", generalInfo[2] != null?generalInfo[2]:"");
                                 r.setText(text, 0);
                              }
                              break;
                           case 414285147:
                              if(var19.equals("Форма_обучения")) {
                                 text = r.getText(0).replace("Форма_обучения", currentCompetitiveGroup >= allCompetitiveGroups.length?"":(allCompetitiveGroups[currentCompetitiveGroup][4] != null?allCompetitiveGroups[currentCompetitiveGroup][4]:""));
                                 r.setText(text, 0);
                              }
                              break;
                           case 524537441:
                              if(var19.equals("ГодОкончВУЗаТест")) {
                                 text = r.getText(0).replace("ГодОкончВУЗаТест", postGraduateEducation[5] != null?postGraduateEducation[5]:(highEducation[5] != null?highEducation[5]:""));
                                 r.setText(text, 0);
                              }
                              break;
                           case 606200553:
                              if(var19.equals("Направление_подготовки")) {
                                 text = r.getText(0).replace("Направление_подготовки", currentCompetitiveGroup >= allCompetitiveGroups.length?"":(allCompetitiveGroups[currentCompetitiveGroup][0] != null?allCompetitiveGroups[currentCompetitiveGroup][0]:""));
                                 r.setText(text, 0);
                              }
                              break;
                           case 693923088:
                              if(var19.equals("Приоритет")) {
                                 ++currentCompetitiveGroup;
                                 text = r.getText(0).replace("Приоритет", currentCompetitiveGroup >= allCompetitiveGroups.length?"":String.valueOf(currentCompetitiveGroup + 1));
                                 r.setText(text, 0);
                              }
                              break;
                           case 1538279293:
                              if(var19.equals("Кафедра")) {
                                 text = r.getText(0).replace("Кафедра", currentCompetitiveGroup >= allCompetitiveGroups.length?"":(allCompetitiveGroups[currentCompetitiveGroup][2] != null?allCompetitiveGroups[currentCompetitiveGroup][2]:""));
                                 r.setText(text, 0);
                              }
                              break;
                           case 1816089226:
                              if(var19.equals("Фамилия")) {
                                 text = r.getText(0).replace("Фамилия", generalInfo[1] != null?generalInfo[1]:"");
                                 r.setText(text, 0);
                              }
                              break;
                           case 1999766751:
                              if(var19.equals("Отчество")) {
                                 text = r.getText(0).replace("Отчество", generalInfo[3] != null?generalInfo[3]:"");
                                 r.setText(text, 0);
                              }
                           }
                        } else if(r.getText(0).equals("{")) {
                           start_replace = true;
                           r.setText("", 0);
                        }
                     }
                  }
               }
            }
         }
      }

      File var21 = new File(currentPath + "/files/" + generalInfo[0] + "_statementApps.doc");
      if(var21 != null) {
         FileOutputStream var22 = new FileOutputStream(new File(var21.getAbsolutePath()));
         doc.write(var22);
         var22.flush();
         var22.close();
      }

      Desktop.getDesktop().open(var21);
   }

   public static void writeInventory(String[] generalInfo, String[] highEducation, String[] postGraduateEducation) throws Exception {
      XWPFDocument doc = new XWPFDocument(new FileInputStream(currentPath + "/Dots/Опись-расписка.dotx"));
      boolean start_replace = false;
      Iterator outputStream = doc.getParagraphs().iterator();

      Iterator var8;
      while(outputStream.hasNext()) {
         XWPFParagraph file = (XWPFParagraph)outputStream.next();
         var8 = file.getRuns().iterator();

         while(var8.hasNext()) {
            XWPFRun row = (XWPFRun)var8.next();
            if(row.getText(0) != null) {
               if(start_replace) {
                  String cell;
                  String var10;
                  switch((var10 = row.getText(0)).hashCode()) {
                  case -2135039293:
                     if(var10.equals("Название_уч_заведения")) {
                        cell = row.getText(0).replace("Название_уч_заведения", highEducation[4] != null?highEducation[4]:"");
                        row.setText(cell, 0);
                     }
                     break;
                  case -2029373103:
                     if(var10.equals("Название_ординатура")) {
                        cell = row.getText(0).replace("Название_ординатура", postGraduateEducation[4] != null?postGraduateEducation[4]:"");
                        row.setText(cell, 0);
                     }
                     break;
                  case -1835742619:
                     if(var10.equals("Диплом_номер")) {
                        cell = row.getText(0).replace("Диплом_номер", highEducation[2] != null?highEducation[2]:"");
                        row.setText(cell, 0);
                     }
                     break;
                  case -1832312702:
                     if(var10.equals("Диплом_серия")) {
                        cell = row.getText(0).replace("Диплом_серия", highEducation[1] != null?highEducation[1]:"");
                        row.setText(cell, 0);
                     }
                     break;
                  case -1516366512:
                     if(var10.equals("Дипл_серия_интерн")) {
                        cell = row.getText(0).replace("Дипл_серия_интерн", postGraduateEducation[1] != null?postGraduateEducation[1]:"");
                        row.setText(cell, 0);
                     }
                     break;
                  case -814024397:
                     if(var10.equals("Год_оконч_ВУЗа")) {
                        cell = row.getText(0).replace("Год_оконч_ВУЗа", highEducation[5] != null?highEducation[5]:"");
                        row.setText(cell, 0);
                     }
                     break;
                  case 125:
                     if(var10.equals("}")) {
                        start_replace = false;
                        row.setText("", 0);
                     }
                     break;
                  case 3355:
                     if(var10.equals("id")) {
                        cell = row.getText(0).replace("id", generalInfo[0] != null?generalInfo[0]:"");
                        row.setText(cell, 0);
                     }
                     break;
                  case 1041835:
                     if(var10.equals("Имя")) {
                        cell = row.getText(0).replace("Имя", generalInfo[2] != null?generalInfo[2]:"");
                        row.setText(cell, 0);
                     }
                     break;
                  case 515708429:
                     if(var10.equals("Дипл_номер_интерн")) {
                        cell = row.getText(0).replace("Дипл_номер_интерн", postGraduateEducation[2] != null?postGraduateEducation[2]:"");
                        row.setText(cell, 0);
                     }
                     break;
                  case 519842270:
                     if(var10.equals("Год_оконч_интерн")) {
                        cell = row.getText(0).replace("Год_оконч_интерн", postGraduateEducation[5] != null?postGraduateEducation[5]:"");
                        row.setText(cell, 0);
                     }
                     break;
                  case 1816089226:
                     if(var10.equals("Фамилия")) {
                        cell = row.getText(0).replace("Фамилия", generalInfo[1] != null?generalInfo[1]:"");
                        row.setText(cell, 0);
                     }
                     break;
                  case 1999766751:
                     if(var10.equals("Отчество")) {
                        cell = row.getText(0).replace("Отчество", generalInfo[3] != null?generalInfo[3]:"");
                        row.setText(cell, 0);
                     }
                  }
               } else if(row.getText(0).equals("{")) {
                  start_replace = true;
                  row.setText("", 0);
               }
            }
         }
      }

      outputStream = doc.getTables().iterator();

      while(outputStream.hasNext()) {
         XWPFTable file1 = (XWPFTable)outputStream.next();
         var8 = file1.getRows().iterator();

         while(var8.hasNext()) {
            XWPFTableRow row1 = (XWPFTableRow)var8.next();
            Iterator var21 = row1.getTableCells().iterator();

            while(var21.hasNext()) {
               XWPFTableCell cell1 = (XWPFTableCell)var21.next();
               Iterator var12 = cell1.getParagraphs().iterator();

               while(var12.hasNext()) {
                  XWPFParagraph p = (XWPFParagraph)var12.next();
                  Iterator var14 = p.getRuns().iterator();

                  while(var14.hasNext()) {
                     XWPFRun r = (XWPFRun)var14.next();
                     if(r.getText(0) != null) {
                        if(start_replace) {
                           String text;
                           String var16;
                           switch((var16 = r.getText(0)).hashCode()) {
                           case -2135039293:
                              if(var16.equals("Название_уч_заведения")) {
                                 text = r.getText(0).replace("Название_уч_заведения", highEducation[4] != null?highEducation[4]:"");
                                 r.setText(text, 0);
                              }
                              break;
                           case -2029373103:
                              if(var16.equals("Название_ординатура")) {
                                 text = r.getText(0).replace("Название_ординатура", postGraduateEducation[4] != null?postGraduateEducation[4]:"");
                                 r.setText(text, 0);
                              }
                              break;
                           case -1835742619:
                              if(var16.equals("Диплом_номер")) {
                                 text = r.getText(0).replace("Диплом_номер", highEducation[2] != null?highEducation[2]:"");
                                 r.setText(text, 0);
                              }
                              break;
                           case -1832312702:
                              if(var16.equals("Диплом_серия")) {
                                 text = r.getText(0).replace("Диплом_серия", highEducation[1] != null?highEducation[1]:"");
                                 r.setText(text, 0);
                              }
                              break;
                           case -1516366512:
                              if(var16.equals("Дипл_серия_интерн")) {
                                 text = r.getText(0).replace("Дипл_серия_интерн", postGraduateEducation[1] != null?postGraduateEducation[1]:"");
                                 r.setText(text, 0);
                              }
                              break;
                           case -814024397:
                              if(var16.equals("Год_оконч_ВУЗа")) {
                                 text = r.getText(0).replace("Год_оконч_ВУЗа", highEducation[5] != null?highEducation[5]:"");
                                 r.setText(text, 0);
                              }
                              break;
                           case 125:
                              if(var16.equals("}")) {
                                 start_replace = false;
                                 r.setText("", 0);
                              }
                              break;
                           case 3355:
                              if(var16.equals("id")) {
                                 text = r.getText(0).replace("id", generalInfo[0] != null?generalInfo[0]:"");
                                 r.setText(text, 0);
                              }
                              break;
                           case 1041835:
                              if(var16.equals("Имя")) {
                                 text = r.getText(0).replace("Имя", generalInfo[2] != null?generalInfo[2]:"");
                                 r.setText(text, 0);
                              }
                              break;
                           case 515708429:
                              if(var16.equals("Дипл_номер_интерн")) {
                                 text = r.getText(0).replace("Дипл_номер_интерн", postGraduateEducation[2] != null?postGraduateEducation[2]:"");
                                 r.setText(text, 0);
                              }
                              break;
                           case 519842270:
                              if(var16.equals("Год_оконч_интерн")) {
                                 text = r.getText(0).replace("Год_оконч_интерн", postGraduateEducation[5] != null?postGraduateEducation[5]:"");
                                 r.setText(text, 0);
                              }
                              break;
                           case 1816089226:
                              if(var16.equals("Фамилия")) {
                                 text = r.getText(0).replace("Фамилия", generalInfo[1] != null?generalInfo[1]:"");
                                 r.setText(text, 0);
                              }
                              break;
                           case 1999766751:
                              if(var16.equals("Отчество")) {
                                 text = r.getText(0).replace("Отчество", generalInfo[3] != null?generalInfo[3]:"");
                                 r.setText(text, 0);
                              }
                           }
                        } else if(r.getText(0).equals("{")) {
                           start_replace = true;
                           r.setText("", 0);
                        }
                     }
                  }
               }
            }
         }
      }

      File file2 = new File(currentPath + "/files/" + generalInfo[0] + "_inventory.doc");
      if(file2 != null) {
         FileOutputStream outputStream1 = new FileOutputStream(new File(file2.getAbsolutePath()));
         doc.write(outputStream1);
         outputStream1.flush();
         outputStream1.close();
      }

      Desktop.getDesktop().open(file2);
   }

   public static void writeExams(String[] generalInfo, ArrayList specialities, ArrayList examNames, ArrayList examDates) throws Exception {
      new XWPFDocument();
      String moduleType = ModelDBConnection.getDBName().equals("Aspirant")?"аспирантура":"ординатура";
      int i = 0;
      File theDir = new File(currentPath + "/tmp_folder");
      theDir.mkdir();
      Iterator var9 = specialities.iterator();

      while(var9.hasNext()) {
         String speciality = (String)var9.next();
         Iterator var11 = examNames.iterator();

         while(var11.hasNext()) {
            String examName = (String)var11.next();
            XWPFDocument doc = new XWPFDocument(new FileInputStream(currentPath + "/Dots/Лист_вступительных_" + moduleType + ".dotm"));
            boolean start_replace = false;
            Iterator outputStream = doc.getParagraphs().iterator();

            Iterator var17;
            while(outputStream.hasNext()) {
               XWPFParagraph file = (XWPFParagraph)outputStream.next();
               var17 = file.getRuns().iterator();

               while(var17.hasNext()) {
                  XWPFRun row = (XWPFRun)var17.next();
                  if(row.getText(0) != null) {
                     if(start_replace) {
                        String cell;
                        String var19;
                        switch((var19 = row.getText(0)).hashCode()) {
                        case -1431311438:
                           if(var19.equals("Специальность")) {
                              cell = row.getText(0).replace("Специальность", speciality);
                              row.setText(cell, 0);
                           }
                           break;
                        case -353423835:
                           if(var19.equals("Дата_проведения_теста")) {
                              cell = row.getText(0).replace("Дата_проведения_теста", (CharSequence)examDates.get(examNames.indexOf(examName)));
                              row.setText(cell, 0);
                           }
                           break;
                        case 125:
                           if(var19.equals("}")) {
                              start_replace = false;
                              row.setText("", 0);
                           }
                           break;
                        case 3355:
                           if(var19.equals("id")) {
                              cell = row.getText(0).replace("id", generalInfo[0]);
                              row.setText(cell, 0);
                           }
                           break;
                        case 1041835:
                           if(var19.equals("Имя")) {
                              cell = row.getText(0).replace("Имя", generalInfo[2]);
                              row.setText(cell, 0);
                           }
                           break;
                        case 565907008:
                           if(var19.equals("Дисциплина")) {
                              cell = row.getText(0).replace("Дисциплина", !examName.equals("Специальная дисциплина")?examName:"");
                              row.setText(cell, 0);
                           }
                           break;
                        case 1816089226:
                           if(var19.equals("Фамилия")) {
                              cell = row.getText(0).replace("Фамилия", generalInfo[1]);
                              row.setText(cell, 0);
                           }
                           break;
                        case 1999766751:
                           if(var19.equals("Отчество")) {
                              cell = row.getText(0).replace("Отчество", generalInfo[3]);
                              row.setText(cell, 0);
                           }
                        }
                     } else if(row.getText(0).equals("{")) {
                        start_replace = true;
                        row.setText("", 0);
                     }
                  }
               }
            }

            outputStream = doc.getTables().iterator();

            while(outputStream.hasNext()) {
               XWPFTable var32 = (XWPFTable)outputStream.next();
               var17 = var32.getRows().iterator();

               while(var17.hasNext()) {
                  XWPFTableRow var35 = (XWPFTableRow)var17.next();
                  Iterator var36 = var35.getTableCells().iterator();

                  while(var36.hasNext()) {
                     XWPFTableCell var37 = (XWPFTableCell)var36.next();
                     Iterator var21 = var37.getParagraphs().iterator();

                     Iterator var23;
                     while(var21.hasNext()) {
                        XWPFParagraph tbl1 = (XWPFParagraph)var21.next();
                        var23 = tbl1.getRuns().iterator();

                        while(var23.hasNext()) {
                           XWPFRun row1 = (XWPFRun)var23.next();
                           if(row1.getText(0) != null) {
                              if(start_replace) {
                                 String cell1;
                                 String var25;
                                 switch((var25 = row1.getText(0)).hashCode()) {
                                 case -1431311438:
                                    if(var25.equals("Специальность")) {
                                       cell1 = row1.getText(0).replace("Специальность", speciality);
                                       row1.setText(cell1, 0);
                                    }
                                    break;
                                 case -353423835:
                                    if(var25.equals("Дата_проведения_теста")) {
                                       cell1 = row1.getText(0).replace("Дата_проведения_теста", (CharSequence)examDates.get(examNames.indexOf(examName)));
                                       row1.setText(cell1, 0);
                                    }
                                    break;
                                 case 125:
                                    if(var25.equals("}")) {
                                       start_replace = false;
                                       row1.setText("", 0);
                                    }
                                    break;
                                 case 3355:
                                    if(var25.equals("id")) {
                                       cell1 = row1.getText(0).replace("id", generalInfo[0]);
                                       row1.setText(cell1, 0);
                                    }
                                    break;
                                 case 1041835:
                                    if(var25.equals("Имя")) {
                                       cell1 = row1.getText(0).replace("Имя", generalInfo[2]);
                                       row1.setText(cell1, 0);
                                    }
                                    break;
                                 case 565907008:
                                    if(var25.equals("Дисциплина")) {
                                       cell1 = row1.getText(0).replace("Дисциплина", !examName.equals("Специальная дисциплина")?examName:"");
                                       row1.setText(cell1, 0);
                                    }
                                    break;
                                 case 1816089226:
                                    if(var25.equals("Фамилия")) {
                                       cell1 = row1.getText(0).replace("Фамилия", generalInfo[1]);
                                       row1.setText(cell1, 0);
                                    }
                                    break;
                                 case 1999766751:
                                    if(var25.equals("Отчество")) {
                                       cell1 = row1.getText(0).replace("Отчество", generalInfo[3]);
                                       row1.setText(cell1, 0);
                                    }
                                 }
                              } else if(row1.getText(0).equals("{")) {
                                 start_replace = true;
                                 row1.setText("", 0);
                              }
                           }
                        }
                     }

                     var21 = var37.getTables().iterator();

                     while(var21.hasNext()) {
                        XWPFTable var38 = (XWPFTable)var21.next();
                        var23 = var38.getRows().iterator();

                        while(var23.hasNext()) {
                           XWPFTableRow var39 = (XWPFTableRow)var23.next();
                           Iterator var40 = var39.getTableCells().iterator();

                           while(var40.hasNext()) {
                              XWPFTableCell var41 = (XWPFTableCell)var40.next();
                              Iterator var27 = var41.getParagraphs().iterator();

                              while(var27.hasNext()) {
                                 XWPFParagraph p1 = (XWPFParagraph)var27.next();
                                 Iterator var29 = p1.getRuns().iterator();

                                 while(var29.hasNext()) {
                                    XWPFRun r1 = (XWPFRun)var29.next();
                                    if(r1.getText(0) != null) {
                                       if(start_replace) {
                                          String text;
                                          String var31;
                                          switch((var31 = r1.getText(0)).hashCode()) {
                                          case -1431311438:
                                             if(var31.equals("Специальность")) {
                                                text = r1.getText(0).replace("Специальность", speciality);
                                                r1.setText(text, 0);
                                             }
                                             break;
                                          case -353423835:
                                             if(var31.equals("Дата_проведения_теста")) {
                                                text = r1.getText(0).replace("Дата_проведения_теста", (CharSequence)examDates.get(examNames.indexOf(examName)));
                                                r1.setText(text, 0);
                                             }
                                             break;
                                          case 125:
                                             if(var31.equals("}")) {
                                                start_replace = false;
                                                r1.setText("", 0);
                                             }
                                             break;
                                          case 3355:
                                             if(var31.equals("id")) {
                                                text = r1.getText(0).replace("id", generalInfo[0]);
                                                r1.setText(text, 0);
                                             }
                                             break;
                                          case 1041835:
                                             if(var31.equals("Имя")) {
                                                text = r1.getText(0).replace("Имя", generalInfo[2]);
                                                r1.setText(text, 0);
                                             }
                                             break;
                                          case 565907008:
                                             if(var31.equals("Дисциплина")) {
                                                text = r1.getText(0).replace("Дисциплина", !examName.equals("Специальная дисциплина")?examName:"");
                                                r1.setText(text, 0);
                                             }
                                             break;
                                          case 1816089226:
                                             if(var31.equals("Фамилия")) {
                                                text = r1.getText(0).replace("Фамилия", generalInfo[1]);
                                                r1.setText(text, 0);
                                             }
                                             break;
                                          case 1999766751:
                                             if(var31.equals("Отчество")) {
                                                text = r1.getText(0).replace("Отчество", generalInfo[3]);
                                                r1.setText(text, 0);
                                             }
                                          }
                                       } else if(r1.getText(0).equals("{")) {
                                          start_replace = true;
                                          r1.setText("", 0);
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            File var33 = new File(theDir.getAbsolutePath() + "/" + generalInfo[0] + "_exams" + (i == 0?"":Integer.valueOf(i)) + ".doc");
            ++i;
            if(var33 != null) {
               FileOutputStream var34 = new FileOutputStream(new File(var33.getAbsolutePath()));
               doc.write(var34);
               var34.flush();
               var34.close();
            }
         }
      }

      if(i > 0) {
         Runtime.getRuntime().exec("cmd /c start " + currentPath + "\\script.vbs " + currentPath + "\\ " + generalInfo[0] + "_exams.doc");
      }

   }

   public static void writeTitul(String[] generalInfo, String[][] allCompetitiveGroups) throws Exception {
      XWPFDocument doc = new XWPFDocument(new FileInputStream(currentPath + "/Dots/Титульный_лист_дела.dotx"));
      String program = ModelDBConnection.getDBName().equals("Aspirant")?"подготовка научно-педагогических кадров в аспирантуре":"ординатура";
      boolean start_replace = false;
      Iterator outputStream = doc.getParagraphs().iterator();

      Iterator var8;
      while(outputStream.hasNext()) {
         XWPFParagraph file = (XWPFParagraph)outputStream.next();
         var8 = file.getRuns().iterator();

         while(var8.hasNext()) {
            XWPFRun row = (XWPFRun)var8.next();
            if(row.getText(0) != null) {
               if(start_replace) {
                  String cell;
                  String var10;
                  switch((var10 = row.getText(0)).hashCode()) {
                  case -1516018031:
                     if(var10.equals("Дата_зап")) {
                        cell = row.getText(0).replace("Дата_зап", generalInfo[5] != null?generalInfo[5] + " г.":"");
                        row.setText(cell, 0);
                     }
                     break;
                  case -1431311438:
                     if(var10.equals("Специальность")) {
                        cell = row.getText(0).replace("Специальность", allCompetitiveGroups[0][1] != null?allCompetitiveGroups[0][1]:"");
                        row.setText(cell, 0);
                     }
                     break;
                  case 125:
                     if(var10.equals("}")) {
                        start_replace = false;
                        row.setText("", 0);
                     }
                     break;
                  case 3355:
                     if(var10.equals("id")) {
                        cell = row.getText(0).replace("id", generalInfo[0] != null?generalInfo[0]:"");
                        row.setText(cell, 0);
                     }
                     break;
                  case 1041835:
                     if(var10.equals("Имя")) {
                        cell = row.getText(0).replace("Имя", generalInfo[2] != null?generalInfo[2]:"");
                        row.setText(cell, 0);
                     }
                     break;
                  case 606200553:
                     if(var10.equals("Направление_подготовки")) {
                        cell = row.getText(0).replace("Направление_подготовки", allCompetitiveGroups[0][0] != null?allCompetitiveGroups[0][0]:"");
                        row.setText(cell, 0);
                     }
                     break;
                  case 659951056:
                     if(var10.equals("Дата_рождения")) {
                        cell = row.getText(0).replace("Дата_рождения", generalInfo[4] != null?generalInfo[4]:"");
                        row.setText(cell, 0);
                     }
                     break;
                  case 1408813322:
                     if(var10.equals("Программа")) {
                        cell = row.getText(0).replace("Программа", program != null?program:"");
                        row.setText(cell, 0);
                     }
                     break;
                  case 1538279293:
                     if(var10.equals("Кафедра")) {
                        cell = row.getText(0).replace("Кафедра", allCompetitiveGroups[0][2] != null?allCompetitiveGroups[0][2]:"");
                        row.setText(cell, 0);
                     }
                     break;
                  case 1816089226:
                     if(var10.equals("Фамилия")) {
                        cell = row.getText(0).replace("Фамилия", generalInfo[1] != null?generalInfo[1]:"");
                        row.setText(cell, 0);
                     }
                     break;
                  case 1999766751:
                     if(var10.equals("Отчество")) {
                        cell = row.getText(0).replace("Отчество", generalInfo[3] != null?generalInfo[3]:"");
                        row.setText(cell, 0);
                     }
                  }
               } else if(row.getText(0).equals("{")) {
                  start_replace = true;
                  row.setText("", 0);
               }
            }
         }
      }

      outputStream = doc.getTables().iterator();

      while(outputStream.hasNext()) {
         XWPFTable file1 = (XWPFTable)outputStream.next();
         var8 = file1.getRows().iterator();

         while(var8.hasNext()) {
            XWPFTableRow row1 = (XWPFTableRow)var8.next();
            Iterator var21 = row1.getTableCells().iterator();

            while(var21.hasNext()) {
               XWPFTableCell cell1 = (XWPFTableCell)var21.next();
               Iterator var12 = cell1.getParagraphs().iterator();

               while(var12.hasNext()) {
                  XWPFParagraph p = (XWPFParagraph)var12.next();
                  Iterator var14 = p.getRuns().iterator();

                  while(var14.hasNext()) {
                     XWPFRun r = (XWPFRun)var14.next();
                     if(r.getText(0) != null) {
                        if(start_replace) {
                           String text;
                           String var16;
                           switch((var16 = r.getText(0)).hashCode()) {
                           case -1516018031:
                              if(var16.equals("Дата_зап")) {
                                 text = r.getText(0).replace("Дата_зап", generalInfo[5] != null?generalInfo[5] + " г.":"");
                                 r.setText(text, 0);
                              }
                              break;
                           case -1431311438:
                              if(var16.equals("Специальность")) {
                                 text = r.getText(0).replace("Специальность", allCompetitiveGroups[0][1] != null?allCompetitiveGroups[0][1]:"");
                                 r.setText(text, 0);
                              }
                              break;
                           case 125:
                              if(var16.equals("}")) {
                                 start_replace = false;
                                 r.setText("", 0);
                              }
                              break;
                           case 3355:
                              if(var16.equals("id")) {
                                 text = r.getText(0).replace("id", generalInfo[0] != null?generalInfo[0]:"");
                                 r.setText(text, 0);
                              }
                              break;
                           case 1041835:
                              if(var16.equals("Имя")) {
                                 text = r.getText(0).replace("Имя", generalInfo[2] != null?generalInfo[2]:"");
                                 r.setText(text, 0);
                              }
                              break;
                           case 606200553:
                              if(var16.equals("Направление_подготовки")) {
                                 text = r.getText(0).replace("Направление_подготовки", allCompetitiveGroups[0][0] != null?allCompetitiveGroups[0][0]:"");
                                 r.setText(text, 0);
                              }
                              break;
                           case 659951056:
                              if(var16.equals("Дата_рождения")) {
                                 text = r.getText(0).replace("Дата_рождения", generalInfo[4] != null?generalInfo[4]:"");
                                 r.setText(text, 0);
                              }
                              break;
                           case 1408813322:
                              if(var16.equals("Программа")) {
                                 text = r.getText(0).replace("Программа", program != null?program:"");
                                 r.setText(text, 0);
                              }
                              break;
                           case 1538279293:
                              if(var16.equals("Кафедра")) {
                                 text = r.getText(0).replace("Кафедра", allCompetitiveGroups[0][2] != null?allCompetitiveGroups[0][2]:"");
                                 r.setText(text, 0);
                              }
                              break;
                           case 1816089226:
                              if(var16.equals("Фамилия")) {
                                 text = r.getText(0).replace("Фамилия", generalInfo[1] != null?generalInfo[1]:"");
                                 r.setText(text, 0);
                              }
                              break;
                           case 1999766751:
                              if(var16.equals("Отчество")) {
                                 text = r.getText(0).replace("Отчество", generalInfo[3] != null?generalInfo[3]:"");
                                 r.setText(text, 0);
                              }
                           }
                        } else if(r.getText(0).equals("{")) {
                           start_replace = true;
                           r.setText("", 0);
                        }
                     }
                  }
               }
            }
         }
      }

      File file2 = new File(currentPath + "/files/" + generalInfo[0] + "_titul.doc");
      if(file2 != null) {
         FileOutputStream outputStream1 = new FileOutputStream(new File(file2.getAbsolutePath()));
         doc.write(outputStream1);
         outputStream1.flush();
         outputStream1.close();
      }

      Desktop.getDesktop().open(file2);
   }

   private static void copyElements(XWPFDocument doc_input, XWPFDocument doc_output) {
      int i = doc_output.getParagraphs().size();
      int j = doc_output.getTables().size();
      Iterator var5 = doc_input.getBodyElements().iterator();

      while(var5.hasNext()) {
         IBodyElement e = (IBodyElement)var5.next();
         if(e instanceof XWPFParagraph) {
            XWPFParagraph t = (XWPFParagraph)e;
            if(t.getCTP().getPPr() == null || t.getCTP().getPPr().getSectPr() == null) {
               doc_output.createParagraph();
               doc_output.setParagraph(t, i);
               ++i;
            }
         } else if(e instanceof XWPFTable) {
            XWPFTable var7 = (XWPFTable)e;
            doc_output.createTable();
            doc_output.setTable(j, var7);
            ++j;
         }
      }

      doc_output.createParagraph().createRun().addBreak(BreakType.PAGE);
      ++i;
   }
}

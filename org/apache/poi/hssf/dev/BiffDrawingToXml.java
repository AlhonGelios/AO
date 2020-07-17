package org.apache.poi.hssf.dev;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.ddf.EscherRecord;
import org.apache.poi.hssf.model.InternalWorkbook;
import org.apache.poi.hssf.record.DrawingGroupRecord;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.util.StringUtil;

public class BiffDrawingToXml {

   private static final String SHEET_NAME_PARAM = "-sheet-name";
   private static final String SHEET_INDEXES_PARAM = "-sheet-indexes";
   private static final String EXCLUDE_WORKBOOK_RECORDS = "-exclude-workbook";


   private static int getAttributeIndex(String attribute, String[] params) {
      for(int i = 0; i < params.length; ++i) {
         String param = params[i];
         if(attribute.equals(param)) {
            return i;
         }
      }

      return -1;
   }

   private static boolean isExcludeWorkbookRecords(String[] params) {
      return -1 != getAttributeIndex("-exclude-workbook", params);
   }

   private static List getIndexesByName(String[] params, HSSFWorkbook workbook) {
      ArrayList list = new ArrayList();
      int pos = getAttributeIndex("-sheet-name", params);
      if(-1 != pos) {
         if(pos >= params.length) {
            throw new IllegalArgumentException("sheet name param value was not specified");
         }

         String sheetName = params[pos + 1];
         int sheetPos = workbook.getSheetIndex(sheetName);
         if(-1 == sheetPos) {
            throw new IllegalArgumentException("specified sheet name has not been found in xls file");
         }

         list.add(Integer.valueOf(sheetPos));
      }

      return list;
   }

   private static List getIndexesByIdArray(String[] params) {
      ArrayList list = new ArrayList();
      int pos = getAttributeIndex("-sheet-indexes", params);
      if(-1 != pos) {
         if(pos >= params.length) {
            throw new IllegalArgumentException("sheet list value was not specified");
         }

         String sheetParam = params[pos + 1];
         String[] sheets = sheetParam.split(",");
         String[] arr$ = sheets;
         int len$ = sheets.length;

         for(int i$ = 0; i$ < len$; ++i$) {
            String sheet = arr$[i$];
            list.add(Integer.valueOf(Integer.parseInt(sheet)));
         }
      }

      return list;
   }

   private static List getSheetsIndexes(String[] params, HSSFWorkbook workbook) {
      ArrayList list = new ArrayList();
      list.addAll(getIndexesByIdArray(params));
      list.addAll(getIndexesByName(params, workbook));
      if(0 == list.size()) {
         int size = workbook.getNumberOfSheets();

         for(int i = 0; i < size; ++i) {
            list.add(Integer.valueOf(i));
         }
      }

      return list;
   }

   private static String getInputFileName(String[] params) {
      return params[params.length - 1];
   }

   private static String getOutputFileName(String input) {
      return input.contains("xls")?input.replace(".xls", ".xml"):input + ".xml";
   }

   public static void main(String[] params) throws IOException {
      if(0 == params.length) {
         System.out.println("Usage: BiffDrawingToXml [options] inputWorkbook");
         System.out.println("Options:");
         System.out.println("  -exclude-workbook            exclude workbook-level records");
         System.out.println("  -sheet-indexes   <indexes>   output sheets with specified indexes");
         System.out.println("  -sheet-namek  <names>        output sheets with specified name");
      } else {
         String input = getInputFileName(params);
         FileInputStream inp = new FileInputStream(input);
         String output = getOutputFileName(input);
         FileOutputStream outputStream = new FileOutputStream(output);
         writeToFile(outputStream, inp, isExcludeWorkbookRecords(params), params);
         inp.close();
         outputStream.close();
      }
   }

   public static void writeToFile(OutputStream fos, InputStream xlsWorkbook, boolean excludeWorkbookRecords, String[] params) throws IOException {
      HSSFWorkbook workbook = new HSSFWorkbook(xlsWorkbook);
      InternalWorkbook internalWorkbook = workbook.getInternalWorkbook();
      DrawingGroupRecord r = (DrawingGroupRecord)internalWorkbook.findFirstRecordBySid((short)235);
      StringBuilder builder = new StringBuilder();
      builder.append("<workbook>\n");
      String tab = "\t";
      List sheets;
      Iterator i$;
      if(!excludeWorkbookRecords && r != null) {
         r.decode();
         sheets = r.getEscherRecords();
         i$ = sheets.iterator();

         while(i$.hasNext()) {
            EscherRecord i = (EscherRecord)i$.next();
            builder.append(i.toXml(tab));
         }
      }

      sheets = getSheetsIndexes(params, workbook);
      i$ = sheets.iterator();

      while(i$.hasNext()) {
         Integer i1 = (Integer)i$.next();
         HSSFPatriarch p = workbook.getSheetAt(i1.intValue()).getDrawingPatriarch();
         if(p != null) {
            builder.append(tab).append("<sheet").append(i1).append(">\n");
            builder.append(p.getBoundAggregate().toXml(tab + "\t"));
            builder.append(tab).append("</sheet").append(i1).append(">\n");
         }
      }

      builder.append("</workbook>\n");
      fos.write(builder.toString().getBytes(StringUtil.UTF8));
      fos.close();
      workbook.close();
   }
}

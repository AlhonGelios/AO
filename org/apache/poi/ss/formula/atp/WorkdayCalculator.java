package org.apache.poi.ss.formula.atp;

import java.util.Calendar;
import java.util.Date;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.util.LocaleUtil;

public class WorkdayCalculator {

   public static final WorkdayCalculator instance = new WorkdayCalculator();


   public int calculateWorkdays(double start, double end, double[] holidays) {
      int saturdaysPast = this.pastDaysOfWeek(start, end, 7);
      int sundaysPast = this.pastDaysOfWeek(start, end, 1);
      int nonWeekendHolidays = this.calculateNonWeekendHolidays(start, end, holidays);
      return (int)(end - start + 1.0D) - saturdaysPast - sundaysPast - nonWeekendHolidays;
   }

   public Date calculateWorkdays(double start, int workdays, double[] holidays) {
      Date startDate = DateUtil.getJavaDate(start);
      int direction = workdays < 0?-1:1;
      Calendar endDate = LocaleUtil.getLocaleCalendar();
      endDate.setTime(startDate);
      double excelEndDate = DateUtil.getExcelDate(endDate.getTime());

      while(workdays != 0) {
         endDate.add(6, direction);
         excelEndDate += (double)direction;
         if(endDate.get(7) != 7 && endDate.get(7) != 1 && !this.isHoliday(excelEndDate, holidays)) {
            workdays -= direction;
         }
      }

      return endDate.getTime();
   }

   protected int pastDaysOfWeek(double start, double end, int dayOfWeek) {
      int pastDaysOfWeek = 0;
      int startDay = (int)Math.floor(start < end?start:end);

      for(int endDay = (int)Math.floor(end > start?end:start); startDay <= endDay; ++startDay) {
         Calendar today = LocaleUtil.getLocaleCalendar();
         today.setTime(DateUtil.getJavaDate((double)startDay));
         if(today.get(7) == dayOfWeek) {
            ++pastDaysOfWeek;
         }
      }

      return start < end?pastDaysOfWeek:-pastDaysOfWeek;
   }

   protected int calculateNonWeekendHolidays(double start, double end, double[] holidays) {
      int nonWeekendHolidays = 0;
      double startDay = start < end?start:end;
      double endDay = end > start?end:start;

      for(int i = 0; i < holidays.length; ++i) {
         if(this.isInARange(startDay, endDay, holidays[i]) && !this.isWeekend(holidays[i])) {
            ++nonWeekendHolidays;
         }
      }

      return start < end?nonWeekendHolidays:-nonWeekendHolidays;
   }

   protected boolean isWeekend(double aDate) {
      Calendar date = LocaleUtil.getLocaleCalendar();
      date.setTime(DateUtil.getJavaDate(aDate));
      return date.get(7) == 7 || date.get(7) == 1;
   }

   protected boolean isHoliday(double aDate, double[] holidays) {
      for(int i = 0; i < holidays.length; ++i) {
         if(Math.round(holidays[i]) == Math.round(aDate)) {
            return true;
         }
      }

      return false;
   }

   protected int isNonWorkday(double aDate, double[] holidays) {
      return !this.isWeekend(aDate) && !this.isHoliday(aDate, holidays)?0:1;
   }

   protected boolean isInARange(double start, double end, double aDate) {
      return aDate >= start && aDate <= end;
   }

}

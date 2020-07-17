package padeg.lib;

import padeg.lib.DeclExt;
import padeg.lib.EDeclenError;
import padeg.lib.FIO;
import padeg.lib.FioComm;
import padeg.lib.FioDecl;
import padeg.lib.TExceptionDic;

public class Padeg {

   private static String currentEncoding = "Cp1251";
   private static final ThreadLocal thFioDecl = new ThreadLocal() {
      protected FioDecl initialValue() {
         return new FioDecl();
      }
   };
   private static final ThreadLocal thDeclExt = new ThreadLocal() {
      protected DeclExt initialValue() {
         return new DeclExt();
      }
   };


   private static final FioDecl fioDecl() {
      return (FioDecl)thFioDecl.get();
   }

   private static final DeclExt declExt() {
      return (DeclExt)thDeclExt.get();
   }

   public static String getCurrentEncoding() {
      return currentEncoding;
   }

   public static void setCurrentEncoding(String currentEncoding) {
      currentEncoding = currentEncoding;
   }

   private static char sexFromBoolean(boolean sex) {
      return (char)(sex?'\u043c':'\u0436');
   }

   public static String getFIOPadeg(String lastName, String firstName, String middleName, boolean sex, int padeg) throws EDeclenError {
      String result = fioDecl().getFIO(lastName, firstName, middleName, sexFromBoolean(sex), padeg);
      return result;
   }

   public static String getFIOPadegAS(String lastName, String firstName, String middleName, int padeg) throws EDeclenError {
      char cSex = 0;
      String result = fioDecl().getFIO(lastName, firstName, middleName, cSex, padeg);
      return result;
   }

   public static String getCutFIOPadeg(String lastName, String firstName, String middleName, boolean sex, int padeg) throws EDeclenError {
      return FioComm.getCutFIO(getFIOPadeg(lastName, firstName, middleName, sex, padeg));
   }

   public static String getFIOPadegFS(String fio, boolean sex, int padeg) throws EDeclenError {
      String result = fioDecl().getFIOFromStr(fio, sexFromBoolean(sex), padeg);
      return result;
   }

   public static String getFIOPadegFSAS(String fio, int padeg) throws EDeclenError {
      char cSex = 0;
      String result = fioDecl().getFIOFromStr(fio, cSex, padeg);
      return result;
   }

   public static String getExceptionsFileName() {
      return TExceptionDic.exceptionDic.getFileName();
   }

   public static String getCutFIOPadegFS(String fio, boolean sex, int padeg) throws EDeclenError {
      return FioComm.getCutFIO(getFIOPadegFS(fio, sex, padeg));
   }

   public static String getIFPadeg(String firstName, String lastName, boolean sex, int padeg) throws EDeclenError {
      String result = fioDecl().getIF(firstName, lastName, sexFromBoolean(sex), padeg);
      return result;
   }

   public static String getIFPadegFS(String cIF, boolean sex, int padeg) throws EDeclenError {
      String result = fioDecl().getIFFromStr(cIF, sexFromBoolean(sex), padeg);
      return result;
   }

   public static String getAppointmentPadeg(String s, int padeg) throws EDeclenError {
      String result = declExt().getAppointment(s, padeg);
      return result;
   }

   public static String getOfficePadeg(String s, int padeg) throws EDeclenError {
      String result = declExt().getOffice(s, padeg);
      return result;
   }

   public static String getFullAppointmentPadeg(String appointment, String office, int padeg) throws EDeclenError {
      String result = declExt().getFullAppointment(appointment, office, padeg);
      return result;
   }

   public static boolean updateExceptions() {
      return TExceptionDic.exceptionDic.updateExceptions();
   }

   public static boolean setDictionary(String dicName) {
      TExceptionDic.exceptionDic.setFileName(dicName);
      return TExceptionDic.exceptionDic.updateExceptions();
   }

   public static int getSex(String middleName) {
      char test = FioComm.getSex(middleName);
      switch(test) {
      case 1078:
         return 0;
      case 1084:
         return 1;
      default:
         return -1;
      }
   }

   public static void getFioParts(String cFIO, FIO fio) {
      FioComm.separateFIO(cFIO, fio);
   }

}

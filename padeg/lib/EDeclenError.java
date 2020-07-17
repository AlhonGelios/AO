package padeg.lib;


public class EDeclenError extends RuntimeException {

   static final long serialVersionUID = 1L;
   private int errorCode;


   public EDeclenError(String message) {
      super(message);
   }

   public int getErrorCode() {
      return this.errorCode;
   }

   public void setErrorCode(int errorCode) {
      this.errorCode = errorCode;
   }
}

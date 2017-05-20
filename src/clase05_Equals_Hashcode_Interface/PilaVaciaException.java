
package clase05_Equals_Hashcode_Interface;

public class PilaVaciaException extends Exception{

    public PilaVaciaException() {
    }

    public PilaVaciaException(String message) {
        super(message);
    }

    public PilaVaciaException(String message, Throwable cause) {
        super(message, cause);
    }

    public PilaVaciaException(Throwable cause) {
        super(cause);
    }

    public PilaVaciaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}

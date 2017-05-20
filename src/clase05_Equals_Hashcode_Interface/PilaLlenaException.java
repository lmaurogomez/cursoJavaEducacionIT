
package clase05_Equals_Hashcode_Interface;

public class PilaLlenaException extends Exception {

    public PilaLlenaException() {
    }

    public PilaLlenaException(String message) {
        super(message);
    }

    public PilaLlenaException(String message, Throwable cause) {
        super(message, cause);
    }

    public PilaLlenaException(Throwable cause) {
        super(cause);
    }

    public PilaLlenaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}

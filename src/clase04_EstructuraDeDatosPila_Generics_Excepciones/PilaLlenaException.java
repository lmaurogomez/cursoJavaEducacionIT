/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase04_EstructuraDeDatosPila_Generics_Excepciones;

/**
 *
 * @author educacionit
 */
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

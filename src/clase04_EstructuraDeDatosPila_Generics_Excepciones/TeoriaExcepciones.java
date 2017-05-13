/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase04_EstructuraDeDatosPila_Generics_Excepciones;

/*
                                 Excepciones

Una excepción que no fue capturada correctamente hace que el sistema se caiga. 
Una excepción es un evento que ocurre durante la ejecución de un programa,
que interrumpe el flujo normal de ejecución.

Throwable -> Exception(CHECKEADAS) <-IOException   (CHECKEADAS)
                                   <-SQLException  (CHECKEADAS)
                                   <-RunTimeException <- IndexOutOfBoundException (NO CHEQUEADAS)

Unchecked Exceptions 
    Son las excepciones que tienen como superclase a la clase RuntimeException.
    No hay necesidad de capturarlas, es decir que no se necesita utilizar el bloque try/catch/finally,
    pero al saltar una excepción de este tipo, como todas las excepciones corta el flujo de ejecución.
    Hacen que el sistema se caiga si no fueron tomadas en cuenta.

Checked Exceptions 
    Son las excepciones que tienen como superclase a la clase Exception.
    Necesitan ser capturadas, caso contrario no se podrá compilar el código.

try{            Si encuentra un error sale del try y se pierde todo el codigo dentro del try
    -           
    -
    -
}
catch(la excepcion que quiero atrapar, EJ: Throwable nombre){
    -
    -
    -
}
catch(IOException e){
    -
    -
}
catch(Throwable e){                   la mas general al final
    -
    -
}
finally{       me asegura que SIEMPRE se ejectute el codigo dentro del finally
    -
    -
}
--------------------------------------------------------------------------------
--------------------------------------------------------------------------------
        Como arrojar Exception en el metodo

public Concection Conect () throws SQLException{
    -
    -   
    if(validarConexion()){
        throw new SQLException();   
    }
}

public void grabar() throws SQLEXception{
    Conection c = db.conection();
}

 */
public class TeoriaExcepciones {
    
}

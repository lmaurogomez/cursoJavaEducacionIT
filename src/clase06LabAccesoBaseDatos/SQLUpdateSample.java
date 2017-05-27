/*
 * SQLUpdateSample.java
 *
 *
 */

package clase06LabAccesoBaseDatos;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Sebasti�n S. Sanga <SebastianSanga@gmail.com>
 */
public class SQLUpdateSample {
    
    /** Creates a new instance of SQLUpdateSample */
    public SQLUpdateSample() {
    }
    
    public static void main(String[] args) throws Exception
    {
        // Define la conexion
        Connection laConexion = AdministradorDeConexiones.getConnection();
        
        // Arma la sentencia de actualizaci�n y la ejecuta
        String laActualizacion = "UPDATE alumnos SET alu_apellido = 'Trobbiani' WHERE alu_id = 101";
        Statement stmtActualizacion = laConexion.createStatement();
        stmtActualizacion.execute(laActualizacion);
        
        // Cierra el Statement y la Connection
        stmtActualizacion.close();
        laConexion.close();
        
        // Informa que la actualizaci�n ha sido realizada con �xito
        System.out.println("La actualizaci�n ha sido realizada con �xito...");
    }
    
}

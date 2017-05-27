/*
 * SQLDeleteSample.java
 *
 *
 */

package clase06_AccesoBaseDatos;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author Sebasti�n S. Sanga <SebastianSanga@gmail.com>
 */
public class SQLDeleteSample {
    
    /** Creates a new instance of SQLDeleteSample */
    public SQLDeleteSample() {
    }
    
    public static void main(String[] args) throws Exception
    {
        // Define la conexion
        Connection laConexion = AdministradorDeConexiones.getConnection();
        
        // Arma la sentencia de eliminaci�n y la ejecuta
        String laEliminacion = "DELETE FROM alumnos WHERE alu_id = 101";
        Statement stmtEliminacion = laConexion.createStatement();
        stmtEliminacion.execute(laEliminacion);
        
        // Cierra el Statement y la Connection
        stmtEliminacion.close();
        laConexion.close();
        
        // Informa que la eliminaci�n ha sido realizada con �xito
        System.out.println("La eliminaci�n ha sido realizada con �xito...");
    }
    
    
}

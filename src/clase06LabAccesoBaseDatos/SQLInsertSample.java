/*
 * SQLInsertSample.java
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
public class SQLInsertSample {
    
    /** Creates a new instance of SQLInsertSample */
    public SQLInsertSample() {
    }

    public static void main(String[] args) throws Exception
    {
        // Define la conexion
        Connection laConexion = AdministradorDeConexiones.getConnection();
    
        // Arma la sentencia de inserci�n y la ejecuta
        String laInsercion = "INSERT INTO alumnos (alu_id, alu_nombre, alu_apellido) VALUES (101, 'Manuel', 'Santos')";
        Statement stmtInsercion = laConexion.createStatement();
        stmtInsercion.execute(laInsercion);
        
        // Cierra el Statement y la Connection
        stmtInsercion.close();
        laConexion.close();
        
        // Informa que la inserci�n ha sido realizada con �xito
        System.out.println("La inserci�n ha sido realizada con �xito...");
        
    }
    
}

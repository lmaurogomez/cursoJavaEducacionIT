/*
 * AdministradorDeConexiones.java
 *
 *
 */

package clase06_AccesoBaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Sebasti�n S. Sanga <SebastianSanga@gmail.com>
 */
public abstract class AdministradorDeConexiones {
    
    /**
     * Creates a new instance of AdministradorDeConexiones
     */
    public AdministradorDeConexiones() {
    }

    public static Connection getConnection() throws Exception
    {
        
        // Establece la conexion a utilizar contra la base de datos
        String dbConnString = "jdbc:mysql://localhost:3306/test";
        
        // Establece el usuario de la base de datos
        String dbUser = "root";
        
        // Establece la contrase�a de la base de datos
        String dbPassword = "";
        
        // Retorna la conexion
        return DriverManager.getConnection(dbConnString, dbUser, dbPassword);
    }    
    
    public static void main (String args[])throws Exception{
        System.out.println(getConnection().isClosed());
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase06_JDBC_MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args){
            try{
                List<Empleados> empleado = new ArrayList<>();
                        //Conexion
                Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "");
                System.out.println("Conexion exitosa");
                
                // Para arrojar la lista de empleados y cargarlos a una list.
                String query = "select * from employees";
                Statement stm = c.createStatement();                   
                ResultSet rs = stm.executeQuery(query);       //ResultSet me devuelve la tabla de la BD
              /*  while (rs.next()){                            //next avanza por fila de la tabla de BD
                    int nroEmpleado = rs.getInt("emp_no");    //Para adquirir el dato, interseccion columna y fila
                    String nombre = rs.getString("first_name"); 
                    String apellido = rs.getString("last_name");
                    System.out.println(nroEmpleado + " " + nombre + " " + apellido);
                    empleado.add(new Empleados(nroEmpleado,nombre,apellido));
                }
                */
              
                /* Prueba para mostrar lista cargada por BD
                for(Empleados e: empleado){
                    System.err.println(e.toString());
                }*/
                
                //Para buscar a un empleado mediante un parametro
                String nombre = "Alejandro";
                String query2 = "SELECT * FROM employees WHERE first_name = ?";
                PreparedStatement ps = c.prepareStatement(query2);      //PrepareStatement me permite adjudicar parametros
                ps.setString(1, nombre);                                //el "1" indica que la primer variable se reemplaza por nombre
                ResultSet rs2 = ps.executeQuery();
                while(rs2.next()){
                   int nroEmpleado2 = rs2.getInt("emp_no");    
                   String nombre2 = rs2.getString("first_name"); 
                   String apellido2 = rs2.getString("last_name");
                   System.out.println(nroEmpleado2 + " " + nombre2 + " " + apellido2);
                }
            }
            catch(SQLException e){
                System.out.println("Error");
            }
        
    }
}

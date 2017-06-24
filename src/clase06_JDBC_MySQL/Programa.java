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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Programa {

    public static void main(String[] args) {
        try {
            List<Empleados> empleado = new ArrayList<>();
            //Conexion
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "");
            System.out.println("Conexion exitosa");

//-------------------------Para arrojar la lista de empleados y cargarlos a una list.-------------------------------
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
//------------------------------Para buscar a un empleado mediante un parametro--------------------------------------------------
            /*  String nombre = "Alejandro";
                String query2 = "SELECT * FROM employees WHERE first_name = ?";
                PreparedStatement ps = c.prepareStatement(query2);      //PrepareStatement me permite adjudicar parametros
                ps.setString(1, nombre);                                //el "1" indica que la primer variable se reemplaza por nombre
                ResultSet rs2 = ps.executeQuery();
                while(rs2.next()){
                   int nroEmpleado2 = rs2.getInt("emp_no");    
                   String nombre2 = rs2.getString("first_name"); 
                   String apellido2 = rs2.getString("last_name");
                   System.out.println(nroEmpleado2 + " " + nombre2 + " " + apellido2);
                }*/
            
//-------------------------------------------Para insertar campos-------------------------------------------
            PreparedStatement psi = c.prepareStatement("Insert into employees (first_name,last_name,hire_date,birth_date,emp_no) values (?,?,?,?,?)");
            //Como hacer para fechas
            SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
            Date date = sdf.parse("23/06/2017");
            java.sql.Date dateSql = new java.sql.Date (date.getTime());
            
            SimpleDateFormat sdf2 = new SimpleDateFormat ("dd/MM/yyyy");
            Date date2 = sdf2.parse("24/06/2017");
            java.sql.Date dateSql2 = new java.sql.Date (date2.getTime());
            
            SimpleDateFormat sdf3 = new SimpleDateFormat ("dd/MM/yyyy");
            Date date3 = sdf3.parse("25/06/2017");
            java.sql.Date dateSql3 = new java.sql.Date (date3.getTime());
            
            SimpleDateFormat sdf4 = new SimpleDateFormat ("dd/MM/yyyy");
            Date date4 = sdf4.parse("26/06/2017");
            java.sql.Date dateSql4 = new java.sql.Date (date4.getTime());
            
            //insertar(psi, "Pedro", "Lupe",dateSql,dateSql3,10);
            //insertar(psi, "Arribas", "Garcia", dateSql2,dateSql4,11);
            
//----------------------Para Actualizar---------------------------------------------------------
            PreparedStatement psa = c.prepareStatement("UPDATE employees set first_name=?, last_name=? where emp_no=?");
            update(psa,"TuAbuela","Marta",-90001);
            update(psa,"TuAbuela","Juanita",10);
//----------------------Para Borrar------------------------------------------------------------
            PreparedStatement psb = c.prepareStatement ("DELETE from employees where emp_no = ?");
            borrar(psb,10001);
//---------------------------------------------------------------------------------------------
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    private static void insertar(PreparedStatement ps, String nombre, String apellido, java.sql.Date fechaAlta, java.sql.Date fechaCumple, int codEmpleado)throws Exception{
        ps.setString(1, nombre);
        ps.setString(2, apellido);
        ps.setDate(3, fechaAlta);
        ps.setDate(4, fechaCumple);
        ps.setInt(5, codEmpleado);
        ps.execute();
    }
    private static void update (PreparedStatement ps, String nombre, String apellido, int codEmpleado) throws Exception{
        ps.setString(1, nombre);
        ps.setString(2,apellido);
        ps.setInt(3, codEmpleado);
        ps.execute();
    }
    private static void borrar (PreparedStatement ps,int codEmpleado) throws Exception{
        ps.setInt(1, codEmpleado);
        ps.execute();
    }
}

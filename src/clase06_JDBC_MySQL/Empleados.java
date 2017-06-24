/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase06_JDBC_MySQL;

/**
 *
 * @author educacionit
 */
public class Empleados {
    private int codEmpleado;
    private String nombre;
    private String apellido;

    public Empleados(int codEmpleado, String nombre, String apellido) {
        this.codEmpleado = codEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "codEmpleado=" + codEmpleado + ", nombre=" + nombre + ", apellido=" + apellido ;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}

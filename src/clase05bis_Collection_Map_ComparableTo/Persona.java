
package clase05bis_Collection_Map_ComparableTo;

import java.util.Objects;
                                           
public class Persona implements Comparable<Persona>{            
    
    private String nombre;                 
    private String apellido;                
    private Integer dni;                       
    private int edad;                      
    
    Persona(String nombre,String apellido, Integer dni, int edad){
        this.nombre=nombre;                                    
        this.apellido=apellido;                                
        this.dni=dni;                                         
        this.edad=edad;
    }
    
    public void hablar(){
        System.out.println("Estoy hablando");
    }
                          
    
    public String getNombre(){                                
        return this.nombre;                                    
    }                                                         
    public String getApellido(){                              
        return this.apellido;                                 
    }
    public void setEdad(int edad){
        this.edad=edad;
    }

    @Override
    public int hashCode() {                      //modificado para que el HashSet solo verifique por DNI
        int hash = 5;
        hash = 97 * hash + this.dni;
        return hash;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.dni != other.dni) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return true;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Persona= " + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", edad=" + edad;
    }
    //CompareTO
    public int compareTo (Persona otra){
        return this.dni.compareTo (otra.dni);
    }
}

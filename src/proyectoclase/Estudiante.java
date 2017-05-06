
package proyectoclase;

import java.util.Objects;

public class Estudiante extends Persona{               //Extends, indica que Estudiante hereda de Persona
    private String legajo;
    Estudiante(String nombre, String apellido, int dni, int edad, String legajo) { 
        super(nombre, apellido, dni, edad);                  //super hereda el constructor de Persona
        this.legajo=legajo;
    }
    
    public void hablar(){
        System.out.println("Ahora hablo como un estudiante");
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Estudiante other = (Estudiante) obj;
        if (!Objects.equals(this.legajo, other.legajo)) {
            return false;
        }
        return true;
    }

    @Override
    public void caminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}






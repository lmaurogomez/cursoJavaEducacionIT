
package clase02_Clases_Constructor_Herencia_Abstract;

import java.util.Objects;
                                           //Abstract, clase que no puedo instanciar, es el mas generico
public abstract class Persona {            //en la herencia
    
    private String nombre;                 //Asigno los atributos a la clase
    private String apellido;               //El private hace que los atributos no los pueda acceder 
    private int dni;                       //publicamente. voy a tener que realizar los gets y sets
    private int edad;                      //para poder acceder a los datos.
    
    Persona(String nombre,String apellido, int dni, int edad){ //Constructor, me sirve para luego llamar
        this.nombre=nombre;                                    //a la clase y asignarle los valores
        this.apellido=apellido;                                //el this hace referencia a la propia
        this.dni=dni;                                          //clase, es como decir p.nombre=nombre;
        this.edad=edad;
    }
    
    public void hablar(){
        System.out.println("Estoy hablando");
    }
    
    public abstract void caminar();                           //Este metodo abstracto sera diferente para
                                                              //cada hijo de la herencia, se implementa alli
    
    public String getNombre(){                                //get me devuelve los atributos private
        return this.nombre;                                   //getNombre me retornara el atributo nombre 
    }                                                         //de la clase Persona
    public String getApellido(){                              
        return this.apellido;                                 //BINS= clase+constructor+gets+sets
    }
    public void setEdad(int edad){
        this.edad=edad;
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
}


package clase02_Clases_Constructor_Herencia_Abstract;

public class ProyectoClase {

    public static void main(String[] args) {
       Persona p = new Estudiante("Ramiro","Margeli",35986548,25,"486");                  //Inicializo la instancia p de la clase Persona
       Persona p2 = new Estudiante("Ramiro","Mauro",387875125,22,"458");
       Estudiante e1 = new Estudiante("Pedro","Martinez",486941845,18,"12345");
       Persona p3 = new Estudiante("Pable","Gonzales",4864854,52,"879540");
      
       System.out.println("Profesores:");
       System.out.println("Nombre: " + p.getNombre());
       System.out.println("Apellido: " + p.getApellido());
       System.out.println("Edad: "+ p.getEdad());
       System.out.println("Dni: "+ p.getDni());
       System.out.println("Nombre: " + p2.getNombre());
       System.out.println("Apellido: " + p2.getApellido());
       System.out.println("Edad: "+ p2.getEdad());
       System.out.println("Dni: "+ p2.getDni());
       System.out.println("Estudiantes:");
       System.out.println("Nombre: " + e1.getNombre());
       System.out.println("Apellido: " + e1.getApellido());
       System.out.println("Edad: "+ e1.getEdad());
       System.out.println("Dni: "+ e1.getDni());
       
       e1.hablar();               //Sigue siendo Estudiante
       p3.hablar();               //Sigue siendo Estudiante
       
       if(p.equals(p2))             //equals me permite comparar dos objetos
           System.out.println("Son iguales");       
       else
           System.out.println("No son iguales");
       
    }
    
}

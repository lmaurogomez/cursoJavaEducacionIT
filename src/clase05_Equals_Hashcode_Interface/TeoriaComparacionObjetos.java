
package clase05_Equals_Hashcode_Interface;

public class TeoriaComparacionObjetos {
    
}

/*                               Comparacion entre Objetos, Equals

Cuando comparamos con objetos se debe utilizar el equals(). EJ: a.equals(b) donde a y b son string.
Cuando comparamos con == , se utiliza para saber si dos punteros apuntan al mismo objeto, es decir 
que son dos referencias de la misma instancia de objeto.
El equals se puede modificar ya que, como sabemos que dos cosas sean iguales? A veces es generico
pero hay veces que se debe modificar para poder decir que dos cosas son iguales. 

EJ de forma manual de sobreescribir equals:

public boolea equals (Objetc o){
    Persona p = (Persona) o;
    return this.dni.equals(p.dni);
}

                                            Hashcode()

Se utiliza para que no se repitan objetos, es una optimizacion de equals. Genera un codigo "unico" para
las instancias. Se usa internamente.

                                            Interfaces

Es una declaración de comportamiento, es decir un conjunto de métodos sin su implementación.
Define un protocolo de comportamiento. Es un contrato que publica una clase para ser utilizada 
por otras clases. Puede heredar de otras interfaces.
Los metodos estaran implementados en las sub clases.

                                            PilaAbstracta
                                             /         \
                                         Pila         PilaEnlazada

public interface PilaAbstracta{      <- Interfaz
    void push(T e);
    T pop();
    boolean is Empty;
}


*/
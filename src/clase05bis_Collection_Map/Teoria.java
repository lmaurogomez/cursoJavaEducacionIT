
package clase05bis_Collection_Map;

public class Teoria {
    
}

/*
                                    Colecciones

Las colecciones (Collections) son el modo de agrupar objetos. También llamados contenedores, 
representa a un conjunto de ítems, un conjunto de objetos, que pueden ser homogéneos o no. 
Por ejemplo, una agenda es una colección de datos de personas.

                                     Collection
                                    /    |     \
                                  List  Set  Queue(colas)
                                         |
                                     Sorted Set

-Un set es una interfaz que no contiene valores duplicados.
-Una Lista es una colección ordenada que puede contener valores duplicados.
Puede contener elementos Nulos. Soporta manipulación de elementos via índices a través del metodo:
Object get(int indice), que permite obtener el elemento en la posición indice de la lista.

                                          Map

La interfaz Map provee tuplas del tipo Key-value, los objetos Map contienen claves o 
Keys asociadas con valores o values. Los Maps no pueden contener claves duplicadas y 
una clave puede ser asociada como máximo a un elemento.
Se utiliza: put(clave,valor) y get(clave).

*/
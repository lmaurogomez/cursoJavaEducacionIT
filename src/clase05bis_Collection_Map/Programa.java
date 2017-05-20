/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase05bis_Collection_Map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Programa {
    public static void main(String[] args) {
        List <String> nombres = new ArrayList<>();   //podria ser tambien new LinkedList<>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Arribas");
        System.out.println("Cantidad de nombres en la lista: " + nombres.size());
        System.out.println("El primer nombre es: " + nombres.get(0));  //se indexa, puedo buscar por posicion
        nombres.remove(0);
         //FOR EACH
        for(String e : nombres){    //por cada interacion de nombres, se guarda en "e"
           System.out.println(e);
        }
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------------------");
        Set <Persona> personas = new HashSet<>();
        personas.add (new Persona("Juan","Perez",30,38787251));
        personas.add (new Persona("Gonza","Rodriguez",35,38797251));
        personas.add (new Persona("Edgardo","Sierra",21,38787211));
        personas.add (new Persona("Menu","Samsung",50,38387251));
        for (Persona p: personas){
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Apellido: " + p.getApellido());
            System.out.println("DNI: " + p.getEdad());
            System.out.println("Edad: " + p.getDni());
            System.out.println("------------------------------");
        }
        
        SortedSet<String> ordenados = new TreeSet<>();
        ordenados.add("b");
        ordenados.add("z");
        ordenados.add("a");
        ordenados.add("c");
        
        for(String l: ordenados){
            System.out.println(l);
        }
        
          
        
    }
}

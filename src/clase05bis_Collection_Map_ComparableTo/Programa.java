/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase05bis_Collection_Map_ComparableTo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Programa {

    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("----------------------------Array----------------------------------------");
        //Array
        List<String> nombres = new ArrayList<>();   //podria ser tambien new LinkedList<>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Arribas");
        System.out.println("Cantidad de nombres en la lista: " + nombres.size());
        System.out.println("El primer nombre es: " + nombres.get(0));  //se indexa, puedo buscar por posicion
        nombres.remove(0);
        //FOR EACH
        for (String e : nombres) {    //por cada interacion de nombres, se guarda en "e"
            System.out.println(e);
        }
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("----------------------------TreeSetV1------------------------------------");
        
        //Set
        Set<Persona> personas = new HashSet<>();
        personas.add(new Persona("Juan", "Perez", 30, 38787251));
        personas.add(new Persona("Gonza", "Rodriguez", 35, 38797251));
        personas.add(new Persona("Edgardo", "Sierra", 21, 38787211));
        personas.add(new Persona("Menu", "Samsung", 50, 38387251));
        for (Persona p : personas) {
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Apellido: " + p.getApellido());
            System.out.println("DNI: " + p.getEdad());
            System.out.println("Edad: " + p.getDni());
            System.out.println("------------------------------");
        }
        
        //SortedSet TreeSetV1
        SortedSet<String> ordenados = new TreeSet<>();
        ordenados.add("b");
        ordenados.add("z");
        ordenados.add("a");
        ordenados.add("c");

        for (String l : ordenados) {
            System.out.println(l);
        }
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("-------------------------------TreeSetV2---------------------------------");
        
        //SortedSet TreeSetV2
        SortedSet<Persona> personasV2 = new TreeSet <Persona>();
        personasV2.add(new Persona("Juan", "Perez", 30, 38787251));
        personasV2.add(new Persona("Gonza", "Rodriguez", 350, 38797251));
        personasV2.add(new Persona("Edgardo", "Sierra", 21, 38787211));
        personasV2.add(new Persona("Menu", "Samsung", 50, 38387251));
        
        for (Persona p: personasV2){
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Apellido: " + p.getApellido());
            System.out.println("DNI: " + p.getEdad());
            System.out.println("Edad: " + p.getDni());
            System.out.println("------------------------------");
        }
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("---------------------------------Mapa------------------------------------");
        //Mapa
        Map <String, Persona> personasMapPorDNI = new HashMap<>();  //pongo edad xq me confundi al poner DNI
        personasMapPorDNI.put("30207581",new Persona("Juan", "Perez", 30207581, 15));
        personasMapPorDNI.put("30787251",new Persona("Lucas", "Mauro", 30787251, 20));
        personasMapPorDNI.put("38787251",new Persona("Ruperto", "Arribas", 38787251, 23));
        Persona p1 = personasMapPorDNI.get("30787251");   //Se debe implementar el toString si o si para visualizar
        System.out.println(p1);
        //Como recorrer un mapa de tres formas
        //para obtener los values
        System.out.println("-----------Values-------------------");
        for(Persona p: personasMapPorDNI.values()){
            System.out.println(p);
        }
        //para obtener las keys
        System.out.println("--------------Keys----------------");
        for(String k: personasMapPorDNI.keySet()){
            System.out.println(k + ":" + personasMapPorDNI.get(k));
        }
        //entrySet
        System.out.println("--------------entrySet----------------");
        for(Map.Entry<String,Persona> e: personasMapPorDNI.entrySet()){
            System.out.println(e.getKey() + ":" + e.getValue());
        }
        


    }
}

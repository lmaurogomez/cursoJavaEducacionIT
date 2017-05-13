/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase03_EjZoologico_UsoStatic;

import java.util.Date;
import clase03_EjZoologico_UsoStatic.Cuidador;

/**
 *
 * @author educacionit
 */
public class Zoologico {
    public static final int CANTIDAD_ANIMALES = 25;                //es un parametro que puedo acceder 
    public static final int RACIONES_POR_ANIMALES = 5;             //sin hacer un new Zoologico
    private boolean estadoZoo = false;        //true abierto,false cerrado
    
    public void abrirZoo(){
        estadoZoo = true;
        System.out.println("El Zoo acaba de abrir");
    }
    public void cerrarZoo(){
        estadoZoo = false;
        System.out.println("El Zoo acaba de cerrar");
    }
    public void alimentarAnimales(int cantRaciones){
        Cuidador c = new Cuidador("pepe",new Date (2017,5,5),cantRaciones);
        c.alimentarAnimales();
    }
}
  

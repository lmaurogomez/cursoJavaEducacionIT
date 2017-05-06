/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase04;

import java.util.Date;
import clase04.Cuidador;

/**
 *
 * @author educacionit
 */
public class Zoologico {
    public final int CANTIDAD_ANIMALES = 25;
    public final int RACIONES_POR_ANIMALES = 5;
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
        c.alimentarAnimales(this);
    }
}
  

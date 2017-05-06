/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase04;

import java.util.Date;

/**
 *
 * @author educacionit
 */
public class Cuidador extends Persona{
    private final int cantRaciones;
    
    public Cuidador(String nombre, Date fechaNacimiento, int cantRaciones) {
        super(nombre, fechaNacimiento);
        this.cantRaciones = cantRaciones;
    }
    
    public void alimentarAnimales(Zoologico z){
        System.out.println("El Zoo cuenta con " + z.CANTIDAD_ANIMALES + " animales y debemos darle a cada uno " + z.RACIONES_POR_ANIMALES + " raciones ");
        if(this.cantRaciones >= z.CANTIDAD_ANIMALES * z.RACIONES_POR_ANIMALES)
            System.out.println("Las raciones alcanzan");
        else
            System.out.println("Las raciones NO alcanzan");
    }
    
}

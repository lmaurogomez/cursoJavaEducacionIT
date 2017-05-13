/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase03_EjZoologico_UsoStatic;

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
                                            // Aca me sirve lo del static, no necesito pasarle
    public void alimentarAnimales(){        // al metodo una clase Zoologico para acceder a los datos.
        System.out.println("El Zoo cuenta con " + Zoologico.CANTIDAD_ANIMALES + " animales y debemos darle a cada uno " + Zoologico.RACIONES_POR_ANIMALES + " raciones ");
        System.out.println("La ración mínima debe ser de " +  Zoologico.CANTIDAD_ANIMALES * Zoologico.RACIONES_POR_ANIMALES);
        if(this.cantRaciones >= Zoologico.CANTIDAD_ANIMALES * Zoologico.RACIONES_POR_ANIMALES)
            System.out.println("Las raciones alcanzan");
        else
            System.out.println("Las raciones NO alcanzan");
    }
    
}

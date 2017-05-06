/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase04_EjZoologico_UsoStatic;

/**
 *
 * @author educacionit
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        zoo.abrirZoo();
        zoo.alimentarAnimales(251);
        zoo.cerrarZoo();
    }
    
}

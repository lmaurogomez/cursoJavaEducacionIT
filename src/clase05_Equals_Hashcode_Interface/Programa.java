package clase05_Equals_Hashcode_Interface;

//push para meter,pop para sacar,
//isempty para ver si esta vacia

public class Programa {

    public static void main(String[] args) {   
       Pila p = new Pila(7);
       try{
            p.push("D");
            p.push(2);
            p.push("B");
            p.push("A");
            p.push("k");
            p.push(87);
            p.pop();          //si pongo mas pop hasta vaciarla me saltaria el error                 
       }
       catch(PilaLlenaException e){
           System.out.println("Pila Llena");
       }
       catch(PilaVaciaException e){
           System.out.println("Pila Vacia");
       }
       p.recorrerPila();
               
               
        
    }

}

package clase04_EstructuraDeDatosPila;

//push para meter,pop para sacar,
//isempty para ver si esta vacia

public class Programa {

    public static void main(String[] args) {   
       Pila p = new Pila(5);
       p.push("D");
       p.push(2);
       p.push("B");
       p.push("A");
       p.push("k");
       p.push(87);
       p.recorrerPila();
    }

}

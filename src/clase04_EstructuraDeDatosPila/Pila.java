
package clase04_EstructuraDeDatosPila;

public class Pila {
    private final int max;
    private Object[] elementos;
    private int tope = -1;

    public Pila(int max) {
        this.max = max;
        elementos = new Object [max];
    }
    
    public void push(Object elemento){
        if (tope == max-1){
            System.out.println("La pila esta llena");
        }
        else{
            tope++;
            elementos[tope] = elemento;
        }   
    }
    
    public Object pop(){
        if(tope != -1){
            Object e = elementos[tope];
            elementos[tope--]=null;
            return e;                                    //--tope  se decrementa primero
        }                                                //tope-- se decrementa luego
        else
            System.out.println("Pila vacia");
            return null;
    }
    
    public boolean isEmpty(){
        return tope == -1;
    }
   
    public void recorrerPila(){   
        while(!this.isEmpty()){
            System.out.println(elementos[tope--]);
        }
    }
}

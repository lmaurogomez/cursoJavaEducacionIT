
package clase05_Equals_Hashcode_Interface;

public class Pila {
    private final int max;
    private Object[] elementos;
    private int tope = -1;

    public Pila(int max) {
        this.max = max;
        elementos = new Object [max];
    }
    
    public void push(Object elemento) throws PilaLlenaException{
        if (tope == max-1){
            throw new PilaLlenaException();
        }
        else{
            tope++;
            elementos[tope] = elemento;
        }   
    }
    
    public Object pop() throws PilaVaciaException{
        if(tope != -1){
            Object e = elementos[tope];
            elementos[tope--]=null;
            return e;                                    //--tope  se decrementa primero
        }                                                //tope-- se decrementa luego
        else
            throw new PilaVaciaException();
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

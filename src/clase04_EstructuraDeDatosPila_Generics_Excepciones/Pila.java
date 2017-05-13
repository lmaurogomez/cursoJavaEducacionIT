
package clase04_EstructuraDeDatosPila_Generics_Excepciones;

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
    
    /*                        Genericos        
            //sirve para implementar objetos en diferentes 
            //tipos de datos a futuro, hoy puede ser int y mañana String si quiero
    
    public class Pila < T >{
        private final int max;
        private T []elementos;
        private int tope = -1;
    
        public void empujar (T e){
        }
        
        public T sacar(){
        }
    
    }
    
    Clase programa, inicializacion
    
    Pila<String> p = new Pila <>();
    
    ---------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------
    ---------------------------------------------------------------------------------
   
    */
}

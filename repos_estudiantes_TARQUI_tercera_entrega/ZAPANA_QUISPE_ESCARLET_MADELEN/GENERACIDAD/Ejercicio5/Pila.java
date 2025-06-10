public class Pila <T> {
    private int  max=50;
    private int tope;
    private Object v[]=new Object[max+1];
     public Pila(){
        this.tope = 0;
    }

    public void adicionar(T elem){
        if(tope == max){
            System.out.println("Pila llena");
        }else{
            tope ++;
            v[tope] = elem;
        }
    }

    public T eliminar(){
        T elem = null;
        if(tope == 0){
            System.out.println("Pila vacia");
        }else{
            elem = (T) v[tope];
            tope--;
        }
        return elem;
    }

    public boolean esVacia(){
        return tope == 0;
    }

    public boolean esLlena(){
        return tope == max;
    }
}


import java.util.ArrayList;

public class Pila<T> {
        public ArrayList<T> elementos = new ArrayList<>();
        
        //a)
        public void apilar(T elemento){
                elementos.add(elemento);
        }
        
        //b)
        public T desapilar(){
            if(elementos.isEmpty() ){
                System.out.println("La pila está vacía");
                return null;
            }
            return elementos.remove(elementos.size()-1);
        }
        
        public void mostrar(){
            System.out.println("Contenido de la pila");
            for(int i = elementos.size()-1; i>= 0 ; i--){
                    System.out.println( elementos.get(i));
            }
        }
}

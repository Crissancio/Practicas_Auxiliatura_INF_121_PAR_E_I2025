
import java.util.ArrayList;

public class Catalogo <T>{
    private ArrayList <T>  elementos;

    public Catalogo() {
        this.elementos = new ArrayList<>();
    }
    

    //a)    
    public void agregar(T elemento){
        this.elementos.add(elemento);
    }

    public boolean  buscar(T elemento){
        for (int i = 0; i < this.elementos.size() ; i++) {
            if(this.elementos.get(i).equals(elemento)){
                return true;
            }
        }
        return false;
    }
    
}

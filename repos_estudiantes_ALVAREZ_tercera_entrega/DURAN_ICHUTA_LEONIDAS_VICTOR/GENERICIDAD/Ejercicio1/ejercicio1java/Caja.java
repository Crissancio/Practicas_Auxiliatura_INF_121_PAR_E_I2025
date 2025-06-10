package genericidad;
//a)
public class Caja <T>{
    private T contenido;
    
    public void guardar(T contenido){
        this.contenido = contenido;
    }
    public T obtenter(){
        return contenido;
    }
}

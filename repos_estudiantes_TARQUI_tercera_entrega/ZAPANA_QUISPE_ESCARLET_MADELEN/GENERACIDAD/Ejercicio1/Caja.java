package Generacidaduno;

/**
 *
 * @author ESCARLET
 */
public class Caja <T> {
    private T contenido;
    public void guardar( T v){
        contenido=v;
    }
    public T obtener(){
        return contenido;
    }
    
}

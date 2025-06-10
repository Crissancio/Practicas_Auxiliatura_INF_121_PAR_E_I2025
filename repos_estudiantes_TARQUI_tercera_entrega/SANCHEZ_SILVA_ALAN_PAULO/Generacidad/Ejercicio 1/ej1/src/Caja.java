
public class Caja<T> {
    private T  contenido ;

    //a)
    public void  guardar(T valor){
        contenido = valor;
    }

    public T obtener(){
        return this.contenido;
    }
}

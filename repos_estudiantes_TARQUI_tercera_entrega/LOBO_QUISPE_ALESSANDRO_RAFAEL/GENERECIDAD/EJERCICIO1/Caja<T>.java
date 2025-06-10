class Caja<T> {
    private T contenido;
    
    
    public void guardar(T nuevoContenido) {
        this.contenido = nuevoContenido;
    }
    
 
    public T obtener() {
        return contenido;
    }
}

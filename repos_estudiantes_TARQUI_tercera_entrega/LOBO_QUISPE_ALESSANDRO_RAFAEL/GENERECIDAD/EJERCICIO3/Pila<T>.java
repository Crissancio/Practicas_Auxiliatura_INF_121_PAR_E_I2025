class Pila<T> {
    private Nodo<T> cima;
    
    private static class Nodo<T> {
        T dato;
        Nodo<T> siguiente;
        
        Nodo(T dato) {
            this.dato = dato;
        }
    }
    
    // a) Método para apilar
    public void apilar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
    }
    
    // b) Método para desapilar
    public T desapilar() {
        if (cima == null) {
            throw new IllegalStateException("La pila está vacía");
        }
        T dato = cima.dato;
        cima = cima.siguiente;
        return dato;
    }
    
    // d) Método para mostrar los datos de la pila
    public void mostrar() {
        Nodo<T> actual = cima;
        System.out.print("Contenido de la pila (cima primero): ");
        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}

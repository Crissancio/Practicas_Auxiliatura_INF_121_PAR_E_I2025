package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Catalogo<T> {
    private List<T> elementos;

    public Catalogo() {
        this.elementos = new ArrayList<>();
    }

    public void agregarElemento(T elemento) {
        this.elementos.add(elemento);
    }

    public T buscarElemento(String criterio) {
        for (T elemento : elementos) {
            try {
                if (elemento instanceof Libro) {
                    Libro libro = (Libro) elemento;
                    if (libro.getTitulo().equals(criterio)) {
                        return elemento;
                    }
                } else if (elemento instanceof Producto) {
                    Producto producto = (Producto) elemento;
                    if (producto.getNombre().equals(criterio)) {
                        return elemento;
                    }
                }
            } catch (Exception e) {
                continue;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T elemento : elementos) {
            sb.append(elemento.toString()).append("\n");
        }
        return sb.toString();
    }
}
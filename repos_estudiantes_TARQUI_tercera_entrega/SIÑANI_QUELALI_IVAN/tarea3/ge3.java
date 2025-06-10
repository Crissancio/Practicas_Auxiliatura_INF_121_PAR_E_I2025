import java.util.ArrayList;
import java.util.List;
public class Catalogo<T> {
    private List<T> elementos = new ArrayList<>();
    public void agregar(T elemento) {
        elementos.add(elemento);
    }
    public T buscar(int indice) {
        if (indice >= 0 && indice < elementos.size()) {
            return elementos.get(indice);
        } else {
            return null; 
        }
    }
    public void mostrarCatalogo() {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        //libros
        Catalogo<String> catalogoLibros = new Catalogo<>();
        catalogoLibros.agregar("Cien años de soledad");
        catalogoLibros.agregar("El principito");
        catalogoLibros.mostrarCatalogo();

        //productos
        Catalogo<String> catalogoProductos = new Catalogo<>();
        catalogoProductos.agregar("Laptop - $1200");
        catalogoProductos.agregar("Smartphone - $800");
        catalogoProductos.mostrarCatalogo();
    }
}
//DIAGRAMA
//Clase Catalogo<T>
//---------------------------
//- elementos: List<T>
//---------------------------
//+ agregar(T elemento): void
//+ buscar(int indice): T
//+ mostrarCatalogo(): void
//---------------------------
//Clase Main
//---------------------------
//+ main(String[] args): void
//---------------------------

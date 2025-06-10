//3. Crea una clase genérica Catalogo<T> que almacene productos o libros.
import java.util.ArrayList;
import java.util.List;

// Clase genérica Catalogo<T>
public class Catalogo{

    public static class catalogo<T> {
        private List<T> elementos;

        public catalogo() {
            this.elementos = new ArrayList<>();
        }

        public void agregar(T elemento) {
            elementos.add(elemento);
        }

        public T buscar(String criterio) {
            for (T elemento : elementos) {
                if (elemento instanceof Libro) {
                    Libro libro = (Libro) elemento;
                    if (libro.titulo.contains(criterio))
                        return elemento;
                } else if (elemento instanceof Producto) {
                    Producto producto = (Producto) elemento;
                    if (producto.nombre.contains(criterio))
                        return elemento;
                }
            }
            return null;
        }
    }

    public static class Libro {
        public String titulo;
        public String autor;

        public Libro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        @Override
        public String toString() {
            return "-----Libro: " + titulo + " por Autor: " + autor;
        }
    }

    public static class Producto {
        public String nombre;
        public double precio;

        public Producto(String nombre, double precio) {
            this.nombre = nombre;
            this.precio = precio;
        }

        @Override
        public String toString() {
            return "------Producto: " + nombre + " - Precio: Bs." + String.format("%.2f", precio);
        }
    }

    public static void main(String[] args) {
        // Crear catálogo de libros
        catalogo<Libro> catalogoLibros = new catalogo<>();
        catalogoLibros.agregar(new Libro("El Principito", "Antoine de Saint-Exupéry"));
        catalogoLibros.agregar(new Libro("Metamorfosis", "Franz Kafka"));

        // Buscar y mostrar libro
        Object libroBuscado = catalogoLibros.buscar("El Principito");
        if (libroBuscado != null)
            System.out.println(libroBuscado);

        // Crear catálogo de productos
        catalogo<Producto> catalogoProductos = new catalogo<>();
        catalogoProductos.agregar(new Producto("Refrigeradora", 2000));
        catalogoProductos.agregar(new Producto("Licuadora", 250));

        // Buscar y mostrar producto
        Object productoBuscado = catalogoProductos.buscar("Refrigeradora");
        if (productoBuscado != null)
            System.out.println(productoBuscado);
    }

    @Override
    public String toString() {
        return "Catalogo []";
    }
}

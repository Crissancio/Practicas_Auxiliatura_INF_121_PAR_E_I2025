import java.util.ArrayList;

class Catalogo<T> {
    private ArrayList<T> elementos = new ArrayList<>();

    public void agregar(T item) {
        elementos.add(item);
    }

    public boolean buscar(T item) {
        return elementos.contains(item);
    }

    public void mostrarTodo() {
        for (T item : elementos) {
            System.out.println(item);
        }
    }
}

class Libro {
    String titulo;

    Libro(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Libro: " + titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Libro) {
            return this.titulo.equals(((Libro) o).titulo);
        }
        return false;
    }
}

class Producto {
    String nombre;

    Producto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Producto) {
            return this.nombre.equals(((Producto) o).nombre);
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Catalogo<Libro> catalogoLibros = new Catalogo<>();
        catalogoLibros.agregar(new Libro("El Principito"));
        catalogoLibros.agregar(new Libro("1984"));
        System.out.println("Buscar '1984': " + catalogoLibros.buscar(new Libro("1984")));
        catalogoLibros.mostrarTodo();

        Catalogo<Producto> catalogoProductos = new Catalogo<>();
        catalogoProductos.agregar(new Producto("Laptop"));
        catalogoProductos.agregar(new Producto("Mouse"));
        System.out.println("Buscar 'Teclado': " + catalogoProductos.buscar(new Producto("Teclado")));
        catalogoProductos.mostrarTodo();
    }
}
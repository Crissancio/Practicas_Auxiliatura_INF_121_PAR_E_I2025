package Generecidad.Ejercicio3.Java;
import java.util.ArrayList;
import java.util.List;


public class Catalogo<T extends Buscarable> {
    private List<T> elementos;

    public Catalogo() {
        this.elementos = new ArrayList<>();
    }

    // a) 

    public void agregarElemento(T elemento) {
        this.elementos.add(elemento);
        System.out.println("Elemento agregado al catalogo: " + elemento);
    }


    public T buscarElemento(String criterio) {
        System.out.println("Buscando '" + criterio + "' en el catalogo");
        for (T elemento : elementos) {
            if (elemento.esSimilar(criterio)) { 
                return elemento;
            }
        }
        return null; 
    }

    public void mostrarCatalogo() {
        if (elementos.isEmpty()) {
            System.out.println("El catalogo esta vacio");
            return;
        }

        System.out.println("\n--- Contenido Actual del Catalogo ---");
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
        System.out.println("------------------------------------");
    }
}

package Generecidad.Ejercicio3.Java;

public class Producto implements Buscarable {
    private String nombre;
    private String codigo;
    private double precio;

    public Producto(String nombre, String codigo, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return String.format("Producto: '%s' (Codigo: %s, Precio: $%.2f)", nombre, codigo, precio);
    }

    @Override
    public boolean esSimilar(String criterio) {
        String lowerCaseCriterio = criterio.toLowerCase();
        return this.nombre.toLowerCase().contains(lowerCaseCriterio) ||
               this.codigo.toLowerCase().contains(lowerCaseCriterio);
    }
}

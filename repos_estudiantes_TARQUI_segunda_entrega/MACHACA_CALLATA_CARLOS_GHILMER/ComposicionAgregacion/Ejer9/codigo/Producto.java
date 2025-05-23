package ComposicionAgregacion.Ejer9.codigo;

public class Producto {
    public String nombre;
    public double precio;

    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrar_info(){
        System.out.println("Nombre : " + nombre);
        System.out.println("Precio : " + precio + " Bs ");

    }
    
}

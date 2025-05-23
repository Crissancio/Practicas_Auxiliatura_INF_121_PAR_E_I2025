public class Habitacion {
    public String nombre;
    public double  tamaño;
    public Habitacion(String nombre, double tamaño) {
        this.nombre = nombre;
        this.tamaño = tamaño;
    }
    public String toString(){
        return "-------------Habitacion--------------\n" +
                "Nombre: " + nombre + "\n" +
                "Tamaño: " + tamaño + " metros cuadrados"+"\n" ;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getTamaño() {
        return tamaño;
    }
    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
}

import java.util.ArrayList;
class Vehiculo {
    public String marca;
    public String modelo;
    public int anio;
    public Vehiculo(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }
    public void mostrar() {
        System.out.println("Vehículo: " + marca + " " + modelo + ", Año: " + anio);
    }
}
class Conductor {
    public String nombre;
    public String licencia;
    public Conductor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }
    public void mostrar() {
        System.out.println("Conductor: " + nombre + ", Licencia: " + licencia);
    }
}
class Flota {
    public ArrayList<Vehiculo> vehiculos;
    public ArrayList<Conductor> conductores;
    public Flota() {
        vehiculos = new ArrayList<>();
        conductores = new ArrayList<>();
    }
    public void agregar(Vehiculo v) {
        vehiculos.add(v);
    }
    public void Conductor(Conductor c) {
        conductores.add(c);
    }
    public void mostrar() {
        System.out.println("Flota de vehículos:");
        for (Vehiculo v : vehiculos) {
            v.mostrar();
        }
        System.out.println("Conductores:");
        for (Conductor c : conductores) {
            c.mostrar();
        }
    }
}
public class Ej10 {
    public static void main(String[] args) {
        Flota f = new Flota();
        f.agregar(new Vehiculo("Toyota", "Corolla", 2018));
        f.agregar(new Vehiculo("Ford", "F-150", 2020));
        f.Conductor(new Conductor("Laura", "ABC123"));
        f.Conductor(new Conductor("Miguel", "XYZ789"));
        f.mostrar();
    }
}

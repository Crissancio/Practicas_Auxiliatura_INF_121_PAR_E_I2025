import java.util.ArrayList;

public class Vehiculo {
    private String tipo;
    private String marca;
    private ArrayList<Parte> partes;

    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
        this.partes = new ArrayList<>();
    }

    public void agregarParte(Parte parte) {
        partes.add(parte);
    }

    public void mostrar() {
        System.out.println("Vehículo tipo: " + tipo + ", Marca: " + marca);
        System.out.println("Partes:");
        for (Parte p : partes) {
            p.mostrar();
        }
    }

    public static void main(String[] args) {
        Vehiculo avion = new Vehiculo("Avión", "Boeing 747");
        avion.agregarParte(new Parte("Motor", 2500));
        avion.agregarParte(new Parte("Ala izquierda", 1500));
        avion.agregarParte(new Parte("Ala derecha", 1500));
        avion.agregarParte(new Parte("Cabina", 1200));
        avion.mostrar();
    }
}


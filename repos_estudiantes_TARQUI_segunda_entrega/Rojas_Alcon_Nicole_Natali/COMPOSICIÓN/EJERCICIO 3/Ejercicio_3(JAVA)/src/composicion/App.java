package composicion;

public class App {
    public static void main(String[] args) {
        Avion avion = new Avion("Boeing 737", "Boeing Company");
        Parte motor = new Parte("Motor", 4500);
        Parte ala = new Parte("Ala izquierda", 3000);
        Parte ala2 = new Parte("Ala derecha", 3000);
        Parte tren = new Parte("Tren de aterrizaje", 1500);

        avion.agregarParte(motor);
        avion.agregarParte(ala);
        avion.agregarParte(ala2);
        avion.agregarParte(tren);
        avion.mostrarAvion();
    }
}

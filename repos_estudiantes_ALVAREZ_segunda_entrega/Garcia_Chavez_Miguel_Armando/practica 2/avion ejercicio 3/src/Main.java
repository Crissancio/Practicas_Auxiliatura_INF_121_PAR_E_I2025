public class Main {
    public static void main(String[] args) {
        Avion avion = new Avion("Boeing 747", "Boeing");
        avion.agregarParte(new Parte("Ala izquierda", 1500));
        avion.agregarParte(new Parte("Ala derecha", 1500));
        avion.agregarParte(new Parte("Motor 1", 2000));
        avion.agregarParte(new Parte("Tren de aterrizaje", 3000));
        avion.mostrarAvion();
    }
}
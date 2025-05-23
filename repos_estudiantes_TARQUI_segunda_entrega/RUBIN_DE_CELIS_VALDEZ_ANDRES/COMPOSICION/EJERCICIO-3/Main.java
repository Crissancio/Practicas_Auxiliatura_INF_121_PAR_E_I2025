public class Main {

    public static void main(String[] args) {
        Avion avion = new Avion("Boeing 747", "Boeing");

        avion.agregarParte(new Parte("Motor", 2000));
        avion.agregarParte(new Parte("Ala izquierda", 5000));
        avion.agregarParte(new Parte("Ala derecha", 5000));
        avion.agregarParte(new Parte("Tren de aterrizaje", 1500));

        avion.mostrarAvion();
    }
}

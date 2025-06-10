package ComposicionyAgregacion.Composicion.Ej3;

public class Main {
    public static void main(String[] args) {
        Avion boeing = new Avion("737 MAX", "Boeing");

        boeing.agregarParte(new Parte("Motor", 2500));
        boeing.agregarParte(new Parte("Ala Izquierda", 1800));
        boeing.agregarParte(new Parte("Ala Derecha", 1800));
        boeing.agregarParte(new Parte("Tren de Aterrizaje", 1200));

        boeing.mostrarAvion();
    }
}

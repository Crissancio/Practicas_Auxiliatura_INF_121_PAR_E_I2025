package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Avion avionComercial = new Avion("Boeing 747", "Boeing");
        
        Parte motor = new Parte("Motor JT9D", 4000);
        Parte alaIzquierda = new Parte("Ala izquierda", 1500);
        Parte alaDerecha = new Parte("Ala derecha", 1500);
        Parte trenAterrizaje = new Parte("Tren de aterrizaje principal", 2500);
        
        avionComercial.agregarParte(motor);
        avionComercial.agregarParte(alaIzquierda);
        avionComercial.agregarParte(alaDerecha);
        avionComercial.agregarParte(trenAterrizaje);
        
        avionComercial.mostrarAvion();
    }
}
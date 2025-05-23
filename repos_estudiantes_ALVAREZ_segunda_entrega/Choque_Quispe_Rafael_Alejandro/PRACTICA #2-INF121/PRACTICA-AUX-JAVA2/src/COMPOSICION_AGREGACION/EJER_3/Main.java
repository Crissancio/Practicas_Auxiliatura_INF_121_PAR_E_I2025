package COMPOSICION_AGREGACION.EJER_3;
public class Main{
    public static void main(String[] args) {
        Avion boeing747 = new Avion("747", "Boeing");
        Parte motor1 = new Parte("Motor izquierdo", 4500);
        Parte motor2 = new Parte("Motor derecho", 4500);
        Parte alaIzquierda = new Parte("Ala izquierda", 12000);
        Parte alaDerecha = new Parte("Ala derecha", 12000);
        Parte trenAterrizaje = new Parte("Tren de aterrizaje", 8000);
        Parte fuselaje = new Parte("Fuselaje principal", 30000);
        // Agregar partes al avión
        boeing747.agregarParte(motor1);
        boeing747.agregarParte(motor2);
        boeing747.agregarParte(alaIzquierda);
        boeing747.agregarParte(alaDerecha);
        boeing747.agregarParte(trenAterrizaje);
        boeing747.agregarParte(fuselaje);
        // Mostrar información del avión
        boeing747.mostrarAvion();
    }
}

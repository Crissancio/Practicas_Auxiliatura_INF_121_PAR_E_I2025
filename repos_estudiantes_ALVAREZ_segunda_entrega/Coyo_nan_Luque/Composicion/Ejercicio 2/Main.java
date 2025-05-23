public class Main {
    public static void main(String[] args) {
        Parte motor = new Parte("Motor Turbofan", 1500);
        Parte alaIzquierda = new Parte("Ala izquierda", 800);
        Parte alaDerecha = new Parte("Ala derecha", 800);
        Parte trenDelantero = new Parte("Tren de aterrizaje delantero", 300);
        Parte trenTrasero = new Parte("Tren de aterrizaje trasero", 400);

        Avion Amazonas = new Avion("Avion Amazonas", "Boeing");
        Amazonas.agregar_parte(motor)
		Amazonas.agregar_parte(ala_izquierda)
		Amazonas.agregar_parte(ala_derecha)
		Amazonas.agregar_parte(tren_delantero)
		Amazonas.agregar_parte(tren_trasero)

        System.out.println(Amazonas.mostrarAvion());
    }
}
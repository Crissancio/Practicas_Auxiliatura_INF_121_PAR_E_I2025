//2. Crea un POO de clases para modelar un avión y sus partes. El avión está compuesto por partes como el motor, las alas y el tren de aterrizaje. Si el avión se destruye, las partes también se destruyen.
public class Main {
    public static void main(String[] args) {
        // b) Crea un avión y agrega varias partes.
        Avion avion = new Avion("Hercules", "Howard Hughes", null);
        avion.agregar_parte(new Parte("Motor", 600.56f));
        avion.agregar_parte(new Parte("Alas", 7000.86f));
        avion.agregar_parte(new Parte("Tren de aterrizaje", 550.45f));
        System.out.println("c) Muestra la información del avión y sus partes.");
        avion.mostrar_avion();
    }
}

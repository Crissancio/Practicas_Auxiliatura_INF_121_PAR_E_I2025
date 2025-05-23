public class App3 {
    public static void main(String[] args) throws Exception {
        Avion avion = new Avion("Boeing 747", "Boeing");
        avion.agregarParte(new Parte("Ala", 1000));
        avion.agregarParte(new Parte("Motor", 500));
        avion.agregarParte(new Parte("Cabina", 200));
        avion.agregarParte(new Parte("Rueda", 50));
        avion.agregarParte(new Parte("Fuselaje", 1500));
        avion.agregarParte(new Parte("Timón", 300));
        avion.agregarParte(new Parte("Flaps", 200));

        System.out.println(avion);
    }
}

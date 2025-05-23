public class Main {
    public static void main(String[] args) {
 
        BloqueCofre cofre1 = new BloqueCofre("Madera", 20, 100);
        BloqueCofre cofre2 = new BloqueCofre("Hierro", 30, 150);
        BloqueTnt tnt1 = new BloqueTnt("Estándar", 90);
        BloqueTnt tnt2 = new BloqueTnt("Avanzado", 120);
        BloqueHorno horno1 = new BloqueHorno("Piedra", "Gris", 5);
        BloqueHorno horno2 = new BloqueHorno("Hierro", "Negro", 8);

        cofre1.accion();
        tnt1.accion();
        horno1.accion();

        cofre1.colocar("suelo");
        tnt1.colocar("pared");
        horno1.colocar("techo");

        cofre1.romper();
        tnt1.romper();
        horno1.romper();
    }
}
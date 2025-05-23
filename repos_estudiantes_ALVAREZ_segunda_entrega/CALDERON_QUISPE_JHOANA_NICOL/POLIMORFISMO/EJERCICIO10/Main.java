package EJERCICIO10;

public class Main {
    public static void main(String[] args) {

        BloqueCofre cofre1 = new BloqueCofre(100, 50, "Madera");
        BloqueCofre cofre2 = new BloqueCofre(150, 80, "Hierro");

        BloqueHorno horno1 = new BloqueHorno("Rojo", 10);
        BloqueHorno horno2 = new BloqueHorno("Azul", 20);

        BloqueTnt tnt1 = new BloqueTnt("Normal", 200);
        BloqueTnt tnt2 = new BloqueTnt("Especial", 500);

        cofre1.accion();
        cofre1.colocar("Suelo");
        cofre1.romper();

        cofre2.accion();
        cofre2.colocar("Pared");
        cofre2.romper();

        horno1.accion();
        horno1.colocar("Suelo");
        horno1.romper();

        horno2.accion();
        horno2.colocar("Pared");
        horno2.romper();

        tnt1.accion();
        tnt1.colocar("Suelo");
        tnt1.romper();

        tnt2.accion();
        tnt2.colocar("Pared");
        tnt2.romper();
    }
}

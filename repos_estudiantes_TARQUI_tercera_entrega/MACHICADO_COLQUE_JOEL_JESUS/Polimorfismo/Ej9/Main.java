package Polimorfismo.Ej9;

public class Main {
    public static void main(String[] args) {
        // Crear objetos
        BloqueCofre cofre1 = new BloqueCofre("Cofre de Madera", 20, 5);
        BloqueCofre cofre2 = new BloqueCofre("Cofre de Hierro", 40, 10);

        BloqueTnt tnt1 = new BloqueTnt("TNT Roja", 100);
        BloqueTnt tnt2 = new BloqueTnt("TNT Azul", 120);

        BloqueHorno horno1 = new BloqueHorno("Gris", 4);
        BloqueHorno horno2 = new BloqueHorno("Negro", 6);

        // Ejecutar acciones
        cofre1.accion();
        cofre2.colocar();
        cofre2.colocar("pared");
        cofre2.romper();

        tnt1.accion();
        tnt1.colocar("suelo");
        tnt1.romper();

        horno1.accion();
        horno2.colocar("esquina");
        horno2.romper();
    }
}

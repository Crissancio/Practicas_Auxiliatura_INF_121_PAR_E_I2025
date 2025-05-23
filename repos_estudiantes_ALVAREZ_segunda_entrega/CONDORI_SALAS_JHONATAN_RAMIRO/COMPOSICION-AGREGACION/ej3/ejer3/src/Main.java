public class Main {
    public static void main(String[] args) {
        Motor motor1 = new Motor("Turbofan");
        Ala ala1 = new Ala(20);
        Ala ala2 = new Ala(20);
        TrenAterrizaje tren1 = new TrenAterrizaje("Retráctil");
        Ala[] alas = { ala1, ala2 };
        Avion avion1 = new Avion("Boeing 737", motor1, alas, tren1);
        avion1.mostrarInfo();
    }
}
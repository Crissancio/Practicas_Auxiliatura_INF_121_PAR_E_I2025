public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Suzuki", "Focus");

        coche1.acelerar();
        coche1.frenar();

        coche2.acelerar();
        coche2.frenar();

        System.out.println("Velocidad de " + coche1.getMarca() + " " + coche1.getModelo() + ": " + coche1.getVelocidad()
                + " km/h");
        System.out.println("Velocidad de " + coche2.getMarca() + " " + coche2.getModelo() + ": " + coche2.getVelocidad()
                + " km/h");
    }
}

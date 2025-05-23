/// "NOMBRE: QUENTA MAMANI NICK RANDY"
/// "CI: 10037571"
///
/// "3. Crea una clase Coche con marca, modelo y velocidad"
/// "a) Agrega un método acelerar () que aumente la velocidad en 10"
/// "b) Agrega un método frenar () que disminuya la velocidad en 5"
/// "c) Crea dos coches, aceléralos, frénalos y muestra sus velocidades"
///
public class Coche {
    private String marca;
    private String modelo;
    private int velocidad;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    public void acelerar() {
        velocidad += 10;
    }

    public void frenar() {
        velocidad -= 5;
    }

    public String mostrarVelocidad() {
        return marca + " " + modelo + " tiene una velocidad de " + velocidad + " km/h.";
    }

    public static void main(String[] args) {
        Coche auto1 = new Coche("Toyota", "Supra");
        Coche auto2 = new Coche("Nissan", "skyline gtr r34");

        auto1.acelerar();
        auto2.acelerar();

        auto1.frenar();
        auto2.frenar();

        System.out.println(auto1.mostrarVelocidad());
        System.out.println(auto2.mostrarVelocidad());
    }
}

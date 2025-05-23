package sonido;

public class Perro extends Animal {
    int edad;
    String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre);
        this.edad = edad;
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro " + nombre + " ladra: ¡Guau!");
    }

    @Override
    public void moverse() {
        System.out.println("El perro " + nombre + " corre.");
    }
}
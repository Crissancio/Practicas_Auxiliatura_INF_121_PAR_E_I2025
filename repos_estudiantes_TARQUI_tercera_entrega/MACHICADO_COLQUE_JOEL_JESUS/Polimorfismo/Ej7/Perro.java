package Polimorfismo.Ej7;

public class Perro extends Animal {
    private int edad;
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        super(nombre);
        this.edad = edad;
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau guau!");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " corre rápidamente.");
    }
}

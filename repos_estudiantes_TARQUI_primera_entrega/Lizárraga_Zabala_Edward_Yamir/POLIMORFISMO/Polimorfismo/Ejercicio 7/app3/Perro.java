
package app3;

public class Perro {
    private String nombre;
    private int edad;
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: Guau guau!");
    }

    public void moverse() {
        System.out.println(nombre + " esta corriendo.");
    }
}


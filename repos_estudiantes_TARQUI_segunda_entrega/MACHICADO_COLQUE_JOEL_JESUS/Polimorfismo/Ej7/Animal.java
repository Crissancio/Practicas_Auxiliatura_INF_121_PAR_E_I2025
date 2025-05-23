package Polimorfismo.Ej7;

public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("Sonido genérico de animal");
    }

    public void moverse() {
        System.out.println("Este animal se mueve de alguna forma");
    }
}

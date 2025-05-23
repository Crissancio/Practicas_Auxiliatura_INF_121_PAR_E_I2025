public class Elefante extends Animal {
    private int peso;

    public Elefante(String nombre, int edad, int peso) {
        super(nombre, edad);
        this.peso = peso;
    }

    @Override
    public String emitirSonido() {
        return nombre + " barrita con un peso de " + peso + " kg";
    }
}

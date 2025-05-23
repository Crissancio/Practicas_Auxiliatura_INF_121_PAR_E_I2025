class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " maúlla: ¡Miau miau!");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " salta y trepa.");
    }
}
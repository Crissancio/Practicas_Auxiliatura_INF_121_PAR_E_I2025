class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ladra: ¡Guau guau!");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " corre y salta.");
    }
}
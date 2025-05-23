class Pajaro extends Animal {
    public Pajaro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " canta: ¡Pío pío!");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " vuela y salta.");
    }
}
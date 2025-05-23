class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido.");
    }

    public void moverse() {
        System.out.println(nombre + " se mueve.");
    }
}
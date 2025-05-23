class Bloque {
    protected String tipo;

    public Bloque(String tipo) {
        this.tipo = tipo;
    }

    public void accion() {
        System.out.println("Acción genérica para el bloque de tipo " + tipo);
    }

    public void colocar(String orientacion) {
        System.out.println("Colocando el bloque de tipo " + tipo + " en la orientación " + orientacion);
    }

    public void romper() {
        System.out.println("Rompiendo el bloque de tipo " + tipo);
    }
}
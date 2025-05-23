class BloqueCofre extends Bloque {
    private int capacidad;
    private int resistencia;

    public BloqueCofre(String tipo, int capacidad, int resistencia) {
        super(tipo);
        this.capacidad = capacidad;
        this.resistencia = resistencia;
    }

    @Override
    public void accion() {
        System.out.println("Abriendo el cofre de tipo " + tipo + " con capacidad " + capacidad + " y resistencia " + resistencia);
    }

    @Override
    public void romper() {
        System.out.println("Rompiendo el cofre de tipo " + tipo + ". ¡Se liberan los objetos almacenados!");
    }
}
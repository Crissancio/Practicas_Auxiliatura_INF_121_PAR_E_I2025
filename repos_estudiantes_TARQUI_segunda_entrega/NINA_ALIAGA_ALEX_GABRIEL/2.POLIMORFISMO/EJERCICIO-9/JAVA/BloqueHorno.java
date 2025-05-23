class BloqueHorno extends Bloque {
    private String color;
    private int capacidadComida;

    public BloqueHorno(String tipo, String color, int capacidadComida) {
        super(tipo);
        this.color = color;
        this.capacidadComida = capacidadComida;
    }

    @Override
    public void accion() {
        System.out.println("Cocinando en el horno de tipo " + tipo + " y color " + color + " con capacidad para " + capacidadComida + " alimentos");
    }

    @Override
    public void romper() {
        System.out.println("Rompiendo el horno de tipo " + tipo + ". ¡Se detiene la cocción!");
    }
}
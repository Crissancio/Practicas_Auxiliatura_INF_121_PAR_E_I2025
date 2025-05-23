class BloqueTnt extends Bloque {
    private int dano;

    public BloqueTnt(String tipo, int dano) {
        super(tipo);
        this.dano = dano;
    }

    @Override
    public void accion() {
        System.out.println("Detonando el TNT de tipo " + tipo + " que causa " + dano + " puntos de daño");
    }

    @Override
    public void romper() {
        System.out.println("Rompiendo el TNT de tipo " + tipo + ". ¡Cuidado, puede explotar!");
    }
}
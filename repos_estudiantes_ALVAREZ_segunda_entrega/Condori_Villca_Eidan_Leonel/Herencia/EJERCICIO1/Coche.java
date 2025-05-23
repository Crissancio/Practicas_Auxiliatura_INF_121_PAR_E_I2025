package Herencia;

class Coche extends Vehiculo {
    private int numPuertas;
    private String tipoCombustible;

    public Coche(String marca, String modelo, int año, double precioBase, int numPuertas, String tipoCombustible) {
        super(marca, modelo, año, precioBase);
        this.numPuertas = numPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Puertas: " + numPuertas + ", Combustible: " + tipoCombustible);
    }

    public int getNumPuertas() {
        return numPuertas;
    }
    public static void Coche4Puertas(List<Coche> coches) {
    System.out.println("\nCOCHES CON MÁS DE 4 PUERTAS:");
    for (int i = 0; i < coches.size(); i++) {
        if (coches.get(i).getNumPuertas() > 4) {
            coches.get(i).mostrarInfo();
            }
        }
    }
}
public class Coche extends Vehiculo {
    private int numPuertas;
    private String tipoCombustible;

    public Coche(String marca, String modelo, int anio, double precioBase, int numPuertas, String tipoCombustible) {
        super(marca, modelo, anio, precioBase);
        this.numPuertas = numPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() + ", Nro de puertas: " + numPuertas + ", Tipo de combustible: " + tipoCombustible;
    }

    public static void mostrarCuatroPuertas(Coche[] coches) {
        System.out.println("\nCoches con mas de 4 puertas:");
        for (Coche coche : coches) {
            if (coche.getNumPuertas() > 4) {
                System.out.println(coche.mostrarInfo());
            }
        }
    }
}
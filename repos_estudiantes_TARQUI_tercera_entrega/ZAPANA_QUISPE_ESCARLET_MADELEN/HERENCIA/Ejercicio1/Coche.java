public class Coche extends Vehiculo {
    private int num_puertas;
    private String tipo_combustible;

    public Coche(String marca, String modelo, int año, float precio_base,
                 int num_puertas, String tipo_combustible) {
        super(marca, modelo, año, precio_base);
        this.num_puertas = num_puertas;
        this.tipo_combustible = tipo_combustible;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.printf("Numero de puertas: %d, Tipo de combustible: %s%n",
                          num_puertas, tipo_combustible);
    }

    public int getNum_puertas() { return num_puertas; }
}
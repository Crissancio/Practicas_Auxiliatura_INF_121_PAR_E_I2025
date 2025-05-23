//1.Modelar diferentes tipos de vehículos.
//a) Implementa las clases con sus constructores, getters y setters.
public class Coche extends Vehiculo {
    private int num_puertas;
    private String tipo_combustible;
    

    Coche(String marca, String modelo, int año, float precio_base, int num_puertas, String tipo_combustible) {
        super(marca, modelo, año, precio_base);
        this.num_puertas = num_puertas;
        this.tipo_combustible = tipo_combustible;
        
    }

    public int getNum_puertas() {
        return this.num_puertas;
    }

    public void setNum_puertas(int num_puertas) {
        this.num_puertas = num_puertas;
    }

    public String getTipo_combustible() {
        return this.tipo_combustible;
    }

    public void setTipo_combustible(String tipo_combustible) {
        this.tipo_combustible = tipo_combustible;
    }

    public void mostrar_info() {
        System.out.println("Informacion Coche:");
        System.out.println("marca: " + getMarca() + " modelo: " + getModelo() + " año: " + getAño() + " precio base: "
                + getPrecio_base() + " numero de puertas: " + getNum_puertas() + " tipo de combustible: "
                + getTipo_combustible());
    }

    public void mostrarCoche() {
        if (getNum_puertas() >= 4) {
            System.out
                    .println("marca: " + getMarca() + " modelo: " + getModelo() + " año: " + getAño() + " precio base: "
                            + getPrecio_base() + " numero de puertas: " + getNum_puertas() + " tipo de combustible: "
                            + getTipo_combustible());

        }
    }

    public void mostrarVehiculoActual() {
        if (getAño() == 2025) {
            System.out
                    .println("marca: " + getMarca() + " modelo: " + getModelo() + " año: " + getAño() + " precio base: "
                            + getPrecio_base() + " numero de puertas: " + getNum_puertas() + " tipo de combustible: "
                            + getTipo_combustible());
        }

    }
}

//1.Modelar diferentes tipos de vehículos.
//a) Implementa las clases con sus constructores, getters y setters.
public class Moto extends Vehiculo {
    private float cilindrada;
    private String tipo_motor;

    Moto(String marca, String modelo, int año, float precio_base, float cilindrada, String tipo_motor) {
        super(marca, modelo, año, precio_base);
        this.cilindrada = cilindrada;
        this.tipo_motor = tipo_motor;
    }

    public float getCilindrada() {
        return this.cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipo_motor() {
        return this.tipo_motor;
    }

    public void setTipo_motor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }

    public void mostrar_info() {
        System.out.println("Información Moto: ");
        System.out.println("marca: " + getMarca() + " modelo: " + getModelo() + " año: " + getAño() + " precio base: "
                + getPrecio_base() + " cilindrada: " + getCilindrada() + " tipo de motor: "
                + getTipo_motor());
    }

    public void mostrarVehiculoActual() {
        if (getAño() == 2025) {
            System.out
                    .println("marca: " + getMarca() + " modelo: " + getModelo() + " año: " + getAño() + " precio base: "
                            + getPrecio_base() + " cilindrada: " + getCilindrada() + " tipo de motor: "
                            + getTipo_motor());
        }

    }

}

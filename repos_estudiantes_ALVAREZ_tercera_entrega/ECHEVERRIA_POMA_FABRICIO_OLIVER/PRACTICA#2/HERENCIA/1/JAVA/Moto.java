public class Moto extends Vehiculo {
    private int cilindrada;
    private String tipoMotor;

    //A
    public Moto(String marca, String modelo, int año, double precioBase, int cilindrada, String tipoMotor) {
        super(marca, modelo, año, precioBase);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Marca: " + getMarca() + ", Modelo: " + getModelo() + ", Año: " + getAño() + ", Precio Base: " + getPrecioBase());
        System.out.println("Cilindrada: " + cilindrada + ", Tipo de Motor: " + tipoMotor);
    }
}
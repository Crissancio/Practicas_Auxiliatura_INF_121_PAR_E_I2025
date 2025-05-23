public class Moto extends Vehiculo {
    private float  cilindrada;
    private String tipo_motor;

    public Moto(String marca, String modelo, int año, float precio_base, float  cilindrada, String tipo_motor) {
        super(marca, modelo, año, precio_base);
        this.cilindrada = cilindrada;
        this.tipo_motor = tipo_motor;
    }

    public void mostrar_info(){
        super.mostrar_info();
        System.out.println("----Moto----\n"+
            "Cilindrada:" + this.cilindrada +"\n" +
            "Tipo de motor:" + this.tipo_motor
        );
    }
    
    public float getCilindrada() {
        return this.cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipo_motor() {
        return tipo_motor;
    }

    public void setTipo_motor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }
    
    
}

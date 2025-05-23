public class Moto extends Vehiculo {
    public int cilindrada;
    public String tipoMotor;

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
    public String mostrarInfo() {
        return super.mostrarInfo() + " - Cilindrada: " + cilindrada + "cc - Motor: " + tipoMotor;
    }
}
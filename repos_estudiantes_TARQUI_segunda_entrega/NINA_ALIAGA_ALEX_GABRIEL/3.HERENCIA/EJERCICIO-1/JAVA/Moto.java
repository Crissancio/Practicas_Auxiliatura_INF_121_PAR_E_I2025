class Moto extends Vehiculo {
  private int cilindrada;
  private String tipo_motor;

  public Moto(String marca, String modelo, int anio, int precio_base, int cilindrada, String tipo_motor) {
    super(marca, modelo, anio, precio_base);
    this.cilindrada = cilindrada;
    this.tipo_motor = tipo_motor;
  }

  public int getCilindrada(){
    return cilindrada;
  }
  public String getTipo_motor(){
    return tipo_motor;
  }
  public void setCilindrada(int cilindrada){
    this.cilindrada = cilindrada;
  }
  public void setTipo_motor(String tipo_motor){
    this.tipo_motor = tipo_motor;
  }

  @Override
  public void mostrarInformacion() {
    super.mostrarInformacion();
    System.out.println("Cilindrada: " + cilindrada);
    System.out.println("Tipo de motor: " + tipo_motor);
  }
}
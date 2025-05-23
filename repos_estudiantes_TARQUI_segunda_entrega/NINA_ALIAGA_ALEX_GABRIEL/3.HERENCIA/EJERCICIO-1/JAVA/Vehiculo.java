class Vehiculo {
  private String marca;
  private String modelo;
  private int anio;
  private int precio_base;

  public Vehiculo(String marca, String modelo, int anio, int precio_base) {
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
  }

  public String getMarca() {
    return marca;
  }
  public String getModelo(){
    return modelo;
  }
  public int getAnio(){
    return anio;
  }
  public int getPrecio_base(){
    return precio_base;
  }
  public void setMarca(String marca){
    this.marca = marca;
  }
  public void setModelo(String modelo){
    this.modelo = modelo;
  }
  public void setAnio(int anio){
    this.anio = anio;
  }
  public void setPrecio_base(int precio_base){
    this.precio_base = precio_base;
  }

  public void mostrarInformacion() {
    System.out.println("Marca: " + marca);
    System.out.println("Modelo: " + modelo);
    System.out.println("Año: " + anio);
    System.out.println("Precio Base: " + precio_base);
  }
}
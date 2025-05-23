class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;
    protected float precio_base;

    public Vehiculo(String marca, String modelo, int año, float precio_base) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio_base = precio_base;
    }

    public void mostrar_info() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.printf("Precio base: %.2f\n", precio_base);
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public int getAño() { return año; }
    public void setAño(int año) { this.año = año; }
    public float getPrecio_base() { return precio_base; }
    public void setPrecio_base(float precio_base) { this.precio_base = precio_base; }
}
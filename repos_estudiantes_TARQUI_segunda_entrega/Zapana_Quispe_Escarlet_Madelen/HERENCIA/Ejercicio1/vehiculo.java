public class Vehiculo {
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
        System.out.printf("Marca: %s, Modelo: %s, Año: %d, Precio Base: %.2f%n",
                          marca, modelo, año, precio_base);
    }

    // Getters y setters
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAño() { return año; }
    public float getPrecio_base() { return precio_base; }

    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setAño(int año) { this.año = año; }
    public void setPrecio_base(float precio_base) { this.precio_base = precio_base; }
}

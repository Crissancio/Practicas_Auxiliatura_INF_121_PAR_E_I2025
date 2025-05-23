public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private double precio_base;

    public Vehiculo(String marca, String modelo, int año, double precio_base) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio_base = precio_base;
    }
    
    public void mostrar_info() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Anio: " + año);
        System.out.println("Precio base: $" + precio_base);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecioBase() {
        return precio_base;
    }

    public void setPrecioBase(double precio_base) {
        this.precio_base = precio_base;
    }
}

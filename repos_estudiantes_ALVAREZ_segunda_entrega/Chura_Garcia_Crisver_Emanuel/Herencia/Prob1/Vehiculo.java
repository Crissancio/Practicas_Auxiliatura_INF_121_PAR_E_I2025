//1.Modelar diferentes tipos de vehículos.
//a) Implementa las clases con sus constructores, getters y setters.
public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private float precio_base;

    Vehiculo(String marca, String modelo, int año, float precio_base) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio_base = precio_base;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return this.año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public float getPrecio_base() {
        return this.precio_base;
    }

    public void setPrecio_base(float precio_base) {
        this.precio_base = precio_base;
    }

}
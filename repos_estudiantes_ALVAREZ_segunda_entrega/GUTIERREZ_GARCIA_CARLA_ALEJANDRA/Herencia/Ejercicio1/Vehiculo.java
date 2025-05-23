package HERENCIA.Ejercicio1;

public class Vehiculo {
    protected String marca, modelo;
    protected int año;
    protected float precio_base;

    public Vehiculo(String m, String mo, int a, float pb) {
        this.marca = m;
        this.modelo = mo;
        this.año = a;
        this.precio_base = pb;

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public float getPrecio_base() {
        return precio_base;
    }

    public void setMarca(String m) {
        this.marca = m;
    }

    public void setModelo(String mo) {
        this.modelo = mo;
    }

    public void setAño(int a) {
        this.año = a;
    }

    public void setPrecio_base(float pb) {
        this.precio_base = pb;
    }

    public void mostrar_info() {
        System.out.println("Marca: " + this.marca + ", Modelo: " + this.modelo + ", Año: " + this.año
                + ", Precio Base: " + this.precio_base);
    }

    public void mostrar_actual(int x) {

    }

}
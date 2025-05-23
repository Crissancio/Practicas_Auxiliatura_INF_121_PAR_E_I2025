
package Ejercicio1;

public class Vehiculo { 
    private String marca;
    private  String modelo;
    private  int año;
    private int precio_base;

    public Vehiculo(String marca, String modelo, int año, int precio_base) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio_base = precio_base;
    }
    

    public void mostra_info(){
        System.out.println("La marca es: " +marca+ "\n modelo:" +modelo+ "\n año: "+año+ "precio_base: "+precio_base);
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

    public float getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(int precio_base) {
        this.precio_base = precio_base;
    }
    

}

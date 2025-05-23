public class Vehiculo {
    private String marca, modelo;
    private int año;
    private float precio_base;

    public Vehiculo(String marca, String modelo, int año, float precio_base){
        this.marca = marca;
        this. modelo = modelo;
        this.año = año;
        this. precio_base = precio_base;
    }

    public void mostrar_info(){
        System.out.println("-----Vehiculo-----\n" +
        "Marca:" + this.marca  + "\n" + 
        "Modelo:" + this.modelo +"\n" +
        "Año:" + this.año +"\n" +
        "Precio base:" + this.precio_base
        );
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

    public void setPrecio_base(float precio_base) {
        this.precio_base = precio_base;
    }
}

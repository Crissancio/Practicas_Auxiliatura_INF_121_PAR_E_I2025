// a) codificar la clase con getters y setters
class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    private double precio_base;
    
    public Vehiculo(String m, String mo, int a, double p) {
        this.marca = m;
        this.modelo = mo;
        this.año = a;
        this.precio_base = p;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String m) {
        this.marca = m;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String mo) {
        this.modelo = mo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int a) {
        this.año = a;
    }

    public double getPrecioBase() {
        return precio_base;
    }

    public void setPrecioBase(double p) {
        this.precio_base = p;
    }
    public void mostrar_Info() {
        System.out.println("marca: " + marca+", modelo: " + modelo+", año: " + año+", precio base: " + precio_base);
         }
}


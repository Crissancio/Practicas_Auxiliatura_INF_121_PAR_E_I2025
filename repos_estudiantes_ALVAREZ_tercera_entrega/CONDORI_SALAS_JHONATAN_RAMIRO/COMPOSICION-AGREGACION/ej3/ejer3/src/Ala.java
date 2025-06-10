public class Ala {
    private double longitud;
    public Ala(double longitud) {
        this.longitud = longitud;
    }
    public double getLongitud() {
        return longitud;
    }
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public void mostrarInfo() {
        System.out.println("Ala: Longitud " + longitud + " metros");
    }
}
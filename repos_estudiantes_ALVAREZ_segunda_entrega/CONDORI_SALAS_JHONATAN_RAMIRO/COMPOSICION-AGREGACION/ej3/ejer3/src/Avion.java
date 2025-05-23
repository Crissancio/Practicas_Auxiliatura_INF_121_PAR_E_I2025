public class Avion {
    private String modelo;
    private Motor motor;
    private Ala[] alas;
    private TrenAterrizaje tren;
    public Avion(String modelo, Motor motor, Ala[] alas, TrenAterrizaje tren) {
        this.modelo = modelo;
        this.motor = motor;
        this.alas = alas;
        this.tren = tren;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void mostrarInfo() {
        System.out.println("Avión Modelo: " + modelo);
        motor.mostrarInfo();
        for (int i = 0; i < alas.length; i++) {
            System.out.println("Ala " + (i + 1) + ":");
            alas[i].mostrarInfo();
        }
        tren.mostrarInfo();
    }
}
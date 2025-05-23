public class Mono extends Animal {
    private int nivelTravesura;

    public Mono(String nombre, int edad, int nivelTravesura) {
        super(nombre, edad);
        this.nivelTravesura = nivelTravesura;
    }

    @Override
    public String emitirSonido() {
        return nombre + " grita travieso con nivel " + nivelTravesura;
    }
}

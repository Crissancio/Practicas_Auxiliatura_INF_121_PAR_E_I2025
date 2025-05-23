package Polimorfismo.Ej5;

public class Oficina {
    private int nroSillas;
    private int nroEscritorios;
    private int nroEstanterias;

    public Oficina(int nroSillas, int nroEscritorios, int nroEstanterias) {
        this.nroSillas = nroSillas;
        this.nroEscritorios = nroEscritorios;
        this.nroEstanterias = nroEstanterias;
    }

    public void mostrar() {
        System.out.println("Oficina -> Sillas: " + nroSillas + ", Escritorios: " + nroEscritorios + ", Estanterías: " + nroEstanterias);
    }

    public int cantidadMuebles() {
        return nroSillas + nroEscritorios + nroEstanterias;
    }

    public int cantidadMuebles(int extras) {
        return cantidadMuebles() + extras;
    }
}

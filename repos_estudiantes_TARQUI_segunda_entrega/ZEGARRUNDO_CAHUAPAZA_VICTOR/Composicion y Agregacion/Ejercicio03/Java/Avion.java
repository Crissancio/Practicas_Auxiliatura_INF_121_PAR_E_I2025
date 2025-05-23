package Composicion2;

public class Avion {
    private String modelo;
    private String fabricante;
    private Parte[] partes;
    private int cantidadPartes;

    public Avion(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.partes = new Parte[10];
        this.cantidadPartes = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void agregarParte(Parte parte) {
        if (cantidadPartes < partes.length) {
            partes[cantidadPartes] = parte;
            cantidadPartes++;
        }
    }

    public void mostrarAvion() {
        System.out.println("Modelo: " + modelo + ", Fabricante: " + fabricante);
        for (int i = 0; i < cantidadPartes; i++) {
            partes[i].mostrarInfo();
        }
    }
}

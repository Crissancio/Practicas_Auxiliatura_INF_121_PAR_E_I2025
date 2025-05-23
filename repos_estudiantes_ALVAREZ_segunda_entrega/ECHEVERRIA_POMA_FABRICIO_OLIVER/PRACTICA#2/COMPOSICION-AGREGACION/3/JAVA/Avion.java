import java.util.ArrayList;
import java.util.List;

public class Avion {
    private String modelo;
    private String fabricante;
    private List<Parte> partes;

    public Avion(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.partes = new ArrayList<>();
    }

    //A
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public List<Parte> getPartes() {
        return partes;
    }

    public void setPartes(List<Parte> partes) {
        this.partes = partes;
    }

    public void agregar_parte(Parte parte) {
        partes.add(parte);
    }
    public void mostrar_avión() {
        System.out.println("Modelo: " + modelo + ", Fabricante: " + fabricante);
        System.out.println("Partes:");
        for (Parte parte : partes) {
            parte.mostrar_info();
        }
    }
}
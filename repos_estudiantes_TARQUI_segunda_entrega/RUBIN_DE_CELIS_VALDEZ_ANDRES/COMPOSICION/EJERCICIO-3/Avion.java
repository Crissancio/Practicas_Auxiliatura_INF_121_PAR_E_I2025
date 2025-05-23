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

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public List<Parte> getPartes() {
        return partes;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setPartes(List<Parte> partes) {
        this.partes = partes;
    }
    
    public void agregarParte(Parte parte) {
        partes.add(parte);
    }
    
    public void mostrarAvion() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Partes del avion:");
        for (Parte p : partes) {
            p.mostrarInfo();
        }
    }
}

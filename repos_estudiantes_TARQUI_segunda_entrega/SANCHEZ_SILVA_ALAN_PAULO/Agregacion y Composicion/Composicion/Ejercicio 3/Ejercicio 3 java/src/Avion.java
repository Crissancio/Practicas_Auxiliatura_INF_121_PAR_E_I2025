import java.util.ArrayList;

public class Avion {
    public String modelo, fabricante;
    public ArrayList<Parte> partes;
    public Avion(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.partes = new ArrayList<>();
    }
    public void agregarParte(Parte parte) {
        this.partes.add(parte);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---------------Avion---------------\n");
        sb.append("Modelo: ").append(modelo).append("\n");
        sb.append("Fabricante: ").append(fabricante).append("\n");
        sb.append("Partes: \n");
        for (Parte parte : partes) {
            sb.append(parte.toString());
        }
        return sb.toString();
    }
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
    public ArrayList<Parte> getPartes() {
        return partes;
    }
    public void setPartes(ArrayList<Parte> partes) {
        this.partes = partes;
    }
    
}

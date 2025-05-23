
//2. Crea un POO de clases para modelar un avión y sus partes. El avión está compuesto por partes como el motor, las alas y el tren de aterrizaje. Si el avión se destruye, las partes también se destruyen.
//a) Implementa las clases con sus constructores, getters y setters.
import java.util.ArrayList;
import java.util.List;

public class Avion {
    private String modelo;
    private String fabricante;
    private List<Parte> partes;

    Avion(String modelo, String fabricante, List<Parte> partes) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.partes = new ArrayList<>();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public List<Parte> getPartes() {
        return this.partes;
    }

    public void setPartes(List<Parte> partes) {
        this.partes = partes;
    }

    public void agregar_parte(Parte parte) {
        partes.add(parte);
    }

    public void mostrar_avion() {
        System.out.println("Avion: " + "\nModelo: " + getModelo() + " Fabricante: " + getFabricante() + " \nPartes: ");
        for (int i = 0; i < partes.size(); i++) {
            Parte parte = partes.get(i);
            parte.mostrar_info();
        }

    }

}

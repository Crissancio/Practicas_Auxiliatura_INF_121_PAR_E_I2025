// a)
import java.util.ArrayList;

public class Avión {
    private String modelo;
    private String fabricante;
    private ArrayList<Parte> partes; 
    
    public Avión(String m, String f) {
        this.modelo = m;
        this.fabricante = f;
        this.partes = new ArrayList<>();
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
    public void agregar_parte(Parte p) {
        partes.add(p);
    }
    public void mostrar_avion() {
        System.out.println("Información del avion: ");
        System.out.println("Modelo: " + modelo);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("\n partes: ");
        if (partes.isEmpty()) {
            System.out.println("no tiene partes el avión");
        } else {
            for (Parte x: partes) {
                x.mostrar_info();
            }
        }
    }
}
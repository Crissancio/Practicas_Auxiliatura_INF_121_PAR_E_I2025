import java.util.ArrayList;

public class Computadora {
    private String marca;
    private ArrayList<Componente> componentes;

    public Computadora(String marca) {
        this.marca = marca;
        this.componentes = new ArrayList<>();
    }

    public void agregarComponente(Componente c) {
        componentes.add(c);
    }

    public void mostrarComputadora() {
        System.out.println("Computadora marca: " + marca);
        System.out.println("Componentes:");
        for (Componente c : componentes) {
            System.out.println("  - " + c.mostrarInfo());
        }
    }
}
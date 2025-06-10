import java.util.ArrayList;

class Componente {
    private String nombre;
    private double costo;

    public Componente(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    public double getCosto() {
        return costo;
    }

    public String mostrar() {
        return "Componente: " + nombre + ", Costo: " + costo;
    }
}

class Computadora {
    private String marca;
    private ArrayList<Componente> componentes;

    public Computadora(String marca) {
        this.marca = marca;
        this.componentes = new ArrayList<>();
    }

    public void agregarComponente(Componente c) {
        componentes.add(c);
    }

    public double calcularCostoTotal() {
        double total = 0;
        for (Componente c : componentes) {
            total += c.getCosto();
        }
        return total;
    }

    public void mostrarComputadora() {
        System.out.println("Computadora marca: " + marca);
        for (Componente c : componentes) {
            System.out.println(c.mostrar());
        }
        System.out.println("Costo Total: " + calcularCostoTotal());
    }
}

class TestComputadora {
    public static void main(String[] args) {
        Computadora pc = new Computadora("Lenovo");
        pc.agregarComponente(new Componente("Procesador", 300));
        pc.agregarComponente(new Componente("RAM 16GB", 150));
        pc.agregarComponente(new Componente("SSD 1TB", 200));

        pc.mostrarComputadora();
    }
}
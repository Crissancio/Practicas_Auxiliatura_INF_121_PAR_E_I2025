public class Ejercicio3Composicion {
    public static void main(String[] args) {
        Avion avion = new Avion("Boeing 737", "Boeing");
        avion.mostrarAvion();
    }
}

class Parte {
    private String nombre;
    private float peso;

    public Parte(String nombre, float peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public void mostrarInfo() {
        System.out.println("Parte: " + nombre + ", Peso: " + peso + " kg");
    }
}

class Avion {
    private String modelo;
    private String fabricante;
    private Parte[] partes;

    public Avion(String modelo, String fabricante) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.partes = new Parte[3];
        crearPartes();
    }

    private void crearPartes() {
        partes[0] = new Parte("Motor", 1200f);
        partes[1] = new Parte("Alas", 1500f);
        partes[2] = new Parte("Tren de Aterrizaje", 800f);
    }

    public void mostrarAvion() {
        System.out.println("Modelo: " + modelo + ", Fabricante: " + fabricante);
        for (Parte p : partes) {
            p.mostrarInfo();
        }
    }
}

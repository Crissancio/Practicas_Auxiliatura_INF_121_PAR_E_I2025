class Perro {
    private String nombre;
    private int edad;
    private String raza;

    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }

    public String hacerSonido() {
        return "LADRIDOOO";
    }

    public String moverse() {
        return "Saltos largos";
    }

    public void mostrarInfo() {
        System.out.println("Perro");
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Raza: " + raza);
        System.out.println("Sonido: " + hacerSonido());
        System.out.println("Movimiento: " + moverse());
    }
}

class Gato {
    private String nombre;
    private String color;

    public Gato(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String hacerSonido() {
        return "REAULL RAULL";
    }

    public String moverse() {
        return "Flexibilidad máxima";
    }

    public void mostrarInfo() {
        System.out.println("Gato");
        System.out.println("Nombre: " + nombre + ", Color: " + color);
        System.out.println("Sonido: " + hacerSonido());
        System.out.println("Movimiento: " + moverse());
    }
}

class Pajaro {
    private String nombre;
    private String tipo;

    public Pajaro(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String hacerSonido() {
        return "CANTO";
    }

    public String moverse() {
        return "Vuelo alto";
    }

    public void mostrarInfo() {
        System.out.println("Pájaro");
        System.out.println("Nombre: " + nombre + ", Tipo: " + tipo);
        System.out.println("Sonido: " + hacerSonido());
        System.out.println("Movimiento: " + moverse());
    }
}

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("ZEUS", 10, "Golden Retriever");
        Gato gato1 = new Gato("TEODORO", "Naranjoso");
        Pajaro pajaro1 = new Pajaro("Piolin", "Canario");

        perro1.mostrarInfo();
        System.out.println();

        gato1.mostrarInfo();
        System.out.println();

        pajaro1.mostrarInfo();
    }
}

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona("Jose Antonio", 21, "Santa Cruz");
        Persona p2 = new Persona("Andrea Valera", 25, "La Paz");
        Persona p3 = new Persona("Miguel Angel", 16, "Oruro");

        p1.saludo();
        p2.saludo();
        p3.saludo();
        
        System.out.println();
        
        p1.isAdult();
        p2.isAdult();
        p3.isAdult();

    }
}
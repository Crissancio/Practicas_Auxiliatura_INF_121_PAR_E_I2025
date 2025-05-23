package Com;

public class Main {

    public static void main(String[] args) {
        Casa c1 = new Casa();

        // Simulamos pedir datos (como si fueran ingresados por el usuario)
        c1.setDireccion("Calle Primavera 456");
        c1.setCantHab(3);

        Habitacion h1 = new Habitacion("Sala", "5");
        Habitacion h2 = new Habitacion("Cocina", "3");
        Habitacion h3 = new Habitacion("Comedor", "4");

        c1.agregar(h1);
        c1.agregar(h2);
        c1.agregar(h3);

        c1.mostrar_casa();

        System.out.println("");
        System.out.println("Agregando nuevas habitaciones");

        c1.agregar(new Habitacion("Dormitorio de la bebé", "2"));
        c1.agregar(new Habitacion("Dormitorio de los padres", "3"));
        c1.agregar(new Habitacion("Dormitorio del hijo mayor", "2.3"));
        c1.agregar(new Habitacion("Dormitorio del hijo del medio", "2.3"));
        c1.agregar(new Habitacion("Dormitorio del último hijo", "2.4"));
        c1.agregar(new Habitacion("Lavandería", "2"));

        c1.mostrar_casa();
    }
}

package PERSISTENCIA.Ejercicio3.Java;

public class Main {
    public static void main(String[] args) {
        GestorCliente gestor = new GestorCliente();

        Cliente c1 = new Cliente(1, "Bruno", "71511111");
        Cliente c2 = new Cliente(2, "Paola", "76543210");

        gestor.guardarCliente(c1);
        gestor.guardarCliente(c2);

        System.out.println("Buscar cliente con ID 2:");
        System.out.println(gestor.buscarCliente(2));

        System.out.println("Buscar celular del cliente con ID 1:");
        System.out.println(gestor.buscarCelularCliente(1));
    }
}


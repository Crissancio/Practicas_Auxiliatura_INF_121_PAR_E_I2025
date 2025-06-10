public class Principal {
    public static void main(String[] args) {
        ArchivoCliente archivo = new ArchivoCliente("clientes.dat");
        archivo.crearArchivo();
        archivo.guardarCliente(new Cliente("Ana", "BancoSol", 1200));
        archivo.guardarCliente(new Cliente("Luis", "BISA", 800));
        archivo.guardarCliente(new Cliente("Carlos", "BancoSol", 1500));
        archivo.guardarCliente(new Cliente("Elena", "BISA", 3000));
        System.out.println("Clientes con saldo mayor a 1000:");
        archivo.mostrarSaldoMayor(1000);
        System.out.println("\nCantidad de clientes del banco 'BancoSol':");
        archivo.contarClientesBanco("BancoSol");
    }
}
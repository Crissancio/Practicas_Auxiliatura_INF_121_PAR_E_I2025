public class App3 {
    public static void main(String[] args) throws Exception {
        ArchivoCliente archivo = new ArchivoCliente("clientes.txt");
        archivo.crearArchivo();

        archivo.guardarCliente(new Cliente(1, "Osvaldo" , 123));
        archivo.guardarCliente(new Cliente(2, "Marcoss" , 456));
        archivo.guardarCliente(new Cliente(3, "Fernando" , 789));

        //Buscando por ID
        Cliente cliente = archivo.buscarCliente(3);
        if(cliente != null){
            System.out.println("Encontrado\n" + cliente);
        }else{
            System.out.println("No se pudo encontrar al clieinte...");
        }

        //Buscando por numero de telefono por ID
        Cliente cliente2 = archivo.buscarCelularCliente(1);
        if(cliente2 != null){
            System.out.println("Se encontro el telefono del cliente: "+ cliente2);
        }else{
            System.out.println("No se encontro el teléfono del cliente...");
        }
    }
}

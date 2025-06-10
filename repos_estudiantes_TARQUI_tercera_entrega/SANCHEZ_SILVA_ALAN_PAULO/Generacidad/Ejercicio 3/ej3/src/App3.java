public class App3 {
    public static void main(String[] args) throws Exception {
        Catalogo <String> libros = new Catalogo<>();
        libros.agregar("Cien años de Soledad");
        libros.agregar("El señor de los anillos");
        libros.agregar("Orgullo y prejuicio");
        System.out.println(libros.buscar("Cien años de Soledad"));
        
        Catalogo <String> productos = new Catalogo<>();
        productos.agregar("Yogurt");
        productos.agregar("Arroz");
        productos.agregar("Higienico");
        System.out.println(productos.buscar("Refresco"));
    }
}

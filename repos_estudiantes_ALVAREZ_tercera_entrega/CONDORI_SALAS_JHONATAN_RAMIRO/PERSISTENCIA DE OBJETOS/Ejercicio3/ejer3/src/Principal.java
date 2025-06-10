public class Principal {
    public static void main(String[] args) {
        ArchivoFarmacia archivo = new ArchivoFarmacia("farmacias.dat");
        archivo.crearArchivo();
        archivo.guardarFarmacia(new Farmacia("Cruz Verde", "Centro", 150));
        archivo.guardarFarmacia(new Farmacia("San Pablo", "Sur", 80));
        archivo.guardarFarmacia(new Farmacia("Farmavida", "Centro", 200));
        System.out.println("Farmacias en zona Centro:");
        archivo.mostrarZona("Centro");
        System.out.println("\nFarmacias con stock mayor a 100:");
        archivo.mostrarStock(100);
    }
}
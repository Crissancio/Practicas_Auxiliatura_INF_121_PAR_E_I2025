package Persistencia_de_Objetos.Ejercicio3.Java;

public class Cliente {
    private int id;
    private String nombre;
    private int telefono;

    public Cliente(int id, String nombre, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    @Override
    public String toString() {
    
        return String.format("%d,%s,%d", id, nombre, telefono);
    }

    
    public static Cliente fromString(String clienteStr) {
        try {
            String[] partes = clienteStr.trim().split(",");
            if (partes.length == 3) {
                int id = Integer.parseInt(partes[0]);
                String nombre = partes[1];
                int telefono = Integer.parseInt(partes[2]);
                return new Cliente(id, nombre, telefono);
            } else {
                System.err.println("Advertencia: Formato de linea incorrecto para cliente: " + clienteStr);
                return null;
            }
        } catch (NumberFormatException e) {
            System.err.println("Error al parsear datos numericos de cliente '" + clienteStr + "': " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error de indice al parsear linea de cliente '" + clienteStr + "': " + e.getMessage());
            return null;
        }
    }
}
import java.io.*;

public class ArchivoCliente {
    private String nomA;

    public ArchivoCliente(String nomA) {
        this.nomA = nomA;
    }

    public void crearArchivo() {
        try (FileWriter f = new FileWriter(nomA)) {
        } catch (IOException e) {
            System.err.println("Error creando archivo: " + e.getMessage());
        }
    }

    public void guardarCliente(Cliente c) {
        try (FileWriter f = new FileWriter(nomA, true)) {
            f.write(c.getId() + "," + c.getNombre() + "," + c.getTelefono() + "\n");
        } catch (IOException ex) {
            System.err.println("Error guardando cliente: " + ex.getMessage());
        }
    }

    public Cliente buscarCliente(int c) {
        try (BufferedReader f = new BufferedReader(new FileReader(nomA))) {
            String line;
            while ((line = f.readLine()) != null) {
                String[] parts = line.split(",");
                if (Integer.parseInt(parts[0]) == c) {
                    return new Cliente(Integer.parseInt(parts[0]), parts[1], Integer.parseInt(parts[2]));
                }
            }
        } catch (IOException e) {
            System.err.println("Error buscando cliente: " + e.getMessage());
        }
        return null;
    }

    public Cliente buscarCelularCliente(int c) {
        try (BufferedReader f = new BufferedReader(new FileReader(nomA))) {
            String line;
            while ((line = f.readLine()) != null) {
                String[] parts = line.split(",");
                if (Integer.parseInt(parts[0]) == c) {
                    return new Cliente(Integer.parseInt(parts[0]), parts[1], Integer.parseInt(parts[2]));
                }
            }
        } catch (IOException e) {
            System.err.println("Error buscando celular: " + e.getMessage());
        }
        return null;
    }
}

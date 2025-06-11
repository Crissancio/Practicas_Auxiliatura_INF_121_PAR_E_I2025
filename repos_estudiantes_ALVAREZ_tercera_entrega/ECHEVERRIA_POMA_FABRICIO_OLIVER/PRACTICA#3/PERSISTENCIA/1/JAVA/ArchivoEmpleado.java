import java.io.*;

public class ArchivoEmpleado {
    private String nomA;

    public ArchivoEmpleado(String nomA) {
        this.nomA = nomA;
    }

    public void crearArchivo() {
        try (FileWriter f = new FileWriter(nomA)) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarEmpleado(Empleado e) {
        try (FileWriter f = new FileWriter(nomA, true)) {
            f.write(e.getNombre() + "," + e.getEdad() + "," + e.getSalario() + "\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Empleado buscaEmpleado(String n) {
        try (BufferedReader f = new BufferedReader(new FileReader(nomA))) {
            String line;
            while ((line = f.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(n)) {
                    return new Empleado(parts[0], Integer.parseInt(parts[1]), Float.parseFloat(parts[2]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Empleado mayorSalario(float s) {
        try (BufferedReader f = new BufferedReader(new FileReader(nomA))) {
            String line;
            while ((line = f.readLine()) != null) {
                String[] parts = line.split(",");
                if (Float.parseFloat(parts[2]) > s) {
                    return new Empleado(parts[0], Integer.parseInt(parts[1]), Float.parseFloat(parts[2]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
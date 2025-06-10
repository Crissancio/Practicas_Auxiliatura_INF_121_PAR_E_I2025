import java.io.*;
import java.util.*;

class Medicamento {
    String nombre;
    int codigo;
    String tipo;
    double precio;

    Medicamento(String n, int c, String t, double p) {
        nombre = n; codigo = c; tipo = t; precio = p;
    }

    String formato() {
        return nombre + "," + codigo + "," + tipo + "," + precio;
    }

    static Medicamento desde(String linea) {
        String[] p = linea.split(",");
        return new Medicamento(p[0], Integer.parseInt(p[1]), p[2], Double.parseDouble(p[3]));
    }
}

class Farmacia {
    String nombre;
    int sucursal;
    String direccion;
    List<Medicamento> medicamentos = new ArrayList<>();

    Farmacia(String n, int s, String d) {
        nombre = n; sucursal = s; direccion = d;
    }

    void agregar(Medicamento m) { medicamentos.add(m); }

    String aTexto() {
        StringBuilder sb = new StringBuilder(nombre + ";" + sucursal + ";" + direccion + "\n");
        for (Medicamento m : medicamentos)
            sb.append("  ").append(m.formato()).append("\n");
        return sb.toString();
    }

    // Mostrar medicamentos para tos
    void mostrarMedicamentosParaTos() {
        System.out.println("Medicamentos para tos en sucursal " + sucursal + ":");
        boolean found = false;
        for (Medicamento m : medicamentos) {
            if (m.tipo.equalsIgnoreCase("Tos")) {
                System.out.println("  " + m.nombre + " - Precio: " + m.precio);
                found = true;
            }
        }
        if (!found) {
            System.out.println("  No hay medicamentos para tos en esta sucursal.");
        }
    }

    boolean tieneMedicamento(String nombreMed) {
        for (Medicamento m : medicamentos) {
            if (m.nombre.equalsIgnoreCase(nombreMed)) {
                return true;
            }
        }
        return false;
    }
}

class ArchFarmacia {
    String nombreArchivo;
    List<Farmacia> farmacias = new ArrayList<>();

    ArchFarmacia(String nom) {
        nombreArchivo = nom;
    }

    void agregar(Farmacia f) { farmacias.add(f); }

    void guardar() {
        try (PrintWriter pw = new PrintWriter(nombreArchivo)) {
            for (Farmacia f : farmacias)
                pw.print(f.aTexto());
        } catch (IOException e) {
            System.out.println("Error al guardar.");
        }
    }

    void cargar() {
        farmacias.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            Farmacia f = null;
            while ((linea = br.readLine()) != null) {
                if (!linea.startsWith("  ")) {
                    String[] d = linea.split(";");
                    f = new Farmacia(d[0], Integer.parseInt(d[1]), d[2]);
                    farmacias.add(f);
                } else if (f != null) {
                    f.agregar(Medicamento.desde(linea.trim()));
                }
            }
        } catch (IOException e) {
            System.out.println("Archivo no encontrado.");
        }
    }

    void mostrarTodo() {
        for (Farmacia f : farmacias) {
            System.out.println(f.nombre + " - Sucursal " + f.sucursal + " - Dirección: " + f.direccion);
            for (Medicamento m : f.medicamentos) {
                System.out.println("  " + m.nombre + " (" + m.tipo + ") - Precio: " + m.precio);
            }
            System.out.println();
        }
    }

    void mostrarMedicamentosParaTosSucursal(int sucursalBuscada) {
        for (Farmacia f : farmacias) {
            if (f.sucursal == sucursalBuscada) {
                f.mostrarMedicamentosParaTos();
                return; 
            }
        }
        System.out.println("No se encontró la sucursal " + sucursalBuscada);
    }

    void mostrarSucursalConMedicamento(String nombreMedicamento) {
        boolean encontrado = false;
        for (Farmacia f : farmacias) {
            if (f.tieneMedicamento(nombreMedicamento)) {
                System.out.println("Sucursal: " + f.sucursal + ", Dirección: " + f.direccion);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontró el medicamento \"" + nombreMedicamento + "\" en ninguna sucursal.");
        }
    }
}

public class Principal {
    public static void main(String[] args) {
        ArchFarmacia arch = new ArchFarmacia("farmacias.txt");
        arch.cargar();

        Farmacia f = new Farmacia("VidaSana", 1, "Av. Sur 456");
        f.agregar(new Medicamento("Aspirina", 201, "Dolor", 3.5));
        f.agregar(new Medicamento("Antigripal", 202, "Resfrío", 6.0));
        f.agregar(new Medicamento("JarabeTos", 203, "Tos", 7.0));
        arch.agregar(f);

        Farmacia f2 = new Farmacia("SaludPlus", 2, "Av. Norte 123");
        f2.agregar(new Medicamento("Golpex", 301, "Tos", 8.5));
        f2.agregar(new Medicamento("Paracetamol", 302, "Dolor", 4.0));
        arch.agregar(f2);

        arch.guardar();
        System.out.println("Guardado completo.\n");

        System.out.println("=== Archivo completo ===");
        arch.mostrarTodo();

        System.out.println("=== Medicamentos para tos en sucursal 1 ===");
        arch.mostrarMedicamentosParaTosSucursal(1);

        System.out.println("\n=== Sucursales con medicamento \"Golpex\" ===");
        arch.mostrarSucursalConMedicamento("Golpex");
    }
}

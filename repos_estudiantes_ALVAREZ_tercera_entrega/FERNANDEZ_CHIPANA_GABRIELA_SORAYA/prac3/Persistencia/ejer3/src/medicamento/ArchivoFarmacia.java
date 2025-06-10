/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicamento;
import java.io.*;
import java.util.*;

public class ArchivoFarmacia {
    private String na;

    public ArchivoFarmacia(String na) {
        this.na = na;
    }

    public void crearArchivo() {
        try (PrintWriter pw = new PrintWriter(new FileWriter(na))) {
            // archivo vacío creado
        } catch (IOException e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
        }
    }

    public void adicionar(Farmacia f) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(na, true))) {
            pw.print(f.toArchivo());
        } catch (IOException e) {
            System.out.println("Error al guardar farmacia: " + e.getMessage());
        }
    }

    public ArrayList<Farmacia> listar() {
        ArrayList<Farmacia> lista = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(na))) {
            String linea;
            ArrayList<String> bloque = new ArrayList<>();
            while ((linea = br.readLine()) != null) {
                if (!linea.startsWith(">>")) {
                    if (!bloque.isEmpty()) {
                        lista.add(Farmacia.fromArchivo(bloque));
                        bloque.clear();
                    }
                }
                bloque.add(linea);
            }
            if (!bloque.isEmpty()) {
                lista.add(Farmacia.fromArchivo(bloque));
            }
        } catch (IOException e) {
            System.out.println("Error al leer archivo: " + e.getMessage());
        }
        return lista;
    }

    public void mostrarMedicamentosTosSucursal(int x) {
        for (Farmacia f : listar()) {
            if (f.getSucursal() == x) {
                for (Medicamento m : f.getMedicamentos()) {
                    if (m.getTipo().equalsIgnoreCase("tos")) {
                        m.mostrar();
                    }
                }
            }
        }
    }

    public void mostrarSucursalesConMedicamento(String nombreMed) {
        for (Farmacia f : listar()) {
            if (f.buscaMedicamento(nombreMed)) {
                System.out.println("Sucursal: " + f.getSucursal() + ", Dirección: " + f.getDireccion());
            }
        }
    }
}

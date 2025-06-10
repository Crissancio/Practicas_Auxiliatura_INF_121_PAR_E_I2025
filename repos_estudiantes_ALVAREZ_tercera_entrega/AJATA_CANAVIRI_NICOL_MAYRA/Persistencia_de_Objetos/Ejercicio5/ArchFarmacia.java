package Persistencia_de_Objetos.Ejercicio5;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArchFarmacia {
    private String nomMedicamentosArchivo;
    private String nomFarmaciasArchivo;

    public ArchFarmacia(String nomBase) {
        this.nomMedicamentosArchivo = nomBase + "_medicamentos.txt";
        this.nomFarmaciasArchivo = nomBase + "_farmacias.txt";
        crearArchivo(nomMedicamentosArchivo);
        crearArchivo(nomFarmaciasArchivo);
    }

    private void crearArchivo(String nombreArchivo) {
        File file = new File(nombreArchivo);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println("Archivo '" + nombreArchivo + "' creado exitosamente.");
                } else {
                    System.err.println("No se pudo crear el archivo '" + nombreArchivo + "'.");
                }
            } catch (IOException e) {
                System.err.println("Error al crear el archivo '" + nombreArchivo + "': " + e.getMessage());
            }
        } else {
            System.out.println("Archivo '" + nombreArchivo + "' ya existe.");
        }
    }

    public void adicionarMedicamento(Medicamento med) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomMedicamentosArchivo, true))) {
            writer.write(med.toString());
            writer.newLine();
            System.out.println("Medicamento '" + med.getNombre() + "' adicionado exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al adicionar medicamento: " + e.getMessage());
        }
    }

    public List<Medicamento> listarMedicamentos() {
        List<Medicamento> medicamentos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nomMedicamentosArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                Medicamento med = Medicamento.fromString(linea);
                if (med != null) {
                    medicamentos.add(med);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al listar medicamentos: " + e.getMessage());
        }
        return medicamentos;
    }

    public void adicionarFarmacia(Farmacia farmacia) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomFarmaciasArchivo, true))) {
            writer.write(farmacia.toString());
            writer.newLine();
            System.out.println("Farmacia '" + farmacia.getNombreFarmacia() + "' (Sucursal: " + farmacia.getSucursal() + ") adicionada exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al adicionar farmacia: " + e.getMessage());
        }
    }

    public List<Farmacia> listarFarmacias() {
        List<Farmacia> farmacias = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nomFarmaciasArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                Farmacia farmacia = Farmacia.fromString(linea);
                if (farmacia != null) {
                    farmacias.add(farmacia);
                }
            }
        } catch (IOException e) {
            System.err.println("Error al listar farmacias: " + e.getMessage());
        }
        return farmacias;
    }

    public void mostrarArchivoFarmacias() {
        System.out.println("\n--- Contenido del Archivo de Farmacias ---");
        List<Farmacia> farmacias = listarFarmacias();
        if (farmacias.isEmpty()) {
            System.out.println("El archivo de farmacias esta vacio.");
        } else {
            for (Farmacia f : farmacias) {
                f.mostrar(); 
            }
        }
        System.out.println("------------------------------------------");
    }

    // b)
    public void mostrarMedicamentosTos(int sucursal) {
        System.out.println("\n--- Medicamentos para la Tos en la Sucursal " + sucursal + " ---");
       
        List<Medicamento> todosMedicamentos = listarMedicamentos();
        boolean encontrado = false;
        for (Medicamento med : todosMedicamentos) {
            if (med.getTipo().equalsIgnoreCase("Tos")) {
                System.out.println("- " + med.getNombre() + " (Tipo: " + med.getTipo() + ", Precio: " + String.format("%.2f", med.getPrecio()) + ")");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron medicamentos para la tos.");
        }
        System.out.println("--------------------------------------------------");
    }

    public void mostrarMedicamentosResfrios() {
        System.out.println("\n--- Medicamentos para Resfrios ---");
        List<Medicamento> todosMedicamentos = listarMedicamentos();
        boolean encontrado = false;
        for (Medicamento med : todosMedicamentos) {
            if (med.getTipo().equalsIgnoreCase("Resfrio") || med.getTipo().equalsIgnoreCase("Resfrio")) {
                System.out.println("- " + med.getNombre() + " (Precio: " + String.format("%.2f", med.getPrecio()) + ")");
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron medicamentos para resfrios.");
        }
        System.out.println("----------------------------------");
    }


    public double precioMedicamentoTos(String nombreMedicamentoTos) {
        List<Medicamento> todosMedicamentos = listarMedicamentos();
        for (Medicamento med : todosMedicamentos) {
            if (med.getTipo().equalsIgnoreCase("Tos") && med.getNombre().equalsIgnoreCase(nombreMedicamentoTos)) {
                return med.getPrecio();
            }
        }
        return -1.0; 
    }


    // c) 
    public void mostrarSucursalesConMedicamento(String nombreMedicamento) {
        System.out.println("\n--- Sucursales con el medicamento '" + nombreMedicamento + "' ---");
        List<Medicamento> todosMedicamentos = listarMedicamentos();
        boolean medicamentoExiste = todosMedicamentos.stream()
                                                    .anyMatch(m -> m.getNombre().equalsIgnoreCase(nombreMedicamento));

        if (!medicamentoExiste) {
            System.out.println("El medicamento '" + nombreMedicamento + "' no se encuentra en ningun registro de medicamentos.");
            System.out.println("------------------------------------------------------------------");
            return;
        }

        List<Farmacia> todasFarmacias = listarFarmacias();
        if (todasFarmacias.isEmpty()) {
            System.out.println("No hay farmacias registradas.");
        } else {
            System.out.println("Basado en los registros existentes, las siguientes sucursales podrían tenerlo (todas las registradas):");
            for (Farmacia f : todasFarmacias) {
                System.out.println("- Sucursal: " + f.getSucursal() + ", Direccion: " + f.getDireccion());
            }
        }
        System.out.println("------------------------------------------------------------------");
    }

    public void limpiarArchivos() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomMedicamentosArchivo))) {
            writer.write(""); 
        } catch (IOException e) {
            System.err.println("Error al limpiar archivo de medicamentos: " + e.getMessage());
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomFarmaciasArchivo))) {
            writer.write(""); 
        } catch (IOException e) {
            System.err.println("Error al limpiar archivo de farmacias: " + e.getMessage());
        }
        System.out.println("Archivos de datos limpiados.");
    }
}

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

class ArchFarmacia {
    private String na;
    private List<Farmacia> farmacias;

    public ArchFarmacia(String na) {
        this.na = na;
        this.farmacias = new ArrayList<>();
        crearArchivo();
    }

    public void crearArchivo() {
        try {
            File file = new File(na);
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (IOException e) {
            System.err.println("Error al crear archivo: " + e.getMessage());
        }
    }

    public void adicionar(Farmacia f) {
        farmacias.add(f);
        guardarEnArchivo();
    }

    private void guardarEnArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(na))) {
            oos.writeObject(farmacias);
        } catch (IOException e) {
            System.err.println("Error al guardar farmacias: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    private void cargarFarmacias() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(na))) {
            farmacias = (List<Farmacia>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar farmacias: " + e.getMessage());
            farmacias = new ArrayList<>();
        }
    }

    public void listar() {
        cargarFarmacias();
        for (Farmacia f : farmacias) {
            f.mostrar();
        }
    }

    // b) Mostrar medicamentos para la tos de sucursal X
    public void mostrarMedicamentosTos(int sucursalX) {
        cargarFarmacias();
        for (Farmacia f : farmacias) {
            if (f.getSucursal() == sucursalX) {
                f.mostrarMedicamentos("tos");
            }
        }
    }

    // c) Mostrar sucursales con medicamento "Golpex"
    public void mostrarSucursalesConGolpex() {
        cargarFarmacias();
        for (Farmacia f : farmacias) {
            if (f.buscaMedicamento("Golpex") != null) {
                System.out.println("Sucursal: " + f.getSucursal() + 
                                 ", Dirección: " + f.getDirection());
            }
        }
    }

    // Métodos adicionales del diagrama
    public void mostrarMedicamentosResfrios() {
        cargarFarmacias();
        for (Farmacia f : farmacias) {
            f.mostrarMedicamentos("resfriado");
        }
    }

    public double precioMedicamentoTos() {
        cargarFarmacias();
        double total = 0;
        for (Farmacia f : farmacias) {
            for (int i = 0; i < f.getCantMedicamentos(); i++) {
                if (f.getMedicamento(i) != null && ((Medicamento) f.getMedicamento(i)).getTipo().equalsIgnoreCase("tos")) {
                    total += ((Medicamento) f.getMedicamento(i)).getPrecio();
                }
            }
        }
        return total;
    }

    public void mostrarMedicamentosMenorTos() {
        cargarFarmacias();
        // Implementar lógica para mostrar medicamentos para tos con precio menor al promedio
    }
}

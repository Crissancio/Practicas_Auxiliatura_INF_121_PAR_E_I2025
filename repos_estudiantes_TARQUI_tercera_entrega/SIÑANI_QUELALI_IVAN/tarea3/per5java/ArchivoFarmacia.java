import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoFarmacia {
    private String nomArchivo;
    //Constructor
    public ArchivoFarmacia(String nomArchivo) {
        this.nomArchivo = nomArchivo;
    }
    //guardar una farmacia en archivo
    public void guardarFarmacia(Farmacia farmacia) {
        List<Farmacia> farmacias = leerFarmacias();
        farmacias.add(farmacia);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomArchivo))) {
            oos.writeObject(farmacias);
        } catch (IOException e) {
            System.out.println("Error al guardar farmacia: " + e.getMessage());
        }
    }
    //leer todas las farmacias guardadas en archivo
    public List<Farmacia> leerFarmacias() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomArchivo))) {
            return (List<Farmacia>) ois.readObject();
        } catch (EOFException | FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer farmacias: " + e.getMessage());
            return new ArrayList<>();
        }
    }
    ///mostrar medicamentos para la tos de una sucursal específica
    public void mostrarMedicamentosTos(int sucursal) {
        List<Farmacia> farmacias = leerFarmacias();
        for (Farmacia farmacia : farmacias) {
            if (farmacia.getSucursal() == sucursal) {
                System.out.println("Medicamentos para la tos en sucursal " + sucursal + ":");
                for (Medicamento med : farmacia.medicamentos) {
                    if (med.getTipo().equalsIgnoreCase("Tos")) {
                        System.out.println(med);
                    }
                }
            }
        }
    }
    //buscar farmacias con un medicamento específico
    public void buscarFarmaciaMedicamento(String nombreMedicamento) {
        List<Farmacia> farmacias = leerFarmacias();
        for (Farmacia farmacia : farmacias) {
            if (farmacia.buscarMedicamento(nombreMedicamento) != null) {
                System.out.println("Sucursal: " + farmacia.getSucursal() + " | Dirección: " + farmacia.getDireccion());
            }
        }
    }
}

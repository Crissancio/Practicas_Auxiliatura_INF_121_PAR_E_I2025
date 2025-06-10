import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class Farmacia implements Serializable {
    private String nombreFarmacia;
    private int sucursal;
    private String direccion;
    private List<Medicamento> medicamentos;
    // Constructor
    public Farmacia(String nombreFarmacia, int sucursal, String direccion) {
        this.nombreFarmacia = nombreFarmacia;
        this.sucursal = sucursal;
        this.direccion = direccion;
        this.medicamentos = new ArrayList<>();
    }
    //agregar y mostrar medicamentos
    public void agregarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }
    public void mostrarMedicamentos() {
        for (Medicamento med : medicamentos) {
            System.out.println(med);
        }
    }
    // medicamento por nombre
    public Medicamento buscarMedicamento(String nombre) {
        for (Medicamento med : medicamentos) {
            if (med.getNombre().equalsIgnoreCase(nombre)) {
                return med;
            }
        }
        return null;
    }
    public int getSucursal() { return sucursal; }
    public String getDireccion() { return direccion; }
    @Override
    public String toString() {
        return "Farmacia: " + nombreFarmacia + " | Sucursal: " + sucursal + " | Dirección: " + direccion;
    }
}

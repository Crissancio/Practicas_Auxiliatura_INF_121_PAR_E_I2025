package PERSISTENCIA_DE_OBJETOS.EJERCICIO_5;
import java.io.Serializable;
import java.util.ArrayList;

public class Farmacia implements Serializable {
    private String nombreFarmacia;
    private int sucursal;
    private String direccion;
    private int nroMedicamentos;
    private ArrayList<Medicamento> medicamentos;

    public Farmacia() {
        medicamentos = new ArrayList<>();
    }

    public void leer(String nombreFarmacia, int sucursal, String direccion) {
        this.nombreFarmacia = nombreFarmacia;
        this.sucursal = sucursal;
        this.direccion = direccion;
    }

    public void mostrar() {
        System.out.println("Farmacia: " + nombreFarmacia + ", Sucursal: " + sucursal + ", Direccion: " + direccion);
        mostrarMedicamentos();
    }

    public String getDireccion() {
        return direccion;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void agregarMedicamento(Medicamento m) {
        medicamentos.add(m);
        nroMedicamentos++;
    }

    public void mostrarMedicamentos() {
        for (Medicamento m : medicamentos) {
            m.mostrar();
        }
    }

    public void mostrarMedicamentos(String tipoFiltro) {
        for (Medicamento m : medicamentos) {
            if (m.getTipo().equalsIgnoreCase(tipoFiltro)) {
                m.mostrar();
            }
        }
    }

    public boolean buscaMedicamento(String nombreMedicamento) {
        for (Medicamento m : medicamentos) {
            if (m.getNombre().equalsIgnoreCase(nombreMedicamento)) {
                return true;
            }
        }
        return false;
    }
}

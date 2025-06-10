
package mainpersistenciafarmacia;

import java.util.ArrayList;

public class Farmacia {
    private String nombreFarmacia;
    private int sucursal;
    private String direccion;
    private ArrayList<Medicamento> medicamentos;

    public Farmacia(String nombreFarmacia, int sucursal, String direccion) {
        this.nombreFarmacia = nombreFarmacia;
        this.sucursal = sucursal;
        this.direccion = direccion;
        this.medicamentos = new ArrayList<>();
    }

    public void agregarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }

    public void mostrar() {
        System.out.println("Farmacia: " + nombreFarmacia + " | Sucursal: " + sucursal + " | Direccion: " + direccion);
        System.out.println("Medicamentos:");
        for (Medicamento med : medicamentos) {
            med.mostrar();
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void mostrarMedicamentos(String tipo) {
        System.out.println("Medicamentos de tipo '" + tipo + "' en sucursal " + sucursal + ":");
        for (Medicamento med : medicamentos) {
            if (med.getTipo().equalsIgnoreCase(tipo)) {
                med.mostrar();
            }
        }
    }

    public boolean buscaMedicamento(String nombreBuscado) {
        for (Medicamento med : medicamentos) {
            if (med.getNombre().equalsIgnoreCase(nombreBuscado)) {
                return true;
            }
        }
        return false;
    }
}



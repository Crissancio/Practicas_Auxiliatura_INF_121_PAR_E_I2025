package persistencia;

import java.util.ArrayList;

public class Farmacia {
    private String nombreFarmacia;
    private int sucursal;
    private String direccion;
    private ArrayList<Medicamento> medicamentos;

    public Farmacia(String nombre, int sucursal, String direccion) {
        this.nombreFarmacia = nombre;
        this.sucursal = sucursal;
        this.direccion = direccion;
        medicamentos = new ArrayList<>();
    }

    public void agregarMedicamento(Medicamento m) {
        medicamentos.add(m);
    }

    public void mostrar() {
        System.out.println("Farmacia: " + nombreFarmacia + ", Sucursal: " + sucursal + ", Dirección: " + direccion);
        for (Medicamento m : medicamentos) {
            m.mostrar();
        }
    }

    public int getSucursal() {
        return sucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public boolean tieneMedicamento(String nombreMed) {
        for (Medicamento m : medicamentos) {
            if (m.getNombre().equalsIgnoreCase(nombreMed)) {
                return true;
            }
        }
        return false;
    }
}

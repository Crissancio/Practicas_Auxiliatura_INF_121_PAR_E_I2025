package PERSISTENCIA_DE_OBJETOS.EJER_5;
import java.io.Serializable;
import java.util.ArrayList;

public class Farmacia implements Serializable {
    String nombreFarmacia;
    int sucursal;
    String direccion;
    ArrayList<Medicamento> medicamentos;

    public Farmacia(String nombre, int sucursal, String direccion) {
        this.nombreFarmacia = nombre;
        this.sucursal = sucursal;
        this.direccion = direccion;
        this.medicamentos = new ArrayList<>();
    }

    public void agregarMedicamento(Medicamento m) {
        medicamentos.add(m);
    }

    public String getDireccion() {
        return direccion;
    }

    public int getSucursal() {
        return sucursal;
    }

    public ArrayList<Medicamento> getMedicamentosPorTipo(String tipo) {
        ArrayList<Medicamento> lista = new ArrayList<>();
        for (Medicamento m : medicamentos) {
            if (m.getTipo().equalsIgnoreCase(tipo)) {
                lista.add(m);
            }
        }
        return lista;
    }

    public boolean tieneMedicamento(String nombreMed) {
        for (Medicamento m : medicamentos) {
            if (m.nombre.equalsIgnoreCase(nombreMed)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Farmacia{" +
                "nombre='" + nombreFarmacia + '\'' +
                ", sucursal=" + sucursal +
                ", direccion='" + direccion + '\'' +
                ", medicamentos=" + medicamentos +
                '}';
    }
}

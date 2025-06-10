package Persistencia_de_Objetos.Ejercicio5;
import java.util.ArrayList;
import java.util.List;

public class Farmacia {
    private String nombreFarmacia;
    private int sucursal;
    private String direccion;
    private int nroMedicamentos; 

    private List<Medicamento> medicamentosDisponibles;

    public Farmacia() {
        this("", 0, "", 0);
    }

    public Farmacia(String nombreFarmacia, int sucursal, String direccion, int nroMedicamentos) {
        this.nombreFarmacia = nombreFarmacia;
        this.sucursal = sucursal;
        this.direccion = direccion;
        this.nroMedicamentos = nroMedicamentos; 
        this.medicamentosDisponibles = new ArrayList<>(); 
    }

    public String getNombreFarmacia() {
        return nombreFarmacia;
    }

    public int getSucursal() {
        return sucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getNroMedicamentos() {
        return nroMedicamentos;
    }

    public void leer() {
        System.out.println("Metodo leer() de Farmacia llamado. Los datos ya estan en el objeto");
    }

    public void mostrar() {
        System.out.println(this.toString());
    }

    public Medicamento buscaMedicamento(String nombreMedicamento) {
        for (Medicamento med : medicamentosDisponibles) {
            if (med.getNombre().equalsIgnoreCase(nombreMedicamento)) {
                return med;
            }
        }
        return null;
    }

    public void agregarMedicamentoLocal(Medicamento medicamento) {
        this.medicamentosDisponibles.add(medicamento);
    }

    public List<Medicamento> getMedicamentosDisponibles() {
        return medicamentosDisponibles;
    }

    @Override
    public String toString() {
        return String.format("%s,%d,%s,%d", nombreFarmacia, sucursal, direccion, nroMedicamentos);
    }

    public static Farmacia fromString(String farmaciaStr) {
        try {
            String[] partes = farmaciaStr.trim().split(",");
            if (partes.length == 4) {
                String nombreFarmacia = partes[0];
                int sucursal = Integer.parseInt(partes[1]);
                String direccion = partes[2];
                int nroMedicamentos = Integer.parseInt(partes[3]);
                return new Farmacia(nombreFarmacia, sucursal, direccion, nroMedicamentos);
            } else {
                System.err.println("Advertencia: Formato de linea incorrecto para farmacia: " + farmaciaStr);
                return null;
            }
        } catch (NumberFormatException e) {
            System.err.println("Error al parsear datos numericos de farmacia '" + farmaciaStr + "': " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error de indice al parsear linea de farmacia '" + farmaciaStr + "': " + e.getMessage());
            return null;
        }
    }
}
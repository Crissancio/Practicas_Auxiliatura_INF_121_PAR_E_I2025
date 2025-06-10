package Ejercicio5;

public class Farmacia {
    private String nombreFarmacia;
    private int sucursal;
    private String direccion;
    private int nroMedicamentos;
    private Medicamento[] m = new Medicamento[100];

    public Farmacia() {
        nroMedicamentos = 0;
    }

    public void leer(String nombreFarmacia, int sucursal, String direccion) {
        this.nombreFarmacia = nombreFarmacia;
        this.sucursal = sucursal;
        this.direccion = direccion;
    }

    public void adicionarMedicamento(Medicamento med) {
        if (nroMedicamentos < 100) {
            m[nroMedicamentos++] = med;
        }
    }

    public void mostrar() {
        System.out.println("Farmacia: " + nombreFarmacia + ", Sucursal: " + sucursal + ", Dirección: " + direccion);
        for (int i = 0; i < nroMedicamentos; i++) {
            m[i].mostrar();
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void mostrarMedicamentos(String tipo) {
        for (int i = 0; i < nroMedicamentos; i++) {
            if (m[i].getTipo().equalsIgnoreCase(tipo)) {
                m[i].mostrar();
            }
        }
    }

    public boolean buscaMedicamento(String nombre) {
        for (int i = 0; i < nroMedicamentos; i++) {
            if (m[i].getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    public double precioMedicamento(String tipo) {
        for (int i = 0; i < nroMedicamentos; i++) {
            if (m[i].getTipo().equalsIgnoreCase(tipo)) {
                return m[i].getPrecio();
            }
        }
        return 0.0;
    }

    public void mostrarMedicamentosMenorPrecio(String tipo) {
        double minPrecio = Double.MAX_VALUE;
        for (int i = 0; i < nroMedicamentos; i++) {
            if (m[i].getTipo().equalsIgnoreCase(tipo) && m[i].getPrecio() < minPrecio) {
                minPrecio = m[i].getPrecio();
            }
        }

        for (int i = 0; i < nroMedicamentos; i++) {
            if (m[i].getTipo().equalsIgnoreCase(tipo) && m[i].getPrecio() == minPrecio) {
                m[i].mostrar();
            }
        }
    }
}
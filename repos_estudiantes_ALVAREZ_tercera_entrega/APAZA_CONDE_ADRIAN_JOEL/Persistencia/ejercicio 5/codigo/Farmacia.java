package p3.ejer5.per;
public class Farmacia {
    public String nombreFarmacia;
    public int sucursal;
    public String direccion;
    public int nroMedicamentos;
    Medicamento[] m = new Medicamento[100];

    public Farmacia() {}

    public void leer() {
       
    }

    public void mostrar() {
        System.out.println("Sucursal: " + sucursal + ", Dirección: " + direccion);
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

    public void mostrarMedicamentos(String x) {
        for (int i = 0; i < nroMedicamentos; i++) {
            if (m[i].getTipo().equalsIgnoreCase(x)) {
                m[i].mostrar();
            }
        }
    }

    public boolean buscaMedicamento(String x) {
        for (int i = 0; i < nroMedicamentos; i++) {
            if (m[i].nombre.equalsIgnoreCase(x)) {
                return true;
            }
        }
        return false;
    }
}

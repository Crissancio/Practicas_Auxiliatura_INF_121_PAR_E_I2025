
package Ejercicio5;

public class Farmacia {
    private String nombreFarmacia;
    private int sucursal;
    private String direccion;
    int nroMedicamentos;
    Medicamento[] m = new Medicamento[100];

    public Farmacia() {
        // Constructor vacío
        this.nroMedicamentos = 0;
    }

    public void leer(String nombreFarmacia, int sucursal, String direccion) {
        this.nombreFarmacia = nombreFarmacia;
        this.sucursal = sucursal;
        this.direccion = direccion;
    }

    public void mostrar() {
        System.out.println("Nombre Farmacia: " + nombreFarmacia);
        System.out.println("Sucursal: " + sucursal);
        System.out.println("Dirección: " + direccion);
        System.out.println("Número de medicamentos: " + nroMedicamentos);
    }

    public String getDireccion() {
        return direccion;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void mostrarMedicamentos() {
        for (int i = 0; i < nroMedicamentos; i++) {
            m[i].mostrar();
        }
    }

    public void buscaMedicamento(String nombre) {
        for (int i = 0; i < nroMedicamentos; i++) {
            if (m[i].getTipo().equalsIgnoreCase(nombre)) {
                m[i].mostrar();
            }
        }
    }

    public void agregarMedicamento(Medicamento medicamento) {
        if (nroMedicamentos < 100) {
            m[nroMedicamentos] = medicamento;
            nroMedicamentos++;
        }
    }
}

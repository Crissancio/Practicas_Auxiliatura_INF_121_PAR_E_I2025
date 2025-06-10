package com.mycompany.ejepersistenciaobj5;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class Farmacia {
    String nombreFarmacia;
    int sucursal;
    String direccion;
    ArrayList<Medicamento> medicamentos = new ArrayList<>();

    public Farmacia(String nombre, int sucursal, String direccion) {
        this.nombreFarmacia = nombre;
        this.sucursal = sucursal;
        this.direccion = direccion;
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

    public int getSucursal() { return sucursal; }
    public String getDireccion() { return direccion; }

    public void mostrarMedicamentos(String tipo) {
        for (Medicamento m : medicamentos) {
            if (m.getTipo().equalsIgnoreCase(tipo)) {
                m.mostrar();
            }
        }
    }

    public boolean buscaMedicamento(String nombre) {
        for (Medicamento m : medicamentos) {
            if (m.nombre.equalsIgnoreCase(nombre)) return true;
        }
        return false;
    }
}

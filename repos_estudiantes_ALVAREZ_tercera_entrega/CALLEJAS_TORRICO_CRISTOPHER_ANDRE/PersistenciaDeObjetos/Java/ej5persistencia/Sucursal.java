package ej5persistencia;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private int numero;
    private String direccion;
    private List<Medicamento> medicamentos;

    public Sucursal() {
        medicamentos = new ArrayList<>();
    }

    public Sucursal(int numero, String direccion) {
        this.numero = numero;
        this.direccion = direccion;
        this.medicamentos = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void agregarMedicamento(Medicamento m) {
        medicamentos.add(m);
    }

    public List<Medicamento> obtenerMedicamentosPorTipo(String tipo) {
        List<Medicamento> resultado = new ArrayList<>();
        for (Medicamento med : medicamentos) {
            if (med.getTipo().equalsIgnoreCase(tipo)) {
                resultado.add(med);
            }
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Sucursal " + numero + ", Dirección: " + direccion;
    }
}

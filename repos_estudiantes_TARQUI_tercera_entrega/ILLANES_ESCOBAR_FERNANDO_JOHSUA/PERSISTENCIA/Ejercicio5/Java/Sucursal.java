package PERSISTENCIA.Ejercicio5.Java;

import java.io.Serializable;
import java.util.ArrayList;

public class Sucursal implements Serializable {
    private int numero;
    private String direccion;
    private ArrayList<Medicamento> medicamentos;

    public Sucursal(int numero, String direccion) {
        this.numero = numero;
        this.direccion = direccion;
        this.medicamentos = new ArrayList<>();
    }

    public void agregarMedicamento(Medicamento m) {
        medicamentos.add(m);
    }

    public int getNumero() { return numero; }
    public String getDireccion() { return direccion; }
    public ArrayList<Medicamento> getMedicamentos() { return medicamentos; }

    @Override
    public String toString() {
        return "Sucursal " + numero + " - " + direccion + ": " + medicamentos;
    }
}


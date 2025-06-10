package Ejercicio5;

import java.io.Serializable;
import java.util.Scanner;

public class Farmacia implements Serializable {
    private String nombreFarmacia;
    private int sucursal;
    private String direccion;
    private int nroMedicamentos;
    private Medicamento[] medicamentos;

    public Farmacia(String nombreFarmacia, int sucursal, String direccion, int nroMedicamentos) {
        this.nombreFarmacia = nombreFarmacia;
        this.sucursal = sucursal;
        this.direccion = direccion;
        this.nroMedicamentos = nroMedicamentos;
        this.medicamentos = new Medicamento[nroMedicamentos];
    }

    public Farmacia() {
    }

    public void leer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre Farmacia: ");
        nombreFarmacia = sc.nextLine();
        System.out.print("Sucursal: ");
        sucursal = sc.nextInt();
        sc.nextLine();
        System.out.print("Dirección: ");
        direccion = sc.nextLine();
        System.out.print("Número de medicamentos: ");
        nroMedicamentos = sc.nextInt();
        medicamentos = new Medicamento[nroMedicamentos];
        for (int i = 0; i < nroMedicamentos; i++) {
            System.out.println("Medicamento " + (i + 1) + ":");
            medicamentos[i] = new Medicamento();
            medicamentos[i].leer();
        }
    }

    public void mostrar() {
        System.out.println("Farmacia [Nombre: " + nombreFarmacia + ", Sucursal: " + sucursal +
                ", Dirección: " + direccion + "]");
        for (Medicamento m : medicamentos) {
            m.mostrar();
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public int getSucursal() {
        return sucursal;
    }

    public void mostrarMedicamentos(String tipoFiltro) {
        for (Medicamento m : medicamentos) {
            if (m.getTipo().equalsIgnoreCase(tipoFiltro)) {
                m.mostrar();
            }
        }
    }

    public boolean contieneMedicamento(String nombreMed) {
        for (Medicamento m : medicamentos) {
            if (m.getNombre().equalsIgnoreCase(nombreMed)) {
                return true;
            }
        }
        return false;
    }

    public double precioMenorMedicamento(String tipoFiltro) {
        double menor = Double.MAX_VALUE;
        for (Medicamento m : medicamentos) {
            if (m.getTipo().equalsIgnoreCase(tipoFiltro)) {
                if (m.getPrecio() < menor) {
                    menor = m.getPrecio();
                }
            }
        }
        return (menor == Double.MAX_VALUE) ? 0 : menor;
    }

    public void setMedicamentos(Medicamento[] medicamentos) {
        this.medicamentos = medicamentos;
    }

}

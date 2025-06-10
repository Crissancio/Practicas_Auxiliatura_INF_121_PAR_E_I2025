package Ejercicio5;

import java.util.Scanner;

public class Farmacia {
    private String nombreFarmacia;
    private int sucursal;
    private String direccion;
    private int nroMedicamentos;
    private Medicamento[] m = new Medicamento[100];

    public Farmacia() {
        for (int i = 0; i < m.length; i++)
            m[i] = new Medicamento();
    }

    public void leer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre Farmacia: ");
        nombreFarmacia = sc.nextLine();
        System.out.print("Número de sucursal: ");
        sucursal = sc.nextInt(); sc.nextLine();
        System.out.print("Dirección: ");
        direccion = sc.nextLine();
        System.out.print("Cantidad de medicamentos: ");
        nroMedicamentos = sc.nextInt();
        for (int i = 0; i < nroMedicamentos; i++) {
            System.out.println("Medicamento " + (i + 1));
            m[i].leer();
        }
    }

    public void mostrar() {
        System.out.println("Farmacia: " + nombreFarmacia + " | Sucursal: " + sucursal + " | Dirección: " + direccion);
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

    public void mostrarMedicamentos(int x) {
        if (sucursal == x) {
            for (int i = 0; i < nroMedicamentos; i++) {
                if (m[i].getTipo().equalsIgnoreCase("Tos")) {
                    m[i].mostrar();
                }
            }
        }
    }

    public boolean buscaMedicamento(String n) {
        for (int i = 0; i < nroMedicamentos; i++) {
            if (m[i].getNombre().equalsIgnoreCase(n)) {
                return true;
            }
        }
        return false;
    }

    public String getDatos() {
        StringBuilder sb = new StringBuilder();
        sb.append(sucursal).append(";").append(direccion).append("\n");
        for (int i = 0; i < nroMedicamentos; i++) {
            sb.append(m[i].getNombre()).append(",")
              .append(m[i].getTipo()).append(",")
              .append(m[i].getPrecio()).append("\n");
        }
        sb.append("###\n");
        return sb.toString();
    }
}

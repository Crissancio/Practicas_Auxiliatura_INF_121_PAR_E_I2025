package persistencia;

import java.util.ArrayList;

public class ArchFarmacia {
    private ArrayList<Farmacia> lista;

    public ArchFarmacia() {
        lista = new ArrayList<>();
    }

    public void adicionar(Farmacia f) {
        lista.add(f);
    }

    public void crearArchivo() {
        // a) Crear y mostrar archivo de farmacias (simulado)
        System.out.println("== a) Archivo de farmacias creado y leído:");
        for (Farmacia f : lista) {
            f.mostrar();
        }
    }

    public void mostrarMedicamentosTos(int sucursalX) {
        // b) Mostrar medicamentos para la tos de la sucursal X
        System.out.println("\n== b) Medicamentos para la tos en la sucursal " + sucursalX + ":");
        for (Farmacia f : lista) {
            if (f.getSucursal() == sucursalX) {
                for (Medicamento m : f.getMedicamentos()) {
                    if (m.getTipo().equalsIgnoreCase("Tos")) {
                        m.mostrar();
                    }
                }
            }
        }
    }

    public void buscarMedicamento(String nombreMed) {
        // c) Mostrar sucursal y dirección que tienen el medicamento Golpex
        System.out.println("\n== c) Farmacias que tienen el medicamento " + nombreMed + ":");
        for (Farmacia f : lista) {
            if (f.tieneMedicamento(nombreMed)) {
                System.out.println("Sucursal: " + f.getSucursal() + ", Dirección: " + f.getDireccion());
            }
        }
    }
}

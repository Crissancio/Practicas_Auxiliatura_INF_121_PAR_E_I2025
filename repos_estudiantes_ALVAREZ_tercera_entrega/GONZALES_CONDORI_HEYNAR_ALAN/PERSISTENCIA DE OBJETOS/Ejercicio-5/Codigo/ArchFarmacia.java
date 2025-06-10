
package Ejercicio5;

import java.util.ArrayList;

public class ArchFarmacia {
    private String na;
    private ArrayList<Farmacia> farmacias = new ArrayList<>();

    public ArchFarmacia(String na) {
        this.na = na;
    }

    public void crearArchivo() {
        // Crear archivo, este es solo un esqueleto, puedes usar FileWriter o similar
        System.out.println("Archivo creado: " + na);
    }

    public void adicionar(Farmacia farmacia) {
        farmacias.add(farmacia);
    }

    public void listar() {
        for (Farmacia farmacia : farmacias) {
            farmacia.mostrar();
        }
    }

    public void mostrarMedicamentosResfriados() {
        for (Farmacia farmacia : farmacias) {
            for (int i = 0; i < farmacia.nroMedicamentos; i++) {
                if (farmacia.m[i].getTipo().equalsIgnoreCase("Resfriado")) {
                    farmacia.m[i].mostrar();
                }
            }
        }
    }

    public double precioMedicamentoTos() {
        double total = 0;
        for (Farmacia farmacia : farmacias) {
            for (int i = 0; i < farmacia.nroMedicamentos; i++) {
                if (farmacia.m[i].getTipo().equalsIgnoreCase("Tos")) {
                    total += farmacia.m[i].getPrecio();
                }
            }
        }
        return total;
    }

    public void mostrarMedicamentoMenorTos() {
        Medicamento menor = null;
        for (Farmacia farmacia : farmacias) {
            for (int i = 0; i < farmacia.nroMedicamentos; i++) {
                if (farmacia.m[i].getTipo().equalsIgnoreCase("Tos")) {
                    if (menor == null || farmacia.m[i].getPrecio() < menor.getPrecio()) {
                        menor = farmacia.m[i];
                    }
                }
            }
        }
        if (menor != null) {
            menor.mostrar();
        } else {
            System.out.println("No se encontró medicamento para la tos");
        }
    }
}

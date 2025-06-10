package Ejercicio5;

import java.util.ArrayList;

public class ArchFarmacia {
    private String na;
    private ArrayList<Farmacia> farmacias;

    public ArchFarmacia(String na) {
        this.na = na;
        farmacias = new ArrayList<>();
    }

    public void crearArchivo() {
        farmacias = new ArrayList<>();
    }

    public void adicionar(Farmacia f) {
        farmacias.add(f);
    }

    public void listar() {
        for (Farmacia f : farmacias) {
            f.mostrar();
        }
    }

    public void mostrarMedicamentosResfrios() {
        for (Farmacia f : farmacias) {
            f.mostrarMedicamentos("resfrio");
        }
    }

    public double precioMedicamentoTos() {
        double precio = 0.0;
        for (Farmacia f : farmacias) {
            double p = f.precioMedicamento("tos");
            if (p > 0.0) {
                precio = p;
                break;
            }
        }
        return precio;
    }

    public void mostrarMedicamentosMenorTos() {
        for (Farmacia f : farmacias) {
            f.mostrarMedicamentosMenorPrecio("tos");
        }
    }

    public void mostrarMedicamentosTosSucursal(int sucursal) {
        for (Farmacia f : farmacias) {
            if (f.getSucursal() == sucursal) {
                f.mostrarMedicamentos("tos");
            }
        }
    }

    public void mostrarSucursalYDireccionConGolpex() {
        for (Farmacia f : farmacias) {
            if (f.buscaMedicamento("Golpex")) {
                System.out.println("Sucursal: " + f.getSucursal() + ", Dirección: " + f.getDireccion());
            }
        }
    }
}
package com.mycompany.ejepersistenciaobj5;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class ArchFarmacia {
    String nombreArchivo;
    ArrayList<Farmacia> farmacias = new ArrayList<>();

    public ArchFarmacia(String na) {
        this.nombreArchivo = na;
    }

    public void adicionar(Farmacia f) {
        farmacias.add(f);
    }

    public void listar() {
        for (Farmacia f : farmacias) {
            f.mostrar();
        }
    }

    public void mostrarMedicamentosTos(int sucursal) {
        for (Farmacia f : farmacias) {
            if (f.getSucursal() == sucursal) {
                f.mostrarMedicamentos("tos");
            }
        }
    }

    public void mostrarSucursalesConGolpex() {
        for (Farmacia f : farmacias) {
            if (f.buscaMedicamento("Golpex")) {
                System.out.println("Sucursal: " + f.getSucursal() + ", Dirección: " + f.getDireccion());
            }
        }
    }
}

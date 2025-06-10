
package mainpersistenciafarmacia;

import java.util.ArrayList;

public class ArchFarmacia {
    private String nombreArchivo;
    private ArrayList<Farmacia> farmacias;

    public ArchFarmacia(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.farmacias = new ArrayList<>();
    }

    public void adicionar(Farmacia farmacia) {
        farmacias.add(farmacia);
    }

    public void listar() {
        System.out.println("Listado de Farmacias (" + nombreArchivo + "):");
        for (Farmacia farmacia : farmacias) {
            farmacia.mostrar();
        }
    }

    public void mostrarMedicamentosTos(int sucursalNumero) {
        for (Farmacia farmacia : farmacias) {
            if (farmacia.getSucursal() == sucursalNumero) {
                farmacia.mostrarMedicamentos("Tos");
            }
        }
    }

    public void mostrarFarmaciasConMedicamento(String nombreMedicamento) {
        System.out.println("Farmacias que tienen el medicamento '" + nombreMedicamento + "':");
        for (Farmacia farmacia : farmacias) {
            if (farmacia.buscaMedicamento(nombreMedicamento)) {
                System.out.println("Sucursal: " + farmacia.getSucursal() + " | Direccion: " + farmacia.getDireccion());
            }
        }
    }
}



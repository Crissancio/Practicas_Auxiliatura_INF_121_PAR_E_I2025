package p3.ejer5.per;
import java.io.*;
import java.util.ArrayList;

public class ArchFarmacia {
    public String na;
    ArrayList<Farmacia> lista = new ArrayList<>();

    public ArchFarmacia(String na) {
        this.na = na;
    }

    public void crearArchivo() {
        try {
            File arch = new File(na);
            if (!arch.exists()) {
                arch.createNewFile();
            }
        } catch (IOException e) {
            System.out.println("ocurrio un error al crear archivo");
        }
    }

    public void adicionar(Farmacia f) {
        lista.add(f);
       
    }

    public void listar() {
        for (Farmacia f : lista) {
            f.mostrar();
        }
    }

    public void mostrarMedicamentosResfrios() {
        for (Farmacia f : lista) {
            f.mostrarMedicamentos("Resfrio");
        }
    }

    public void precioMedicamentoTos() {
        for (Farmacia f : lista) {
            for (int i = 0; i < f.nroMedicamentos; i++) {
                Medicamento m1 = f.m[i];
                if (m1.getTipo().equalsIgnoreCase("Tos")) {
                    System.out.println("precio del medicamento para tos: " + m1.getPrecio());
                }
            }
        }
    }

    public void mostrarMedicamentosMenorTos() {
        double min = Double.MAX_VALUE;
        for (Farmacia f : lista) {
            for (int i = 0; i < f.nroMedicamentos; i++) {
                Medicamento m2 = f.m[i];
                if (m2.getTipo().equalsIgnoreCase("Tos") && m2.getPrecio() < min) {
                    min = m2.getPrecio();
                }
            }
        }
        System.out.println("medicamento para la tos con menor precio es de " + min);
    }

    public void mostrarMedicamentosTosSucursalX(int x) {
        for (Farmacia f : lista) {
            if (f.getSucursal() == x) {
                f.mostrarMedicamentos("Tos");
            }
        }
    }

    public void mostrarSucursalDireccionConMedicamento(String x) {
        for (Farmacia f : lista) {
            if (f.buscaMedicamento(x)) {
                System.out.println("sucursal: " + f.getSucursal() + " dirección: " + f.getDireccion());
            }
        }
    }
}

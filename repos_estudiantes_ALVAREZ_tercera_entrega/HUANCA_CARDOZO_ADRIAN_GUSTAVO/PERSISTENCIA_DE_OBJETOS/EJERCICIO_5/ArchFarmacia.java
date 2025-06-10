package PERSISTENCIA_DE_OBJETOS.EJERCICIO_5;
import java.io.*;
import java.util.ArrayList;

public class ArchFarmacia {
    private String na;

    public ArchFarmacia(String na) {
        this.na = na;
    }

    public void crearArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(na))) {
            oos.writeObject(new ArrayList<Farmacia>());
            System.out.println("Archivo creado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void adicionar(Farmacia f) {
        ArrayList<Farmacia> lista = listar();
        lista.add(f);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(na))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Farmacia> listar() {
        ArrayList<Farmacia> lista = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(na))) {
            lista = (ArrayList<Farmacia>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // Si el archivo no existe aún, se ignora la excepción
        }
        return lista;
    }

    public void mostrarMedicamentosResfrios() {
        ArrayList<Farmacia> lista = listar();
        for (Farmacia f : lista) {
            System.out.println("Farmacia: " + f.getSucursal());
            f.mostrarMedicamentos("Resfrio");
        }
    }

    public double precioMedicamentoTos() {
        double suma = 0.0;
        ArrayList<Farmacia> lista = listar();
        for (Farmacia f : lista) {
            ArrayList<Medicamento> medicamentos = new ArrayList<>();
            try {
                var field = Farmacia.class.getDeclaredField("medicamentos");
                field.setAccessible(true);
                medicamentos = (ArrayList<Medicamento>) field.get(f);
            } catch (Exception e) {
                e.printStackTrace();
            }

            for (Medicamento m : medicamentos) {
                if (m.getTipo().equalsIgnoreCase("Tos")) {
                    suma += m.getPrecio();
                }
            }
        }
        return suma;
    }

    public void mostrarMedicamentosMenorTos(int sucursalX) {
        ArrayList<Farmacia> lista = listar();
        for (Farmacia f : lista) {
            if (f.getSucursal() == sucursalX) {
                System.out.println("Medicamentos para la Tos en Sucursal " + sucursalX + ":");
                f.mostrarMedicamentos("Tos");
            }
        }
    }

    public void mostrarSucursalesConMedicamento(String nombreMedicamento) {
        ArrayList<Farmacia> lista = listar();
        for (Farmacia f : lista) {
            if (f.buscaMedicamento(nombreMedicamento)) {
                System.out.println("Sucursal: " + f.getSucursal() + ", Direccion: " + f.getDireccion());
            }
        }
    }
}


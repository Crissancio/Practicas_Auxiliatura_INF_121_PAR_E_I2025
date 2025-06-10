package Ejercicio5;

import java.io.*;
import java.util.ArrayList;

public class ArchFarmacia {
    private String na;

    public ArchFarmacia(String na) {
        this.na = na;
    }

    // a) Crear archivo
    public void crearArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(na))) {
            oos.writeObject(new ArrayList<Farmacia>());
            System.out.println("Archivo creado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
        }
    }

    // a) Adicionar una farmacia
    public void adicionar() {
        ArrayList<Farmacia> lista = leerArchivo();
        Farmacia f = new Farmacia();
        f.leer();
        lista.add(f);
        escribirArchivo(lista);
    }

    // a) Listar farmacias y sus medicamentos
    public void listar() {
        ArrayList<Farmacia> lista = leerArchivo();
        for (Farmacia f : lista) {
            f.mostrar();
        }
    }

    // b) Mostrar medicamentos para la tos de sucursal X
    public void mostrarMedicamentosResfrios(int suc) {
        ArrayList<Farmacia> lista = leerArchivo();
        for (Farmacia f : lista) {
            if (f.getSucursal() == suc) {
                System.out.println("Medicamentos tipo 'tos' en sucursal " + suc + ":");
                f.mostrarMedicamentos("tos");
                return;
            }
        }
        System.out.println("No se encontró la sucursal.");
    }

    // c) Mostrar sucursal y dirección del medicamento "Golpex"
    public void mostrarMedicamentosMenosTos(String nombreMedicamento) {
        ArrayList<Farmacia> lista = leerArchivo();
        for (Farmacia f : lista) {
            if (f.contieneMedicamento(nombreMedicamento)) {
                System.out.println("Medicamento '" + nombreMedicamento + "' encontrado:");
                System.out.println("Sucursal: " + f.getSucursal() + ", Dirección: " + f.getDireccion());
                return;
            }
        }
        System.out.println("Medicamento no encontrado.");
    }

    public double precioMedicamentoTos() {
        ArrayList<Farmacia> lista = leerArchivo();
        double menor = Double.MAX_VALUE;
        for (Farmacia f : lista) {
            double precio = f.precioMenorMedicamento("tos");
            if (precio > 0 && precio < menor) {
                menor = precio;
            }
        }
        return (menor == Double.MAX_VALUE) ? 0 : menor;
    }

    private ArrayList<Farmacia> leerArchivo() {
        ArrayList<Farmacia> lista = new ArrayList<>();
        File f = new File(na);
        if (f.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(na))) {
                lista = (ArrayList<Farmacia>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error al leer archivo: " + e.getMessage());
            }
        }
        return lista;
    }

    private void escribirArchivo(ArrayList<Farmacia> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(na))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            System.out.println("Error al escribir archivo: " + e.getMessage());
        }
    }

    public void adicionarFarmaciaDirectamente(Farmacia f) {
        ArrayList<Farmacia> lista = leerArchivo();
        lista.add(f);
        escribirArchivo(lista);
    }

}

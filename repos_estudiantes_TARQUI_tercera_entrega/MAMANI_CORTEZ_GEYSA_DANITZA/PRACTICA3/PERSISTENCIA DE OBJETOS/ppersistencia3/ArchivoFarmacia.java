/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppersistencia3;

/**
 *
 * @author Administrador
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ArchivoFarmacia {
    private String na;

    public ArchivoFarmacia(String na) {
        this.na = na;
    }

    public void crearArchivo() {
        try (ObjectOutputStream far = new ObjectOutputStream(new FileOutputStream(na))) {
            far.writeObject(new ArrayList<Farmacia>());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void adicionar() {
        List<Farmacia> lista = leerLista();
        Farmacia f = new Farmacia();
        f.leer();
        lista.add(f);
        escribirLista(lista);
    }

    public void listar() {
        List<Farmacia> lista = leerLista();
        for (Farmacia f : lista) {
            f.mostrar();
        }
    }

    // b) Mostrar medicamentos para la tos de sucursal X
    public void mostrarMTos(int sucursalX) {
        List<Farmacia> lista = leerLista();
        for (Farmacia f : lista) {
            if (f.getSucursal() == sucursalX) {
                System.out.println("Sucursal: " + sucursalX);
                f.mostrarMedicamentos("Tos");
            }
        }
    }

    // c) Buscar "Golpex" y mostrar sucursal y dirección
    public void mostrarFGolpex() {
        List<Farmacia> lista = leerLista();
        for (Farmacia f : lista) {
            if (f.buscaMedicamento("Golpex")) {
                System.out.println("Sucursal: " + f.getSucursal() + ", Dirección: " + f.getDireccion());
            }
        }
    }

    // Utilidades internas
    private List<Farmacia> leerLista() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(na))) {
            return (List<Farmacia>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    private void escribirLista(List<Farmacia> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(na))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


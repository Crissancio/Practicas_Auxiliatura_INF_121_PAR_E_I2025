package PERSISTENCIA.Ejercicio5.Java;

import java.io.*;
import java.util.ArrayList;

public class GestorFarmacia {
    private final String archivo = "farmacias.dat";

    public void guardarSucursal(Sucursal s) {
        ArrayList<Sucursal> lista = leerTodas();
        lista.add(s);
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(archivo))) {
            out.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Sucursal> leerTodas() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(archivo))) {
            return (ArrayList<Sucursal>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }

    public void mostrarMedicamentosTos(int numeroSucursal) {
        for (Sucursal s : leerTodas()) {
            if (s.getNumero() == numeroSucursal) {
                System.out.println("Medicamentos para la tos - Sucursal " + s.getNumero());
                for (Medicamento m : s.getMedicamentos()) {
                    if (m.getTipo().equalsIgnoreCase("tos")) {
                        System.out.println("- " + m.getNombre());
                    }
                }
            }
        }
    }

    public void mostrarSucursalesConGolpex() {
        for (Sucursal s : leerTodas()) {
            for (Medicamento m : s.getMedicamentos()) {
                if (m.getNombre().equalsIgnoreCase("Golpex")) {
                    System.out.println("Golpex se encuentra en: Sucursal " +
                        s.getNumero() + " - " + s.getDireccion());
                }
            }
        }
    }
}


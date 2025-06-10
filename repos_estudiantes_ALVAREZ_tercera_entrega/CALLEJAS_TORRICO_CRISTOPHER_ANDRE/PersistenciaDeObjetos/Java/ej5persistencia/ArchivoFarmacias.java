package ej5persistencia;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArchivoFarmacias {
    private String nombreArchivo;
    private List<Sucursal> sucursales;
    private ObjectMapper mapper = new ObjectMapper();

    public ArchivoFarmacias(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.sucursales = cargarSucursales();
    }

    private List<Sucursal> cargarSucursales() {
        try {
            File archivo = new File(nombreArchivo);
            if (!archivo.exists()) return new ArrayList<>();
            return mapper.readValue(archivo, new TypeReference<List<Sucursal>>() {});
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    private void guardarSucursales() {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(nombreArchivo), sucursales);
        } catch (IOException e) {
            System.out.println("Error al guardar: " + e.getMessage());
        }
    }

    public void guardarSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
        guardarSucursales();
    }

    public List<Medicamento> mostrarMedicamentosTos(int numeroSucursal) {
        for (Sucursal s : sucursales) {
            if (s.getNumero() == numeroSucursal) {
                return s.obtenerMedicamentosPorTipo("tos");
            }
        }
        return new ArrayList<>();
    }

    public List<String> buscarSucursalPorMedicamento(String nombreMedicamento) {
        List<String> resultado = new ArrayList<>();
        for (Sucursal s : sucursales) {
            for (Medicamento m : s.getMedicamentos()) {
                if (m.getNombre().equalsIgnoreCase(nombreMedicamento)) {
                    resultado.add("Sucursal " + s.getNumero() + " - Dirección: " + s.getDireccion());
                    break;
                }
            }
        }
        return resultado;
    }

    public void mostrarTodasLasSucursales() {
        System.out.println("=== Archivo Completo de Farmacias ===");
        for (Sucursal s : sucursales) {
            System.out.println(s);
            for (Medicamento m : s.getMedicamentos()) {
                System.out.println("  - " + m);
            }
        }
        System.out.println("=====================================");
    }
}

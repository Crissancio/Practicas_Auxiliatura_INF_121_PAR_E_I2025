/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.persistencia3;

/**
 *
 * @author USUARIO
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 1. Clase Medicamento (debe ser Serializable)
class Medicamento implements Serializable {
    private static final long serialVersionUID = 1L;
    private int codMedicamento;
    private String nombre;
    private String tipo; // Ej: "Tos", "Resfrio", "Dolor de cabeza"
    private double precio;

    // Constructor para crear objetos fácilmente
    public Medicamento(int codMedicamento, String nombre, String tipo, double precio) {
        this.codMedicamento = codMedicamento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precio = precio;
    }
    
    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    
    // Método para mostrar el estado del objeto
    public void mostrar() {
        System.out.println(
            "\t\t- Med: " + nombre + " (Cod: " + codMedicamento + 
            ", Tipo: " + tipo + ", Precio: " + String.format("%.2f", precio) + " Bs.)"
        );
    }
}

// 2. Clase Farmacia (debe ser Serializable)
class Farmacia implements Serializable {
    private static final long serialVersionUID = 2L;
    private String nombreFarmacia;
    private int sucursal;
    private String direccion;
    private List<Medicamento> medicamentos; // Usamos una lista dinámica

    // Constructor para crear objetos fácilmente
    public Farmacia(String nombreFarmacia, int sucursal, String direccion) {
        this.nombreFarmacia = nombreFarmacia;
        this.sucursal = sucursal;
        this.direccion = direccion;
        this.medicamentos = new ArrayList<>();
    }
    
    public int getSucursal() { return sucursal; }
    public String getDireccion() { return direccion; }
    public List<Medicamento> getMedicamentos() { return medicamentos; }
    
    public void adicionarMedicamento(Medicamento med) {
        this.medicamentos.add(med);
    }
    
    // Método para buscar un medicamento por nombre dentro de esta farmacia
    public boolean buscaMedicamento(String nombreMedicamento) {
        for (Medicamento med : medicamentos) {
            if (med.getNombre().equalsIgnoreCase(nombreMedicamento)) {
                return true;
            }
        }
        return false;
    }

    // Método para mostrar el estado del objeto
    public void mostrar() {
        System.out.println("Farmacia: " + nombreFarmacia + " (Sucursal: " + sucursal + ")");
        System.out.println("\tDirección: " + direccion);
        System.out.println("\tMedicamentos registrados:");
        if (medicamentos.isEmpty()) {
            System.out.println("\t\t(Sin medicamentos)");
        } else {
            for (Medicamento med : medicamentos) {
                med.mostrar();
            }
        }
        System.out.println(); // Salto de línea para separar farmacias
    }
}

// 3. Clase ArchFarmacia para la persistencia
class ArchFarmacia {
    private String na; // nombre del archivo

    public ArchFarmacia(String na) {
        this.na = na;
    }

    public void crearArchivo() {
        try {
            // Borra el archivo si existe para empezar de cero en cada ejecución
            File f = new File(na);
            if(f.exists()) f.delete();
            f.createNewFile();
            System.out.println("Archivo '" + na + "' creado/limpiado exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al crear archivo: " + e.getMessage());
        }
    }
    
    public void adicionar(Farmacia farmacia) {
        List<Farmacia> lista = listar(); // Lee la lista actual
        lista.add(farmacia); // Añade la nueva farmacia
        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(na))) {
            oos.writeObject(lista); // Guarda la lista actualizada
        } catch (IOException e) {
            System.out.println("Error al adicionar farmacia: " + e.getMessage());
        }
    }
    
    @SuppressWarnings("unchecked")
    public List<Farmacia> listar() {
        List<Farmacia> lista = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(na))) {
            lista = (List<Farmacia>) ois.readObject();
        } catch (EOFException e) {
            // Archivo vacío, retorna lista vacía
        } catch (IOException | ClassNotFoundException e) {
            // Otros errores
        }
        return lista;
    }
}


// --- Clase Principal para Ejecución y Pruebas ---
public class Persistencia3 {
    public static void main(String[] args) {
        ArchFarmacia archivoFarmacias = new ArchFarmacia("farmacias.dat");
        
        // --- PREPARACIÓN DE DATOS ---
        // Crear Medicamentos
        Medicamento paracetamol = new Medicamento(101, "Paracetamol", "Dolor de cabeza", 5.50);
        Medicamento golpex = new Medicamento(102, "Golpex", "Resfrio", 12.00);
        Medicamento mentisan = new Medicamento(103, "Mentisan", "Resfrio", 15.00);
        Medicamento ambroxol = new Medicamento(201, "Ambroxol", "Tos", 25.50);
        Medicamento bisolvon = new Medicamento(202, "Bisolvon", "Tos", 30.00);
        
        // Crear Farmacia 1 y añadir medicamentos
        Farmacia f1 = new Farmacia("Farmacorp", 1, "Av. 6 de Marzo #123");
        f1.adicionarMedicamento(paracetamol);
        f1.adicionarMedicamento(golpex); // Esta farmacia tiene Golpex
        f1.adicionarMedicamento(ambroxol);

        // Crear Farmacia 2 y añadir medicamentos
        Farmacia f2 = new Farmacia("Bolivia", 2, "Calle 10, Obrajes #456");
        f2.adicionarMedicamento(mentisan);
        f2.adicionarMedicamento(bisolvon); // Esta farmacia tiene un medicamento para la tos
        f2.adicionarMedicamento(paracetamol);
        
        // Crear Farmacia 3 y añadir medicamentos
        Farmacia f3 = new Farmacia("Farmacorp", 3, "Plaza del Estudiante #789");
        f3.adicionarMedicamento(golpex); // Esta también tiene Golpex
        f3.adicionarMedicamento(bisolvon);

        // --- a) Crear y Adicionar al Archivo ---
        System.out.println("--- a) Creando archivo y guardando farmacias ---");
        archivoFarmacias.crearArchivo();
        archivoFarmacias.adicionar(f1);
        archivoFarmacias.adicionar(f2);
        archivoFarmacias.adicionar(f3);
        System.out.println("Se guardaron 3 farmacias.");
        System.out.println("\n--- a) Mostrando todas las farmacias desde el archivo ---");
        List<Farmacia> farmaciasLeidas = archivoFarmacias.listar();
        if (farmaciasLeidas.isEmpty()) {
            System.out.println("No hay farmacias en el archivo.");
        } else {
            for (Farmacia f : farmaciasLeidas) {
                f.mostrar();
            }
        }
        
        // --- b) Mostrar medicamentos para la tos de la Sucursal X ---
        int sucursalBuscada = 2;
        System.out.println("\n--- b) Buscando medicamentos para la Tos en Sucursal " + sucursalBuscada + " ---");
        boolean sucursalEncontrada = false;
        for (Farmacia f : farmaciasLeidas) {
            if (f.getSucursal() == sucursalBuscada) {
                sucursalEncontrada = true;
                System.out.println("Medicamentos para la tos en " + f.getDireccion() + ":");
                boolean medEncontrado = false;
                for(Medicamento med : f.getMedicamentos()){
                    if(med.getTipo().equalsIgnoreCase("Tos")){
                        med.mostrar();
                        medEncontrado = true;
                    }
                }
                if(!medEncontrado) {
                    System.out.println("\t\t(No se encontraron medicamentos para la tos en esta sucursal)");
                }
            }
        }
        if(!sucursalEncontrada) {
             System.out.println("No se encontró la sucursal número " + sucursalBuscada);
        }

        // --- c) Mostrar sucursal y dirección que tienen "Golpex" ---
        String medBuscado = "Golpex";
        System.out.println("\n--- c) Buscando Farmacias con el medicamento '" + medBuscado + "' ---");
        boolean encontrado = false;
        for (Farmacia f : farmaciasLeidas) {
            if (f.buscaMedicamento(medBuscado)) {
                System.out.println("Encontrado en -> Sucursal: " + f.getSucursal() + ", Dirección: " + f.getDireccion());
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Ninguna farmacia tiene el medicamento '" + medBuscado + "'.");
        }
    }
}
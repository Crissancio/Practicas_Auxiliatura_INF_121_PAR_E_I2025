package Persistencia;

import java.util.Scanner;

class Medicamento {
    private String nombre;
    private int codMedicamento;
    private String tipo;
    private double precio;

    public void leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre del medicamento: ");
        this.nombre = scanner.nextLine();
        System.out.print("Código: ");
        this.codMedicamento = Integer.parseInt(scanner.nextLine());
        System.out.print("Tipo (Tos, Resfrio, etc.): ");
        this.tipo = scanner.nextLine();
        System.out.print("Precio: ");
        this.precio = Double.parseDouble(scanner.nextLine());
    }

    public void mostrar() {
        System.out.printf("%s - %s - %.2f%n", nombre, tipo, precio);
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }
}

class Farmacia {
    private String nombreFarmacia;
    private int sucursal;
    private String direccion;
    private Medicamento[] medicamentos;
    private int nroMedicamentos;

    public Farmacia() {
        medicamentos = new Medicamento[100];
        nroMedicamentos = 0;
    }

    public void leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nombre farmacia: ");
        this.nombreFarmacia = scanner.nextLine();
        System.out.print("Sucursal: ");
        this.sucursal = Integer.parseInt(scanner.nextLine());
        System.out.print("Dirección: ");
        this.direccion = scanner.nextLine();
        System.out.print("Cuántos medicamentos: ");
        int cantidad = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nMedicamento #" + (i+1));
            Medicamento med = new Medicamento();
            med.leer();
            agregarMedicamento(med);
        }
    }

    public void agregarMedicamento(Medicamento med) {
        medicamentos[nroMedicamentos++] = med;
    }

    public void mostrar() {
        System.out.printf("%s - Sucursal %d - %s%n", nombreFarmacia, sucursal, direccion);
        for (int i = 0; i < nroMedicamentos; i++) {
            medicamentos[i].mostrar();
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public int getSucursal() {
        return sucursal;
    }

    public int getNroMedicamentos() {
        return nroMedicamentos;
    }

    public Medicamento getMedicamento(int index) {
        return medicamentos[index];
    }

    public void mostrarMedicamentos(String tipo) {
        for (int i = 0; i < nroMedicamentos; i++) {
            if (medicamentos[i].getTipo().equalsIgnoreCase(tipo)) {
                medicamentos[i].mostrar();
            }
        }
    }

    public boolean buscaMedicamento(String nombreBuscado) {
        for (int i = 0; i < nroMedicamentos; i++) {
            if (medicamentos[i].getNombre().equalsIgnoreCase(nombreBuscado)) {
                return true;
            }
        }
        return false;
    }
}

class ArchFarmacia {
    private Farmacia[] farmacias;
    private int cantidad;
    private String nombreArchivo;

    public ArchFarmacia(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
        farmacias = new Farmacia[100];
        cantidad = 0;
        crearArchivo();
    }

    public void crearArchivo() {
        cantidad = 0;
    }

    public void adicionar() {
        Farmacia f = new Farmacia();
        f.leer();
        farmacias[cantidad++] = f;
    }

    public void listar() {
        for (int i = 0; i < cantidad; i++) {
            farmacias[i].mostrar();
            System.out.println();
        }
    }

    public void mostrarMedicamentosResfrios() {
        for (int i = 0; i < cantidad; i++) {
            farmacias[i].mostrarMedicamentos("Resfrio");
        }
    }

    public void precioMedicamentoTos() {
        double total = 0.0;
        for (int i = 0; i < cantidad; i++) {
            Farmacia f = farmacias[i];
            for (int j = 0; j < f.getNroMedicamentos(); j++) {
                if (f.getMedicamento(j).getTipo().equalsIgnoreCase("Tos")) {
                    total += f.getMedicamento(j).getPrecio();
                }
            }
        }
        System.out.printf("Precio total medicamentos para la Tos: %.2f%n", total);
    }

    public void mostrarMedicamentosMenorTos() {
        for (int i = 0; i < cantidad; i++) {
            Farmacia f = farmacias[i];
            for (int j = 0; j < f.getNroMedicamentos(); j++) {
                Medicamento med = f.getMedicamento(j);
                if (med.getTipo().equalsIgnoreCase("Tos") && med.getPrecio() < 20.0) {
                    med.mostrar();
                }
            }
        }
    }

    public void mostrarMedicamentosTosSucursal(int x) {
        for (int i = 0; i < cantidad; i++) {
            if (farmacias[i].getSucursal() == x) {
                farmacias[i].mostrarMedicamentos("Tos");
            }
        }
    }

    public void buscarFarmaciaConMedicamento(String nombreMed) {
        for (int i = 0; i < cantidad; i++) {
            if (farmacias[i].buscaMedicamento(nombreMed)) {
                System.out.printf("Sucursal: %d - Dirección: %s%n", 
                    farmacias[i].getSucursal(), farmacias[i].getDireccion());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ArchFarmacia archivo = new ArchFarmacia("farmacias.dat");
        archivo.adicionar();
        archivo.listar();

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngrese la sucursal: ");
        int sucursalDeseada = Integer.parseInt(scanner.nextLine());
        archivo.mostrarMedicamentosTosSucursal(sucursalDeseada);

        archivo.buscarFarmaciaConMedicamento("Golpex");
    }
}
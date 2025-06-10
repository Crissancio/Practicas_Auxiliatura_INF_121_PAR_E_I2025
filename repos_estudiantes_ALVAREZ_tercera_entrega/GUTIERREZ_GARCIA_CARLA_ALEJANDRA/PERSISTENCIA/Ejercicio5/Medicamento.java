package Ejercicio5;

import java.io.Serializable;
import java.util.Scanner;

public class Medicamento implements Serializable {
    private String nombre;
    private int codMedicamento;
    private String tipo;
    private double precio;

    public Medicamento(String nombre, int codMedicamento, String tipo, double precio) {
        this.nombre = nombre;
        this.codMedicamento = codMedicamento;
        this.tipo = tipo;
        this.precio = precio;
    }

    public Medicamento() {
    }

    public void leer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Código: ");
        codMedicamento = sc.nextInt();
        sc.nextLine();
        System.out.print("Tipo: ");
        tipo = sc.nextLine();
        System.out.print("Precio: ");
        precio = sc.nextDouble();
    }

    public void mostrar() {
        System.out.println("Medicamento [Nombre: " + nombre + ", Código: " + codMedicamento +
                ", Tipo: " + tipo + ", Precio: " + precio + "]");
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

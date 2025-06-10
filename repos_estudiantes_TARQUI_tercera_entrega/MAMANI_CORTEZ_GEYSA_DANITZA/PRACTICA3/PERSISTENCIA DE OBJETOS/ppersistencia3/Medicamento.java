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
import java.io.Serializable;
import java.util.Scanner;

public class Medicamento implements Serializable {
    private String nombre,tipo;
    private int codMedicamento;
    private double precio;

    public Medicamento() {
    }

    public void leer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Código: ");
        codMedicamento = sc.nextInt();
        sc.nextLine();
        System.out.print("Tipo (Tos/Resfrío/etc): ");
        tipo = sc.nextLine();
        System.out.print("Precio: ");
        precio = sc.nextDouble();
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", Código: " + codMedicamento + ", Tipo: " + tipo + ", Precio: " + precio);
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


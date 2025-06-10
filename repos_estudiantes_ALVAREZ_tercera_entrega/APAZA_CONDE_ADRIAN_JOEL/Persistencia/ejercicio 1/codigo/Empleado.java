/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3.ejer1.per;

/**
 *
 * @author Adrian
 */
public class Empleado {
    public String nombre;
    public int edad;
    public float salario;

    public Empleado(String n, int e, float s) {
        this.nombre = n;
        this.edad = e;
        this.salario = s;
    }

    public String toString() {
        return nombre + "," + edad + "," + salario;
    }

    public static Empleado desdeCadena(String x) {
        String[] a = x.split(",");
        String nom = a[0];
        int edad = Integer.parseInt(a[1]);
        float salario = Float.parseFloat(a[2]);
        return new Empleado(nom, edad, salario);
    }
}


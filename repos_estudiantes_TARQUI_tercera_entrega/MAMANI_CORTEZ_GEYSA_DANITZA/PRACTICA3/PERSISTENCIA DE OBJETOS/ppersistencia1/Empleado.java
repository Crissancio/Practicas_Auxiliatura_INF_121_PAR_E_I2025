/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppersistencia1;

/**
 *
 * @author Administrador
 */
import java.io.Serializable;

public class Empleado implements Serializable {
    private String nombre;
    private int edad;
    private float salario;

    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre +" "+ edad +" " + salario ;
    }
}


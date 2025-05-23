/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pherencia1;

/**
 *
 * @author Administrador
 */
public class Coche extends Vehiculo {
    private int num_puertas;
    private String tipo_combustible;

    public Coche(String marca, String modelo, int año, double precio_base, int num_puertas, String tipo_combustible) {
        super(marca, modelo, año, precio_base);
        this.num_puertas = num_puertas;
        this.tipo_combustible = tipo_combustible;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Número de Puertas: " + num_puertas);
        System.out.println("Tipo de Combustible: " + tipo_combustible);
    }
}

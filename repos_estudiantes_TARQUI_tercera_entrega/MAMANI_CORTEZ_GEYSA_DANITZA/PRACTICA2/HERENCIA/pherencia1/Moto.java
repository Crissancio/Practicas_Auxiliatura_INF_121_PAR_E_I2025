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
public class Moto extends Vehiculo{
    private int cilindrada;
    private String tipo_motor;

    public Moto(String marca, String modelo, int año, double precio_base, int cilindrada, String tipo_motor) {
        super(marca, modelo, año, precio_base);
        this.cilindrada = cilindrada;
        this.tipo_motor = tipo_motor;
    }

    @Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Cilindrada: " + cilindrada);
        System.out.println("Tipo de Motor: " + tipo_motor);
    }
}

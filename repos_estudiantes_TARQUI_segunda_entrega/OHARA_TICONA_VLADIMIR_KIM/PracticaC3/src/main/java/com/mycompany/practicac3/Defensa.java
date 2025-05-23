package com.mycompany.practicac3;
public class Defensa extends Jugador {
    private String habilidadEspecial;

    public Defensa(String nombre, int numero, String habilidadEspecial) {
        super(nombre, numero, "Defensa");
        this.habilidadEspecial = habilidadEspecial;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Habilidad Especial: " + habilidadEspecial);
    }
}



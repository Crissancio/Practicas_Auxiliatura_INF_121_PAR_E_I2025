/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipo;

/**
 *
 * @author davin
 */
public class Jugador {
    private String nombre, posición;
    private int numero;
    
    public Jugador(String n, int nu, String p)
    {
        this.nombre=n;
        this.numero=nu;
        this.posición=p;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosición() {
        return posición;
    }

    public void setPosición(String posición) {
        this.posición = posición;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void mostrarInfo()
    {
        System.out.println("Nombre: "+nombre+" "+"Numero: "+numero);
        System.out.println("Posicion: "+posición);
    }
}

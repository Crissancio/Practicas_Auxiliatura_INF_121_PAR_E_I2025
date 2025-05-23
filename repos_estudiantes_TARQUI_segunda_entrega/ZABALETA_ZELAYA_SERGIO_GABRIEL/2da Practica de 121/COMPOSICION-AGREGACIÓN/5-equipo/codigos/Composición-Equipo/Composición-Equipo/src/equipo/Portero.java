/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipo;

/**
 *
 * @author davin
 */
public class Portero extends Jugador{
    private String habilidadEspecial;
    
    public Portero(String n, int nu, String p, String h)
    {
        super(n, nu, p);
        this.habilidadEspecial=h;
    }

    public String getHabilidadEspecial() {
        return habilidadEspecial;
    }

    public void setHabilidadEspecial(String habilidadEspecial) {
        this.habilidadEspecial = habilidadEspecial;
    }
    
    public void mostrar()
    {
        super.mostrarInfo();
        System.out.println("Habilidad Especial: "+habilidadEspecial);
    }
}

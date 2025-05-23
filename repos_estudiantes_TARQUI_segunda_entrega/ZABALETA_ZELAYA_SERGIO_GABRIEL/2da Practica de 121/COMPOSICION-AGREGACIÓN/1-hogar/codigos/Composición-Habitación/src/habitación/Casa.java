/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package habitación;
import java.util.*;
/**
 *
 * @author davin
 */
public class Casa {
    private String dirección;
    private List<Habitación> habitaciones;
    
    public Casa(String d)
    {
        this.dirección=d;
        this.habitaciones=new ArrayList<>();
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }
    
    public void agregarHabitacion(Habitación h)
    {
        habitaciones.add(h);
    }
    
    public void mostrarCasa()
    {
        System.out.println("Direccion de la casa: "+dirección);
        System.out.println("Habitaciones: ");
        for(Habitación h: habitaciones)
        {
            h.mostrarInfo();
        }
    }
}

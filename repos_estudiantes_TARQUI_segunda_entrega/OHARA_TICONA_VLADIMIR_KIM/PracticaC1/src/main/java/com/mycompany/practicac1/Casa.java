/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicac1;
import java.util.*;
public class Casa {
    private String direccion;
    private List<Habitacion>habitacions ;
    public Casa(String a)
    {
        this.direccion=a;
        this.habitacions=new ArrayList<>();
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public List<Habitacion> getHabitacions() {
        return habitacions;
    }

    public void setHabitacions(List<Habitacion> habitacions) {
        this.habitacions = habitacions;
    }
    public void agregarHabitacion(Habitacion habitacion)
    {
        habitacions.add(habitacion);
    }
    public void mostrarCasa()
    {
        System.out.println("Direccion" +direccion);
        System.out.println("Habitaciones");
        for(Habitacion h:habitacions) 
        {
            h.mostrar();
        }
    }
    
}

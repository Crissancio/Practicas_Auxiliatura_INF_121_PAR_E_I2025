/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona1;

/**
 *
 * @author Administrador
 */
public class Persona {
    private String nombre,ciudad;
    private int edad;
    Persona(String a, int b, String c){
        nombre=a;
        edad=b;
        ciudad=c;
    }
    public void mostrar(){
        System.out.println("Hola soy "+nombre+" de "+ciudad);
    }
    public void verifica()
    {
        boolean sw=false;
        if(edad>=18)
                sw=true;
        if(sw)
            System.out.println("Es mayor de edad");
        else
            System.out.println("No es mayor de edad");
    }

}

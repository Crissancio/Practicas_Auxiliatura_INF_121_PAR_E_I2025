/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaauno;

/**
 *
 * @author Usuario
 */
public class Persona {
    private String saludo;
    private String nombre;
    private int edad;
    private String ciudad;
    public Persona(String saludo,String nombre, int edad, String ciudad){
        this.saludo = saludo;
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String toString(){
        return (saludo + nombre +" de "+ ciudad );
    }
    public void Mayor(){
        if (edad >= 18){
            System.out.println("es mayor de edad "+ nombre);
        }else{
            System.out.println("es menor de edad " + nombre); 
        }
    }
}

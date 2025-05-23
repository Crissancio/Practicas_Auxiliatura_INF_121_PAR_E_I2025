/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5herencia;

/**
 *
 * @author CINTHIA
 */
public class Desarrollador extends Empleado{
    private String lenguajeProgramacion;
    private int horasExtra;
    private double pagoPorHE;
    public Desarrollador(String nombre,String apellido,double salarioBase,int anosAntiguedad,String lenguajeProgramacion,int horasExtra,double pagoPorHE){
        super(nombre,apellido,salarioBase,anosAntiguedad);
        this.lenguajeProgramacion=lenguajeProgramacion;
        this.horasExtra=horasExtra;
        this.pagoPorHE=pagoPorHE;
    }
    @Override
    public void calcular_salario(){
        double s=this.getSalarioBase()+(this.getSalarioBase()*0.05*this.getAnosAntiguedad())+(this.horasExtra*this.pagoPorHE);
        System.out.println("Desarrollador: " + this.getNombre() + " " + this.getApellido());
        System.out.println("Lenguaje: " + lenguajeProgramacion);
        System.out.println("Horas Extras: " + this.horasExtra);
        System.out.println("Salario: " + s);
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public void setLenguajeProgramacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public double getPagoPorHE() {
        return pagoPorHE;
    }

    public void setPagoPorHE(double pagoPorHE) {
        this.pagoPorHE = pagoPorHE;
    }

    
    
}

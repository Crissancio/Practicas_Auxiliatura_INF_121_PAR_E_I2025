/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5herencia;

/**
 *
 * @author CINTHIA
 */
public class Gerente extends Empleado{
    private String departamento;
    private double bonoGerencial;
    public Gerente(String nombre,String apellido,double salarioBase,int anosAntiguedad,String departamento,double bonoGerencial){
        super(nombre,apellido,salarioBase,anosAntiguedad);
        this.departamento=departamento;
        this.bonoGerencial=bonoGerencial;
    }
    @Override
    public void calcular_salario() {
        double sa = this.getSalarioBase() + (this.getSalarioBase() * 0.05 * this.getAnosAntiguedad()) + bonoGerencial;
        System.out.println("Gerente: " + this.getNombre() + " " + this.getApellido());
        System.out.println("Departamento: " + departamento);
        System.out.println("Salario: " + sa);
        
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getbonoGerencial() {
        return bonoGerencial;
    }

    public void setbonoGerencial(double bonoGeneral) {
        this.bonoGerencial = bonoGeneral;
    }
    
}

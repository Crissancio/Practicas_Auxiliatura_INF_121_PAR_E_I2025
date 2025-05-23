/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pherencia3;

/**
 *
 * @author Administrador
 */
public class PHerencia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gerente g1=new Gerente("Finanzas",1200,"Sofia","Torrez",2300,3);
        Gerente g2=new Gerente("Marketing",800,"Camila","Pinot",2800,4);
        Gerente g3=new Gerente("RRHH",900,"Pablo","Loza",3000,5);
        
        Desarrollador d1=new Desarrollador("Java",2,"Julia","Cespedes",5000,6);
        Desarrollador d2=new Desarrollador("Python",4,"Timoteo","Tarqui",2900,1);
        Desarrollador d3=new Desarrollador("C#",11,"Bonifacia","Marmota",3500,4);
        System.out.println("=== Salario de Gerentes ===");
        g1.mostrarInfo();
        System.out.println("---------------------------");
        g2.mostrarInfo();
        System.out.println("---------------------------");
        g3.mostrarInfo();

        System.out.println("\n=== Salario de Desarrolladores ===");
        d1.mostrarInfo();
        System.out.println("---------------------------");
        d2.mostrarInfo();
        System.out.println("---------------------------");
        d3.mostrarInfo();
        //mostrar gerente con bono mayor a 1000
        System.out.println("=====Gerente con mayor bono====");
        if(g1.getBonoGerencial()>1000)
        {
            g1.mostrarInfo();
        }else{
            System.out.println("el bono es menor a 1000");
        }
        if(g2.getBonoGerencial()>1000)
        {
            g2.mostrarInfo();
        }else{
            System.out.println("el bono es menor a 1000");
        }
        if(g3.getBonoGerencial()>1000)
        {
            g3.mostrarInfo();
        }else{
            System.out.println("el bono es menor a 1000");
        }
        //mostrar desarrolladores con mas de 10 horas extra
        System.out.println("=== Desarrolladores con más de 10 horas extras ===");
        if (d1.getHorasExtras() > 10) {
            d1.mostrarInfo();
        }else{
            System.out.println("el numero de horas es menor a 10 horas ");
        }
        if (d2.getHorasExtras() > 10) {
            d2.mostrarInfo();
        }else{
            System.out.println("el numero de horas es menor a 10 horas ");
        }
        if (d3.getHorasExtras() > 10) {
            d3.mostrarInfo();
        }else{
            System.out.println("el numero de horas es menor a 10 horas ");
        }
            
    }
    
}

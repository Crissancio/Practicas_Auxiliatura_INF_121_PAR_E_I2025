/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persistencia1;

/**
 *
 * @author CINTHIA
 */
public class Persistencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArchivoEmpleado a = new ArchivoEmpleado("empleados.json");
        a.crearArchivo();
        a.guardarEmpleado(new Empleado("Carlos", 30, 4000));
        a.guardarEmpleado(new Empleado("Ana", 25, 5200));
        a.guardarEmpleado(new Empleado("Luis", 45, 6000));
        Empleado e1 = a.buscaEmpleado("Ana");
        if (e1 != null) {
            System.out.println("Empleado encontrado: " + e1);
        } else {
            System.out.println("Empleado no encontrado.");
        }

        Empleado e2 = a.mayorSalario(4500);
        if (e2 != null) {
            System.out.println("Empleado con salario mayor a 4500: " + e2);
        } else {
            System.out.println("Ningún empleado supera ese salario.");
        }
    
    }
    
}

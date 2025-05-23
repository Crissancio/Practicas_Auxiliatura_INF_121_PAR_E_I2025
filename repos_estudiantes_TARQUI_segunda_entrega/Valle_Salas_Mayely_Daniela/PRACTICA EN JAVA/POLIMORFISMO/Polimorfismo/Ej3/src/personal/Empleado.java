package personal;

public abstract class Empleado {
 protected String nombre;
 protected int sueldoMes;

 public Empleado(String nombre, int sueldoMes) {
     this.nombre = nombre;
     this.sueldoMes = sueldoMes;
 }
 
 public abstract float sueldoTotal();
 
 public void mostrarSueldo(int sueldoMesBuscado) {
     if (this.sueldoMes == sueldoMesBuscado) {
         System.out.println("Empleado: " + nombre + " tiene sueldo mensual: " + sueldoMes);
     }
 }
}

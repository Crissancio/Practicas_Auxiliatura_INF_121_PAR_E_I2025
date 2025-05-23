package Herencia3;

public class Empleado {
	    private String nombre;
	    private String apellido;
	    private int salarioBase;
	    private int aniosAntiguedad;

	    public Empleado(String nombre, String apellido, int salarioBase, int aniosAntiguedad) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.salarioBase = salarioBase;
	        this.aniosAntiguedad = aniosAntiguedad;
	    }

	    public int calcularSalario() {
	        return salarioBase + (salarioBase * 5 * aniosAntiguedad) / 100;
	    }

	    public void mostrarInfo() {
	        System.out.println("Nombre: " + nombre + " " + apellido + ", Salario Base: " + salarioBase + ", Antigüedad: " + aniosAntiguedad + " años");
	    }
	}

package EJERCICIO3;

public class Estudiante{
    private String nombre;
    private double nota1;
    private double nota2;

    public Estudiante (String nombre, double nota1, double nota2){
        this.nombre = nombre; 
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double promedio(){
        return (nota1 + nota2) / 2;
    
    }

    public boolean verificar(){
        return promedio() >= 6;
    }

    public void mostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio());
        System.out.println("Aprobado: " + (verificar() ? "Sí" : "No"));
    }

    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Cristhian", 7.5, 8.0);
        Estudiante estudiante2 = new Estudiante("Vanesa", 5.9, 6.5);
        Estudiante estudiante3 = new Estudiante("Rafael", 4.0, 5.5);

        estudiante1.mostrar();
        estudiante2.mostrar();
        estudiante3.mostrar();
    }


    
    
}

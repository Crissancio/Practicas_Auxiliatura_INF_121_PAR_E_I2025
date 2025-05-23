package Ejercicio3;

public class Main {
    public static void main(String[] args) {
       //String nit, String profesion, int ci, int celular, int fecha_Nac, String especialidad, String sexo, String nombre, String apellido 
        //estudiante String nombre, String apellido, int ru, int fecha_ingreso, int semestre, int ci, int celular, int fecha_Nac
        
        Estudiante estudiante = new Estudiante("Jose", "Cuentas",231, 2025, 4, 12312312, 54034, 1999);
        Docente docente = new Docente("nit12", "docente", 123321, 31232, 1999, "Ingeniero", "M", "Ivan", "Cuentas");
    estudiante.mostrar();
    docente.mostrar();
    
    estudiante.mayor();
    
    docente.profesion();
    
    if(docente.getApellido()==estudiante.getApellido()){
        System.out.println("el docente: " +docente.getNombre()+ "y estudiante" +estudiante.getNombre()+ "tienen el mismo apellido");
    }
    }
}

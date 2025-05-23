package Ej5;
public class Estudiante {
    private String nombre;
    private int nota_1;
    private int nota_2;

    public Estudiante(String nombre, int nota_1, int nota_2){
        this.nombre = nombre;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
    }
    // Inciso a
    public void promedio(){
        float promedio = (this.nota_1 + this.nota_2) / 2;
        System.out.println("El estudiante " + this.nombre + " tiene un promedio de " + promedio);
    }
    // Inciso b
    public void aprobo(){
        if((this.nota_1 + this.nota_2) / 2 >= 6){
            System.out.println("El estudiante " + this.nombre + " aprobo");
        }else{
            System.out.println("El estudiante " + this.nombre + " reprobo");
        }
    }
    // Inciso c
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Joel", 3, 5);
        e1.promedio();
        e1.aprobo();
        Estudiante e2 = new Estudiante("Milo", 7, 6);
        e2.promedio();
        e2.aprobo();
        Estudiante e3 = new Estudiante("Tobias", 9, 9);
        e3.promedio();
        e3.aprobo();
    }
}

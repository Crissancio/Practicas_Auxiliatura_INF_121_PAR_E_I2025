public class Estudiante {
    public  String nombre;
    private double nota_1;
    private double nota_2;

//A
    public Estudiante(String nombre, double nota_1, double nota_2) {
        this.nombre = nombre;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
    }
//B
    public double promedio() {
        return (this.nota_1 + this.nota_2) / 2;
    }
//C
    public boolean aprobacion() {
        return promedio() >= 6;
    }
}

class Estudiante {
    private String nombre;
    private double nota1;
    private double nota2;

    public Estudiante(String nombre, double nota1, double nota2) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularPromedio() {
        return (nota1 + nota2) / 2;
    }

    public boolean aprobo() {
        return calcularPromedio() >= 6;
    }

    public void mostrarResultados() {
        System.out.println("El estudiante " + nombre + " tiene un promedio de " + calcularPromedio() + " y " + 
                           (aprobo() ? "aprobó." : "no aprobó."));
    }

    public static void main(String[] args) {
        Estudiante est1 = new Estudiante("Xavier", 7, 4);
        Estudiante est2 = new Estudiante("Jorge", 4, 2);
        Estudiante est3 = new Estudiante("Roxana", 9, 8);

        est1.mostrarResultados();
        est2.mostrarResultados();
        est3.mostrarResultados();
    }
}

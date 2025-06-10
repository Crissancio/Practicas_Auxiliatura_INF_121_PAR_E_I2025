package Polimorfismo.Ej3;

public class Administrativo {
    private String nombre;
    private float sueldoMes;
    private String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.cargo = cargo;
    }

    public float sueldoTotal() {
        return sueldoMes; // No tiene horas extra ni propinas
    }

    public void sueldoTotal(float sueldoFiltro) {
        if (sueldoMes == sueldoFiltro) {
            System.out.println("Administrativo con sueldoMes = " + sueldoFiltro + ": " + nombre);
        }
    }
}

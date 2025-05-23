package Herencia.Ejercicio3;

public class Estudiante extends Persona {
    private int ru;
    private String fecha_Ingreso;
    private int semestre;

    public Estudiante(int ci, String n, String ap, int cel, int fn, int ru, String fi, int s) {
        super(ci, n, ap, cel, fn);
        this.ru = ru;
        this.fecha_Ingreso = fi;
        this.semestre = s;
    }

    public Estudiante() {
        super(1010, "Juan", "Torrez", 45454, 2000);
        this.ru = 23;
        this.fecha_Ingreso = "06-agosto-2023";
        this.semestre = 3;
    }

    public Estudiante(int s) {
        super(1212, "Paolo", "Castillo", 4545, 2001);
        this.ru = 1212;
        this.fecha_Ingreso = "01-enero-2023";
        this.semestre = s;
    }

    public int getRu() {
        return ru;
    }

    public String getFecha_Ingreso() {
        return fecha_Ingreso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setRu(int ru) {
        this.ru = ru;
    }

    public void setFecha_Ingreso(String fi) {
        this.fecha_Ingreso = fi;
    }

    public void setSemestre(int s) {
        this.semestre = s;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("RU: " + this.ru);
        System.out.println("Fecha Ingreso: " + this.fecha_Ingreso);
        System.out.println("Semestre: " + this.semestre);
    }

    public boolean esMayorDe25(int añoActual) {
        return (añoActual - this.getFecha_Nac()) > 25;
    }
}
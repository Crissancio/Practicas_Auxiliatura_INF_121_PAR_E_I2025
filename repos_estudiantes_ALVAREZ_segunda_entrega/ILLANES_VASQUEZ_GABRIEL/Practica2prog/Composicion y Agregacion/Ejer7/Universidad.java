package Compo;

public class Universidad {
    private String nombre;
    private Estudiante estudiantes[] = new Estudiante[1000];
    private int cantEst;

    public Universidad() {
        this.nombre = "";
        this.cantEst = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante getEstudiantes(int i) {
        return estudiantes[i - 1];
    }

    public void setEstudiantes(Estudiante e, int i) {
        this.estudiantes[i - 1] = e;
    }

    public int getCantEst() {
        return cantEst;
    }

    public void setCantEst(int cantEst) {
        this.cantEst = cantEst;
    }

    public void mostrar_universidad() {
        System.out.println("Nombre: " + nombre + "  Cantidad de estudiantes: " + cantEst);
        for (int i = 0; i < cantEst; i++) {
            estudiantes[i].mostrar_info();
        }
    }

    public void agregar_estudiante(Estudiante x) {
        if (cantEst < 999) {
            estudiantes[cantEst] = x;
            cantEst++;
        }
    }
}

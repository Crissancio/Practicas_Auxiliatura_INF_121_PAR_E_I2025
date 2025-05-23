// b)
public class Estudiante extends Persona {
    private String ru;
    private String fecha_Ingreso;
    private int semestre;

    public Estudiante() {
        super();
        this.ru = "0123456";
        this.fecha_Ingreso = "08/10/2023";
        this.semestre = 1;
    }

    public Estudiante(String ci, String nombre, String apellido, String celular,String fecha_Nac, String ru, String f, int s) {
        super(ci, nombre, apellido, celular, fecha_Nac);
        this.ru = ru;
        this.fecha_Ingreso = f;
        this.semestre = s;
    }
    public String getRu() {
        return ru; 
    }
    public void setRu(String ru) { 
        this.ru = ru;
    }
    public String getFecha_Ingreso() { 
        return fecha_Ingreso; 
    }
    public void setFechaIngreso(String fechaIngreso) { 
        this.fecha_Ingreso = fechaIngreso;
    }
    public int getSemestre() { 
        return semestre; 
    }
    public void setSemestre(int semestre) { 
        this.semestre = semestre;
    }
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("ru: " + ru);
        System.out.println("fecha de ingreso: " + fecha_Ingreso);
        System.out.println("semestre: " + semestre);
    }
    public static void calcularEdadMayora25(Estudiante[] a, int c) {
        System.out.println(" estudiantes mayores a 25: ");
        for (int i = 0; i < c; i++) {
            if (a[i].calcularEdad() > 25) {
                a[i].mostrar();
            }
        }
    }
    public static void mostrarestudiantesMismoApellido(Estudiante[] b, int c,Docente[] d, int x) {
        System.out.println(" estudiantes con mismos apellidos: ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < x; j++) {
                if (b[i].getApellido().equals(d[j].getApellido())) {
                    System.out.println(" apellidos igusles hallados: ");
                    b[i].mostrar();
                    d[j].mostrar();
                }
            }
        }
    }
}
    
    
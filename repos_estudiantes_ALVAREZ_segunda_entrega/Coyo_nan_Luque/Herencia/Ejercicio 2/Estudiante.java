public class Estudiante extends Persona {
    private String ru;
    private String fecha_ingreso;
    private int semestre;

    public Estudiante(String ci, String nombre, String apellido, String celular, String fecha_nac, String ru, String fecha_ingreso, int semestre) {
        super(ci, nombre, apellido, celular, fecha_nac);
        this.ru = ru;
        this.fecha_ingreso = fecha_ingreso;
        this.semestre = semestre;
    }

    public String getRu() {
        return ru;
    }

    public void setRu(String ru) {
        this.ru = ru;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String mostrar() {
        return "Estudiante:.. " + super.mostrar() + ", RU: " + ru + ", Fecha Ingreso: " + fecha_ingreso + ", Semestre: " + semestre;
    }

    public static void estudiantes_mayores_25(java.util.ArrayList<Persona> personas) {
        int anio_actual = 2025;
        System.out.println("\nEstudiantes mayores de 25 años:");
        for (Persona persona : personas) {
            try {
                Estudiante estudiante = (Estudiante) persona;
                int anio_nac = Integer.parseInt(estudiante.getFecha_nac().split("-")[0]);
                int edad = anio_actual - anio_nac;
                if (edad > 25) {
                    System.out.println(estudiante.mostrar());
                }
            } catch (ClassCastException e) {
                // No es estudiante, ignorar
            }
        }
    }
}

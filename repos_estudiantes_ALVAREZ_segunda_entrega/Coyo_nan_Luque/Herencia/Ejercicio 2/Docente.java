public class Docente extends Persona {
    private String nit;
    private String profesion;
    private String especialidad;
    private String sexo;

    public Docente(String ci, String nombre, String apellido, String celular, String fecha_nac, String nit, String profesion, String especialidad, String sexo) {
        super(ci, nombre, apellido, celular, fecha_nac);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.sexo = sexo;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String mostrar() {
        return "Docente:.. " + super.mostrar() + ", NIT: " + nit + ", Profesion: " + profesion + ", Especialidad: " + especialidad + ", Sexo: " + sexo;
    }

    public static void docente_ingeniero_masculino_mayor(java.util.ArrayList<Persona> personas) {
        Persona docente_seleccionado = null;
        int mayor_edad = 0;

        for (Persona persona : personas) {
            try {
                Docente docente = (Docente) persona;
                if (docente.getProfesion().equals("Ingeniero") && docente.getSexo().equals("M")) {
                    int anio_nac = Integer.parseInt(docente.getFecha_nac().split("-")[0]);
                    int edad = 2025 - anio_nac;
                    if (edad > mayor_edad) {
                        mayor_edad = edad;
                        docente_seleccionado = docente;
                    }
                }
            } catch (ClassCastException e) {
                // No es docente, ignorar
            }
        }

        System.out.println("\nDocente ingeniero masculino y mayor edad:");
        if (docente_seleccionado != null) {
            System.out.println(docente_seleccionado.mostrar());
        } else {
            System.out.println("No hay Docentes que cumplen");
        }
    }
}
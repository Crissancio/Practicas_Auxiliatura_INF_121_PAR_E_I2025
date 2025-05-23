// b)
public class Docente extends Persona {
    private String nit;
    private String profesion;
    private String especialidad;
    private String sexo;

    public Docente() {
        super();
        this.nit = "0123456-0";
        this.profesion = "cocina";
        this.especialidad = "salchipapero";
        this.sexo = " error";
    }

    public Docente(String ci, String nombre, String apellido, String celular,String fecha_Nac, String s, String n, String p, String e) {
        super(ci, nombre, apellido, celular, fecha_Nac);
        this.nit = n;
        this.profesion = p;
        this.especialidad = e;
        this.sexo = s;
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
    public void mostrar() {
        super.mostrar();
        System.out.println("nit: " + nit);
        System.out.println("profesión: " + profesion);
        System.out.println("especialidad: " + especialidad);
        System.out.println("sexo: " + sexo);
    }
    public static void mostrarDocenteIngenieroMasculinoYMayorqueTodos(Docente[] docentes, int contDoc) {
        System.out.println(" docentes ingenieros masculinos que son mayores: ");
        Docente docenteMayor = null;
        for (int i = 0; i < contDoc; i++) {
            if (docentes[i].getProfesion().equals("Ingeniero") && 
                docentes[i].getSexo().equals("Masculino")) {
                if (docenteMayor == null || 
                    docentes[i].calcularEdad() > docenteMayor.calcularEdad()) {
                    docenteMayor = docentes[i];
                }
            }
        }
        if (docenteMayor != null) {
            docenteMayor.mostrar();
        } else {
            System.out.println(" ho existen");
        }
    }
    public static void mostrarDocentesMismoApellido(Estudiante[] b, int c,Docente[] a, int y) {
        System.out.println("= docentes que tienen el mismo apellido");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < y; j++) {
                if (b[i].getApellido().equals(a[j].getApellido())) {
                    System.out.println(" apellidos iguales encontrados: ");
                    b[i].mostrar();
                    a[j].mostrar();
                }
            }
        }
    }
}
    
    
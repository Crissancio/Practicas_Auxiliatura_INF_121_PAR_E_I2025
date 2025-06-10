public class Docente extends Persona{
    private int nit;
    private String profesion;
    private String especialidad;

    public Docente(String ci, String nombre, String apellido, String celular, int fecha_Nac,int nit, String profesion, String especialidad) {
        super(ci,nombre,apellido,celular,fecha_Nac);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
    }
    public void mostrar() {
        super.Mostrar();
        System.out.printf("nit:%d , profesion:%s ,especialidad:%s", nit,profesion,especialidad);
    }

    public String getProfesion() {
        return profesion;
    }
    
}
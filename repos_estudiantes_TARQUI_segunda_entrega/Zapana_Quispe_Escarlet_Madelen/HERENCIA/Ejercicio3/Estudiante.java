public class Estudiante extends Persona{
    private int ru=56526;
    private String fecha_ingreso="14/03/2021";
    private String semestre="quinto";

    public Estudiante(String ci, String nombre, String apellido, String celular, int fecha_Nac,int ru, String fecha_ingreso, String semestre) {
        super(ci,nombre,apellido,celular,fecha_Nac);
        this.ru = ru;
        this.fecha_ingreso = fecha_ingreso;
        this.semestre = semestre;
    }
    public void mostrar() {
        super.Mostrar();
        System.out.printf("ru:%s,fecha_ingreso:%s,semestre:%s",ru,fecha_ingreso,semestre);
    }
    
    
}
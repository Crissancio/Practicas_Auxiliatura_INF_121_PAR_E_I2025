public class Desarrollador extends Empleado{
    private String lenguajeProgramacion;
    private int  horas_extras;
    public Desarrollador(String nombre,String apellido, double salario_base,int años_antiguedad,String lenguaje_prgramacion,int horas_extra){
        super(nombre,apellido,salario_base,años_antiguedad);
        this.lenguajeProgramacion=lenguajeProgramacion;
        this.horas_extras=horas_extras;
        
    }
    public double calcularSalario(){
        return super.calcularSalario()+200;
    }

    public String getLenguaje_programacion() {
        return lenguajeProgramacion;
    }

    public void setLenguaje_programacion(String lenguajeProgramacion) {
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public float getHoras_extras() {
        return horas_extras;
    }

    public void setHoras_extras(int  horas_extras) {
        this.horas_extras = horas_extras;
    }
    
    
}


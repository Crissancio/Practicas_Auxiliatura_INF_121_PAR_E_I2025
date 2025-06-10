public class Mesero {
    private String nombre;
    private int sueldoMes;
    private int horasExtras;
    private float sueldoHora;
    private float propina;

    public Mesero(String nombre, int sueldoMes, int horasExtras, float sueldoHora, float propina) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtras = horasExtras;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }
    public float SueldoTotal(){
        return this.sueldoMes+=(this.sueldoHora*this.horasExtras)+this.propina;
    }
    public String Mostrar(){
        return String.format("Nombre: %s  Sueldo del mes: %d  crago:Mesero" ,this.nombre,this.sueldoMes);
    }
    public String Mostrar(int x){
        if(this.sueldoMes == x){
            return String.format("el empleado que tiene el sueldo de %d ,es %s ",x,this.nombre);
        }
        else{
            return String.format("no hay empleados con el %d de sueldo",x);
        }
    }
}

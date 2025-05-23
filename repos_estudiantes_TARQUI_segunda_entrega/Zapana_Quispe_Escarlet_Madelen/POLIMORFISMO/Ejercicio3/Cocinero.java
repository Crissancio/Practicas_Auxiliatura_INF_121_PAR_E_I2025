public class Cocinero {
    private String nombre;
    private int sueldoMes;
    private int horasExtras;
    private float sueldoHora;

    public Cocinero(String nombre, int sueldoMes, int horasExtras, float sueldoHora) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.horasExtras = horasExtras;
        this.sueldoHora = sueldoHora;
    }
    public float SueldoTotal(){
        return this.sueldoMes+=(this.sueldoHora*this.horasExtras);
    }
    public String Mostrar(){
        return String.format("Nombre: %s   Sueldo del mes: %d  cargo:Cocinero",this.nombre,this.sueldoMes);
    }
    public String Mostrar(int x){
        if(this.sueldoMes == x){
            return String.format("el empleado que tiene el sueldo de %d,es %s ",x,this.nombre);
        }
        else{
            return String.format("no hay empleado con el %d de sueldo",x);
        }
    }
}

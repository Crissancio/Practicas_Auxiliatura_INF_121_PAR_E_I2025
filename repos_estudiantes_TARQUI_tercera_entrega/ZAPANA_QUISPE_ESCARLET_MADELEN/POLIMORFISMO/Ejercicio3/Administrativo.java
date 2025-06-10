public class Administrativo {
    private String nombre;
    private float sueldoMes;
    private String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        this.nombre = nombre;
        this.sueldoMes = sueldoMes;
        this.cargo = cargo;
    }
    public String Mostrar(){
        return String.format("Nombre:%s  Sueldo del mes : %f Cargo:%s",this.nombre,this.sueldoMes,this.cargo);
    }
    public String Mostrar(float x){
        if(this.sueldoMes == x){
            return String.format("el empleado que tiene el sueldo de %f, es %s ",x ,this.nombre);
        }
        else{
            return String.format("no hay empleados con el %f de sueldo",x);
        }
    }
}

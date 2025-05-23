
package Ejercicio5;

/**
 r (hereda de Empleado) <lenguaje_programación, horas_extras>
Métodos: calcular_salario() (debe sumar un monto adicional por
horas extras al salario calculado en la clase base)

 */
public class Desarrollador extends Empleado{
    private String lenguaje_progra;
    private int horas_extras;

    public Desarrollador(String lenguaje_progra, String nombre, String apellido, int salario_base, int años_antiguedsd, int horas_extras) {
        super(nombre, apellido, salario_base, años_antiguedsd);
        this.lenguaje_progra = lenguaje_progra;
        this.horas_extras = horas_extras;
    }
    @Override
    public double calcular_salario(){
        double c = getSalario_base()+ 30* horas_extras;
        double d = c+super.calcular_salario();
        return d;
    }
    
    public void mostarS(){
        double d = calcular_salario();
        System.out.println("el salario del desarrollador es: " +d);
    }
    public void mostrarHoras(){
        if(horas_extras>10){
            System.out.println("tiene mas de 10 horas el desarrolador " +nombre);
        }
    }
    

    public String getLenguaje_progra() {
        return lenguaje_progra;
    }

    public void setLenguaje_progra(String lenguaje_progra) {
        this.lenguaje_progra = lenguaje_progra;
    }

    public int getHoras_extras() {
        return horas_extras;
    }

    public void setHoras_extras(int horas_extras) {
        this.horas_extras = horas_extras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    public int getAños_antiguedsd() {
        return años_antiguedsd;
    }

    public void setAños_antiguedsd(int años_antiguedsd) {
        this.años_antiguedsd = años_antiguedsd;
    }
    
    
    
}

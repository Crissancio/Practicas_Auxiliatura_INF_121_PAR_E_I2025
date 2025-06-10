public class Empleado<T> {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado( String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    //Convierte el empleado a una linea de texto
    public String toLinea(){
        return this.nombre + "|" + this.edad + "|"+ this.salario;
    }

    //Creando un empleado desde una linea de texto
    public static Empleado desdeLinea(String linea){
        String [] partes = linea.split("\\|");
        String nombre = partes[0];
        int edad = Integer.parseInt(partes[1]);
        double salario = Double.parseDouble(partes[2]);
        return new Empleado(nombre, edad, salario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString(){
        return "Empleado: " + nombre + "\nEdad: "+ edad + "\nSalario: " + salario;
    }

}   

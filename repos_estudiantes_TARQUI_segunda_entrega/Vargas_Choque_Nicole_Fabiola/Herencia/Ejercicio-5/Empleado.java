import java.util.*;

public class Empleado {
    private String nombre, apellido;
    private double salario;
    private int añosAntiguedad;
    
    public Empleado(String n, String a, double s, int an)
    {
        this.nombre=n;
        this.apellido=a;
        this.salario=s;
        this.añosAntiguedad=an;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAñosAntiguedad() {
        return añosAntiguedad;
    }

    public void setAñosAntiguedad(int añosAntiguedad) {
        this.añosAntiguedad = añosAntiguedad;
    }
    
    public double calcularSalario()
    {
        return salario*(1+0.05*añosAntiguedad);
    }
    
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
    
    public void mostrar()
    {
        System.out.println("Nombre: "+nombre+" "+"Apellido: "+apellido);
        System.out.println("Salario Base: "+salario+" "+"Anos Antiguedad: "+añosAntiguedad);
    }
}

class Gerente extends Empleado{
    private String departamento;
    private double bonoGerencial;
    
    public Gerente(String n, String a, double s, int an, String d, double b)
    {
        super(n, a, s, an);
        this.departamento=d;
        this.bonoGerencial=b;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getBonoGerencial() {
        return bonoGerencial;
    }

    public void setBonoGerencial(double bonoGerencial) {
        this.bonoGerencial = bonoGerencial;
    }
    
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonoGerencial;
    }
    
    @Override
    public void mostrar()
    {
        super.mostrar();
        System.out.println("Departamento: "+departamento+" "+"Bono Gerencial: "+bonoGerencial);
    }
}

class Desarrollador extends Empleado{
    private String lenguajePro;
    private int horasExtra;
    
    public Desarrollador(String n, String a, double s, int an, String l, int h)
    {
        super(n, a, s, an);
        this.lenguajePro=l;
        this.horasExtra=h;
    }

    public String getLenguajePro() {
        return lenguajePro;
    }

    public void setLenguajePro(String lenguajePro) {
        this.lenguajePro = lenguajePro;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    @Override
    public double calcularSalario() {
        double pagoPorHoraExtra = 20.0;
        return super.calcularSalario() + (horasExtra * pagoPorHoraExtra);
    }
    @Override
    public void mostrar()
    {
        super.mostrar();
        System.out.println("Lenguaje Programacion: "+lenguajePro+" "+"Horas Extra: "+horasExtra);
    }
}

class App {
    public static void main(String[] args) {
        
        ArrayList<Gerente> gerentes = new ArrayList<>();
        ArrayList<Desarrollador> desarrolladores = new ArrayList<>();

        gerentes.add(new Gerente("Ana", "Perez", 3000, 5, "Finanzas", 1500));
        gerentes.add(new Gerente("Carlos", "Gomez", 2800, 3, "RRHH", 800));
        gerentes.add(new Gerente("Esmeralda", "Flores", 4000, 7, "Secretaria", 2000));

        desarrolladores.add(new Desarrollador("Luis", "Martinez", 2500, 2, "Python", 12));
        desarrolladores.add(new Desarrollador("Elena", "Ruiz", 2700, 4, "Java", 8));
        desarrolladores.add(new Desarrollador("Alejandro", "Almonte", 2300, 4, "C++", 34));

        System.out.println("== Salarios de Gerentes ==");
        for (Gerente g : gerentes) {
            System.out.println(g.getNombreCompleto() + " - Salario: " + g.calcularSalario());
        }

        System.out.println("\n== Salarios de Desarrolladores ==");
        for (Desarrollador d : desarrolladores) {
            System.out.println(d.getNombreCompleto() + " - Salario: " + d.calcularSalario());
        }

        System.out.println("\n== Gerentes con bono mayor a 1000 ==");
        for (Gerente g : gerentes) {
            if (g.getBonoGerencial() > 1000) {
                System.out.println(g.getNombreCompleto() + " - Bono: " + g.getBonoGerencial());
            }
        }

        System.out.println("\n== Desarrolladores con mas de 10 horas extras ==");
        for (Desarrollador d : desarrolladores) {
            if (d.getHorasExtra() > 10) {
                System.out.println(d.getNombreCompleto() + " - Horas extras: " + d.getHorasExtra());
            }
        }
    }
}
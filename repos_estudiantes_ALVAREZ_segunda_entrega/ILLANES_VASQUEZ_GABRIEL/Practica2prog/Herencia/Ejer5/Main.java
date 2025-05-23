
package Ejercicio5;
//String departamento, Double bono_general, String nombre, String apellido, int salario_base, int años_antiguedsd
//String lenguaje_progra, int horas_extras, String nombre, String apellido, int salario_base, int años_antiguedsd
public class Main {
    public static void main(String[] args) {
        Gerente g = new Gerente ("la paz", 2000.0, "Juan", "Bodoque", 1200, 2);
        Gerente g1 = new Gerente ("oruro", 120.0, "Ivan", "Cuentas", 1250, 2);
        
        Desarrollador d = new Desarrollador("python","Jose","Mamani", 130, 2,9);
        Desarrollador d1 = new Desarrollador("java","Eduardo","Camabinga", 110, 1,11);
        
        System.out.println("gerente1");
        g.calcular_salario();
        g.mostrarS();
        g.mostrarBono();
        System.out.println("gerente2");
        g1.calcular_salario();
        g1.mostrarS();
        g1.mostrarBono();
        
        
        System.out.println("desarrollador1");
        d.calcular_salario();
        d.mostarS();
        d.mostrarHoras();
        System.out.println("desallorrador2");
        d1.calcular_salario();
        d1.mostarS();
        d1.mostrarHoras();
        
        
        
        
        
    }
}

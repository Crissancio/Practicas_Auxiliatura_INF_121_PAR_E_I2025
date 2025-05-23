public class Main {
    public static void main(String[] args) {
        System.out.println(" Salarios Calculados ");
        
        Gerente gerente1 = new Gerente("Maria", "Lopez", 5000.0, 5, "Ventas", 1200.0);
        System.out.println("Gerente: " + gerente1.getNombre() + " " + gerente1.getApellido());
        System.out.println("Salario Total: $" + String.format("%.2f", gerente1.calcularSalario()));
        
        Desarrollador desarrollador1 = new Desarrollador("Pedro", "Gomez", 3000.0, 3, "Java", 15);
        System.out.println("Desarrollador: " + desarrollador1.getNombre() + " " + desarrollador1.getApellido());
        System.out.println("Salario Total: $" + String.format("%.2f", desarrollador1.calcularSalario()));
        
    }
}

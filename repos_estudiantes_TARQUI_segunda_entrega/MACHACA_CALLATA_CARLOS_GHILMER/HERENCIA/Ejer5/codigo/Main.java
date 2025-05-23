package HERENCIA.Ejer5.codigo;

//5. Definir las siguientes clases:
//Empleado<nombre, apellido, salario_base, años_antigüedad
//Métodos: calcular_salario() (retorna el salario base más un bono
//del 5% por cada año de antigüedad)
//INF -121 PROGRAMACION II
//Carrera de Informática - UMSA Página 4
//Gerente (hereda de Empleado)< departamento, bono_gerencial>
//Métodos: calcular_salario() (debe sumar el bono gerencial al
//salario calculado en la clase base)
//Desarrollador (hereda de Empleado) <lenguaje_programación, horas_extras>
//Métodos: calcular_salario() (debe sumar un monto adicional por
//horas extras al salario calculado en la clase base)
//a) Implementa las clases con sus constructores, getters y setters.
//b) Crea instancias de Gerente y Desarrollador y muestra su salario
//calculado.
//c) Muestra todos los gerentes que tienen un bono gerencial mayor a 1000.
//d) Muestra todos los desarrolladores que trabajan más de 10 horas extras.

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Carlos", "Machaca", 3000, 6);
        Desarrollador desarrollador1 = new Desarrollador("Ana", "Mantilla", 3500, 4, "Java", 11);
        Gerente gerente1 = new Gerente("Luis", "Cornejo", 5000, 7, "La Paz", 2000);

        System.out.println("El Salario de " + empleado1.getNombre() + " " + empleado1.getApellido() + ": " + empleado1.calcularSalario());
        System.out.println(gerente1.getNombre() + " " + gerente1.getApellido() + " es de " + gerente1.getDepartamento() + " y su salario es de : " + gerente1.calcularSalario());
        gerente1.mostrarBono();
        System.out.println("Su lenguaje de Programacion de " + desarrollador1.getNombre() + " " + desarrollador1.getApellido() + " es de " + desarrollador1.getLenguajeProgramacion() + " y su salario es de : " + desarrollador1.calcularSalario());
        desarrollador1.mostrarHorasExtras();
    }
}

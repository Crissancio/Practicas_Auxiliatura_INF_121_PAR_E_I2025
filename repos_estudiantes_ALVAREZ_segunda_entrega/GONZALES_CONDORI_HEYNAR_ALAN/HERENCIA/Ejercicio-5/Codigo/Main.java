/*
Definir las siguientes clases:
Empleado<nombre, apellido, salario_base, años_antigüedad
Métodos: calcular_salario() (retorna el salario base más un bono
del 5% por cada año de antigüedad)
Gerente (hereda de Empleado)< departamento, bono_gerencial>
Métodos: calcular_salario() (debe sumar el bono gerencial al
salario calculado en la clase base)
Desarrollador (hereda de Empleado) <lenguaje_programación, horas_extras>
Métodos: calcular_salario() (debe sumar un monto adicional por
horas extras al salario calculado en la clase base)
*/
package Ejercicio05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Gerente> gerentes = new ArrayList<>();
        List<Desarrollador> desarrolladores = new ArrayList<>();

        // Instancias
        gerentes.add(new Gerente("Carlos", "Suárez", 3000, 5, "Finanzas", 1500));
        gerentes.add(new Gerente("Marta", "López", 2800, 3, "Marketing", 900));

        desarrolladores.add(new Desarrollador("Ana", "Ramírez", 2500, 4, "Java", 12));
        desarrolladores.add(new Desarrollador("Luis", "Fernández", 2400, 2, "Python", 8));

        // b) Mostrar salarios
        System.out.println("=== Gerentes ===");
        for (Gerente g : gerentes) {
            g.mostrar();
            System.out.println();
        }

        System.out.println("=== Desarrolladores ===");
        for (Desarrollador d : desarrolladores) {
            d.mostrar();
            System.out.println();
        }

        // c) Gerentes con bono > 1000
        System.out.println("=== Gerentes con bono > 1000 ===");
        for (Gerente g : gerentes) {
            if (g.getBonoGerencial() > 1000) {
                g.mostrar();
                System.out.println();
            }
        }

        // d) Desarrolladores con más de 10 horas extras
        System.out.println("=== Desarrolladores con > 10 horas extras ===");
        for (Desarrollador d : desarrolladores) {
            if (d.getHorasExtras() > 10) {
                d.mostrar();
                System.out.println();
            }
        }
    }
}


/*
 5. Definir las siguientes clases:
Empleado<nombre, apellido, salario_base, años_antigüedad
Métodos: calcular_salario() (retorna el salario base más un bono 
del 5% por cada año de antigüedad)
Gerente (hereda de Empleado)< departamento, bono_gerencial>
Métodos: calcular_salario() (debe sumar el bono gerencial al 
salario calculado en la clase base)
Desarrollador (hereda de Empleado) <lenguaje_programación, horas_extras>
Métodos: calcular_salario() (debe sumar un monto adicional por 
horas extras al salario calculado en la clase base)
a) Implementa las clases con sus constructores, getters y setters.
b) Crea instancias de Gerente y Desarrollador y muestra su salario 
calculado.
c) Muestra todos los gerentes que tienen un bono gerencial mayor a 1000.
d) Muestra todos los desarrolladores que trabajan más de 10 horas extras.
 */
public class Main {
    public static void main(String[] args) {
        Gerente[] gerentes = new Gerente[10];
        Desarrollador[] desarrolladores = new Desarrollador[10];
        int contG = 0;
        int contD= 0;
        // b) Creando instancias de Gerente y Desarrollador
        gerentes[contG++] = new Gerente("Juan", "Perez", 10000, 5, "TI", 1500);
        gerentes[contG++] = new Gerente("Maria", "Gomez", 12000, 8, "RRHH", 800);
        gerentes[contG++] = new Gerente("Carlos", "Lopez", 15000, 10, "Finanzas", 2000);
        
        desarrolladores[contD++] = new Desarrollador("Ana", "Martinez", 8000, 3, "Java", 15);
        desarrolladores[contD++] = new Desarrollador("Pedro", "Sanchez", 7000, 2, "Python", 8);
        desarrolladores[contD++] = new Desarrollador("Luisa", "Garcia", 9000, 4, "JavaScript", 12);
            System.out.println("Gerentes: ");
        for (int i = 0; i < contG; i++) {
            gerentes[i].mostrar();
            gerentes[i].calcular_salario();
        }
        System.out.println("____________________");
        System.out.println("\n Desarrolladores: ");
        for (int i = 0; i < contD; i++) {
            desarrolladores[i].mostrar();
            desarrolladores[i].calcular_salario();
            
        }
        System.out.println("____________________");
        // c) Mostrando gerentes con bono > 1000
        Gerente.mostrarGerentesBonoMayor1000(gerentes, contG);
        System.out.println("____________________");
        // d) Mostrando desarrolladores con más de 10 horas extras
        Desarrollador.mostrarDesarrolladoresMas10HorasExtras(desarrolladores, contD);
    }
}
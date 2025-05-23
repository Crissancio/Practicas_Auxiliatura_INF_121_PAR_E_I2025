'''

--------------EJERCICIO 5----------------



 Definir las siguientes clases:

Empleado&lt;nombre, apellido, salario_base, años_antigüedad
Métodos: calcular_salario() (retorna el salario base más un bono
del 5% por cada año de antigüedad)
Gerente (hereda de Empleado)&lt; departamento, bono_gerencial&gt;

INF -121 PROGRAMACION II

Carrera de Informática - UMSAPágina 12

Métodos: calcular_salario() (debe sumar el bono gerencial al
salario calculado en la clase base)
Desarrollador (hereda de Empleado) &lt;lenguaje_programación, horas_extras&gt;
Métodos: calcular_salario() (debe sumar un monto adicional por
horas extras al salario calculado en la clase base)
a) Implementa las clases con sus constructores, getters y setters.
b) Crea instancias de Gerente y Desarrollador y muestra su salario
calculado.
c) Muestra todos los gerentes que tienen un bono gerencial mayor a 1000.
d) Muestra todos los desarrolladores que trabajan más de 10 horas extras.

'''



from Gerente import Gerente
from Desarrollador import Desarrollador

#B)
gerente1 = Gerente("Ana", "Gomez", 5000, 5, "Ventas", 1500)
gerente2 = Gerente("Luis", "Martinez", 6000, 3, "Recursos Humanos", 800)
desarrollador1 = Desarrollador("Carlos", "Lopez", 4000, 2, "Python", 15)
desarrollador2 = Desarrollador("Sofia", "Perez", 4500, 4, "Java", 8)

#B)
print("Salarios calculados:")
print(f"Gerente {gerente1.get_nombre()} {gerente1.get_apellido()}: ${gerente1.calcular_salario()}")
print(f"Gerente {gerente2.get_nombre()} {gerente2.get_apellido()}: ${gerente2.calcular_salario()}")
print(f"Desarrollador {desarrollador1.get_nombre()} {desarrollador1.get_apellido()}: ${desarrollador1.calcular_salario()}")
print(f"Desarrollador {desarrollador2.get_nombre()} {desarrollador2.get_apellido()}: ${desarrollador2.calcular_salario()}")
print()

#C)
print("Gerentes con bono gerencial mayor a 1000:")
empleados = [gerente1, gerente2, desarrollador1, desarrollador2]
for empleado in empleados:
    if isinstance(empleado, Gerente) and empleado.get_bono_gerencial() > 1000:
        print(f"Gerente {empleado.get_nombre()} {empleado.get_apellido()}, Bono: ${empleado.get_bono_gerencial()}")
print()

#D)
print("Desarrolladores con más de 10 horas extras:")
for empleado in empleados:
    if isinstance(empleado, Desarrollador) and empleado.get_horas_extras() > 10:
        print(f"Desarrollador {empleado.get_nombre()} {empleado.get_apellido()}, Horas Extras: {empleado.get_horas_extras()}")
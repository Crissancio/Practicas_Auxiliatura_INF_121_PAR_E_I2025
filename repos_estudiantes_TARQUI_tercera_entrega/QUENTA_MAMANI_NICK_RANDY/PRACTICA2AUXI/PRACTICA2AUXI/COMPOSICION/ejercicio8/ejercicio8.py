# 8. Crea un POO donde el equipoTrabajo contiene empleados, pero los empleados
# pueden existir independientemente del equipo.
# Empleado<nombre, puesto, salario>
# Métodos: mostrar_info() (muestra el nombre, puesto y salario del empleado)
# EquipoTrabajo<nombre, empleados (lista de objetos de tipo Empleado)>
# Métodos: agregar_empleado(empleado), mostrar_equipo() (muestra el nombre
# del equipo y la información de todos los empleados)
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea un equipo de trabajo y agrega varios empleados.
# c) Muestra la información del equipo y sus empleados.
class Empleado:
    def __init__(self, nombre, puesto, salario): 
        self.nombre, self.puesto, self.salario = nombre, puesto, salario
    def mostrar_info(self): 
        print(f"{self.nombre} - {self.puesto}, Salario: {self.salario}")

class EquipoTrabajo:
    def __init__(self, nombre): 
        self.nombre, self.empleados = nombre, []
    def agregar_empleado(self, empleado): 
        self.empleados.append(empleado)
    def mostrar_equipo(self):
        print(f"Equipo: {self.nombre}")
        for e in self.empleados: 
            e.mostrar_info()

equipo = EquipoTrabajo("Desarrollo Web")
equipo.agregar_empleado(Empleado("Carlos", "Frontend", 3000))
equipo.agregar_empleado(Empleado("Lucía", "Backend", 3200))
equipo.mostrar_equipo()

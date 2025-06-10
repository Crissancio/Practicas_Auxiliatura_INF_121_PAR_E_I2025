from datetime import date
from typing import List


class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_nac):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_nac = fecha_nac

    def get_edad(self):
        today = date.today()
        return today.year - self.fecha_nac.year - ((today.month, today.day) < (self.fecha_nac.month, self.fecha_nac.day))

    def get_apellido(self):
        return self.apellido

    def mostrar(self):
        print(f"{self.nombre} {self.apellido} (CI: {self.ci})")


class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, ru, fecha_ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.ru = ru
        self.fecha_ingreso = fecha_ingreso
        self.semestre = semestre

    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru}, Semestre: {self.semestre}")


class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, nit, profesion, especialidad, sexo):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
        self.sexo = sexo

    def get_profesion(self):
        return self.profesion

    def get_sexo(self):
        return self.sexo

    def mostrar(self):
        super().mostrar()
        print(f"Profesión: {self.profesion}, Especialidad: {self.especialidad}")


# === MAIN ===

estudiantes: List[Estudiante] = [
    Estudiante("123", "Ana", "López", "71234567", date(1997, 3, 5), "RU001", date(2020, 2, 10), 8),
    Estudiante("124", "Luis", "Fernández", "71234568", date(2004, 6, 15), "RU002", date(2022, 1, 10), 3)
]

docentes: List[Docente] = [
    Docente("321", "Carlos", "López", "76543210", date(1980, 4, 12), "NIT001", "Ingeniero", "Sistemas", "Masculino"),
    Docente("322", "Marta", "González", "76543211", date(1975, 9, 22), "NIT002", "Licenciada", "Matemáticas", "Femenino")
]

print(" Estudiantes mayores de 25 años:")
for e in estudiantes:
    if e.get_edad() > 25:
        e.mostrar()
        print(f"Edad: {e.get_edad()}")
        print("---")

print("\n Docente ingeniero masculino y mayor:")
mayor_ingeniero = None
for d in docentes:
    if d.get_profesion().lower() == "ingeniero" and d.get_sexo().lower() == "masculino":
        if mayor_ingeniero is None or d.get_edad() > mayor_ingeniero.get_edad():
            mayor_ingeniero = d

if mayor_ingeniero:
    mayor_ingeniero.mostrar()
    print(f"Edad: {mayor_ingeniero.get_edad()}")

print("\n Estudiantes y docentes con el mismo apellido:")
for e in estudiantes:
    for d in docentes:
        if e.get_apellido().lower() == d.get_apellido().lower():
            e.mostrar()
            d.mostrar()
            print("---")

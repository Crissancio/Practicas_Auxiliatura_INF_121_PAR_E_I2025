from datetime import date
from typing import List

class Persona:
    def __init__(self, ci: str, nombre: str, apellido: str, celular: str, fecha_nac: date):
        self.__ci = ci
        self.__nombre = nombre
        self.__apellido = apellido
        self.__celular = celular
        self.__fecha_nac = fecha_nac

    def mostrar(self):
        print(f"CI: {self.__ci}")
        print(f"Nombre: {self.__nombre} {self.__apellido}")
        print(f"Celular: {self.__celular}")
        print(f"Fecha de nacimiento: {self.__fecha_nac}")

    def get_apellido(self):
        return self.__apellido

    def get_fecha_nac(self):
        return self.__fecha_nac


class Estudiante(Persona):
    def __init__(self, ci: str, nombre: str, apellido: str, celular: str, fecha_nac: date,
                 ru: str, fecha_ingreso: date, semestre: int):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.__ru = ru
        self.__fecha_ingreso = fecha_ingreso
        self.__semestre = semestre

    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.__ru}")
        print(f"Fecha de ingreso: {self.__fecha_ingreso}")
        print(f"Semestre: {self.__semestre}")

    def get_edad(self):
        return date.today().year - self.get_fecha_nac().year


class Docente(Persona):
    def __init__(self, ci: str, nombre: str, apellido: str, celular: str, fecha_nac: date,
                 nit: str, profesion: str, especialidad: str, sexo: str):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.__nit = nit
        self.__profesion = profesion
        self.__especialidad = especialidad
        self.__sexo = sexo

    def mostrar(self):
        super().mostrar()
        print(f"NIT: {self.__nit}")
        print(f"Profesión: {self.__profesion}")
        print(f"Especialidad: {self.__especialidad}")
        print(f"Sexo: {self.__sexo}")

    def get_profesion(self):
        return self.__profesion

    def get_sexo(self):
        return self.__sexo

    def get_edad(self):
        return date.today().year - self.get_fecha_nac().year


estudiantes: List[Estudiante] = [
    Estudiante("123", "Ana", "López", "7654321", date(1995, 5, 10), "RU123", date(2020, 2, 1), 8),
    Estudiante("456", "Luis", "Gómez", "7890123", date(2006, 3, 20), "RU456", date(2024, 3, 1), 1)
]

docentes: List[Docente] = [
    Docente("789", "Carlos", "López", "1234567", date(1980, 7, 15), "NIT001", "Ingeniero", "Sistemas", "Masculino"),
    Docente("321", "Lucía", "Gómez", "4567890", date(1985, 9, 25), "NIT002", "Licenciada", "Matemática", "Femenino")
]


# c) 
print("Estudiantes mayores de 25:")
for est in estudiantes:
    if est.get_edad() > 25:
        est.mostrar()
        print()

# d) 
print("Docente Ingeniero masculino más mayor:")
mayor_docente = None
for doc in docentes:
    if doc.get_profesion().lower() == "ingeniero" and doc.get_sexo().lower() == "masculino":
        if not mayor_docente or doc.get_edad() > mayor_docente.get_edad():
            mayor_docente = doc

if mayor_docente:
    mayor_docente.mostrar()

# e) 
print("\nCoincidencias de apellido entre estudiantes y docentes:")
for est in estudiantes:
    for doc in docentes:
        if est.get_apellido().lower() == doc.get_apellido().lower():
            print(f"Apellido: {est.get_apellido()}")
            print("Estudiante:")
            est.mostrar()
            print("Docente:")
            doc.mostrar()
            print("-----")

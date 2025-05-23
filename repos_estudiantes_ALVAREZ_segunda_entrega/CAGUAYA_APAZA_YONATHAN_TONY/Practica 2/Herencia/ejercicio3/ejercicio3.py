# 3. Definir las clases:
# Persona <ci, nombre, apellido, celular, fecha_Nac>
# Estudiante (heredado de persona) <ru, fecha_Ingreso, semestre>
# Docente (heredado de persona) <nit, profesión, especialidad>
# a) Diseñar el diagrama UML de las clases anteriores.
# b) Implementa las clases con sus constructores, datos por defecto y mostrar.
# c) Mostrar los estudiantes mayores de 25 años.
# d) Mostrar al docente que tiene la profesión de “Ingeniero”, es del sexo masculino y es el mayor de todos.
# e) Mostrar a los estudiantes y docentes que tienen el mismo apellido.

class Persona:
    def __init__(self, ci, nombre, apellido, celular, año_nac):
        self.__ci = ci
        self.__nombre = nombre
        self.__apellido = apellido
        self.__celular = celular
        self.__año_nac = año_nac

    def mostrar(self):
        return f"{self.__nombre} {self.__apellido}"

    def edad(self):
        return 2025 - self.__año_nac

    def get_nombre(self):
        return self.__nombre

    def get_apellido(self):
        return self.__apellido

    def inciso_c(self, personas):
        print("Inciso c) Estudiantes mayores de 25 años:")
        for p in personas:
            if isinstance(p, Estudiante) and p.edad() > 25:
                print(p.mostrar())

    def inciso_d(self, personas):
        print("Inciso d) Docente ingeniero, masculino y mayor:")
        ingenieros = [d for d in personas if isinstance(d, Docente) and d.get_profesion() == "Ingeniero" and d.get_nombre()[-1].lower() not in "aeiou"]
        if ingenieros:
            mayor = max(ingenieros, key=lambda x: x.edad())
            print(mayor.mostrar())

    def inciso_e(self, personas):
        print("Inciso e) Estudiantes y docentes con el mismo apellido:")
        estudiantes = [p for p in personas if isinstance(p, Estudiante)]
        docentes = [p for p in personas if isinstance(p, Docente)]
        for est in estudiantes:
            for doc in docentes:
                if est.get_apellido() == doc.get_apellido():
                    print(f"{est.get_nombre()} y {doc.get_nombre()} - Apellido: {est.get_apellido()}")


class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, año_nac, ru="SIN RU", fecha_ingreso="2020", semestre=1):
        super().__init__(ci, nombre, apellido, celular, año_nac)
        self.__ru = ru
        self.__fecha_ingreso = fecha_ingreso
        self.__semestre = semestre


class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, año_nac, nit="SIN NIT", profesion="NINGUNA", especialidad="NINGUNA"):
        super().__init__(ci, nombre, apellido, celular, año_nac)
        self.__nit = nit
        self.__profesion = profesion
        self.__especialidad = especialidad

    def get_profesion(self):
        return self.__profesion

personas = [
    Estudiante("123", "Ana", "Lopez", "77777777", 1996),
    Estudiante("124", "Luis", "Perez", "76767676", 2005),
    Docente("125", "Carlos", "Lopez", "75757575", 1970, profesion="Ingeniero"),
    Docente("126", "Marta", "Gomez", "74747474", 1980, profesion="Arquitecto")
]

persona_aux = Persona("", "", "", "", 0)
persona_aux.inciso_c(personas)
persona_aux.inciso_d(personas)
persona_aux.inciso_e(personas)

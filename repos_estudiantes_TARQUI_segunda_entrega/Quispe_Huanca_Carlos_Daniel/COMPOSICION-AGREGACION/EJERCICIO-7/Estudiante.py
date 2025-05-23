class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self._nombre = nombre
        self._carrera = carrera
        self._semestre = semestre

    @property
    def nombre(self):
        return self._nombre

    @property
    def carrera(self):
        return self._carrera

    @property
    def semestre(self):
        return self._semestre

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @carrera.setter
    def carrera(self, carrera):
        self._carrera = carrera

    @semestre.setter
    def semestre(self, semestre):
        self._semestre = semestre

    def mostrar_info(self):
        print(f"Nombre:{self._nombre}, Carrera:{self._carrera}, Semestre:{self._semestre}")

class Universidad(Estudiante):
    def __init__(self, nombre):
        self._nombre = nombre
        self._estudiantes = []

    @property
    def nombre(self):
        return self._nombre

    @property
    def estudiantes(self):
        return self._estudiantes

    @nombre.setter
    def nombre(self, nombre):
        self._nombre = nombre

    @estudiantes.setter
    def estudiantes(self, estudiantes):
        self._estudiantes = estudiantes

    def agregar_estudiante(self, estudiante):
        self._estudiantes.append(estudiante)

    def mostrar_universidad(self):
        print(f"Universidad: {self._nombre}")
        print("Estudiantes:")
        for estudiante in self._estudiantes:
            estudiante.mostrar_info()

estudiante1 = Estudiante("Juan Pérez", "Ingeniería Informática", 5)
estudiante2 = Estudiante("María Gómez", "Medicina", 3)
estudiante3 = Estudiante("Carlos Ruiz", "Derecho", 7)

universidad = Universidad("UniFraz")

universidad.agregar_estudiante(estudiante1)
universidad.agregar_estudiante(estudiante2)
universidad.agregar_estudiante(estudiante3)
universidad.mostrar_universidad()

print("\nEstudiante fuera de la universidad:")
estudiante1.mostrar_info()
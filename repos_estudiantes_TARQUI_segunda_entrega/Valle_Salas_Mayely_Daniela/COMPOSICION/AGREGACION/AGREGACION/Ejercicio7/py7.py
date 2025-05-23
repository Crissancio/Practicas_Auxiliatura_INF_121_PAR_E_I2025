class Estudiante:
    def __init__(self, nombre: str, carrera: str, semestre: int):
        self._nombre = nombre
        self._carrera = carrera
        self._semestre = semestre

    def mostrar_info(self):
        return f"Nombre: {self._nombre}, Carrera: {self._carrera}, Semestre: {self._semestre}"

    def get_nombre(self):
        return self._nombre

    def get_carrera(self):
        return self._carrera

    def get_semestre(self):
        return self._semestre

    def set_nombre(self, nombre: str):
        self._nombre = nombre

    def set_carrera(self, carrera: str):
        self._carrera = carrera

    def set_semestre(self, semestre: int):
        self._semestre = semestre


class Universidad:
    def __init__(self, nombre: str):
        self._nombre = nombre
        self._estudiantes = []

    def agregar_estudiante(self, estudiante: Estudiante):
        self._estudiantes.append(estudiante)

    def mostrar_universidad(self):
        info_universidad = f"Universidad: {self._nombre}\nEstudiantes:\n"
        for estudiante in self._estudiantes:
            info_universidad += estudiante.mostrar_info() + "\n"
        return info_universidad

universidad = Universidad("Universidad Mayor de San Andres")

estudiante1 = Estudiante("Sofia Zeballos", "Derecho", 3)
estudiante2 = Estudiante("Andrea Gómez", "Medicina", 4)
estudiante3 = Estudiante("Samuel Burgoa", "Ingeniería", 2)

universidad.agregar_estudiante(estudiante1)
universidad.agregar_estudiante(estudiante2)
universidad.agregar_estudiante(estudiante3)

print(universidad.mostrar_universidad())


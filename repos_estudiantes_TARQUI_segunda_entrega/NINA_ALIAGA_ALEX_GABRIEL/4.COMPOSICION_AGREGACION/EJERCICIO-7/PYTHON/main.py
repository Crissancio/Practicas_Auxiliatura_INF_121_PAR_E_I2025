from typing import List

class Estudiante:
    def __init__(self, nombre: str, carrera: str, semestre: int):
        self.nombre = nombre
        self.carrera = carrera
        self.semestre = semestre

    def mostrarInfo(self):
        print(f"Nombre: {self.nombre}")
        print(f"Carrera: {self.carrera}")
        print(f"Semestre: {self.semestre}")


class Universidad:
    def __init__(self, nombre: str):
        self.nombre = nombre
        self.estudiantes: List[Estudiante] = [] 

    def agregarEstudiante(self, estudiante: Estudiante):
        self.estudiantes.append(estudiante)

    def mostrarEstudiantes(self):
        for estudiante in self.estudiantes:
            estudiante.mostrarInfo()
            print("---------------------")


if __name__ == "__main__":
    universidad = Universidad("Universidad XYZ")
    estudiante1 = Estudiante("Juan Pérez", "Ingeniería", 3)
    estudiante2 = Estudiante("María López", "Medicina", 2)
    estudiante3 = Estudiante("Carlos Gómez", "Derecho", 4)

    universidad.agregarEstudiante(estudiante1)
    universidad.agregarEstudiante(estudiante2)
    universidad.agregarEstudiante(estudiante3)

    print("Estudiantes en la universidad:")
    print("---------------------")
    universidad.mostrarEstudiantes()
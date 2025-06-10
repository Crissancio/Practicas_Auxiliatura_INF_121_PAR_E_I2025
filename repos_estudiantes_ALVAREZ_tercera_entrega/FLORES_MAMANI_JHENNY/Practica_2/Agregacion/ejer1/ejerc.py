

class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self.nombre = nombre
        self.carrera = carrera
        self.semestre = semestre

    def mostrar_info(self):
        print(f"Nombre: {self.nombre}")
        print(f"Carrera: {self.carrera}")
        print(f"Semestre: {self.semestre}")
        print("-" * 20)


class Universidad:
    def __init__(self, nombre):
        self.nombre = nombre
        self.estudiantes = []

    def agregar_estudiante(self, estudiante):
        self.estudiantes.append(estudiante)

    def mostrar_info(self):
        print(f"Universidad: {self.nombre}")
        print("Estudiantes:")
        for estudiante in self.estudiantes:
            estudiante.mostrar_info()


def main():
    est1 = Estudiante("Lili Torres", "Pediatría", 3)
    est2 = Estudiante("Blu Pérez", "Medicina", 5)
    est3 = Estudiante("Mario Gómez", "Informática", 2)

    uni = Universidad("UMSA")
    uni.agregar_estudiante(est1)
    uni.agregar_estudiante(est2)
    uni.agregar_estudiante(est3)

    uni.mostrar_info()




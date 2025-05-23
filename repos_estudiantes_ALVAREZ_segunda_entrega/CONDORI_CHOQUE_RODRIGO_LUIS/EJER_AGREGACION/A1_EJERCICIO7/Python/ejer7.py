class Ejercicio6:
    class Estudiante:
        def __init__(self, nombre, carrera, semestre):
            self.nombre = nombre
            self.carrera = carrera
            self.semestre = semestre

        def mostrar_info(self):
            print(f"Estudiante: {self.nombre}, Carrera: {self.carrera}, Semestre: {self.semestre}")

    class Universidad:
        def __init__(self, nombre):
            self.nombre = nombre
            self.estudiantes = []

        def agregar_estudiante(self, estudiante):
            self.estudiantes.append(estudiante)

        def mostrar_universidad(self):
            print(f"Universidad: {self.nombre}")
            for est in self.estudiantes:
                est.mostrar_info()

    def main(self):
        est1 = self.Estudiante("Carlos Ramírez", "Ingeniería de Sistemas", 5)
        est2 = self.Estudiante("Ana Morales", "Medicina", 3)
        est3 = self.Estudiante("Luis Pérez", "Arquitectura", 7)

        universidad = self.Universidad("Universidad Nacional")
        universidad.agregar_estudiante(est1)
        universidad.agregar_estudiante(est2)
        universidad.agregar_estudiante(est3)

        print("=== Información de la Universidad ===")
        universidad.mostrar_universidad()

Ejercicio6().main()

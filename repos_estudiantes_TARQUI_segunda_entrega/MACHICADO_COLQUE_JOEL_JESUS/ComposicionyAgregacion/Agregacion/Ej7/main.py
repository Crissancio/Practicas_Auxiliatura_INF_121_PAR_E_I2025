class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self.nombre = nombre
        self.carrera = carrera
        self.semestre = semestre

    def get_nombre(self):
        return self.nombre

    def get_carrera(self):
        return self.carrera

    def get_semestre(self):
        return self.semestre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def set_carrera(self, carrera):
        self.carrera = carrera

    def set_semestre(self, semestre):
        self.semestre = semestre

    def mostrar_info(self):
        print(f"Nombre: {self.nombre}")
        print(f"Carrera: {self.carrera}")
        print(f"Semestre: {self.semestre}")
        print("------------------------")


class Universidad:
    def __init__(self, nombre):
        self.nombre = nombre
        self.estudiantes = []

    def get_nombre(self):
        return self.nombre

    def get_estudiantes(self):
        return self.estudiantes

    def set_nombre(self, nombre):
        self.nombre = nombre

    def agregar_estudiante(self, estudiante):
        self.estudiantes.append(estudiante)

    def mostrar_universidad(self):
        print(f"Universidad: {self.nombre}")
        print("=== Lista de Estudiantes ===")
        for estudiante in self.estudiantes:
            estudiante.mostrar_info()


# Programa principal
if __name__ == "__main__":
    # Estudiantes creados independientemente
    est1 = Estudiante("Carlos Pérez", "Ingeniería", 3)
    est2 = Estudiante("María López", "Derecho", 5)
    est3 = Estudiante("Ana García", "Medicina", 2)

    # Universidad
    uni = Universidad("UMSA")

    # Agregar estudiantes a la universidad
    uni.agregar_estudiante(est1)
    uni.agregar_estudiante(est2)
    uni.agregar_estudiante(est3)

    # Mostrar info completa
    uni.mostrar_universidad()

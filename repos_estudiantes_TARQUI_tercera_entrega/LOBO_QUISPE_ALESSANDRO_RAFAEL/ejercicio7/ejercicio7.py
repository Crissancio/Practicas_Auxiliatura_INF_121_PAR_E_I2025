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
        print(f"Nombre: {self.nombre}, Carrera: {self.carrera}, Semestre: {self.semestre}")


class Universidad:
    def __init__(self, nombre):
        self.nombre = nombre
        self.estudiantes = []

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def agregar_estudiante(self, estudiante):
        self.estudiantes.append(estudiante)

    def mostrar_universidad(self):
        print(f"Universidad: {self.nombre}")
        print("Estudiantes:")
        for estudiante in self.estudiantes:
            estudiante.mostrar_info()


# Ejecución principal
if __name__ == "__main__":
    estudiante1 = Estudiante("Ana López", "Ingeniería de Sistemas", 3)
    estudiante2 = Estudiante("Juan Pérez", "Derecho", 5)
    estudiante3 = Estudiante("María Gómez", "Medicina", 2)

    universidad = Universidad("Universidad Nacional")
    universidad.agregar_estudiante(estudiante1)
    universidad.agregar_estudiante(estudiante2)
    universidad.agregar_estudiante(estudiante3)

    universidad.mostrar_universidad()

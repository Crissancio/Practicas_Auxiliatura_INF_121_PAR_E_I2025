class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self.nombre = nombre
        self.carrera = carrera
        self.semestre = semestre

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_carrera(self):
        return self.carrera

    def set_carrera(self, carrera):
        self.carrera = carrera

    def get_semestre(self):
        return self.semestre

    def set_semestre(self, semestre):
        self.semestre = semestre

    def mostrar_info(self):
        print(f"Nombre: {self.nombre} Carrera: {self.carrera}")
        print(f"Semestre: {self.semestre}")


class Universidad:
    def __init__(self, nombre):
        self.nombre = nombre
        self.estudiantes = []

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_estudiantes(self):
        return self.estudiantes

    def set_estudiantes(self, estudiantes):
        self.estudiantes = estudiantes

    def agregar_estudiantes(self, estudiante):
        self.estudiantes.append(estudiante)

    def mostrar_universidad(self):
        print("-----------------------UNIVERSIDAD--------------------")
        print(f"Nombre: {self.nombre}")
        print("------------------------------------------------")
        print("Universidad: ")
        for estudiante in self.estudiantes:
            estudiante.mostrar_info()


# MAIN
if __name__ == "__main__":
    e1 = Estudiante("Ana Martinez", "Ingenieria de Sistema", 3)
    e2 = Estudiante("Carlos Rojas", "Arquitectura", 5)
    e3 = Estudiante("Lucia Fernandez", "Derecho", 2)

    u1 = Universidad("Universidad Nacional")

    u1.agregar_estudiantes(e1)
    u1.agregar_estudiantes(e2)
    u1.agregar_estudiantes(e3)

    u1.mostrar_universidad()
class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self.nombre = nombre
        self.carrera = carrera
        self.semestre = semestre

    # Getters y Setters (opcional en Python)
    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def mostrar_info(self):
        print(f"Nombre: {self.nombre}, Carrera: {self.carrera}, Semestre: {self.semestre}")

class Universidad:
    def __init__(self, nombre):
        self.nombre = nombre
        self.estudiantes = []

    def agregar_estudiante(self, estudiante):
        self.estudiantes.append(estudiante)

    def mostrar_universidad(self):
        print(f"Universidad: {self.nombre}")
        print("Estudiantes:")
        for estudiante in self.estudiantes:
            estudiante.mostrar_info()

if __name__ == "__main__":
    uni = Universidad("UTB")

    est1 = Estudiante("Ana", "Ingeniería", 3)
    est2 = Estudiante("Luis", "Medicina", 5)

    uni.agregar_estudiante(est1)
    uni.agregar_estudiante(est2)

    uni.mostrar_universidad()
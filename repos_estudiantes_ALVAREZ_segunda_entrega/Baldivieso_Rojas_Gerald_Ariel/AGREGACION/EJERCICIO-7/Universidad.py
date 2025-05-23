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
        print(f"Nombre de universidad: {self.nombre}")
        print("Estudiantes:")
        for estudiante in self.estudiantes:
            estudiante.mostrar_info()

def main():
    estu1 = Estudiante("Carlo", "Informática", 3)
    estu2 = Estudiante("Pedro", "Derecho", 8)
    estu3 = Estudiante("Robe", "Física", 1)
    estu4 = Estudiante("Sofia", "Psicología", 5)
    estu5 = Estudiante("Carla", "Biología", 7)

    uni1 = Universidad("UMSA")

    uni1.agregar_estudiante(estu1)
    uni1.agregar_estudiante(estu2)
    uni1.agregar_estudiante(estu3)
    uni1.agregar_estudiante(estu4)
    uni1.agregar_estudiante(estu5)

    uni1.mostrar_universidad()

if __name__ == "__main__":
    main()
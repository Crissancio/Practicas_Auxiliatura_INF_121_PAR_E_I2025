class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self.nombre = nombre
        self.carrera = carrera
        self.semestre = semestre

    def mostrar_info(self):
        print(f"  Nombre: {self.nombre}, Carrera: {self.carrera}, Semestre: {self.semestre}")

    # Getters
    def get_nombre(self):
        return self.nombre

    def get_carrera(self):
        return self.carrera

    def get_semestre(self):
        return self.semestre

    # Setters
    def set_nombre(self, nombre):
        self.nombre = nombre

    def set_carrera(self, carrera):
        self.carrera = carrera

    def set_semestre(self, semestre):
        self.semestre = semestre


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

    # Getter
    def get_nombre(self):
        return self.nombre

    def get_estudiantes(self):
        return self.estudiantes

    # Setter
    def set_nombre(self, nombre):
        self.nombre = nombre


# b) Crear una universidad y agregar varios estudiantes
universidad1 = Universidad("Universidad Mayor de San Andrés")
estudiante1 = Estudiante("Juan Perez", "Ingeniería de Sistemas", 3)
estudiante2 = Estudiante("Maria Gonzales", "Derecho", 5)
estudiante3 = Estudiante("Carlos Vargas", "Medicina", 2)

universidad1.agregar_estudiante(estudiante1)
universidad1.agregar_estudiante(estudiante2)
universidad1.agregar_estudiante(estudiante3)

# c) Mostrar la información de la universidad y sus estudiantes
universidad1.mostrar_universidad()

# Los estudiantes pueden existir independientemente de la universidad
estudiante4 = Estudiante("Sofia Rodriguez", "Arquitectura", 1)
print("\nInformación de un estudiante fuera de la universidad:")
estudiante4.mostrar_info()
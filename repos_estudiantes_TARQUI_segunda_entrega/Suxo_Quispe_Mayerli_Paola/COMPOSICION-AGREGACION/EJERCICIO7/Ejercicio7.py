class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self._nombre = nombre
        self._carrera = carrera
        self._semestre = semestre

    # Getters
    def get_nombre(self):
        return self._nombre

    def get_carrera(self):
        return self._carrera

    def get_semestre(self):
        return self._semestre

    # Setters
    def set_nombre(self, nombre):
        self._nombre = nombre

    def set_carrera(self, carrera):
        self._carrera = carrera

    def set_semestre(self, semestre):
        self._semestre = semestre

    def mostrar_info(self):
        print(f"Nombre: {self._nombre}, Carrera: {self._carrera}, Semestre: {self._semestre}")

class Universidad:
    def __init__(self, nombre):
        self._nombre = nombre
        self._estudiantes = []

    # Getter
    def get_nombre(self):
        return self._nombre

    def get_estudiantes(self):
        return self._estudiantes

    # Setter
    def set_nombre(self, nombre):
        self._nombre = nombre

    def agregar_estudiante(self, estudiante):
        if isinstance(estudiante, Estudiante):
            self._estudiantes.append(estudiante)
        else:
            print("El objeto proporcionado no es de tipo Estudiante.")

    def mostrar_universidad(self):
        print(f"Universidad: {self._nombre}")
        if self._estudiantes:
            print("Estudiantes:")
            for estudiante in self._estudiantes:
                estudiante.mostrar_info()
        else:
            print("No hay estudiantes inscritos en esta universidad.")

# b) Crea una universidad y agrega varios estudiantes.
universidad_ejemplo = Universidad("Universidad Central")

estudiante1 = Estudiante("Ana Pérez", "Ingeniería de Sistemas", 3)
estudiante2 = Estudiante("Carlos López", "Derecho", 5)
estudiante3 = Estudiante("Sofía Gómez", "Medicina", 2)

universidad_ejemplo.agregar_estudiante(estudiante1)
universidad_ejemplo.agregar_estudiante(estudiante2)
universidad_ejemplo.agregar_estudiante(estudiante3)

# También podemos crear estudiantes que no estén asociados a la universidad al principio
estudiante4 = Estudiante("Pedro Vargas", "Arquitectura", 1)

# c) Muestra la información de la universidad y sus estudiantes.
universidad_ejemplo.mostrar_universidad()

# Ejemplo de un estudiante independiente
print("\nInformación de un estudiante independiente:")
estudiante4.mostrar_info()

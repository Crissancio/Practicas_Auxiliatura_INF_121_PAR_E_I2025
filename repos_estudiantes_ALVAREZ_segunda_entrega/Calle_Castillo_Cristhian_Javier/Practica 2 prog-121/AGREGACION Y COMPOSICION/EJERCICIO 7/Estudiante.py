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

    # Método para mostrar información del estudiante
    def mostrar_info(self):
        print(f"Nombre: {self._nombre}")
        print(f"Carrera: {self._carrera}")
        print(f"Semestre: {self._semestre}")
        print("-----------------------")


class Universidad:
    def __init__(self, nombre):
        self._nombre = nombre
        self._estudiantes = []

    def get_nombre(self):
        return self._nombre

    def get_estudiantes(self):
        return self._estudiantes

    def set_nombre(self, nombre):
        self._nombre = nombre

    def agregar_estudiante(self, estudiante):
        if isinstance(estudiante, Estudiante):
            self._estudiantes.append(estudiante)

    def mostrar_universidad(self):
        print(f"Universidad: {self._nombre}")
        print("Lista de estudiantes:")
        for estudiante in self._estudiantes:
            estudiante.mostrar_info()


# Código principal
if __name__ == "__main__":
    # Crear estudiantes
    e1 = Estudiante("Renzo Espinoza", "Informática", 5)
    e2 = Estudiante("Lucía Martínez", "Matemáticas", 3)
    e3 = Estudiante("Carlos Ríos", "Física", 7)

    # Crear universidad
    uni = Universidad("Universidad de San Marcos")

    # Agregar estudiantes
    uni.agregar_estudiante(e1)
    uni.agregar_estudiante(e2)
    uni.agregar_estudiante(e3)

    # Mostrar información
    uni.mostrar_universidad()

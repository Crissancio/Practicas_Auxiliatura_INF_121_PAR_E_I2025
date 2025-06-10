class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self._nombre = nombre
        self._carrera = carrera
        self._semestre = semestre

    def get_nombre(self):
        return self._nombre

    def set_nombre(self, nombre):
        self._nombre = nombre

    def get_carrera(self):
        return self._carrera

    def set_carrera(self, carrera):
        self._carrera = carrera

    def get_semestre(self):
        return self._semestre

    def set_semestre(self, semestre):
        self._semestre = semestre

    def mostrar_info(self):
        print(f"Nombre: {self._nombre}, Carrera: {self._carrera}, Semestre: {self._semestre}")


class Universidad:
    def __init__(self, nombre):
        self._nombre = nombre
        self._estudiantes = []

    def get_nombre(self):
        return self._nombre

    def set_nombre(self, nombre):
        self._nombre = nombre

    def agregar_estudiante(self, estudiante):
        self._estudiantes.append(estudiante)

    def mostrar_universidad(self):
        print(f"Universidad: {self._nombre}")
        print("Estudiantes:")
        for est in self._estudiantes:
            est.mostrar_info()


# --- Prueba del código ---
# Crear estudiantes
est1 = Estudiante("María López", "Ingeniería", 3)
est2 = Estudiante("Juan Pérez", "Arquitectura", 5)
est3 = Estudiante("Ana Torres", "Derecho", 2)

# Crear universidad y agregar estudiantes
uni = Universidad("Universidad Nacional")
uni.agregar_estudiante(est1)
uni.agregar_estudiante(est2)
uni.agregar_estudiante(est3)

# Mostrar información
uni.mostrar_universidad()

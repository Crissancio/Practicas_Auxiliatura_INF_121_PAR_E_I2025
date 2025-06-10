# Implementing the University and Student classes and demonstrating usage

class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self._nombre = nombre
        self._carrera = carrera
        self._semestre = semestre

    # Getters
    @property
    def nombre(self):
        return self._nombre

    @property
    def carrera(self):
        return self._carrera

    @property
    def semestre(self):
        return self._semestre

    # Setters
    @nombre.setter
    def nombre(self, value):
        self._nombre = value

    @carrera.setter
    def carrera(self, value):
        self._carrera = value

    @semestre.setter
    def semestre(self, value):
        self._semestre = value

    def mostrar_info(self):
        return f"Estudiante: {self.nombre}, Carrera: {self.carrera}, Semestre: {self.semestre}"


class Universidad:
    def __init__(self, nombre):
        self._nombre = nombre
        self._estudiantes = []

    # Getters
    @property
    def nombre(self):
        return self._nombre

    @property
    def estudiantes(self):
        return self._estudiantes

    # Setters
    @nombre.setter
    def nombre(self, value):
        self._nombre = value

    def agregar_estudiante(self, estudiante):
        if isinstance(estudiante, Estudiante):
            self._estudiantes.append(estudiante)
        else:
            raise TypeError("Se debe agregar un objeto de tipo Estudiante")

    def mostrar_universidad(self):
        info = [f"Universidad: {self.nombre}"]
        if self.estudiantes:
            info.append("Estudiantes:")
            for e in self.estudiantes:
                info.append("  - " + e.mostrar_info())
        else:
            info.append("No hay estudiantes registrados.")
        return "\n".join(info)


# b) Crear una universidad y agregar varios estudiantes
uni = Universidad("Universidad Central")
uni.agregar_estudiante(Estudiante("Ana López", "Ingeniería Civil", 3))
uni.agregar_estudiante(Estudiante("Carlos Pérez", "Medicina", 5))
uni.agregar_estudiante(Estudiante("María García", "Arquitectura", 2))
uni.agregar_estudiante(Estudiante("Luis Fernández", "Economía", 8))

# c) Mostrar la información de la universidad y sus estudiantes
print(uni.mostrar_universidad())

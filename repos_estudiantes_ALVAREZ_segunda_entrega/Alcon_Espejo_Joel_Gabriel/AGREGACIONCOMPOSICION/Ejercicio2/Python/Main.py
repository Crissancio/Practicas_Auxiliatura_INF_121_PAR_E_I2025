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
        if value > 0:
            self._semestre = value
        else:
            raise ValueError("El semestre debe ser mayor que cero")
    
    def mostrar_info(self):
        return f"Nombre: {self.nombre}, Carrera: {self.carrera}, Semestre: {self.semestre}"


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
            raise TypeError("Solo se pueden agregar objetos de tipo Estudiante")
    
    def mostrar_universidad(self):
        info = f"Universidad: {self.nombre}\nEstudiantes:\n"
        for i, estudiante in enumerate(self.estudiantes, 1):
            info += f"  {i}. {estudiante.mostrar_info()}\n"
        info += f"Total estudiantes: {len(self.estudiantes)}"
        return info


# b) Crear una universidad y agregar estudiantes
univ_central = Universidad("Universidad Central")

# Crear estudiantes (pueden existir independientemente de la universidad)
est1 = Estudiante("María Gómez", "Ingeniería de Sistemas", 5)
est2 = Estudiante("Carlos Pérez", "Medicina", 8)
est3 = Estudiante("Ana Rodríguez", "Derecho", 3)
est4 = Estudiante("Luis Martínez", "Administración", 6)

# Agregar estudiantes a la universidad
univ_central.agregar_estudiante(est1)
univ_central.agregar_estudiante(est2)
univ_central.agregar_estudiante(est3)
univ_central.agregar_estudiante(est4)

# c) Mostrar información de la universidad y sus estudiantes
print(univ_central.mostrar_universidad())

# Demostración de que los estudiantes existen independientemente
print("\nEstudiante fuera de la universidad:")
print(Estudiante("Pedro Sánchez", "Arquitectura", 4).mostrar_info())
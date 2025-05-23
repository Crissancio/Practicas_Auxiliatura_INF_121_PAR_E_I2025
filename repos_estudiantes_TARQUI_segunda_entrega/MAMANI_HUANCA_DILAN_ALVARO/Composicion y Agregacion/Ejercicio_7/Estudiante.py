class Estudiante():
    def __init__(self, nombre, carrera, semestre):
        self.nombre=nombre
        self.carrera=carrera
        self.semestre=semestre
    
    def mostrar_info(self):
        print("< ESTUDIANTE >")
        print("Nombre: ",self.nombre)
        print("Carrera: ",self.carrera)
        print("Semestre: ",self.semestre)
    
    # Getters y Setters
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

    
    
class Universidad():
    def __init__(self, nombre):
        self.nombre=nombre
        self.estudiantes=[]
        
    def agregar_estudiante(self, estudiante):
        self.estudiantes.append(estudiante)

    def mostrar_universidad(self):
        print("< UNIVERSIDAD >")
        print("Nombre: ", self.nombre)
        print("Estudiantes: ")
        for est in self.estudiantes:
            est.mostrar_info()

    # Getters y Setters
    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_estudiantes(self):
        return self.estudiantes

    def set_estudiantes(self, lista_estudiantes):
        self.estudiantes = lista_estudiantes

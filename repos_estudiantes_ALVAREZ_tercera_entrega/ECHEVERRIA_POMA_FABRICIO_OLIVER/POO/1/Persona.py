class Persona:
    #A
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad
    
    def mostrar_el_saludo(self):
        print(f"Hola, soy {self.nombre} de {self.ciudad}")

    def es_mayor_de_edad(self):
        return self.edad >= 18

class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad
    
    # Método para mostrar el saludo
    def saludar(self):
        print(f"Hola, soy {self.nombre} de {self.ciudad}")
    
    # Método para verificar si es mayor de edad
    def es_mayor_de_edad(self):
        if self.edad >= 18:
            return True
        else:
            return False

# Creación de tres personas
persona1 = Persona("Juan", 25, "Cochabamba")
persona2 = Persona("Pedro", 16, "Pando")
persona3 = Persona("Lucia", 30, "Tarija")

persona1.saludar()
persona2.saludar()
persona3.saludar()

print(f"{persona1.nombre} es mayor de edad: {persona1.es_mayor_de_edad()}")
print(f"{persona2.nombre} es mayor de edad: {persona2.es_mayor_de_edad()}")
print(f"{persona3.nombre} es mayor de edad: {persona3.es_mayor_de_edad()}")

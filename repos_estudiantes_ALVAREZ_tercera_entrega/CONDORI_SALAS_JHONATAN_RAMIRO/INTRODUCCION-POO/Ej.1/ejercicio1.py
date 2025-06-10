class Persona:
    
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    def mostrar_saludo(self):
        print(f"Hola, soy {self.nombre} de {self.ciudad}")
        
    def es_mayor_de_edad(self):
        if self.edad >= 18:
            return True
        else:
            return False
        
persona1 = Persona("Julian", 23, "La Paz")
persona2 = Persona("Ana", 17, "Sucre")
persona3 = Persona("Carlos", 20, "Cochabamba")

print("Saludo de la persona1:")
persona1.mostrar_saludo()

print("\nSaludos de las tres personas:")
persona1.mostrar_saludo()
persona2.mostrar_saludo()
persona3.mostrar_saludo()

print("\nVerificación de mayoría de edad:")
print(f"{persona1.nombre} es mayor de edad: {persona1.es_mayor_de_edad()}")
print(f"{persona2.nombre} es mayor de edad: {persona2.es_mayor_de_edad()}")
print(f"{persona3.nombre} es mayor de edad: {persona3.es_mayor_de_edad()}")

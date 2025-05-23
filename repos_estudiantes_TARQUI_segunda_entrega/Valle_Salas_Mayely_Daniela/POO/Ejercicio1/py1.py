class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    def mostrar_saludo(self):
        return f"Hola, soy {self.nombre} de {self.ciudad}"

    def es_mayor_de_edad(self):
        return self.edad >= 18

persona1 = Persona("Juan", 20, "La Paz")
persona2 = Persona("Ana", 13, "Potosi")
persona3 = Persona("Luis", 38, "Oruro")

print(persona1.mostrar_saludo())
print(persona2.mostrar_saludo())
print(persona3.mostrar_saludo())

print(f"{persona1.nombre} es mayor de edad: {persona1.es_mayor_de_edad()}")
print(f"{persona2.nombre} es mayor de edad: {persona2.es_mayor_de_edad()}")
print(f"{persona3.nombre} es mayor de edad: {persona3.es_mayor_de_edad()}")

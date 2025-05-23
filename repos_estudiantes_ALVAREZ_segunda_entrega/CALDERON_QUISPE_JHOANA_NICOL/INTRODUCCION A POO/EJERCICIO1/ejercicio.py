class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre 
        self.edad = edad 
        self.ciudad = ciudad
    def saludo(self):
         return f"Hola, soy {self.nombre} de {self.ciudad}"
    def mayordeedad(self):
        return self.edad >= 18
    
persona1 = Persona("Victor", 27, "La Paz")
persona2 = Persona("Raquel", 21, "Santa Cruz")
persona3 = Persona("Alejandra", 17, "Oruro")

print(persona1.saludo())
print(persona2.saludo())
print(persona3.saludo())

print(f"¿{persona1.nombre} es mayor de edad? {persona1.mayordeedad()}")
print(f"¿{persona2.nombre} es mayor de edad? {persona2.mayordeedad()}")
print(f"¿{persona3.nombre} es mayor de edad? {persona3.mayordeedad()}")
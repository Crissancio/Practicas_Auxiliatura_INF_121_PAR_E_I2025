class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad
# Inciso a
    def mostrar_saludo(self):
        return f"Hola, soy {self.nombre} de {self.ciudad}"
# Inciso c
    def verificar_si_esmayor(self):
        if self.edad >= 18:
            return f"{self.nombre} es mayor de edad"
        else:
            return f"{self.nombre} es menor de edad"
# Inciso b
persona = Persona("Belen", 24, "Brasil")
print(persona.mostrar_saludo())
print(persona.verificar_si_esmayor())
persona2 = Persona("Joel", 23, "Bolivia")
print(persona2.mostrar_saludo())
print(persona2.verificar_si_esmayor())
persona3 = Persona("Tobias", 3, "Alemania")
print(persona3.mostrar_saludo())
print(persona3.verificar_si_esmayor())

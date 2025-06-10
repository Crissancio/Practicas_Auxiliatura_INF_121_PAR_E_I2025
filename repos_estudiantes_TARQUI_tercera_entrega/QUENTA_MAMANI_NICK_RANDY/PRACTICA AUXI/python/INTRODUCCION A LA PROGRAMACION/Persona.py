"NOMBRE: QUENTA MAMANI NICK RANDY"
"CI: 10037571"

"1. Crea una clase Persona con nombre, edad y ciudad"
"a) Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”"
"b) Crea tres personas y muestra su saludo"
"c) Agrega un método para verificar si es mayor de edad"

class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    def saludo(self):
        return f"Hola, soy {self.nombre} de {self.ciudad}"

    def es_mayor_de_edad(self):
        return "es mayor de edad" if self.edad >= 18 else "no es mayor de edad"

pers1 = Persona("Mauricio", 32, "Beni")
pers2 = Persona("Nayra", 17, "El Alto")
pers3 = Persona("Gafi", 21, "Sucre")

print(pers1.saludo())
print(pers2.saludo())
print(pers3.saludo())

print(f"{pers1.nombre} {pers1.es_mayor_de_edad()}")
print(f"{pers2.nombre} {pers2.es_mayor_de_edad()}")
print(f"{pers3.nombre} {pers3.es_mayor_de_edad()}")

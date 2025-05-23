#1. Crea una clase Persona con nombre, edad y ciudad
#a) Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”
#b) Crea tres personas y muestra su saludo
#c) Agrega un método para verificar si es mayor de edad
class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    def mostrar_saludo(self):
        return f"Hola, soy {self.nombre} de {self.ciudad}."
class Estudiante(Persona):
    def __init__(self, nombre, edad, ciudad, universidad):
        super().__init__(nombre, edad, ciudad)
        self.universidad = universidad

    def mostrar_saludo(self):
        return f"Hola, soy {self.nombre}, de {self.ciudad}, y estudio en {self.universidad}."
class Direccion:
    def __init__(self, calle, numero):
        self.calle = calle
        self.numero = numero

class PersonaConDireccion(Persona):
    def __init__(self, nombre, edad, ciudad, calle, numero):
        super().__init__(nombre, edad, ciudad)  
        self.direccion = Direccion(calle, numero)

    def mostrar_direccion(self):
        return f"Vivo en la calle {self.direccion.calle}, número {self.direccion.numero}."
class PersonaConAmigos(Persona):
    def __init__(self, nombre, edad, ciudad):
        super().__init__(nombre, edad, ciudad)
        self.amigos = []

    def agregar_amigo(self, amigo):
        self.amigos.append(amigo)

    def mostrar_amigos(self):
        nombres_amigos = [amigo.nombre for amigo in self.amigos]
        return f"{self.nombre} tiene como amigos a: {', '.join(nombres_amigos)}"
persona1 = PersonaConDireccion("Ana", 25, "La Paz", "Av. del Sol", 123)
print(persona1.mostrar_saludo())
print(persona1.mostrar_direccion())

estudiante1 = Estudiante("Carlos", 20, "Cochabamba", "UMSA")
print(estudiante1.mostrar_saludo())

persona_con_amigos = PersonaConAmigos("Pedro", 22, "Sucre")
amigo1 = Persona("Juan", 24, "Potosí")
amigo2 = Persona("Sofia", 20, "Oruro")

persona_con_amigos.agregar_amigo(amigo1)
persona_con_amigos.agregar_amigo(amigo2)
print(persona_con_amigos.mostrar_amigos())

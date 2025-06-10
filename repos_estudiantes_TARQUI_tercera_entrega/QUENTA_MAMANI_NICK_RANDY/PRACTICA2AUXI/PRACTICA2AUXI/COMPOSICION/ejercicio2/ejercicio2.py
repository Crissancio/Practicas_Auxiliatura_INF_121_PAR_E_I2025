# 2. La computadora está compuesta por componentes como el procesador, la
# memoria RAM y el disco duro. Si la computadora se destruye, los componentes
# también se destruyen.
# Componente<nombre, capacidad (ej: "8GB RAM", "1TB Disco Duro")
# Métodos: mostrar_info() (muestra el nombre y la capacidad del componente)
# Computadora<marca, modelo, componentes (lista de objetos de tipo Componente)
# Métodos: agregar_componente(componente), mostrar_computadora() (muestra
# la marca, modelo y la información de todos los componentes)
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea una computadora y agrega varios componentes.
# c) Muestra la información de la computadora y sus componentes.
class Componente:
    def __init__(self, nombre, capacidad): self.nombre, self.capacidad = nombre, capacidad
    def mostrar_info(self): print(f"Componente: {self.nombre}, Capacidad: {self.capacidad}")

class Computadora:
    def __init__(self, marca, modelo): self.marca, self.modelo, self.componentes = marca, modelo, []
    def agregar_componente(self, componente): self.componentes.append(componente)
    def mostrar_computadora(self):
        print(f"Computadora: {self.marca} {self.modelo}")
        for c in self.componentes: c.mostrar_info()

pc = Computadora("HP", "Pavilion")
pc.agregar_componente(Componente("RAM", "8GB"))
pc.agregar_componente(Componente("Disco Duro", "1TB"))
pc.mostrar_computadora()

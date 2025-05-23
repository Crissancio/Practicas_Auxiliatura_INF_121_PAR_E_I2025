class Componente:
    def __init__(self, nombre, tipo):
        self.nombre = nombre
        self.tipo = tipo

    def mostrar_info(self):
        return f"{self.tipo}: {self.nombre}"

class Computadora:
    def __init__(self, marca):
        self.marca = marca
        self.componentes = []

    def agregar_componente(self, componente):
        self.componentes.append(componente)

    def mostrar_computadora(self):
        print(f"Computadora marca: {self.marca}")
        print("Componentes:")
        for comp in self.componentes:
            print("  -", comp.mostrar_info())


# Crear computadora y componentes
cpu = Componente("Intel Core i7", "Procesador")
ram = Componente("16GB DDR4", "Memoria RAM")
disco = Componente("1TB SSD", "Disco Duro")

pc = Computadora("Dell")
pc.agregar_componente(cpu)
pc.agregar_componente(ram)
pc.agregar_componente(disco)

# Mostrar información de la computadora y sus componentes
print("== Información de la Computadora ==")
pc.mostrar_computadora()

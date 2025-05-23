class Ejercicio4:
    class Componente:
        def __init__(self, nombre, capacidad):
            self.nombre = nombre
            self.capacidad = capacidad

        def mostrar_info(self):
            print(f"Componente: {self.nombre}, Capacidad: {self.capacidad}")

    class Computadora:
        def __init__(self, marca, modelo):
            self.marca = marca
            self.modelo = modelo
            self.componentes = []

        def agregar_componente(self, componente):
            self.componentes.append(componente)

        def mostrar_computadora(self):
            print(f"Marca: {self.marca}, Modelo: {self.modelo}")
            for c in self.componentes:
                c.mostrar_info()

    def main(self):
        pc = self.Computadora("Dell", "Inspiron 15")
        pc.agregar_componente(self.Componente("Procesador", "Intel Core i7"))
        pc.agregar_componente(self.Componente("RAM", "16GB"))
        pc.agregar_componente(self.Componente("Disco Duro", "1TB HDD"))
        pc.agregar_componente(self.Componente("SSD", "512GB NVMe"))

        print("=== Información de la Computadora ===")
        pc.mostrar_computadora()

Ejercicio4().main()

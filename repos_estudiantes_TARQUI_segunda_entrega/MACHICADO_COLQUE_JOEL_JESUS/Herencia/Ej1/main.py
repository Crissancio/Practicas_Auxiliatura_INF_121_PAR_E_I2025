class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.año = año
        self.precio_base = precio_base

    def mostrar_info(self):
        print(f"Marca: {self.marca}")
        print(f"Modelo: {self.modelo}")
        print(f"Año: {self.año}")
        print(f"Precio base: ${self.precio_base}")

    def get_año(self):
        return self.año


class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Número de puertas: {self.num_puertas}")
        print(f"Tipo de combustible: {self.tipo_combustible}")

    def get_num_puertas(self):
        return self.num_puertas


class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self.cilindrada}cc")
        print(f"Tipo de motor: {self.tipo_motor}")


# Main
coches = [
    Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina"),
    Coche("Chevrolet", "Suburban", 2024, 35000, 5, "Diesel"),
    Coche("Tesla", "Model S", 2025, 80000, 5, "Eléctrico")
]

motos = [
    Moto("Yamaha", "FZ", 2025, 3500, 250, "2 tiempos"),
    Moto("Kawasaki", "Ninja", 2023, 7000, 600, "4 tiempos")
]

print("\n Todos los coches:")
for coche in coches:
    coche.mostrar_info()
    print("-----------------")

print("\n Coches con más de 4 puertas:")
for coche in coches:
    if coche.get_num_puertas() > 4:
        coche.mostrar_info()
        print("-----------------")

print("\n Vehículos del año 2025:")
for coche in coches:
    if coche.get_año() == 2025:
        coche.mostrar_info()
        print("-----------------")

for moto in motos:
    if moto.get_año() == 2025:
        moto.mostrar_info()
        print("-----------------")


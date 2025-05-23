class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.año = año
        self.precio_base = precio_base

    def mostrar_info(self):
        print(f"Marca: {self.marca}, Modelo: {self.modelo}, Año: {self.año}, Precio Base: {self.precio_base}")


class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Puertas: {self.num_puertas}, Combustible: {self.tipo_combustible}")


class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self.cilindrada}, Motor: {self.tipo_motor}")

vehiculos = [
    Coche("Toyota", "Corolla", 2022, 20000, 4, "Gasolina"),
    Coche("Ford", "Mondeo", 2025, 30000, 5, "Diésel"),
    Moto("Yamaha", "MT-07", 2025, 7500, 689, "2 tiempos")
]

for v in vehiculos:
    v.mostrar_info()
    print()

print("Coches con más de 4 puertas:")
for v in vehiculos:
    if isinstance(v, Coche) and v.num_puertas > 4:
        v.mostrar_info()
        print()

print("Vehículos actuales (2025):")
for v in vehiculos:
    if v.año == 2025:
        v.mostrar_info()
        print()

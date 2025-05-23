# 1. Modelar diferentes tipos de vehículos. Las clases deben tener las siguientes características:
# Vehículo<marca, modelo, año, precio_base>
# Métodos: mostrar_info() muestra la información básica del vehículo
# Coche (hereda de Vehículo)<num_puertas, tipo_combustible>
# Métodos: mostrar_info() debe mostrar la información básica más los atributos adicionales
# Moto (hereda de Vehículo)<cilindrada, tipo_motor>
# Métodos: mostrar_info() debe mostrar la información básica más los atributos adicionales
# a) Implementa las clases con sus constructores, getters y setters

class Vehiculo:
    def __init__(self, marca, modelo, anio, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.anio = anio
        self.precio_base = precio_base

    def mostrar_info(self):
        print(f"Marca: {self.marca}, Modelo: {self.modelo}, Año: {self.anio}, Precio Base: {self.precio_base}")

class Coche(Vehiculo):
    def __init__(self, marca, modelo, anio, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, anio, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Puertas: {self.num_puertas}, Combustible: {self.tipo_combustible}")

class Moto(Vehiculo):
    def __init__(self, marca, modelo, anio, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, anio, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self.cilindrada}cc, Motor: {self.tipo_motor}")

# b) Crea instancias de Coche y Moto y muestra su información usando el método mostrar_info()
coches = [
    Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina"),
    Coche("Ford", "Explorer", 2025, 30000, 5, "Diesel"),
    Coche("Tesla", "Model S", 2024, 80000, 4, "Eléctrico")
]

motos = [
    Moto("Yamaha", "MT-03", 2025, 5000, 321, "4 tiempos"),
    Moto("Honda", "CBR500R", 2023, 7000, 500, "4 tiempos")
]

print("=== Información de Coches ===")
for coche in coches:
    coche.mostrar_info()

print("\n=== Información de Motos ===")
for moto in motos:
    moto.mostrar_info()

# c) Muestra todos los coches que tienen más de 4 puertas
print("\n=== Coches con más de 4 puertas ===")
for coche in coches:
    if coche.num_puertas > 4:
        coche.mostrar_info()

# d) Mostrar los coches y motos actuales (gestión 2025)
print("\n=== Vehículos gestión 2025 ===")
for coche in coches:
    if coche.anio == 2025:
        coche.mostrar_info()

for moto in motos:
    if moto.anio == 2025:
        moto.mostrar_info()

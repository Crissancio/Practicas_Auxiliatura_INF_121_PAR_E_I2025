class Vehiculo:
    def __init__(self, marca, modelo, anio, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.anio = anio
        self.precio_base = precio_base

    def mostrar_info(self):
        print("Información del Vehículo ")
        print(f"Marca: {self.marca}")
        print(f"Modelo: {self.modelo}")
        print(f"Año: {self.anio}")
        print(f"Precio Base: ${self.precio_base:.2f}")

class Coche(Vehiculo):
    def __init__(self, marca, modelo, anio, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, anio, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Número de Puertas: {self.num_puertas}")
        print(f"Tipo de Combustible: {self.tipo_combustible}")

class Moto(Vehiculo):
    def __init__(self, marca, modelo, anio, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, anio, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self.cilindrada} cc")
        print(f"Tipo de Motor: {self.tipo_motor}")
print("Información de Vehículos Creados ")
coche1 = Coche("Toyota", "Corolla", 2022, 25000.00, 4, "Gasolina")
moto1 = Moto("Yamaha", "YZF-R3", 2021, 6000.00, 321, "Gasolina")

coche1.mostrar_info()

moto1.mostrar_info()
print("\n")

coches = [
    Coche("Toyota", "Corolla", 2022, 25000.00, 4, "Gasolina"),
    Coche("Honda", "CR-V", 2023, 35000.00, 5, "Híbrido"),
    Coche("Ford", "Mustang", 2024, 60000.00, 2, "Gasolina"),
    Coche("Nissan", "Sentra", 2023, 28000.00, 4, "Gasolina"),
    Coche("BMW", "X5", 2025, 70000.00, 5, "Diésel")
]

motos = [
    Moto("Yamaha", "YZF-R3", 2021, 6000.00, 321, "Gasolina"),
    Moto("Harley-Davidson", "Iron 883", 2023, 12000.00, 883, "Gasolina"),
    Moto("Kawasaki", "Ninja 400", 2025, 7500.00, 400, "Gasolina"),
    Moto("Ducati", "Monster", 2024, 15000.00, 937, "Gasolina")
]
print("Coches con más de 4 Puertas ")
for coche in coches:
    if coche.num_puertas > 4:
        coche.mostrar_info()
print("\n")
anio_actual = 2025
print(f"Coches Actuales (Gestión {anio_actual}) ")
for coche in coches:
    if coche.anio == anio_actual:
        coche.mostrar_info()

print(f"Motos Actuales (Gestión {anio_actual}) ")
for moto in motos:
    if moto.anio == anio_actual:
        moto.mostrar_info()
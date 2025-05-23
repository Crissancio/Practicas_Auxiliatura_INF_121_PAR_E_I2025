class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.año = año
        self.precio_base = precio_base

    def mostrar_info(self):
        return f"Marca: {self.marca}, Modelo: {self.modelo}, Año: {self.año}, Precio Base: ${self.precio_base}"

class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        return super().mostrar_info() + f", Puertas: {self.num_puertas}, Combustible: {self.tipo_combustible}"

class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def mostrar_info(self):
        return super().mostrar_info() + f", Cilindrada: {self.cilindrada}, Tipo de Motor: {self.tipo_motor}"


# b)
vehiculos = [
    Coche("Toyota", "Corolla", 2022, 18000, 4, "Gasolina"),
    Coche("Chevrolet", "Trailblazer", 2025, 32000, 5, "Diésel"),
    Moto("Yamaha", "R3", 2023, 9500, "321cc", "4T"),
    Moto("Kawasaki", "Ninja", 2025, 12000, "399cc", "4T")
]

# Mostrar información 
print("== Información de vehículos ==")
for v in vehiculos:
    print(v.mostrar_info())

# c)
print("\n== Coches con más de 4 puertas ==")
for v in vehiculos:
    if isinstance(v, Coche) and v.num_puertas > 4:
        print(v.mostrar_info())

# d)
print("\n== Vehículos del año 2025 ==")
for v in vehiculos:
    if v.año == 2025:
        print(v.mostrar_info())

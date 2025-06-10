class Vehiculo:
    def __init__(self, marca, modelo, anio, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.anio = anio
        self.precio_base = precio_base

    def mostrar_info(self):
        return f"Marca: {self.marca}, Modelo: {self.modelo}, Año: {self.anio}, Precio base: ${self.precio_base}"

class Coche(Vehiculo):
    def __init__(self, marca, modelo, anio, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, anio, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        base_info = super().mostrar_info()
        return f"{base_info}, Puertas: {self.num_puertas}, Combustible: {self.tipo_combustible}"

class Moto(Vehiculo):
    def __init__(self, marca, modelo, anio, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, anio, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def mostrar_info(self):
        base_info = super().mostrar_info()
        return f"{base_info}, Cilindrada: {self.cilindrada}, Motor: {self.tipo_motor}"

# SIN GETTERS NI SETTERS


vehiculos = [
    Coche("Toyota", "Corolla", 2025, 25000, 4, "Gasolina"),
    Coche("Ford", "Explorer", 2024, 35000, 5, "Diesel"),
    Moto("Yamaha", "R3", 2025, 7000, "321cc", "4 tiempos"),
    Moto("nisan", "CBR600RR", 2023, 12000, "599cc", "4 tiempos")
]

print(" Información de Vehículos:")
for v in vehiculos:
    print(v.mostrar_info())


print("\n Coches con más de 4 puertas:")
for v in vehiculos:
    if isinstance(v, Coche) and v.num_puertas > 4:
        print(v.mostrar_info())


print("\n Vehículos del año 2025:")
for v in vehiculos:
    if v.anio == 2025:
        print(v.mostrar_info())

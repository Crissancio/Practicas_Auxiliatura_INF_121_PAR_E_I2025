
class Vehiculo:
    def __init__(self, marca, modelo, anio, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.anio = anio
        self.precio_base = precio_base
    def mostrar_info(self):
        print(f"Marca: {self.marca}, Modelo: {self.modelo}, Año: {self.anio}, Precio base: ${self.precio_base}")
    def get_anio(self):
        return self.anio
class Coche(Vehiculo):
    def __init__(self, marca, modelo, anio, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, anio, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Puertas: {self.num_puertas}, Combustible: {self.tipo_combustible}")

    def get_num_puertas(self):
        return self.num_puertas
class Moto(Vehiculo):
    def __init__(self, marca, modelo, anio, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, anio, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self.cilindrada}cc, Tipo de motor: {self.tipo_motor}")
vehiculos = [
    Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina"),
    Coche("Ford", "Explorer", 2025, 35000, 5, "Híbrido"),
    Moto("Yamaha", "MT-07", 2024, 8000, 689, "2T"),
    Moto("Kawasaki", "Ninja", 2025, 12000, 649, "4T")
]
print("\n--- Información de vehículos ---")
for v in vehiculos:
    v.mostrar_info()
    print()
print("\n--- Coches con más de 4 puertas ---")
for v in vehiculos:
    if isinstance(v, Coche) and v.get_num_puertas() > 4:
        v.mostrar_info()
        print()
print("\n--- Vehículos del año 2025 ---")
for v in vehiculos:
    if v.get_anio() == 2025:
        v.mostrar_info()
        print()
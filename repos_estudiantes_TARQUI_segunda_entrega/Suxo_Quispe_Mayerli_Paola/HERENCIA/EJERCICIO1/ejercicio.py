class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self._marca = marca
        self._modelo = modelo
        self._año = año
        self._precio_base = precio_base

    def get_marca(self): return self._marca
    def get_modelo(self): return self._modelo
    def get_año(self): return self._año
    def get_precio_base(self): return self._precio_base

    def set_marca(self, marca): self._marca = marca
    def set_modelo(self, modelo): self._modelo = modelo
    def set_año(self, año): self._año = año
    def set_precio_base(self, precio): self._precio_base = precio

    def mostrar_info(self):
        print(f"Marca: {self._marca}, Modelo: {self._modelo}, Año: {self._año}, Precio base: ${self._precio_base}")


class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self._num_puertas = num_puertas
        self._tipo_combustible = tipo_combustible

    def get_num_puertas(self): return self._num_puertas
    def get_tipo_combustible(self): return self._tipo_combustible

    def set_num_puertas(self, num): self._num_puertas = num
    def set_tipo_combustible(self, tipo): self._tipo_combustible = tipo

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Puertas: {self._num_puertas}, Combustible: {self._tipo_combustible}")


class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self._cilindrada = cilindrada
        self._tipo_motor = tipo_motor

    def get_cilindrada(self): return self._cilindrada
    def get_tipo_motor(self): return self._tipo_motor

    def set_cilindrada(self, cil): self._cilindrada = cil
    def set_tipo_motor(self, tipo): self._tipo_motor = tipo

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self._cilindrada}cc, Motor: {self._tipo_motor}")


# Crear y mostrar vehículos
vehiculos = [
    Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina"),
    Coche("Ford", "Explorer", 2025, 30000, 5, "Diesel"),
    Moto("Yamaha", "YZF-R3", 2025, 6000, 321, "2T"),
    Moto("Honda", "CBR600RR", 2023, 11500, 599, "4T")
]

print("\n--- Información de vehículos ---")
for v in vehiculos:
    v.mostrar_info()
    print()

print("--- Coches con más de 4 puertas ---")
for v in vehiculos:
    if isinstance(v, Coche) and v.get_num_puertas() > 4:
        v.mostrar_info()
        print()

print("--- Vehículos del año 2025 ---")
for v in vehiculos:
    if v.get_año() == 2025:
        v.mostrar_info()
        print()

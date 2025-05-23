class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self._marca = marca
        self._modelo = modelo
        self._año = año
        self._precio_base = precio_base

    def mostrar_info(self):
        print(f"{self._marca} {self._modelo} ({self._año}), Precio: ${self._precio_base}")

    def get_año(self):
        return self._año

    def get_marca(self):
        return self._marca

    def get_modelo(self):
        return self._modelo

    def get_precio_base(self):
        return self._precio_base

    def set_precio_base(self, precio_base):
        self._precio_base = precio_base


class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self._num_puertas = num_puertas
        self._tipo_combustible = tipo_combustible

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Puertas: {self._num_puertas}, Combustible: {self._tipo_combustible}")

    def get_num_puertas(self):
        return self._num_puertas


class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self._cilindrada = cilindrada
        self._tipo_motor = tipo_motor

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self._cilindrada}cc, Motor: {self._tipo_motor}")


# b) Crear instancias y mostrar información
coche1 = Coche("Toyota", "Corolla", 2023, 20000, 4, "Gasolina")
moto1 = Moto("Honda", "CB500X", 2024, 8000, 471, "Bicilíndrico")

print("Información del Coche:")
coche1.mostrar_info()
print("\nInformación de la Moto:")
moto1.mostrar_info()

# c) Mostrar coches con más de 4 puertas
coches = [
    Coche("Nissan", "Versa", 2022, 18000, 4, "Gasolina"),
    Coche("Hyundai", "Tucson", 2024, 28000, 5, "Gasolina"),
    Coche("Ford", "Focus", 2021, 16000, 5, "Diésel"),
    Coche("BMW", "Serie 5", 2023, 55000, 4, "Gasolina"),
    Coche("Audi", "Q7", 2025, 70000, 5, "Diésel")
]

print("\nCoches con más de 4 puertas:")
for coche in coches:
    if coche.get_num_puertas() > 4:
        coche.mostrar_info()

# d) Mostrar coches y motos actuales (gestión 2025)
motos = [
    Moto("Yamaha", "MT-07", 2025, 9000, 689, "Bicilíndrico"),
    Moto("Kawasaki", "Ninja 650", 2024, 8500, 649, "Bicilíndrico"),
    Moto("Suzuki", "GSX-R1000", 2023, 16000, 999, "Cuatro cilindros en línea"),
    Moto("Ducati", "Monster", 2025, 12000, 937, "Bicilíndrico en L")
]

print("\nVehículos de la gestión 2025:")
for coche in coches:
    if coche.get_año() == 2025:
        print("Coche:")
        coche.mostrar_info()
for moto in motos:
    if moto.get_año() == 2025:
        print("Moto:")
        moto.mostrar_info()
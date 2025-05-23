class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.año = año
        self.precio_base = precio_base

    def get_marca(self):
        return self.marca

    def set_marca(self, marca):
        self.marca = marca

    def get_modelo(self):
        return self.modelo

    def set_modelo(self, modelo):
        self.modelo = modelo

    def get_año(self):
        return self.año

    def set_año(self, año):
        self.año = año

    def get_precio_base(self):
        return self.precio_base

    def set_precio_base(self, precio_base):
        self.precio_base = precio_base

    def mostrar_info(self):
        print(f"Marca: {self.marca}, Modelo: {self.modelo}, Año: {self.año}, Precio Base: {self.precio_base}")


class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def get_num_puertas(self):
        return self.num_puertas

    def set_num_puertas(self, num_puertas):
        self.num_puertas = num_puertas

    def get_tipo_combustible(self):
        return self.tipo_combustible

    def set_tipo_combustible(self, tipo_combustible):
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Número de Puertas: {self.num_puertas}, Tipo de Combustible: {self.tipo_combustible}")

class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def get_cilindrada(self):
        return self.cilindrada

    def set_cilindrada(self, cilindrada):
        self.cilindrada = cilindrada

    def get_tipo_motor(self):
        return self.tipo_motor

    def set_tipo_motor(self, tipo_motor):
        self.tipo_motor = tipo_motor

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self.cilindrada}, Tipo de Motor: {self.tipo_motor}")

# a) Crear instancias
coche1 = Coche("Toyota", "Corolla", 2023, 22000, 4, "Gasolina")
coche2 = Coche("Hyundai", "Elantra", 2025, 25000, 5, "Híbrido")
moto1 = Moto("Yamaha", "FZ", 2025, 15000, "150cc", "2T")
moto2 = Moto("Honda", "CBR", 2024, 18000, "250cc", "4T")

# b) Mostrar información
print("== Información de Vehículos ==")
coche1.mostrar_info()
print()
coche2.mostrar_info()
print()
moto1.mostrar_info()
print()
moto2.mostrar_info()
print()

# c) Mostrar coches con más de 4 puertas
print("== Coches con más de 4 puertas ==")
for coche in [coche1, coche2]:
    if coche.get_num_puertas() > 4:
        coche.mostrar_info()
        print()

# d) Mostrar coches y motos actuales (gestión 2025)
print("== Vehículos de gestión 2025 ==")
for vehiculo in [coche1, coche2, moto1, moto2]:
    if vehiculo.get_año() == 2025:
        vehiculo.mostrar_info()
        print()

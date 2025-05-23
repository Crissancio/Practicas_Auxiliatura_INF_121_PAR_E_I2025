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
        print(f"Precio base: {self.precio_base}")

    def vehiculos_actuales(self):
        if self.año == 2025:
            self.mostrar_info()


class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Número de puertas: {self.num_puertas}")
        print(f"Tipo de combustible: {self.tipo_combustible}")

    def mostrar_4_puertas(self):
        if self.num_puertas > 4:
            self.mostrar_info()


class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self.cilindrada}")
        print(f"Tipo de motor: {self.tipo_motor}")


coche = Coche("Toyota", "Corolla", 2025, 25000, 4, "Gasolina")
moto = Moto("Yamaha", "R1", 2024, 18000, 1000, "Gasolina")

print("Información del Coche:")
coche.mostrar_info()

print("\nInformación de la Moto:")
moto.mostrar_info()
class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self.__marca = marca
        self.__modelo = modelo
        self.__año = año
        self.__precio_base = precio_base

    def get_marca(self):
        return self.__marca

    def get_modelo(self):
        return self.__modelo

    def get_año(self):
        return self.__año

    def get_precio_base(self):
        return self.__precio_base

    def set_marca(self, marca):
        self.__marca = marca

    def set_modelo(self, modelo):
        self.__modelo = modelo

    def set_año(self, año):
        self.__año = año

    def set_precio_base(self, precio_base):
        self.__precio_base = precio_base

    def mostrar_info(self):
        print(f"Marca: {self.__marca}, Modelo: {self.__modelo}, Año: {self.__año}, Precio Base: {self.__precio_base}")


class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.__num_puertas = num_puertas
        self.__tipo_combustible = tipo_combustible

    def get_num_puertas(self):
        return self.__num_puertas

    def get_tipo_combustible(self):
        return self.__tipo_combustible

    def set_num_puertas(self, num_puertas):
        self.__num_puertas = num_puertas

    def set_tipo_combustible(self, tipo_combustible):
        self.__tipo_combustible = tipo_combustible

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Número de puertas: {self.__num_puertas}, Tipo de combustible: {self.__tipo_combustible}")


class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.__cilindrada = cilindrada
        self.__tipo_motor = tipo_motor

    def get_cilindrada(self):
        return self.__cilindrada

    def get_tipo_motor(self):
        return self.__tipo_motor

    def set_cilindrada(self, cilindrada):
        self.__cilindrada = cilindrada

    def set_tipo_motor(self, tipo_motor):
        self.__tipo_motor = tipo_motor

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self.__cilindrada}, Tipo de motor: {self.__tipo_motor}")

coche1 = Coche("Toyota", "Corolla", 2025, 20000, 4, "Gasolina")
coche2 = Coche("Ford", "Mondeo", 2025, 25000, 5, "Diésel")
coche3 = Coche("Honda", "Civic", 2024, 22000, 2, "Híbrido")
moto1 = Moto("Yamaha", "MT-07", 2025, 9000, 689, "4T")
moto2 = Moto("Suzuki", "GSX-R600", 2023, 11000, 599, "4T")

print("-------Información de coches:-------")
coche1.mostrar_info()
print()
coche2.mostrar_info()
print()
coche3.mostrar_info()
print("-------Información de motos:-------")
moto1.mostrar_info()
print()
moto2.mostrar_info()

print("-------Coches con más de 4 puertas:-------")
coches = [coche1, coche2, coche3]
for coche in coches:
    if coche.get_num_puertas() > 4:
        coche.mostrar_info()
        print()

print("-------Vehículos gestión 2025:-------")
vehiculos = coches + [moto1, moto2]
for v in vehiculos:
    if v.get_año() == 2025:
        v.mostrar_info()
        print()
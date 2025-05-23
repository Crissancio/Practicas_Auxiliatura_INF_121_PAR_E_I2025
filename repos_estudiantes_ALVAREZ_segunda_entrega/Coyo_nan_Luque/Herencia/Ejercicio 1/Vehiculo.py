class Vehiculo:
    def __init__(self, marca, modelo, anio, precio_base):
        self._marca = marca
        self._modelo = modelo
        self._anio = anio
        self._precio_base = precio_base

    def get_marca(self):
        return self._marca

    def set_marca(self, marca):
        self._marca = marca

    def get_modelo(self):
        return self._modelo

    def set_modelo(self, modelo):
        self._modelo = modelo

    def get_anio(self):
        return self._anio

    def set_anio(self, anio):
        self._anio = anio

    def get_precio_base(self):
        return self._precio_base

    def set_precio_base(self, precio_base):
        self._precio_base = precio_base

    def mostrar_info(self):
        return f"Marca: {self._marca}, Modelo: {self._modelo}, Anio: {self._anio}, Precio Base: {self._precio_base} Bs"

    def mostrar_Anio2025(vehiculos):
        print("\nVehiculos anio 2025:")
        for vehiculo in vehiculos:
            if vehiculo.get_anio() == 2025:
                print(vehiculo.mostrar_info())


class Coche(Vehiculo):
    def __init__(self, marca, modelo, anio, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, anio, precio_base)
        self._num_puertas = num_puertas
        self._tipo_combustible = tipo_combustible

    def get_num_puertas(self):
        return self._num_puertas

    def set_num_puertas(self, num_puertas):
        self._num_puertas = num_puertas

    def get_tipo_combustible(self):
        return self._tipo_combustible

    def set_tipo_combustible(self, tipo_combustible):
        self._tipo_combustible = tipo_combustible

    def mostrar_info(self):
        return f"{super().mostrar_info()}, Nro de puertas: {self._num_puertas}, Tipo de combustible: {self._tipo_combustible}"

    @staticmethod
    def mostrar_CuatroPuertas(coches):
        print("\nCoches con mas de 4 puertas:")
        for coche in coches:
            if coche.get_num_puertas() > 4:
                print(coche.mostrar_info())


class Moto(Vehiculo):
    def __init__(self, marca, modelo, anio, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, anio, precio_base)
        self._cilindrada = cilindrada
        self._tipo_motor = tipo_motor

    def get_cilindrada(self):
        return self._cilindrada

    def set_cilindrada(self, cilindrada):
        self._cilindrada = cilindrada

    def get_tipo_motor(self):
        return self._tipo_motor

    def set_tipo_motor(self, tipo_motor):
        self._tipo_motor = tipo_motor

    def mostrar_info(self):
        return f"{super().mostrar_info()}, Cilindrada: {self._cilindrada}cc, Tipo de motor: {self._tipo_motor}"



coche1 = Coche("Toyota", "V69", 2021, 25000.0, 4, "Gasolina")
coche2 = Coche("Chevrolet", "C24", 2025, 28000.0, 5, "Electrico")
coche3 = Coche("Lamborghini", "M21", 2022, 35000.0, 5, "Gasolina")
coche4 = Coche("Susuki", "TC-21", 2025, 27000.0, 4, "Diesel")

moto1 = Moto("Scooter", "MD23", 2025, 8000.0, 452, "MonoCilindrico")
moto2 = Moto("Honda", "BT32", 2020, 7000.0, 562, "Bicilindrico")
moto3 = Moto("Ducatti", "Ninja 400", 2024, 6000.0, 419, "Tricilindrico")

print("Info Coches:")
print(coche1.mostrar_info())
print(coche2.mostrar_info())
print(coche3.mostrar_info())
print(coche4.mostrar_info())

print("\nInfo Motos:")
print(moto1.mostrar_info())
print(moto2.mostrar_info())
print(moto3.mostrar_info())

coches = [coche1, coche2, coche3, coche4]
Coche.mostrar_CuatroPuertas(coches)

vehiculos = [coche1, coche2, coche3, coche4, moto1, moto2, moto3]
Vehiculo.mostrar_Anio2025(vehiculos)

class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self._marca = marca
        self._modelo = modelo
        self._año = año
        self._precio_base = precio_base

    @property
    def marca(self):
        return self._marca

    @property
    def modelo(self):
        return self._marca

    @property
    def año(self):
        return self._año

    @property
    def precio_base(self):
        return self._precio_base

    @marca.setter
    def marca(self, nueva_marca):
        self._marca = nueva_marca

    @modelo.setter
    def modelo(self, nuevo_modelo):
        self._modelo = nuevo_modelo

    @año.setter
    def año(self, nuevo_año):
        self._año = nuevo_año

    @precio_base.setter
    def precio_base(self, nuevo_precio):
        self._precio_base = nuevo_precio

    def mostrar_info(self):
        return f"Marca: {self._marca}, Modelo: {self._modelo}, Año: {self._año}, Precio Base: ${self._precio_base:.2f}"


class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self._num_puertas = num_puertas
        self._tipo_combustible = tipo_combustible

    @property
    def num_puertas(self):
        return self._num_puertas

    @property
    def tipo_combustible(self):
        return self._tipo_combustible

    @num_puertas.setter
    def num_puertas(self, nuevas_puertas):
        self._num_puertas = nuevas_puertas

    @tipo_combustible.setter
    def tipo_combustible(self, nuevo_combustible):
        self._tipo_combustible = nuevo_combustible

    def mostrar_info(self):
        info_base = super().mostrar_info()
        return f"{info_base}, Puertas: {self._num_puertas}, Combustible: {self._tipo_combustible}"


class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self._cilindrada = cilindrada
        self._tipo_motor = tipo_motor

    @property
    def cilindrada(self):
        return self._cilindrada

    @property
    def tipo_motor(self):
        return self._tipo_motor

    @cilindrada.setter
    def cilindrada(self, nueva_cilindrada):
        self._cilindrada = nueva_cilindrada

    @tipo_motor.setter
    def tipo_motor(self, nuevo_tipo_motor):
        self._tipo_motor = nuevo_tipo_motor

    def mostrar_info(self):
        info_base = super().mostrar_info()
        return f"{info_base}, Cilindrada: {self._cilindrada}cc, Motor: {self._tipo_motor}"


coche1 = Coche("Toyota", "Corolla", 2022, 25000, 4, "Gasolina")
coche2 = Coche("Ford", "F-150", 2023, 45000, 2, "Diésel")
coche3 = Coche("Honda", "Civic", 2025, 28000, 5, "Híbrido")

moto1 = Moto("Harley-Davidson", "Sportster", 2021, 12000, 1200, "V-Twin")
moto2 = Moto("Yamaha", "YZF-R1", 2025, 18000, 998, "4 cilindros")

print("\nInformación de todos los vehículos:")
print("Coche 1:", coche1.mostrar_info())
print("Coche 2:", coche2.mostrar_info())
print("Coche 3:", coche3.mostrar_info())
print("Moto 1:", moto1.mostrar_info())
print("Moto 2:", moto2.mostrar_info())

print("\nCoches con más de 4 puertas:")
for coche in [coche1, coche2, coche3]:
    if coche.num_puertas > 4:
        print(coche.mostrar_info())

print("\nVehículos del año actual:")
for vehiculo in [coche1, coche2, coche3, moto1, moto2]:
    if vehiculo.año == 2025:
        print(vehiculo.mostrar_info())
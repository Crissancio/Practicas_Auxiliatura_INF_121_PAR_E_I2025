class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self._marca = marca
        self._modelo = modelo
        self._año = año
        self._precio_base = precio_base

    # Getters
    @property
    def marca(self):
        return self._marca

    @property
    def modelo(self):
        return self._modelo

    @property
    def año(self):
        return self._año

    @property
    def precio_base(self):
        return self._precio_base

    # Setters
    @marca.setter
    def marca(self, value):
        self._marca = value

    @modelo.setter
    def modelo(self, value):
        self._modelo = value

    @año.setter
    def año(self, value):
        self._año = value

    @precio_base.setter
    def precio_base(self, value):
        self._precio_base = value

    def mostrar_info(self):
        return f "Marca: {self.marca}, Modelo: {self.modelo}, Año: {self.año}, Precio base: ${self.precio_base:,.2f}"
class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self._num_puertas = num_puertas
        self._tipo_combustible = tipo_combustible

    @property
    def num_puertas(self):
        return self._num_puertas

    @num_puertas.setter
    def num_puertas(self, value):
        self._num_puertas = value

    @property
    def tipo_combustible(self):
        return self._tipo_combustible

    @tipo_combustible.setter
    def tipo_combustible(self, value):
        self._tipo_combustible = value

    def mostrar_info(self):
        base = super().mostrar_info()
        return f"{base}, Puertas: {self.num_puertas}, Combustible: {self.tipo_combustible}"


class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self._cilindrada = cilindrada
        self._tipo_motor = tipo_motor

    @property
    def cilindrada(self):
        return self._cilindrada

    @cilindrada.setter
    def cilindrada(self, value):
        self._cilindrada = value

    @property
    def tipo_motor(self):
        return self._tipo_motor

    @tipo_motor.setter
    def tipo_motor(self, value):
        self._tipo_motor = value

    def mostrar_info(self):
        base = super().mostrar_info()
        return f"{base}, Cilindrada: {self.cilindrada}cc, Motor: {self.tipo_motor}"


# b) Crear instancias y mostrar su información
vehiculos = [
    Coche("Toyota", "Corolla", 2023, 20000, 4, "Gasolina"),
    Coche("Tesla", "Model S", 2025, 80000, 4, "Eléctrico"),
    Coche("Ford", "Explorer", 2024, 35000, 5, "Gasolina"),
    Moto("Honda", "CBR500R", 2025, 6500, 500, "4T"),
    Moto("Yamaha", "MT-07", 2023, 7700, 689, "4T")
]

print("Información de todas las instancias:")
for v in vehiculos:
    print("-", v.mostrar_info())

# c) Mostrar coches con más de 4 puertas
coches_mas_de_4_puertas = [c for c in vehiculos if isinstance(c, Coche) and c.num_puertas > 4]
print("\nCoches con más de 4 puertas:")
for c in coches_mas_de_4_puertas:
    print("-", c.mostrar_info())

# d) Mostrar los coches y motos del año 2025
actual = 2025
vehiculos_2025 = [v for v in vehiculos if v.año == actual]
print(f"\nVehículos del año {actual}:")
for v in vehiculos_2025:
    print("-", v.mostrar_info())

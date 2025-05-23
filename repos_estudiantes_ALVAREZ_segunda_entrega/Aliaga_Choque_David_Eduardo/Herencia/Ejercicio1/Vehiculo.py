class Vehiculo:
# a) Implementa las clases con sus constructores, getters y setters.
    def __init__(self, marca, modelo, año, precio_base):
        self._marca = marca
        self._modelo = modelo
        self._año = año
        self._precio_base = precio_base

    @property
    def marca(self):
        return self._marca

    @marca.setter
    def marca(self, valor):
        self._marca = valor

    @property
    def modelo(self):
        return self._modelo

    @modelo.setter
    def modelo(self, valor):
        self._modelo = valor

    @property
    def año(self):
        return self._año

    @año.setter
    def año(self, valor):
        self._año = valor

    @property
    def precio_base(self):
        return self._precio_base

    @precio_base.setter
    def precio_base(self, valor):
        self._precio_base = valor

    def mostrar_info(self):
        return f"{self.marca} {self.modelo} - Año: {self.año} - Precio base: ${self.precio_base}"


class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self._num_puertas = num_puertas
        self._tipo_combustible = tipo_combustible

    @property
    def num_puertas(self):
        return self._num_puertas

    @num_puertas.setter
    def num_puertas(self, valor):
        self._num_puertas = valor

    @property
    def tipo_combustible(self):
        return self._tipo_combustible

    @tipo_combustible.setter
    def tipo_combustible(self, valor):
        self._tipo_combustible = valor

    def mostrar_info(self):
        return f"{super().mostrar_info()} - Puertas: {self.num_puertas} - Combustible: {self.tipo_combustible}"


class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self._cilindrada = cilindrada
        self._tipo_motor = tipo_motor

    @property
    def cilindrada(self):
        return self._cilindrada

    @cilindrada.setter
    def cilindrada(self, valor):
        self._cilindrada = valor

    @property
    def tipo_motor(self):
        return self._tipo_motor

    @tipo_motor.setter
    def tipo_motor(self, valor):
        self._tipo_motor = valor

    def mostrar_info(self):
        return f"{super().mostrar_info()} - Cilindrada: {self.cilindrada}cc - Motor: {self.tipo_motor}"


# b) Crea instancias de Coche y Moto y muestra su información usando el método mostrar_info().
if __name__ == "__main__":
    vehiculos = [
        Coche("Toyota", "Corolla", 2022, 20000, 4, "Gasolina"),
        Coche("Ford", "Explorer", 2025, 35000, 5, "Híbrido"),
        Moto("Yamaha", "MT-07", 2025, 7500, 689, "Bicilíndrico"),
        Moto("Honda", "CBR500R", 2021, 7000, 471, "Bicilíndrico")
    ]

    print("Información de vehículos:")
    for v in vehiculos:
        print(v.mostrar_info())

    # c) Muestra todos los coches que tienen más de 4 puertas.
    print("\nCoches con más de 4 puertas:")
    for v in vehiculos:
        if isinstance(v, Coche) and v.num_puertas > 4:
            print(v.mostrar_info())

    # d) Mostrar los coches y motos actuales (gestión 2025)
    print("\nVehículos del año 2025:")
    for v in vehiculos:
        if v.año == 2025:
            print(v.mostrar_info())
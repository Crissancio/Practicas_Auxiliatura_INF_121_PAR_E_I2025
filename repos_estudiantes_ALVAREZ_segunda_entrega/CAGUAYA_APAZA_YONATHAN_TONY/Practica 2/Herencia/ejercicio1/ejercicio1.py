# 1. Modelar diferentes tipos de vehículos. Las clases deben tener las siguientes características:
# Vehículo<marca, modelo, año, precio_base> - Métodos: mostrar_info()
# Coche (hereda de Vehículo)<num_puertas, tipo_combustible> - Métodos: mostrar_info()
# Moto (hereda de Vehículo)<cilindrada, tipo_motor> - Métodos: mostrar_info()
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea instancias de Coche y Moto y muestra su información usando el método mostrar_info().
# c) Muestra todos los coches que tienen más de 4 puertas.
# d) Mostrar los coches y motos actuales (gestión 2025).

class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self.__marca = marca
        self.__modelo = modelo
        self.__año = año
        self.__precio_base = precio_base

    def mostrar_info(self):
        return f"{self.__marca} {self.__modelo} - Año: {self.__año} - Precio: {self.__precio_base}"

    def get_marca(self):
        return self.__marca

    def set_marca(self, marca):
        self.__marca = marca

    def get_modelo(self):
        return self.__modelo

    def set_modelo(self, modelo):
        self.__modelo = modelo

    def get_año(self):
        return self.__año

    def set_año(self, año):
        self.__año = año

    def get_precio_base(self):
        return self.__precio_base

    def set_precio_base(self, precio_base):
        self.__precio_base = precio_base

    def inciso_b(self, vehiculos):
        print("Inciso b) Información de todos los vehículos:")
        for v in vehiculos:
            print(v.mostrar_info())

    def inciso_c(self, vehiculos):
        print("Inciso c) Coches con más de 4 puertas:")
        for v in vehiculos:
            if isinstance(v, Coche) and v.get_num_puertas() > 4:
                print(v.mostrar_info())

    def inciso_d(self, vehiculos):
        print("Inciso d) Vehículos del año 2025:")
        for v in vehiculos:
            if v.get_año() == 2025:
                print(v.mostrar_info())


class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.__num_puertas = num_puertas
        self.__tipo_combustible = tipo_combustible

    def mostrar_info(self):
        return f"{super().mostrar_info()} - Puertas: {self.__num_puertas} - Combustible: {self.__tipo_combustible}"

    def get_num_puertas(self):
        return self.__num_puertas

    def set_num_puertas(self, num_puertas):
        self.__num_puertas = num_puertas

    def get_tipo_combustible(self):
        return self.__tipo_combustible

    def set_tipo_combustible(self, tipo_combustible):
        self.__tipo_combustible = tipo_combustible


class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.__cilindrada = cilindrada
        self.__tipo_motor = tipo_motor

    def mostrar_info(self):
        return f"{super().mostrar_info()} - Cilindrada: {self.__cilindrada}cc - Motor: {self.__tipo_motor}"

    def get_cilindrada(self):
        return self.__cilindrada

    def set_cilindrada(self, cilindrada):
        self.__cilindrada = cilindrada

    def get_tipo_motor(self):
        return self.__tipo_motor

    def set_tipo_motor(self, tipo_motor):
        self.__tipo_motor = tipo_motor

vehiculos = [
    Coche("Toyota", "Yaris", 2025, 18000, 4, "Gasolina"),
    Coche("Ford", "Explorer", 2024, 25000, 5, "Híbrido"),
    Moto("Honda", "CBR500R", 2025, 15000, 471, "4T"),
    Moto("Yamaha", "MT-03", 2023, 12000, 321, "4T")
]

vehiculo_aux = Vehiculo("", "", 0, 0)
vehiculo_aux.inciso_b(vehiculos)
vehiculo_aux.inciso_c(vehiculos)
vehiculo_aux.inciso_d(vehiculos)

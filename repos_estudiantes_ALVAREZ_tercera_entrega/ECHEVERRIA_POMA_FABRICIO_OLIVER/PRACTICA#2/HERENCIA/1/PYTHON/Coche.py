from Vehiculo import Vehiculo

class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combistible):
        super(). __init__(marca, modelo, año, precio_base)
        self.__num_puertas = num_puertas
        self.__tipo_combustible = tipo_combistible
#A
    def get_num_puertas(self):
        return self.__num_puertas
    def set_num_puertas(self, num_puertas):
        self.__num_puertas = num_puertas
    def get_tipo_combustible(self):
        return self.__tipo_combustible
    def set_tipo_combustible(self, tipo_combustible):
        self.__tipo_combustible = tipo_combustible
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Numero de puertas: {self.__num_puertas}, Tipo de combustible: {self.__tipo_combustible}")
        
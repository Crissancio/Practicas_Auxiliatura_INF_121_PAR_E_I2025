class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self.__marca = marca
        self.__modelo = modelo
        self.__año = año
        self.__precio_base = precio_base
#A
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
    def mostrar_info(self):
        return f"Marca: {self.__marca}, Modelo: {self.__modelo}, Año: {self.__año}, Precio base: {self.__precio_base}"
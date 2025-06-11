from Vehiculo import Vehiculo

class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.__cilindrada = cilindrada
        self.__tipo_motor = tipo_motor
#A
    def get_cilindrada(self):
        return self.__cilindrada
    def set_cilindrada(self, cilindrada):
        self.__cilindrada = cilindrada
    def get_tipo_motor(self):
        return self.__tipo_motor
    def set_tipo_motor(self, tipo_motor):
        self.__tipo_motor = tipo_motor
    
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Cilindrada: {self.__cilindrada}, Tipo de motor: {self.__tipo_motor}")
        

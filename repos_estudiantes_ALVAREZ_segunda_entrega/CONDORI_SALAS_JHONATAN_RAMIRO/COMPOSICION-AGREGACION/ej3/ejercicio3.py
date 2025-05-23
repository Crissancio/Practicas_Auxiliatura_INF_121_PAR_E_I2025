class Motor:
    def __init__(self, tipo):
        self.__tipo = tipo
    def get_tipo(self):
        return self.__tipo
    def set_tipo(self, tipo):
        self.__tipo = tipo
    def mostrar_info(self):
        print(f"Motor: Tipo {self.__tipo}")
class Ala:
    def __init__(self, longitud):
        self.__longitud = longitud
    def get_longitud(self):
        return self.__longitud
    def set_longitud(self, longitud):
        self.__longitud = longitud
    def mostrar_info(self):
        print(f"Ala: Longitud {self.__longitud} metros")
class TrenAterrizaje:
    def __init__(self, tipo):
        self.__tipo = tipo
    def get_tipo(self):
        return self.__tipo
    def set_tipo(self, tipo):
        self.__tipo = tipo
    def mostrar_info(self):
        print(f"Tren de Aterrizaje: Tipo {self.__tipo}")
class Avion:
    def __init__(self, modelo, motor, alas, tren):
        self.__modelo = modelo
        self.__motor = motor
        self.__alas = alas
        self.__tren = tren
    def get_modelo(self):
        return self.__modelo
    def set_modelo(self, modelo):
        self.__modelo = modelo
    def mostrar_info(self):
        print(f"Avión Modelo: {self.__modelo}")
        self.__motor.mostrar_info()
        for i, ala in enumerate(self.__alas):
            print(f"Ala {i + 1}:")
            ala.mostrar_info()
        self.__tren.mostrar_info()

motor1 = Motor("Turbofan")
ala1 = Ala(20)
ala2 = Ala(20)
tren1 = TrenAterrizaje("Retráctil")
avion1 = Avion("Boeing 737", motor1, [ala1, ala2], tren1)
avion1.mostrar_info()

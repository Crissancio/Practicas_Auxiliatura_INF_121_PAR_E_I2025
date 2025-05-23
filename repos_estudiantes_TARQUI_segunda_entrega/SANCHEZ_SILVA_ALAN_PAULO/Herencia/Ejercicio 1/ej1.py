#a)
class Vehiculo:
    def __init__(self,marca , modelo , año, precio_base):
        self.__marca = marca
        self.__modelo = modelo
        self.__año = año
        self.__precio_base = precio_base
        
    def mostrar_info(self):
            print(f"""
                -------Vechiculo-----\n
                Marca:{self.__marca}\n
                Modelo: {self.__modelo}\n
                Año:{self.__año}\n
                Precio base: {self.__precio_base}
                """)
    
    def getMarca(self):
        return self.__marca
    def setMarca(self,marca):
        self.__marca = marca
        
    def getModelo(self):
        return self.__modelo
    def setModelo(self, modelo):
        self.__modelo = modelo
        
    def getAño(self):
        return self.__año
    def setAño(self, año):
        self.__año = año
        
    def getPrecioBase(self):
        return self.__precio_base
    def setPrecioBase(self, precio_base):
        self.__precio_base = precio_base

class Coche (Vehiculo):
    def __init__(self,marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca,modelo,año,precio_base)
        self.__num_puertas = num_puertas
        self.__tipo_combustible = tipo_combustible
        
    def mostrar_info(self):
        super().mostrar_info()
        print(f"""  
                -----Coche-----\n
            Número de puertas: {self.__num_puertas} \n
            Tipo: de combustible {self.__tipo_combustible}
            """)
        
    def getNumPuertas(self):
        return self.__num_puertas
    def setNumPuertas(self, numP):
        self.__num_puertas = numP
    
    def getTipoCombustible(self):
        return self.__tipo_combustible
    def setTipo(self,tipo_combustible):
        self.__tipo_combustible = tipo_combustible
        
class Moto(Vehiculo):
    def __init__(self, marca, modelo,año,precio_base, cilindrada, tipo_motor):
            super().__init__(marca,modelo,año,precio_base)
            self.__cilindrada = cilindrada
            self.__tipo_motor = tipo_motor
        
    def mostrar_info(self):
        super().mostrar_info()
        print(f"""
                -----Moto-------\n
                Cilindrada = {self.__cilindrada}\n
                Tipo de motor = {self.__tipo_motor}
            """)
    
    def getCilindrada(self):
        return self.__cilindrada
    def setCilindrada(self,cilindrada):
        self.__cilindrada = cilindrada
        
    def getTipoMotor(self):
        return self.__tipo_motor
    def setTipoMotor(self, tipo_motor):
        self,tipo_motor = tipo_motor
        
#Main
#b)
skyline = Coche("Nissan", "Skyline" , 1966, 400000.50, 2, "diesel")
audi_1 = Coche("Audi", "Audi_1",2025,23000.40,4, "diesel")
limousine = Coche("Lincoln", "Town Car Strech Limousine",2011, 35000, 6, "gasolina")

ninja = Moto("Kawasaki", "Ninja", 1984, 30000.90, 649, "bicilindrico")
street = Moto("Harley-Davison", "Street Glide Special", 2025, 27000,1868,"Milwaukee")
mt_09 = Moto("Yamaha", "MT-09" , 2023, 63000, 890, "tricilindrico")

print("Informacion de los vehiculos::")
skyline.mostrar_info()
ninja.mostrar_info()

# c)
print("Coches con más de 4 puertas :")
coches = [skyline, audi_1, limousine]
for _ in coches:
    if _.getNumPuertas() >  4:
        _.mostrar_info()
#d)
print("Vehiculos del 2025:")
vehiculos = [skyline, audi_1, limousine, ninja, street, mt_09]
for vehiculo in vehiculos:
    if  vehiculo.getAño() == 2025:
        vehiculo.mostrar_info()
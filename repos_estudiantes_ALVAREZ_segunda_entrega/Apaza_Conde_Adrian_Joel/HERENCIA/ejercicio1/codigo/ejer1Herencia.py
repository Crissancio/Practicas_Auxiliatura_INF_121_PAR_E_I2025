"""
1. Modelar diferentes tipos de vehículos. Las clases deben tener las siguientes 
características:
Vehículo<marca, modelo, año, precio_base>
Métodos: mostrar_info() muestra la información básica del vehículo
Coche (hereda de Vehículo)< num_puertas, tipo_combustible>
Métodos: mostrar_info() debe mostrar la información básica más los 
atributos adicionales
Moto (hereda de Vehículo)< cilindrada, tipo_motor>
Métodos: mostrar_info() debe mostrar la información básica más los 
atributos adicionales
a) Implementa las clases con sus constructores, getters y setters. 
b) Crea instancias de Coche y Moto y muestra su información usando el 
método mostrar_info().
c) Muestra todos los coches que tienen más de 4 puertas.
d) Mostrar los coches y motos actuales (gestión 2025)
"""


# a) codificar la clase con getters y setters
class Vehiculo:
    def __init__(self, m, mo, a, p):
        self._marca = m
        self._modelo = mo
        self._año = a
        self._precio_base = p
    
    def getMarca(self):
        return self._marca

    def setMarca(self, m):
        self._marca = m

    def getModelo(self):
        return self._modelo

    def setModelo(self, mo):
        self._modelo = mo

    def getAño(self):
        return self._año

    def setAño(self, a):
        self._año = a

    def getPrecioBase(self):
        return self._precio_base

    def setPrecioBase(self, p):
        self._precio_base = p
        
    def mostrar_Info(self):
        print("marca: " + self._marca + ", modelo: " + self._modelo + ", año: " + str(self._año) + ", precio base: " + str(self._precio_base))


class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, n, t):
        super().__init__(marca, modelo, año, precio_base)
        self._num_puertas = n
        self._tipo_combustible = t
    
    def getNumPuertas(self):
        return self._num_puertas

    def setNumPuertas(self, n):
        self._num_puertas = n

    def getTipoCombustible(self):
        return self._tipo_combustible

    def setTipoCombustible(self, t):
        self._tipo_combustible = t
        
    def mostrar_Info(self):
        super().mostrar_Info()
        print("Número de puertas: " + str(self._num_puertas))
        print("Tipo de combustible: " + self._tipo_combustible)
    
    @staticmethod
    def mostrarCochemas4puertas(c, x):
        for i in range(x):
            if c[i].getNumPuertas() > 4:
                c[i].mostrar_Info()
    
    @staticmethod
    def cocheactual2025(c, y):
        for i in range(y):
            if c[i].getAño() >= 2021:
                c[i].mostrar_Info()


class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, c, t):
        super().__init__(marca, modelo, año, precio_base)
        self._cilindrada = c
        self._tipo_motor = t
    
    def getCilindrada(self):
        return self._cilindrada

    def setCilindrada(self, c):
        self._cilindrada = c

    def getTipoMotor(self):
        return self._tipo_motor

    def setTipoMotor(self, t):
        self._tipo_motor = t
        
    def mostrar_Info(self):
        super().mostrar_Info()
        print("Cilindrada: " + str(self._cilindrada))
        print("Tipo de motor: " + self._tipo_motor)
    
    @staticmethod
    def motoactual2025(m, c):
        for i in range(c):
            if m[i].getAño() >= 2021:
                m[i].mostrar_Info()


# Main
if __name__ == "__main__":
    coches = []
    motos = []
    
    # b) Crear instancias de Coche y Moto y mostrar su información
    coches.append(Coche("Toyota", "Corolla", 2020, 25000, 4, "Gasolina"))
    coches.append(Coche("Ford", "Fiesta", 2021, 18000, 2, "Diésel"))
    coches.append(Coche("Volkswagen", "Passat", 2022, 32000, 5, "Híbrido"))
    
    motos.append(Moto("Honda", "CBR600", 2021, 12000, 600, "4 tiempos"))
    motos.append(Moto("Yamaha", "MT-07", 2022, 8500, 700, "2 tiempos"))
    
    for coche in coches:
        coche.mostrar_Info()
    
    for moto in motos:
        moto.mostrar_Info()
    
    print("__________________")
    # c) Mostrar coches con más de 4 puertas
    Coche.mostrarCochemas4puertas(coches, len(coches))
    print("__________________")
    # d) Mostrar vehículos actuales (2025)
    Coche.cocheactual2025(coches, len(coches))
    Moto.motoactual2025(motos, len(motos))

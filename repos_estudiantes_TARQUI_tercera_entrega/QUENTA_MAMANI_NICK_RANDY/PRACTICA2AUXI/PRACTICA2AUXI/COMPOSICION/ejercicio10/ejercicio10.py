# 10. Crea un POO para una flota de vehículos y sus conductores. La flota contiene
# vehículos y conductores, pero los vehículos y conductores pueden existir
# independientemente de la flota.
# Vehículo<marca, modelo, año>
# Métodos: mostrar_info() (muestra la información básica del vehículo)
# Conductor<nombre, licencia>
# Métodos: mostrar_info() (muestra el nombre y la licencia del conductor)
# Flota<vehículos (lista de objetos de tipo Vehículo), conductores (lista de
# objetos de tipo Conductor)>
# Métodos: agregar_vehículo(vehículo), agregar_conductor(conductor), mostrar_f
# lota() (muestra la información de todos los vehículos y conductores en la flota)
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea una flota y agrega varios vehículos y conductores.
# c) Muestra la información de la flota, sus vehículos y conductores.
class Vehiculo:
    def __init__(self, marca, modelo, año): 
        self.marca, self.modelo, self.año = marca, modelo, año
    def mostrar_info(self): 
        print(f"{self.marca} {self.modelo} - {self.año}")

class Conductor:
    def __init__(self, nombre, licencia): 
        self.nombre, self.licencia = nombre, licencia
    def mostrar_info(self): 
        print(f"{self.nombre} - Licencia: {self.licencia}")

class Flota:
    def __init__(self): 
        self.vehiculos, self.conductores = [], []
    def agregar_vehiculo(self, vehiculo): 
        self.vehiculos.append(vehiculo)
    def agregar_conductor(self, conductor): 
        self.conductores.append(conductor)
    def mostrar_flota(self):
        print("Vehículos:")
        for v in self.vehiculos: 
            v.mostrar_info()
        print("Conductores:")
        for c in self.conductores: 
            c.mostrar_info()

flota = Flota()
flota.agregar_vehiculo(Vehiculo("Toyota", "Hilux", 2022))
flota.agregar_conductor(Conductor("Luis", "B123456"))
flota.mostrar_flota()

class Vehiculo:
    def __init__(self, marca, modelo, anio, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.anio = anio
        self.precio_base = precio_base

    def get_marca(self):
        return self.marca

    def get_modelo(self):
        return self.modelo

    def get_anio(self):
        return self.anio

    def get_precio_base(self):
        return self.precio_base

    def set_marca(self, marca):
        self.marca = marca

    def set_modelo(self, modelo):
        self.modelo = modelo

    def set_anio(self, anio):
        self.anio = anio

    def set_precio_base(self, precio_base):
        self.precio_base = precio_base

    def mostrar_informacion(self):
        print("Marca:", self.marca)
        print("Modelo:", self.modelo)
        print("Año:", self.anio)
        print("Precio Base:", self.precio_base)


##################################################################################

class Coche(Vehiculo):
    def __init__(self, marca, modelo, anio, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, anio, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def get_num_puertas(self):
        return self.num_puertas

    def get_tipo_combustible(self):
        return self.tipo_combustible

    def set_num_puertas(self, num_puertas):
        self.num_puertas = num_puertas

    def set_tipo_combustible(self, tipo_combustible):
        self.tipo_combustible = tipo_combustible

    def mostrar_informacion(self):
        super().mostrar_informacion()
        print("Número de puertas:", self.num_puertas)
        print("Tipo de combustible:", self.tipo_combustible)


##################################################################################

class Moto(Vehiculo):
    def __init__(self, marca, modelo, anio, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, anio, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def get_cilindrada(self):
        return self.cilindrada

    def get_tipo_motor(self):
        return self.tipo_motor

    def set_cilindrada(self, cilindrada):
        self.cilindrada = cilindrada

    def set_tipo_motor(self, tipo_motor):
        self.tipo_motor = tipo_motor

    def mostrar_informacion(self):
        super().mostrar_informacion()
        print("Cilindrada:", self.cilindrada)
        print("Tipo de motor:", self.tipo_motor)


#################################################################################

def coches_con_mas_de_4_puertas(vehiculos):
    for vehiculo in vehiculos:
        if isinstance(vehiculo, Coche):
            if vehiculo.get_num_puertas() >= 4:
                vehiculo.mostrar_informacion()

def vehicuos_actuales(vehiculos):
    for vehiculo in vehiculos:
        if vehiculo.get_anio() >= 2020:
            vehiculo.mostrar_informacion()

#################################################################################

if __name__ == "__main__": 
    coche = Coche("Toyota", "Corolla", 2020, 25000, 4, "Gasolina")
    coche2 = Coche("Honda", "Civic", 2019, 23000, 4, "Gasolina")
    moto = Moto("Yamaha", "YZF-R3", 2021, 6000, 321, "4T")
    moto2 = Moto("Kawasaki", "Ninja 400", 2020, 5000, 399, "4T")

    vehiculos = [coche, coche2, moto, moto2]

    print("Información de todos los vehículos:")
    for vehiculo in vehiculos:
        vehiculo.mostrar_informacion()
        print("")

    print("Coches con más de 4 puertas:")
    coches_con_mas_de_4_puertas(vehiculos)
    print("")

    print("Vehículos actuales:")
    vehicuos_actuales(vehiculos)
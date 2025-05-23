
# a) Clases con constructores, getters y setters
class Vehiculo:
    def __init__(self, marca, modelo, año, precio_base):
        self.marca = marca
        self.modelo = modelo
        self.año = año
        self.precio_base = precio_base

    def mostrar_info(self):
        return f"Marca: {self.marca}, Modelo: {self.modelo}, Año: {self.año}, Precio Base: ${self.precio_base}"

    # Getters y Setters
    def get_marca(self):
        return self.marca
    def set_marca(self, marca):
        self.marca = marca

    def get_modelo(self):
        return self.modelo
    def set_modelo(self, modelo):
        self.modelo = modelo

    def get_año(self):
        return self.año
    def set_año(self, año):
        self.año = año

    def get_precio_base(self):
        return self.precio_base
    def set_precio_base(self, precio_base):
        self.precio_base = precio_base


class Coche(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, año, precio_base)
        self.num_puertas = num_puertas
        self.tipo_combustible = tipo_combustible

    def mostrar_info(self):
        return super().mostrar_info() + f", Puertas: {self.num_puertas}, Combustible: {self.tipo_combustible}"

    def get_num_puertas(self):
        return self.num_puertas
    def set_num_puertas(self, num_puertas):
        self.num_puertas = num_puertas

    def get_tipo_combustible(self):
        return self.tipo_combustible
    def set_tipo_combustible(self, tipo_combustible):
        self.tipo_combustible = tipo_combustible


class Moto(Vehiculo):
    def __init__(self, marca, modelo, año, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, año, precio_base)
        self.cilindrada = cilindrada
        self.tipo_motor = tipo_motor

    def mostrar_info(self):
        return super().mostrar_info() + f", Cilindrada: {self.cilindrada}cc, Motor: {self.tipo_motor}"

    def get_cilindrada(self):
        return self.cilindrada
    def set_cilindrada(self, cilindrada):
        self.cilindrada = cilindrada

    def get_tipo_motor(self):
        return self.tipo_motor
    def set_tipo_motor(self, tipo_motor):
        self.tipo_motor = tipo_motor

# b) Crear instancias y mostrar información
coche1 = Coche("Toyota", "Corolla", 2025, 23000, 4, "Gasolina")
coche2 = Coche("Ford", "Explorer", 2025, 32000, 5, "Diésel")
moto1 = Moto("Yamaha", "R3", 2025, 8000, 321, "4T")
moto2 = Moto("Honda", "CBR500R", 2024, 9500, 500, "4T")

# Mostrar info
print(coche1.mostrar_info())
print(coche2.mostrar_info())
print(moto1.mostrar_info())
print(moto2.mostrar_info())

# c) Mostrar coches con más de 4 puertas
coches = [coche1, coche2]
print("\nCoches con más de 4 puertas:")
for coche in coches:
    if coche.get_num_puertas() > 4:
        print(coche.mostrar_info())

# Mostrar coches y motos actuales (año 2025)

vehiculos = coches + [moto1, moto2]
print("\nVehículos del año 2025:")
for v in vehiculos:
    if v.get_año() == 2025:
        print(v.mostrar_info())
        

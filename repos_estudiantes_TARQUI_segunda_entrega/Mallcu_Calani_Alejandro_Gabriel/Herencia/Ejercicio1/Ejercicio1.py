from datetime import datetime

class Vehiculo:
    def __init__(self, marca, modelo, anio, precio_base):
        self._marca = marca
        self._modelo = modelo
        self._anio = anio
        self._precio_base = precio_base

    # Getters
    def get_marca(self):
        return self._marca

    def get_modelo(self):
        return self._modelo

    def get_anio(self):
        return self._anio

    def get_precio_base(self):
        return self._precio_base

    # Setters
    def set_marca(self, marca):
        self._marca = marca

    def set_modelo(self, modelo):
        self._modelo = modelo

    def set_anio(self, anio):
        self._anio = anio

    def set_precio_base(self, precio_base):
        self._precio_base = precio_base

    def mostrar_info(self):
        return (f"Marca: {self._marca}, Modelo: {self._modelo}, Año: {self._anio}, "
                f"Precio Base: ${self._precio_base:,.2f}")

class Coche(Vehiculo):
    def __init__(self, marca, modelo, anio, precio_base, num_puertas, tipo_combustible):
        super().__init__(marca, modelo, anio, precio_base)
        self._num_puertas = num_puertas
        self._tipo_combustible = tipo_combustible

    # Getters
    def get_num_puertas(self):
        return self._num_puertas

    def get_tipo_combustible(self):
        return self._tipo_combustible

    # Setters
    def set_num_puertas(self, num_puertas):
        self._num_puertas = num_puertas

    def set_tipo_combustible(self, tipo_combustible):
        self._tipo_combustible = tipo_combustible

    def mostrar_info(self):
        info_base = super().mostrar_info()
        return (f"{info_base}, Número de Puertas: {self._num_puertas}, "
                f"Tipo de Combustible: {self._tipo_combustible}")

class Moto(Vehiculo):
    def __init__(self, marca, modelo, anio, precio_base, cilindrada, tipo_motor):
        super().__init__(marca, modelo, anio, precio_base)
        self._cilindrada = cilindrada
        self._tipo_motor = tipo_motor

    # Getters
    def get_cilindrada(self):
        return self._cilindrada

    def get_tipo_motor(self):
        return self._tipo_motor

    # Setters
    def set_cilindrada(self, cilindrada):
        self._cilindrada = cilindrada

    def set_tipo_motor(self, tipo_motor):
        self._tipo_motor = tipo_motor

    def mostrar_info(self):
        info_base = super().mostrar_info()
        return (f"{info_base}, Cilindrada: {self._cilindrada}cc, "
                f"Tipo de Motor: {self._tipo_motor}")

# --- Implementación y pruebas ---
print("--- a) Implementa las clases con sus constructores, getters y setters ---")
print("Clases Vehiculo, Coche y Moto implementadas.\n")

# --- b) Crea instancias de Coche y Moto y muestra su información usando el método mostrar_info(). ---
print("--- b) Creación de instancias y muestra de información ---")
coche1 = Coche("Toyota", "Corolla", 2023, 20000, 4, "Gasolina")
coche2 = Coche("Honda", "Civic", 2025, 22000, 5, "Gasolina")
coche3 = Coche("Ford", "Mustang", 2024, 45000, 2, "Gasolina")
coche4 = Coche("Tesla", "Model S", 2025, 75000, 5, "Eléctrico")


moto1 = Moto("Yamaha", "MT-07", 2022, 8000, 689, "Bicilíndrico")
moto2 = Moto("Honda", "CBR500R", 2025, 7000, 471, "Bicilíndrico en paralelo")
moto3 = Moto("Kawasaki", "Ninja 400", 2025, 5500, 399, "Bicilíndrico en paralelo")


print("Información de los vehículos creados:")
print(f"Coche 1: {coche1.mostrar_info()}")
print(f"Coche 2: {coche2.mostrar_info()}")
print(f"Coche 3: {coche3.mostrar_info()}")
print(f"Coche 4: {coche4.mostrar_info()}")
print(f"Moto 1: {moto1.mostrar_info()}")
print(f"Moto 2: {moto2.mostrar_info()}")
print(f"Moto 3: {moto3.mostrar_info()}\n")

# Lista de todos los vehículos para facilitar las búsquedas
lista_vehiculos = [coche1, coche2, coche3, coche4, moto1, moto2, moto3]

# --- c) Muestra todos los coches que tienen más de 4 puertas. ---
print("--- c) Coches con más de 4 puertas ---")
coches_mas_4_puertas = []
for vehiculo in lista_vehiculos:
    if isinstance(vehiculo, Coche) and vehiculo.get_num_puertas() > 4:
        coches_mas_4_puertas.append(vehiculo)

if coches_mas_4_puertas:
    for coche in coches_mas_4_puertas:
        print(coche.mostrar_info())
else:
    print("No hay coches con más de 4 puertas.")
print("")

# --- d) Mostrar los coches y motos actuales (gestión 2025) ---
print("--- d) Coches y motos del año 2025 ---")
anio_actual = 2025 # Como se indica en la imagen "gestión 2025"

vehiculos_2025 = []
for vehiculo in lista_vehiculos:
    if vehiculo.get_anio() == anio_actual:
        vehiculos_2025.append(vehiculo)

if vehiculos_2025:
    print(f"Vehículos del año {anio_actual}:")
    for vehiculo in vehiculos_2025:
        print(vehiculo.mostrar_info())
else:
    print(f"No hay vehículos registrados del año {anio_actual}.")

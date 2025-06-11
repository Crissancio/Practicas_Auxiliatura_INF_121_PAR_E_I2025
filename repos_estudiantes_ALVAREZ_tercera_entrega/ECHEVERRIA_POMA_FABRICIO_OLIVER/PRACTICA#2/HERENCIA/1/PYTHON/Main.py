'''
-------------------EJERCICIO 1

Modelar diferentes tipos de vehículos. Las clases deben tener las siguientes
características:
Vehículo&lt;marca, modelo, año, precio_base&gt;
Métodos: mostrar_info() muestra la información básica del vehículo
Coche (hereda de Vehículo)&lt; num_puertas, tipo_combustible&gt;
Métodos: mostrar_info() debe mostrar la información básica más los
atributos adicionales
Moto (hereda de Vehículo)&lt; cilindrada, tipo_motor&gt;
Métodos: mostrar_info() debe mostrar la información básica más los
atributos adicionales
a) Implementa las clases con sus constructores, getters y setters.
b) Crea instancias de Coche y Moto y muestra su información usando el
método mostrar_info().
c) Muestra todos los coches que tienen más de 4 puertas.
d) Mostrar los coches y motos actuales (gestión 2025)

'''

from Coche import Coche
from Moto import Moto
#B
coche1 = Coche("Tesla", "Model S", 2022, 79999, 4, "Electrico")
coche2 = Coche("Ford", "Mustang", 2021, 55999, 2, "Gasolina")
moto1 = Moto("Honda", "123" , 2020, 15000, 125, "2T")
moto2 = Moto("Yamaha", "456", 2021, 20000, 250, "4T")
print("-----------------")
#B
print("Informacion de los vehiculos:")
coche1.mostrar_info()
coche2.mostrar_info()
moto1.mostrar_info()
moto2.mostrar_info()
print("-----------------")
#C
print("Coches con mas de 4 puertas:")
vehiculos = [coche1, coche2, moto1, moto2]
for vehiculo in vehiculos:
    if isinstance(vehiculo, Coche) and vehiculo.get_num_puertas() > 4:
        vehiculo.mostrar_info()
print("-----------------")
#D
print("Vehiculos actuales - gestion 2025: ")
for vehiculo in vehiculos:
    if isinstance(vehiculo, Coche) or isinstance(vehiculo, Moto):
        if vehiculo.get_año() >= 2021:
            vehiculo.mostrar_info()
            

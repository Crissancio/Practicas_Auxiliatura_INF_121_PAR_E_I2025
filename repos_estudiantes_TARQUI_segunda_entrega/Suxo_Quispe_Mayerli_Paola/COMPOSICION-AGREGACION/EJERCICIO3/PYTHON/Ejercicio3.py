class Parte:
    def __init__(self, nombre="Sin Nombre", peso=0.0):
        self._nombre = nombre
        self._peso = peso

    # Getters
    def get_nombre(self):
        return self._nombre

    def get_peso(self):
        return self._peso

    # Setters
    def set_nombre(self, nombre):
        self._nombre = nombre

    def set_peso(self, peso):
        self._peso = peso

    def mostrar_info(self):
        print(f"    Nombre: {self._nombre}, Peso: {self._peso} kg")

class Avion:
    def __init__(self, modelo="Sin Modelo", fabricante="Sin Fabricante"):
        self._modelo = modelo
        self._fabricante = fabricante
        self._partes = []

    # Getters
    def get_modelo(self):
        return self._modelo

    def get_fabricante(self):
        return self._fabricante

    def get_partes(self):
        return self._partes

    # Setters
    def set_modelo(self, modelo):
        self._modelo = modelo

    def set_fabricante(self, fabricante):
        self._fabricante = fabricante

    def agregar_parte(self, parte):
        if isinstance(parte, Parte):
            self._partes.append(parte)
        else:
            print("Error: Solo se pueden agregar objetos de tipo Parte.")

    def mostrar_avion(self):
        print(f"Modelo: {self._modelo}")
        print(f"Fabricante: {self._fabricante}")
        print("Partes:")
        for parte in self._partes:
            parte.mostrar_info()

# b) Crea un avión y agrega varias partes.
mi_avion = Avion(modelo="Boeing 747", fabricante="Boeing")

motor_izquierdo = Parte(nombre="Motor Izquierdo", peso=4500.0)
motor_derecho = Parte(nombre="Motor Derecho", peso=4500.0)
ala_izquierda = Parte(nombre="Ala Izquierda", peso=6000.0)
ala_derecha = Parte(nombre="Ala Derecha", peso=6000.0)
tren_aterrizaje_principal = Parte(nombre="Tren de Aterrizaje Principal", peso=2500.0)
tren_aterrizaje_nariz = Parte(nombre="Tren de Aterrizaje de Nariz", peso=1000.0)

mi_avion.agregar_parte(motor_izquierdo)
mi_avion.agregar_parte(motor_derecho)
mi_avion.agregar_parte(ala_izquierda)
mi_avion.agregar_parte(ala_derecha)
mi_avion.agregar_parte(tren_aterrizaje_principal)
mi_avion.agregar_parte(tren_aterrizaje_nariz)

# Intentando agregar un objeto de tipo incorrecto (esto mostrará el error)
# mi_avion.agregar_parte("Esto no es una parte")

# c) Muestra la información del avión y sus partes.
print("\n--- Información del Avión ---")
mi_avion.mostrar_avion()

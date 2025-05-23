#3. Crea un POO de clases para modelar un avión y sus partes. El avión está
#compuesto por partes como el motor, las alas y el tren de aterrizaje. Si el avión
#se destruye, las partes también se destruyen.
#Parte<nombre, peso (en kg)
#Métodos: mostrar_info() (muestra el nombre y el peso de la parte)
#Avión<modelo, fabricante, partes (lista de objetos de tipo Parte)
#Métodos: agregar_parte(parte), mostrar_avión() (muestra el modelo, fabricante
#y la información de todas las partes)
#a) Implementa las clases con sus constructores, getters y setters.
#b) Crea un avión y agrega varias partes.
#c) Muestra la información del avión y sus partes

class Parte:
    def __init__(self, nombre, peso):
        self._nombre = nombre
        self._peso = peso

    
    def get_nombre(self):
        return self._nombre

    def get_peso(self):
        return self._peso

    
    def set_nombre(self, nombre):
        self._nombre = nombre

    def set_peso(self, peso):
        self._peso = peso

    def mostrar_info(self):
        print(f"Parte: {self._nombre}, Peso: {self._peso} kg")

class Avion:
    def __init__(self, modelo, fabricante):
        self._modelo = modelo
        self._fabricante = fabricante
        self._partes = []

    
    def get_modelo(self):
        return self._modelo

    def get_fabricante(self):
        return self._fabricante

    def get_partes(self):
        return self._partes

    
    def set_modelo(self, modelo):
        self._modelo = modelo

    def set_fabricante(self, fabricante):
        self._fabricante = fabricante

    def agregar_parte(self, parte):
        self._partes.append(parte)

    def mostrar_avion(self):
        print(f"Modelo: {self._modelo}, Fabricante: {self._fabricante}")
        print("Partes:")
        for parte in self._partes:
            parte.mostrar_info()


if __name__ == "__main__":
    motor = Parte("Motor Pratt & Whitney PW1000G", 500)
    ala_izquierda = Parte("Ala Izquierda", 350)
    ala_derecha = Parte("Ala Derecha", 350)
    tren_aterrizaje_principal = Parte("Tren de Aterrizaje Principal", 200)
    tren_aterrizaje_nariz = Parte("Tren de Aterrizaje de Nariz", 100)

    mi_avion = Avion("Airbus A220", "Airbus Canada")
    mi_avion.agregar_parte(motor)
    mi_avion.agregar_parte(ala_izquierda)
    mi_avion.agregar_parte(ala_derecha)
    mi_avion.agregar_parte(tren_aterrizaje_principal)
    mi_avion.agregar_parte(tren_aterrizaje_nariz)

    mi_avion.mostrar_avion()
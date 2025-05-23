
class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso  # en kg

    def mostrar_info(self):
        print(f"Parte: {self.nombre}")
        print(f"Peso: {self.peso} kg")
        print("-------------------")


    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_peso(self):
        return self.peso

    def set_peso(self, peso):
        self.peso = peso



class Avion:
    def __init__(self, modelo, fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []  

    def agregar_parte(self, parte):
        self.partes.append(parte)
        print(f"Se agregó '{parte.nombre}' al avión {self.modelo}")

    def mostrar_avion(self):
        print(f"\n=== Avión {self.modelo} ===")
        print(f"Fabricante: {self.fabricante}")
        print("\nPartes:")
        for parte in self.partes:
            parte.mostrar_info()


    def get_modelo(self):
        return self.modelo

    def set_modelo(self, modelo):
        self.modelo = modelo

    def get_fabricante(self):
        return self.fabricante

    def set_fabricante(self, fabricante):
        self.fabricante = fabricante



if __name__ == "__main__":
    # b) Crear un avión y agregar partes
    boeing747 = Avion("747", "Boeing")

    # Crear partes
    motor = Parte("Motor Principal", 1500)
    ala_izquierda = Parte("Ala Izquierda", 800)
    ala_derecha = Parte("Ala Derecha", 800)
    tren_aterrizaje = Parte("Tren de Aterrizaje", 600)

    # Agregar partes al avión
    boeing747.agregar_parte(motor)
    boeing747.agregar_parte(ala_izquierda)
    boeing747.agregar_parte(ala_derecha)
    boeing747.agregar_parte(tren_aterrizaje)

    # c) Mostrar información completa
    boeing747.mostrar_avion()

    # Ejemplo de composición: Si el avión se destruye, las partes también
    print("\n¡El avión se destruyó en un accidente! Todas sus partes fueron eliminadas.")
    del boeing747  # Las partes ya no existen
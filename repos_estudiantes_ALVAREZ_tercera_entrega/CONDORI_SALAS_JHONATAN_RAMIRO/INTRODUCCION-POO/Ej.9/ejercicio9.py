class Computadora:
    def __init__(self, marca, modelo, procesador, memoria_ram):
        self.marca = marca
        self.modelo = modelo
        self.procesador = procesador
        self.memoria_ram = memoria_ram
        self.encendido = False

    def encender(self):
        if not self.encendido:
            self.encendido = True
            print("La computadora está encendida.")
        else:
            print("La computadora ya está encendida.")

    def apagar(self):
        if self.encendido:
            self.encendido = False
            print("La computadora está apagada.")
        else:
            print("La computadora ya está apagada.")

    def mostrar_estado(self):
        if self.encendido:
            print("La computadora está encendida.")
        else:
            print("La computadora está apagada.")

    def mostrar_componentes(self):
        print(f"Marca: {self.marca}")
        print(f"Modelo: {self.modelo}")
        print(f"Procesador: {self.procesador}")
        print(f"Memoria RAM: {self.memoria_ram}GB")


# Ejecución principal
if __name__ == "__main__":
    mi_computadora = Computadora("HP", "Pavilion 15", "Intel i7", 16)

    print("Componentes de la computadora:")
    mi_computadora.mostrar_componentes()

    print("\nEstado inicial de la computadora:")
    mi_computadora.mostrar_estado()

    print("\nEncendiendo la computadora...")
    mi_computadora.encender()

    mi_computadora.mostrar_estado()

    print("\nApagando la computadora...")
    mi_computadora.apagar()

    mi_computadora.mostrar_estado()

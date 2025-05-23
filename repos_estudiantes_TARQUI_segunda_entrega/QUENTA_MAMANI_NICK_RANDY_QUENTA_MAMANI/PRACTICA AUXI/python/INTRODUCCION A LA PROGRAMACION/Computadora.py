"NOMBRE: QUENTA MAMANI NICK RANDY"
"CI: 10037571"

"9. Realiza la abstracción de una Computadora"
"a) Muestra los componentes principales de la computadora"
"b) Muestra el estado de la computadora (encendido o apagado)"
"c) Crea una instancia y simula encender y apagar la computadora."

class Computadora:
    def __init__(self, marca, procesador, memoria_ram, almacenamiento):
        self.marca = marca
        self.procesador = procesador
        self.memoria_ram = memoria_ram
        self.almacenamiento = almacenamiento
        self.estado = "apagado"

    def encender(self):
        if self.estado == "apagado":
            self.estado = "encendido"
            print("La computadora está encendida.")
        else:
            print("La computadora ya está encendida.")

    def apagar(self):
        if self.estado == "encendido":
            self.estado = "apagado"
            print("La computadora esta apagada.")
        else:
            print("La computadora ya esta apagada.")

    def mostrar_componentes(self):
        print(f"Marca: {self.marca}")
        print(f"Procesador: {self.procesador}")
        print(f"Memoria RAM: {self.memoria_ram} GB")
        print(f"Almacenamiento: {self.almacenamiento} GB")
        print(f"Estado: {self.estado}")


if __name__ == "__main__":
    computadora = Computadora("Lenovo", "Intel i5", 16, 512)

    print("Componentes de la computadora:")
    computadora.mostrar_componentes()

    print("\nSimulación de estado:")
    computadora.encender()
    computadora.apagar()
    computadora.encender()

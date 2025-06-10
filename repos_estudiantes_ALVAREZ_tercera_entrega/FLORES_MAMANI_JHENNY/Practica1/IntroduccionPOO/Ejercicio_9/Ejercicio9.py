class Computadora:
    def __init__(self, procesador, ram, almacenamiento, tarjeta_grafica):
        self.procesador = procesador
        self.ram = ram
        self.almacenamiento = almacenamiento
        self.tarjeta_grafica = tarjeta_grafica
        self.esta_encendida = False

    def mostrar_componentes(self):
        print(f"Procesador: {self.procesador}")
        print(f"Memoria RAM: {self.ram} GB")
        print(f"Almacenamiento: {self.almacenamiento} GB")
        print(f"Tarjeta Gráfica: {self.tarjeta_grafica}")

    def encender(self):
        if self.esta_encendida:
            print("La computadora ya está encendida.")
        else:
            print("La computadora se ha encendido.")
            self.esta_encendida = True

    def apagar(self):
        if self.esta_encendida:
            print("La computadora se ha apagado.")
            self.esta_encendida = False
        else:
            print("La computadora ya está apagada.")

    def mostrar_estado(self):
        print("Prendida" if self.esta_encendida else "Apagada")


if __name__ == "__main__":
    mi_pc = Computadora("hp", 6, 2, "jhedf")

    mi_pc.mostrar_componentes()
    mi_pc.mostrar_estado()

    mi_pc.encender()
    mi_pc.mostrar_estado()

    mi_pc.apagar()
    mi_pc.mostrar_estado()

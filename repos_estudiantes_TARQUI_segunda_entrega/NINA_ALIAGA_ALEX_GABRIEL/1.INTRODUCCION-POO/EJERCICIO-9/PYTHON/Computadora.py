class Componente:
    def __init__(self, nombre):
        self.nombre = nombre

    def get_nombre(self):
        return self.nombre

class Computadora:
    def __init__(self):
        self.estado = False
        self.componentes = []

    def encender(self):
        if not self.estado:
            self.estado = True
            print("La computadora está encendida.")
        else:
            print("La computadora ya está encendida.")

    def apagar(self):
        if self.estado:
            self.estado = False
            print("La computadora está apagada.")
        else:
            print("La computadora ya está apagada.")

    def mostrar_estado(self):
        if self.estado:
            print("La computadora está encendida.")
        else:
            print("La computadora está apagada.")

    def agregar_componente(self, componente):
        self.componentes.append(componente)
        print(f"Componente {componente.get_nombre()} agregado.")

def main():
    mi_computadora = Computadora()

    mi_computadora.agregar_componente(Componente("CPU"))
    mi_computadora.agregar_componente(Componente("RAM"))
    mi_computadora.agregar_componente(Componente("Disco Duro"))

    mi_computadora.mostrar_estado()
    mi_computadora.encender()
    mi_computadora.mostrar_estado()
    mi_computadora.apagar()
    mi_computadora.mostrar_estado()

if __name__ == "__main__":
    main()

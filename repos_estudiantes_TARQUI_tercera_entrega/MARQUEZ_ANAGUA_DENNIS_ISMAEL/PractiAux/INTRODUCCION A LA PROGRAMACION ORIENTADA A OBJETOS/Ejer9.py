'''9. Realiza la abstracción de una Computadora
a)	Muestra los componentes principales de la computadora
b)	Muestra el estado de la computadora (encendido o apagado)
c)	Crea una instancia y simula encender y apagar la computadora
'''
class Computadora:
    def __init__(self, componentes):
        self.componentes = componentes
        self.estado = "Apagado"

    def encender(self):
        if self.estado == "Apagado":
            self.estado = "Encendido"
            print("La compu ahora está encendida.")
        else:
            print("La compu ya está encendida.")

    def apagar(self):
        if self.estado == "Encendido":
            self.estado = "Apagado"
            print("La compu ahora está apagada.")
        else:
            print("La compu ya está apagada.")

    def mostrar_componentes(self):
        print("Componentes principales de la compu:")
        for componente in self.componentes:
            print(f"* {componente}")

    def mostrar_estado(self):
        print(f"Estado de la compu: {self.estado}")

mi_computadora = Computadora(["Procesador","RAM","Disco Duro","Mouse","Fuente de Poder","Monitor","Teclado"])

mi_computadora.mostrar_componentes()
mi_computadora.mostrar_estado()
mi_computadora.encender()
mi_computadora.mostrar_estado()
mi_computadora.apagar()
mi_computadora.mostrar_estado()


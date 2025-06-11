"""
---------------ENUNCIADO------------------

9. Realiza la abstracción de una Computadora
a) Muestra los componentes principales de la computadora
b) Muestra el estado de la computadora (encendido o apagado)
c) Crea una instancia y simula encender y apagar la computadora.
"""


from computadora import Computadora

if __name__ == "__main__":
    #A
    mi_pc = Computadora("Intel i9", "16GB", "SSD 512GB", "ASUS")

    print("Componentes de la computadora")
    mi_pc.componentes()
    #B
    mi_pc.estado()
    print("Encendiendo")
    mi_pc.encender()
    mi_pc.estado()
    #C
    print("Intentando Encender de nuevo")
    mi_pc.encender()
    print("Apagando")
    mi_pc.apagar()
    mi_pc.estado()
    #C
    print("Intentando Apagar de nuevo")
    mi_pc.apagar()

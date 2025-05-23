"""
--------------------ENUNCIADO--------------------

9. Para los bloques del juego Minecraft se usará los siguientes objetos:
a) Crear e instanciar al menos 2 bloques de cada tipo
b) Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
distintos mensajes según el tipo de bloque.
c) Sobrecarga colocar() para permitir colocar un bloque en diferentes
orientaciones (por ejemplo, en el suelo o en la pared).
d) Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando
distintos mensajes según el tipo de bloque y que puede suceder al romperlos.

"""

from bloqueCofre import BloqueCofre
from bloqueTnt import BloqueTnt
from bloqueHorno import BloqueHorno

if __name__ == "__main__":
#A
    cofre1 = BloqueCofre(10, 2, "Plata")
    cofre2 = BloqueCofre(23, 23, "Oro")
    tnt1 = BloqueTnt("Explosivo", 50)
    tnt2 = BloqueTnt("Ultra Explosivo", 100)
    horno1 = BloqueHorno("Anaranjado", 2)
    horno2 = BloqueHorno("Negro", 10)

    bloques = [cofre1, cofre2, tnt1, tnt2, horno1, horno2]

    print("ACCION DE BLOQUES")
    for bloque in bloques:
        bloque.accion()
    print("----------------------------")
    print("AGREGA BLOQUES")
    for i, bloque in enumerate(bloques):
        orientacion = "suelo" if i % 2 == 0 else "pared"
        bloque.colocar(orientacion)
    print("----------------------------")
    print("SE ROMPE LOS BLOQUES")
    for bloque in bloques:
        bloque.romper()
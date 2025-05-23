"NOMBRE: QUENTA MAMANI NICK RANDY"
"CI: 10037571"

"7. Se hace referencia a algunos animales mediante las siguientes clases:"

"a) Instanciar 1 Perro, 1 Gato y 1 Pájaro."
"b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido característico."

"c) Implementar un método moverse() que indique cómo se mueve cada animal"
"(correr, saltar, volar, etc.)."


class Animal:
    def __init__(self, nombre):
        self.nombre = nombre

    def hacer_sonido(self, sonido=None, accion=None):
        if sonido is None and accion is None:
            print("sonido.")
        elif accion is None:
            print(f"{self.nombre} dice: {sonido}")
        else:
            print(f"{self.nombre} dice: {sonido} mientras está {accion}")


class Perro(Animal):
    def __init__(self, nombre):
        super().__init__(nombre)


class Gato(Animal):
    def __init__(self, nombre):
        super().__init__(nombre)


class Pajaro(Animal):
    def __init__(self, nombre):
        super().__init__(nombre)


if __name__ == "__main__":
    perro = Perro("toto")
    gato = Gato("pata fofa")
    pajaro = Pajaro("kay")

    print("Sonidos de los animales:")
    perro.hacer_sonido("au au", " corriendo")
    gato.hacer_sonido("Miau", "saltando")
    pajaro.hacer_sonido("Pío", "volando")

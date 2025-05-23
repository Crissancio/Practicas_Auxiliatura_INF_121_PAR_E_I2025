class Jugador:
    def __init__(self, nombre, numero, posicion):
        self._nombre = nombre
        self._numero = numero
        self._posicion = posicion

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, valor):
        self._nombre = valor

    @property
    def numero(self):
        return self._numero

    @numero.setter
    def numero(self, valor):
        self._numero = valor

    @property
    def posicion(self):
        return self._posicion

    @posicion.setter
    def posicion(self, valor):
        self._posicion = valor

    def mostrar_info(self):
        print(f"{self.nombre} | #{self.numero} | Posición: {self.posicion}")

class Portero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Portero")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f"  Habilidad especial: {self.habilidad_especial}")

class Defensa(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Defensa")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f"  Habilidad especial: {self.habilidad_especial}")

class Mediocampista(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Mediocampista")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f"  Habilidad especial: {self.habilidad_especial}")

class Delantero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Delantero")
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f"  Habilidad especial: {self.habilidad_especial}")

class Equipo:
    def __init__(self, nombre):
        self._nombre = nombre
        self._jugadores = []

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, valor):
        self._nombre = valor

    def agregar_jugador(self, jugador):
        if isinstance(jugador, Jugador):
            self._jugadores.append(jugador)

    def mostrar_equipo(self):
        print(f"\nEquipo: {self.nombre}")
        for jugador in self._jugadores:
            jugador.mostrar_info()

if __name__ == "__main__":
    equipo = Equipo("Bolivar")
    equipo.agregar_jugador(Portero("Carlos", 1, "Atajadas"))
    equipo.agregar_jugador(Defensa("Luis", 4, "Marcaje"))
    equipo.agregar_jugador(Mediocampista("Andrés", 8, "Pases precisos"))
    equipo.agregar_jugador(Delantero("Pedro", 9, "Goles de cabeza"))
    equipo.mostrar_equipo()
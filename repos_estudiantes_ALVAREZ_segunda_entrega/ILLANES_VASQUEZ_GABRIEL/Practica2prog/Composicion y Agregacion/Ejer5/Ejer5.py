class Jugador:
    def __init__(self, nombre, numero, posicion):
        self.nombre = nombre
        self.numero = numero
        self.posicion = posicion

    def get_nombre(self):
        return self.nombre

    def get_numero(self):
        return self.numero

    def get_posicion(self):
        return self.posicion

    def set_nombre(self, nombre):
        self.nombre = nombre

    def set_numero(self, numero):
        self.numero = numero

    def set_posicion(self, posicion):
        self.posicion = posicion

    def mostrar_info(self):
        print(f"Nombre: {self.nombre}, Número: {self.numero}, Posición: {self.posicion}")


class Portero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Portero")
        self.habilidad_especial = habilidad_especial

    def get_habilidad_especial(self):
        return self.habilidad_especial

    def set_habilidad_especial(self, habilidad_especial):
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad Especial: {self.habilidad_especial}")


class Defensa(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Defensa")
        self.habilidad_especial = habilidad_especial

    def get_habilidad_especial(self):
        return self.habilidad_especial

    def set_habilidad_especial(self, habilidad_especial):
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad Especial: {self.habilidad_especial}")


class Mediocampista(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Mediocampista")
        self.habilidad_especial = habilidad_especial

    def get_habilidad_especial(self):
        return self.habilidad_especial

    def set_habilidad_especial(self, habilidad_especial):
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad Especial: {self.habilidad_especial}")


class Delantero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Delantero")
        self.habilidad_especial = habilidad_especial

    def get_habilidad_especial(self):
        return self.habilidad_especial

    def set_habilidad_especial(self, habilidad_especial):
        self.habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad Especial: {self.habilidad_especial}")


class Equipo:
    def __init__(self, nombre, capacidad):
        self.nombre = nombre
        self.jugadores = [None] * capacidad
        self.cantidad_jugadores = 0

    def get_nombre(self):
        return self.nombre

    def agregar_jugador(self, jugador):
        if self.cantidad_jugadores < len(self.jugadores):
            self.jugadores[self.cantidad_jugadores] = jugador
            self.cantidad_jugadores += 1

    def mostrar_equipo(self):
        print(f"Equipo: {self.nombre}")
        print("Jugadores:")
        for i in range(self.cantidad_jugadores):
            self.jugadores[i].mostrar_info()


def main():
    equipo = Equipo("real madrid", 4)

    portero = Portero("iker casillas", 1, "atajadas")
    defensa = Defensa("sergio ramos", 4, "destrozar")
    medio = Mediocampista("toni kross", 8, "pases magicos")
    delantero = Delantero("cristiano ronaldo", 7, "goles imposibles")

    equipo.agregar_jugador(portero)
    equipo.agregar_jugador(defensa)
    equipo.agregar_jugador(medio)
    equipo.agregar_jugador(delantero)

    equipo.mostrar_equipo()


if __name__ == "__main__":
    main()

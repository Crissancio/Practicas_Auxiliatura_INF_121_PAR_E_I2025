# Clase padre
class Jugador:
    def __init__(self, nombre, numero, posicion):
        self._nombre = nombre
        self._numero = numero
        self._posicion = posicion

    # Getters
    def get_nombre(self):
        return self._nombre

    def get_numero(self):
        return self._numero

    def get_posicion(self):
        return self._posicion

    # Setters
    def set_nombre(self, nombre):
        self._nombre = nombre

    def set_numero(self, numero):
        self._numero = numero

    def set_posicion(self, posicion):
        self._posicion = posicion

    # Método que será sobrescrito
    def mostrar_info(self):
        print(f"Jugador: {self._nombre}, Nº: {self._numero}, Posición: {self._posicion}")


# Clases derivadas
class Portero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Portero")
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f"  Habilidad Especial: {self._habilidad_especial}")


class Defensa(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Defensa")
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f"  Habilidad Especial: {self._habilidad_especial}")


class Mediocampista(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Mediocampista")
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f"  Habilidad Especial: {self._habilidad_especial}")


class Delantero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Delantero")
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f"  Habilidad Especial: {self._habilidad_especial}")


# Clase equipo
class Equipo:
    def __init__(self, nombre):
        self._nombre = nombre
        self._jugadores = []

    def get_nombre(self):
        return self._nombre

    def get_jugadores(self):
        return self._jugadores

    def set_nombre(self, nombre):
        self._nombre = nombre

    # Agregar jugador
    def agregar_jugador(self, jugador):
        if isinstance(jugador, Jugador):
            self._jugadores.append(jugador)
        else:
            print("Error: solo se pueden agregar jugadores válidos.")

    # Mostrar información del equipo
    def mostrar_equipo(self):
        print(f"Equipo: {self._nombre}")
        print("Jugadores:")
        for jugador in self._jugadores:
            jugador.mostrar_info()

    # Destruir el equipo (borra jugadores)
    def destruir_equipo(self):
        print(f"¡El equipo '{self._nombre}' ha sido destruido!")
        self._jugadores.clear()

if __name__ == "__main__":
    # Crear jugadores
    j1 = Portero("Carlos Pérez", 1, "Atajadas")
    j2 = Defensa("Luis Gómez", 4, "Marcaje")
    j3 = Mediocampista("Ana Torres", 8, "Pases precisos")
    j4 = Delantero("Miguel Suárez", 9, "Goles potentes")

    # Crear equipo
    equipo = Equipo("Los Invencibles")

    # Agregar jugadores
    equipo.agregar_jugador(j1)
    equipo.agregar_jugador(j2)
    equipo.agregar_jugador(j3)
    equipo.agregar_jugador(j4)

    # Mostrar equipo
    equipo.mostrar_equipo()

    print("\n--- Destruyendo equipo ---\n")
    equipo.destruir_equipo()

    # Mostrar equipo vacío
    equipo.mostrar_equipo()

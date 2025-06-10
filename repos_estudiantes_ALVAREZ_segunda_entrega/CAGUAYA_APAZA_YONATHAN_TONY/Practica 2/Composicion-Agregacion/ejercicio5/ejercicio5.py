# 5. Desarrolla un POO para un equipo de fútbol y sus jugadores.
# El equipo está compuesto por jugadores, y si el equipo se destruye, los jugadores también se destruyen.
# Además, los jugadores pueden ser de diferentes tipos (portero, defensa, mediocampista, delantero).
#
# Clase Padre: Jugador<nombre, número, posición>
# Métodos: mostrar_info() (muestra el nombre, número y posición del jugador)
#
# Clases Derivadas: Portero, Defensa, Mediocampista, Delantero (heredan de Jugador)
# Atributos adicionales: habilidad_especial
#
# Clase: Equipo<nombre, jugadores (lista de objetos de tipo Jugador)>
# Métodos: mostrar_equipo() (muestra el nombre del equipo y la información de todos los jugadores)

# DIAGRAMA DE CLASES ERRONEO
class Jugador:
    def __init__(self, nombre, numero, posicion):
        self._nombre = nombre
        self._numero = numero
        self._posicion = posicion

    def mostrar_info(self):
        return f"{self._nombre} - #{self._numero} - {self._posicion}"


class Portero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Portero")
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        return super().mostrar_info() + f" - Habilidad: {self._habilidad_especial}"


class Defensa(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Defensa")
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        return super().mostrar_info() + f" - Habilidad: {self._habilidad_especial}"


class Mediocampista(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Mediocampista")
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        return super().mostrar_info() + f" - Habilidad: {self._habilidad_especial}"


class Delantero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Delantero")
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        return super().mostrar_info() + f" - Habilidad: {self._habilidad_especial}"


class Equipo:
    def __init__(self, nombre):
        self.__nombre = nombre
        self.__jugadores = []
        self.__crear_jugadores()

    def __crear_jugadores(self):
        self.__jugadores.append(Portero("Carlos", 1, "Atajadas"))
        self.__jugadores.append(Defensa("Luis", 3, "Marcaje"))
        self.__jugadores.append(Mediocampista("Andrés", 8, "Pases"))
        self.__jugadores.append(Delantero("Miguel", 9, "Goles"))

    def mostrar_equipo(self):
        print(f"Equipo: {self.__nombre}")
        for jugador in self.__jugadores:
            print(jugador.mostrar_info())

equipo = Equipo("Tigres del Sur")
equipo.mostrar_equipo()

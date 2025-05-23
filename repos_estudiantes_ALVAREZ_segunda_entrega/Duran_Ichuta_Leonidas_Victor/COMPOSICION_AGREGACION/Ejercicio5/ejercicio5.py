#5. Desarrolla un POO para un equipo de fútbol y sus jugadores.
#El equipo está compuesto por jugadores, y si el equipo se destruye,
#los jugadores también se destruyen.Además, los jugadores pueden ser
#de diferentes tipos (portero, defensa, mediocampista, delantero).
#Clase Padre: Jugador<nombre, número, posición>
#Métodos: mostrar_info() (muestra el nombre, número y posición del jugador)
#Clases Derivadas: Portero, Defensa, Mediocampista, Delantero (heredan de Jugador)
#Atributos adicionales: habilidad_especial
#(ej: "Atajadas", "Marcaje", "Pases", "Goles")
#Clase: Equipo<nombre, jugadores (lista de objetos de tipo Jugador)>
#Métodos: agregar_jugador(jugador), mostrar_equipo()
#(muestra el nombre del equipo y la información de todos los jugadores)
class Jugador:
    def __init__(self, nombre, numero, posicion):
        self.nombre = nombre
        self.numero = numero
        self.posicion = posicion

    def mostrar_info(self):
        print(f"Jugador: {self.nombre}")
        print(f"Número: {self.numero}")
        print(f"Posición: {self.posicion}")

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_numero(self):
        return self.numero

    def set_numero(self, numero):
        self.numero = numero



class Portero(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Portero")
        self.habilidad_especial = "Atajadas"

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad: {self.habilidad_especial}")
        print("-------------------")


class Defensa(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Defensa")
        self.habilidad_especial = "Marcaje"

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad: {self.habilidad_especial}")
        print("-------------------")


class Mediocampista(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Mediocampista")
        self.habilidad_especial = "Pases"

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad: {self.habilidad_especial}")
        print("-------------------")


class Delantero(Jugador):
    def __init__(self, nombre, numero):
        super().__init__(nombre, numero, "Delantero")
        self.habilidad_especial = "Goles"

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad: {self.habilidad_especial}")
        print("-------------------")



class Equipo:
    def __init__(self, nombre):
        self.nombre = nombre
        self.jugadores = [] 

    def agregar_jugador(self, jugador):
        self.jugadores.append(jugador)
        print(f"Se agregó a {jugador.nombre} al equipo {self.nombre}")

    def mostrar_equipo(self):
        print(f"\n=== Equipo: {self.nombre} ===")
        print("Jugadores:")
        for jugador in self.jugadores:
            jugador.mostrar_info()


    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre



if __name__ == "__main__":
    # b) Crear equipo y jugadores
    losCapos = Equipo("Los mas capos")

    # Crear jugadores de diferentes tipos
    Adrian = Portero("Adrian", 1)
    Juan = Defensa("Juan", 2)
    Pedro = Mediocampista("Pedro", 6)
    Pablo = Delantero("Pablo", 8)

    # Agregar jugadores al equipo
    losCapos.agregar_jugador(Adrian)
    losCapos.agregar_jugador(Juan)
    losCapos.agregar_jugador(Pedro)
    losCapos.agregar_jugador(Pablo)

    # c) Mostrar información del equipo
    losCapos.mostrar_equipo()

    # Ejemplo de composición: Si el equipo se disuelve, los jugadores también
    print("\n¡El equipo se disolvió! Todos los jugadores fueron liberados.")
    del losCapos  # Los jugadores ya no existen

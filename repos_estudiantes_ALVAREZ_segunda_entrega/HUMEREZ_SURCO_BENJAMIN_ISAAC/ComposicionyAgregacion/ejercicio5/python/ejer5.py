#5. Desarrolla un POO para un equipo de fútbol y sus jugadores. El equipo está
#compuesto por jugadores, y si el equipo se destruye, los jugadores también se
#destruyen. Además, los jugadores pueden ser de diferentes tipos (portero,
#defensa, mediocampista, delantero).
#Clase Padre: Jugador<nombre, número, posición>
#Métodos: mostrar_info() (muestra el nombre, número y posición del jugador)
#Clases Derivadas: Portero, Defensa, Mediocampista, Delantero (heredan de
#Jugador)
#Atributos adicionales: habilidad_especial (ej: "Atajadas", "Marcaje", "Pases",
#"Goles")
#Clase: Equipo<nombre, jugadores (lista de objetos de tipo Jugador)>
#Métodos: agregar_jugador(jugador), mostrar_equipo() (muestra el nombre del
#equipo y la información de todos los jugadores)
#a) Implementa las clases con sus constructores, getters y setters.
#b) Crea un equipo y agrega varios jugadores de diferentes tipos.
#c) Muestra la información del equipo y sus jugadores.


class Jugador:
    def __init__(self, nombre, numero, posicion):
        self._nombre = nombre
        self._numero = numero
        self._posicion = posicion

    
    def get_nombre(self):
        return self._nombre

    def get_numero(self):
        return self._numero

    def get_posicion(self):
        return self._posicion

   
    def set_nombre(self, nombre):
        self._nombre = nombre

    def set_numero(self, numero):
        self._numero = numero

    def set_posicion(self, posicion):
        self._posicion = posicion

    def mostrar_info(self):
        print(f"Nombre: {self._nombre}, Número: {self._numero}, Posición: {self._posicion}")

class Portero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Portero")
        self._habilidad_especial = habilidad_especial


    def get_habilidad_especial(self):
        return self._habilidad_especial

    
    def set_habilidad_especial(self, habilidad_especial):
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad Especial: {self._habilidad_especial}")

class Defensa(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Defensa")
        self._habilidad_especial = habilidad_especial

    
    def get_habilidad_especial(self):
        return self._habilidad_especial

    
    def set_habilidad_especial(self, habilidad_especial):
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad Especial: {self._habilidad_especial}")

class Mediocampista(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Mediocampista")
        self._habilidad_especial = habilidad_especial

    
    def get_habilidad_especial(self):
        return self._habilidad_especial

    
    def set_habilidad_especial(self, habilidad_especial):
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad Especial: {self._habilidad_especial}")

class Delantero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Delantero")
        self._habilidad_especial = habilidad_especial

    
    def get_habilidad_especial(self):
        return self._habilidad_especial

    
    def set_habilidad_especial(self, habilidad_especial):
        self._habilidad_especial = habilidad_especial

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Habilidad Especial: {self._habilidad_especial}")

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

    def agregar_jugador(self, jugador):
        self._jugadores.append(jugador)

    def mostrar_equipo(self):
        print(f"Equipo: {self._nombre}")
        print("Jugadores:")
        for jugador in self._jugadores:
            jugador.mostrar_info()


if __name__ == "__main__":
    portero = Portero("Manuel Neuer", 1, "Atajadas")
    defensa1 = Defensa("Virgil van Dijk", 4, "Marcaje")
    defensa2 = Defensa("Sergio Ramos", 15, "Intercepciones")
    mediocampista1 = Mediocampista("Kevin De Bruyne", 17, "Pases")
    mediocampista2 = Mediocampista("Luka Modrić", 10, "Regate")
    delantero1 = Delantero("Erling Haaland", 9, "Goles")
    delantero2 = Delantero("Kylian Mbappé", 7, "Velocidad")

    mi_equipo = Equipo("Los Galácticos")
    mi_equipo.agregar_jugador(portero)
    mi_equipo.agregar_jugador(defensa1)
    mi_equipo.agregar_jugador(defensa2)
    mi_equipo.agregar_jugador(mediocampista1)
    mi_equipo.agregar_jugador(mediocampista2)
    mi_equipo.agregar_jugador(delantero1)
    mi_equipo.agregar_jugador(delantero2)

    mi_equipo.mostrar_equipo()
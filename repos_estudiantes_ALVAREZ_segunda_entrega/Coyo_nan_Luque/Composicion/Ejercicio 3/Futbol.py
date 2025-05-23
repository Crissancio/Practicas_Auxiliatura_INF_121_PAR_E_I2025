class Jugador:
    def __init__(self, nombre, numero, posicion):
        self.nombre = nombre
        self.numero = numero
        self.posicion = posicion
    
    def get_nombre(self):
        return self.nombre
    
    def set_nombre(self, nombre):
        self.nombre = nombre
    
    def get_numero(self):
        return self.numero
    
    def set_numero(self, numero):
        self.numero = numero
    
    def get_posicion(self):
        return self.posicion
    
    def set_posicion(self, posicion):
        self.posicion = posicion
    
    def mostrar_info(self):
        return f"{self.nombre} ({self.numero}) - {self.posicion}"


class Portero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Portero")
        self.habilidad_especial = habilidad_especial
    
    def mostrar_info(self):
        return f"{super().mostrar_info()} Habilidad: {self.habilidad_especial}"


class Defensa(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Defensa")
        self.habilidad_especial = habilidad_especial
    
    def mostrar_info(self):
        return f"{super().mostrar_info()}  Habilidad: {self.habilidad_especial}"


class Mediocampista(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Mediocampista")
        self.habilidad_especial = habilidad_especial
    
    def mostrar_info(self):
        return f"{super().mostrar_info()}  Habilidad: {self.habilidad_especial}"


class Delantero(Jugador):
    def __init__(self, nombre, numero, habilidad_especial):
        super().__init__(nombre, numero, "Delantero")
        self.habilidad_especial = habilidad_especial
    
    def mostrar_info(self):
        return f"{super().mostrar_info()}  Habilidad: {self.habilidad_especial}"


class Equipo:
    def __init__(self, nombre):
        self.nombre = nombre
        self.jugadores = []
    
    def agregar_jugador(self, jugador):
        self.jugadores.append(jugador)
    
    def mostrar_equipo(self):
        info = f"=== Equipo: {self.nombre} ===\n"
        info += "Jugadores:\n"
        for jugador in self.jugadores:
            info += f"- {jugador.mostrar_info()}\n"
        return info



bolivar = Equipo("Club Bolívar")
    
bolivar.agregar_jugador(Portero("Carlos Lampe", 1, "Atajadas espectaculares"))
bolivar.agregar_jugador(Defensa("Luis Haquin", 4, "Marcaje fuerte"))
bolivar.agregar_jugador(Defensa("José Sagredo", 2, "Salidas limpias"))
bolivar.agregar_jugador(Mediocampista("Leonel Justiniano", 8, "Recuperación de balón"))
bolivar.agregar_jugador(Mediocampista("Ramiro Vaca", 10, "Pases largos"))
bolivar.agregar_jugador(Delantero("Marcelo Martins", 9, "Remate de cabeza"))
bolivar.agregar_jugador(Delantero("Rodrigo Ramallo", 7, "Velocidad"))
    
print(bolivar.mostrar_equipo())
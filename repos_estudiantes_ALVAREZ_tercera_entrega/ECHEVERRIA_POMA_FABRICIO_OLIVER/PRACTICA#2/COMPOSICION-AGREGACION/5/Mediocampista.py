from Jugador import Jugador

class Mediocampista(Jugador):
    def __init__(self, nombre, número, habilidad_especial):
        super().__init__(nombre, número, "Mediocampista")
        self.__habilidad_especial = habilidad_especial

    #A
    def get_habilidad_especial(self):
        return self.__habilidad_especial

    def set_habilidad_especial(self, habilidad_especial):
        self.__habilidad_especial = habilidad_especial

    def mostrar_info(self):
        print(f"Nombre: {self.get_nombre()}, Número: {self.get_número()}, Posición: {self.get_posición()}, Habilidad Especial: {self.__habilidad_especial}")
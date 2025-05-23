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
        print(f"Nombre: {self.nombre}, Numero: {self.numero}, Posicion: {self.posicion}")
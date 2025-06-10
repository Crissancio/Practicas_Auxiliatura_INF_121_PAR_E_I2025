class Cliente:
    def __init__(self, id_cliente, nombre, telefono):
        self.id_cliente = id_cliente
        self.nombre = nombre
        self.telefono = telefono

    def __str__(self):
        return f"Cliente: {self.nombre} | ID: {self.id_cliente} | Teléfono: {self.telefono}"

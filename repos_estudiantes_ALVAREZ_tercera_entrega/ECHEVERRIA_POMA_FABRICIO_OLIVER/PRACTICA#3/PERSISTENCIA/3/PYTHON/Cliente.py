class Cliente:
    def __init__(self, id: int, nombre: str, telefono: int):
        self.id = id
        self.nombre = nombre
        self.telefono = telefono
    
    def __str__(self):
        return f"ID: {self.id}, Nombre: {self.nombre}, Teléfono: {self.telefono}"
class Cliente:
    def __init__(self, id: int, nombre: str, celular: str):
        self.id = id
        self.nombre = nombre
        self.celular = celular

    def __str__(self):
        return f"Cliente(id={self.id}, nombre='{self.nombre}', celular='{self.celular}')"

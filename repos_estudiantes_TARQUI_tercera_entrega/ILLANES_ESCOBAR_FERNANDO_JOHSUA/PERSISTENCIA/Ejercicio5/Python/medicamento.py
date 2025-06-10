class Medicamento:
    def __init__(self, nombre: str, tipo: str):
        self.nombre = nombre
        self.tipo = tipo

    def __str__(self):
        return f"{self.nombre} ({self.tipo})"

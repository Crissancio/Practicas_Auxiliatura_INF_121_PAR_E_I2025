class Medicamento:
    def __init__(self, nombre="", codMedicamento=0, tipo="", precio=0.0):
        self.nombre = nombre
        self.codMedicamento = codMedicamento
        self.tipo = tipo
        self.precio = precio
    
    def getTipo(self):
        return self.tipo
    
    def getPrecio(self):
        return self.precio
    
    def __str__(self):
        return f"{self.nombre} - {self.tipo} - ${self.precio}"
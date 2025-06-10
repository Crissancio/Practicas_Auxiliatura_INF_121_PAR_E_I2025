class Medicamento:
    def __init__(self, nombre, cod_medicamento, tipo, precio):
        self.nombre = nombre
        self.cod_medicamento = cod_medicamento
        self.tipo = tipo
        self.precio = precio

    def __str__(self):
        return f"Medicamento: {self.nombre} | Código: {self.cod_medicamento} | Tipo: {self.tipo} | Precio: {self.precio}"

    def get_tipo(self):
        return self.tipo

    def get_precio(self):
        return self.precio

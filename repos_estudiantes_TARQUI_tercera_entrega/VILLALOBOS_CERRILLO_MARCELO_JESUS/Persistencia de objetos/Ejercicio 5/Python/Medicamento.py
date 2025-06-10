class Medicamento:
    def __init__(self, nombre, codMedicamento, tipo, precio):
        self.nombre = nombre
        self.codMedicamento = codMedicamento
        self.tipo = tipo
        self.precio = precio

    def leer(self):
        return f"{self.nombre},{self.codMedicamento},{self.tipo},{self.precio}"

    def mostrar(self):
        print(f"{self.nombre} - Código: {self.codMedicamento} - Tipo: {self.tipo} - Precio: {self.precio}")

    def getTipo(self):
        return self.tipo

    def getPrecio(self):
        return self.precio

    def getNombre(self):
        return self.nombre
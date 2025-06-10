class Producto:
   
    def __init__(self, nombre: str, codigo: str, precio: float):
        self.nombre = nombre
        self.codigo = codigo
        self.precio = precio

    def __str__(self):
        return f"Producto: '{self.nombre}' (Codigo: {self.codigo}, Precio: ${self.precio:.2f})"

    def __repr__(self):
        return self.__str__()

    def es_similar(self, criterio: str) -> bool:
        return criterio.lower() in self.nombre.lower() or criterio.lower() in self.codigo.lower()

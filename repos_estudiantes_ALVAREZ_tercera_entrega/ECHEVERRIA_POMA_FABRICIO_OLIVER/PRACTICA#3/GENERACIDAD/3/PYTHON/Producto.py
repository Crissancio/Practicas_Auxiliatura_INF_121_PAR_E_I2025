class Producto:
    
    def __init__(self, nombre: str, precio: float, codigo: str):
        self.nombre = nombre
        self.precio = precio
        self.codigo = codigo
    
    def __str__(self) -> str:
        return f"Producto: {self.nombre} - Precio: ${self.precio} - Código: {self.codigo}"
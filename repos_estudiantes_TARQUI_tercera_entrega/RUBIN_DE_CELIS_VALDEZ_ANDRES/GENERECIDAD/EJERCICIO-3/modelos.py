class Libro:
    def __init__(self, titulo: str, autor: str):
        self.titulo = titulo
        self.autor = autor
    
    def __str__(self) -> str:
        return f"Libro: {self.titulo} por {self.autor}"

class Producto:
    def __init__(self, nombre: str, precio: float):
        self.nombre = nombre
        self.precio = precio
    
    def __str__(self) -> str:
        return f"Producto: {self.nombre} (${self.precio:.2f})"
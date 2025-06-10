
class Libro:
   
    def __init__(self, titulo: str, autor: str, isbn: str, precio: float):
        self.titulo = titulo
        self.autor = autor
        self.isbn = isbn
        self.precio = precio

    def __str__(self):
        return f"Libro: '{self.titulo}' por {self.autor} (ISBN: {self.isbn}, Precio: ${self.precio:.2f})"

    def __repr__(self):
        return self.__str__()

    def es_similar(self, criterio: str) -> bool:
        return criterio.lower() in self.titulo.lower() or criterio.lower() in self.isbn.lower()
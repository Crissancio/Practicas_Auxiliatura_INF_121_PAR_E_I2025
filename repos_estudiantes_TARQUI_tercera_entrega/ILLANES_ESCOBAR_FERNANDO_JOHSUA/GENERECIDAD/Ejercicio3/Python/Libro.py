class Libro:
    
    def __init__(self, titulo: str, autor: str, isbn: str):
        self.titulo = titulo
        self.autor = autor
        self.isbn = isbn
    
    def __str__(self) -> str:
        return f"Libro: {self.titulo} - Autor: {self.autor} - ISBN: {self.isbn}"
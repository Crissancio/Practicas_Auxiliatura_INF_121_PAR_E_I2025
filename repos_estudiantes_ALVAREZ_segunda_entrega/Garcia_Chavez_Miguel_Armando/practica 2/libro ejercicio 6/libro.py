class Libro:
    def __init__(self, título, autor):
        self.título = título
        self.autor = autor
    
    def mostrar_info(self):
        print(f"Libro: {self.título} - Autor: {self.autor}")

class Biblioteca:
    def __init__(self, nombre):
        self.nombre = nombre
        self.libros = []
    
    def agregar_libro(self, libro):
        self.libros.append(libro)
    
    def mostrar_biblioteca(self):
        print(f"Biblioteca: {self.nombre}")
        print("Libros disponibles:")
        for libro in self.libros:
            libro.mostrar_info()

if __name__ == "__main__":
    libro1 = Libro("Cien años de soledad", "Gabriel García Márquez")
    libro2 = Libro("1984", "George Orwell")
    libro3 = Libro("El Principito", "Antoine de Saint-Exupéry")

    biblioteca = Biblioteca("Biblioteca Central")

    biblioteca.agregar_libro(libro1)
    biblioteca.agregar_libro(libro2)
    biblioteca.agregar_libro(libro3)
    biblioteca.mostrar_biblioteca()

    print("\nLibro independiente:")
    libro1.mostrar_info()
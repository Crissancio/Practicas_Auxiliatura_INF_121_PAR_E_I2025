# 6. Desarrolla un POO donde la biblioteca contiene libros, pero los libros pueden
# existir independientemente de la biblioteca.
# Libro<título, autor>
# Biblioteca<nombre, libros (lista de objetos de tipo Libro)>
# Métodos: agregar_libro(libro), mostrar_biblioteca() (muestra el nombre de la
# biblioteca y la información de todos los libros)
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea una biblioteca y agrega varios libros.
# c) Muestra la información de la biblioteca y sus libros.
class Libro:
    def __init__(self, titulo, autor): 
        self.titulo, self.autor = titulo, autor
    def mostrar_info(self): 
        print(f"{self.titulo} - {self.autor}")

class Biblioteca:
    def __init__(self, nombre): 
        self.nombre, self.libros = nombre, []
    def agregar_libro(self, libro): 
        self.libros.append(libro)
    def mostrar_biblioteca(self):
        print(f"Biblioteca: {self.nombre}")
        for l in self.libros: l.mostrar_info()

biblio = Biblioteca("Central")
biblio.agregar_libro(Libro("1984", "George Orwell"))
biblio.agregar_libro(Libro("Cien Años de Soledad", "Gabo"))
biblio.mostrar_biblioteca()

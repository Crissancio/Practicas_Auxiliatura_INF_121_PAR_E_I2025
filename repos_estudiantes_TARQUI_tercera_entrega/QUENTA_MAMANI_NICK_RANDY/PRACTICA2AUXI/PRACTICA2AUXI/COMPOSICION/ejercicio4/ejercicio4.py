# 4. Desarrolla el siguiente POO, donde el libro no puede tener más de 500
# páginas.
# Página< número, contenido
# Métodos: mostrar_info() (muestra el número y el contenido de la página)
# Libro< título, autor, páginas (lista de objetos de tipo Página)
# Métodos: agregar_página(página), mostrar_libro() (muestra el título, autor y la
# información de todas las páginas)
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea un libro y agrega varias páginas, validando que no se exceda el
# límite de 500 páginas.
# c) Muestra la información del libro y sus páginas.
class Pagina:
    def __init__(self, numero, contenido): 
        self.numero, self.contenido = numero, contenido
    def mostrar_info(self): 
        print(f"Página {self.numero}: {self.contenido}")

class Libro:
    def __init__(self, titulo, autor): 
        self.titulo, self.autor, self.paginas = titulo, autor, []
    def agregar_pagina(self, pagina):
        if len(self.paginas) < 500: 
            self.paginas.append(pagina)
        else: 
            print("¡No se puede agregar más de 500 páginas!")
    def mostrar_libro(self):
        print(f"Libro: {self.titulo}, Autor: {self.autor}")
        for p in self.paginas: 
            p.mostrar_info()

libro = Libro("Mi Vida", "Autor Desconocido")
for i in range(1, 6): 
    libro.agregar_pagina(Pagina(i, f"Contenido de la página {i}"))
libro.mostrar_libro()

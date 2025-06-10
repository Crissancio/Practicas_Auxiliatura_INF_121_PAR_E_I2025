class Catalogo:
    def __init__(self):
        self.elementos = []
    
    def agregar(self, elemento):
        self.elementos.append(elemento)
    
    def buscar(self, criterio):
        for elemento in self.elementos:
            if criterio in str(elemento):
                return elemento
        return None
    
    def __str__(self):
        return "\n".join(str(elemento) for elemento in self.elementos)


class Libro:
    def __init__(self, titulo, autor):
        self.titulo = titulo
        self.autor = autor
    
    def __str__(self):
        return f"{self.titulo} - {self.autor}"

class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio
    
    def __str__(self):
        return f"{self.nombre} - ${self.precio}"


catalogo_libros = Catalogo()
catalogo_libros.agregar(Libro("Angeles y Demonios", "Dan Brown"))
catalogo_libros.agregar(Libro("La Torre Oscura", "Stephen King"))

print("\nLibros:")
print(catalogo_libros)

libro_encontrado = catalogo_libros.buscar("Demonios")
print("\nLibro encontrado:", libro_encontrado)


catalogo_productos = Catalogo()
catalogo_productos.agregar(Producto("CPU", 2700))
catalogo_productos.agregar(Producto("Celular", 1200))

print("\nProductos:")
print(catalogo_productos)

producto_encontrado = catalogo_productos.buscar("Celular")
print("\nProducto encontrado:", producto_encontrado)
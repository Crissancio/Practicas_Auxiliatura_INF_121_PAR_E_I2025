from catalogo import Catalogo
from modelos import Libro, Producto

def main():
    catalogo_libros = Catalogo()  
    catalogo_libros.agregar(Libro("Cien años de soledad", "Gabriel García Márquez"))
    catalogo_libros.agregar(Libro("1984", "George Orwell"))
    catalogo_libros.agregar(Libro("El Principito", "Antoine de Saint-Exupéry"))
    
    print("\nCatálogo de Libros:")
    print(catalogo_libros)
    
    resultados = catalogo_libros.buscar(lambda libro: "El" in libro.titulo)
    print("\nResultados de búsqueda (Libros con 'El' en el título):")
    for libro in resultados:
        print(libro)
    
    catalogo_productos = Catalogo()  
    catalogo_productos.agregar(Producto("Laptop", 1200.99))
    catalogo_productos.agregar(Producto("Teléfono", 599.50))
    catalogo_productos.agregar(Producto("Tablet", 350.00))
    
    print("\nCatálogo de Productos:")
    print(catalogo_productos)
    
    resultados = catalogo_productos.buscar(lambda prod: prod.precio < 600)
    print("\nResultados de búsqueda (Productos bajo $600):")
    for producto in resultados:
        print(producto)

if __name__ == "__main__":
    main()
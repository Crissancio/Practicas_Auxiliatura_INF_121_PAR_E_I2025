'''


------------------ EJERCICIO 3 ------------------

Crea una clase genérica Catalogo<T> que almacene productos o libros. 
a) Agrega métodos para agregar y buscar elemento 
b) Prueba el catálogo con libros 
c) Prueba el catálogo con productos

'''

from Catalogo import Catalogo
from Libro import Libro
from Producto import Producto

def main():    
    #b)
    print("PRUEBA CON LIBROS:")
    print("-" * 30)
    
    catalogo_libros: Catalogo[Libro] = Catalogo[Libro]()
    
    libro1 = Libro("Cien años de soledad", "Gabriel García Márquez", "978-0307474278")
    libro2 = Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "978-8424116859")
    libro3 = Libro("1984", "George Orwell", "978-0451524935")
    
    catalogo_libros.agregar(libro1)
    catalogo_libros.agregar(libro2)
    catalogo_libros.agregar(libro3)
    
    print(f"\nTotal de libros en catálogo: {catalogo_libros.size()}")
    catalogo_libros.mostrar_todos()
    
    print("\nBuscando libro '1984':")
    libro_encontrado = catalogo_libros.buscar("1984")
    if libro_encontrado:
        print(f"Encontrado: {libro_encontrado}")
    else:
        print("Libro no encontrado")
    
    #c)
    print("\n\nPRUEBA CON PRODUCTOS:")
    print("-" * 30)
    
    catalogo_productos: Catalogo[Producto] = Catalogo[Producto]()
    
    producto1 = Producto("Laptop Dell", 899.99, "DELL001")
    producto2 = Producto("Mouse Logitech", 29.99, "LOG002")
    producto3 = Producto("Teclado Mecánico", 79.99, "KEY003")
    
    catalogo_productos.agregar(producto1)
    catalogo_productos.agregar(producto2)
    catalogo_productos.agregar(producto3)
    
    print(f"\nTotal de productos en catálogo: {catalogo_productos.size()}")
    catalogo_productos.mostrar_todos()
    
    print("\nBuscando producto 'Mouse Logitech':")
    producto_encontrado = catalogo_productos.buscar("Mouse Logitech")
    if producto_encontrado:
        print(f"Encontrado: {producto_encontrado}")
    else:
        print("Producto no encontrado")

if __name__ == "__main__":
    main()
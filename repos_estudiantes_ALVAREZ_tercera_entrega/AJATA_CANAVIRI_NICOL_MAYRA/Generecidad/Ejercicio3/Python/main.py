from Catalogo import Catalogo
from Libro import Libro
from Producto import Producto

if __name__ == "__main__":
    print("--- Ejercicio 3: Clase Generica Catalogo ---")

    # b) 
    print("\n--- Probando Catalogo de Libros ---")
    catalogo_libros = Catalogo[Libro]() 

    libro1 = Libro("Cien Años de Soledad", "Gabriel Garcia Marquez", "978-0307474474", 15.99)
    libro2 = Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "978-8424118029", 12.50)
    libro3 = Libro("1984", "George Orwell", "978-0451524935", 9.50)

    catalogo_libros.agregar_elemento(libro1)
    catalogo_libros.agregar_elemento(libro2)
    catalogo_libros.agregar_elemento(libro3)

    catalogo_libros.mostrar_catalogo()

    libro_encontrado_1 = catalogo_libros.buscar_elemento("cien años")
    if libro_encontrado_1:
        print(f"Encontrado: {libro_encontrado_1}")
    else:
        print("Libro no encontrado.")

    libro_encontrado_2 = catalogo_libros.buscar_elemento("84241")
    if libro_encontrado_2:
        print(f"Encontrado: {libro_encontrado_2}")
    else:
        print("Libro no encontrado.")

    libro_no_encontrado = catalogo_libros.buscar_elemento("El Principito")
    if libro_no_encontrado:
        print(f"Encontrado: {libro_no_encontrado}")
    else:
        print("Libro 'El Principito' no encontrado.")


    # c) 
    print("\n--- Probando Catalogo de Productos ---")
    catalogo_productos = Catalogo[Producto]() 

    producto1 = Producto("Monitor HP 24'", "MON-HP-001", 250.00)
    producto2 = Producto("Teclado Mecanico RGB", "TEC-GAMER-005", 85.99)
    producto3 = Producto("Mouse Optico Inalambrico", "MOU-WIRE-010", 25.00)

    catalogo_productos.agregar_elemento(producto1)
    catalogo_productos.agregar_elemento(producto2)
    catalogo_productos.agregar_elemento(producto3)

    catalogo_productos.mostrar_catalogo()

    producto_encontrado_1 = catalogo_productos.buscar_elemento("monitor")
    if producto_encontrado_1:
        print(f"Encontrado: {producto_encontrado_1}")
    else:
        print("Producto no encontrado.")

    producto_encontrado_2 = catalogo_productos.buscar_elemento("GAMER-005")
    if producto_encontrado_2:
        print(f"Encontrado: {producto_encontrado_2}")
    else:
        print("Producto no encontrado.")

    producto_no_encontrado = catalogo_productos.buscar_elemento("Webcam")
    if producto_no_encontrado:
        print(f"Encontrado: {producto_no_encontrado}")
    else:
        print("Producto 'Webcam' no encontrado.")

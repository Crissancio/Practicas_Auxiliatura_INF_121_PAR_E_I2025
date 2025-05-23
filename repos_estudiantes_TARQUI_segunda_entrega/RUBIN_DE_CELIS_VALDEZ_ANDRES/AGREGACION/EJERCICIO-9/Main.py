from Producto import Producto
from CarritoCompras import CarritoCompras

def main():
    
    producto1 = Producto("Laptop", 1200.50)
    producto2 = Producto("Teléfono", 599.99)
    producto3 = Producto("Tablet", 350.75)
    producto4 = Producto("Auriculares", 89.90)
   
    carrito = CarritoCompras()
  
    carrito.agregar_producto(producto1)
    carrito.agregar_producto(producto2)
    carrito.agregar_producto(producto3)
    carrito.agregar_producto(producto4)

    for i in range(5, 12):
        producto = Producto(f"Producto {i}", i * 50)
        if not carrito.agregar_producto(producto):
            break  

    carrito.mostrar_carrito()

    print("\nProducto independiente:")
    producto2.mostrar_info()

if __name__ == "__main__":
    main()
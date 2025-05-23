class CarritoCompras():
    def __init__(self):
        self.productos=[]
    
    def agregar_producto(self, producto):
            if len(self.productos) < 10:
                self.productos.append(producto)
            else:
                print("No se pueden agregar mas de 10 productos!")

    def mostrar_carrito(self):
        print("\n< CARRITO DE COMPRAS >")
        if len(self.productos) == 0:
            print("El carrito esta vacio.")
        else:
            for p in self.productos:
                p.mostrar_info()    
        
        
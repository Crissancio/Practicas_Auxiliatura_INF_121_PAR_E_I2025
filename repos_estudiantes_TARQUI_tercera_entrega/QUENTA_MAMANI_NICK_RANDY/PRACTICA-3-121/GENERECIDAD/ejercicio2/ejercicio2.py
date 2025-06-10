# 2. Crea una clase genérica Par<K, V> para representar una clave y un valor.
# a) Agrega un método mostrarPar()
# b) Crea un par para representar (ID, nombre) de un estudiante
# c) Crea un par para representar (Codigo, Precio) de un producto
class Par:
    def __init__(self, clave, valor):
        self.clave = clave
        self.valor = valor

    def mostrarPar(self):
        print(f"Par: ({self.clave}, {self.valor})")

par_estudiante = Par("33225", "Sora")
par_producto = Par("P001", 30.50)

par_estudiante.mostrarPar()
par_producto.mostrarPar()

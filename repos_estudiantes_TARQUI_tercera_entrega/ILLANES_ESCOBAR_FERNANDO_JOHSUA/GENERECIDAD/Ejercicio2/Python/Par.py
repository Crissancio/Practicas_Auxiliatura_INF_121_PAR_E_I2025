from typing import TypeVar, Generic

K = TypeVar('K')  
V = TypeVar('V') 

class Par(Generic[K, V]):
    def __init__(self, clave: K, valor: V):
        self.clave = clave
        self.valor = valor

    def mostrar_par(self):
        print(f"Clave: {self.clave}, Valor: {self.valor}")

par_estudiante = Par[int, str](10088855, "Fernando Illanes")
par_estudiante.mostrar_par()

par_producto = Par[str, float]("P001", 19.99)
par_producto.mostrar_par()

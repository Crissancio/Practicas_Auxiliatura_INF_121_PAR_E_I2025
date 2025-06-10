from typing import Generic, TypeVar

K = TypeVar('K')
V = TypeVar('V')
class Par(Generic[K, V]):
    def __init__(self, clave: K, valor: V):
        self.clave = clave
        self.valor = valor

    def mostrarPar(self):
        print(f"Clave: {self.clave}, Valor: {self.valor}")

    def __str__(self):
        return f"({self.clave}, {self.valor})"

class ParEstudiante(Par[int, str]):
    def mostrarPar(self):
        print(f"ID: {self.clave}, Nombre: {self.valor}")

class ParProducto(Par[str, float]):
    def mostrarPar(self):
        print(f"Código: {self.clave}, Precio: {self.valor}")

par_e = ParEstudiante(1878065, "Cristopher Callejas")
par_p = ParProducto("P001", 250)

print("Estudiante:")
par_e.mostrarPar()

print("\nProducto:")
par_p.mostrarPar()
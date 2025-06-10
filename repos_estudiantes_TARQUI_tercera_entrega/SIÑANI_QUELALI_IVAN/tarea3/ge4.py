class Vector:
    def __init__(self):
        self.elementos = []

    def agregar(self, elemento):
        self.elementos.append(elemento)

    def obtener(self, i):
        return self.elementos[i] if 0 <= i < len(self.elementos) else None

    def obtener_mayor(self):
        return max(self.elementos) if self.elementos else None

    def obtener_menor(self):
        return min(self.elementos) if self.elementos else None

vector = Vector()
vector.agregar(10)
vector.agregar(5)
vector.agregar(20)

print("Elemento en posición 1:", vector.obtener(1))
print("Valor mayor:", vector.obtener_mayor())
print("Valor menor:", vector.obtener_menor())

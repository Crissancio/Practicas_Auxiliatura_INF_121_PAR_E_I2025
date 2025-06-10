class Vector:
    def __init__(self, elementos):
        self.elementos = elementos

    def obtener_posicion(self, i):
        return self.elementos[i]

    def mayor(self):
        return max(self.elementos)

    def menor(self):
        return min(self.elementos)


v = Vector([10, 20, 5, 35, 15])
print("Elemento en posición 2:", v.obtener_posicion(2))
print("Mayor:", v.mayor())
print("Menor:", v.menor())
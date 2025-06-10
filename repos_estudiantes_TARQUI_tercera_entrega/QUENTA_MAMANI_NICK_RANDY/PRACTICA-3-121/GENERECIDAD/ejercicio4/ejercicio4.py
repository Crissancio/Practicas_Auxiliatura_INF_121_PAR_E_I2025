# 4. Crea una clase genérica Vector<T>
# a) Crea un método para devolver el valor de la posición i
# b) Crea un método para devolver el valor mayor del vector
# c) Crea un método para devolver el valor menor del vector 

class Vector:
    def __init__(self, elementos):
        self.elementos = elementos

    def valor_posicion(self, i):
        if 0 <= i < len(self.elementos):
            return self.elementos[i]
        return None

    def mayor(self):
        return max(self.elementos)

    def menor(self):
        return min(self.elementos)

vec = Vector([3, 7, 12, -5, 8])
print("Valor en posición 2:", vec.valor_posicion(2))
print("Mayor:", vec.mayor())
print("Menor:", vec.menor())

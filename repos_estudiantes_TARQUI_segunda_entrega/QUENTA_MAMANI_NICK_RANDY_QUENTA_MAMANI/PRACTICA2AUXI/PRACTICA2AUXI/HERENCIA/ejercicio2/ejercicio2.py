# 2. Definir las clases:
# ▪ Electrodoméstico <precio base, color,
# consumo energético (letras entre A y F) y peso>
# ▪ Lavadora (hereda de Electrodoméstico) <carga>
# ▪ Televisión (hereda de Electrodoméstico) <resolución (en
# pulgadas) y sintonizador TDT (booleano)>
# • precioFinal() – Electrodoméstico: según el consumo energético, aumentara
# su precio, y según su tamaño, también. Esta es la lista de precios:
# precioFinal() – Lavadora : si tiene una carga mayor de 30 kg, aumentara el
# precio 50 , sino es así no se incrementara el precio. Llama al método padre y
# añade el código necesario. Recuerda que las condiciones que hemos visto en
# la clase Electrodoméstico también deben afectar al precio.
# • precioFinal() – televisión : si tiene una resolución mayor de 40 pulgadas, se
# incrementara el precio un 30% y si tiene un sintonizador TDT incorporado, 
# aumentara 50 . Recuerda que las condiciones que hemos visto en la clase
# Electrodoméstico también deben afectar al precio.
# a) Elaborar el diagrama UML de las clases antes mencionadas.
# b) Implementa todas las clases, sus constructores, getters y setter.
# c) Implementar la funcion precioFinal() en las clases con sus restricciones
# correspondientes.
# d) Mostrar las lavadoras que tienen una carga mayor a 30kg

class Electrodomestico:
    def __init__(self, precio_base, color, consumo_energetico, peso):
        self.precio_base = precio_base
        self.color = color
        self.consumo_energetico = consumo_energetico.upper()
        self.peso = peso

    def precioFinal(self):
        consumos = {"A": 100, "B": 80, "C": 60, "D": 50, "E": 30, "F": 10}
        incremento = consumos[self.consumo_energetico] + (10 if self.peso < 20 else 50 if self.peso < 50 else 80)
        return self.precio_base + incremento


class Lavadora(Electrodomestico):
    def __init__(self, precio_base, color, consumo_energetico, peso, carga):
        super().__init__(precio_base, color, consumo_energetico, peso)
        self.carga = carga

    def precioFinal(self):
        return super().precioFinal() + (50 if self.carga > 30 else 0)


class Television(Electrodomestico):
    def __init__(self, precio_base, color, consumo_energetico, peso, resolucion, sintonizador_tdt):
        super().__init__(precio_base, color, consumo_energetico, peso)
        self.resolucion = resolucion
        self.sintonizador_tdt = sintonizador_tdt

    def precioFinal(self):
        precio = super().precioFinal()
        precio = precio * 1.3 if self.resolucion > 40 else precio
        return precio + (50 if self.sintonizador_tdt else 0)

lavadora1 = Lavadora(300, "Blanco", "A", 40, 35)
lavadora2 = Lavadora(280, "Gris", "C", 25, 25)
tv1 = Television(500, "Negro", "B", 15, 42, True)
tv2 = Television(400, "Gris", "D", 30, 32, False)

print(f"Precio final lavadora1: {lavadora1.precioFinal()}")
print(f"Precio final lavadora2: {lavadora2.precioFinal()}")
print(f"Precio final tv1: {tv1.precioFinal()}")
print(f"Precio final tv2: {tv2.precioFinal()}")

print("\nLavadoras con carga > 30kg:")
for lavadora in [lavadora1, lavadora2]:
    if lavadora.carga > 30:
        print(vars(lavadora))


from Coche import Coche
from Moto import Moto
if __name__ == "__main__":
    c1 = Coche("Changan", "Waer3", 2000, 30000, "Gas", 6)
    c2 = Coche("Toyota", "Yaris", 2025, 28000, "H\u00edbrido", 4)
    m1 = Moto("Yamaha", "CR21", 2025, 23000, "13", "HkR3")
    print("-----Vehiculos:------")
    print("Coche 1:")
    c1.mostrar_info()
    print("\nCoche 2:")
    c2.mostrar_info()
    print("\nMoto 1:")
    m1.mostrar_info()
    print("\nLos Coches con mas de 4 puertas son:")
    c1.mas_de_4()   
    c2.mas_de_4()
    print("\nLos vehiculos de modelo actual (2025) son: ")   
    c1.mod2025()
    c2.mod2025()
    m1.mod2025()

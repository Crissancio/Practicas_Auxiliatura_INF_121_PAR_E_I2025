from Caja import Caja

if __name__ == "__main__":
    # b) Crea dos instancias de la caja y almacena 2 datos de diferente tipo

    # Instancia 1
    caja_entero = Caja[int]() 
    caja_entero.guardar(123)

    # Instancia 2
    caja_cadena = Caja[str]() 
    caja_cadena.guardar("Hola Mundo")

    # Instancia 3
    caja_flotante = Caja[float]()
    caja_flotante.guardar(3.14159)

    # c) Muestra el contenido de las cajas
    print("--- Contenido de las Cajas ---")
    print(f"Caja de Entero: {caja_entero.obtener()} (Tipo: {type(caja_entero.obtener())})")
    print(f"Caja de Cadena: {caja_cadena.obtener()} (Tipo: {type(caja_cadena.obtener())})")
    print(f"Caja de Float: {caja_flotante.obtener()} (Tipo: {type(caja_flotante.obtener())})")

    print("\n--- Usando el metodo __str__ de la clase Caja ---")
    print(caja_entero)
    print(caja_cadena)
    print(caja_flotante)
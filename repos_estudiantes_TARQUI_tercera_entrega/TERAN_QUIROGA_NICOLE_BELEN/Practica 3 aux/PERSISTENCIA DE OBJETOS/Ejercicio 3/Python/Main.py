from ArchivoCliente import ArchivoCliente
from Cliente import Cliente

def main():
    import os

    ruta = os.path.join(os.path.dirname(__file__), "clientes.txt")
    archivo = ArchivoCliente("C:/Users/teran/OneDrive/Desktop/Progra II/Practica 3 aux/PERSISTENCIA DE OBJETOS/Ejercicio 3/Python/clientes.txt")

    # Guardar clientes
    archivo.guardarCliente(Cliente(1, "Ana", 9374))
    archivo.guardarCliente(Cliente(2, "Luis", 9474))
    archivo.guardarCliente(Cliente(3, "Maria", 8493))

    c1 = archivo.buscarCliente(2)
    if c1:
        print("Encontrado por ID:", c1)
    else:
        print("Cliente no encontrado por ID")

    c2 = archivo.buscarCelularCliente(3333)
    if c2:
        print("Encontrado por teléfono:", c2)
    else:
        print("Cliente no encontrado por teléfono")

if __name__ == "__main__":
    main()
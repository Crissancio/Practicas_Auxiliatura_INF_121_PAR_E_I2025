'''

------------- EJERCICIO 3 -------------


a) Implementar el diagrama de clases.
b) Implementa buscarCliente(int c) a través del id.
c) Implementa buscarCelularCliente(int c), que devuelva los datos del cliente
junto al número de celular.
'''


from Cliente import Cliente
from ArchivoCliente import ArchivoCliente

def main():
    archivo = ArchivoCliente("d:/UMSA/SEGUNDO SEMESTRE/PROGRAMACION II/PRACTICAS AUX/PRACTICA#3/PERSISTENCIA/3/PYTHON/clientes.txt")
    archivo.crearArchivo()
    
    # a)
    cliente1 = Cliente(1, "Juan", 123456789)
    cliente2 = Cliente(2, "Maria", 987654321)
    archivo.guardarCliente(cliente1)
    archivo.guardarCliente(cliente2)
    
    # b)
    encontrado = archivo.buscarCliente(2)
    if encontrado:
        print(encontrado)
    else:
        print("Cliente no encontrado")
    
    # c)
    celular = archivo.buscarCelularCliente(1)
    if celular:
        print("Cliente con celular:", celular)
    else:
        print("Cliente no encontrado")

if __name__ == "__main__":
    main()
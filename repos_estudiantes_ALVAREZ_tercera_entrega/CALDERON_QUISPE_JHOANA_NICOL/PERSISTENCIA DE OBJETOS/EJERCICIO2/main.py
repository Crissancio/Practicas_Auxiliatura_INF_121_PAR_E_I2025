from Cliente import Cliente
from ArchivoCliente import ArchivoCliente

archivo = ArchivoCliente()

cliente1 = Cliente(1, "Carlos", 71234567)
cliente2 = Cliente(2, "Ana", 78965432)

archivo.guardarCliente(cliente1)
archivo.guardarCliente(cliente2)

archivo.cargarClientes()
archivo.mostrarClientes()

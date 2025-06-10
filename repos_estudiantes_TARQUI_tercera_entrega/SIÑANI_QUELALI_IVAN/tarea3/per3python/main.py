from archivo_cliente import ArchivoCliente
from cliente import Cliente
archivo = ArchivoCliente("clientes.pkl")
archivo.crear_archivo()
# Guardar clientes
archivo.guardar_cliente(Cliente(1001, "Juan Pérez", 7654321))
archivo.guardar_cliente(Cliente(1002, "Ana López", 7123456))
# Buscar cliente por ID
encontrado = archivo.buscar_cliente(1002)
print("Cliente encontrado:", encontrado)
#celular del cliente por ID
celular_cliente = archivo.buscar_celular_cliente(1001)
print("Datos del cliente con celular:", celular_cliente)

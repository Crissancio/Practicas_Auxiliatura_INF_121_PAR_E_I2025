from cliente import Cliente
from gestor_cliente import GestorCliente

gestor = GestorCliente()

c1 = Cliente(1, "Bruno", "71511111")
c2 = Cliente(2, "Paola", "76543210")

gestor.guardar_cliente(c1)
gestor.guardar_cliente(c2)

print("Buscar cliente con ID 2:")
print(gestor.buscar_cliente(2))

print("Buscar celular del cliente con ID 1:")
print(gestor.buscar_celular_cliente(1))

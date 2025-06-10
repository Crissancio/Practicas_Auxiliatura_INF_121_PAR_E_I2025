from medicamento import Medicamento
from sucursal import Sucursal
from gestor_farmacia import GestorFarmacia

gestor = GestorFarmacia()

s1 = Sucursal(1, "Av. Villazón #123")
s1.agregar_medicamento(Medicamento("Golpex", "tos"))
s1.agregar_medicamento(Medicamento("Paracetamol", "dolor"))

s2 = Sucursal(2, "Calle Bueno #456")
s2.agregar_medicamento(Medicamento("Vitamina C", "inmunidad"))

gestor.guardar_sucursal(s1)
gestor.guardar_sucursal(s2)

gestor.mostrar_medicamentos_tos(1)
gestor.mostrar_sucursales_con_golpex()

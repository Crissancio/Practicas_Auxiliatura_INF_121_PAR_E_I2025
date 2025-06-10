from archivo_farmacia import ArchivoFarmacia
from farmacia import Farmacia
from medicamento import Medicamento
archivo = ArchivoFarmacia("farmacias.pkl")
archivo.crear_archivo()
# Crear farmacias y medicamentos
farmacia1 = Farmacia("Farmacia Central", 1, "Av. Principal 123")
farmacia2 = Farmacia("Farmacia Norte", 2, "Calle Secundaria 456")
med1 = Medicamento("Golpex", 101, "Tos", 15.50)
med2 = Medicamento("Paracetamol", 102, "Fiebre", 12.00)
# agregar medicamentos a las farmacias
farmacia1.agregar_medicamento(med1)
farmacia2.agregar_medicamento(med2)
archivo.guardar_farmacia(farmacia1)
archivo.guardar_farmacia(farmacia2)
archivo.mostrar_medicamentos_tos(1)
archivo.buscar_farmacia_medicamento("Golpex")

import os
from ArchFarmacia import ArchFarmacia
from Farmacia import Farmacia
from Medicamento import Medicamento

def main():
    archivo_path = os.path.join(r"C:\Users\teran\OneDrive\Desktop\Progra II\Practica 3 aux\PERSISTENCIA DE OBJETOS\Ejercicio 5\Python", "farmacias.txt")

    archivo = ArchFarmacia(archivo_path)

    f1 = Farmacia("SaludPlus", 101, "Av. Libertad 789")
    f1.agregarMedicamento(Medicamento("NasalClear", 301, "congestión", 12))
    f1.agregarMedicamento(Medicamento("DolorOff", 302, "dolor", 15))

    f2 = Farmacia("Farmacia Vida", 102, "Calle Norte 234")
    f2.agregarMedicamento(Medicamento("FiebreStop", 401, "fiebre", 7.5))
    f2.agregarMedicamento(Medicamento("DolorOff", 402, "dolor", 14))

    archivo.adicionar(f1)
    archivo.adicionar(f2)

    print("=== Medicamentos para el dolor de la sucursal 102 ===")
    archivo.mostrarMedicamentosTos(102)

    print("\n=== Farmacias que tienen DolorOff ===")
    archivo.mostrarFarmaciasCon("DolorOff")

if __name__ == "__main__":
    main()

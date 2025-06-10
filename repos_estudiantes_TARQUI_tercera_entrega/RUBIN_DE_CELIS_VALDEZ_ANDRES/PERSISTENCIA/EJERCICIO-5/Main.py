from Farmacia import Farmacia
from ArchFarmacia import ArchFarmacia

def main():
    archivo = ArchFarmacia("farmacias.txt")
    archivo.crearArchivo()

    print("=== Registrar Farmacias ===")
    continuar = 's'
    while continuar.lower() == 's':
        farmacia = Farmacia()
        farmacia.leer()
        archivo.adicionar(farmacia)
        continuar = input("\n¿Agregar otra farmacia? (s/n): ")

    print("\n=== Listado de Farmacias ===")
    archivo.listar()

    sucursal = int(input("\nIngrese número de sucursal para ver medicamentos para tos: "))
    print(f"\n=== Medicamentos para tos en sucursal {sucursal} ===")
    archivo.mostrarMedicamentosTosSucursal(sucursal)
    
    print("\n=== Sucursales con medicamento 'Golpex' ===")
    archivo.mostrarSucursalesConGolpex()

if __name__ == "__main__":
    main()
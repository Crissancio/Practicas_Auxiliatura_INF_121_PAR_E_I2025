import json
from Farmacia import Farmacia

class ArchFarmacia:
    def __init__(self, nombre_archivo):
        self.nombre_archivo = nombre_archivo
    
    def crearArchivo(self):
        try:
            with open(self.nombre_archivo, 'x'):
                pass
        except FileExistsError:
            pass
    
    def adicionar(self, farmacia):
        with open(self.nombre_archivo, 'a') as f:
            f.write(f"{farmacia.sucursal},{farmacia.nombreFarmacia},{farmacia.direccion}\n")
            for med in farmacia.medicamentos:
                f.write(f"{med.codMedicamento},{med.nombre},{med.tipo},{med.precio}\n")
            f.write("---\n")
    
    def listar(self):
        try:
            with open(self.nombre_archivo, 'r') as f:
                for linea in f:
                    linea = linea.strip()
                    if linea == "---":
                        print()  
                    else:
                        print(linea)
        except FileNotFoundError:
            print("Archivo no encontrado")
    
    def mostrarMedicamentosTosSucursal(self, sucursal):
        try:
            with open(self.nombre_archivo, 'r') as f:
                current_sucursal = None
                for linea in f:
                    linea = linea.strip()
                    if linea == "---":
                        current_sucursal = None
                    elif current_sucursal is None:
                        datos = linea.split(',')
                        if int(datos[0]) == sucursal:
                            current_sucursal = datos
                            print(f"\nFarmacia: {datos[1]}, Sucursal: {datos[0]}, Dirección: {datos[2]}")
                    elif current_sucursal:
                        datos = linea.split(',')
                        if datos[2].lower() == "tos":
                            print(f"Medicamento: {datos[1]}, Código: {datos[0]}, Precio: {datos[3]}")
        except FileNotFoundError:
            print("Archivo no encontrado")
    
    def mostrarSucursalesConGolpex(self):
        try:
            with open(self.nombre_archivo, 'r') as f:
                current_sucursal = None
                for linea in f:
                    linea = linea.strip()
                    if linea == "---":
                        current_sucursal = None
                    elif current_sucursal is None:
                        current_sucursal = linea.split(',')
                    elif current_sucursal:
                        datos = linea.split(',')
                        if datos[1].lower() == "golpex":
                            print(f"\nSucursal: {current_sucursal[0]}, Dirección: {current_sucursal[2]}")
        except FileNotFoundError:
            print("Archivo no encontrado")

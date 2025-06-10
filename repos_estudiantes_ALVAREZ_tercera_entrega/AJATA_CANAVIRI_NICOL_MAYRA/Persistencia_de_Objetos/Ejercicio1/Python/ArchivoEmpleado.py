import os
from typing import List, Optional
from Empleado import Empleado

class ArchivoEmpleado:
    
    def __init__(self, nom_archivo: str):
        self.nom_archivo = nom_archivo
        self.crear_archivo() 

    def crear_archivo(self):
        
        if not os.path.exists(self.nom_archivo):
            try:
                with open(self.nom_archivo, 'w') as f:
                    pass 
                print(f"Archivo '{self.nom_archivo}' creado exitosamente.")
            except IOError as e:
                print(f"Error al crear el archivo '{self.nom_archivo}': {e}")
        else:
            print(f"Archivo '{self.nom_archivo}' ya existe.")

    # a) 
    def guardar_empleado(self, e: Empleado):
        
        try:
            with open(self.nom_archivo, 'a') as f: 
                f.write(str(e) + '\n')
            print(f"Empleado '{e.nombre}' guardado exitosamente en '{self.nom_archivo}'.")
        except IOError as error:
            print(f"Error al guardar empleado en '{self.nom_archivo}': {error}")

    def _cargar_todos_empleados(self) -> List[Empleado]:
        
        empleados = []
        try:
            with open(self.nom_archivo, 'r') as f:
                for linea in f:
                    empleado = Empleado.from_string(linea)
                    if empleado:
                        empleados.append(empleado)
            return empleados
        except FileNotFoundError:
            print(f"El archivo '{self.nom_archivo}' no se encontro")
            return []
        except IOError as e:
            print(f"Error al leer el archivo '{self.nom_archivo}': {e}")
            return []

    # b) 
    def busca_empleado(self, nombre_buscar: str) -> Optional[Empleado]:
       
        empleados = self._cargar_todos_empleados()
        for empleado in empleados:
            if empleado.nombre.lower() == nombre_buscar.lower():
                return empleado
        return None

    # c) 
    def mayor_salario(self, sueldo_minimo: float) -> Optional[Empleado]:
       
        empleados = self._cargar_todos_empleados()
        for empleado in empleados:
            if empleado.salario > sueldo_minimo:
                return empleado
        return None

    def limpiar_archivo(self):
        
        try:
            with open(self.nom_archivo, 'w') as f:
                f.write('')
            print(f"Contenido del archivo '{self.nom_archivo}' limpiado.")
        except IOError as e:
            print(f"Error al limpiar el archivo '{self.nom_archivo}': {e}")
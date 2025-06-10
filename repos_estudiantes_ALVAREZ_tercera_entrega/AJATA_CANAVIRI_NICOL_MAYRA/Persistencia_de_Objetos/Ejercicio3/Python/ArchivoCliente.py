
import os
from typing import List, Optional
from Cliente import Cliente

class ArchivoCliente:
    
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

    def guarda_cliente(self, c: Cliente):
        
        try:
            with open(self.nom_archivo, 'a') as f: 
                f.write(str(c) + '\n')
            print(f"Cliente con ID {c.id} guardado exitosamente en '{self.nom_archivo}'.")
        except IOError as error:
            print(f"Error al guardar cliente en '{self.nom_archivo}': {error}")

    def _cargar_todos_clientes(self) -> List[Cliente]:
       
        clientes = []
        try:
            with open(self.nom_archivo, 'r') as f:
                for linea in f:
                    cliente = Cliente.from_string(linea)
                    if cliente:
                        clientes.append(cliente)
            return clientes
        except FileNotFoundError:
            print(f"El archivo '{self.nom_archivo}' no se encontro. Retornando lista vacia.")
            return []
        except IOError as e:
            print(f"Error al leer el archivo '{self.nom_archivo}': {e}")
            return []

    # b) 
    def buscar_cliente(self, id_buscar: int) -> Optional[Cliente]:
        
        print(f"Buscando cliente con ID: {id_buscar}")
        clientes = self._cargar_todos_clientes()
        for cliente in clientes:
            if cliente.get_id() == id_buscar:
                return cliente
        return None

    # c) 
    def buscar_celular_cliente(self, telefono_buscar: int) -> Optional[Cliente]:
        
        print(f"Buscando cliente con numero de telefono: {telefono_buscar}")
        clientes = self._cargar_todos_clientes()
        for cliente in clientes:
            if cliente.get_telefono() == telefono_buscar:
                return cliente
        return None

    def limpiar_archivo(self):
       
        try:
            with open(self.nom_archivo, 'w') as f:
                f.write('')
            print(f"Contenido del archivo '{self.nom_archivo}' limpiado.")
        except IOError as e:
            print(f"Error al limpiar el archivo '{self.nom_archivo}': {e}")
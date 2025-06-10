import pickle
import os

class Cliente:
    def __init__(self, id_cliente, nombre, celular):
        self.id_cliente = id_cliente
        self.nombre = nombre
        self.celular = celular
    
    def getIdCliente(self):
        return self.id_cliente
    
    def getNombre(self):
        return self.nombre
    
    def getCelular(self):
        return self.celular
    
    def setNombre(self, nombre):
        self.nombre = nombre
    
    def setCelular(self, celular):
        self.celular = celular
    
    def __str__(self):
        return f"Cliente [ID: {self.id_cliente}, Nombre: {self.nombre}, Celular: {self.celular}]"

class PersistenciaClientes:
    ARCHIVO = "clientes.dat"
    
    @classmethod
    def guardarCliente(cls, cliente):
        try:
            clientes = cls.cargarClientes()
            if clientes is None:
                clientes = []
            
            clientes.append(cliente)
            
            with open(cls.ARCHIVO, 'wb') as f:
                pickle.dump(clientes, f)
            return True
        except Exception as ex:
            print(f"Error al guardar cliente: {str(ex)}")
            return False
    
    @classmethod
    def buscarCliente(cls, id_cliente):
        try:
            if not isinstance(id_cliente, int):
                raise TypeError("El ID debe ser un número entero")
            
            clientes = cls.cargarClientes()
            if clientes is None:
                return None
            
            for cliente in clientes:
                if cliente.getIdCliente() == id_cliente:
                    return cliente
            return None
        except Exception as ex:
            print(f"Error al buscar cliente: {str(ex)}")
            return None
    
    @classmethod
    def buscarCelularCliente(cls, id_cliente):
        try:
            if not isinstance(id_cliente, int):
                raise TypeError("El ID debe ser un número entero")
            
            cliente = cls.buscarCliente(id_cliente)
            if cliente:
                return {
                    'id': cliente.getIdCliente(),
                    'nombre': cliente.getNombre(),
                    'celular': cliente.getCelular()
                }
            return None
        except Exception as ex:
            print(f"Error al buscar datos del cliente: {str(ex)}")
            return None
    
    @classmethod
    def cargarClientes(cls):
        try:
            if not os.path.exists(cls.ARCHIVO):
                return []
            
            with open(cls.ARCHIVO, 'rb') as f:
                return pickle.load(f)
        except Exception as ex:
            print(f"Error al cargar clientes: {str(ex)}")
            return None

# Ejemplo
if __name__ == "__main__":
    # Crear clientes
    cli1 = Cliente(1, "Juan Pérez", "555-1234")
    cli2 = Cliente(2, "María Gómez", "555-5678")
    cli3 = Cliente(3, "Carlos Ruiz", "555-9012")
    
    # Guardar clientes
    if PersistenciaClientes.guardarCliente(cli1):
        print(f"Cliente guardado: {cli1}")
    if PersistenciaClientes.guardarCliente(cli2):
        print(f"Cliente guardado: {cli2}")
    if PersistenciaClientes.guardarCliente(cli3):
        print(f"Cliente guardado: {cli3}")
    
    # Buscar cliente por ID
    print("\nBuscando cliente con ID 2:")
    encontrado = PersistenciaClientes.buscarCliente(2)
    if encontrado:
        print(f"Cliente encontrado: {encontrado}")
    
    # Buscar datos completos del cliente
    print("\nBuscando datos completos del cliente con ID 3:")
    datos = PersistenciaClientes.buscarCelularCliente(3)
    if datos:
        print("Datos del cliente:")
        for clave, valor in datos.items():
            print(f"{clave}: {valor}")
    
    # Buscar cliente inexistente
    print("\nBuscando cliente con ID 99:")
    encontrado = PersistenciaClientes.buscarCliente(99)
    if encontrado:
        print(f"Cliente encontrado: {encontrado}")
    else:
        print("Cliente no encontrado")
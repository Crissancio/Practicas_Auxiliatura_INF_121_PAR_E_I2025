import os
from Cliente import Cliente

rutaBase =  "C:/Users/SAMSUNG/Desktop/PERSISTENCIA DE OBJETOS/EJERCICIO2/datosCliente"

class ArchivoCliente:
    def __init__(self):
        self.clientes = []

    def guardarCliente(self, cliente):
        cliente.guardarDatos()
        self.clientes.append(cliente)

    def cargarClientes(self):
        self.clientes = []  
        for archivo in os.listdir(rutaBase):
            rutaCompleta = os.path.join(rutaBase, archivo)
            if os.path.isfile(rutaCompleta):
                cliente = Cliente()
                cliente.cargarDatos(rutaCompleta)
                self.clientes.append(cliente)

    def mostrarClientes(self):
        for cliente in self.clientes:
            print(cliente)
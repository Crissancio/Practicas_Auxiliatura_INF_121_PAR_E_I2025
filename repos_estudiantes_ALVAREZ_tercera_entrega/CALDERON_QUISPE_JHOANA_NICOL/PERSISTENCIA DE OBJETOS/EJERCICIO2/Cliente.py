import os
import json

rutaBase = "C:/Users/SAMSUNG/Desktop/PERSISTENCIA DE OBJETOS/EJERCICIO2/datosCliente"

class Cliente:
    def __init__(self, id=None, nombre=None, telefono=None):
        self.id = id
        self.nombre = nombre
        self.telefono = telefono
        self.archivo = f"{rutaBase}/cliente{self.id}.json"

    def guardarDatos(self):
        os.makedirs(rutaBase, exist_ok=True)  # Crear carpeta si no existe

        datos = {
            "id": self.id,
            "nombre": self.nombre,
            "telefono": self.telefono
        }

        with open(self.archivo, 'w') as file:
            json.dump(datos, file, indent=4)
        print(f"Cliente guardado en {self.archivo}")

    def cargarDatos(self, rutaArchivo):
        self.archivo = rutaArchivo
        if os.path.isfile(self.archivo):
            with open(self.archivo, 'r') as file:
                datos = json.load(file)
                self.id = datos.get("id")
                self.nombre = datos.get("nombre")
                self.telefono = datos.get("telefono")
                print(f"Datos cargados: cliente{self.id}.json")
        else:
            print(f"El archivo {rutaArchivo} no existe.")

    def eliminarDatos(self):
        if os.path.isfile(self.archivo):
            os.remove(self.archivo)
            print(f"Archivo {self.archivo} eliminado.")
        else:
            print(f"El archivo {self.archivo} no existe.")

    def __str__(self):
        return f"ID: {self.id}, Nombre: {self.nombre}, Teléfono: {self.telefono}"
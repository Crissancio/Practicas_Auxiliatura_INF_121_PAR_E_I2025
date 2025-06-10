#3.- Sea el siguiente diagrama de clases:
import json
import os
#a) Implementar el diagrama de clases
class Cliente:
    def __init__(self, id: int, nombre: str, telefono: int):
        self.id = id
        self.nombre = nombre
        self.telefono = telefono
    
    def to_dict(self):
        return {"id": self.id, "nombre": self.nombre, "telefono": self.telefono}
    def __str__(self):
        return f"ID: {self.id}, Nombre: {self.nombre}, Teléfono: {self.telefono}"

class ArchivoCliente:
    def __init__(self, nomA: str):
        self.nomA = nomA
        if not os.path.exists(self.nomA):
            self.crearArchivo()  
    def crearArchivo(self):
        with open(self.nomA, 'w') as f:
            json.dump([], f)  
    
    def guardaCliente(self, c: Cliente):
        clientes = self._leer_clientes()
        clientes.append(c.to_dict())
        with open(self.nomA, 'w') as f:
            json.dump(clientes, f, indent=4)
#b) Implementa buscarCliente(int c) a través del id.
    def buscarCliente(self, id: int) -> Cliente:
        clientes = self._leer_clientes()
        for cli in clientes:
            if cli["id"] == id:
                return Cliente(cli["id"], cli["nombre"], cli["telefono"])
        return None
#c) Implementa buscarCelularCliente(int c), que devuelva los datos del cliente junto al número de celular.
    def buscarCelularCliente(self, telefono: int) -> Cliente:
        clientes = self._leer_clientes()
        for cli in clientes:
            if cli["telefono"] == telefono:
                return Cliente(cli["id"], cli["nombre"], cli["telefono"])
        return None    
    def _leer_clientes(self):
        with open(self.nomA, 'r') as f:
            return json.load(f)

if __name__ == "__main__":
    archivo = ArchivoCliente("clientes.json")
    
   
    with open("clientes.json", 'w') as f:
        json.dump([], f)   
    #1
    archivo.guardaCliente(Cliente(1, "Carla Pérez", 76512469))
    archivo.guardaCliente(Cliente(2, "Pancho Gómez", 78924598))
    archivo.guardaCliente(Cliente(3, "Pepito Alcachofas", 60182356)) 
    #2
    print("Buscar ID 1")
    print(archivo.buscarCliente(2) or "No encontrado") 
    #3
    print("---------------------------------------------------")
    print("\nEncontrar teléfono 60182356 ---")
    print(archivo.buscarCelularCliente(60182356) or "No encontrado")
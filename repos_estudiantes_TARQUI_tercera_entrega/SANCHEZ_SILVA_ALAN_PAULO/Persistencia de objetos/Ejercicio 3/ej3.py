import json

class Cliente:
    def __init__(self,id, nombre, telefono):
        self.id = id
        self.nombre = nombre
        self.telefono = telefono
    
    def to_dict(self):
        return{
            'id':self.id,
            'nombre':self.nombre,
            'telefono':self.telefono
        }
    @staticmethod
    def from_dict(datos):
        return Cliente(datos['id'], datos['nombre'], datos['telefono'])
    
    def __str__(self):
        return f"ID. {self.id}\nNombre: {self.nombre}\n Telefono: {self.telefono}"

class ArchivoCliente:
    def __init__(self,nomA):
        self.nomA = nomA
        self.clientes = []
        self.cargar_archivo()
    
    
    def crear_archivo(self):
        self.clientes = []
        self.guardar_archivo()
    
    def guardar_archivo(self):
        with open(self.nomA, "w") as file :
            json.dump([c.to_dict() for c in self.clientes ], file, indent=4)
            
    def cargar_archivo(self):
        try:
            with open(self.nomA, "r") as file:
                datos = json.load(file)
                self.clientes = [Cliente.from_dict(d) for d in datos]
        except FileNotFoundError:
            self.clientes = []
        
        
    def guardar_cliente(self,c):
        self.clientes.append(c)
        self.guardar_archivo()
    
    #b)
    def buscar_cliente(self, c):
        #a travez del id
        for cliente in self.clientes:
            if cliente.id == c:
                return cliente
        return None
    
    #c)
    def buscar_celular_cliente(self,c):
        for cliente in self.clientes:
            if cliente.id == c:
                return cliente
        return None
#Main
archivo = ArchivoCliente("clientes.json")
archivo.crear_archivo()

#guardando datos
archivo.guardar_cliente(Cliente(1,"Jose" , 123))
archivo.guardar_cliente(Cliente(2,"Miguel" , 456))
archivo.guardar_cliente(Cliente(3,"Raul" , 789))

#Buscando cliente por su nombre
cliente = archivo.buscar_cliente(2)
if cliente:
    print("Econtrado!", cliente)
else:
    print("No se pudo encontrar al cliente...")
    
#Buscando el celular del cliente
cliente_2 = archivo.buscar_celular_cliente(1)
if cliente_2:
    print(f"Se econtro el telefono del cliente: {cliente_2}")

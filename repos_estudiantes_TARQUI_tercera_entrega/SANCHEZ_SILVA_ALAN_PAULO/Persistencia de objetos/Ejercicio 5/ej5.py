import json
import os

class Medicamento:
    def __init__(self,nombre, codMedicamento, tipo, precio):
        self.__nombre = nombre
        self.__codMedicamento = codMedicamento
        self.__tipo = tipo
        self.__precio= precio
    
    #Convirtiendo los objetos a un diiccionario 
    def to_dict(self):
        return{
            "nombre":self.__nombre,
            "codigo":self.__codMedicamento,
            "tipo":self.__tipo,
            "precio":self.__precio
        }
    
    def  leer(self):
        self.__nombre = input("Ingrese el nombre del medicamento:")
        self.__codMedicamento = int(input("Ingrese el código del medicamento:"))
        self.__tipo = input("Ingrese el tipo de medicamento;")
        self.__precio = input("Ingrese el precio del medicamento:")
    
    def  __str__(self):
        return f"Nombre: {self.__nombre}\nCodigo del medicamento: {self.__codMedicamento}\nTipo: {self.__tipo}\nPrecio: {self.__precio}"
    
    def getTipo(self):
        return self.__tipo
    def getPrecio(self):
        return self.__precio
    

class Farmacia:
    def __init__(self, nombre, sucrusal, direccion ,  nroMedicamentos):
        self.__nombreFarmacia= nombre
        self.__sucursal = sucrusal
        self.__direccion = direccion
        self.__nroMedicamentos = nroMedicamentos
        self.__m = []
        
    def agregar_medicamento(self, medicamento):
        self.__m.append(medicamento)
    
    #Convirtiendo los objetos a un diiccionario 
    def to_dict(self):
        return{
            "nombreFarmacia": self.__nombreFarmacia,
            "sucursal":self.__sucursal,
            "direccion":self.__direccion,
            "nroMedicamentos":self.__nroMedicamentos,
            "medicamentos":[med.to_dict() for med in self.__m]
        }
        
    def leer(self):
        self.__nombreFarmacia = input("Ingrese el nombre de la farmacia:")
        self.__sucursal = int(input("Ingrese el número de la sucursal:"))
        self.__direccion = input("Ingrese la direccion:")
        self.__nroMedicamentos = int(input("Ingrese el número de medicamentos:"))
    
    def __str__(self):
        cad =  f"Nombre: {self.__nombreFarmacia}\nSucursal: {self.__sucursal}\nDireccion: {self.__direccion}\nNúmero de medicamentos: {self.__nroMedicamentos}"
        for medicamento in self.m:
            cad += medicamento + "\n"
        return cad
    
    def getDireccion(self):
        return self.__direccion
    def getSucursal(self):
        return self.__sucursal
    
    def mostrarMedcamentos(self,x):
        for i in self.__m:
            if i.tipo == x:
                return i
        return None
    
    def buscarMedicamento(self,x):
        for i in self.__m:
            if i.nombre == x:
                return i
        return None
    
class ArchFarmacia:
        def __init__(self,na):
            self.na = na
        
        #Creando el archivo json si no existe
        def crear_archivo(self):
            if not os.path.exists(self.na):
                with open(self.na , "w") as file:
                    json.dump([] , file, indent=4)
                print(f"Archivo {self.na} creado exitosamente...")
        
        #Añadendo una farmacia al archivo
        def adicionar(self, farmacia):
                with open(self.na, "r") as file:
                    datos = json.load(file)
                datos.append(farmacia.to_dict())
                with open(self.na, "w") as file:
                    json.dump(datos, file, indent=4)
                print("Farmacia se agregó correctamente...")
        
        #Listando todas las farmacais y sus medicamentos
        def listar(self):
            with open(self.na, "r") as file:
                datos = json.load(file)
            for d in datos:
                print(f"Nombre de la farmacia: {d['nombreFarmacia']}")
                print(f"Sucursal: {d['sucursal']}")
                print(f"Direccion: {d['direccion']}")
                print(f"Numero de medicamentos:{d['nroMedicamentos']}")
                print("Medicamentos:")
                for med in d['medicamentos']:
                    print(f" - {med['nombre']} | Tipo: {med['tipo']} | Precio:{med['precio']}")
                print("-"*40)
        def mostrarMedicamentosResfrio(self):
            with open(self.na, "r") as file:
                datos = json.load(file)
            print("Medicamentos para resfrio:")
            for d in datos:
                for med in d['medicamentos']:
                    if med['tipo'].lower() == "resfrio":
                        print(f"{med['nombre']} - Precio:{med['precio']} (Farmacia: {d['nombreFarmacia']})")
                        
        def precioMedicamentoTos(self, nombreMedicamento):
            with open(self.na , "r") as file:
                datos = json.load(file)
            for d in datos:
                for med in d['medicamentos']:
                    if med["tipo"].lower() == "tos" and med['nombre'].lower() == nombreMedicamento.lower():
                        print(f"El precio de {nombreMedicamento} es {med['precio']}")
                        return
            print(f"No se encontró el medicamento {nombreMedicamento} para la tos.")
        
        def mostrarMedicamentosMenorTos(self, precioLim):
            with open(self.na , "r") as file:
                datos = json.load(file)
            print(f"Medicamentos para la tos con menor precio a {precioLim}")
            for d in datos:
                for med in d['medicamentos']:
                    if med['tipo'].lower() == "tos" and med['precio'] < precioLim:
                        print(f"{med['nombre']} - Precio:{med['preciio']} (Farmacia:{d['nombreFarmacia']})")
                        
#Main
archivo = ArchFarmacia("farmacias.json")
archivo.crear_archivo()

#Creando  y guardando una farmacia
farmacia_1 = Farmacia("Bolivia", 1, "prado", 30)
medicamento_1 = Medicamento("Antitosico", 101, "Tos" , 25.5)
medicamento_2 = Medicamento("Refrianex" , 102 , "Resfrio" , 10.00)
farmacia_1.agregar_medicamento(medicamento_1)
farmacia_1.agregar_medicamento(medicamento_2)

archivo.adicionar(farmacia_1)

#Listando
archivo.listar()

#Mostrando medicamentos para el resfrio
archivo.mostrarMedicamentosResfrio()

#Buscando precio de un medicamento para la tos
archivo.precioMedicamentoTos("Antitosico")

#Mostrando medicamentos para la tos con precio menor a 20
archivo.mostrarMedicamentosMenorTos(20)
import pickle
from Farmacia import Farmacia

class ArchFarmacia:
    def __init__(self, na="farmacias.txt"):
        self.na = na
    
    def crearArchivo(self):
        try:
            with open(self.na, 'wb') as archivo:
                pickle.dump([], archivo)
            return True
        except:
            return False
    
    def adicionar(self, farmacia):
        try:
            farmacias = []
            try:
                with open(self.na, 'rb') as archivo:
                    farmacias = pickle.load(archivo)
            except (FileNotFoundError, EOFError):
                pass
            
            farmacias.append(farmacia)
            
            with open(self.na, 'wb') as archivo:
                pickle.dump(farmacias, archivo)
            
            return True
        except:
            return False
    
    def listar(self):
        try:
            with open(self.na, 'rb') as archivo:
                farmacias = pickle.load(archivo)
                return farmacias
        except (FileNotFoundError, EOFError):
            return []
        except:
            return None
    
    def actualizar(self, sucursal, farmacia_nueva):
        try:
            farmacias = self.listar()
            if farmacias is None:
                return False
                
            for i, farmacia in enumerate(farmacias):
                if farmacia.sucursal == sucursal:
                    farmacias[i] = farmacia_nueva
                    
            with open(self.na, 'wb') as archivo:
                pickle.dump(farmacias, archivo)
            
            return True
        except:
            return False
    
    def eliminar(self, sucursal):
        try:
            farmacias = self.listar()
            if farmacias is None:
                return False
                
            farmacias = [f for f in farmacias if f.sucursal != sucursal]
            
            with open(self.na, 'wb') as archivo:
                pickle.dump(farmacias, archivo)
            
            return True
        except:
            return False
    
    def buscarPorSucursal(self, sucursal):
        farmacias = self.listar()
        if farmacias:
            for farmacia in farmacias:
                if farmacia.sucursal == sucursal:
                    return farmacia
        return None
    
    def medicamentosTos(self, sucursal_num):
        farmacias = self.listar()
        medicamentos = []
        if farmacias:
            for farmacia in farmacias:
                if farmacia.getSucursal() == sucursal_num:
                    for med in farmacia.Medicamento:
                        if med.getTipo().lower() == "tos":
                            medicamentos.append(med)
        return medicamentos
    
    def buscarGolpex(self):
        farmacias = self.listar()
        resultados = []
        if farmacias:
            for farmacia in farmacias:
                for med in farmacia.Medicamento:
                    if med.nombre.lower() == "golpex":
                        resultados.append(farmacia)
                        break
        return resultados
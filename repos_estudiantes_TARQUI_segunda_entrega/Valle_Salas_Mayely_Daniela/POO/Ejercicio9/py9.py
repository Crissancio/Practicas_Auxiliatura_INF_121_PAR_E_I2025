class Computadora:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.estado = 'Apagada'  

    def encender(self):
        if self.estado == 'Apagada':
            self.estado = 'Encendida'
            print(f"La computadora {self.marca} {self.modelo} está {self.estado}.")
        else:
            print(f"La computadora {self.marca} {self.modelo} ya está {self.estado}.")
    
    def apagar(self):
        if self.estado == 'Encendida':
            self.estado = 'Apagada'
            print(f"La computadora {self.marca} {self.modelo} está {self.estado}.")
        else:
            print(f"La computadora {self.marca} {self.modelo} ya está {self.estado}.")
    
    def mostrar_componentes(self):
        componentes = [
            'Procesador',
            'Placa madre',
            'Memoria RAM',
            'Disco duro',
            'Tarjeta gráfica',
            'Fuente de poder'
        ]
        print(f"Componentes de la computadora {self.marca} {self.modelo}:")
        for componente in componentes:
            print(f"- {componente}")

mi_computadora = Computadora('Lenovo', 'ThinkPad L14 (14”, Intel)')

mi_computadora.mostrar_componentes()

mi_computadora.encender()
mi_computadora.apagar()

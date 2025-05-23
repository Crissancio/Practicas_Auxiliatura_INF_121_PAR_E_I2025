class Vehiculo:
    def __init__(self,marca,modelo,ano,precio_base):
        self._marca=marca
        self._modelo=modelo
        self._ano=ano
        self._precio_base=precio_base
    def get_marca(self):
        return self._marca
    def get_modelo(self):
        return self._modelo
    def get_ano(self):
        return self._ano
    def get_precio_base(self):
        return self._precio_base
    def set_marca(self, marca):
        self._marca = marca
    def set_modelo(self, modelo):
        self._modelo = modelo
    def set_ano(self, ano):
        self._ano = ano
    def set_precio_base(self, precio_base):
        self._precio_base = precio_base
    def mostrar_info(self):
        print(f"Marca: {self._marca}")
        print(f"Modelo: {self._modelo}")
        print(f"Año: {self._ano}")
        print(f"Precio Base: {self._precio_base}")
class Coche(Vehiculo):
    def __init__(self,marca,modelo,ano,precio_base,num_puertas,tipo_combustible):
        super().__init__(marca,modelo,ano,precio_base)
        self._num_puertas=num_puertas
        self._tipo_combustible=tipo_combustible
    def get_num_puertas(self):
        return self._num_puertas
    def get_tipo_combustible(self):
        return self._tipo_combustible
    def set_num_puertas(self, num_puertas):
        self._num_puertas = num_puertas
    def set_tipo_combustible(self, tipo_combustible):
        self._tipo_combustible = tipo_combustible
    def mostrar_info(self):
        print(" ")
        print("COCHE:")
        super().mostrar_info()
        print(f"Numero de puertas: {self._num_puertas}")
        print(f"Tipo de combustible: {self._tipo_combustible}")
       
class Moto(Vehiculo):
    def __init__(self,marca,modelo,ano,precio_base,cilindrada,tipo_motor):
        super().__init__(marca,modelo,ano,precio_base)
        self._cilindrada=cilindrada
        self._tipo_motor=tipo_motor
    def get_cilindrada(self):
        return self._cilindrada
    def get_tipo_motor(self):
        return self._tipo_motor
    def set_cilindrada(self, cilindrada):
        self._cilindrada = cilindrada
    def set_tipo_motor(self, tipo_motor):
        self._tipo_motor = tipo_motor
    def mostrar_info(self):
        print(" ")
        print("MOTO:")
        super().mostrar_info()
        print(f"Cilindrada: {self._cilindrada}")
        print(f"Tipo de motor: {self._tipo_motor}")
def mostrarMas4(lisc):
        print(" ")
        print("c)mostrar todos los coches que tienen mas de 4 puertas")
        for coche in lisc:
            if coche.get_num_puertas()>4:
                coche.mostrar_info()
def mosActual(lisv):
    print(" ")
    print("d)Mostrar los coches y motos actuales (gestión 2025) ")
    for vehi in lisv:
        if vehi.get_ano() == 2025:
            vehi.mostrar_info()
c1=Coche("Toyota","Corolla",2025,123456,2,"Gasolina")
c3=Coche("NISAN","Camioneta",2015,365895,5,"Gasolina")
c2=Coche("Ford","Explorer",2025,987423,6,"Diesel")
m1=Moto("Yamaha","Vespa",2016,2644,"361cc","7T")
m2=Moto("BMW","Naked",2025,36428,"302cc","4T")
c1.mostrar_info()
c2.mostrar_info()
c3.mostrar_info()
m1.mostrar_info()
m2.mostrar_info()
lisc=[c1,c2,c3]
mostrarMas4(lisc)
lisv=[c1,c2,c3,m1,m2]
mosActual(lisv)

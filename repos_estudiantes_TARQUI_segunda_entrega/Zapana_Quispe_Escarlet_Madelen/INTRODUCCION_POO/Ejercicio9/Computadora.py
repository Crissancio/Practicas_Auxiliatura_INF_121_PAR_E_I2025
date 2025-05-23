class Computadora:
    def __init__(self,cpu,ram,ssd,gpu,perifericos):
        self.__cpu=cpu
        self.__ram=ram
        self.__ssd=ssd
        self.__gpu=gpu
        self.__perifericos=perifericos
    def Encendido(self):
        print ("la Computadora esta encendida")
    def Apagado(self):
        print ("la Computadora esta apagada")
C=Computadora(" Intel Core i5-12600K ",16,"Kingston A2000 500 GB ","NVIDIA ","teclado y raton")
C.Encendido()
C.Apagado()
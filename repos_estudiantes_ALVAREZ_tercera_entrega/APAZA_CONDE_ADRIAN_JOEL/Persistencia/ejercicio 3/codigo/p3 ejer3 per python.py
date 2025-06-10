'''
Ejercicio 3 : Persistencia
a) Implementar el diagrama de clases.
b) Implementar buscarCliente(int c) a traves del id.
c) Implementa mayorSalario(float sueldo), que devuelva al primer empleado con sueldo mayor al ingresado.
'''

# a) Implementar el diagrama de clases.
class Cliente:
    def __init__(self, id, n, t):
        self.id = id
        self.nombre = n
        self.telefono = t

    def __str__(self):
        return f"{self.id},{self.nombre},{self.telefono}"

    @staticmethod
    def desdeCadena(x):
        b = x.split(",")
        id = int(b[0])
        nombre = b[1]
        telefono = int(b[2])
        return Cliente(id, nombre, telefono)

# a) Implementar el diagrama de clases.
class ArchivoCliente:
    def __init__(self, n):
        self.nomA = n

    def crearArchivo(self):
        try:
            archivo = open(self.nomA, "a")  
            archivo.close()
        except IOError:
            print("se produjo un error al crear el archivo.")

    def guardaCliente(self, c):
        try:
            with open(self.nomA, "a") as f:
                f.write(str(c) + "\n")
        except IOError:
            print("error al guardar al cliente")

    # b) Implementar buscarCliente(int c) a traves del id.
    def buscarCliente(self, c):
        try:
            with open(self.nomA, "r") as f:
                for linea in f:
                    cli = Cliente.desdeCadena(linea.strip())
                    if cli.id == c:
                        return cli
        except IOError:
            print("no se encontro al cliente")
        return None

    # c) Implementa buscarCelularCliente(int c), que devuelva los datos del cliente junto al número de celular.
    def buscarCelularCliente(self, c):
        return self.buscarCliente(c)



if __name__ == "__main__":
    archivo = ArchivoCliente("clientes.txt")
    archivo.crearArchivo()

    # a) guardando a los clientes
    cl1 = Cliente(101, "Carlos", 76543210)
    cl2 = Cliente(102, "María", 71234567)
    archivo.guardaCliente(cl1)
    archivo.guardaCliente(cl2)

    # b) buscando al cliente por su id
    buscado = archivo.buscarCliente(102)
    if buscado is not None:
        print("Cliente encontrado: " + str(buscado))
    else:
        print("Cliente no encontrado.")

    # c) buscando al otro cliente incluyendo su num
    conCelular = archivo.buscarCelularCliente(101)
    if conCelular is not None:
        print(f"Cliente con celular: {conCelular.nombre} - {conCelular.telefono}")
    else:
        print("Cliente no encontrado para mostrar celular.")

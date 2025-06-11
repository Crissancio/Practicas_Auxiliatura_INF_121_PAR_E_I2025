'''

------------------EJERCICIO 1 ------------------


Crea una clase genérica Caja<T>; para guardar algún tipo de objeto 
a) Agrega métodos guardar() y obtener() 
b) Crea dos instancias de la caja y almacena 2 datos de diferente tipo 
c) Muestra el contenido de las cajas
'''

from Caja import Caja

def main():
    
    #b)
    caja_string: Caja[str] = Caja[str]()
    print(f"Estado inicial: {caja_string}")
    
    texto = "Hola soy Luisito Comunica"
    caja_string.guardar(texto)
    print(f"Estado después de guardar: {caja_string}\n")
    
    caja_numero: Caja[int] = Caja[int]()
    print(f"Estado inicial: {caja_numero}")
    
    numero = 7
    caja_numero.guardar(numero)
    print(f"Estado después de guardar: {caja_numero}\n")
    
    #c)
    print("Mostrando contenido de las cajas:")
    print("-" * 40)
    
    contenido_string = caja_string.obtener()
    print(f"Contenido de caja_string: {contenido_string} (Tipo: {type(contenido_string).__name__})")
    
    contenido_numero = caja_numero.obtener()
    print(f"Contenido de caja_numero: {contenido_numero} (Tipo: {type(contenido_numero).__name__})")
    
    print(f"¿Caja string está vacía? {caja_string.esta_vacia()}")
    print(f"¿Caja número está vacía? {caja_numero.esta_vacia()}")

if __name__ == "__main__":
    main()
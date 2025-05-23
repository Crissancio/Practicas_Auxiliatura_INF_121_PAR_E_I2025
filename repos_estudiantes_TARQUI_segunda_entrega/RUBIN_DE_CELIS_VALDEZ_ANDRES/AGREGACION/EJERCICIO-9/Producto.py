class Producto:
    def __init__(self, nombre: str, precio: float):
        self.__nombre = nombre
        self.__precio = precio

    def get_nombre(self) -> str:
        return self.__nombre
    
    def set_nombre(self, nombre: str) -> None:
        self.__nombre = nombre
    
    def get_precio(self) -> float:
        return self.__precio
    
    def set_precio(self, precio: float) -> None:
        self.__precio = precio
    
    def mostrar_info(self) -> None:
        print(f"Producto: {self.__nombre}, Precio: ${self.__precio:.2f}")

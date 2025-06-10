
from Cliente import Cliente
from ArchivoCliente import ArchivoCliente

if __name__ == "__main__":
    nombre_archivo_clientes = "clientes_ejercicio3.txt"
    archivo_cliente = ArchivoCliente(nombre_archivo_clientes)

    archivo_cliente.limpiar_archivo()

    print("\n--- Guardando Clientes ---")
    cli1 = Cliente(101, "Ana Lopez", 77712345)
    cli2 = Cliente(102, "Juan Perez", 70098765)
    cli3 = Cliente(103, "Maria Gomez", 61234567)
    cli4 = Cliente(104, "Pedro Sanchez", 77712345) 

    archivo_cliente.guarda_cliente(cli1)
    archivo_cliente.guarda_cliente(cli2)
    archivo_cliente.guarda_cliente(cli3)
    archivo_cliente.guarda_cliente(cli4)

    print("\n--- Buscando Cliente por ID ---")
    # b) 
    id_busqueda1 = 102
    cliente_encontrado_id1 = archivo_cliente.buscar_cliente(id_busqueda1)
    if cliente_encontrado_id1:
        print(f"Cliente con ID {id_busqueda1} encontrado: {cliente_encontrado_id1}")
    else:
        print(f"Cliente con ID {id_busqueda1} no encontrado.")

    id_busqueda2 = 105
    cliente_encontrado_id2 = archivo_cliente.buscar_cliente(id_busqueda2)
    if cliente_encontrado_id2:
        print(f"Cliente con ID {id_busqueda2} encontrado: {cliente_encontrado_id2}")
    else:
        print(f"Cliente con ID {id_busqueda2} no encontrado.")

    print("\n--- Buscando Cliente por Numero de Celular ---")
    # c) 
    telefono_busqueda1 = 77712345
    cliente_encontrado_tel1 = archivo_cliente.buscar_celular_cliente(telefono_busqueda1)
    if cliente_encontrado_tel1:
        
        print(f"Cliente con celular {telefono_busqueda1} encontrado: {cliente_encontrado_tel1}")
    else:
        print(f"Cliente con celular {telefono_busqueda1} no encontrado.")

    telefono_busqueda2 = 60000000
    cliente_encontrado_tel2 = archivo_cliente.buscar_celular_cliente(telefono_busqueda2)
    if cliente_encontrado_tel2:
        print(f"Cliente con celular {telefono_busqueda2} encontrado: {cliente_encontrado_tel2}")
    else:
        print(f"Cliente con celular {telefono_busqueda2} no encontrado.")

    
    print(f"\nContenido final del archivo '{nombre_archivo_clientes}':")
    try:
        with open(nombre_archivo_clientes, 'r') as f:
            print(f.read())
    except FileNotFoundError:
        print("El archivo no existe aún.")
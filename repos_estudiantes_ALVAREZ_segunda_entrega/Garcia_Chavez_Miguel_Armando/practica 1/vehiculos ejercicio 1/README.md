# Proyecto Vehículos

Este proyecto consiste en un sistema de gestión de vehículos que incluye clases para representar diferentes tipos de vehículos, como coches y motos. A continuación se describen los archivos y su funcionalidad.

## Estructura del Proyecto

```
vehiculos
├── src
│   ├── Vehiculo.java      # Clase base que define las propiedades comunes de un vehículo.
│   ├── Coche.java         # Clase que extiende Vehiculo y define propiedades específicas de un coche.
│   ├── Moto.java          # Clase que extiende Vehiculo y define propiedades específicas de una moto.
│   └── Main.java          # Clase principal que ejecuta el programa y muestra la información de los vehículos.
└── README.md              # Documentación del proyecto.
```

## Descripción de Archivos

- **src/Vehiculo.java**: Define la clase `Vehiculo` con propiedades protegidas como `marca`, `modelo`, `año` y `precio_base`. Incluye un constructor, un método `mostrar_info` para imprimir la información del vehículo, y métodos getter y setter para cada propiedad.

- **src/Coche.java**: Define la clase `Coche`, que hereda de `Vehiculo`. Tiene propiedades privadas `num_puertas` y `tipo_combustible`, un constructor para inicializar estas propiedades, un método `mostrar_info` para imprimir la información del coche, y métodos getter y setter.

- **src/Moto.java**: Define la clase `Moto`, que también hereda de `Vehiculo`. Tiene propiedades privadas `cilindrada` y `tipo_motor`, un constructor para inicializar estas propiedades, un método `mostrar_info` para imprimir la información de la moto, y métodos getter y setter.

- **src/Main.java**: Contiene la clase `Main` con el método `main`, donde se crean instancias de `Coche` y `Moto`, se imprime la información de cada vehículo, y se muestran los coches con más de 4 puertas y los vehículos del año 2025.

## Cómo Ejecutar el Proyecto

1. Asegúrate de tener Java instalado en tu sistema.
2. Compila los archivos Java en la carpeta `src`.
3. Ejecuta la clase `Main` para ver la información de los vehículos.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas mejorar el proyecto, por favor abre un issue o envía un pull request.
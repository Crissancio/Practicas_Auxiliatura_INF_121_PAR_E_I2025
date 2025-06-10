#5.- Sea el siguiente diagrama de clases:
import json

# Clase Farmacia
class Farmacia:
    def __init__(self, nombre, sucursal, direccion, medicamentos):
        self.nombre = nombre
        self.sucursal = sucursal
        self.direccion = direccion
        self.medicamentos = medicamentos

    def to_dict(self):
        return {
            "nombre": self.nombre,
            "sucursal": self.sucursal,
            "direccion": self.direccion,
            "medicamentos": self.medicamentos
        }

    @staticmethod
    def from_dict(data):
        return Farmacia(data["nombre"], data["sucursal"], data["direccion"], data["medicamentos"])

    def __str__(self):
        return (f"Farmacia: {self.nombre}, Sucursal: {self.sucursal}, "
                f"Dirección: {self.direccion}, Medicamentos: {self.medicamentos}")
    
# Crear instancias de farmacias
farmacia1 = Farmacia("Farmacia Central", 1, "Av. Principal 123", ["Paracetamol", "Ibuprofeno"])
farmacia2 = Farmacia("Farmacia Oeste", 2, "Calle Oeste 45", ["Aspirina", "Golpex"])

# Guardar en archivo JSON
farmacias = [farmacia1, farmacia2]
with open('farmacias.json', 'w') as f:
    json.dump([farmacia.to_dict() for farmacia in farmacias], f)

# Leer y mostrar
print("=== Farmacias leídas del archivo ===")
with open('farmacias.json', 'r') as f:
    farmacias_leidas_data = json.load(f)
    farmacias_leidas = [Farmacia.from_dict(data) for data in farmacias_leidas_data]

for f in farmacias_leidas:
    print(f)

X = 1
print(f"\nMedicamentos en la sucursal {X}:")
for f in farmacias_leidas:
    if f.sucursal == X:
        print(f"Medicamentos: {f.medicamentos}")

print("\nFarmacias que tienen 'Golpex':")
for f in farmacias_leidas:
    if "Golpex" in f.medicamentos:
        print(f"Farmacia: {f.nombre}, Sucursal: {f.sucursal}, Dirección: {f.direccion}")
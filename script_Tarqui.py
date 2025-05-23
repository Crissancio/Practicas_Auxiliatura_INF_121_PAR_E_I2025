import os
import pandas as pd
import json
from git import Repo, GitCommandError

# Ruta del archivo CSV
ruta_csv = "estudiantes_segunda_entrega.csv"

# Leer el CSV
df = pd.read_csv(ruta_csv)

# --- Solicitar rango de revisión por consola ---
inicio = 42
fin = 86
sub_df = df.iloc[inicio:fin]

# Lista para errores
errores = []

# Carpeta base donde guardar todos los repos
base_dir = "repos_estudiantes_TARQUI_segunda_entrega"
os.makedirs(base_dir, exist_ok=True)

# Recorrer cada fila del rango seleccionado
for index, row in sub_df.iterrows():
    paterno = str(row["APELLIDO PATERNO"]).strip()
    materno = str(row["APELLIDO MATERNO"]).strip()
    nombres = str(row["NOMBRES"]).strip()
    enlace = str(row["ENLACE DE SU REPOSITORIO"]).strip()

    # Nombre de carpeta
    nombre_carpeta = f"{paterno}_{materno}_{nombres}".replace(" ", "_")
    ruta_destino = os.path.join(base_dir, nombre_carpeta)

    try:
        # Crear carpeta del estudiante
        os.makedirs(ruta_destino, exist_ok=True)

        # Clonar repositoriox
        Repo.clone_from(enlace, ruta_destino)
        print(f"✅ Clonado: {nombre_carpeta}")

    except GitCommandError as e:
        print(f"❌ Error con {nombre_carpeta}: {e}")
        errores.append({
            "paterno": paterno,
            "materno": materno,
            "nombre": nombres,
            "enlace": enlace,
            "error_msg": str(e)
        })

# Guardar errores en JSON
with open("errores_TARQUI.json", "w", encoding="utf-8") as f:
    json.dump(errores, f, indent=2, ensure_ascii=False)

print("\n✅ Proceso finalizado.")
print(f"Errores encontrados: {len(errores)} (ver 'errores_TARQUI_2.json')")
import os
import shutil
import glob

# Ruta base con comodín
base_path = "./repos_estudiantes_ALVAREZ_segunda_entrega/*/"

# Usa glob para obtener todas las rutas que coincidan
carpetas = glob.glob(base_path)

if not carpetas:
    print(f"No se encontraron carpetas en la ruta: {base_path}")
    exit()

# Recorre cada carpeta encontrada
for ruta_carpeta in carpetas:
    if os.path.isdir(ruta_carpeta):
        ruta_git = os.path.join(ruta_carpeta, ".git")

        if os.path.exists(ruta_git):
            try:
                shutil.rmtree(ruta_git)
                print(f"✅ .git eliminado en: {ruta_carpeta}")
            except Exception as e:
                print(f"❌ Error eliminando .git en {ruta_carpeta}: {e}")
        else:
            print(f"ℹ️ No se encontró .git en: {ruta_carpeta}")

print("\n🧹 Limpieza finalizada.")

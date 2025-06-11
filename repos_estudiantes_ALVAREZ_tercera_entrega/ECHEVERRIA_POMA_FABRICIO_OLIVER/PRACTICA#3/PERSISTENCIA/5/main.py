''''

-------------------- EJERCICIO 5 --------------------


a) Crear, leer y mostrar un Archivo de Farmacias
b) Mostrar los medicamentos para la tos, de la Sucursal numero X
c) Mostrar el número de sucursal y su dirección que tienen el medicamento
“Golpex”

'''


import tkinter as tk
from tkinter import ttk, messagebox, simpledialog
from ArchFarmacia import ArchFarmacia
from Farmacia import Farmacia
from Medicamento import Medicamento

class FarmaciaApp:
    def __init__(self, root):
        self.root = root
        self.root.title("Sistema de Farmacias CRUD")
        self.root.geometry("800x600")
        self.root.configure(bg="#f0f0f0")
        
        self.arch = ArchFarmacia()
        self.arch.crearArchivo()
        
        self.setup_ui()
        self.actualizar_lista()
    
    def setup_ui(self):
        title_label = tk.Label(self.root, text="SISTEMA DE FARMACIAS", 
                              font=("Arial", 16, "bold"), bg="#f0f0f0", fg="#2c3e50")
        title_label.pack(pady=10)
        
        button_frame = tk.Frame(self.root, bg="#f0f0f0")
        button_frame.pack(pady=10)
        
        tk.Button(button_frame, text="CREAR", command=self.crear_farmacia,
                 bg="#27ae60", fg="white", font=("Arial", 10, "bold"),
                 width=12, height=2).grid(row=0, column=0, padx=5)
        
        tk.Button(button_frame, text="LEER", command=self.leer_farmacias,
                 bg="#3498db", fg="white", font=("Arial", 10, "bold"),
                 width=12, height=2).grid(row=0, column=1, padx=5)
        
        tk.Button(button_frame, text="ACTUALIZAR", command=self.actualizar_farmacia,
                 bg="#f39c12", fg="white", font=("Arial", 10, "bold"),
                 width=12, height=2).grid(row=0, column=2, padx=5)
        
        tk.Button(button_frame, text="ELIMINAR", command=self.eliminar_farmacia,
                 bg="#e74c3c", fg="white", font=("Arial", 10, "bold"),
                 width=12, height=2).grid(row=0, column=3, padx=5)
        
        consultas_frame = tk.Frame(self.root, bg="#f0f0f0")
        consultas_frame.pack(pady=20)
        
        tk.Label(consultas_frame, text="CONSULTAS ESPECIALES", 
                font=("Arial", 12, "bold"), bg="#f0f0f0", fg="#34495e").pack()
        
        consultas_buttons = tk.Frame(consultas_frame, bg="#f0f0f0")
        consultas_buttons.pack(pady=10)
        
        tk.Button(consultas_buttons, text="Medicamentos Tos\npor Sucursal", 
                 command=self.medicamentos_tos_sucursal,
                 bg="#9b59b6", fg="white", font=("Arial", 9, "bold"),
                 width=15, height=2).pack(side=tk.LEFT, padx=5)
        
        tk.Button(consultas_buttons, text="Buscar Medicamento\n'Golpex'", 
                 command=self.buscar_golpex,
                 bg="#1abc9c", fg="white", font=("Arial", 9, "bold"),
                 width=15, height=2).pack(side=tk.LEFT, padx=5)
        
        tk.Button(consultas_buttons, text="GUARDAR CAMBIOS\nArchivo TXT", 
                 command=self.guardar_archivo_txt,
                 bg="#e67e22", fg="white", font=("Arial", 9, "bold"),
                 width=15, height=2).pack(side=tk.LEFT, padx=5)
        
        list_frame = tk.Frame(self.root, bg="#f0f0f0")
        list_frame.pack(fill=tk.BOTH, expand=True, padx=20, pady=10)
        
        tk.Label(list_frame, text="LISTA DE FARMACIAS", 
                font=("Arial", 12, "bold"), bg="#f0f0f0", fg="#34495e").pack()
        
        self.tree = ttk.Treeview(list_frame, columns=("Nombre", "Sucursal", "Direccion", "Medicamentos"), show="headings")
        self.tree.heading("Nombre", text="Nombre Farmacia")
        self.tree.heading("Sucursal", text="Sucursal")
        self.tree.heading("Direccion", text="Dirección")
        self.tree.heading("Medicamentos", text="Nro. Medicamentos")
        
        self.tree.column("Nombre", width=200)
        self.tree.column("Sucursal", width=100)
        self.tree.column("Direccion", width=250)
        self.tree.column("Medicamentos", width=150)
        
        scrollbar = ttk.Scrollbar(list_frame, orient=tk.VERTICAL, command=self.tree.yview)
        self.tree.configure(yscrollcommand=scrollbar.set)
        
        self.tree.pack(side=tk.LEFT, fill=tk.BOTH, expand=True)
        scrollbar.pack(side=tk.RIGHT, fill=tk.Y)
    
    def crear_farmacia(self):
        def guardar_farmacia():
            try:
                nombre = entry_nombre.get()
                sucursal = int(entry_sucursal.get())
                direccion = entry_direccion.get()
                
                if not nombre or not direccion:
                    messagebox.showerror("Error", "Todos los campos son obligatorios")
                    return
                
                farmacia = Farmacia(nombre, sucursal, direccion, 0)
                
                nro_med = int(entry_nro_med.get()) if entry_nro_med.get() else 0
                for i in range(nro_med):
                    med_window = tk.Toplevel(create_window)
                    med_window.title(f"Medicamento {i+1}")
                    med_window.geometry("400x300")
                    
                    tk.Label(med_window, text="Nombre:").pack()
                    med_nombre = tk.Entry(med_window, width=30)
                    med_nombre.pack()
                    
                    tk.Label(med_window, text="Código:").pack()
                    med_codigo = tk.Entry(med_window, width=30)
                    med_codigo.pack()
                    
                    tk.Label(med_window, text="Tipo:").pack()
                    med_tipo = tk.Entry(med_window, width=30)
                    med_tipo.pack()
                    
                    tk.Label(med_window, text="Precio:").pack()
                    med_precio = tk.Entry(med_window, width=30)
                    med_precio.pack()
                    
                    def agregar_medicamento():
                        try:
                            medicamento = Medicamento(
                                med_nombre.get(),
                                int(med_codigo.get()),
                                med_tipo.get(),
                                float(med_precio.get())
                            )
                            farmacia.agregarMedicamento(medicamento)
                            med_window.destroy()
                        except ValueError:
                            messagebox.showerror("Error", "Código debe ser número entero y precio decimal")
                    
                    tk.Button(med_window, text="Agregar Medicamento", 
                             command=agregar_medicamento).pack(pady=10)
                    
                    med_window.wait_window()
                
                if self.arch.adicionar(farmacia):
                    messagebox.showinfo("Éxito", "Farmacia creada exitosamente")
                    create_window.destroy()
                    self.actualizar_lista()
                else:
                    messagebox.showerror("Error", "No se pudo crear la farmacia")
                    
            except ValueError:
                messagebox.showerror("Error", "La sucursal debe ser un número")
        
        create_window = tk.Toplevel(self.root)
        create_window.title("Crear Farmacia")
        create_window.geometry("400x300")
        
        tk.Label(create_window, text="Nombre Farmacia:").pack()
        entry_nombre = tk.Entry(create_window, width=30)
        entry_nombre.pack()
        
        tk.Label(create_window, text="Número Sucursal:").pack()
        entry_sucursal = tk.Entry(create_window, width=30)
        entry_sucursal.pack()
        
        tk.Label(create_window, text="Dirección:").pack()
        entry_direccion = tk.Entry(create_window, width=30)
        entry_direccion.pack()
        
        tk.Label(create_window, text="Número de Medicamentos:").pack()
        entry_nro_med = tk.Entry(create_window, width=30)
        entry_nro_med.pack()
        
        tk.Button(create_window, text="Guardar", command=guardar_farmacia,
                 bg="#27ae60", fg="white", font=("Arial", 10, "bold")).pack(pady=20)
    
    def leer_farmacias(self):
        self.actualizar_lista()
        messagebox.showinfo("Información", "Lista actualizada")
    
    def actualizar_farmacia(self):
        sucursal = simpledialog.askinteger("Actualizar", "Ingrese número de sucursal a actualizar:")
        if sucursal:
            farmacia = self.arch.buscarPorSucursal(sucursal)
            if farmacia:
                def guardar_cambios():
                    try:
                        farmacia.nombreFarmacia = entry_nombre.get()
                        farmacia.direccion = entry_direccion.get()
                        
                        if self.arch.actualizar(sucursal, farmacia):
                            messagebox.showinfo("Éxito", "Farmacia actualizada exitosamente")
                            update_window.destroy()
                            self.actualizar_lista()
                        else:
                            messagebox.showerror("Error", "No se pudo actualizar la farmacia")
                    except Exception as e:
                        messagebox.showerror("Error", f"Error: {str(e)}")
                
                update_window = tk.Toplevel(self.root)
                update_window.title("Actualizar Farmacia")
                update_window.geometry("400x250")
                
                tk.Label(update_window, text="Nombre Farmacia:").pack()
                entry_nombre = tk.Entry(update_window, width=30)
                entry_nombre.pack()
                entry_nombre.insert(0, farmacia.nombreFarmacia)
                
                tk.Label(update_window, text="Dirección:").pack()
                entry_direccion = tk.Entry(update_window, width=30)
                entry_direccion.pack()
                entry_direccion.insert(0, farmacia.direccion)
                
                tk.Label(update_window, text=f"Sucursal: {farmacia.sucursal} (No modificable)").pack()
                
                tk.Button(update_window, text="Guardar Cambios", command=guardar_cambios,
                         bg="#f39c12", fg="white", font=("Arial", 10, "bold")).pack(pady=20)
            else:
                messagebox.showerror("Error", "Farmacia no encontrada")
    
    def eliminar_farmacia(self):
        sucursal = simpledialog.askinteger("Eliminar", "Ingrese número de sucursal a eliminar:")
        if sucursal:
            if messagebox.askyesno("Confirmar", f"¿Está seguro de eliminar la farmacia sucursal {sucursal}?"):
                if self.arch.eliminar(sucursal):
                    messagebox.showinfo("Éxito", "Farmacia eliminada exitosamente")
                    self.actualizar_lista()
                else:
                    messagebox.showerror("Error", "No se pudo eliminar la farmacia")
    
    def medicamentos_tos_sucursal(self):
        sucursal = simpledialog.askinteger("Consulta", "Ingrese número de sucursal:")
        if sucursal:
            medicamentos = self.arch.medicamentosTos(sucursal)
            
            result_window = tk.Toplevel(self.root)
            result_window.title(f"Medicamentos para Tos - Sucursal {sucursal}")
            result_window.geometry("500x400")
            
            if medicamentos:
                text_widget = tk.Text(result_window, width=60, height=20)
                text_widget.pack(padx=10, pady=10)
                
                for med in medicamentos:
                    text_widget.insert(tk.END, f"Nombre: {med.nombre}\n")
                    text_widget.insert(tk.END, f"Código: {med.codMedicamento}\n")
                    text_widget.insert(tk.END, f"Tipo: {med.tipo}\n")
                    text_widget.insert(tk.END, f"Precio: ${med.precio}\n")
                    text_widget.insert(tk.END, "-" * 30 + "\n")
                
                text_widget.config(state=tk.DISABLED)
            else:
                tk.Label(result_window, text="No se encontraron medicamentos para tos en esta sucursal").pack(pady=50)
    
    def buscar_golpex(self):
        farmacias = self.arch.buscarGolpex()
        
        result_window = tk.Toplevel(self.root)
        result_window.title("Farmacias con Medicamento 'Golpex'")
        result_window.geometry("500x400")
        
        if farmacias:
            text_widget = tk.Text(result_window, width=60, height=20)
            text_widget.pack(padx=10, pady=10)
            
            for farmacia in farmacias:
                text_widget.insert(tk.END, f"Sucursal: {farmacia.sucursal}\n")
                text_widget.insert(tk.END, f"Dirección: {farmacia.direccion}\n")
                text_widget.insert(tk.END, f"Farmacia: {farmacia.nombreFarmacia}\n")
                text_widget.insert(tk.END, "-" * 40 + "\n")
            
            text_widget.config(state=tk.DISABLED)
        else:
            tk.Label(result_window, text="No se encontró el medicamento 'Golpex' en ninguna farmacia").pack(pady=50)
    
    def guardar_archivo_txt(self):
        try:
            farmacias = self.arch.listar()
            if not farmacias:
                messagebox.showwarning("Advertencia", "No hay farmacias para guardar")
                return
            
            with open("d:/UMSA/SEGUNDO SEMESTRE/PROGRAMACION II/PRACTICAS AUX/PRACTICA#3/PERSISTENCIA/5/reporte_farmacias.txt", "w", encoding="utf-8") as archivo:
                archivo.write("=" * 60 + "\n")
                archivo.write("         REPORTE COMPLETO DE FARMACIAS\n")
                archivo.write("=" * 60 + "\n\n")
                
                for i, farmacia in enumerate(farmacias, 1):
                    archivo.write(f"FARMACIA {i}\n")
                    archivo.write("-" * 30 + "\n")
                    archivo.write(f"Nombre: {farmacia.nombreFarmacia}\n")
                    archivo.write(f"Sucursal: {farmacia.sucursal}\n")
                    archivo.write(f"Dirección: {farmacia.direccion}\n")
                    archivo.write(f"Número de Medicamentos: {farmacia.nroMedicamentos}\n\n")
                    
                    if farmacia.Medicamento:
                        archivo.write("MEDICAMENTOS:\n")
                        for j, med in enumerate(farmacia.Medicamento, 1):
                            archivo.write(f"  {j}. {med.nombre}\n")
                            archivo.write(f"     Código: {med.codMedicamento}\n")
                            archivo.write(f"     Tipo: {med.tipo}\n")
                            archivo.write(f"     Precio: ${med.precio}\n\n")
                    else:
                        archivo.write("No tiene medicamentos registrados.\n\n")
                    
                    archivo.write("=" * 60 + "\n\n")
                
                archivo.write("a) Archivo de Farmacias creado y mostrado\n")
                archivo.write("b) Medicamentos para la tos por sucursal consultados\n")
                archivo.write("c) Medicamento 'Golpex' ubicado en sucursales\n\n")
                
                from datetime import datetime
                archivo.write(f"Reporte generado el: {datetime.now().strftime('%d/%m/%Y %H:%M:%S')}\n")
            
            messagebox.showinfo("Éxito", "Archivo 'reporte_farmacias.txt' creado exitosamente")
            
        except Exception as e:
            messagebox.showerror("Error", f"No se pudo crear el archivo: {str(e)}")
    
    def actualizar_lista(self):
        for item in self.tree.get_children():
            self.tree.delete(item)
        
        farmacias = self.arch.listar()
        if farmacias:
            for farmacia in farmacias:
                self.tree.insert("", tk.END, values=(
                    farmacia.nombreFarmacia,
                    farmacia.sucursal,
                    farmacia.direccion,
                    farmacia.nroMedicamentos
                ))

def main():
    root = tk.Tk()
    app = FarmaciaApp(root)
    root.mainloop()

if __name__ == "__main__":
    main()
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicamento;
import java.util.ArrayList;

public class Farmacia {
    private String nombreFarmacia;
    private int sucursal;
    private String direccion;
    private ArrayList<Medicamento> medicamentos = new ArrayList<>();

    public Farmacia(String nombreFarmacia, int sucursal, String direccion) {
        this.nombreFarmacia = nombreFarmacia;
        this.sucursal = sucursal;
        this.direccion = direccion;
    }

    public void agregarMedicamento(Medicamento m) {
        medicamentos.add(m);
    }

    public int getSucursal() {
        return sucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void mostrar() {
        System.out.println("Farmacia: " + nombreFarmacia + ", Sucursal: " + sucursal +
                           ", Dirección: " + direccion);
        for (Medicamento m : medicamentos) {
            m.mostrar();
        }
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public boolean buscaMedicamento(String nombre) {
        for (Medicamento m : medicamentos) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    public String toArchivo() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombreFarmacia).append(";").append(sucursal).append(";").append(direccion).append("\n");
        for (Medicamento m : medicamentos) {
            sb.append(">>").append(m.toArchivo()).append("\n");
        }
        return sb.toString();
    }

    public static Farmacia fromArchivo(ArrayList<String> bloque) {
        String[] encabezado = bloque.get(0).split(";");
        Farmacia f = new Farmacia(encabezado[0], Integer.parseInt(encabezado[1]), encabezado[2]);
        for (int i = 1; i < bloque.size(); i++) {
            Medicamento m = Medicamento.fromArchivo(bloque.get(i).substring(2)); // remove ">>"
            f.agregarMedicamento(m);
        }
        return f;
    }
}

package PERSISTENCIA_DE_OBJETOS.EJER_5;
import java.io.*;
import java.util.ArrayList;
public class ArchFarmacia {
    private String nombreArchivo;

    public ArchFarmacia(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    // a) Guardar archivo de farmacias
    public void guardarFarmacias(ArrayList<Farmacia> lista) {
        //gurd arch bin
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            out.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // a) Leer farmacias
    public ArrayList<Farmacia> leerFarmacias() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            return (ArrayList<Farmacia>) in.readObject();
        } catch (Exception e) {
            return new ArrayList<>();
        }
    }

    // b) Mostrar medicamentos para la tos de sucursal X
    public void mostrarTosSucursal(int suc) {
        for (Farmacia f : leerFarmacias()) {
            if (f.getSucursal() == suc) {
                for (Medicamento m : f.getMedicamentosPorTipo("tos")) {
                    System.out.println(m);
                }
            }
        }
    }

    // c) Mostrar sucursal y dirección donde haya “Golpex”
    public void mostrarFarmaciasConGolpex() {
        for (Farmacia f : leerFarmacias()) {
            if (f.tieneMedicamento("Golpex")) {
                System.out.println("Sucursal: " + f.getSucursal() + ", Direccion: " + f.getDireccion());
            }
        }
    }
}

import java.io.*;
import java.util.ArrayList;
public class ArchivoFarmacia {
    private String nomA;
    public ArchivoFarmacia(String nomA) {
        this.nomA = nomA;
    }
    public void crearArchivo() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            oos.writeObject(new ArrayList<Farmacia>());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void guardarFarmacia(Farmacia f) {
        ArrayList<Farmacia> lista = leerArchivo();
        lista.add(f);
        escribirArchivo(lista);
    }
    public void mostrarZona(String zona) {
        ArrayList<Farmacia> lista = leerArchivo();
        for (Farmacia f : lista) {
            if (f.getZona().equalsIgnoreCase(zona)) {
                System.out.println(f);
            }
        }
    }
    public void mostrarStock(int cantidad) {
        ArrayList<Farmacia> lista = leerArchivo();
        for (Farmacia f : lista) {
            if (f.getStock() > cantidad) {
                System.out.println(f);
            }
        }
    }
    private ArrayList<Farmacia> leerArchivo() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA))) {
            return (ArrayList<Farmacia>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
    private void escribirArchivo(ArrayList<Farmacia> lista) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
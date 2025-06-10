package Persistencia_de_Objetos.Ejercicio3;

   import java.io.*;

class Medicamento implements Serializable {
    String nombre, tipo;
    int codMedicamento;
    double precio;

    public Medicamento(String nombre, int cod, String tipo, double precio) {
        this.nombre = nombre;
        this.codMedicamento = cod;
        this.tipo = tipo;
        this.precio = precio;
    }

    void mostrar() {
        System.out.println("Medicamento: " + nombre + ", Tipo: " + tipo + ", Precio: " + precio);
    }

    String getTipo() {
        return tipo;
    }

    String getNombre() {
        return nombre;
    }

    double getPrecio() {
        return precio;
    }
}

class Farmacia implements Serializable {
    String nombreFarmacia, direccion;
    int sucursal, nroMedicamentos;
    Medicamento[] m = new Medicamento[100];

    public Farmacia(String nombre, int sucursal, String direccion) {
        this.nombreFarmacia = nombre;
        this.sucursal = sucursal;
        this.direccion = direccion;
        this.nroMedicamentos = 0;
    }

    void adicionarMedicamento(Medicamento med) {
        m[nroMedicamentos++] = med;
    }

    void mostrar() {
        System.out.println("Farmacia: " + nombreFarmacia + ", Sucursal: " + sucursal + ", Dirección: " + direccion);
        for (int i = 0; i < nroMedicamentos; i++) {
            m[i].mostrar();
        }
    }

    int getSucursal() {
        return sucursal;
    }

    String getDireccion() {
        return direccion;
    }
}

class ArchFarmacia {
    String na;

    ArchFarmacia(String na) {
        this.na = na;
    }

    void crearArchivo() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(na));
        oos.close();
    }

    void adicionar(Farmacia f) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(na, true)) {
            protected void writeStreamHeader() throws IOException {}
        };
        oos.writeObject(f);
        oos.close();
    }

    void listar() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(na));
        try {
            while (true) {
                Farmacia f = (Farmacia) ois.readObject();
                f.mostrar();
            }
        } catch (EOFException e) {
            ois.close();
        }
    }

    void mostrarMedicamentosTos(int x) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(na));
        try {
            while (true) {
                Farmacia f = (Farmacia) ois.readObject();
                if (f.getSucursal() == x) {
                    System.out.println("Medicamentos para la tos en sucursal " + x + ":");
                    for (int i = 0; i < f.nroMedicamentos; i++) {
                        if (f.m[i].getTipo().equalsIgnoreCase("Tos")) {
                            f.m[i].mostrar();
                        }
                    }
                }
            }
        } catch (EOFException e) {
            ois.close();
        }
    }

    void mostrarFarmaciasConGolpex() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(na));
        try {
            while (true) {
                Farmacia f = (Farmacia) ois.readObject();
                for (int i = 0; i < f.nroMedicamentos; i++) {
                    if (f.m[i].getNombre().equalsIgnoreCase("Golpex")) {
                        System.out.println("Sucursal: " + f.getSucursal() + ", Dirección: " + f.getDireccion());
                    }
                }
            }
        } catch (EOFException e) {
            ois.close();
        }
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            ArchFarmacia arch = new ArchFarmacia("farmacias.bolivia");
            arch.crearArchivo();

            Medicamento m1 = new Medicamento("Golpex", 101, "Tos", 12.5);
            Medicamento m2 = new Medicamento("Ibuprofeno", 102, "Dolor", 8.0);
            Medicamento m3 = new Medicamento("Desenfriol", 103, "Resfrio", 10.0);
            Medicamento m4 = new Medicamento("Bronquilin", 104, "Tos", 11.0);

            
            Farmacia f1 = new Farmacia("Farmacia Farmacol", 1, "perez callle 111");
            f1.adicionarMedicamento(m1);
            f1.adicionarMedicamento(m2);

            Farmacia f2 = new Farmacia("Farmacia Chavez", 2, "Avenida Bolivia 12");
            f2.adicionarMedicamento(m3);
            f2.adicionarMedicamento(m4);

            arch.adicionar(f1);
            arch.adicionar(f2);

            System.out.println("\nLISTADO DE FARMACIAS ");
            arch.listar();

            System.out.println("\n--- MEDICAMENTOS PARA LA TOS EN SUCURSAL 2");
            arch.mostrarMedicamentosTos(2);

            System.out.println("\n FARMACIAS QUE TIENEN GOLPEX ");
            arch.mostrarFarmaciasConGolpex();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

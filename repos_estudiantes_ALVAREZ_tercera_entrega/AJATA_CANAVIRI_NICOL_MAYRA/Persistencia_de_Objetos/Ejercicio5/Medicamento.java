package Persistencia_de_Objetos.Ejercicio5;

public class Medicamento {
    private String nombre;
    private int codMedicamento;
    private String tipo;
    private double precio;

    public Medicamento() {
        this("", 0, "", 0.0);
    }

    public Medicamento(String nombre, int codMedicamento, String tipo, double precio) {
        this.nombre = nombre;
        this.codMedicamento = codMedicamento;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCodMedicamento() {
        return codMedicamento;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void leer() {
        System.out.println("Metodo leer() de Medicamento llamado. Los datos ya estan en el objeto");
    }

    public void mostrar() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return String.format("%s,%d,%s,%.2f", nombre, codMedicamento, tipo, precio);
    }

    public static Medicamento fromString(String medicamentoStr) {
        try {
            String[] partes = medicamentoStr.trim().split(",");
            if (partes.length == 4) {
                String nombre = partes[0];
                int codMedicamento = Integer.parseInt(partes[1]);
                String tipo = partes[2];
                double precio = Double.parseDouble(partes[3]);
                return new Medicamento(nombre, codMedicamento, tipo, precio);
            } else {
                System.err.println("Advertencia: Formato de linea incorrecto para medicamento: " + medicamentoStr);
                return null;
            }
        } catch (NumberFormatException e) {
            System.err.println("Error al parsear datos numericos de medicamento '" + medicamentoStr + "': " + e.getMessage());
            return null;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error de indice al parsear linea de medicamento '" + medicamentoStr + "': " + e.getMessage());
            return null;
        }
    }
}
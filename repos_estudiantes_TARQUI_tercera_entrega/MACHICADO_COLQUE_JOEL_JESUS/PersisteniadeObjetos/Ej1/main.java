import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Empleado implements Serializable {
    private String nombre;
    private int edad;
    private float salario;

    public Empleado(String nombre, int edad, float salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public float getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + ", Edad: " + edad + ", Salario: " + salario;
    }
}

class ArchivoEmpleado {
    private String nomA;

    public ArchivoEmpleado(String nomA) {
        this.nomA = nomA;
    }

    public void crearArchivo() {
        try {
            new File(nomA).createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarEmpleado(Empleado e) {
        List<Empleado> empleados = leerEmpleados();
        empleados.add(e);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomA))) {
            oos.writeObject(empleados);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private List<Empleado> leerEmpleados() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomA))) {
            return (List<Empleado>) ois.readObject();
        } catch (EOFException e) {
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return new ArrayList<>();
        }
    }

    public Empleado buscaEmpleado(String nombre) {
        List<Empleado> empleados = leerEmpleados();
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    public Empleado mayorSalario(float sueldo) {
        List<Empleado> empleados = leerEmpleados();
        for (Empleado e : empleados) {
            if (e.getSalario() > sueldo) {
                return e;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        ArchivoEmpleado archivo = new ArchivoEmpleado("empleados.dat");
        archivo.crearArchivo();

        archivo.guardarEmpleado(new Empleado("Ana", 30, 2500));
        archivo.guardarEmpleado(new Empleado("Luis", 40, 3200));
        archivo.guardarEmpleado(new Empleado("Pedro", 35, 2800));
        archivo.guardarEmpleado(new Empleado("Maria", 28, 3000));
        archivo.guardarEmpleado(new Empleado("Juan", 45, 3500));

        System.out.println("Buscado: " + archivo.buscaEmpleado("Luis"));
        System.out.println("Mayor salario: " + archivo.mayorSalario(2500));
    }
}

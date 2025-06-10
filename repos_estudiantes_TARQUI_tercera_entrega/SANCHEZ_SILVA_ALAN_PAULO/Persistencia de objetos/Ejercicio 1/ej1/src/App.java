public class App {
    public static void main(String[] args) throws Exception {
        ArchivoEmpleado archivo = new ArchivoEmpleado("empleados.txt");

        archivo.crearArchivo();

        archivo.guardarEmpleado(new Empleado<>("Maria", 33, 3300));
        archivo.guardarEmpleado(new Empleado("Juan",40,4000));
        archivo.guardarEmpleado(new Empleado<>("Raul", 35, 3500));

        //Buscando por nombre

        Empleado buscado = archivo.buscarEmpleado("Juan");
        if(buscado !=null){
            System.out.println("Empleado encontrado: \n"+ buscado);
        }else{
            System.out.println("Empleado no encontrado");
        }

        //Buscando por salario
        Empleado mayor = archivo.mayorSalario(3200);
        if(mayor != null){
            System.out.println("Empleado con lasario mayor:\n" +mayor);
        }else{
            System.out.println("Ningun empleado supera ese salario");
        }
    }
}

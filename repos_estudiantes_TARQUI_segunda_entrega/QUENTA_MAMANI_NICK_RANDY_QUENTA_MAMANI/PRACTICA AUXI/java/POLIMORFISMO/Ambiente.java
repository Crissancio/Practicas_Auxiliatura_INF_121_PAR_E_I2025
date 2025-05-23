// NOMBRE: QUENTA MAMANI NICK RANDY
//CI: 10037571

//5. Se hace referencia a algunos de los diferentes ambientes de la Universidad
//mediante las siguientes clases:
//
//a) Instanciar 2 objetos Oficina, 2 Aulas y 1 Laboratorio
//b) Crear un método mostrar() para mostrar los datos de cada objeto
//c) Sobrecargar el método cantidadMuebles(), para conocer el número total de
//muebles dentro de cada ambiente

public class Ambiente {
    public static class Oficina {
        private int nroSillas;
        private int nroEscritorios;
        private int nroEstanterias;

        public Oficina(int nroSillas, int nroEscritorios, int nroEstanterias) {
            this.nroSillas = nroSillas;
            this.nroEscritorios = nroEscritorios;
            this.nroEstanterias = nroEstanterias;
        }

        public void mostrar() {
            System.out.println("Oficina:");
            System.out.println("Número de Sillas: " + nroSillas);
            System.out.println("Número de Escritorios: " + nroEscritorios);
            System.out.println("Número de Estanterías: " + nroEstanterias);
        }

        public int cantidadMuebles() {
            return nroSillas + nroEscritorios + nroEstanterias;
        }
    }

    public static class Aula {
        private String nombre;
        private int capacidad;
        private int nroPupitres;

        public Aula(String nombre, int capacidad, int nroPupitres) {
            this.nombre = nombre;
            this.capacidad = capacidad;
            this.nroPupitres = nroPupitres;
        }

        public void mostrar() {
            System.out.println("Aula:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Capacidad: " + capacidad);
            System.out.println("Número de Pupitres: " + nroPupitres);
        }
        public int cantidadMuebles() {
            return nroPupitres;
        }
    }

    public static class Laboratorio {
        private String nombre;
        private int capacidad;
        private int nroMesas;
        private int nroSillas;

        public Laboratorio(String nombre, int capacidad, int nroMesas, int nroSillas) {
            this.nombre = nombre;
            this.capacidad = capacidad;
            this.nroMesas = nroMesas;
            this.nroSillas = nroSillas;
        }

        public void mostrar() {
            System.out.println("Laboratorio:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Capacidad: " + capacidad);
            System.out.println("Número de Mesas: " + nroMesas);
            System.out.println("Número de Sillas: " + nroSillas);
        }

        public int cantidadMuebles() {
            return nroMesas + nroSillas;
        }
    }

    public static void main(String[] args) {

        Oficina oficina1 = new Oficina(5, 3, 2);
        Oficina oficina2 = new Oficina(6, 4, 3);
        Aula aula1 = new Aula("Aula A", 30, 25);
        Aula aula2 = new Aula("Aula B", 40, 35);
        Laboratorio laboratorio = new Laboratorio("Lab 1", 20, 10, 15);

        System.out.println("Ambientes de la Universidad:");
        oficina1.mostrar();
        oficina2.mostrar();
        aula1.mostrar();
        aula2.mostrar();
        laboratorio.mostrar();

        System.out.println("muebles y cada ambiente:");
        System.out.println("Oficina 1: " + oficina1.cantidadMuebles());
        System.out.println("Oficina 2: " + oficina2.cantidadMuebles());
        System.out.println("Aula 1: " + aula1.cantidadMuebles());
        System.out.println("Aula 2: " + aula2.cantidadMuebles());
        System.out.println("Laboratorio: " + laboratorio.cantidadMuebles());
    }
}

public class App2 {
    public static void main(String[] args) throws Exception {
        //b)
        Gerente gerente_1 = new Gerente("Pablo", "Suarez", 4000, 6, "La Paz", 5000);
        Gerente gerente_2 = new Gerente("Juan", "Lopez", 5000, 7, "Santa Cruz", 6000);
        Gerente gerente_3 = new Gerente("Ana", "Gonzalez", 6000, 8, "Cochabamba", 7000);

        Desarrollador desarrollador_1 = new Desarrollador("Luis", "Martinez", 3000, 3, "Java", 6);
        Desarrollador desarrollador_2 = new Desarrollador("Maria", "Fernandez", 3500, 4, "Python", 8);
        Desarrollador desarrollador_3 = new Desarrollador("Carlos", "Ramirez", 4000, 5, "JavaScript", 12);


        System.out.println("-----------Salarios-----------");
        System.out.println("Gerente : "+gerente_1.calcular_salario() + "Bs");
        System.out.println("Desarrolador: "+desarrollador_1.calcular_salario() + "Bs");

        // c)
        System.out.println("----------------------------");
        System.out.println("Gerentes que tienen mas de 1000 de bono gerencial:");
        Gerente gerentes[] = {gerente_1, gerente_2, gerente_3};
        for (int i = 0; i < gerentes.length; i++) {
            if (gerentes[i].getBono_gerencial() > 1000) {
                System.out.println(gerentes[i].toString());
            }
        }
        System.out.println("----------------------------");
        System.out.println("Desarrolladores que tienen mas de 10 horas extras");
        Desarrollador desarrolladores[] = {desarrollador_1, desarrollador_2, desarrollador_3};
        for (int i = 0; i < desarrolladores.length; i++) {
            if (desarrolladores[i].getHoras_extras() > 10) {
                System.out.println(desarrolladores[i].toString());
            }
        }
    }
}

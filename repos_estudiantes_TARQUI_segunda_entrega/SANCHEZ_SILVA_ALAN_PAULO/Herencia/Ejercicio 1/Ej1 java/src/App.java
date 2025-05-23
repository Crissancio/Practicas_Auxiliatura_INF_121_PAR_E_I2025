public class App {
    public static void main(String[] args) throws Exception {
        //b)
        Coche sx4 = new Coche("Suzuki", "Sx4 2.0" , 2006, 40000, 5, "Gasolina");
        Coche oroch = new Coche("Renault", "Oroch", 2025, 104000, 4, "Gasolina");
        Coche corolla  = new Coche("Toyota", "Corolla", 2025, 90000,4,"Hibrido");
        
        Moto duke = new Moto("KMT", "250 Duke Naked", 2025, 30000, 248, "Monocilindrico");
        Moto pulsar = new Moto("Bajaj Pulsar", "Pulsar RS 200 Sport", 2024, 55000,1995,"Monocilindrico");
        Moto rr = new Moto("BMW S","S 1000 RR Sport",2022, 67000,999,"Adosado");

        System.out.println("Mostrando dos vehiculos:");
        sx4.mostrar_info();
        duke.mostrar_info();

        //c)
        Coche [] coches =new Coche[]{sx4, oroch, corolla};
        System.out.println("------------------------------------------");
        System.out.println("Coche con más de 4 puertas:");
        for(int i = 0; i < coches.length;i++){
            if (coches[i].getNum_puertas() > 4){
                coches[i].mostrar_info();
            }
        }

        //d)
        Vehiculo [] vehiculos = new Vehiculo[] {sx4,oroch, corolla, duke, pulsar, rr};
        System.out.println("------------------------------------------");
        System.out.println("Vehiculos de 2025:");
        for(int j = 0 ; j < vehiculos.length ; j++){
            if(vehiculos[j].getAño() == 2025){
                vehiculos[j].mostrar_info();
            }
        }


    }
}

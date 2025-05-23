public class Coche extends Vehiculo {
        private int num_puertas;
        private String tipo_combustible;
        public Coche(String marca, String modelo, int año, float precio_base, int num_puertas,
                String tipo_combustible) {
            super(marca, modelo, año, precio_base);
            this.num_puertas = num_puertas;
            this.tipo_combustible = tipo_combustible;
        }

        public void mostrar_info(){
            super.mostrar_info();
            System.out.println("----Coche-----\n"+
                "Número de puertas:" + this.num_puertas+"\n"+
                "Tipo de combustible:" + this.tipo_combustible + "\n" 
            );
        }

        public int getNum_puertas() {
            return num_puertas;
        }
        public void setNum_puertas(int num_puertas) {
            this.num_puertas = num_puertas;
        }
        public String getTipo_combustible() {
            return tipo_combustible;
        }
        public void setTipo_combustible(String tipo_combustible) {
            this.tipo_combustible = tipo_combustible;
        }
        
}

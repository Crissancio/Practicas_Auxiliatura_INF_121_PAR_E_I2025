public class Empleado {
        private String nombre, apellido;
        private double  salario_base;
        private int años_antiguedad;
        public Empleado(String nombre, String apellido, double salario_base, int años_antiguedad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.salario_base = salario_base;
            this.años_antiguedad = años_antiguedad;
        }

        public double  calcular_salario(){
           double  bono = 0.05 * this.años_antiguedad * this.salario_base;
            return this.salario_base + bono;
        }

        public String toString(){
            return ( "-----------Empleado----------\n"+
                "Nombre:" + this.nombre +"\n" +
                "Apellido:"+ this.apellido + "\n"+
                "Salario base:"+ this.salario_base + "\n"+
                "Años de antiguedad:" + this.años_antiguedad + "\n"
                );
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getApellido() {
            return apellido;
        }
        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
        public double getSalario_base() {
            return salario_base;
        }
        public void setSalario_base(float salario_base) {
            this.salario_base = salario_base;
        }
        public int getAños_antiguedad() {
            return años_antiguedad;
        }
        public void setAños_antiguedad(int años_antiguedad) {
            this.años_antiguedad = años_antiguedad;
        }
}

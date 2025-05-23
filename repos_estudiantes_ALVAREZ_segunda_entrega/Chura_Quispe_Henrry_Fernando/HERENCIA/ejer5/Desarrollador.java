	package empleados;

public class Desarrollador extends Empleado {

		private String lenguaje_programacion;
		private float horas_extras;
		
		
		public Desarrollador(String lenguaje_programacion, float horas_extras,String nombre, String apellido,float salario_base,int anios_antiguedad) {
			super(nombre, apellido, salario_base, anios_antiguedad);
			this.lenguaje_programacion=lenguaje_programacion;
			this.horas_extras=horas_extras;
		}
		
		public String getlenguaje_programacion() {
			return lenguaje_programacion;
		}
		public void setLenguaje_programacion(String lenguaje_programacion) {
			this.lenguaje_programacion=lenguaje_programacion;
		}
		public float getHoras_extras() {
			return horas_extras;
		}
		public void setHoras_extras(float horas_extras) {
			this.horas_extras=horas_extras;
		}
		@Override
		public double salario() {
			return super.salario()+(horas_extras*20.0);	
		}
		@Override
		public void mostrarinf() {
			System.out.printf("\nDesarrollador : \n-lenguaje de Programacion: %s\n-Horas extras: %.2f \n",lenguaje_programacion,horas_extras);
			super.mostrarinf();
		}
}


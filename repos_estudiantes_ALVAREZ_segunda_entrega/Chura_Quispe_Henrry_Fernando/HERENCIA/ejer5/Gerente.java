package empleados;

public class Gerente extends Empleado {
	private String departamento;
	private int bono_gerencial;
	
	
	public Gerente(String departamento, int bono_gerencial,String nombre, String apellido,float salario_base,int anios_antiguedad) {
		super(nombre, apellido, salario_base, anios_antiguedad);
		this.departamento=departamento;
		this.bono_gerencial=bono_gerencial;	
	}
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento=departamento;
	}
	public int getBono_gerencial() {
		return bono_gerencial;
	}
	public void setBono_gerencial(int bono_gerencial) {
		this.bono_gerencial=bono_gerencial;
	}
	@Override
	public double salario() {
		return super.salario()+bono_gerencial;	
	}
	
	@Override
	public void mostrarinf() {
		System.out.printf("\nGerente : \n-Departamento: %s\n-Bono Gerencial: %d \n",departamento,bono_gerencial);
		super.mostrarinf();
	}
}

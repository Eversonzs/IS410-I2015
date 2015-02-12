package clases;

public class Supervisor extends Empleado {
	private int codigoSupervisor;

	public Supervisor(String nombre, 
			String apellido, 
			String genero, 
			int edad,
			int codigoEmpleado, 
			String identidad, 
			double sueldoBase,
			int codigoSupervisor) {
		super(nombre, 
				apellido, 
				genero, 
				edad, 
				codigoEmpleado,
				identidad,
				sueldoBase);
		this.codigoSupervisor = codigoSupervisor;
	}
	
	public Supervisor(){}

	public int getCodigoSupervisor() {
		return codigoSupervisor;
	}

	public void setCodigoSupervisor(int codigoSupervisor) {
		this.codigoSupervisor = codigoSupervisor;
	}
	
	
	
}

package clases;

public abstract class Empleado {
	protected String nombre;
	protected String apellido;
	protected String genero;
	protected int edad;
	protected int codigoEmpleado;
	protected String identidad;
	protected double sueldoBase;
	
	public Empleado(String nombre, String apellido, String genero, int edad,
			int codigoEmpleado, String identidad, double sueldoBase) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.edad = edad;
		this.codigoEmpleado = codigoEmpleado;
		this.identidad = identidad;
		this.sueldoBase = sueldoBase;
	}
	
	public Empleado(){}
	
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
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}
	public void setCodigoEmpleado(int codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}
	public String getIdentidad() {
		return identidad;
	}
	public void setIdentidad(String identidad) {
		this.identidad = identidad;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
}

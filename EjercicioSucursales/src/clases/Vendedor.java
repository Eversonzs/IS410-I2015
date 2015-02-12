package clases;

public class Vendedor extends Empleado {
	private int cantidadVentas;
	private int codigoVendedor;
	private String zona;
	private double promedioVentaMensual;
	public Vendedor(String nombre, 
			String apellido, 
			String genero, 
			int edad,
			int codigoEmpleado, 
			String identidad, 
			double sueldoBase,
			int cantidadVentas, 
			int codigoVendedor, 
			String zona,
			double promedioVentaMensual) {
		super(nombre, 
				apellido, 
				genero, 
				edad, 
				codigoEmpleado, 
				identidad,
				sueldoBase);
		this.cantidadVentas = cantidadVentas;
		this.codigoVendedor = codigoVendedor;
		this.zona = zona;
		this.promedioVentaMensual = promedioVentaMensual;
	}
	
	public Vendedor(){}

	public int getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(int cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}

	public int getCodigoVendedor() {
		return codigoVendedor;
	}

	public void setCodigoVendedor(int codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public double getPromedioVentaMensual() {
		return promedioVentaMensual;
	}

	public void setPromedioVentaMensual(double promedioVentaMensual) {
		this.promedioVentaMensual = promedioVentaMensual;
	}
	
	
	
}

package clases;

import java.util.ArrayList;

public class Sucursal {
	private double metaMensual;
	private String nombre;
	private String telefono;
	private String direccion;
	private int codigoSucursal;
	private double ingresoPromedio;
	
	private Supervisor supervisor;
	private ArrayList<Vendedor> vendedores =
			new ArrayList<Vendedor>();
	
	public Sucursal(double metaMensual, 
			String nombre, 
			String telefono,
			String direccion, 
			int codigoSucursal, 
			double ingresoPromedio) {
		this.metaMensual = metaMensual;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.codigoSucursal = codigoSucursal;
		this.ingresoPromedio = ingresoPromedio;
	}
	
	public  Sucursal(){}
	
	public double getMetaMensual() {
		return metaMensual;
	}

	public void setMetaMensual(double metaMensual) {
		this.metaMensual = metaMensual;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodigoSucursal() {
		return codigoSucursal;
	}

	public void setCodigoSucursal(int codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public double getIngresoPromedio() {
		return ingresoPromedio;
	}

	public void setIngresoPromedio(double ingresoPromedio) {
		this.ingresoPromedio = ingresoPromedio;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

	public ArrayList<Vendedor> getVendedores() {
		return vendedores;
	}

	public void setVendedores(ArrayList<Vendedor> vendedores) {
		this.vendedores = vendedores;
	}
	
	public void addVendedor(Vendedor vendedor){
		vendedores.add(vendedor);
	}
	
	public Vendedor getVendedor(int indice){
		return vendedores.get(indice);
	}
}

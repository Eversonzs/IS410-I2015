package implementacion;

import java.util.ArrayList;

import clases.Sucursal;
import clases.Supervisor;
import clases.Vendedor;

public class Principal {
	private ArrayList<Sucursal> sucursales;
	
	public Principal(){
		sucursales = new ArrayList<Sucursal>();
		
		Sucursal sucursal = new Sucursal();
		sucursal.setNombre("Sucursal La Esperanza");
		sucursal.setCodigoSucursal(123);
		
		Supervisor supervisor = new Supervisor();
		supervisor.setNombre("Juan");
		sucursal.setSupervisor(supervisor);
		
		Vendedor v1 = new Vendedor();
		sucursal.addVendedor(v1);
		Vendedor v2 = new Vendedor();
		sucursal.addVendedor(v2);
		
		sucursales.add(sucursal);
	}
	
	public static void main(String[] args) {
		new Principal();
	}
}

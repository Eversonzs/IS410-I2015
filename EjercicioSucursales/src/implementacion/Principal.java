package implementacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import clases.Sucursal;
import clases.Supervisor;
import clases.Vendedor;

public class Principal {
	private ArrayList<Sucursal> sucursales;
	
	public Principal(){
		sucursales = new ArrayList<Sucursal>();
		int opcion;
		
		do{
			opcion = Integer.valueOf(
					JOptionPane.showInputDialog("0 Salir\n"
							+ "1. Sucursales\n"
							+ "2. Supervisores\n"
							+ "3. Vendedores"));
			switch(opcion){
				case 0:
					break;
				case 1:
					menuSucursales();
					break;
				case 2:
					menuSupervisores();
					break;
				case 3:
					menuVendedores();
					break;
			}
		} while (opcion!=0);
	}
	
	public void menuSucursales(){
		int opcion = Integer.valueOf(
				JOptionPane.showInputDialog("0 Regresar\n"
						+ "1. Agregar Sucursal\n"
						+ "2. Modificar Sucursal\n"
						+ "3. Eliminar Sucursal\n"
						+ "4. Mostrar Sucursales\n"
						+ "5. Mostrar vendedores de una sucursal"));
		switch(opcion){
			case 0:				
				break;
			case 1:
				agregarSucursal();
				break;
			case 2:
				modificarSucursal();
				break;
			case 3:
				eliminarSucursal();
				break;
			case 4:
				mostrarSucursales();
				break;
			case 5:
				mostrarVendedoresPorSucursal();
				break;
		}
	}
	
	public void menuSupervisores(){
		int opcion = Integer.valueOf(
				JOptionPane.showInputDialog("0 Regresar\n"
						+ "1. Agregar Supervisor\n"
						+ "2. Modificar Supervisor\n"
						+ "3. Eliminar Supervisor\n"
						+ "4. Mostrar Supervisores"));
		switch(opcion){
			case 0:				
				break;
			case 1:
				agregarSupervisor();
				break;
			case 2:
				modificarSupervisor();
				break;
			case 3:
				eliminarSupervisor();
				break;
			case 4:
				mostrarSupervisor();
				break;
		}
	}
	
	public void menuVendedores(){
		int opcion = Integer.valueOf(
				JOptionPane.showInputDialog("0 Regresar\n"
						+ "1. Agregar Vendedor\n"
						+ "2. Modificar Vendedor\n"
						+ "3. Eliminar Vendedor\n"
						+ "4. Mostrar Vendedores"));
		switch(opcion){
			case 0:				
				break;
			case 1:
				agregarVendedor();
				break;
			case 2:
				modificarVendedor();
				break;
			case 3:
				eliminarVendedor();
				break;
			case 4:
				mostrarVendedores();
				break;
		}
	}
	
	//Operaciones para sucursales
	public void agregarSucursal(){}
	public void modificarSucursal(){}
	public void eliminarSucursal(){}
	public void mostrarSucursales(){}
	public void mostrarVendedoresPorSucursal(){}
	
	//Operaciones para supervisores
	public void agregarSupervisor(){}
	public void modificarSupervisor(){}
	public void eliminarSupervisor(){}
	public void mostrarSupervisor(){}
	
	//Operaciones para vendedores
	public void agregarVendedor(){}
	public void modificarVendedor(){}
	public void eliminarVendedor(){}
	public void mostrarVendedores(){}
	
	public static void main(String[] args) {
		new Principal();
	}
}

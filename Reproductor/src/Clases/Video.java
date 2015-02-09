package Clases;

public class Video extends Media{

	protected String resolucion;
	protected String clasificacion;
	public String getResolucion() {
		return resolucion;
	}
	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	public String getClasificacion() {
		return clasificacion;
	}
	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}
	
	public String Reproducir(){
		return "Nombre: " + this.Nombre + "\n" + "Duracion: " + this.duracion + "\n" + "Formato " + this.formato + "\n" + "Tamaño: " + this.tamanio + "\n" + "Autor: " +  this.autor + "\n" + "Fecha/Año: " + this.fecha_Anio + "\n" + "Resolucion: " +  this.resolucion + "\n" + "Clasificacion: " + this.clasificacion; 
		
	}
	
}

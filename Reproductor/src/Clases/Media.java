package Clases;

public abstract class Media {
	protected String Nombre;
	protected String duracion;
	protected String formato;
	protected String tamanio;
	protected String autor;
	protected String fecha_Anio;
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getFecha_Anio() {
		return fecha_Anio;
	}
	public void setFecha_Anio(String fecha_Anio) {
		this.fecha_Anio = fecha_Anio;
	}
	public String Reproducir(){
		return "Nombre: " + this.Nombre + "\n" + "Duracion: " + this.duracion + "\n" + "Formato " + this.formato + "\n" + "Tamaño: " + this.tamanio + "\n" + "Autor: " +  this.autor + "\n" + "Fecha/Año: " + this.fecha_Anio + "\n"; 
		
	}
	
}

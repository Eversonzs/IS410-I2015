package Clases;

public class Musica extends Media {
	protected String genero;
	protected String portada;
	protected String autor;
	protected String pista;
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getPortada() {
		return portada;
	}
	public void setPortada(String portada) {
		this.portada = portada;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	public String Reproducir(){
		return "Nombre: " + this.Nombre + "\n" + "Duracion: " + this.duracion + "\n" + "Formato " + this.formato + "\n" + "Tamaño: " + this.tamanio + "\n" + "Autor: " +  this.autor + "\n" + "Fecha/Año: " + this.fecha_Anio + "\n" + "Genero: " +  this.genero; 
		
	}
	public String getPista() {
		return pista;
	}
	public void setPista(String pista) {
		this.pista = pista;
	}
	
}

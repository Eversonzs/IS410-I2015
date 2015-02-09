package clases;

public class Video extends Media {
	private String resolucion;
	public Video(String nombre, String ruta, String fecha, Autor autor,
			int tiempo, String formato, String resolucion, int tamanioBytes){
		super(nombre, ruta, fecha, autor, tiempo, formato, tamanioBytes);
		this.resolucion = resolucion;
	}

	public Video() {}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	
	@Override
	public void reproducir() {
		System.out.println("Reproduciendo video: " + nombre);		
	}
	
	@Override
	public String toString(){
		return super.toString() + "\t\t" + resolucion;
	}
}

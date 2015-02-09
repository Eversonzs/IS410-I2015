package clases;

public class Musica extends Media {
	private String generoMusical;
	private String album;
	public Musica(String nombre, String ruta, String fecha, Autor autor,
			int tiempo,String formato, String generoMusical, 
			String album, int tamanioBytes) {
		super(nombre, ruta, fecha, autor, tiempo, formato, tamanioBytes);
		this.generoMusical = generoMusical;
		this.album = album;
	}

	public Musica() {
	}

	public String getGeneroMusical() {
		return generoMusical;
	}

	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo cancion: " + nombre);		
	}
	
	@Override
	public String toString(){
		return super.toString() + "\t\t" + generoMusical + "\t\t" + album;
	}

}

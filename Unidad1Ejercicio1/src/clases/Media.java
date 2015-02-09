package clases;

public abstract class Media {
	protected String nombre;
	protected String ruta;
	protected String fecha;
	protected Autor autor;
	protected int tiempo;
	protected String formato;
	protected int tamanioBytes;
	
	public Media(String nombre, String ruta, String fecha, Autor autor,
			int tiempo, String formato, int tamanioBytes) {
		this.nombre = nombre;
		this.ruta = ruta;
		this.fecha = fecha;
		this.autor = autor;
		this.tiempo = tiempo;
		this.formato = formato;
		this.tamanioBytes = tamanioBytes;
	}
	
	public Media(){}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRuta() {
		return ruta;
	}
	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public int getTiempo() {
		return tiempo;
	}
	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public int getTamanioBytes() {
		return tamanioBytes;
	}

	public void setTamanioBytes(int tamanioBytes) {
		this.tamanioBytes = tamanioBytes;
	}
	
	public abstract void reproducir();
	
	@Override
	public String toString(){
		return nombre + "\t\t" + ruta + "\t\t" + 
				fecha + "\t\t" + autor.getNombre() + 
				tiempo + "\t\t" + formato + "\t\t" + tamanioBytes;
	}
}

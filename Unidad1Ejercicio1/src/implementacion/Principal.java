package implementacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import clases.Autor;
import clases.Media;
import clases.Musica;
import clases.Video;

public class Principal {
	private ArrayList<Media> mediaLibrary = new ArrayList<Media>();
	
	public Principal(){
		int opcion;
		do{
			opcion = Integer.valueOf(JOptionPane.showInputDialog(
					"------------Canciones------------\n"
					+ "1 Agregar cancion\n"
					+ "2 Modificar cancion\n"
					+ "3 Eliminar cancion\n"
					+ "4 Mostrar canciones\n"
					+ "------------Videos------------\n"
					+ "5 Agregar video\n"
					+ "6 Modificar video\n"
					+ "7 Eliminar video\n"
					+ "8 Mostrar videos"));
			
			switch(opcion){
				case 0:
					System.err.println("Fin de la aplicacion");
					break;
				case 1:
					agregarCancion();
					break;
				case 2:
					modificarCanciones();
					break;
				case 3:
					eliminarCancion();
					break;
				case 4:
					mostrarCanciones();
					break;
				case 5:
					agregarVideo();
					break;
				case 6:
					modificarVideos();
					break;
				case 7:
					eliminarVideo();
					break;
				case 8:
					mostrarVideos();
					break;
			}
			
		}while(opcion!=0);
	}
	
	public void agregarCancion(){
		Musica musica = new Musica();
		musica.setNombre(JOptionPane.showInputDialog("Nombre cancion:"));
		musica.setRuta(JOptionPane.showInputDialog("Ruta:"));
		musica.setAlbum(JOptionPane.showInputDialog("Album:"));
		musica.setGeneroMusical(JOptionPane.showInputDialog("Genero musical:"));
		musica.setFormato(JOptionPane.showInputDialog("Formato:"));
		musica.setTiempo(Integer.valueOf(JOptionPane.showInputDialog("Tiempo en segundos:")));
		musica.setTamanioBytes(Integer.valueOf(JOptionPane.showInputDialog("Tamaño en bytes:")));
		musica.setFecha(JOptionPane.showInputDialog("Fecha de publicacion:"));
		Autor autor = new Autor();
		autor.setNombre(JOptionPane.showInputDialog("Nombre del artista:"));
		autor.setGenero(JOptionPane.showInputDialog("Genero artista:"));
		musica.setAutor(autor);
		mediaLibrary.add(musica);
	}
	
	public void agregarVideo(){
		Video video = new Video();
		video.setNombre(JOptionPane.showInputDialog("Nombre de video:"));
		video.setRuta(JOptionPane.showInputDialog("Ruta:"));
		video.setResolucion(JOptionPane.showInputDialog("Resolucion:"));
		video.setFormato(JOptionPane.showInputDialog("Formato:"));
		video.setTiempo(Integer.valueOf(JOptionPane.showInputDialog("Tiempo en segundos:")));
		video.setTamanioBytes(Integer.valueOf(JOptionPane.showInputDialog("Tamaño en bytes:")));
		video.setFecha(JOptionPane.showInputDialog("Fecha de publicacion:"));
		Autor autor = new Autor();
		autor.setNombre(JOptionPane.showInputDialog("Nombre del autor:"));
		autor.setGenero(JOptionPane.showInputDialog("Genero autor:"));
		video.setAutor(autor);
		mediaLibrary.add(video);
	}

	public void mostrarVideos(){
		System.out.println("Listado de videos");
		for (int i=0;i<mediaLibrary.size();i++){
			if (mediaLibrary.get(i) instanceof Video){
				System.out.println(mediaLibrary.get(i).toString());
			}
		}
	}
	
	public void mostrarCanciones(){
		System.out.println("Listado de canciones");
		for (int i=0;i<mediaLibrary.size();i++){
			if (mediaLibrary.get(i) instanceof Musica){
				System.out.println(mediaLibrary.get(i).toString());
			}
		}
	}
	
	public void modificarCanciones(){
		int indice;
		indice = Integer.valueOf(JOptionPane.showInputDialog("Canciones: ["+indicesCanciones()+"], cual desea modificar?"));
		
		if(!(mediaLibrary.get(indice) instanceof Musica)){
			JOptionPane.showMessageDialog(null, "El indice ingresado no es del tipo Musica");
			return;
		}
		
		Musica musica = new Musica();
		Musica musicaAnterior = (Musica)mediaLibrary.get(indice);
		
		musica.setNombre(JOptionPane.showInputDialog("Nombre cancion:",musicaAnterior.getNombre()));
		musica.setRuta(JOptionPane.showInputDialog("Ruta:",musicaAnterior.getRuta()));
		musica.setAlbum(JOptionPane.showInputDialog("Album:",musicaAnterior.getAlbum()));
		musica.setGeneroMusical(JOptionPane.showInputDialog("Genero musical:",musicaAnterior.getGeneroMusical()));
		musica.setFormato(JOptionPane.showInputDialog("Formato:",musicaAnterior.getFormato()));
		musica.setTiempo(Integer.valueOf(JOptionPane.showInputDialog("Tiempo en segundos:",musicaAnterior.getTiempo())));
		musica.setTamanioBytes(Integer.valueOf(JOptionPane.showInputDialog("Tamaño en bytes:",musicaAnterior.getTamanioBytes())));
		musica.setFecha(JOptionPane.showInputDialog("Fecha de publicacion:",musicaAnterior.getFecha()));
		Autor autor = new Autor();
		autor.setNombre(JOptionPane.showInputDialog("Nombre del artista:",(musicaAnterior.getAutor()).getNombre()));
		autor.setGenero(JOptionPane.showInputDialog("Genero artista:",musicaAnterior.getAutor().getGenero()));
		musica.setAutor(autor);
		mediaLibrary.set(indice,musica);
	}
	
	public void modificarVideos(){
		int indice;
		indice = Integer.valueOf(JOptionPane.showInputDialog("Videos: ["+indicesVideos()+"], cual desea modificar?"));
		
		if(!(mediaLibrary.get(indice) instanceof Video)){
			JOptionPane.showMessageDialog(null, "El indice ingresado no es del tipo Video");
			return;
		}
		
		Video video = new Video();
		Video videoAnterior = (Video)mediaLibrary.get(indice);
		
		video.setNombre(JOptionPane.showInputDialog("Nombre video:",videoAnterior.getNombre()));
		video.setRuta(JOptionPane.showInputDialog("Ruta:",videoAnterior.getRuta()));
		video.setResolucion((JOptionPane.showInputDialog("Resolucion:",videoAnterior.getResolucion())));
		video.setFormato(JOptionPane.showInputDialog("Formato:",videoAnterior.getFormato()));
		video.setTiempo(Integer.valueOf(JOptionPane.showInputDialog("Tiempo en segundos:",videoAnterior.getTiempo())));
		video.setTamanioBytes(Integer.valueOf(JOptionPane.showInputDialog("Tamaño en bytes:",videoAnterior.getTamanioBytes())));
		video.setFecha(JOptionPane.showInputDialog("Fecha de publicacion:",videoAnterior.getFecha()));
		Autor autor = new Autor();
		autor.setNombre(JOptionPane.showInputDialog("Nombre del autor:",videoAnterior.getAutor().getNombre()));
		autor.setGenero(JOptionPane.showInputDialog("Genero autor:",videoAnterior.getAutor().getGenero()));
		video.setAutor(autor);
		mediaLibrary.set(indice,video);
	}
	
	public String indicesVideos(){
		String videos="";
		for (int i=0;i<mediaLibrary.size();i++){
			if (mediaLibrary.get(i) instanceof Video){
				videos+=i+",";
			}
		}
		return videos;
	}
	
	public String indicesCanciones(){
		String canciones="";
		for (int i=0;i<mediaLibrary.size();i++){
			if (mediaLibrary.get(i) instanceof Musica){
				canciones+=i+",";
			}
		}
		return canciones;
	}
	
	public void eliminarCancion(){
		int indice;
		indice = Integer.valueOf(JOptionPane.showInputDialog("Canciones: ["+indicesCanciones()+"], cual desea eliminar?"));
		
		if(!(mediaLibrary.get(indice) instanceof Musica)){
			JOptionPane.showMessageDialog(null, "El indice ingresado no es del tipo Musica");
			return;
		}		
		mediaLibrary.remove(indice);
		JOptionPane.showMessageDialog(null, "Elemento con indice " + indice + " ha sido eliminado");
	}
	
	public void eliminarVideo(){
		int indice;
		indice = Integer.valueOf(JOptionPane.showInputDialog("Videos: ["+indicesCanciones()+"], cual desea eliminar?"));
		
		if(!(mediaLibrary.get(indice) instanceof Video)){
			JOptionPane.showMessageDialog(null, "El indice ingresado no es del tipo Video");
			return;
		}
		mediaLibrary.remove(indice);
		JOptionPane.showMessageDialog(null, "Elemento con indice " + indice + " ha sido eliminado");
	}

	public static void main(String[] args) {
		new Principal();
	}

}

package Implementacion;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import Clases.Media;
import Clases.Musica;
import Clases.Video;

public class main {
	
	public static void main(String[] args) throws FileNotFoundException, JavaLayerException{
		ArrayList<Media> medias = new ArrayList<Media>();
		int indice = 0;
		String opcion = "";
		String[] opc = {"0 Salir", "1 Agregar", "2 Eliminar", "3 Gestionar", "4 Reproducir"}; 
		
		
		
		
		do{
			opcion = (String) JOptionPane.showInputDialog(null, "Reproductor \n" +"Menu Principal", "Reproductor", 1, (Icon) new ImageIcon("play.gif"), opc, opc[0]);
			if(opcion == null){break;}
			switch(opcion.charAt(0)){
			case '0':
				break;
			case '1':
				String[] opc2 = {"0 Musica", "1 Video"};
				String mediatype = (String) JOptionPane.showInputDialog(null, "Tipo de Multimedia:", "Agregar", 1, (Icon) new ImageIcon("play.gif"), opc2, opc2[0]);
				if(mediatype == null){break;}
				if (( String.valueOf(mediatype.charAt(0)) ).equals("0")){
					Musica media = new Musica();
					media.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre"));
					media.setDuracion(JOptionPane.showInputDialog(null, "Ingrese la duracion"));
					media.setFormato(JOptionPane.showInputDialog(null, "Ingrese el formato"));
					media.setTamanio(JOptionPane.showInputDialog(null, "Ingrese el tama�o"));
					media.setAutor(JOptionPane.showInputDialog(null, "Ingrese el autor"));
					media.setFecha_Anio(JOptionPane.showInputDialog(null, "Ingrese la fecha y a�o"));
					media.setGenero(JOptionPane.showInputDialog(null, "Ingrese el genero"));
					String opcp[] = {"bass", "gato", "agua", "guitar", "music", "flower", "dj", "jake", "book", "yf", "est"};
					String portada = (String) JOptionPane.showInputDialog(null, "Ingrese la Portada: ", "Portada", 0, (Icon) new ImageIcon("play.gif"), opcp, opcp[0]);
					if (portada == null){
						portada = "music";
					}
					media.setPortada(portada);
					String opcm[] = {"du has","the day that never comes","the memorie remains"};
					String pista = (String) JOptionPane.showInputDialog(null, "Ingrese la pista: ", "Pista", 0, (Icon) new ImageIcon("play.gif"), opcm, opcm[0]);
					if (pista == null){
						pista = "du has";
					}
					media.setPista(pista);
					medias.add(media);
				} else if (( String.valueOf(mediatype.charAt(0)) ).equals("1")){
					Video media = new Video();
					media.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre"));
					media.setDuracion(JOptionPane.showInputDialog(null, "Ingrese la duracion"));
					media.setFormato(JOptionPane.showInputDialog(null, "Ingrese el formato"));
					media.setTamanio(JOptionPane.showInputDialog(null, "Ingrese el tama�o"));
					media.setAutor(JOptionPane.showInputDialog(null, "Ingrese el autor"));
					media.setFecha_Anio(JOptionPane.showInputDialog(null, "Ingrese la fecha y a�o"));
					media.setResolucion(JOptionPane.showInputDialog(null, "Ingrese la resolucion"));
					media.setClasificacion(JOptionPane.showInputDialog(null, "Ingrese la clasificacion"));
					medias.add(media);
				} else {
					JOptionPane.showMessageDialog(null, "Opcion Invalida");
					break;
				}
				break;
			case '2':
				if(medias.size() == 0){
					JOptionPane.showMessageDialog(null, "No hay elementos para eliminar");
					break;
				}
				String[] opc3 = new String[medias.size()];
				for(int i = 0; i < medias.size(); i++){
					opc3[i] = String.valueOf(i) + " : " + medias.get(i).getNombre() + "." + medias.get(i).getFormato();
				}
				String temp = (String) JOptionPane.showInputDialog(null, "Elija elemento a eliminar:", "Eliminar", 1, (Icon) new ImageIcon("play.gif"), opc3, opc3[0]);
				if (temp == null){break;}
				indice = Integer.valueOf(String.valueOf(temp.charAt(0)));
				medias.remove(indice);
				break;
			case '3':
				if(medias.size() == 0){
					JOptionPane.showMessageDialog(null, "No hay elementos para editar");
					break;
				}
				String mediatype2 = "";
				String[] opc4 = new String[medias.size()];
				for(int i = 0; i < medias.size(); i++){
					opc4[i] = String.valueOf(i) + " : " + medias.get(i).getNombre() + "." + medias.get(i).getFormato();
				}
				String temp2 = (String) JOptionPane.showInputDialog(null, "Elija elemento a editar:", "Editar", 1, (Icon) new ImageIcon("play.gif"), opc4, opc4[0]);
				if (temp2 == null){break;}
				indice = Integer.valueOf(String.valueOf(temp2.charAt(0)));
				if(medias.get(indice) instanceof Musica){
					mediatype2 = "0";
				} else {
					mediatype2 = "1";
				}
				if (mediatype2.equals("0")){
					JOptionPane.showMessageDialog(null, "Usted editara una cancion");
					Musica media2 = new Musica();
					media2.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre \n" + "Valor anterior: " + medias.get(indice).getNombre()));
					media2.setDuracion(JOptionPane.showInputDialog(null, "Ingrese la duracion \n" + "Valor anterior: " + medias.get(indice).getDuracion()));
					media2.setFormato(JOptionPane.showInputDialog(null, "Ingrese el formato \n" + "Valor anterior: " + medias.get(indice).getFormato()));
					media2.setTamanio(JOptionPane.showInputDialog(null, "Ingrese el tama�o \n" + "Valor anterior: " + medias.get(indice).getTamanio()));
					media2.setAutor(JOptionPane.showInputDialog(null, "Ingrese el autor \n" + "Valor anterior: " + medias.get(indice).getAutor()));
					media2.setFecha_Anio(JOptionPane.showInputDialog(null, "Ingrese la fecha y a�o \n" + "Valor anterior: " + medias.get(indice).getFecha_Anio()));
					media2.setGenero(JOptionPane.showInputDialog(null, "Ingrese el genero \n" + "Valor anterior: " + ((Musica)medias.get(indice)).getGenero()));
					String opcp[] = {"bass", "gato", "agua", "guitar", "music", "flower", "dj", "jake", "book", "yf", "est"};
					String portada = (String) JOptionPane.showInputDialog(null, "Ingrese la Portada: ", "Portada", 1, (Icon) new ImageIcon("play.gif"), opcp, opcp[0]);
					if (portada == null){
						portada = "du has";
					}
					media2.setPortada(portada);
					String opcm[] = {"du has","the day that never comes","the memorie remains"};
					String pista = (String) JOptionPane.showInputDialog(null, "Ingrese la Pista: ", "Pista", 1, (Icon) new ImageIcon("play.gif"), opcm, opcm[0]);
					if (pista == null){
						pista = "du has";
					}
					media2.setPista(pista);
					medias.set(indice, media2);
				} else if (mediatype2.equals("1")){
					JOptionPane.showMessageDialog(null, "Usted editara un video");
					Video media2 = new Video();
					media2.setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre \n" + "Valor anterior: " + medias.get(indice).getNombre()));
					media2.setDuracion(JOptionPane.showInputDialog(null, "Ingrese la duracion \n" + "Valor anterior: " + medias.get(indice).getDuracion()));
					media2.setFormato(JOptionPane.showInputDialog(null, "Ingrese el formato \n" + "Valor anterior: " + medias.get(indice).getFormato()));
					media2.setTamanio(JOptionPane.showInputDialog(null, "Ingrese el tama�o \n" + "Valor anterior: " + medias.get(indice).getTamanio()));
					media2.setAutor(JOptionPane.showInputDialog(null, "Ingrese el autor \n" + "Valor anterior: " + medias.get(indice).getAutor()));
					media2.setFecha_Anio(JOptionPane.showInputDialog(null, "Ingrese la fecha y a�o \n" + "Valor anterior: " + medias.get(indice).getFecha_Anio()));
					media2.setResolucion(JOptionPane.showInputDialog(null, "Ingrese el genero \n" + "Valor anterior: " + ((Video)medias.get(indice)).getResolucion()));
					media2.setClasificacion(JOptionPane.showInputDialog(null, "Ingrese la portada \n" + "Valor anterior: " + ((Video)medias.get(indice)).getClasificacion()));
					medias.set(indice, media2);
				} else {
					JOptionPane.showMessageDialog(null, "Opcion Invalida");
					break;
				}
				break;
			case '4':
				if(medias.size() == 0){
					JOptionPane.showMessageDialog(null, "No hay elementos para reproducir");
					break;
				}
				String[] opc5 = new String[medias.size()];
				for(int i = 0; i < medias.size(); i++){
					opc5[i] = String.valueOf(i) + " : " + medias.get(i).getNombre() + "." + medias.get(i).getFormato();
				}
				String temp5 = (String) JOptionPane.showInputDialog(null, "Elija elemento a reproducir:", "Abrir media", 1, (Icon) new ImageIcon("play.gif"), opc5, opc5[0]);
				if (temp5 == null){break;}
				indice = Integer.valueOf(String.valueOf(temp5.charAt(0)));
				String pista =  "";
				if(medias.get(indice) instanceof Musica){
					pista = ((Musica) medias.get(indice)).getPista() + ".mp3";
				} else {
					pista = "Stay Inside Me.mp3";
				}
				
				final Player player;
				Thread run;
					
					FileInputStream fis;
					fis = new FileInputStream(pista);
					BufferedInputStream bis = new BufferedInputStream(fis);
					player = new Player(bis);
					
					
					
					run = new Thread(){
						public void run() {
						try { player.play(); }
						catch (Exception e) { System.out.println(e); }
						}
					};					
				
				run.start();
				
				if(medias.get(indice) instanceof Musica){
					JOptionPane.showMessageDialog(null, medias.get(indice).Reproducir(), "Reproductor de Musica", 0, (Icon) new ImageIcon(((Musica)medias.get(indice)).getPortada() + ".gif"));
					run.stop();
					break;
					
				} else {
					
					JOptionPane.showMessageDialog(null, medias.get(indice).Reproducir(), "Reproductor de Video", 0,  (Icon) new ImageIcon("video.gif"));
					run.stop();
					break;
				}
				
			}
			
		}while( opcion.charAt(0) != '0');
		
	}

	
}

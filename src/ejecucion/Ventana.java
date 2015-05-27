// .src/ejecucion/Ventana.java
package ejecucion;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

import figuras2d.Circulo;
import figuras2d.Cuadrado;
import figuras2d.Pentagono;
import figuras2d.Triangulo;

public class Ventana extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<Circulo> listaCirculos; 
	ArrayList<Triangulo> listaTriangulos; 
	ArrayList<Cuadrado> listaCuadrados; 
	ArrayList<Pentagono> listaPentagonos; 
	
	public Ventana(){        
		listaCirculos = new ArrayList<Circulo>();
		listaTriangulos = new ArrayList<Triangulo>();
		listaCuadrados = new ArrayList<Cuadrado>();
		listaPentagonos = new ArrayList<Pentagono>();
	}
	
	 public void paintComponent(Graphics g){
		 super.paintComponent(g);
		 Iterator<Circulo> iCirculos = listaCirculos.iterator();  
		 while(iCirculos.hasNext()){
			 Circulo figura2d = iCirculos.next();
			 figura2d.pintar(g);
		 }
		 Iterator<Triangulo> iTriangulos = listaTriangulos.iterator();  
		 while(iTriangulos.hasNext()){
			 Triangulo figura2d = iTriangulos.next();
			 figura2d.pintar(g);
		 }
		 Iterator<Cuadrado> iCuadrados = listaCuadrados.iterator();  
		 while(iCuadrados.hasNext()){
			 Cuadrado figura2d = iCuadrados.next();
			 figura2d.pintar(g);
		 }
		 Iterator<Pentagono> iPentagonos = listaPentagonos.iterator();  
		 while(iPentagonos.hasNext()){
			 Pentagono figura2d = iPentagonos.next();
			 figura2d.pintar(g);
		 }
	 }
	 
	 public void add(Circulo circulo){
		 listaCirculos.add(circulo);
	 }
	 
	 public void add(Triangulo triangulo){
		 listaTriangulos.add(triangulo);
	 }
	 public void add(Cuadrado cuadrado){
		 listaCuadrados.add(cuadrado);
	 }
	 public void add(Pentagono pentagono){
		 listaPentagonos.add(pentagono);
	 }
	 
	 
	 public void volverPintar(){
		 repaint();  
	 }
	
	public static void inicializar(){
		
	}
}

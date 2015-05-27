// .src/ejecucion/FigurasGeometricas.java
package ejecucion;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import consoleUI.UtilsUI; // https://github.com/jfernandezpe/Utils
import figuras2d.Circulo;
import figuras2d.Cuadrado;
import figuras2d.Pentagono;
import figuras2d.Triangulo;

public class FigurasGeometricas {
	private static Ventana ventana;
	
	//Hilo de ejecución principal
	public static void main(String[] Args){
		ventana = crearVentana();
		int opcion = 0;
		while (opcion == 0) {
			String texto = "Elige una opción: \n"
					//+ "1) Figuras \n"
					+ "1) Figuras 2D\n"
					+ "2) Figuras 3D\n"
					+ "q) Salir\n";
			opcion = UtilsUI.menu(texto);
			
			switch (opcion)
			{
				default:
					System.out.println("No se ha encontrado la opción, vuelve a intentarlo");
					opcion = 0;
					break;
				case 1:
					figuras2d();
					opcion = 0;
					break;
				case 2: 
					figuras3d();
					opcion = 0;
					break;
				case 99:
					opcion = 99;
					System.out.println("¡Hasta luego!");	
			}
				
		}
	}
	
	//Menú para las figuras 2d.
	private static void figuras2d(){
		int opcion = 0;
		while (opcion == 0) {
			String texto = "¿Qué figura quieres calcular? \n"
					+ "1) Circulo \n"
					//+ "2) Línea\n"
					+ "3) Triangulo\n"
					+ "4) Cuadrado\n"
					+ "5) Pentagono\n"
					+ "q) Atrás\n";
			opcion = UtilsUI.menu(texto);
			
			switch (opcion)
			{
				default:
					System.out.println("No se ha encontrado la opción, vuelve a intentarlo");
					opcion = 0;
					break;
				case 1:
					Circulo circulo = Figuras2d.circulo();
					ventana.add(circulo);
					ventana.repaint();
					opcion = 0;
					break;
				case 3: 
					Triangulo triangulo = Figuras2d.triangulo();
					ventana.add(triangulo);
					ventana.repaint();
					opcion = 0;
					break;
				case 4: 
					Cuadrado cuadrado = Figuras2d.cuadrado();
					ventana.add(cuadrado);
					ventana.repaint();
					opcion = 0;
					break;
				case 5: 
					Pentagono pentagono = Figuras2d.pentagono();
					ventana.add(pentagono);
					ventana.repaint();
					opcion = 0;
					break;
				case 99:
					opcion = 99;
			}
				
		}
	}
	
	//Menú para las figuras 3d
	private static void figuras3d(){
		int opcion = 0;
		while (opcion == 0) {
			String texto = "¿Qué figura quieres calcular? \n"
					+ "1) Esfera\n"
					+ "2) Tetaedro \n"
					+ "3) Cubo\n"
					+ "4) Octaedro\n"
					+ "5) Dodecaedro\n"
					+ "6) Isocaedro\n"
					+ "q) Atrás\n";
			opcion = UtilsUI.menu(texto);
			
			switch (opcion)
			{
				default:
					System.out.println("No se ha encontrado la opción, vuelve a intentarlo");
					opcion = 0;
					break;
				case 1:
					Figuras3d.esfera();
					opcion = 0;
					break;
				case 2:
					Figuras3d.tetaedro();
					opcion = 0;
					break;
				case 3: 
					Figuras3d.cubo();
					opcion = 0;
					break;
				case 4: 
					Figuras3d.octaedro();
					opcion = 0;
					break;
				case 5: 
					Figuras3d.dodecaedro();
					opcion = 0;
					break;
				case 6: 
					Figuras3d.isocaedro();
					opcion = 0;
					break;
				case 99:
					opcion = 99;
			}
					
		}
	}
	
	//Creación de la ventana
	public static Ventana crearVentana(){
		JFrame frame = new JFrame("frame");
		Ventana ventana = new Ventana();
		frame.add(ventana, BorderLayout.CENTER);
		frame.setSize(800,600);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setTitle("Figuras 2D");
		return ventana;
	}
}

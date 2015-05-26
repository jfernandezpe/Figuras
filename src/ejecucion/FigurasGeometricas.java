package ejecucion;

import consoleUI.UtilsUI; // https://github.com/jfernandezpe/Utils

public class FigurasGeometricas {
	public static void main(String[] Args){
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
	
	private static void figuras2d(){
		int opcion = 0;
		while (opcion == 0) {
			String texto = "¿Qué figura quieres calcular? \n"
					+ "1) Circulo \n"
					//+ "2) Figuras 2D\n"
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
					Figuras2d.circulo();
					opcion = 0;
					break;
				case 3: 
					Figuras2d.triangulo();
					opcion = 0;
					break;
				case 4: 
					Figuras2d.cuadrado();
					opcion = 0;
					break;
				case 5: 
					Figuras2d.pentagono();
					opcion = 0;
					break;
				case 99:
					opcion = 99;
					//System.out.println("¡Hasta luego!");	
			}
				
		}
	}
	
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
					//System.out.println("¡Hasta luego!");	
			}
					
		}
	}
}

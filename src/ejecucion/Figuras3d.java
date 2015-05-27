// .src/ejecucion/Figuras3d.java
package ejecucion;

import java.awt.Color;

import consoleUI.UtilsUI;
import figuras3d.Cubo;
import figuras3d.Dodecaedro;
import figuras3d.Esfera;
import figuras3d.Icosaedro;
import figuras3d.Octaedro;
import figuras3d.Tetaedro;

public class Figuras3d {
	static String nombre;
	static Color color;
	static int posx;
	static int posy;
	static int posz;
	static double longLados;
	
	public static void esfera() {
		nombre = "esfera";
		color = Figuras2d.getColor();
		longLados = UtilsUI.getConsoleDouble("Introduce la longitud del radio: ");
		posx = UtilsUI.getConsoleInt("Introduce una coordenada en X [50]", 50);
		posy = UtilsUI.getConsoleInt("Introduce una coordenada en Y [100]", 100);
		posz = UtilsUI.getConsoleInt("Introduce una coordenada en Z [150]", 150);
		
		
		Esfera figura3d = new Esfera(color);
		figura3d.setPosicion(posx, posy, posz);
		figura3d.setRadio(longLados);
		int[] posicion = figura3d.getPosicion();

		System.out.println("Calculo una "+nombre);
		System.out.println("Posicion "+posicion[0]+"x"+posicion[1]+"y"+posicion[2]+"z");
		System.out.println("Color. "+figura3d.getColor());
		System.out.println("Radio: "+figura3d.getRadio()+" Diametro "+figura3d.getDiametro());
		System.out.println("Superficie total: "+figura3d.getSuperficieTotal()+" Volumen: "+figura3d.getVolumen());			
	}

	public static void tetaedro() {
		nombre = "tetaedro";
		color = Figuras2d.getColor();
		longLados = UtilsUI.getConsoleDouble("Introduce la longitud del lado: ");
		posx = UtilsUI.getConsoleInt("Introduce una coordenada en X [50]", 50);
		posy = UtilsUI.getConsoleInt("Introduce una coordenada en Y [100]", 100);
		posz = UtilsUI.getConsoleInt("Introduce una coordenada en Z [150]", 150);
		
		
		Tetaedro figura3d = new Tetaedro(color);
		figura3d.setPosicion(posx, posy, posz);
		figura3d.setLongLados(longLados);
		imprimirPoliedro(figura3d.getNumCaras(), nombre, figura3d.getColor(), figura3d.getPosicion(), figura3d.getLongLados(), figura3d.getVolumen(), figura3d.getSuperficieTotal(),figura3d.getSuperficieCara());		
	}

	public static void cubo() {
		nombre = "cubo";
		color = Figuras2d.getColor();
		longLados = UtilsUI.getConsoleDouble("Introduce la longitud del lado: ");
		posx = UtilsUI.getConsoleInt("Introduce una coordenada en X [50]", 50);
		posy = UtilsUI.getConsoleInt("Introduce una coordenada en Y [100]", 100);
		posz = UtilsUI.getConsoleInt("Introduce una coordenada en Z [150]", 150);
		
		
		Cubo figura3d = new Cubo(color);
		figura3d.setPosicion(posx, posy, posz);
		figura3d.setLongLados(longLados);
		imprimirPoliedro(figura3d.getNumCaras(), nombre, figura3d.getColor(), figura3d.getPosicion(), figura3d.getLongLados(), figura3d.getVolumen(), figura3d.getSuperficieTotal(),figura3d.getSuperficieCara());		
		
	}

	public static void octaedro() {
		nombre = "octaedro";
		color = Figuras2d.getColor();
		longLados = UtilsUI.getConsoleDouble("Introduce la longitud del lado: ");
		posx = UtilsUI.getConsoleInt("Introduce una coordenada en X [50]", 50);
		posy = UtilsUI.getConsoleInt("Introduce una coordenada en Y [100]", 100);
		posz = UtilsUI.getConsoleInt("Introduce una coordenada en Z [150]", 150);
		
		
		Octaedro figura3d = new Octaedro(color);
		figura3d.setPosicion(posx, posy, posz);
		figura3d.setLongLados(longLados);
		imprimirPoliedro(figura3d.getNumCaras(), nombre, figura3d.getColor(), figura3d.getPosicion(), figura3d.getLongLados(), figura3d.getVolumen(), figura3d.getSuperficieTotal(),figura3d.getSuperficieCara());		
	
	}

	public static void dodecaedro() {
		nombre = "dodecaedro";
		color = Figuras2d.getColor();
		longLados = UtilsUI.getConsoleDouble("Introduce la longitud del lado: ");
		posx = UtilsUI.getConsoleInt("Introduce una coordenada en X [50]", 50);
		posy = UtilsUI.getConsoleInt("Introduce una coordenada en Y [100]", 100);
		posz = UtilsUI.getConsoleInt("Introduce una coordenada en Z [150]", 150);
		
		
		Dodecaedro figura3d = new Dodecaedro(color);
		figura3d.setPosicion(posx, posy, posz);
		figura3d.setLongLados(longLados);
		imprimirPoliedro(figura3d.getNumCaras(), nombre, figura3d.getColor(), figura3d.getPosicion(), figura3d.getLongLados(), figura3d.getVolumen(), figura3d.getSuperficieTotal(),figura3d.getSuperficieCara());		
	}

	public static void isocaedro() {
		nombre = "Icosaedro";
		color = Figuras2d.getColor();
		longLados = UtilsUI.getConsoleDouble("Introduce la longitud del lado: ");
		posx = UtilsUI.getConsoleInt("Introduce una coordenada en X [50]", 50);
		posy = UtilsUI.getConsoleInt("Introduce una coordenada en Y [100]", 100);
		posz = UtilsUI.getConsoleInt("Introduce una coordenada en Z [150]", 150);
		
		
		Icosaedro figura3d = new Icosaedro(color);
		figura3d.setPosicion(posx, posy, posz);
		figura3d.setLongLados(longLados);
		imprimirPoliedro(figura3d.getNumCaras(), nombre, figura3d.getColor(), figura3d.getPosicion(), figura3d.getLongLados(), figura3d.getVolumen(), figura3d.getSuperficieTotal(),figura3d.getSuperficieCara());				
	}
	
	public static void imprimirPoliedro(int numLados,String nombre, Color color,int[] posicion, double longLados, double volumen, double superficie, double superficieCara){
		System.out.println("Calculo un "+nombre+" (poliedro de "+ numLados +" caras)");
		System.out.println("Posicion "+posicion[0]+"x"+posicion[1]+"y"+posicion[2]+"z");
		System.out.println("Color. "+color);
		System.out.println("Longitud lados: "+longLados+" Volumen: "+volumen);
		System.out.println("Superficie total: "+superficie +" Superficie cara: "+superficieCara);
	}



}

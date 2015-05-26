package ejecucion;

import java.awt.Color;

import consoleUI.UtilsUI;
import figuras2d.Circulo;
import figuras2d.Cuadrado;
import figuras2d.Pentagono;
import figuras2d.Triangulo;

public class Figuras2d {
	static Color color;
	static double longLados;
	static double radio;
	static int posx;
	static int posy;
	static int posicion[];
	static double perimetro;
	static double superficie;
	static int numLados;

	public static void circulo() {
		color = getColor();
		radio = UtilsUI.getConsoleDouble("Introduce un radio: ");
		posx = UtilsUI.getConsoleInt("Introduce una coordenada en X [50]", 50);
		posy = UtilsUI.getConsoleInt("Introduce una coordenada en Y [100]", 100);
		Circulo circulo = new Circulo(color);
		circulo.setPosicion(posx,posy);
		circulo.setRadio(radio);
		posicion = circulo.getPosicion();
		
		System.out.println("Calculo un circulo:");
		System.out.println("Color. "+circulo.getColor());
		System.out.println("Posicion "+posicion[0]+ "x" +posicion[1]);
		System.out.println("Radio: "+circulo.getRadio()+" Diametro "+circulo.getDiametro());
		System.out.println("Superficie: "+circulo.getSuperficie()+" Perimetro "+circulo.getPerimetro());		
	}

	public static void triangulo() {
		color = getColor();
		longLados = UtilsUI.getConsoleDouble("Introduce la longitud del lado: ");
		posx = UtilsUI.getConsoleInt("Introduce una coordenada en X [50]", 50);
		posy = UtilsUI.getConsoleInt("Introduce una coordenada en Y [100]", 100);
		Triangulo figura2d = new Triangulo(color);
		figura2d.setPosicion(posx,posy);
		figura2d.setLongLados(longLados);

		imprimirPoligono(figura2d.getNumLados(), figura2d.getColor(), figura2d.getPosicion(),  figura2d.getLongLados(), figura2d.getSuperficie(), figura2d.getPerimetro());
	
	}

	public static void cuadrado() {
		color = getColor();
		longLados = UtilsUI.getConsoleDouble("Introduce la longitud del lado: ");
		posx = UtilsUI.getConsoleInt("Introduce una coordenada en X [50]", 50);
		posy = UtilsUI.getConsoleInt("Introduce una coordenada en Y [100]", 100);
		Cuadrado figura2d = new Cuadrado(color);
		figura2d.setPosicion(posx,posy);
		figura2d.setLongLados(longLados);

		imprimirPoligono(figura2d.getNumLados(), figura2d.getColor(), figura2d.getPosicion(), figura2d.getLongLados(), figura2d.getSuperficie(), figura2d.getPerimetro());
	}

	public static void pentagono() {
		color = getColor();
		longLados = UtilsUI.getConsoleDouble("Introduce la longitud del lado: ");
		posx = UtilsUI.getConsoleInt("Introduce una coordenada en X [50]", 50);
		posy = UtilsUI.getConsoleInt("Introduce una coordenada en Y [100]", 100);
		Pentagono figura2d = new Pentagono(color);
		figura2d.setPosicion(posx,posy);
		figura2d.setLongLados(longLados);

		imprimirPoligono(figura2d.getNumLados(), figura2d.getColor(), figura2d.getPosicion(), figura2d.getLongLados(), figura2d.getSuperficie(), figura2d.getPerimetro());
	}
	
	public static Color getColor(String listaColores[]){
		Color color;
		
		String col = UtilsUI.getCololeOption("Introduce un color(Rojo, verde o azul):",listaColores);
		if (col.equals("rojo")){
			color = Color.RED;
		} else if (col.equals("verde")){
			color = Color.GREEN;
		} else {
			color = Color.BLUE;
		}
		return color;
	}
	
	public static Color getColor(){
		String listaColores[] = {"rojo", "verde", "azul"};
		return getColor(listaColores);
	}
	
	public static void imprimirPoligono(int numLados,Color color,int[] posicion, double longLados,double superficie, double perimetro){
		System.out.println("Calculo un poligono de "+ numLados +" lados");
		System.out.println("Posicion "+posicion[0]+"x"+posicion[1]+"y");
		System.out.println("Color. "+color);
		System.out.println("Longitud lados: "+longLados);
		System.out.println("Superficie: "+superficie+ " Perimetro: "+perimetro);
	}
	

}

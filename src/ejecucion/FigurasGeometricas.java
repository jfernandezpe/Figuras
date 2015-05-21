package ejecucion;

import java.awt.Color;

import figurasGeometricas.Circulo;
import figurasGeometricas.Cuadrado;
import figurasGeometricas.FiguraGeometrica;

public class FigurasGeometricas {
	public static void main(String[] Args){
		FiguraGeometrica circulo = new Circulo();
		Circulo circulo2 = new Circulo();
		Cuadrado cuadrado = new Cuadrado();
		
		circulo.setColor(Color.RED);
		circulo2.setColor(Color.YELLOW);
		cuadrado.setColor(Color.GREEN);
		
		System.out.println(circulo.getColor());
		System.out.println(circulo2.getColor());
		System.out.println(cuadrado.getColor());
		
		
	}
}

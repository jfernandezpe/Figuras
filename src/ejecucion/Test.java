package ejecucion;

import java.awt.Color;

import figuras2d.Circulo;
import figuras2d.Cuadrado;

public class Test {
	public static void main(String[] Args){
		Circulo circulo = new Circulo();
		circulo.setColor(Color.RED);
		circulo.setPosicion(4,5);
		circulo.setRadio(5);
		System.out.println(circulo.getColor());
		System.out.println(circulo.getRadio());
		System.out.println(circulo.getDiametro());
		System.out.println(circulo.getPerimetro());
		System.out.println(circulo.getSuperficie());
		int ar[] = circulo.getPosicion();
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		
		
		System.out.println("________________");
		
		Cuadrado cuadrado = new Cuadrado();
		cuadrado.setColor(Color.RED);
		cuadrado.setPosicion(4,5);
		cuadrado.setLongLados(5);
		System.out.println(cuadrado.getColor());
		System.out.println(cuadrado.getLongLados());
		System.out.println(cuadrado.numLados);
		System.out.println(cuadrado.getPerimetro());
		System.out.println(cuadrado.getSuperficie());
		
		
	}
	
}

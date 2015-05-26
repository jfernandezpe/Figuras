package test;

import java.awt.Color;

import figuras2d.Circulo;
import figuras2d.Cuadrado;
import figuras2d.Pentagono;
import figuras2d.Triangulo;

public class Test2d {
	public static void main(String[] Args){
		int ar[];
		
		System.out.println("====CIRCULO====");
		Circulo circulo = new Circulo();
		circulo.setColor(Color.RED);
		circulo.setPosicion(4,5);
		circulo.setRadio(5);
		System.out.println(circulo.getColor());
		System.out.println(circulo.getRadio());
		System.out.println(circulo.getDiametro());
		System.out.println(circulo.getPerimetro());
		System.out.println(circulo.getSuperficie());
		ar = circulo.getPosicion();
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		
		
		System.out.println("====CUADRADO====");
		Cuadrado cuadrado = new Cuadrado();
		cuadrado.setColor(Color.RED);
		cuadrado.setPosicion(4,5);
		cuadrado.setLongLados(5);
		System.out.println(cuadrado.getColor());
		System.out.println(cuadrado.getLongLados());
		System.out.println(cuadrado.numLados);
		System.out.println(cuadrado.getPerimetro());
		System.out.println(cuadrado.getSuperficie());
		ar = cuadrado.getPosicion();
		System.out.println(ar[0]);
		System.out.println(ar[1]);	
		
		System.out.println("====PENTAGONO====");
		Pentagono pentagono = new Pentagono();
		pentagono.setColor(Color.RED);
		pentagono.setPosicion(4,5);
		pentagono.setLongLados(5);
		System.out.println(pentagono.getColor());
		System.out.println(pentagono.getLongLados());
		System.out.println(pentagono.numLados);
		System.out.println(pentagono.getPerimetro());
		System.out.println(pentagono.getSuperficie());
		ar = pentagono.getPosicion();
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		
		System.out.println("====TRIANGULO====");
		Triangulo triangulo = new Triangulo();
		triangulo.setColor(Color.RED);
		triangulo.setPosicion(4,5);
		triangulo.setLongLados(5);
		System.out.println(triangulo.getColor());
		System.out.println(triangulo.getLongLados());
		System.out.println(triangulo.numLados);
		System.out.println(triangulo.getPerimetro());
		System.out.println(triangulo.getSuperficie());
		ar = triangulo.getPosicion();
		System.out.println(ar[0]);
		System.out.println(ar[1]);			
	}
	
}

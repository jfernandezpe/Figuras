package ejecucion;

import java.awt.Color;

import figuras3d.Cubo;

public class Test3d {

	public static void main(String[] args) {
		int ar[];
		Cubo cubo = new Cubo();
		cubo.setLongLados(2);
		cubo.setPosicion(100,200,300);
		cubo.setColor(Color.BLUE);
		
		System.out.println(cubo.getColor());
		ar = cubo.getPosicion();
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(cubo.getVolumen());
		System.out.println(cubo.getSuperficieCara());
		System.out.println(cubo.getSuperficieTotal());
	}

}

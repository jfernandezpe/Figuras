package test;

import java.awt.Color;

import figuras3d.Cubo;
import figuras3d.Dodecaedro;
import figuras3d.Esfera;
import figuras3d.Icosaedro;
import figuras3d.Octaedro;
import figuras3d.Tetaedro;

public class Test3d {

	public static void main(String[] args) {
		int ar[];
		double longi = 2;

		//Comenar y descomentar según corresponda
		
//		Cubo figura3d = new Cubo(); //OK
//		Dodecaedro figura3d = new Dodecaedro(); 
//		Esfera figura3d = new Esfera(); 
//		Isocaedro figura3d = new Isocaedro();
//		Octaedro figura3d = new Octaedro(); //Falla
		Tetaedro figura3d = new Tetaedro(); //falla
		
		figura3d.setLongLados(longi); //NO esfera
//		figura3d.setRadio(longi); //Solo esfera
//		figura3d.setDiametro(longi); //solo esfera
		figura3d.setPosicion(100,200,300);
		figura3d.setColor(Color.BLUE);
		
		System.out.println(figura3d.getColor());
		ar = figura3d.getPosicion();
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(figura3d.getVolumen());
		System.out.println(figura3d.getSuperficieCara()); //No esfera
		System.out.println(figura3d.getLongLados()); //No esfera
//		System.out.println(figura3d.getRadio()); //Solo esfera
//		System.out.println(figura3d.getDiametro()); //Solo esfera
		System.out.println(figura3d.getSuperficieTotal()); 
	}

}

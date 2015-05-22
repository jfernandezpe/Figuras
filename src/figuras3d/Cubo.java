package figuras3d;

import java.awt.Color;

import figuras2d.Cuadrado;

public class Cubo extends PoliedroRegular {
	public final int NUMCARAS = 4;
	
	Cubo(){
		super();
	}
	
	Cubo(Color color){
		super(color);
	}
	
	protected void calcularVolumen(){
		volumen = Math.pow(longLados,3);
	}
	
	public void actualizarFigura(){
		System.out.println("implementar metodo");
	}
	
	
	
}

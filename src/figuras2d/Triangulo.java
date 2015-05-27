// .src/figuras2d/Triangulo.java
package figuras2d;

import java.awt.Color;

public class Triangulo extends PoligonoRegular{

	public int numLados = super.setNumLados(3);
	private double altura = 0;
	
	public Triangulo(){
		super();
	}
	
	public Triangulo(Color col){
		super(col);
	}
		
	public Triangulo(Color col, int pos[]){
		super(col,pos);
	}
	
	public Triangulo(Color col, int px, int py){
		super(col,px,py);
	}
	
	public Triangulo(int pos[]){
		super(pos);
	}
	
	public Triangulo(int px, int py){
		super(px,py);
	}
		
	public void calcularSuperficie(){
		calcularAltura(); //por si hubiesen variado los datos
		superficie = longLados * altura / 2;
	}
	
	public double calcularAltura(){
		
		altura = Math.sqrt(3) / 2 * longLados;
		
		return altura;		
	}

	public double getAltura() {
		return altura;
	}
}

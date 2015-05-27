// .src/figuras2d/Figura2D.java
package figuras2d;

import java.awt.Color;

import figuras.Figura;

public abstract class Figura2D extends Figura {
	//protected int[] posicion = new int[2];
	protected double perimetro;
	protected double superficie;
	
	public Figura2D(){
		super();
	}
	
	public Figura2D(Color col){
		super(col);
	}
		
	public Figura2D(Color col, int pos[]){
		super(col);
		setPosicion(pos);
	}
	
	public Figura2D(Color col, int px, int py){
		super(col);
		setPosicion(px,py);
	}
	
	public Figura2D(int pos[]){
		super();
		setPosicion(pos);
	}
	
	public Figura2D(int px, int py){
		super();
		setPosicion(px,py);
	}
	
	protected abstract void calcularPerimetro();
	protected abstract void calcularSuperficie();
	
	public double getPerimetro(){
		return perimetro;
	}
	
	public double getSuperficie(){
		return superficie;
	}
	
	public void setPosicion(int px, int py){
		posicion = new int[2];
		posicion[0] = px;
		posicion[1] = py;
	}
	
	public void setPosicion(int pos[]){
		posicion = new int[2];		
		posicion[0] = pos[0];
		posicion[1] = pos[1];
	}
}

// .src/figuras3d/Figura3D.java
package figuras3d;

import java.awt.Color;

import figuras.Figura;

public abstract class Figura3D extends Figura{
	//public int[] posicion;
	protected double superficieTotal;
	protected double volumen;
	
	protected abstract void calcularSuperficieTotal();
	protected abstract void calcularVolumen();
	
	public Figura3D(){
		super();
	}
	
	public Figura3D(Color color){
		super(color);
	}
	
	public double getSuperficieTotal(){
		return superficieTotal;
	}
	
	public double getVolumen(){
		return volumen;
	}
	
	public void setPosicion(int posx, int posy, int posz){
		posicion = new int[3];
		posicion[0] = posx;
		posicion[1] = posy;
		posicion[2] = posz;
	}
	
	public void setPosicion(int[] posicion){
		posicion = new int[3];
		this.posicion[0] = posicion[0];
		this.posicion[1] = posicion[1];
		this.posicion[2] = posicion[2];
	}
	
	
}

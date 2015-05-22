package figuras3d;

import figuras.Figura;

public abstract class Figura3D extends Figura{
	public int[] posicion;
	protected double superficieTotal;
	protected double volumen;
	
	protected abstract void calcularSuperfieTotal();
	protected abstract void calcularVolumen();
	
	public double getSuperficieTotal(){
		return superficieTotal;
	}
	
	public double getVolumen(){
		return volumen;
	}
	
	public void setPosicion(int posx, int posy, int posz){
		posicion[0] = posx;
		posicion[1] = posy;
		posicion[2] = posz;
	}
	
	public void setPosicion(int[] posicion){
		this.posicion[0] = posicion[0];
		this.posicion[1] = posicion[1];
		this.posicion[2] = posicion[2];
	}
	
	
}

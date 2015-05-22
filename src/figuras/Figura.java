package figuras;

import java.awt.Color;

public abstract class Figura {
	protected int[] posicion;
	protected Color color;
	
	public Figura(){
	}
	
	public Figura(Color color){
		this.color = color;
	}
	
	public abstract void setPosicion();
	
	public int[] getPosicion(){
		return posicion;
	}
	public void setColor(Color color){
		this.color = color;
	}
	
	public Color getColor(){
		return color;
	}
}

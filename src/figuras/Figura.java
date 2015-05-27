// .src/figuras/Figuras.java
package figuras;

import java.awt.Color;
/**
 * Figura
 * 
 * @author jfernandezpe
 * @version 0.2 2015/05/27
 *
 */
public abstract class Figura {
	protected int[] posicion;
	protected Color color;
	
	/**
	 * Contructor
	 */
	public Figura(){
	}
	
	/**
	 * Contructor
	 * 
	 * @param color
	 */
	public Figura(Color color){
		this.color = color;
	}
	
	/**
	 * Obtiene posicion
	 * 
	 * @return
	 */
	public int[] getPosicion(){
		return posicion;
	}
	
	/**
	 * Define un color
	 * 
	 * @param color
	 */
	public void setColor(Color color){
		this.color = color;
	}
	
	/**
	 * Obtiene el color
	 * 
	 * @return
	 */
	public Color getColor(){
		return color;
	}
}

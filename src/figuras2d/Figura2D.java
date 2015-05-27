// .src/figuras2d/Figura2D.java
package figuras2d;

import java.awt.Color;

import figuras.Figura;
/**
 * 
 * @author jfernandezpe
 * @version 0.2 2015/05/27
 *
 */
public abstract class Figura2D extends Figura {
	//protected int[] posicion = new int[2];
	protected double perimetro;
	protected double superficie;
	
	/**
	 * 
	 */
	public Figura2D(){
		super();
	}
	/**
	 * 
	 * @param col
	 */
	public Figura2D(Color col){
		super(col);
	}
	/**
	 * 
	 * @param col
	 * @param pos
	 */
	public Figura2D(Color col, int pos[]){
		super(col);
		setPosicion(pos);
	}
	/**
	 * 
	 * @param col
	 * @param px
	 * @param py
	 */
	public Figura2D(Color col, int px, int py){
		super(col);
		setPosicion(px,py);
	}
	/**
	 * 
	 * @param pos
	 */
	public Figura2D(int pos[]){
		super();
		setPosicion(pos);
	}
	/**
	 * 
	 * @param px
	 * @param py
	 */
	public Figura2D(int px, int py){
		super();
		setPosicion(px,py);
	}
	/**
	 * 
	 */
	protected abstract void calcularPerimetro();
	/**
	 * 
	 */
	protected abstract void calcularSuperficie();
	/**
	 * 
	 * @return
	 */
	public double getPerimetro(){
		return perimetro;
	}
	/**
	 * 
	 * @return
	 */
	public double getSuperficie(){
		return superficie;
	}
	/**
	 * 
	 * @param px
	 * @param py
	 */
	public void setPosicion(int px, int py){
		posicion = new int[2];
		posicion[0] = px;
		posicion[1] = py;
	}
	/**
	 * 
	 * @param pos
	 */
	public void setPosicion(int pos[]){
		posicion = new int[2];		
		posicion[0] = pos[0];
		posicion[1] = pos[1];
	}
}

// .src/figuras2d/Cuadrado.java
package figuras2d;

import java.awt.Color;
/**
 * 
 * @author jfernandezpe
 * @version 0.2 2015/05/27
 *
 */
public class Cuadrado extends PoligonoRegular {
	
	public int numLados = super.setNumLados(4);
	
	/**
	 * 
	 */
	public Cuadrado(){
		super();
	}
	
	/**
	 * 
	 * @param col
	 */
	public Cuadrado(Color col){
		super(col);
	}
	/**
	 * 
	 * @param col
	 * @param pos
	 */
	public Cuadrado(Color col, int pos[]){
		super(col,pos);
	}
	/**
	 * 
	 * @param col
	 * @param px
	 * @param py
	 */
	public Cuadrado(Color col, int px, int py){
		super(col,px,py);
	}
	/**
	 * 
	 * @param pos
	 */
	public Cuadrado(int pos[]){
		super(pos);
	}
	/**
	 * 
	 * @param px
	 * @param py
	 */
	public Cuadrado(int px, int py){
		super(px,py);
	}
	/**
	 * 
	 */
	protected void calcularSuperficie(){
		superficie = longLados * longLados;
	}
}

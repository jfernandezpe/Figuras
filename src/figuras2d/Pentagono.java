// .src/figuras2d/Pentagono.java
package figuras2d;

import java.awt.Color;
/**
 * 
 * @author jfernandezpe
 * @version 0.2 2015/05/27
 *
 */
public class Pentagono extends PoligonoRegular {
	public int numLados = super.setNumLados(5);
	/**
	 * 
	 */
	public Pentagono(){
		super();
	}
	/**
	 * 
	 * @param col
	 */
	public Pentagono(Color col){
		super(col);
	}
	/**
	 * 
	 * @param col
	 * @param pos
	 */
	public Pentagono(Color col, int pos[]){
		super(col,pos);
	}
	/**
	 * 
	 * @param col
	 * @param px
	 * @param py
	 */
	public Pentagono(Color col, int px, int py){
		super(col,px,py);
	}
	/**
	 * 
	 * @param pos
	 */
	public Pentagono(int pos[]){
		super(pos);
	}
	/**
	 * 
	 * @param px
	 * @param py
	 */
	public Pentagono(int px, int py){
		super(px,py);
	}
	/**
	 * 	
	 */
	protected void calcularSuperficie(){
		superficie = numLados * Math.pow(longLados,2);
		double tangenciable = Math.tan(Math.toRadians(360 / numLados / 2));
		superficie = superficie / (4 * tangenciable);
	}
}

// .src/figuras2d/Triangulo.java
package figuras2d;

import java.awt.Color;
/**
 * 
 * @author jfernandezpe
 * @version 0.2 2015/05/27
 *
 */
public class Triangulo extends PoligonoRegular{

	public int numLados = super.setNumLados(3);
	/**
	 * 
	 */
	private double altura = 0;
	/**
	 * 
	 */
	public Triangulo(){
		super();
	}
	/**
	 * 
	 * @param col
	 */
	public Triangulo(Color col){
		super(col);
	}
	/**
	 * 
	 * @param col
	 * @param pos
	 */
	public Triangulo(Color col, int pos[]){
		super(col,pos);
	}
	/**
	 * 
	 * @param col
	 * @param px
	 * @param py
	 */
	public Triangulo(Color col, int px, int py){
		super(col,px,py);
	}
	/**
	 * 
	 * @param pos
	 */
	public Triangulo(int pos[]){
		super(pos);
	}
	/**
	 * 
	 * @param px
	 * @param py
	 */
	public Triangulo(int px, int py){
		super(px,py);
	}
	/**
	 * 	
	 */
	protected void calcularSuperficie(){
		calcularAltura(); //por si hubiesen variado los datos
		superficie = longLados * altura / 2;
	}
	/**
	 * 
	 * @return
	 */
	public double calcularAltura(){
		
		altura = Math.sqrt(3) / 2 * longLados;
		
		return altura;		
	}
	/**
	 * 
	 * @return
	 */
	public double getAltura() {
		return altura;
	}
}

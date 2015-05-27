// .src/figuras3d/PoliedroRegular.java
package figuras3d;

import java.awt.Color;
/**
 * 
 * @author jfernandezpe
 * @version 0.2 2015/05/27
 *
 */
public abstract class PoliedroRegular extends Figura3D{
	public int numCaras = 0;
	protected double longLados = 0;
	protected double superficieCara;
	/**
	 * 
	 */
	public PoliedroRegular(){
		super();
	}
	/**
	 * 
	 * @param color
	 */
	public PoliedroRegular(Color color){
		super(color);
	}
	/**
	 * 
	 */
	protected void calcularSuperficieTotal(){
		superficieTotal = superficieCara * numCaras;
	}
	/**
	 * 
	 * @return
	 */
	public int getNumCaras(){
		return numCaras;
	}
	/**
	 * 
	 */
	protected abstract void calcularVolumen();
	/**
	 * 
	 * @param longLados
	 */
	public void setLongLados(double longLados){
		this.longLados = longLados;
		actualizarFigura(this.longLados);
	}
	/**
	 * 
	 * @return
	 */
	public double getLongLados(){
		return longLados;
	}
	/**
	 * 
	 * @return
	 */
	public double getSuperficieCara(){
		return superficieCara;
	}
	/**
	 * 
	 * @param lLados
	 */
	protected abstract void actualizarFigura(double lLados);
	/**
	 * 
	 * @param num
	 * @return
	 */
	protected int setNumCaras(int num){
		numCaras = num;
		return numCaras;
	}
}

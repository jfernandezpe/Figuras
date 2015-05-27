// .src/figuras3d/Esfera.java
package figuras3d;

import java.awt.Color;
/**
 * 
 * @author jfernandezpe
 * @version 0.2 2015/05/27
 *
 */
public class Esfera extends Figura3D {
	private double radio;
	private double diametro;
	
	/**
	 * 
	 */
	public Esfera(){
		super();
	}
	/**
	 * 
	 * @param color
	 */
	public Esfera(Color color){
		super(color);
	}
	/**
	 * 
	 */
	protected void calcularSuperficieTotal(){
		superficieTotal = 4 * Math.PI * Math.pow(radio, 2);
	}
	/**
	 * 
	 */
	protected void calcularVolumen(){
		System.out.println(radio);
		volumen = (4 * Math.PI * Math.pow(radio, 3)) /  3d;
	}
	/**
	 * 
	 * @param radio
	 */
	public void setRadio(double radio){
		this.radio = radio;
		this.diametro = radio * 2d;
		actualizarFigura();
	}
	/**
	 * 
	 * @return
	 */
	public double getRadio(){
		return radio;
	}
	/**
	 * 
	 * @param diametro
	 */
	public void setDiametro(double diametro){
		this.radio = diametro / 2d;
		this.diametro = diametro;
		actualizarFigura();
	}
	/**
	 * 
	 * @return
	 */
	public double getDiametro(){
		return diametro;
	}
	/**
	 * 
	 */
	protected void actualizarFigura(){
		calcularSuperficieTotal();
		calcularVolumen();
	}
}

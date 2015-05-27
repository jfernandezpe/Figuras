// .src/figuras2d/Circulo.java
package figuras2d;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Circulo
 * 
 * @author jfernandezpe
 * @version 0.2 2015/05/27
 *
 */
public class Circulo extends Figura2D{
	private double radio;
	private double diametro;
	
	/**
	 * Contructor
	 */
	public Circulo(){
		super();
	}
	
	/**
	 * Contructor
	 * 
	 * @param col
	 */
	public Circulo(Color col){
		super(col);
	}
		
	/**
	 * Contructor
	 * 
	 * @param col
	 * @param pos
	 */
	public Circulo(Color col, int pos[]){
		super(col,pos);
	}
	
	/**
	 * Contructor
	 * 
	 * @param col
	 * @param px
	 * @param py
	 */
	public Circulo(Color col, int px, int py){
		super(col,px,py);
	}
	
	/**
	 * Constructor
	 * 
	 * @param pos
	 */
	public Circulo(int pos[]){
		super(pos);
	}
	
	/**
	 * Constructor 
	 * 
	 * @param px
	 * @param py
	 */
	public Circulo(int px, int py){
		super(px,py);
	}
	
	
	protected void calcularPerimetro(){
		perimetro = 2 * Math.PI * radio;
	}
	protected void calcularSuperficie(){
		superficie = 2 * Math.PI * Math.pow(radio,2);
	}
	
	/**
	 * 
	 * @return
	 */
	public double getRadio() {
		return radio;
	}
	
	/**
	 * 
	 * @param radio
	 */
	public void setRadio(double radio) {
		this.radio = radio;
		this.diametro = radio * 2;
		calcularPerimetro();
		calcularSuperficie();
	}
	
	/**
	 * 
	 * @return
	 */
	public double getDiametro() {
		return diametro;
	}
	
	/**
	 * 
	 * @param diametro
	 */
	public void setDiametro(double diametro) {
		this.diametro = diametro;
		this.radio = diametro/2;
		calcularPerimetro();
		calcularSuperficie();
	}	
	
	/**
	 * 
	 * @param g
	 */
	public void pintar(Graphics g){
		g.setColor(color);
		int posx = (int) (posicion[0] - diametro / 2);
		int posy = (int) (posicion[1] - diametro / 2);
		g.fillOval(posx, posy, (int) diametro, (int) diametro);
	}
}

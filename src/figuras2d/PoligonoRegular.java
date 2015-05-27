// .src/figuras2d/PoligonoRegular.java
package figuras2d;

import java.awt.Color;
import java.awt.Graphics;
/**
 * 
 * @author jfernandezpe
 * @version 0.2 2015/05/27
 *
 */
public abstract class PoligonoRegular extends Figura2D{
	protected int numLados;
	protected double longLados = 0;
	protected double radio = 0;
	protected int coordx[];
	protected int coordy[];
	/**
	 * 
	 */
	public PoligonoRegular(){
		super();
	}
	/**
	 * 
	 * @param col
	 */
	public PoligonoRegular(Color col){
		super(col);
	}
	/**
	 * 
	 * @param col
	 * @param pos
	 */
	
	public PoligonoRegular(Color col, int pos[]){
		super(col,pos);
	}
	/**
	 * 
	 * @param col
	 * @param px
	 * @param py
	 */
	public PoligonoRegular(Color col, int px, int py){
		super(col,px,py);
	}
	/**
	 * 
	 * @param pos
	 */
	public PoligonoRegular(int pos[]){
		super(pos);
	}
	/**
	 * 
	 * @param px
	 * @param py
	 */
	public PoligonoRegular(int px, int py){
		super(px,py);
	}
	/**
	 * 
	 * @return
	 */
	public int getNumLados(){
		return numLados;
	}
	/**
	 * 
	 */
	public void calcularPerimetro(){
		perimetro = longLados * this.numLados;
	}
	/**
	 * 
	 */
	protected abstract void calcularSuperficie();
	/**
	 * 
	 */
	private void calcularPosiciones(){;
		double theta = 2 * Math.PI  / numLados;
		for (int i = 0; i < numLados; ++i) {
		    coordx[i] = (int) (Math.cos(theta * i) * longLados + posicion[0]);
		    coordy[i] = (int) (Math.sin(theta * i) * longLados + posicion[1]);
		}
	}
	/**
	 * 
	 * @param lLados
	 */
	public void setLongLados(double lLados){
		longLados = lLados;
		calcularPosiciones();
		calcularPerimetro();
		calcularSuperficie();
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
	 * @param num
	 * @return
	 */
	protected int setNumLados(int num){
		numLados = num;
		coordx = new int[numLados];
		coordy = new int[numLados];
		return numLados;
	}
	/**
	 * 
	 * @param g
	 */
	public void pintar(Graphics g) {
		g.setColor(color);
		g.fillPolygon(coordx,coordy,numLados);
	}
}

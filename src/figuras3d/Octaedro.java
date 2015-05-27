// .src/figuras3d/Octaedro.java
package figuras3d;

import java.awt.Color;

import figuras2d.Triangulo;
/**
 * 
 * @author jfernandezpe
 * @version 0.2 2015/05/27
 *
 */
public class Octaedro extends PoliedroRegular {
	protected int numCaras = setNumCaras(8);
	private Triangulo figura2d;
	/**
	 * 
	 */
	public Octaedro(){
		super();
		generarCara();
	}
	/**
	 * 
	 * @param color
	 */
	public Octaedro(Color color){
		super(color);
		generarCara();
	}
	/**
	 * 
	 */
	private void generarCara(){
		figura2d = new Triangulo();
	}	
	/**
	 * 
	 */
	protected void calcularVolumen(){
		volumen = 1d / 3d * Math.sqrt(2) * Math.pow(figura2d.getLongLados(),3);
	}
	/**
	 * 
	 */
	protected void actualizarFigura(double lLados){
		figura2d.setLongLados(lLados);
		superficieCara = figura2d.getSuperficie();
		calcularSuperficieTotal();
		calcularVolumen();
	}
}
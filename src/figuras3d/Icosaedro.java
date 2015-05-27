// .src/figuras3d/Icosaedro.java
package figuras3d;

import java.awt.Color;

import figuras2d.Triangulo;
/**
 * 
 * @author jfernandezpe
 * @version 0.2 2015/05/27
 *
 */
public class Icosaedro extends PoliedroRegular {
	protected int numCaras = setNumCaras(20);
	private Triangulo figura2d;
	
	/**
	 * 
	 */
	public Icosaedro(){
		super();
		generarCara();
	}
	/**
	 * 
	 * @param color
	 */
	public Icosaedro(Color color){
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
		volumen = 5d / 12d * ( 3 + Math.sqrt(5)) * Math.pow(figura2d.getLongLados(),3);
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
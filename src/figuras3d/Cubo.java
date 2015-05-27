// .src/figuras3d/Cubo.java
package figuras3d;

import java.awt.Color;
import figuras2d.Cuadrado;
/**
 * 
 * @author jfernandezpe
 * @version 0.2 2015/05/27
 *
 */
public class Cubo extends PoliedroRegular {
	protected int numCaras = setNumCaras(4);
	private Cuadrado figura2d;
	/**
	 * 
	 */
	public Cubo(){
		super();
		generarCara();
	}
	/**
	 * 
	 * @param color
	 */
	public Cubo(Color color){
		super(color);
		generarCara();
	}
	/**
	 * 
	 */
	private void generarCara(){
		figura2d = new Cuadrado();
	}	
	/**
	 * 
	 */
	protected void calcularVolumen(){
		volumen = Math.pow(figura2d.getLongLados(),3);
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

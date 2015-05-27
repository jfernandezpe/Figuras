// .src/figuras3d/Dodecaedro.java
package figuras3d;

import java.awt.Color;
import figuras2d.Pentagono;
/**
 * 
 * @author jfernandezpe
 * @version 0.2 2015/05/27
 *
 */
public class Dodecaedro extends PoliedroRegular {
	protected int numCaras = setNumCaras(12);
	private Pentagono figura2d;
	
	/**
	 * 
	 */
	public Dodecaedro(){
		super();
		generarCara();
	}
	/**
	 * 
	 * @param color
	 */
	public Dodecaedro(Color color){
		super(color);
		generarCara();
	}
	/**
	 * 
	 */
	private void generarCara(){
		figura2d = new Pentagono();
	}	
	/**
	 * 
	 */
	protected void calcularVolumen(){
		volumen =  1d / 4d  * (15 + 7 * Math.sqrt(5)) * Math.pow(figura2d.getLongLados(),3);
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

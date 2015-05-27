// .src/figuras2d/Pentagono.java
package figuras2d;

import java.awt.Color;

public class Pentagono extends PoligonoRegular {
	public int numLados = super.setNumLados(5);
	
	public Pentagono(){
		super();
	}
	
	public Pentagono(Color col){
		super(col);
	}
		
	public Pentagono(Color col, int pos[]){
		super(col,pos);
	}
	
	public Pentagono(Color col, int px, int py){
		super(col,px,py);
	}
	
	public Pentagono(int pos[]){
		super(pos);
	}
	
	public Pentagono(int px, int py){
		super(px,py);
	}
		
	public void calcularSuperficie(){
		superficie = numLados * Math.pow(longLados,2);
		double tangenciable = Math.tan(Math.toRadians(360 / numLados / 2));
		
		superficie = superficie / (4 * tangenciable);
	}
}

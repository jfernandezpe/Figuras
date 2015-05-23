package figuras2d;

import java.awt.Color;

public class Pentagono extends PoligonoRegular {
	public int numLados = super.setNumLados(5);
	private double apotema = 0;
	
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
	
	public double calcularApotema(){
		apotema = longLados * Math.tan(54) / 2;
		return apotema;
	}
	
	public void calcularSuperficie(){
		calcularApotema(); //Por si hubiesen cambiado los lados
		superficie = perimetro * apotema / 2;
	}
}

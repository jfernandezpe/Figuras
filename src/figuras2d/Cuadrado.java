package figuras2d;

import java.awt.Color;

public class Cuadrado extends PoligonoRegular {
	
	public int numLados = super.setNumLados(4);
	
	public Cuadrado(){
		super();
	}
	
	public Cuadrado(Color col){
		super(col);
	}
		
	public Cuadrado(Color col, int pos[]){
		super(col,pos);
	}
	
	public Cuadrado(Color col, int px, int py){
		super(col,px,py);
	}
	
	public Cuadrado(int pos[]){
		super(pos);
	}
	
	public Cuadrado(int px, int py){
		super(px,py);
	}
	
	public void calcularSuperficie(){
		superficie = longLados * longLados;
	}
}

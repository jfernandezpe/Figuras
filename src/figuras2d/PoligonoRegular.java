package figuras2d;

import java.awt.Color;

public abstract class PoligonoRegular extends Figura2D{
	public int numLados;
	protected double longLados = 0;
	
	public PoligonoRegular(){
		super();
	}
	
	public PoligonoRegular(Color col){
		super(col);
	}
		
	public PoligonoRegular(Color col, int pos[]){
		super(col,pos);
	}
	
	public PoligonoRegular(Color col, int px, int py){
		super(col,px,py);
	}
	
	public PoligonoRegular(int pos[]){
		super(pos);
	}
	
	public PoligonoRegular(int px, int py){
		super(px,py);
	}
	
	public void calcularPerimetro(){
		perimetro = longLados * this.numLados;
	}
	
	public abstract void calcularSuperficie();
	
	public void setLongLados(int lLados){
		longLados = lLados;
		calcularPerimetro();
		calcularSuperficie();
	}
	
	public double getLongLados(){
		return longLados;
	}
	
	protected int setNumLados(int num){
		numLados = num;
		return numLados;
	}
}

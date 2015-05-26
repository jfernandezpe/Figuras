package figuras3d;

import java.awt.Color;

public abstract class PoliedroRegular extends Figura3D{
	public int numCaras = 0;
	protected double longLados = 0;
	protected double superficieCara;
	
	public PoliedroRegular(){
		super();
	}
	
	public PoliedroRegular(Color color){
		super(color);
	}

	protected void calcularSuperficieTotal(){
		superficieTotal = superficieCara * numCaras;
	}
	
	public int getNumCaras(){
		return numCaras;
	}
	
	protected abstract void calcularVolumen();
	
	public void setLongLados(double longLados){
		this.longLados = longLados;
		actualizarFigura(this.longLados);
	}
	public double getLongLados(){
		return longLados;
	}
	
	public double getSuperficieCara(){
		return superficieCara;
	}
	
	protected abstract void actualizarFigura(double lLados);
	
	public int setNumCaras(int num){
		numCaras = num;
		return numCaras;
	}
}

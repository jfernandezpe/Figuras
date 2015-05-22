package figuras3d;

import java.awt.Color;

public abstract class PoliedroRegular extends Figura3D{
	public final int NUMCARAS = 0;
	protected double longLados = 0;
	protected double superficieCara;
	
	public PoliedroRegular(){
		
	}
	
	public PoliedroRegular(Color color){
	}

	protected void calcularSuperficieTotal(){
		superficieTotal = superficieCara * NUMCARAS;
	}
	
	protected abstract void calcularVolumen();
	
	public void setLongLados(double longLados){
		this.longLados = longLados;
		actualizarFigura();
		calcularSuperficieTotal();
		calcularVolumen();
	}
	public double getLongLados(){
		return longLados;
	}
	
	public double getSuperficieCara(){
		return superficieCara;
	}
}

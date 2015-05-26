package figuras3d;

import java.awt.Color;

public class Esfera extends Figura3D {
	private double radio;
	private double diametro;
	
	public Esfera(){
		super();
	}
	
	public Esfera(Color color){
		super(color);
	}
	
	protected void calcularSuperficieTotal(){
		superficieTotal = 4 * Math.PI * Math.pow(radio, 2);
	}
	protected void calcularVolumen(){
		System.out.println(radio);
		volumen = (4 * Math.PI * Math.pow(radio, 3)) /  3d;
	}
	
	public void setRadio(double radio){
		this.radio = radio;
		this.diametro = radio * 2d;
		actualizarFigura();
	}
	
	public double getRadio(){
		return radio;
	}
	
	public void setDiametro(double diametro){
		this.radio = diametro / 2d;
		this.diametro = diametro;
		actualizarFigura();
	}
	
	public double getDiametro(){
		return diametro;
	}
	
	protected void actualizarFigura(){
		calcularSuperficieTotal();
		calcularVolumen();
	}
}

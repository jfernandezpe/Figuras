package figuras2d;

import java.awt.Color;

public class Circulo extends Figura2D{
	private double radio;
	private double diametro;
	
	public Circulo(){
		super();
	}
	
	public Circulo(Color col){
		super(col);
	}
		
	public Circulo(Color col, int pos[]){
		super(col,pos);
	}
	
	public Circulo(Color col, int px, int py){
		super(col,px,py);
	}
	
	public Circulo(int pos[]){
		super(pos);
	}
	
	public Circulo(int px, int py){
		super(px,py);
	}
	
	
	
	protected void calcularPerimetro(){
		perimetro = 2 * Math.PI * radio;
	}
	protected void calcularSuperficie(){
		superficie = 2 * Math.PI * Math.pow(radio,2);
	}
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
		this.diametro = radio * 2;
		calcularPerimetro();
		calcularSuperficie();
	}
	
	public double getDiametro() {
		return diametro;
	}
	
	public void setDiametro(double diametro) {
		this.diametro = diametro;
		this.radio = diametro/2;
		calcularPerimetro();
		calcularSuperficie();
	}	
}

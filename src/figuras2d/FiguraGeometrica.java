package figuras2d;

import java.awt.Color;

public class FiguraGeometrica {
	private int[] posicion = new int[2];
	private Color color;
	protected double perimetro;
	protected double superficie;
	
	public FiguraGeometrica(){
		
	}
	
	public FiguraGeometrica(Color col){
		color = col;
	}
	
	public FiguraGeometrica(Color col, int pos[]){
		color = col;
		posicion[0] = pos[0];
		posicion[1] = pos[1];
	}
	
	public FiguraGeometrica(Color col, int px, int py){
		color = col;
		posicion[0] = px;
		posicion[1] = py;
	}
	
	public FiguraGeometrica(int pos[]){
		posicion[0] = pos[0];
		posicion[1] = pos[1];
	}
	
	public FiguraGeometrica(int px, int py){
		posicion[0] = px;
		posicion[1] = py;
	}
	
	protected double calcularPerimetro(){
		return 0d;
	}
	
	protected double calcularSuperficie(){
		return 0d;
	}
	
	public void setPosicion(int px, int py){
		posicion[0] = px;
		posicion[1] = py;
	}
	
	public void setPosicion(int pos[]){
		posicion[0] = pos[0];
		posicion[1] = pos[1];
	}
	
	public void setColor(Color col) {
		color = col;
	}
	
	public Color getColor(){
		return color;
	}
	
	public double getPerimetro(){
		return perimetro;
	}
	
	public double getSuperficie(){
		return superficie;
	}

	
	
	
}

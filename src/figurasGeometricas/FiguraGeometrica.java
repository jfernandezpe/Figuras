package figurasGeometricas;

import java.awt.Color;

public class FiguraGeometrica {
	private int[] posicion = new int[2];
	private Color color;
	protected float perimetro;
	protected float superficie;
	
	public FiguraGeometrica(){
		
	}
	
	public void FiguraGeomerica(Color col){
		color = col;
	}
	
	public void FiguraGeomerica(Color col, int pos[]){
		color = col;
		posicion[0] = pos[0];
		posicion[1] = pos[1];
	}
	
	public void FiguraGeomerica(Color col, int px, int py){
		color = col;
		posicion[0] = px;
		posicion[1] = py;
	}
	
	public void FiguraGeomerica(int pos[]){
		posicion[0] = pos[0];
		posicion[1] = pos[1];
	}
	
	public void FiguraGeomerica(int px, int py){
		posicion[0] = px;
		posicion[1] = py;
	}
	
	public float calcularPerimetro(){
		return 0f;
	}
	
	public float calcularSuperficie(){
		return 0f;
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

	
	
	
}

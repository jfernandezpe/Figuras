package figurasGeometricas;

public class PoligonoRegular extends FiguraGeometrica{
	protected int numLados = 0;
	protected double longLados = 0;
	
	public double calcularPerimetro(){
		perimetro = longLados * numLados;
		return perimetro;
	}
	
	protected void setNumLados(int nLados){
		numLados = nLados;
	}
	
	public void setLongLados(int lLados){
		longLados = lLados;
		calcularPerimetro();
		calcularSuperficie();
	}
}

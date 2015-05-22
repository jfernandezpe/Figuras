package figuras2d;

public class PoligonoRegular extends FiguraGeometrica{
	public final int NUMLADOS = 0;
	protected double longLados = 0;
	
	public double calcularPerimetro(){
		perimetro = longLados * NUMLADOS;
		return perimetro;
	}
	
	public void setLongLados(int lLados){
		longLados = lLados;
		calcularPerimetro();
		calcularSuperficie();
	}
}

package figurasGeometricas;

public class PoligonoRegular extends FiguraGeometrica{
	protected int nLados;
	protected float longLados;
	
	public float calcularPerimetro(){
		perimetro = longLados * nLados;
		return perimetro;
	}
	
	public void setNumLados(int numLados){
		nLados = numLados;
	}
	
	public void setLongLados(float lLados){
		longLados = lLados;
	}
}

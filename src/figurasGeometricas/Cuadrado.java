package figurasGeometricas;

public class Cuadrado extends PoligonoRegular {
	
	protected int numLados = 4;
	
	public double calcularSuperficie(){
		superficie = longLados * longLados;
		return superficie;
	}
}

package figuras2d;

public class Cuadrado extends PoligonoRegular {
	
	public final int NUMLADOS = 4;
	
	public double calcularSuperficie(){
		superficie = longLados * longLados;
		return superficie;
	}
}

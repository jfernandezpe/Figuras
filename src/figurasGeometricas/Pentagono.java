package figurasGeometricas;

public class Pentagono extends PoligonoRegular {
	protected int numLados = 5;
	private double apotema = 0;
	
	public double calcularApotema(){
		apotema = longLados * Math.tan(54) / 2;
		return apotema;
	}
	
	public double calcularSuperficie(){
		calcularApotema(); //Por si hubiesen cambiado los lados
		superficie = perimetro * apotema / 2;
		return superficie;
	}
	
}

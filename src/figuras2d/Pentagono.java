package figuras2d;

public class Pentagono extends PoligonoRegular {
	public final int NUMLADOS = 5;
	private double apotema = 0;
	
	public double calcularApotema(){
		apotema = longLados * Math.tan(54) / 2;
		return apotema;
	}
	
	public void calcularSuperficie(){
		calcularApotema(); //Por si hubiesen cambiado los lados
		superficie = perimetro * apotema / 2;
	}
	
}

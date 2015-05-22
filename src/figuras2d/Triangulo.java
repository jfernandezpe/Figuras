package figuras2d;

public class Triangulo extends PoligonoRegular{

	public final int NUMLADOS = 3;
	private double altura = 0;
		
	public void calcularSuperficie(){
		calcularAltura(); //por si hubiesen variado los datos
		superficie = longLados * altura / 2;
	}
	
	public double calcularAltura(){
		
		altura = Math.sqrt(3) / 2 * longLados;
		
		return altura;		
	}

	public double getAltura() {
		return altura;
	}
}

package figurasGeometricas;

public class Triangulo extends PoligonoRegular{

	protected int numLados = 3;
	private double altura = 0;
		
	public double calcularSuperficie(){
		calcularAltura(); //por si hubiesen variado los datos
		superficie = longLados * altura / 2;
		
		return superficie;
	}
	
	public double calcularAltura(){
		
		altura = Math.sqrt(3) / 2 * longLados;
		
		return altura;		
	}

	public double getAltura() {
		return altura;
	}
}

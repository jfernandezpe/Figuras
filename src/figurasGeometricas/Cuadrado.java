package figurasGeometricas;

public class Cuadrado extends PoligonoRegular {

	public float calcularPerimetro(){
		perimetro = longLados * 4;
		return perimetro;
	}
	
	public float calcularSuperficie(){
		superficie = longLados * longLados;
		return superficie;
	}
}

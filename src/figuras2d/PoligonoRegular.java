package figuras2d;

public abstract class PoligonoRegular extends Figura2D{
	public final int NUMLADOS = 0;
	protected double longLados = 0;
	
	public void calcularPerimetro(){
		perimetro = longLados * NUMLADOS;
	}
	
	public abstract void calcularSuperficie();
	
	public void setLongLados(int lLados){
		longLados = lLados;
		calcularPerimetro();
		calcularSuperficie();
	}
}

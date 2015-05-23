package figuras3d;

public class Esfera extends Figura3D {
	private double radio;
	
	protected void calcularSuperficieTotal(){
		superficieTotal = 4 * Math.PI * Math.pow(radio, 2);
	}
	protected void calcularVolumen(){
		volumen = (4 * Math.PI * Math.pow(radio, 3)) /  3;
	}
	
	public void setRadio(double radio){
		this.radio = radio;
	}
	
	public double getRadio(){
		return radio;
	}
}

package figuras2d;

public class Circulo extends Figura2D{
	private double radio;
	private double diametro;
	
	public void calcularPerimetro(){
		perimetro = 2 * Math.PI * radio;
	}
	public void calcularSuperficie(){
		superficie = 2 * Math.PI * Math.pow(radio,2);
	}
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
		this.diametro = radio * 2;
		calcularPerimetro();
		calcularSuperficie();
	}
	
	public double getDiametro() {
		return diametro;
	}
	
	public void setDiametro(double diametro) {
		this.diametro = diametro;
		this.radio = diametro/2;
		calcularPerimetro();
		calcularSuperficie();
	}	
}

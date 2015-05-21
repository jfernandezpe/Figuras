package figurasGeometricas;

public class Circulo extends FiguraGeometrica{
	private float radio;
	private float diametro;
	
	public float calcularPerimetro(){
		perimetro = (float) (2 * Math.PI * radio);
		return perimetro;
	}
	public float calcularArea(){
		superficie = (float) (2 * Math.PI * Math.sqrt(radio));
		return superficie;
	}
	
	public void setRadio(Float rad){
		radio = rad;
		diametro = rad * 2;
	}
	
	public void setDiametro(Float diame){
		diametro = diame;
		radio = diame / 2;
	}	
}

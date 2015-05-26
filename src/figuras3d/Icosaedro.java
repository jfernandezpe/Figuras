package figuras3d;

import java.awt.Color;

import figuras2d.Triangulo;

public class Icosaedro extends PoliedroRegular {
	protected int numCaras = setNumCaras(20);
	private Triangulo figura2d;
	
	public Icosaedro(){
		super();
		generarCara();
	}
	
	public Icosaedro(Color color){
		super(color);
		generarCara();
	}
	
	private void generarCara(){
		figura2d = new Triangulo();
	}	
	
	protected void calcularVolumen(){
		volumen = 5d / 12d * ( 3 + Math.sqrt(5)) * Math.pow(figura2d.getLongLados(),3);
	}
	
	protected void actualizarFigura(double lLados){
		figura2d.setLongLados(lLados);
		superficieCara = figura2d.getSuperficie();
		calcularSuperficieTotal();
		calcularVolumen();
	}
}
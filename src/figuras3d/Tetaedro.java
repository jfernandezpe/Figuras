package figuras3d;

import java.awt.Color;

import figuras2d.Triangulo;

public class Tetaedro extends PoliedroRegular {
	protected int numCaras = super.setNumCaras(4);
	private Triangulo figura2d;
	
	public Tetaedro(){
		super();
		generarCara();
	}
	
	public Tetaedro(Color color){
		super(color);
		generarCara();
	}
	
	protected void generarCara(){
		figura2d = new Triangulo();
	}	

	protected void calcularVolumen(){
		volumen = Math.sqrt(2) * Math.pow(figura2d.getLongLados(),3) / 12d;
	}
		
	protected void actualizarFigura(double lLados) {
		figura2d.setLongLados(lLados);
		superficieCara = figura2d.getSuperficie();
		calcularSuperficieTotal();
		calcularVolumen();		
	}
}


public class testlib3d {
	public static double aureo(){
		double aureo = (1 + Math.sqrt(5)) / 2d;
		return aureo;
	}
	
	public static void calculo(){
		int[][] coords = new int[8][3];
		int[] coord0 = {1, 1, 1};
		int[] coord1 =  {1, 1, -1};
		int[] coord2 = {1, -1, 1};
		int[] coord3 =  {1, -1, -1};
		int[] coord4 =  {-1, 1, 1};
		int[] coord5 = {-1, 1, -1};
		int[] coord6 =  {-1, -1, 1};
		int[] coord7 = {-1, -1, -1};
		coords[0] = coord0;
		coords[1] = coord1;
		coords[2] = coord2;
		coords[3] = coord3;
		coords[4] = coord4;
		coords[5] = coord5;
		coords[6] = coord6;
		coords[7] = coord7;
		
		int longLado = 20;
		for (int i = 0; i < coords.length; i++){
			double multiplicador = 1;
			boolean atras = false;
			for (int k = 0; k < coords[i].length;k++){
				if (coords[i][0] == -1 ){
					multiplicador = 15d / 10d;
					
				} 
				if (!(k == 0)) {
					coords[i][k] = (int) (coords[i][k] * longLado * multiplicador + longLado) ;
					
				}
			}
			System.out.println(coords[i][1]+" "+coords[i][2]);
			System.out.println("---");
			
		}
		
	}
	
	public static void main (String Args[]){
		calculo();
	}
}

public class Main{
	
	public static void main(String[] args) {
		
		Gerade g1 = new Gerade(2,1);
		System.out.println(g1);
		System.out.println("Die Nullstelle ist x = "+g1.berechneNullstelle());
		
		Parabel p1 = new Parabel(5,-3,-7);
		System.out.println(p1);
		System.out.println("Der Extrempunt der Parabel ist : ( " +p1.berechneExtremStelleX() + " , " +p1.berechneExtremWertY()+ " )");
		double[] nullstellen = p1.berechneNullstellen();
		
		if(nullstellen.length==0) {
			System.out.println("Die Parabel hat keine reellen Nullstellen.");
		}
		else {
			System.out.println("Die Nullstellen der Parabel lauten: ");
			for(double nullstelle:nullstellen) {
					System.out.println(nullstelle + " ");
			}
		}
	}
}

public class Gerade{
	private double steigung;
	private double yAchsenabschnitt;
	
	public Gerade(double steigung, double yAchsenabschnitt) {
		this.steigung=steigung;
		this.yAchsenabschnitt=yAchsenabschnitt;
	}
	
	public double getSteigung() {
		return steigung;
	}
	
	public double getYAchsenabschnitt() {
		return yAchsenabschnitt;
	}
	
	public double berechneNullstelle() {
		if(steigung !=0) {
			return -yAchsenabschnitt / steigung;
		} else {
			throw new ArithmeticException("Die Steigung darf bei einer Gerade nicht Null sein.");
		}
	}
	
	@Override
	public String toString() {
		return "Gerade: y = " + steigung + "x + " + yAchsenabschnitt;
	}
}
